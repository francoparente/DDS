class Cartero {
    Distribuible distribuible;
    Envio envio;

    Cartero(Distribuible distribuible) {
        this.distribuible = distribuible;
    }

    double comision(Envio envio, Ciudad destino) {
        if (!envio.puedeEnviar(distribuible, destino))
            return 0;
        return envio.comision(distribuible, destino);
    }
}

// ----------------------

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

interface Envio {
    boolean puedeEnviar(Distribuible distribuible, Ciudad destino);

    int costo(Distribuible distribuible, Ciudad destino);

    double comision(Distribuible distribuible, Ciudad destino);
}

class EnvioCortaDistancia implements Envio {
    Ciudad origen;

    EnvioCortaDistancia(Ciudad origen) {
        this.origen = origen;
    }

    public boolean puedeEnviar(Distribuible distribuible, Ciudad destino) {
        return distribuible.esPequenio()
                && Math.abs((origen.distancia(destino))) < 200;
    }

    public int costo(Distribuible distribuible, Ciudad destino) {
        return Math.abs((origen.distancia(destino))) + distribuible.peso();
    }

    public double comision(Distribuible distribuible, Ciudad destino) {
        return 0.1 * this.costo(distribuible, destino);
    }
}

class EnvioUrgente implements Envio {
    Ciudad origen;

    EnvioUrgente(Ciudad origen) {
        this.origen = origen;
    }

    public boolean puedeEnviar(Distribuible distribuible, Ciudad destino) {
        return true;
    }

    public int costo(Distribuible distribuible, Ciudad destino) {
        return 5000 + distribuible.peso();
    }

    public double comision(Distribuible distribuible, Ciudad destino) {
        return 0.2 * this.costo(distribuible, destino);
    }
}