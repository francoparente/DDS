class Repertorio {
  List<Chiste> chistes;

  Repertorio(List<Chiste> chistes) {
    this.chistes = chistes;
  }

  long cantidadBuenosChistes() {
    return chistes.stream().filter(chiste -> chiste.esBueno()).count();
  }

  boolean todosBuenos() {
    return chistes.stream().allMatch(chiste -> chiste.esBueno());
  }
}

// biblioteca
/*
 * class Chiste {
 * String texto;
 * boolean bueno;
 * 
 * Chiste(String texto, boolean bueno) {
 * this.texto = texto;
 * this.bueno = bueno;
 * }
 * 
 * int largo() {
 * return texto.length();
 * }
 * 
 * String getTexto() {
 * return texto;
 * }
 * 
 * boolean esBueno() {
 * return bueno;
 * }
 * }
 */