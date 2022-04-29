class Telefono {
    double costoPorLlamar(Numero numero, int segundos) {
        return numero.costoPorSegundo() * segundos;
    }
}
