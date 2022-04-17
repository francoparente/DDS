class Boveda {
    int saldo = 0;
    Seguridad seguridad = new SeguridadBaja();

    int getSaldo() {
        return saldo;
    }

    void extraerMonedas(int monedas) {
        saldo = seguridad.extraerMonedas(monedas, saldo);
    }

    void depositarMonedas(int monedas) {
        saldo += monedas;
    }

    void asegurarCon(Seguridad seguridad) {
        this.seguridad = seguridad;
    }
}

// interfaces

interface Seguridad {
    int extraerMonedas(int monedas, int saldo);
}

// implementations

class SeguridadMedia implements Seguridad {
    public int extraerMonedas(int monedas, int saldo) {
        if (monedas > saldo)
            return saldo;
        return saldo - monedas;
    }
}

class SeguridadBaja implements Seguridad {
    public int extraerMonedas(int monedas, int saldo) {
        return saldo - monedas;
    }
}