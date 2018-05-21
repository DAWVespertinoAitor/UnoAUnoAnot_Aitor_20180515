<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado</title>
        <link rel="stylesheet" type="text/css" href="${contexto}/CSS/estilos.css" />
    </head>
    <body>

        <div class="rellenarForm">
            <h2>Listado de profesores</h2>




            <ul style="margin: 0 auto;">
                <c:forEach var="item" items="${listado}">

                    <hr style="width: 25%;">
                    <li>
                        <b>Nombre completo | </b>
                        <c:out value="${item.nombre}"/>
                        <c:out value="${item.ape1}"/>
                        <c:out value="${item.ape2}"/>
                        <ul>
                            <li>
                                <b>Domicilio | </b>
                                ${item.direccion.calle}
                                ${item.direccion.numero}
                                ${item.direccion.poblacion}
                                ${item.direccion.provincia}
                            </li>
                            
                        </ul>
                    </li>

                </c:forEach>
            </ul>
            <br />
            <p><a href="${contexto}/" class="enlace">Men&uacute; inicial</a></p>
        </div>


    </body>
</html>