package senai499.com.br.cafeteriadonainez.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


public class AdminController {
    @Controller
    public class HomeController {

        @GetMapping("/administrativo")
        public String administrativo() {
            return "administrativo";
        }
    }
    }

