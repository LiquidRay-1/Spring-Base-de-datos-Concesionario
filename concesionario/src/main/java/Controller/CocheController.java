package Controller;

import com.example.concesionario.model.Coches;
import com.example.concesionario.repository.CocheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coches")
public class CocheController {

    @Autowired
    private CocheRepository cocheRepository;

    @GetMapping("/listar")
    public List<Coches> listarCoches() {
        return cocheRepository.findAll();
    }
}