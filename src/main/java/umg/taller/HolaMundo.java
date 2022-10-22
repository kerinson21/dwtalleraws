package umg.taller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundo {
    @GetMapping("/hola")
    public String saludo(){
        return "Hola UMG";
    }
}
