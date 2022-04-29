class RoperoDeLucy {
    boolean leQuedaBien(Vestido vestido) {
        return false;
    }

    boolean leQuedaBien(Enterito enterito) {
        return true;
    }

    boolean leQuedaBien(Pantalon pantalon, Remera remera) {
        return pantalon.combinaCon(remera);
    }

}
