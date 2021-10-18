alert('Soy una ventana emergente'); /*Funcion dentro de la API del navegador*/
        console.log('Hola soy un mensaje en la consola') /*F12 -> Console. console.log es una variable*/

        /*VARIABLE: es un espacio en la memoria cuyo valor se define cuando se tipea.
        Puede ser local o global. LOCAL: está dentro de una función o un bloque de codigo, por lo que sólo
        puede usarse ahí. GLOBAL*/
        /*No es necesario usar el ; */
        var nombre_variable; /*siempre ocupa espacio en la memoria*/
        let otra_variable = "Hola" /*solo ocupa espacio cuando se usa la variable. Tipo String.*/
        const PI = 3.1416 /*variable constante: tipos enteros o float*/
        let num2=18;
        let hayClases=true; /*variable boolean*/
        let terminoLaClase=false;

        /*Tipos de variables: undefined, número, String Boolean, Objeto, Arreglo, chart, función*/
        console.log(PI*num2);
        console.log(num2 + 36 + " " + otra_variable); /*las comillas concatenan un espacio*/
        /*El signo + tiene doble función: operar(como suma) y concatenar(unir 2 elementos/variables/etc)*/

        /*CONDICIONALES*/
        /*Ejemplo con operador Y = &&. Los símbolos != interpreta una negación*/
        hayClases=false;
        if(hayClases == true && terminoLaClase != true){
            console.log('Nos conectamos a la videollamada')
        }else{
            console.log('Salimos a celebrar el día del estudiante!')
        }
        /*Ejemplo con operador O = ||*/
        if(hayClases == false || terminoLaClase == true){
            console.log('Salimos a celebrar el día del estudiante! X2')
        }

        /*DOM = Modelo del objeto documento*/
        /*document tiene propiedades, funciones y métodos propios de la API*/
        let elemento = document.getElementById("principal");
        //console.log(elemento);

        /*innerHTML es una propiedad cuyo valor se va a mostrar en la pantalla*/
        elemento.innerHTML="Mi valor para innerHTML" 
        /*Al poner a la variable "otra_variable" dentro de una etiqueta de párrafo, se le está dando a la
        variable elemento el valor de variable anterior pero en forma de párrafo sobre el Index*/
        elemento.innerHTML= "<p>"+otra_variable+"</p>"; 

        document.write("<h3>Hola buen día </h3>")



                                minuto 55:10





        let mensaje = prompt("Introduce un tu mensaje: ");
        elemento.innerHTML+="<h3>" + mensaje+ "<h3>";
        elemento.innerHTML+= <div class=\"alert alert-success\" role=\"alert\">"+mensaje+"<div/>;
        
        let menu = prompt("Selecciona el pedido: )
        
        /*switch (menu) {
            case '1':
                elemnto.innerHTML="<div class\"alert alert-success\" role=\"alert\">Disfruta de tus milanesas con fritas        
                break;
        
            default:
                elemento.innerHTML="<div class\"alert alert-success\" role=\"alert\">Debes elegir algo del menú
                break;
        } */
        
        alumnos.push("barbara");
        alumnos[5]="Luis";
        
        alumnos.array.forEach(element => {
            
        });