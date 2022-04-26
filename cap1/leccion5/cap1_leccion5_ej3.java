class ContestadorAutomatico {

  Map<String, String> respuestas = new HashMap<>();

  public ContestadorAutomatico() {
    respuestas.put("Martin", "Llamá más tarde");
    respuestas.put("Laura", "Ahora no puedo, te llamo después");
    respuestas.put("Lucas", "¡Shu!");
  }

  String responderA(String persona) {
    return respuestas.get(persona);
  }
}
