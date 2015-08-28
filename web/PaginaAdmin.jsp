<%-- 
    Document   : PaginaAdmin
    Created on : 25-ago-2015, 7:25:40
    Author     : danielvega
--%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Servicio de TranMetro</title>
<meta name="keywords" content="" />
<meta name="Gestured" content="" />
<link href="default.css" rel="stylesheet" type="text/css" media="screen" />
</head>
    <head>
        
<script type="text/javascript">
<!--
function mostrarformularios(){
//Si la opcion con id Conocido_1 (dentro del documento > formulario con name fcontacto >     y a la vez dentro del array de Conocido) esta activada
if (document.option.opcion[0].checked === true) {
//muestra (cambiando la propiedad display del estilo) el div con id 'desdeotro'
document.getElementById('crearusuario').style.display='block';
document.getElementById('modificardatos').style.display='none';
document.getElementById('eliminardatos').style.display='none';


//por el contrario, si no esta seleccionada
} else {
//oculta el div con id 'desdeotro'
//document.getElementById('crearusuario').style.display='none';
}

if (document.option.opcion[1].checked === true) {
//muestra (cambiando la propiedad display del estilo) el div con id 'desdeotro'
document.getElementById('eliminardatos').style.display='block';
document.getElementById('crearusuario').style.display='none';
document.getElementById('modificardatos').style.display='none';
document.getElementById('datosadmin').style.display='none';
document.getElementById('datosestcla').style.display='none';
document.getElementById('datosestgen').style.display='none';
document.getElementById('datoschofer').style.display='none';
//por el contrario, si no esta seleccionada
} else {
//oculta el div con id 'desdeotro'
//document.getElementById('modificardatos').style.display='none';
}
if (document.option.opcion[2].checked === true) {
//muestra (cambiando la propiedad display del estilo) el div con id 'desdeotro'
document.getElementById('eliminardatos').style.display='none';
document.getElementById('crearusuario').style.display='none';
document.getElementById('modificardatos').style.display='block';
document.getElementById('datosadmin').style.display='none';
document.getElementById('datosestcla').style.display='none';
document.getElementById('datosestgen').style.display='none';
document.getElementById('datoschofer').style.display='none';
//por el contrario, si no esta seleccionada
} else {
//oculta el div con id 'desdeotro'
//document.getElementById('eliminardatos').style.display='none';
}
}
-->
</script>

        
<script type="text/javascript">
<!--
function mostrarllenardatos(){
//Si la opcion con id Conocido_1 (dentro del documento > formulario con name fcontacto >     y a la vez dentro del array de Conocido) esta activada
if (document.tipousu.tipo[0].checked === true) {
//muestra (cambiando la propiedad display del estilo) el div con id 'desdeotro'
document.getElementById('datosadmin').style.display='block';
document.getElementById('datosestcla').style.display='none';
document.getElementById('datosestgen').style.display='none';
document.getElementById('datoschofer').style.display='none';

//por el contrario, si no esta seleccionada
} else {
//oculta el div con id 'desdeotro'
//document.getElementById('crearusuario').style.display='none';
}

if (document.tipousu.tipo[1].checked === true) {
//muestra (cambiando la propiedad display del estilo) el div con id 'desdeotro'
document.getElementById('datosadmin').style.display='none';
document.getElementById('datosestcla').style.display='block';
document.getElementById('datosestgen').style.display='none';
document.getElementById('datoschofer').style.display='none';

//por el contrario, si no esta seleccionada
} else {
//oculta el div con id 'desdeotro'
//document.getElementById('modificardatos').style.display='none';
}
if (document.tipousu.tipo[2].checked === true) {
//muestra (cambiando la propiedad display del estilo) el div con id 'desdeotro'
document.getElementById('datosadmin').style.display='none';
document.getElementById('datosestcla').style.display='none';
document.getElementById('datosestgen').style.display='block';
document.getElementById('datoschofer').style.display='none';

//por el contrario, si no esta seleccionada
} else {
//oculta el div con id 'desdeotro'
//document.getElementById('eliminardatos').style.display='none';
}
if (document.tipousu.tipo[3].checked === true) {
//muestra (cambiando la propiedad display del estilo) el div con id 'desdeotro'
document.getElementById('datosadmin').style.display='none';
document.getElementById('datosestcla').style.display='none';
document.getElementById('datosestgen').style.display='none';
document.getElementById('datoschofer').style.display='block';

//por el contrario, si no esta seleccionada
}
}
-->
</script>
    </head>
