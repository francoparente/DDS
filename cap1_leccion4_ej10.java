class Luz {
  boolean encendida;

  void encender() {
    encendida = true;
  }

  void apagar() {
    encendida = false;
  }
}

class ArbolDeNavidad {
  List<Luz> luces;

  ArbolDeNavidad(List<Luz> luces) {
    this.luces = luces;
  }

  void encender() {
    luces.forEach(luz -> luz.encender());
  }

  void apagar() {
    luces.forEach(luz -> luz.apagar());
  }
}