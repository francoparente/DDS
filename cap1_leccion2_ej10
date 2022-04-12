class Bolso {
  
  Comida comida;
  Bebida bebida;
  
  boolean sePuedeCompartir(){
    return comida.sePuedeCompartir() && bebida.sePuedeCompartir();
  }
  int caloriasTotales(){
    return comida.caloriasTotales() + bebida.caloriasTotales();
  }
  
  Bolso(Comida comida, Bebida bebida){
    this.comida = comida;
    this.bebida = bebida;
  }
}

interface Comida{
  boolean sePuedeCompartir();
  int caloriasTotales();
}
interface Bebida{
  boolean sePuedeCompartir();
  int caloriasTotales();
}

class EnsaladaDeFrutas implements Comida{
  public boolean sePuedeCompartir(){
    return false;
  }
  public int caloriasTotales(){
    return 50;
  }
}

class DocenaMedialunas implements Comida{
  public boolean sePuedeCompartir(){
    return true;
  }
  public int caloriasTotales(){
    return 1524;
  }
}

class Sanguches implements Comida{
  public boolean sePuedeCompartir(){
    return false;
  }
  public int caloriasTotales(){
    return 600;
  }
}

class Agua implements Bebida{
  public boolean sePuedeCompartir(){
    return false;
  }
  public int caloriasTotales(){
    return 0;
  }
}

class Mate implements Bebida{
  public boolean sePuedeCompartir(){
    return true;
  }
  public int caloriasTotales(){
    return 0;
  }
}
