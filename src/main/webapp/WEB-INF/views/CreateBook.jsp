<!DOCTYPE html>
<html lang="en">
    <head>
    <Link rel="stylesheet" type="text/css" href="webjars/bootsrtap/5.2.1/css/bootstrap.min.css"/>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Book Creation</title>
    </head>
    <body>
        <header>
            <h1>Book Creation</h1>

        </header>
        <main>
            <form action="saveBook" method="post">
                <div>
                    <label for="nameBook">BookNAme : </label>
                    <input type="text" id="nameBook" name="nameBook">
                </div>
                <div>
                    <label for="prixBook">Price : </label>
                    <input type="text" id="prixBook" name="prixBook">
                </div>
                <div>
                    <label for="dateBook">Creation Date : </label>
            	     <input type="date" id="dateBook" name="dateJsp" value="${now}">
                </div>
                <div>
                    <input type="submit" value="Save">
                </div>
            </form>
            ${messageJsp}
        </main>
        <footer>
            <a href="booksList">Books List</a>
        </footer>
    </body>
</html>
