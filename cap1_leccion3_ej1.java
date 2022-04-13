class Viaje {
  Transporte transporte;
  Alojamiento alojamiento;
  
  Viaje(Transporte transporte, Alojamiento alojamiento) {
    this.transporte = transporte;
    this.alojamiento = alojamiento;
  }
  
  double cuantoCuesta() {
    return transporte.costoTotal() + alojamiento.arancel();
  }
}

//interfaces

interface Transporte {
  int costoTotal();
}

interface Alojamiento {
  int arancel();
}

//Transportes

class Avion implements Transporte{
  int costoPasaje;
  
  public int costoTotal(){
    return costoPasaje*2;
  }
  
  Avion(int costoPasaje){
    this.costoPasaje = costoPasaje;
  }
}

class Micro implements Transporte{
  public int costoTotal(){
    return 500;
  }
}
  
class Bicicleta implements Transporte{
  public int costoTotal(){
    return 0;
  }
}

//Alojamientos

class Hotel implements Alojamiento{
  int cantidadDeEstrellas;
  int cantidadDeNoches;
  
  public int arancel(){
    return cantidadDeEstrellas*cantidadDeNoches;
  }
  
  Hotel(int estrellas, int noches){
    this.cantidadDeEstrellas = estrellas;
    this.cantidadDeNoches = noches;
  }
}

class Departamento implements Alojamiento{
  boolean incluyeDesayuno;
  
  public int arancel(){
    if(incluyeDesayuno){
      return 2000;
    }
    return 1000;
  }
  
  Departamento(boolean incluyeDesayuno){
    this.incluyeDesayuno = incluyeDesayuno;
  }
}
