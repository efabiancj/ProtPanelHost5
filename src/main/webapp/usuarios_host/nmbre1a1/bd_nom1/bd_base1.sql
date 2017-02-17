--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.0
-- Dumped by pg_dump version 9.3.0
-- Started on 2017-02-13 12:00:43

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 182 (class 3079 OID 11750)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2059 (class 0 OID 0)
-- Dependencies: 182
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

--
-- TOC entry 210 (class 1255 OID 34937)
-- Name: fa_asignar_asiento_a_boleto(integer, integer, integer, integer, integer); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_asignar_asiento_a_boleto(nnumero_asiento_boleto integer, nnumero_boleto integer, nnumero_asiento integer, nnumero_vuelo integer, nnumero_persona integer) RETURNS void
    LANGUAGE plpgsql
    AS $$
BEGIN
INSERT INTO public.asiento_boleto(numero_asiento_boleto,numero_boleto, numero_asiento, numero_vuelo, persona)
VALUES ( nnumero_asiento_boleto,nnumero_boleto, nnumero_asiento, nnumero_vuelo, nnumero_persona );
END;$$;


ALTER FUNCTION public.fa_asignar_asiento_a_boleto(nnumero_asiento_boleto integer, nnumero_boleto integer, nnumero_asiento integer, nnumero_vuelo integer, nnumero_persona integer) OWNER TO postgres;

--
-- TOC entry 221 (class 1255 OID 34912)
-- Name: fa_crear_boleto(integer, character, double precision); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_crear_boleto(nnumero_boleto integer, ntipo character, nsubtotal double precision) RETURNS void
    LANGUAGE plpgsql
    AS $$
BEGIN
INSERT INTO public.boleto(numero_boleto, fecha_creacion,tipo,subtotal)
VALUES ( nnumero_boleto, current_timestamp ,ntipo,nsubtotal );
END;$$;


ALTER FUNCTION public.fa_crear_boleto(nnumero_boleto integer, ntipo character, nsubtotal double precision) OWNER TO postgres;

--
-- TOC entry 195 (class 1255 OID 34854)
-- Name: fa_indicar_disponibilidad_asiento(integer, integer, date); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_indicar_disponibilidad_asiento(nnumero_asiento integer, nnumero_ruta integer, nfecha date) RETURNS boolean
    LANGUAGE plpgsql
    AS $$
DECLARE
  var_estado character;   resultado boolean;
BEGIN
  
SELECT var_estado = public.asiento.estado FROM public.asiento, vuelo 
WHERE public.asiento.numero_asiento=nnumero_asiento AND
      public.vuelo.fecha  = nfecha  AND
      public.vuelo.ruta   = nruta ;

if(var_estado=='D')then 
   return true;
end if;
if(var_estado=='O')then 
     return false;
end if;
END;$$;


ALTER FUNCTION public.fa_indicar_disponibilidad_asiento(nnumero_asiento integer, nnumero_ruta integer, nfecha date) OWNER TO postgres;

--
-- TOC entry 196 (class 1255 OID 34861)
-- Name: fa_ingresar_cliente(integer, character varying, character varying, character varying, character varying, character varying, character varying, character varying); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_ingresar_cliente(nnumero_cliente integer, ncedula_ruc character varying, nnombres character varying, napellidos character varying, nemail character varying, ndireccion character varying, ntelefono character varying, ncontrasena character varying) RETURNS void
    LANGUAGE plpgsql
    AS $$
BEGIN
INSERT INTO public.cliente(numero_cliente, cedula_ruc, nombres , apellidos, email, direccion, telefono, contrasena)
VALUES ( nnumero_cliente, ncedula_ruc, nnombres , napellidos, nemail, ndireccion, ntelefono, ncontrasena );
END;$$;


ALTER FUNCTION public.fa_ingresar_cliente(nnumero_cliente integer, ncedula_ruc character varying, nnombres character varying, napellidos character varying, nemail character varying, ndireccion character varying, ntelefono character varying, ncontrasena character varying) OWNER TO postgres;

--
-- TOC entry 197 (class 1255 OID 34856)
-- Name: fa_ingresar_persona(integer, character varying, character varying, character varying, character varying, character varying, character varying); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_ingresar_persona(nnumero_persona integer, ncedula character varying, nnombres character varying, napellidos character varying, nemail character varying, ndireccion character varying, ntelefono character varying) RETURNS void
    LANGUAGE plpgsql
    AS $$
BEGIN
INSERT INTO public.persona(numero_persona, cedula, nombres , apellidos, email, direccion, telefono)
VALUES ( nnumero_persona, ncedula, nnombres , napellidos, nemail, ndireccion, ntelefono );
END;$$;


ALTER FUNCTION public.fa_ingresar_persona(nnumero_persona integer, ncedula character varying, nnombres character varying, napellidos character varying, nemail character varying, ndireccion character varying, ntelefono character varying) OWNER TO postgres;

--
-- TOC entry 201 (class 1255 OID 34877)
-- Name: fa_listar_todos_asientos_por_transaccion_cliente(integer, integer); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_listar_todos_asientos_por_transaccion_cliente(penumero_transaccion integer, penumero_cliente integer, OUT psnumero_boleto integer, OUT psruta character varying, OUT psnumero_asiento integer, OUT psnumero_vuelo integer, OUT psnumero_clase character, OUT psprecio double precision) RETURNS SETOF record
    LANGUAGE plpgsql COST 1000
    AS $$
BEGIN
 RETURN query SELECT numero_boleto, codigo_ruta, numero_asiento, numero_vuelo, clase, precio 
 FROM public.asiento, public.boleto,public.asiento_boleto, public.transaccion
 WHERE public.transaccion.numero_transaccion = penumero_transaccion AND
       public.transaccion.numero_cliente = penumero_cliente AND
       public.asiento.numero_asiento = public.asiento_boleto.numero_asiento AND
       public.asiento_boleto.numero_boleto = public.boleto.numero_boleto
  ;
 
