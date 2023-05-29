<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Product Creation</title>
    </head>
    <body>
        <header>
            <h1>Product Creation</h1>
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
            	     <input type="date" id="dateBook" name="dateBook" value="${now}">
                </div>
                <div>
                    <input type="submit" value="Save">
                </div>
            </form>
        </main>
        <footer>
            <a href="booklist">Books List</a>
        </footer>
    </body>
</html>
