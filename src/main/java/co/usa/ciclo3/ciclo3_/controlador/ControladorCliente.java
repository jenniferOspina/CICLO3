package co.usa.ciclo3.ciclo3_.controlador;

import co.usa.ciclo3.ciclo3_.model.Cliente;
import co.usa.ciclo3.ciclo3_.servicio.ServiciosCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class ControladorCliente {
    @Autowired
    private ServiciosCliente servicio;

    @GetMapping("/all")
    public List<Cliente> getClients(){
        return servicio.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> getClient(@PathVariable("id") int clientId) {
        return servicio.getClient(clientId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save(@RequestBody Cliente client) {
        return servicio.save(client);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente update(@RequestBody Cliente client) {
        return servicio.update(client);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int clientId) {
        return servicio.deleteClient(clientId);
    }
}

