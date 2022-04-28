abstract class Empleado {
  int dinero;

  abstract int sueldoPorHora();

  abstract boolean genteACargo();

  int getDinero() {
    return dinero;
  }

  void trabajar(int horas) {
    dinero += sueldoPorHora() * horas;
  }
}


class Pasante extends Empleado {
  int sueldoPorHora = 100;
  int dinero;

  int sueldoPorHora() {
    return sueldoPorHora;
  }

  boolean genteACargo() {
    return false;
  }
}


class Jefe extends Empleado {
  int sueldoPorHora = 200;
  int dinero;

  int sueldoPorHora() {
    return sueldoPorHora;
  }

  boolean genteACargo() {
    return true;
  }
}
