class Pasante {
    int sueldoPorHora = 100;
    int dinero;

    int getDinero() {
        return dinero;
    }

    int sueldoPorHora() {
        return sueldoPorHora;
    }

    boolean genteACargo() {
        return false;
    }

    void trabajar(int horas) {
        dinero += sueldoPorHora * horas;
    }
}
