import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

class Panaderia {

  Queue<Cliente> cola = new LinkedList<>();

  void entrar(Cliente cliente) {
    cola.offer(cliente);
  }

  void atender() {
    cola.poll();
  }

  Collection enEspera() {
    return cola;
  }
}
