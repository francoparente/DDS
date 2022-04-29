class MuseoDeCienciasNaturales {
    void cobrarEntrada(VisitanteNacional visitante) {
        Folleto folletoEnEspaniol = new Folleto("español");

        visitante.pagar(100);
        visitante.recibir(folletoEnEspaniol);
    }

    void cobrarEntrada(VisitanteExtranjero visitante) {
        Folleto folletoEnIngles = new Folleto("inglés");

        visitante.pagar(200);
        visitante.recibir(folletoEnIngles);
    }

}
