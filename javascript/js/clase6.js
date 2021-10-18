let elemento = document.getElementById("principal")
/*Funciones*/
const suma=()=>{
    elemento.innerHTML=58+23;
};
suma()
const sumar=(a = 0, b=0)=>{
    elemento.innerHTML+= `<p> \n ${a+b} </p>`;
}
sumar(5,89);
sumar(9,89);
sumar(5,9);
sumar();

function persona(nombre, apellido, edad, dni){
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.dni=dni;
}

let Claudia = new persona("Claudia", "Chauque", 22, 41587138);
console.log(Claudia)
elemento.innerHTML=`<p>${Claudia.nombre} ${Claudia.apellido} ${Claudia.edad} ${Claudia.dni}</p>`;
let inju = new persona("Inju", "Chauque", 22, 41587138);



class NombreClase{
    constructor(){ //Las funciones pueden partir del constructor

    }
}