<body>
<div id="wrapper">
	<div id="header">
		<div id="menu">
			<ul id="main">
				<li class="current_page_item"><a href="#">Usuarios</a></li>
				<li><a href="#">Estaciones Claves</a></li>
				<li><a href="#">Rutas</a></li>
				<li><a href="#">Estaciones</a></li>
                                <li><a href="#">Reportes</a></li>
                                <li><a href="#">Estaciones</a></li>
			</ul>
		</div>
		<div id="logo">
			<h1><a href="#"><span>Municipalidad de Guatemala</span></a></h1>
			<p>Usuarios</p>
		</div>
	</div>
	<div id="page"><div class="inner_copy"></div>
		
			
				
					<h2>Opciones</h2>
                                        <form action="PaginaAdmin.jsp" method="POST" name = "option">
                                            <li><input type="radio" name="opcion" id = "opcion_0" onclick="mostrarformularios();" value="Crear">Crear</li>
                                              	<li><input type="radio" name="opcion" id = "opcion_1" onclick="mostrarformularios();" value="Eliminar">ELiminar</li>
						<li><input type="radio" name="opcion" id = "opcion_2" onclick="mostrarformularios();" value="Modificar">Modificar</li>
					
                                        </form>
                                            
				
			
		
       
        <div id="crearusuario" style="display:none;">
                <form action="PaginaAdmin.jsp" method="POST" name = "tipousu">                  
<li><input type="radio" name="tipo" id = "tipo_0" onclick=" mostrarllenardatos();" value="Admin">Administrador</li>
                <li><input type="radio" name="tipo" id = "tipo_1" onclick=" mostrarllenardatos();" value="EstClave">Estacion Clave</li>
		<li><input type="radio" name="tipo" id = "tipo_2" onclick=" mostrarllenardatos();" value="EstGen">Estacion General</li>
                <li><input type="radio" name="tipo" id = "tipo_3" onclick=" mostrarllenardatos();" value="Chof">Choferes</li>
                
          </form>      
            </div>
            <div id="modificardatos" style="display:none;">
                <p>Ingrese los datos</p>
                <label>id:<p><input type="text" name="txtidmoficiar" class="input" /></label>></p>
                <input type="submit" value="Aceptar" />
           
		<div style="clear:both">&nbsp;</div>
	</div>
         <div id="eliminardatos" style="display:none;">
                <p>Ingrese el id para eliminar</p>
                <label>id:<p><input type="text" name="txtideliminar" class="input" /></label>></p>
                <input type="submit" value="Aceptar" />
           
		<div style="clear:both">&nbsp;</div>
	</div>
        
         <div id="datosadmin" style="display:none;">
                <p>Ingrese los datos</p>
                <label>Correo:<p><input type="text" name="txtcorreoadmin" class="input" /></label>></p>
                <label>Contraseña:<p><input type="text" name="txtpassadmin" class="input" /></label>></p>
                <input type="submit" value="Aceptar" />
                <div style="clear:both">&nbsp;</div>
	</div>
          <div id="datosestcla" style="display:none;">
              <p>Estacion Clave</p>  
              <p>Ingrese los datos</p>
                <label>ID:<p><input type="text" name="txtidestacionclave" class="input" /></label>></p>
                <label>Nombre:<p><input type="text" name="txtnombreestacionclave" class="input" /></label>></p>
                <label>Contraseña:<p><input type="text" name="txtpassestacionclave" class="input" /></label>></p>
                <input type="submit" value="Aceptar" />
                <div style="clear:both">&nbsp;</div>
	</div>
          <div id="datosestgen" style="display:none;">
              <p>Estacion General</p>  
              <p>Ingrese los datos</p>
               <label>ID:<p><input type="text" name="txtidestaciongeneral" class="input" /></label>></p>
               <label>Correo:<p><input type="text" name="txtcorreoestaciongeneral" class="input" /></label>></p>
                <label>Contraseña:<p><input type="text" name="txtpassestaciongeneral" class="input" /></label>></p>
                <input type="submit" value="Aceptar" />
                <div style="clear:both">&nbsp;</div>
	</div>
          <div id="datoschofer" style="display:none;">
              <p>Chofer</p>
                <p>Ingrese los datos</p>
                <label>Nombre:<p><input type="text" name="txtnombrechofer" class="input" /></label>></p>
                <label>Apellido:<p><input type="text" name="txtapellidochofer" class="input" /></label>></p>
                <label>Clave:<p><input type="text" name="txtclavechofer" class="input" /></label>></p>
                <label>Contraseña:<p><input type="text" name="txtpasschofer" class="input" /></label>></p>
                <input type="submit" value="Aceptar" />
                <div style="clear:both">&nbsp;</div>
	</div>
     
     </div>
    
</div>
</body>
</html>
