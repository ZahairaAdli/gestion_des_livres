<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<Link rel="stylesheet" type="text/css" href="webjars/bootsrtap/5.2.1/css/bootstrap.min.css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Books List</title>


    </head>
    <body>
        <header>
            <h1>Book List</h1>
        </header>
        <main>
              <table  class="table">
              <thead class="table-dark">
                <tr>
                  <th>Book Id</th><th>Book Name</th><th>Book Price</th><th>Create Date</th>
                </tr>
                </thead>

         <c:forEach items="${booksJsp}" var="book">
                    <tr>
                        <td>${book.idBook}</td>
                         <td>${book.nameBook}</td>
                          <td>${book.prixBook}</td>
                           <td><fmt:formatDate pattern="dd/mm/yyyy" value="${book.dateBook}"/></td>
                           <td><a onClick="return confirm (' Attention we gonna delete this?')"
                           href="deleteBook?id=${book.idBook}">Delete</a>
                           </td>
                            <td><a href="showBook?id=${book.idBook}">Edit</a>
                              </td>
                    </tr>

                 </c:forEach>
              </table>
        </main>
        <footer>
            <a href="createBook">Book Creation</a>
        </footer>
    </body>
</html>