END;$$;


ALTER FUNCTION public.fa_listar_todos_asientos_por_transaccion_cliente(penumero_transaccion integer, penumero_cliente integer, OUT psnumero_boleto integer, OUT psruta character varying, OUT psnumero_asiento integer, OUT psnumero_vuelo integer, OUT psnumero_clase character, OUT psprecio double precision) OWNER TO postgres;

--
-- TOC entry 204 (class 1255 OID 34885)
-- Name: fa_listar_todos_asientos_por_vuelo(integer); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_listar_todos_asientos_por_vuelo(penumero_vuelo integer, OUT psnumero_asiento integer, OUT psnumero_vuelo integer, OUT psclase character, OUT psprecio double precision, OUT psestado character) RETURNS SETOF record
    LANGUAGE plpgsql COST 1000
    AS $$
BEGIN
 RETURN query SELECT numero_asiento, numero_vuelo, clase, precio,estado 
 FROM public.asiento
 WHERE public.asiento.numero_vuelo = penumero_vuelo 
 ORDER BY numero_asiento;
 
END;$$;


ALTER FUNCTION public.fa_listar_todos_asientos_por_vuelo(penumero_vuelo integer, OUT psnumero_asiento integer, OUT psnumero_vuelo integer, OUT psclase character, OUT psprecio double precision, OUT psestado character) OWNER TO postgres;

--
-- TOC entry 208 (class 1255 OID 34926)
-- Name: fa_listar_todos_asientos_por_vuelo_asiento(integer, integer); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_listar_todos_asientos_por_vuelo_asiento(penumero_vuelo integer, penumero_asiento integer, OUT psnumero_asiento integer, OUT psnumero_vuelo integer, OUT psclase character, OUT psprecio double precision, OUT psestado character) RETURNS SETOF record
    LANGUAGE plpgsql COST 1000
    AS $$
BEGIN
 RETURN query SELECT numero_asiento, numero_vuelo,clase,precio,estado 
 FROM public.asiento
 WHERE public.asiento.numero_vuelo = penumero_vuelo AND
       public.asiento.numero_asiento = penumero_asiento
 
 ORDER BY numero_asiento;
 
END;$$;


ALTER FUNCTION public.fa_listar_todos_asientos_por_vuelo_asiento(penumero_vuelo integer, penumero_asiento integer, OUT psnumero_asiento integer, OUT psnumero_vuelo integer, OUT psclase character, OUT psprecio double precision, OUT psestado character) OWNER TO postgres;

--
-- TOC entry 207 (class 1255 OID 34897)
-- Name: fa_listar_todos_asientos_por_vuelo_transaccion_cliente(integer, integer, integer); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_listar_todos_asientos_por_vuelo_transaccion_cliente(penumero_vuelo integer, penumero_transaccion integer, penumero_cliente integer, OUT psnumero_boleto integer, OUT psruta character varying, OUT psnumero_asiento integer, OUT psnumero_vuelo integer, OUT psnumero_clase character, OUT psprecio double precision, OUT psestado character) RETURNS SETOF record
    LANGUAGE plpgsql COST 1000
    AS $$
BEGIN
 RETURN query SELECT asiento_boleto.numero_boleto, vuelo.ruta, asiento_boleto.numero_asiento, asiento.numero_vuelo, asiento.clase, asiento.precio, asiento.estado 
 FROM public.asiento, public.boleto,public.asiento_boleto, public.transaccion, public.vuelo
 WHERE public.transaccion.numero_transaccion = penumero_transaccion AND
       public.transaccion.numero_cliente = penumero_cliente AND
       public.asiento.numero_asiento = public.asiento_boleto.numero_asiento AND
       public.asiento_boleto.numero_boleto = public.boleto.numero_boleto AND
       public.vuelo.numero_vuelo = asiento.numero_vuelo AND 
       public.vuelo.numero_vuelo = penumero_vuelo
  ;
 
END;$$;


ALTER FUNCTION public.fa_listar_todos_asientos_por_vuelo_transaccion_cliente(penumero_vuelo integer, penumero_transaccion integer, penumero_cliente integer, OUT psnumero_boleto integer, OUT psruta character varying, OUT psnumero_asiento integer, OUT psnumero_vuelo integer, OUT psnumero_clase character, OUT psprecio double precision, OUT psestado character) OWNER TO postgres;

--
-- TOC entry 214 (class 1255 OID 34898)
-- Name: fa_obtener_datos_aeronave_por_numero(integer); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_obtener_datos_aeronave_por_numero(penumero_aeronave integer, OUT psnumero_aeronave integer, OUT psmodelo character varying, OUT psclase character varying, OUT pscapacidad integer) RETURNS SETOF record
    LANGUAGE plpgsql COST 1000
    AS $$
BEGIN
 RETURN query SELECT numero_aeronave , modelo, clase, capacidad
 FROM public.aeronave
 WHERE public.aeronave.numero_aeronave = penumero_aeronave;
 
END;$$;


ALTER FUNCTION public.fa_obtener_datos_aeronave_por_numero(penumero_aeronave integer, OUT psnumero_aeronave integer, OUT psmodelo character varying, OUT psclase character varying, OUT pscapacidad integer) OWNER TO postgres;

--
-- TOC entry 215 (class 1255 OID 34915)
-- Name: fa_obtener_datos_boleto_por_numero(integer); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_obtener_datos_boleto_por_numero(penumero_boleto integer, OUT psnumero_boleto integer, OUT psfecha date, OUT pstipo character, OUT pssubtotal double precision) RETURNS SETOF record
    LANGUAGE plpgsql COST 1000
    AS $$
BEGIN
 RETURN query SELECT numero_boleto,fecha_creacion,tipo ,subtotal
 FROM public.boleto
 WHERE public.boleto.numero_boleto = penumero_boleto;
 
