let section = document.getElementById("section");
// section.style.visibility="hidden"
const comprarTicket=()=>{
    section.innerHTML=`
    <div class="container">
        <div class="row">
            <div class="col col-md-10 offset-md-1 col-lg-8 offset-lg-2 pt-2">
                <div class="car-group">
                    <div class="card">
                        <div class="card-body border border-primary mr-1">
                            <h5 class="card-tittle text-center">Estudiantes</h5>
                            <p class="card-text text-center">Tienen un descuento</p>
                            <p class="card-tittle text-center font-weight-bold">80%</p>
                            <p class="card-text text-center"><small class="text-muted">* Presentar documentación</small></p>
                        </div>
                    </div>
    
                    <div class="card">
                        <div class="card-body border border-primary mr-1">
                            <h5 class="card-tittle text-center">Estudiantes</h5>
                            <p class="card-text text-center">Tienen un descuento</p>
                            <p class="card-tittle text-center font-weight-bold">80%</p>
                            <p class="card-text text-center"><small class="text-muted">* Presentar documentación</small></p>
                        </div>
                    </div>

                    <div class="card">
                        <div class="card-body border border-primary mr-1">
                            <h5 class="card-tittle text-center">Estudiantes</h5>
                            <p class="card-text text-center">Tienen un descuento</p>
                            <p class="card-tittle text-center font-weight-bold">80%</p>
                            <p class="card-text text-center"><small class="text-muted">* Presentar documentación</small></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    
        <div class="row">
            <div class="col text-uppercase text-center"> 
                <small>Venta</small>
                <h2>Valor de ticket $200</h2>
            </div>
        </div>
    
        <div class="row"> 
            <div class="col col-md-10 offset-md-1 col-lg-8 offset-lg-2 pt-2">
                <form>
                    <div class="form-row">
                        <div class="d-flex">
                            <div class="form-group col-12 col-md-6">
                                <input type="text" class="form-control" placeholder="Nombre"></input>
                            </div>
                            <div class="form-group col-12 col-md-6">
                                <input type="text" class="form-control" placeholder="Apellido"></input>
                            </div>
                        </div>
                        <div class="form-group col-12 col-md-12">
                            <input type="email" class="form-control" placeholder="Correo"></input>
                        </div>
                        <div class="d-flex">
                            <div class="form-group col-12 col-md-6">
                                <label for="">Cantidad</label>
                                <input id="cantidadDeEntradas" type="text" class="form-control" placeholder="Cantidad"></input>
                            </div>
                            <div class="form-group col-12 col-md-6">
                                <label for="">Categoría</label>
                                <select class="form-select" id="inputState">
                                    <option value="estudiante" selected>Estudiante</option>
                                    <option value="trainee" selected>Trainee</option>
                                    <option value="junior" selected>Junior</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group">
                                <div id="totalCompra" class="alert alert-primary" role="alert">
                                    Total a pagar: $
                                </div>
                            </div>
                        </div>

                        <div class="form-row">
                            <div class="form-group">
                                <button type="reset" class="btn btn-codo btn-block">Borrar</button>
                            </div>
                            <div class="form-group">
                                <button type="button" id="botonCalcular" class="btn btn-codo btn-block">Resumen</button>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    `;
}

// 51, 54 y 57 tienen cerrados los input
// Linea 67 y 68 - selected adicionales