class ContestadorAutomatico {

  String responderA(String persona) {
    switch (persona) {
      case "Martin":
        return "Llamá más tarde";
      case "Laura":
        return "Ahora no puedo, te llamo después";
      case "Lucas":
        return "¡Shu!";
      default:
        return " ";
    }
  }
}