END;$$;


ALTER FUNCTION public.fa_obtener_datos_boleto_por_numero(penumero_boleto integer, OUT psnumero_boleto integer, OUT psfecha date, OUT pstipo character, OUT pssubtotal double precision) OWNER TO postgres;

--
-- TOC entry 222 (class 1255 OID 34917)
-- Name: fa_obtener_datos_boleto_por_numero_cliente(integer); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_obtener_datos_boleto_por_numero_cliente(penumero_cliente integer, OUT psnumero_boleto integer, OUT psfecha date, OUT pstipo character, OUT pssubtotal double precision) RETURNS SETOF record
    LANGUAGE plpgsql COST 1000
    AS $$
BEGIN
 RETURN query SELECT boleto.numero_boleto,boleto.fecha_creacion,boleto.tipo,boleto.subtotal
 FROM  public.boleto, public.transaccion
 WHERE public.boleto.numero_boleto = public.transaccion.numero_boleto AND
       public.transaccion.numero_cliente = penumero_cliente;
 
END;$$;


ALTER FUNCTION public.fa_obtener_datos_boleto_por_numero_cliente(penumero_cliente integer, OUT psnumero_boleto integer, OUT psfecha date, OUT pstipo character, OUT pssubtotal double precision) OWNER TO postgres;

--
-- TOC entry 203 (class 1255 OID 34882)
-- Name: fa_obtener_datos_cliente_por_cedula(character varying); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_obtener_datos_cliente_por_cedula(pecedula_ruc character varying, OUT psnumero_cliente integer, OUT pscedula_ruc character varying, OUT psnombres character varying, OUT psapellidos character varying, OUT psemail character varying, OUT psdireccion character varying, OUT pstelefono character varying, OUT pscontrasena character varying) RETURNS SETOF record
    LANGUAGE plpgsql COST 1000
    AS $$
BEGIN
 RETURN query SELECT numero_cliente,cedula_ruc,nombres ,apellidos ,email,direccion,telefono,contrasena
 FROM public.cliente
 WHERE public.cliente.cedula_ruc = pecedula_ruc ;
 
END;$$;


ALTER FUNCTION public.fa_obtener_datos_cliente_por_cedula(pecedula_ruc character varying, OUT psnumero_cliente integer, OUT pscedula_ruc character varying, OUT psnombres character varying, OUT psapellidos character varying, OUT psemail character varying, OUT psdireccion character varying, OUT pstelefono character varying, OUT pscontrasena character varying) OWNER TO postgres;

--
-- TOC entry 200 (class 1255 OID 34883)
-- Name: fa_obtener_datos_cliente_por_cedula_contrasena(character varying, character varying); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_obtener_datos_cliente_por_cedula_contrasena(pecedula_ruc character varying, pecontrasena character varying, OUT psnumero_cliente integer, OUT pscedula_ruc character varying, OUT psnombres character varying, OUT psapellidos character varying, OUT psemail character varying, OUT psdireccion character varying, OUT pstelefono character varying, OUT pscontrasena character varying) RETURNS SETOF record
    LANGUAGE plpgsql COST 1000
    AS $$
BEGIN
 RETURN query SELECT numero_cliente,cedula_ruc,nombres ,apellidos ,email ,direccion,telefono,contrasena
 FROM public.cliente
 WHERE public.cliente.cedula_ruc = pecedula_ruc AND
       public.cliente.contrasena = pecontrasena ;
 
END;$$;


ALTER FUNCTION public.fa_obtener_datos_cliente_por_cedula_contrasena(pecedula_ruc character varying, pecontrasena character varying, OUT psnumero_cliente integer, OUT pscedula_ruc character varying, OUT psnombres character varying, OUT psapellidos character varying, OUT psemail character varying, OUT psdireccion character varying, OUT pstelefono character varying, OUT pscontrasena character varying) OWNER TO postgres;

--
-- TOC entry 202 (class 1255 OID 34881)
-- Name: fa_obtener_datos_cliente_por_numero(integer); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_obtener_datos_cliente_por_numero(penumero_cliente integer, OUT psnumero_cliente integer, OUT pscedula_ruc character varying, OUT psnombres character varying, OUT psapellidos character varying, OUT psemail character varying, OUT psdireccion character varying, OUT pstelefono character varying, OUT pscontrasena character varying) RETURNS SETOF record
    LANGUAGE plpgsql COST 1000
    AS $$
BEGIN
 RETURN query SELECT numero_cliente,cedula_ruc,nombres ,apellidos ,email, direccion,telefono,contrasena
 FROM public.cliente
 WHERE public.cliente.numero_cliente = penumero_cliente;
 
END;$$;


ALTER FUNCTION public.fa_obtener_datos_cliente_por_numero(penumero_cliente integer, OUT psnumero_cliente integer, OUT pscedula_ruc character varying, OUT psnombres character varying, OUT psapellidos character varying, OUT psemail character varying, OUT psdireccion character varying, OUT pstelefono character varying, OUT pscontrasena character varying) OWNER TO postgres;

--
-- TOC entry 209 (class 1255 OID 34927)
-- Name: fa_obtener_datos_persona_por_numero(integer); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_obtener_datos_persona_por_numero(penumero_persona integer, OUT psnumero_persona integer, OUT pscedula character varying, OUT psnombres character varying, OUT psapellidos character varying, OUT psemail character varying, OUT psdireccion character varying, OUT pstelefono character varying) RETURNS SETOF record
    LANGUAGE plpgsql COST 1000
    AS $$
BEGIN
 RETURN query SELECT numero_persona,cedula,nombres ,apellidos ,email, direccion,telefono
 FROM public.persona
 WHERE public.persona.numero_persona = penumero_persona;
 
END;$$;


