class Persona {
    double vitaminaC = 0;
    Jugo jugo;

    public double getVitaminaC() {
        return vitaminaC;
    }

    void beber(Jugo jugo) {
        if (jugo.tieneMuchaVitaminaC()) {
            vitaminaC = jugo.jugoTotal() / 2;
        } else {
            vitaminaC = jugo.jugoTotal() / 10;
        }
    }

}

interface Jugo {
    boolean tieneMuchaVitaminaC();

    int jugoTotal();
}

class JugoSimple implements Jugo {
    Fruta fruta;

    JugoSimple(Fruta fruta) {
        this.fruta = fruta;
    }

    public boolean tieneMuchaVitaminaC() {
        return fruta.esAcida() && fruta.jugo() > 100;
    }

    public int jugoTotal() {
        return fruta.jugo() + 100;
    }
}

class JugoMixto implements Jugo {
    Fruta fruta1;
    Fruta fruta2;

    JugoMixto(Fruta fruta1, Fruta fruta2) {
        this.fruta1 = fruta1;
        this.fruta2 = fruta2;
    }

    public boolean tieneMuchaVitaminaC() {
        return (fruta1.esAcida() && fruta2.esAcida())
                || (fruta1.jugo() + fruta2.jugo() > 200) && (fruta1.jugo() + fruta2.jugo() < 220);
    }

    public int jugoTotal() {
        return fruta1.jugo() + fruta2.jugo() + 50;
    }
}

// interface

interface Fruta {

    boolean esAcida();

    int jugo();
}

// implementations

class Manzana implements Fruta {
    public boolean esAcida() {
        return false;
    }

    public int jugo() {
        return 80;
    }
}

class Naranja implements Fruta {
    public boolean esAcida() {
        return true;
    }

    public int jugo() {
        return 105;
    }
}

class Pomelo implements Fruta {
    public boolean esAcida() {
        return true;
    }

    public int jugo() {
        return 130;
    }
}