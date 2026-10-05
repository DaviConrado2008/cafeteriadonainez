package senai499.com.br.cafeteriadonainez.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PedidosController {
    @GetMapping("/pedidos")
    public String pedidos() {
        return "pedidos/pedidos";
    }
    @GetMapping("/pedidoscliente")
    public String pedidoscliente() {
        return "pedidos/pedidoscliente";
    }
}
