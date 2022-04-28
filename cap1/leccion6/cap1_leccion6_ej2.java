class Jefe {
    int sueldoPorHora = 200;
    int dinero;

    int getDinero() {
        return dinero;
    }

    int sueldoPorHora() {
        return sueldoPorHora;
    }

    boolean genteACargo() {
        return true;
    }

    void trabajar(int horas) {
        dinero += sueldoPorHora * horas;
    }
}
