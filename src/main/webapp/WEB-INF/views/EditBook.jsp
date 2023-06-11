<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Book Creation</title>
    </head>
    <body>
        <header>
            <h1>Book Edition</h1>
        </header>
        <main>
            <form action="updateBook" method="post">
                <div>
                    <!--on peut ajouter un parametre au id : hidden -->
                    <label hidden for="idBook">Book Id : </label>
                    <input hidden type="text" id="idBook" name="idBook" value ="${booksJsp.idBook}">
                </div>

                <div>
                    <label for="nameBook">Book Name : </label>
                    <input type="text" id="nameBook" name="nameBook" value ="${booksJsp.nameBook}">
                </div>
                <div>
                    <label for="prixBook">Price : </label>
                    <input type="text" id="prixBook" name="prixBook" value ="${booksJsp.prixBook}">
                </div>
                <div>
                    <label for="dateCreate">Creation Date : </label>
                    <fmt:formatDate pattern="yyyy-MM-dd" value ="${booksJsp.dateBook}" var="formatDate" />
                    <input type="date" id="dateBook" name="dateJsp" value="${formatDate}">
                </div>
                <div>
                    <input type="submit" value="update">
                </div>
            </form>
        </main>
        <footer>
            <a href="booksList">Books List</a>
        </footer>
    </body>
</html>

