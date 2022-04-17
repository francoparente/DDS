
// solución sin stream ni count:
/*
 * class Repertorio {
 * List<Chiste> chistes;
 * 
 * Repertorio(List<Chiste> chistes) {
 * this.chistes = chistes;
 * }
 * 
 * long cantidadBuenosChistes() {
 * int cantidad = 0;
 * for (int i = 0; i < this.chistes.size(); i++) {
 * if (this.chistes.get(i).esBueno()) {
 * cantidad++;
 * }
 * }
 * return cantidad;
 * }
 * }
 */

// solución con count y stream:

class Repertorio {
  List<Chiste> chistes;

  Repertorio(List<Chiste> chistes) {
    this.chistes = chistes;
  }

  long cantidadBuenosChistes() {
    return chistes.stream().filter(chiste -> chiste.esBueno()).count();
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
 * 
 */