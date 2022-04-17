interface Distribuible {
    int peso();

    boolean esPequenio();
}

class Paquete implements Distribuible {
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

class Carta implements Distribuible {
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

// ----------------------

class EnvioCortaDistancia {
    Ciudad origen;

    EnvioCortaDistancia(Ciudad origen) {
        this.origen = origen;
    }

    boolean puedeEnviar(Distribuible distribuible, Ciudad destino) {
        return distribuible.esPequenio()
                && Math.abs((origen.distancia(destino))) < 200;
    }

    int costo(Distribuible distribuible, Ciudad destino) {
        return Math.abs((origen.distancia(destino))) + distribuible.peso();
    }
}