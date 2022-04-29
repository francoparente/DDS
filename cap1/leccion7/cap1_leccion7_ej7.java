class CentroDeAtencionAlCliente {
    String atenderLlamado(ClienteBasico cliente) {
        return "Todos nuestros operadores están ocupados en este momento";
    }

    String atenderLlamado(ClientePrometedor cliente) {
        return "Si se comunica por una falla en el servicio, marque 1. Si se comunica por...";
    }

    String atenderLlamado(ClientePremium cliente) {
        return "Uno de nuestros operadores lo atenderá al instante";
    }
}
