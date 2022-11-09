function addMovie() {
    var ititulo = document.getElementById("titulo").value;
    var idirector = document.getElementById("director").value;
    var iaño = document.getElementById("año").value;
    var iduracion = document.getElementById("duracion").value;
    var igenero = document.getElementById("genero").value;

    fetch("http://localhost:8080/cine/add-movie", {
        headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        method: 'POST',
        body: JSON.stringify({
            titulo: ititulo,
            director: idirector,
            año: iaño,
            duracion: iduracion,
            genero: igenero
        })
    })
        .then(response => response.text())
        .then(result => notify("Pelicula añadida correctamente"))
}

function clean() {
    document.getElementById("titulo").value = "";
    document.getElementById("director").value = "";
    document.getElementById("año").value = "";
    document.getElementById("duracion").value = "";
    document.getElementById("genero").value = "";
}

function notify(message) {
    alert(message);
}