ALTER FUNCTION public.fa_obtener_datos_persona_por_numero(penumero_persona integer, OUT psnumero_persona integer, OUT pscedula character varying, OUT psnombres character varying, OUT psapellidos character varying, OUT psemail character varying, OUT psdireccion character varying, OUT pstelefono character varying) OWNER TO postgres;

--
-- TOC entry 212 (class 1255 OID 34942)
-- Name: fa_obtener_datos_personal_por_cedula_contrasena(character varying, character varying); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_obtener_datos_personal_por_cedula_contrasena(pecedula character varying, pecontrasena character varying, OUT pscodigo_personal character varying, OUT pscedula character varying, OUT psnombres character varying, OUT psapellidos character varying, OUT psemail character varying, OUT psdireccion character varying, OUT pstelefono character varying, OUT pscontrasena character varying) RETURNS SETOF record
    LANGUAGE plpgsql COST 1000
    AS $$
BEGIN
 RETURN query SELECT codigo_personal,cedula,nombres ,apellidos ,email,direccion,telefono,contrasena
 FROM public.personal
 WHERE public.personal.cedula = pecedula AND
       public.personal.contrasena = contrasena ;
 
END;$$;


ALTER FUNCTION public.fa_obtener_datos_personal_por_cedula_contrasena(pecedula character varying, pecontrasena character varying, OUT pscodigo_personal character varying, OUT pscedula character varying, OUT psnombres character varying, OUT psapellidos character varying, OUT psemail character varying, OUT psdireccion character varying, OUT pstelefono character varying, OUT pscontrasena character varying) OWNER TO postgres;

