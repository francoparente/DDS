import java.util.LinkedList;

class CentroDeAtencion {
  LinkedList<Reclamo> listaDeReclamos = new LinkedList<>();

  void aceptarReclamo(Reclamo reclamo) {
    reclamo.agregarReclamo(listaDeReclamos, reclamo);
  }

  LinkedList<Reclamo> getReclamos() {
    LinkedList<Reclamo> lista = new LinkedList<>();

    for (int i = 0; i < listaDeReclamos.size(); i++) {
      lista.add(listaDeReclamos.get(i));
    }
    return lista;
  }
}

interface Reclamo {
  void agregarReclamo(LinkedList<Reclamo> lista, Reclamo reclamo);
}

class ReclamoComun implements Reclamo {
  public void agregarReclamo(LinkedList<Reclamo> lista, Reclamo reclamo) {
    lista.addLast(reclamo);
  }
}

class ReclamoPrioritario implements Reclamo {
  public void agregarReclamo(LinkedList<Reclamo> lista, Reclamo reclamo) {
    lista.addFirst(reclamo);
  }
}