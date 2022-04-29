class Gerente extends Empleado {

    boolean genteACargo() {
        return true;
    }

    int sueldoPorHora() {
        return 300;
    }

    void pagarBono(Jefe jefe) {
        jefe.cobrarBono();
    }

    void trabajar(int horas) {
        dinero += sueldoPorHora() * horas + 200;
    }

    void faltarAlTrabajo() {

    }
}