--
-- TOC entry 216 (class 1255 OID 34900)
-- Name: fa_obtener_datos_ruta(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_obtener_datos_ruta(OUT pscodigo_ruta character varying, OUT psdescripcion character varying) RETURNS SETOF record
    LANGUAGE plpgsql COST 1000
    AS $$
BEGIN
 RETURN query SELECT cod_ruta,descripcion
 FROM public.ruta;
  
END;$$;


ALTER FUNCTION public.fa_obtener_datos_ruta(OUT pscodigo_ruta character varying, OUT psdescripcion character varying) OWNER TO postgres;

--
-- TOC entry 205 (class 1255 OID 34889)
-- Name: fa_obtener_datos_ruta_por_numero(character varying); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_obtener_datos_ruta_por_numero(pecodigo_ruta character varying, OUT pscodigo_ruta character varying, OUT psdescripcion character varying) RETURNS SETOF record
    LANGUAGE plpgsql COST 1000
    AS $$
BEGIN
 RETURN query SELECT cod_ruta,descripcion
 FROM public.ruta
 WHERE public.ruta.cod_ruta = pecodigo_ruta;
 
END;$$;


ALTER FUNCTION public.fa_obtener_datos_ruta_por_numero(pecodigo_ruta character varying, OUT pscodigo_ruta character varying, OUT psdescripcion character varying) OWNER TO postgres;

--
-- TOC entry 198 (class 1255 OID 34886)
-- Name: fa_obtener_datos_vuelo_por_numero(integer); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_obtener_datos_vuelo_por_numero(penumero_vuelo integer, OUT psnumero_vuelo integer, OUT psfecha date, OUT psruta character varying, OUT psaeronave integer) RETURNS SETOF record
    LANGUAGE plpgsql COST 1000
    AS $$
BEGIN
 RETURN query SELECT numero_vuelo,fecha,ruta ,numero_aeronave
 FROM public.vuelo
 WHERE public.vuelo.numero_vuelo = penumero_vuelo;
 
END;$$;


ALTER FUNCTION public.fa_obtener_datos_vuelo_por_numero(penumero_vuelo integer, OUT psnumero_vuelo integer, OUT psfecha date, OUT psruta character varying, OUT psaeronave integer) OWNER TO postgres;

--
-- TOC entry 224 (class 1255 OID 34921)
-- Name: fa_obtener_vuelo_dado_fecha_ruta(character varying, date); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_obtener_vuelo_dado_fecha_ruta(pecodigo_ruta character varying, pefecha date, OUT ps_numero_vuelo integer, OUT ps_numero_aeronave integer) RETURNS SETOF record
    LANGUAGE plpgsql
    AS $$
DECLARE
  var_vuelo integer;
BEGIN
  
RETURN query  SELECT public.vuelo.numero_vuelo, public.vuelo.numero_aeronave FROM public.vuelo 
WHERE public.vuelo.ruta = pecodigo_ruta AND
      public.vuelo.fecha  = pefecha;
      
 END;$$;


ALTER FUNCTION public.fa_obtener_vuelo_dado_fecha_ruta(pecodigo_ruta character varying, pefecha date, OUT ps_numero_vuelo integer, OUT ps_numero_aeronave integer) OWNER TO postgres;

--
-- TOC entry 213 (class 1255 OID 34943)
-- Name: fa_obtener_vuelo_dado_ruta_fecha(character varying, character varying); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_obtener_vuelo_dado_ruta_fecha(pecodigo_ruta character varying, pefecha character varying, OUT ps_numero_vuelo integer, OUT ps_numero_aeronave integer) RETURNS SETOF record
    LANGUAGE plpgsql
    AS $$
DECLARE
  var_vuelo integer;
BEGIN
  
RETURN query  SELECT public.vuelo.numero_vuelo, public.vuelo.numero_aeronave FROM public.vuelo 
WHERE public.vuelo.ruta = pecodigo_ruta AND
      public.vuelo.fecha  =  to_date(pefecha, 'YYYY-MM-dd');
      
 END;$$;


ALTER FUNCTION public.fa_obtener_vuelo_dado_ruta_fecha(pecodigo_ruta character varying, pefecha character varying, OUT ps_numero_vuelo integer, OUT ps_numero_aeronave integer) OWNER TO postgres;

--
-- TOC entry 199 (class 1255 OID 34878)
-- Name: fa_realizar_devolucion(integer, integer, character varying); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_realizar_devolucion(nnumero_boleto integer, ninteger_numero_cliente integer, ncodigo_personal character varying) RETURNS void
    LANGUAGE plpgsql
    AS $$
  
BEGIN
  UPDATE public.asiento SET asiento.estado = 'D'  
  WHERE  public.asiento.numero_asiento = public.asiento_boleto.numero_asiento AND
         public.asiento_boleto.numero_boleto = public.boleto.numero_boleto AND
         public.boleto.numero_boleto = nnumero_boleto;

END;$$;


ALTER FUNCTION public.fa_realizar_devolucion(nnumero_boleto integer, ninteger_numero_cliente integer, ncodigo_personal character varying) OWNER TO postgres;

--
-- TOC entry 223 (class 1255 OID 34920)
-- Name: fa_realizar_transaccion(integer, integer, integer, character, double precision, character varying); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_realizar_transaccion(nnumero_transaccion integer, nnumero_boleto integer, nnumero_cliente integer, ntipo_transaccion character, ntotal double precision, ncodigo_personal character varying) RETURNS void
    LANGUAGE plpgsql
    AS $$
BEGIN
INSERT INTO public.transaccion(numero_transaccion, numero_boleto, numero_cliente,tipo_transaccion,total,codigo_personal,fecha_transaccion)
VALUES ( nnumero_transaccion,nnumero_boleto, nnumero_cliente,ntipo_transaccion,ntotal,ncodigo_personal,current_timestamp );
END;$$;


ALTER FUNCTION public.fa_realizar_transaccion(nnumero_transaccion integer, nnumero_boleto integer, nnumero_cliente integer, ntipo_transaccion character, ntotal double precision, ncodigo_personal character varying) OWNER TO postgres;

--
-- TOC entry 211 (class 1255 OID 34941)
-- Name: fa_sumar_precios_asiento_por_boleto(integer); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_sumar_precios_asiento_por_boleto(nnumero_boleto integer, OUT pssuma double precision, OUT psnumero_boleto integer) RETURNS SETOF record
    LANGUAGE plpgsql
    AS $$
BEGIN
 RETURN query SELECT sum(public.asiento.precio) suma, numero_boleto FROM asiento, asiento_boleto WHERE
       public.asiento.numero_asiento = public.asiento_boleto.numero_asiento AND
       public.asiento_boleto.numero_boleto = nnumero_boleto
       GROUP BY numero_boleto;

END;$$;


ALTER FUNCTION public.fa_sumar_precios_asiento_por_boleto(nnumero_boleto integer, OUT pssuma double precision, OUT psnumero_boleto integer) OWNER TO postgres;

--
-- TOC entry 220 (class 1255 OID 34907)
-- Name: fa_ultimo_asiento_boleto(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_ultimo_asiento_boleto(OUT psultimo integer) RETURNS SETOF integer
    LANGUAGE plpgsql
    AS $$
BEGIN
RETURN query SELECT MAX(public.asiento_boleto.numero_asiento_boleto)  FROM public.asiento_boleto;
END;$$;


ALTER FUNCTION public.fa_ultimo_asiento_boleto(OUT psultimo integer) OWNER TO postgres;

--
-- TOC entry 219 (class 1255 OID 34906)
-- Name: fa_ultimo_boleto(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_ultimo_boleto(OUT psultimo integer) RETURNS SETOF integer
    LANGUAGE plpgsql
    AS $$
BEGIN
RETURN query SELECT MAX(public.boleto.numero_boleto)  FROM public.boleto;
END;$$;


ALTER FUNCTION public.fa_ultimo_boleto(OUT psultimo integer) OWNER TO postgres;

--
-- TOC entry 206 (class 1255 OID 34903)
-- Name: fa_ultimo_cliente(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_ultimo_cliente(OUT psultimo integer) RETURNS SETOF integer
    LANGUAGE plpgsql
    AS $$
BEGIN
RETURN query SELECT MAX(public.cliente.numero_cliente)  FROM public.cliente;
END;$$;


ALTER FUNCTION public.fa_ultimo_cliente(OUT psultimo integer) OWNER TO postgres;

--
-- TOC entry 217 (class 1255 OID 34904)
-- Name: fa_ultimo_persona(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_ultimo_persona(OUT psultimo integer) RETURNS SETOF integer
    LANGUAGE plpgsql
    AS $$
BEGIN
RETURN query SELECT MAX(public.persona.numero_persona)  FROM public.persona;
END;$$;


ALTER FUNCTION public.fa_ultimo_persona(OUT psultimo integer) OWNER TO postgres;

--
-- TOC entry 218 (class 1255 OID 34905)
-- Name: fa_ultimo_transaccion(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fa_ultimo_transaccion(OUT psultimo integer) RETURNS SETOF integer
    LANGUAGE plpgsql
    AS $$
BEGIN
RETURN query SELECT MAX(public.transaccion.numero_transaccion)  FROM public.transaccion;
END;$$;


ALTER FUNCTION public.fa_ultimo_transaccion(OUT psultimo integer) OWNER TO postgres;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 173 (class 1259 OID 32786)
-- Name: aeronave; Type: TABLE; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

CREATE TABLE aeronave (
    numero_aeronave integer NOT NULL,
    modelo character varying(20),
    clase character varying(10),
    capacidad integer
);


ALTER TABLE public.aeronave OWNER TO "LAN_Airlines_usr";

--
-- TOC entry 179 (class 1259 OID 32870)
-- Name: asiento; Type: TABLE; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

CREATE TABLE asiento (
    numero_asiento integer NOT NULL,
    numero_vuelo integer NOT NULL,
    clase character(1),
    precio double precision,
    estado character(1)
);


ALTER TABLE public.asiento OWNER TO "LAN_Airlines_usr";

--
-- TOC entry 180 (class 1259 OID 32875)
-- Name: asiento_boleto; Type: TABLE; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

CREATE TABLE asiento_boleto (
    numero_boleto integer NOT NULL,
    numero_asiento integer NOT NULL,
    numero_vuelo integer NOT NULL,
    persona integer,
    numero_asiento_boleto integer NOT NULL
);


ALTER TABLE public.asiento_boleto OWNER TO "LAN_Airlines_usr";

--
-- TOC entry 178 (class 1259 OID 32833)
-- Name: boleto; Type: TABLE; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

CREATE TABLE boleto (
    numero_boleto integer NOT NULL,
    fecha_creacion date,
    tipo character(1),
    subtotal double precision
);


ALTER TABLE public.boleto OWNER TO "LAN_Airlines_usr";

--
-- TOC entry 175 (class 1259 OID 32796)
-- Name: cliente; Type: TABLE; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

CREATE TABLE cliente (
    numero_cliente integer NOT NULL,
    nombres character varying(30),
    apellidos character varying(30),
    email character varying(320),
    direccion character varying(50),
    telefono character varying(10),
    cedula_ruc character varying(13),
    contrasena character varying(10)
);


ALTER TABLE public.cliente OWNER TO "LAN_Airlines_usr";

--
-- TOC entry 172 (class 1259 OID 32781)
-- Name: horario; Type: TABLE; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

CREATE TABLE horario (
    numero_horario integer NOT NULL,
    dia character varying(10),
    hora character varying(5)
);


ALTER TABLE public.horario OWNER TO "LAN_Airlines_usr";

--
-- TOC entry 177 (class 1259 OID 32813)
-- Name: horario_aeronave; Type: TABLE; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

CREATE TABLE horario_aeronave (
    numero_horario integer NOT NULL,
    numero_aeronave integer NOT NULL
);


ALTER TABLE public.horario_aeronave OWNER TO "LAN_Airlines_usr";

--
-- TOC entry 176 (class 1259 OID 32808)
-- Name: persona; Type: TABLE; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

CREATE TABLE persona (
    numero_persona integer NOT NULL,
    cedula character varying(10),
    nombres character varying(30),
    apellidos character varying(30),
    email character varying(320),
    direccion character varying(50),
    telefono character varying(10)
);


ALTER TABLE public.persona OWNER TO "LAN_Airlines_usr";

--
-- TOC entry 2060 (class 0 OID 0)
-- Dependencies: 176
-- Name: COLUMN persona.numero_persona; Type: COMMENT; Schema: public; Owner: LAN_Airlines_usr
--

COMMENT ON COLUMN persona.numero_persona IS '
';


--
-- TOC entry 174 (class 1259 OID 32791)
-- Name: personal; Type: TABLE; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

CREATE TABLE personal (
    codigo_personal character varying(10) NOT NULL,
    nombres character varying(30),
    apellidos character varying(30),
    email character varying(320),
    direccion character varying(50),
    telefono character varying(10),
    cedula character varying(10),
    contrasena character varying(10)
);


ALTER TABLE public.personal OWNER TO "LAN_Airlines_usr";

--
-- TOC entry 170 (class 1259 OID 32771)
-- Name: ruta; Type: TABLE; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

CREATE TABLE ruta (
    cod_ruta character varying(7) NOT NULL,
    descripcion character varying(20)
);


ALTER TABLE public.ruta OWNER TO "LAN_Airlines_usr";

--
-- TOC entry 181 (class 1259 OID 34783)
-- Name: transaccion; Type: TABLE; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

CREATE TABLE transaccion (
    numero_transaccion integer NOT NULL,
    numero_boleto integer,
    numero_cliente integer,
    tipo_transaccion character(1),
    total double precision,
    codigo_personal character varying(10),
    fecha_transaccion date
);


ALTER TABLE public.transaccion OWNER TO "LAN_Airlines_usr";

--
-- TOC entry 171 (class 1259 OID 32776)
-- Name: vuelo; Type: TABLE; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

CREATE TABLE vuelo (
    numero_vuelo integer NOT NULL,
    fecha date,
    ruta character varying(7),
    numero_aeronave integer
);


ALTER TABLE public.vuelo OWNER TO "LAN_Airlines_usr";

--
-- TOC entry 2043 (class 0 OID 32786)
-- Dependencies: 173
-- Data for Name: aeronave; Type: TABLE DATA; Schema: public; Owner: LAN_Airlines_usr
--

COPY aeronave (numero_aeronave, modelo, clase, capacidad) FROM stdin;
1	AirBus433	Airbus	100
\.


--
-- TOC entry 2049 (class 0 OID 32870)
-- Dependencies: 179
-- Data for Name: asiento; Type: TABLE DATA; Schema: public; Owner: LAN_Airlines_usr
--

COPY asiento (numero_asiento, numero_vuelo, clase, precio, estado) FROM stdin;
36	1	P	50	D
37	1	P	50	D
38	1	P	50	D
39	1	P	50	D
40	1	P	50	D
18	1	P	120	D
19	1	P	120	D
1	1	P	120	D
2	1	P	120	D
3	1	P	120	D
4	1	P	120	D
5	1	P	120	D
6	1	P	120	D
7	1	P	120	D
8	1	P	120	D
9	1	P	120	D
10	1	P	120	D
11	1	P	120	D
12	1	P	120	D
13	1	P	120	D
14	1	P	120	D
15	1	P	120	D
16	1	P	120	D
17	1	P	120	D
20	1	P	120	D
21	1	P	50	D
22	1	P	50	D
23	1	P	50	D
24	1	P	50	D
25	1	P	50	D
26	1	P	50	D
27	1	P	50	D
28	1	P	50	D
29	1	P	50	D
30	1	P	50	D
31	1	P	50	D
32	1	P	50	D
33	1	P	50	D
34	1	P	50	D
35	1	P	50	D
\.


--
-- TOC entry 2050 (class 0 OID 32875)
-- Dependencies: 180
-- Data for Name: asiento_boleto; Type: TABLE DATA; Schema: public; Owner: LAN_Airlines_usr
--

COPY asiento_boleto (numero_boleto, numero_asiento, numero_vuelo, persona, numero_asiento_boleto) FROM stdin;
1	1	1	1	1
1	3	1	1	2
\.


--
-- TOC entry 2048 (class 0 OID 32833)
-- Dependencies: 178
-- Data for Name: boleto; Type: TABLE DATA; Schema: public; Owner: LAN_Airlines_usr
--

COPY boleto (numero_boleto, fecha_creacion, tipo, subtotal) FROM stdin;
1	2016-07-24	I	0
2	2016-07-24	I	0
3	2016-07-24	R	0
\.


--
-- TOC entry 2045 (class 0 OID 32796)
-- Dependencies: 175
-- Data for Name: cliente; Type: TABLE DATA; Schema: public; Owner: LAN_Airlines_usr
--

COPY cliente (numero_cliente, nombres, apellidos, email, direccion, telefono, cedula_ruc, contrasena) FROM stdin;
1	Carlos Luis	Avalos Avalos	clavalos@yahoo.com	Veloz 41-32 y Colon	0932145632	0603252202	cavalos
2	Galo	Maldonado	gmaldonado@hotmail.com	El Oro y Miguel de Santiago	0723561245	0602154235001	gmaldo2000
0	vxv	xcv	xcv	xcv	xcv	4534345	1232323
3	Pedro	Jimenez	pjmm@hotmail.com	Lo Alamos	062521252	0603221221	123456
\.


--
-- TOC entry 2042 (class 0 OID 32781)
-- Dependencies: 172
-- Data for Name: horario; Type: TABLE DATA; Schema: public; Owner: LAN_Airlines_usr
--

COPY horario (numero_horario, dia, hora) FROM stdin;
1	Lunes	05h45
2	Domingo	16h00
\.


--
-- TOC entry 2047 (class 0 OID 32813)
-- Dependencies: 177
-- Data for Name: horario_aeronave; Type: TABLE DATA; Schema: public; Owner: LAN_Airlines_usr
--

COPY horario_aeronave (numero_horario, numero_aeronave) FROM stdin;
1	1
2	1
\.


--
-- TOC entry 2046 (class 0 OID 32808)
-- Dependencies: 176
-- Data for Name: persona; Type: TABLE DATA; Schema: public; Owner: LAN_Airlines_usr
--

COPY persona (numero_persona, cedula, nombres, apellidos, email, direccion, telefono) FROM stdin;
1	0602125485	Juan Rodrigo	Perez Garcia	juanp@hotmail.com	Avenida unidad NAcional 12-12	02954865
\.


--
-- TOC entry 2044 (class 0 OID 32791)
-- Dependencies: 174
-- Data for Name: personal; Type: TABLE DATA; Schema: public; Owner: LAN_Airlines_usr
--

COPY personal (codigo_personal, nombres, apellidos, email, direccion, telefono, cedula, contrasena) FROM stdin;
cavalos	Carlos	Avalos	clavalos@yahoo.com	Veloz 41-32 y Colon	0932145632	0603252202	cavalos
web	web	web	support@lanairlines.com	Veloz 41-32 y Colon	0223652852	0000000000	dgredfcxxx
\.


--
-- TOC entry 2040 (class 0 OID 32771)
-- Dependencies: 170
-- Data for Name: ruta; Type: TABLE DATA; Schema: public; Owner: LAN_Airlines_usr
--

COPY ruta (cod_ruta, descripcion) FROM stdin;
UIO-LOJ	(Quito-Loja)
LOJ-UIO	(Loja-Quito)
\.


--
-- TOC entry 2051 (class 0 OID 34783)
-- Dependencies: 181
-- Data for Name: transaccion; Type: TABLE DATA; Schema: public; Owner: LAN_Airlines_usr
--

COPY transaccion (numero_transaccion, numero_boleto, numero_cliente, tipo_transaccion, total, codigo_personal, fecha_transaccion) FROM stdin;
1	1	1	C	0	cavalos	2016-07-24
2	2	1	I	0	cavalos	2016-07-25
\.


--
-- TOC entry 2041 (class 0 OID 32776)
-- Dependencies: 171
-- Data for Name: vuelo; Type: TABLE DATA; Schema: public; Owner: LAN_Airlines_usr
--

COPY vuelo (numero_vuelo, fecha, ruta, numero_aeronave) FROM stdin;
1	2016-07-24	UIO-LOJ	1
2	2016-07-25	LOJ-UIO	1
3	2016-07-08	UIO-LOJ	1
\.


--
-- TOC entry 1902 (class 2606 OID 32790)
-- Name: pk_aeronave; Type: CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

ALTER TABLE ONLY aeronave
    ADD CONSTRAINT pk_aeronave PRIMARY KEY (numero_aeronave);


--
-- TOC entry 1918 (class 2606 OID 32874)
-- Name: pk_asiento; Type: CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

ALTER TABLE ONLY asiento
    ADD CONSTRAINT pk_asiento PRIMARY KEY (numero_asiento, numero_vuelo);


--
-- TOC entry 1916 (class 2606 OID 32837)
-- Name: pk_boleto; Type: CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

ALTER TABLE ONLY boleto
    ADD CONSTRAINT pk_boleto PRIMARY KEY (numero_boleto);


--
-- TOC entry 1908 (class 2606 OID 32800)
-- Name: pk_cliente; Type: CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

ALTER TABLE ONLY cliente
    ADD CONSTRAINT pk_cliente PRIMARY KEY (numero_cliente);


--
-- TOC entry 1900 (class 2606 OID 32785)
-- Name: pk_horario; Type: CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

ALTER TABLE ONLY horario
    ADD CONSTRAINT pk_horario PRIMARY KEY (numero_horario);


--
-- TOC entry 1914 (class 2606 OID 32817)
-- Name: pk_horario_aeronave; Type: CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

ALTER TABLE ONLY horario_aeronave
    ADD CONSTRAINT pk_horario_aeronave PRIMARY KEY (numero_horario, numero_aeronave);


--
-- TOC entry 1920 (class 2606 OID 34815)
-- Name: pk_numero_asiento_boleto; Type: CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

ALTER TABLE ONLY asiento_boleto
    ADD CONSTRAINT pk_numero_asiento_boleto PRIMARY KEY (numero_asiento_boleto);


--
-- TOC entry 1912 (class 2606 OID 32812)
-- Name: pk_persona; Type: CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

ALTER TABLE ONLY persona
    ADD CONSTRAINT pk_persona PRIMARY KEY (numero_persona);


--
-- TOC entry 1904 (class 2606 OID 32795)
-- Name: pk_personal; Type: CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

ALTER TABLE ONLY personal
    ADD CONSTRAINT pk_personal PRIMARY KEY (codigo_personal);


--
-- TOC entry 1896 (class 2606 OID 32775)
-- Name: pk_ruta; Type: CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

ALTER TABLE ONLY ruta
    ADD CONSTRAINT pk_ruta PRIMARY KEY (cod_ruta);


--
-- TOC entry 1922 (class 2606 OID 34787)
-- Name: pk_transaccion; Type: CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

ALTER TABLE ONLY transaccion
    ADD CONSTRAINT pk_transaccion PRIMARY KEY (numero_transaccion);


--
-- TOC entry 1898 (class 2606 OID 32780)
-- Name: pk_vuelo; Type: CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

ALTER TABLE ONLY vuelo
    ADD CONSTRAINT pk_vuelo PRIMARY KEY (numero_vuelo);


--
-- TOC entry 1910 (class 2606 OID 32802)
-- Name: unick_cedula; Type: CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

ALTER TABLE ONLY cliente
    ADD CONSTRAINT unick_cedula UNIQUE (cedula_ruc);


--
-- TOC entry 1906 (class 2606 OID 32804)
-- Name: uniq_cedula_per; Type: CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr; Tablespace: 
--

ALTER TABLE ONLY personal
    ADD CONSTRAINT uniq_cedula_per UNIQUE (cedula);


--
-- TOC entry 1924 (class 2606 OID 34809)
-- Name: fk_aeronave_vuelo; Type: FK CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr
--

ALTER TABLE ONLY vuelo
    ADD CONSTRAINT fk_aeronave_vuelo FOREIGN KEY (numero_aeronave) REFERENCES aeronave(numero_aeronave);


--
-- TOC entry 1929 (class 2606 OID 34821)
-- Name: fk_asiento_boleto_asiento; Type: FK CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr
--

ALTER TABLE ONLY asiento_boleto
    ADD CONSTRAINT fk_asiento_boleto_asiento FOREIGN KEY (numero_asiento, numero_vuelo) REFERENCES asiento(numero_asiento, numero_vuelo);


--
-- TOC entry 1927 (class 2606 OID 34804)
-- Name: fk_asiento_vuelo; Type: FK CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr
--

ALTER TABLE ONLY asiento
    ADD CONSTRAINT fk_asiento_vuelo FOREIGN KEY (numero_vuelo) REFERENCES vuelo(numero_vuelo);


--
-- TOC entry 1932 (class 2606 OID 34793)
-- Name: fk_boleto; Type: FK CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr
--

ALTER TABLE ONLY transaccion
    ADD CONSTRAINT fk_boleto FOREIGN KEY (numero_boleto) REFERENCES boleto(numero_boleto);


--
-- TOC entry 1928 (class 2606 OID 34816)
-- Name: fk_boleto_asiento_boleto; Type: FK CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr
--

ALTER TABLE ONLY asiento_boleto
    ADD CONSTRAINT fk_boleto_asiento_boleto FOREIGN KEY (numero_boleto) REFERENCES boleto(numero_boleto);


--
-- TOC entry 1931 (class 2606 OID 34788)
-- Name: fk_cliente_transaccion; Type: FK CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr
--

ALTER TABLE ONLY transaccion
    ADD CONSTRAINT fk_cliente_transaccion FOREIGN KEY (numero_cliente) REFERENCES aeronave(numero_aeronave);


--
-- TOC entry 1926 (class 2606 OID 32823)
-- Name: fk_horario_aeronave_aeronave; Type: FK CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr
--

ALTER TABLE ONLY horario_aeronave
    ADD CONSTRAINT fk_horario_aeronave_aeronave FOREIGN KEY (numero_aeronave) REFERENCES aeronave(numero_aeronave);


--
-- TOC entry 1925 (class 2606 OID 32818)
-- Name: fk_horario_aeronave_horario; Type: FK CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr
--

ALTER TABLE ONLY horario_aeronave
    ADD CONSTRAINT fk_horario_aeronave_horario FOREIGN KEY (numero_horario) REFERENCES horario(numero_horario);


--
-- TOC entry 1930 (class 2606 OID 34826)
-- Name: fk_persona_asiento_boleto; Type: FK CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr
--

ALTER TABLE ONLY asiento_boleto
    ADD CONSTRAINT fk_persona_asiento_boleto FOREIGN KEY (persona) REFERENCES persona(numero_persona);


--
-- TOC entry 1923 (class 2606 OID 32828)
-- Name: fk_ruta_vuelo; Type: FK CONSTRAINT; Schema: public; Owner: LAN_Airlines_usr
--

ALTER TABLE ONLY vuelo
    ADD CONSTRAINT fk_ruta_vuelo FOREIGN KEY (ruta) REFERENCES ruta(cod_ruta);


--
-- TOC entry 2058 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2017-02-13 12:00:45

--
-- PostgreSQL database dump complete
--

