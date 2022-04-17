class EnvioUrgente {
    Ciudad origen;

    EnvioUrgente(Ciudad origen) {
        this.origen = origen;
    }

    boolean puedeEnviar(Distribuible distribuible, Ciudad destino) {
        return true;
    }

    int costo(Distribuible distribuible, Ciudad destino) {
        return 5000 + distribuible.peso();
    }
}