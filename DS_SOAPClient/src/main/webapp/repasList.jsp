
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des repas</title>
<style>
body {
    background-color: #f2f2f2;
}

form {
    background-color: #ffffff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0px 0px 10px 0px #bbbbbb;
    margin: 0 auto;
    width: 50%;
}

label {
    color: #333333;
    font-weight: bold;
    margin-bottom: 10px;
    display: block;
}

input[type="text"] {
    background-color: #f2f2f2;
    border: none;
    padding: 10px;
    border-radius: 5px;
    margin-bottom: 20px;
    width: 100%;
}

.table-header {
    background-color: #0000ff;
    color: #ffffff;
    font-size: large;
    text-align: center;
    padding: 10px;
}

.table-cell {
    background-color: #f2f2f2;
    color: #000000;
    font-size: medium;
    text-align: center;
    padding: 10px;
}

table {
    margin: 0 auto;
    border: 1px solid black;
    width: 80%;
    font-family: 'Open Sans', sans-serif;
}



</style>

</head>
<body>

<c:if test="${not empty sessionScope.messageConfirmation}">
    <div class="alert alert-success">
        <c:out value="${sessionScope.messageConfirmation}" />
    </div>
</c:if>
<h1 style="text-align: center; font-size: x-large; color: #0000ff;">Liste Des Repas</h1>


       
        
   <form name="rechercher" method="get" action="rechercher">
 <p style="text-align: center; font-size: x-large; ">Date d'aujourd'hui : <input name="date" type="date" value="${today}" ></p>            
            <p style="text-align: center; font-size: x-large; ">Description : <input name="description" type="text" value="${description}" ></p>
          
<input type="submit" class="btn btn-primary" style="background-color: #0000ff; color: #ffffff; font-size: large; padding: 10px 20px; border-radius: 10px;" value="Rechercher">

 </form>
 
     
 <table class="table">
    <tr>
      <th class="table-header">Référence</th>
      <th class="table-header">Nom de repas</th>
      <th class="table-header">Ingredients</th>
            <th class="table-header">Action</th>
      

    </tr>
    <c:forEach  var="ai" items="${repass}">
       <tr>
      <td class="table-cell" id="r1">${ai.refRepas}</td>
      <td class="table-cell">${ai.description}</td>
      <td class="table-cell"> <table class="table">
      
    
      <tr>
      <th class="table-header">code Ingredient</th>
      <th class="table-header">Nom de l'ingredient</th>
      <th class="table-header">Quantité</th>
            <th class="table-header">Unité de mesure</th>
      
    </tr>
      
          <c:forEach  var="i" items="${ai.ingredients}">
      
       <tr>
      <td class="table-cell">${i.codeIngredient}</td>
      <td class="table-cell">${i.nomIngredient}</td>
      <td class="table-cell">${i.quantite}</td>
	  <td class="table-cell">${i.uniteMesure}</td>
			 </tr>     
        </c:forEach>
      
     </table> </td>
     <td>
     <form action="PasserCommandeServlet" method ="post">
          
<input type="submit" class="btn btn-primary" style="background-color: #0000ff; color: #ffffff; font-size: large; padding: 10px 20px; border-radius: 10px;"  name="submit_<c:out value='${index}'/>" value="${ai.refRepas}" value="passer">
     
     </form>
     </td>
     
      </c:forEach>
</table>
    
        


</body>
</html>