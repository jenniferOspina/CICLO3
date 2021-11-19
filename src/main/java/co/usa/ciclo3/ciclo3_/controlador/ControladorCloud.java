package co.usa.ciclo3.ciclo3_.controlador;
import co.usa.ciclo3.ciclo3_.model.Cloud;
import co.usa.ciclo3.ciclo3_.servicio.ServiciosCloud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Cloud")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class ControladorCloud {
    @Autowired
    private ServiciosCloud servicio;
    @GetMapping("/all")
    public List<Cloud> getClouds(){
        return servicio.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Cloud> getBike(@PathVariable("id") int cloudId) {
        return servicio.getCloud(cloudId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cloud save(@RequestBody Cloud cloud) {
        return servicio.save(cloud);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Cloud update(@RequestBody Cloud cloud) {
        return servicio.update(cloud);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int cloudId) {
        return servicio.deleteCloud(cloudId);
    }
}

