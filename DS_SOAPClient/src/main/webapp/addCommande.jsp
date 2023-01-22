<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Passer une commande</title>
<style>
    form {
        background-color: #f2f2f2;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0px 0px 10px 0px #bbbbbb;
        margin: 0 auto;
        width: 50%;
        text-align: center;
    }
    label {
        color: #333333;
        font-weight: bold;
        margin-bottom: 10px;
        display: block;
    }
    input[type="text"] {
        background-color: #ffffff;
        border: none;
        padding: 10px;
        border-radius: 5px;
        margin-bottom: 20px;
        width: 100%;
    }
    input[type="submit"] {
        background-color: #0000ff;
        color: #ffffff;
        font-size: large;
        padding: 10px 20px;
        border-radius: 10px;
        margin-top: 20px;
    }
</style>


</head>
<body>
    <h1 style="text-align: center; font-size: x-large; color: #0000ff;">Passer Votre Commande</h1>
    <form action="ConfirmationCommande" method="post">
  




    <h2 style="font-size: x-large;">Référence de repas sélectionnée : ${selectedRefRepas}</h2>
    <p style="font-size: medium; color: #0000ff;">Merci de remplir les champs par vos coordonnées</p>
     <label>Nom client:</label>
        <input type="text" name="nom" placeholder="Enter votre Nom" value="${nom}" required>
        <br>
        <label>Contact client:</label>
        <input type="text" name="contact" placeholder="Email , Numéro de téléphone" value="${contact}" required>
        <br>
     
        <input type="submit" value="Passer Commande">
    </form></body>
</html>