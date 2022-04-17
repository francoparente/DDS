import java.util.stream.Collectors;

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

  List<Chiste> chistesLargos() {
    return chistes.stream().filter(chiste -> chiste.largo() > 50).collect(Collectors.toList());
  }

  List<String> textoDeLosChistes() {
    return chistes.stream().map(chiste -> chiste.getTexto()).collect(Collectors.toList());
  }

  boolean granRepertorio() {
    return chistes.stream().mapToInt(chiste -> chiste.largo()).sum() > 200;
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