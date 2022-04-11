class Libro {
  int anioEdicion;
  boolean tieneColofon;
  boolean bienConservado;
  
  Libro(int anioEdicion, boolean tieneColofon) {
    this.anioEdicion = anioEdicion;
    this.tieneColofon = tieneColofon;
  }

  int getAnioEdicion() {
    return anioEdicion;
  }

  void reparar() {
    bienConservado = true;
  }

  boolean esIncunable() {
    return anioEdicion < 1500 || !tieneColofon;
  }
}

class Bibliotecario {
  int librosRevisados;
  int horas = 20;
  
  Bibliotecario(int librosRevisados) {
    this.librosRevisados = librosRevisados;
  }
  
  void revisar(Libro libro) {
    this.librosRevisados++;
    
    if(libro.esIncunable() && !libro.bienConservado && this.horas >= 10){
      libro.reparar();
      this.horas -= 10;
    }
  }
  
  int getCantidadLibrosRevisados() {
    return this.librosRevisados;
  }
  
  void pasarMes() {
    this.horas = 20;
  }
}
