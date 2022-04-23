//$(document).ready(function () {


loadStates();
const d = document;
selectprimary = d.getElementById("select-primary");
selectSecondary = d.getElementById("select-secondary");
let area = d.getElementById("area");
let paginas;
function loadStates() {
//    fetch("http://localhost:8080/api/books")
    fetch("api/books")
            .then(res => res.ok ? res.json() : Promise.reject(res))
            .then(json => {
                console.log(json);
                let $options = `<option value="">Elige un titulo</option>`;
                json.forEach(el => {
                    $options += `<option value="${el.id}">${el.title}</option>`;
                    paginas = el.pages
                });
                selectprimary.innerHTML = $options;
            })
            .catch(err => {
                console.log(err);
                let message = err.statusText || "Ocurrio un error";
                selectprimary.nextElementSibling.innerHTML = `Error ${err.status}: $(message)`;
            })
            ;
}

function loadPages(libro) {

    console.log(`${libro}`);
    fetch(`api/book/${libro}`)
            .then(res => res.ok ? res.json() : Promise.reject(res))
            .then(json => {
                // console.log(json.pages);
                paginas = json.pages;
                pasarArray();
                // console.log(paginas);

                let options = `<option value="">Elige un paginas</option>`;
                json.pages.forEach(el => {
                    options += `<option value="${el.id}">${el.content}</option>`;

                });
                selectSecondary.innerHTML = options;
            })

            .catch(err => {
                console.log(err);
                area.value = "";
                let message = err.statusText || "Ocurrio un error";
                selectSecondary.nextElementSibling.innerHTML = `Error ${err.status}: ${message}`;
            });

}

selectprimary.addEventListener("change", (e) => loadPages(e.target.value));



var lineas = ["linea 1", "linea 2", "linea 3"];

function pasarArray() {
    console.log(paginas);


    area.value = "";

    paginas.forEach(el => area.value += el.content + '\n');
}

//    pasarArray(); pasarArray();
//});