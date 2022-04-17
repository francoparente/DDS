class Biblioteca {
  ArrayList<Titulo> catalogo = new ArrayList<>();

  // Agrega un título al catálogo,   
  // salvo que ya la contenga
  void incorporar(Titulo unNuevoTitulo) {
    if(!catalogo.contains(unNuevoTitulo))
      catalogo.add(unNuevoTitulo);
  }
  
  // Retorna la cantidad de títulos en el catálogo
  int tamanio() {
    return catalogo.size();
  }
  
  // Una biblioteca es nueva cuando 
  // no tiene títulos 
  boolean esNueva() {
    return catalogo.isEmpty();
  }
}