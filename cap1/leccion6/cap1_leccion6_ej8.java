class Arbol {
    int cantidadDeHojas;

    boolean daFrutos() {
        return true;
    }

    void crecer() {
        cantidadDeHojas += 10;
    }

    int fotosintesis() {
        return cantidadDeHojas * 2;
    }

    int getCantidadDeHojas() {
        return cantidadDeHojas;
    }
}
