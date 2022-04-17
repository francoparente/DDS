class ClubDeNoHomeros {

  Set<String> integrantes = new HashSet(Arrays.asList("Homero", "Carl", "Lenny", "Homero", "Homero"));

  long cantidadIntegrantes() {
    return integrantes.size();
  }
}