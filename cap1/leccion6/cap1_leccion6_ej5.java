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

    void faltarAlTrabajo() {
        dinero -= sueldoPorHora() * 4;
    }

}


class Pasante extends Empleado {
    int sueldoPorHora = 100;

    int sueldoPorHora() {
        return sueldoPorHora;
    }

    boolean genteACargo() {
        return false;
    }

}


class Jefe extends Empleado {
    int sueldoPorHora = 200;

    int sueldoPorHora() {
        return sueldoPorHora;
    }

    boolean genteACargo() {
        return true;
    }

    void cobrarBono() {
        dinero += 1000;
    }
}
