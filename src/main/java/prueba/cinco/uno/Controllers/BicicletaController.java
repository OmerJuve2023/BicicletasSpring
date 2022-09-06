package prueba.cinco.uno.Controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import prueba.cinco.uno.datos.Bicicleta;
import prueba.cinco.uno.interfaces.BicicletaRepository;

import java.util.List;

@RestController
public class BicicletaController {

    private final BicicletaRepository repository;

    public BicicletaController(BicicletaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("api/toString")
    public ResponseEntity<List<Bicicleta>> viewList() {
        if (repository.count() == 0) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(repository.findAll());
    }

    private Bicicleta bici() {
        return new Bicicleta("16", "M", "trex", "shimano", "shimano", "29", "trek");
    }

    @GetMapping("api/createBicicletas")
    public String createBicicleta() {
        repository.save(bici());
        return "se agrego una nueva bici";
    }
}
