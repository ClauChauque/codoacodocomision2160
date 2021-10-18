let elemento = document.getElementById("principal");
let tiempo=0;
// console.log(elemento);
//Estructura del objeto
let usuario={
    name:"claudia",
    edad:"22",
    email:"claudiachauque-@hotmail.com",
    pass: "123456",
    validar:(e,p)=>{
        if(e === usuario.email && p === usuario.pass){
            return true
        }else{
            return false
        }
    }
};

window.addEventListener('load',function(){ /*load es un elemento*/
    elemento.innerHTML=`
    <form class="col-6">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="email" aria-describedby="emailHelp">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" id="password">
  </div>
  <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button id="btn" type="button" class="btn btn-primary">Ingresar</button>
    </form> 
    `;
//INICIO DE FUNCIÓN --- VALIDA LOS DATOS DE LA VARIABLE usuario.
    document.getElementById("btn").addEventListener('click',()=>{ //Se le agrega al botón un evento click
        let email = document.getElementById("email").value //con el .value se indica que muestre el valor del elemento
        let pass = document.getElementById("password").value
        let entrar = usuario.validar(email,pass)
        console.log(entrar)
        if(entrar){
            elemento.innerHTML=`
            <h1>Sistema administrativo</h1>
            <p>Bienvenid@ ${usuario.name}</p>
            `;
            // elemento.innerHTML=
            // "<h1>Sistema administrativo</h1><p>Bienvenid@"+ usuario.name +</p>
        }else{
            elemento.innerHTML+= `
            <div id="mensaje" class="alert alert-danger text-center mt-3" role="alert">
                Usuario o contraseña incorrecta
            </div>
            `;
            tiempo = setInterval(ocultar(),2000);
        }
    })
}) 

//FUNCION OCULTAR
function ocultar(){
    elemento.innerHTML=`
    <form class="col-6">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="email" aria-describedby="emailHelp">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" id="password">
  </div>
  <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button id="btn" type="button" class="btn btn-primary">Ingresar</button>
    </form> 
    `;
    clearInterval(tiempo)
}


//LA FUNCIÓN SOLO DURA UNOS SEGUNDOS
// let tiempo = setInterval(()=>{   //setInterval es un metodo nativo
//     // document.getElementById("mensaje").style.visibility="hidden";

//     clearInterval(tiempo);  //detiene el tiempo
// },3000); //indican 3 segundos




//Control + boton de cierre de llave "}" = comentar //
// Alt Gr + boton de cierre de llave "}" = comillas francesas ``
//ABM
