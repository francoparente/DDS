import java.util.Arrays;

class Torre {
  List<Piso> pisos;

  Torre(List<Piso> pisos) {
    this.pisos = pisos;
  }

  int altura() {
    return pisos.size();
  }

  int numeroDePiso(Piso piso) {
    return pisos.indexOf(piso);
  }
}

// asumo que la clase Piso ya existe.