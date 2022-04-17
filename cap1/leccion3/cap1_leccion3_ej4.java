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
        saldo = seguridad.depositarMonedas(monedas, saldo);
    }

    void asegurarCon(Seguridad seguridad) {
        this.seguridad = seguridad;
    }
}

// interfaces

interface Seguridad {
    int extraerMonedas(int monedas, int saldo);

    int depositarMonedas(int monedas, int saldo);
}

// implementations

class SeguridadAlta implements Seguridad {
    public int extraerMonedas(int monedas, int saldo) {
        if (monedas > saldo)
            throw new RuntimeException("Saldo insuficiente");
        return saldo - monedas;
    }

    public int depositarMonedas(int monedas, int saldo) {
        return saldo + monedas - 1;
    }
}

class SeguridadMedia implements Seguridad {
    public int extraerMonedas(int monedas, int saldo) {
        if (monedas > saldo)
            return saldo;
        return saldo - monedas;
    }

    public int depositarMonedas(int monedas, int saldo) {
        return saldo + monedas;
    }
}

class SeguridadBaja implements Seguridad {
    public int extraerMonedas(int monedas, int saldo) {
        return saldo - monedas;
    }

    public int depositarMonedas(int monedas, int saldo) {
        return saldo + monedas;
    }
}