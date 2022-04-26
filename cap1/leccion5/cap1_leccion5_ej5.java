class Pedido {

  Map<Gusto, Integer> gustos = new HashMap<>();

  void anotar(Gusto gusto) {
    int cantidad = cantidad(gusto) + 1;
    gustos.put(gusto, cantidad);
  }

  int cantidad(Gusto gusto) {
    return gustos.getOrDefault(gusto, 0);
  }

  Map gustos() {
    return gustos;
  }
}
