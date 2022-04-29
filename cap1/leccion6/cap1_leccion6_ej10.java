class Arbusto extends Arbol {
    int fotosintesis() {
        return super.fotosintesis() + 100;
    }

    void crecer() {
        cantidadDeHojas += 5;
    }

    void marchitarse() {
        cantidadDeHojas = 0;
    }

}
