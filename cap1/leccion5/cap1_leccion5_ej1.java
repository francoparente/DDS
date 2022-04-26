class LibroDeSugerencias {

    ArrayList<String> sugerencias = new ArrayList<String>();
    HashSet<String> dnis = new HashSet<String>();

    void registrarSugerencia(String dni, String sugerencia) {
        sugerencias.add(sugerencia);
        dnis.add(dni);
    }

    ArrayList<String> sugerencias() {
        return sugerencias;
    }

    int cantidadDnisUnicos() {
        return dnis.size();
    }
}
