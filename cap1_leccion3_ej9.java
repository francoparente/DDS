interface Encomienda {
    int peso();

    boolean esPequenio();
}

class Paquete implements Encomienda {
    int volumen;
    int peso;

    Paquete(int volumen, int peso) {
        this.volumen = volumen;
        this.peso = peso;
    }

    public int peso() {
        return peso + 50;
    }

    public boolean esPequenio() {
        return volumen < 2000;
    }

    public boolean esLiviano() {
        return this.peso() < 200;
    }
}

class Carta implements Encomienda {
    int cantidadDeLineas;

    Carta(int cantidadDeLineas) {
        this.cantidadDeLineas = cantidadDeLineas;
    }

    public int peso() {
        return cantidadDeLineas + 2;
    }

    public boolean esPequenio() {
        return true;
    }

    public boolean esLiviano() {
        return true;
    }
}