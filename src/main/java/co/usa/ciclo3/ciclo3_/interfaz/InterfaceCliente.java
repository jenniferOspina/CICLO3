package co.usa.ciclo3.ciclo3_.interfaz;

import co.usa.ciclo3.ciclo3_.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {
}
