package co.usa.ciclo3.ciclo3_.repositorio;


import co.usa.ciclo3.ciclo3_.interfaz.InterfaceCloud;
import co.usa.ciclo3.ciclo3_.model.Cloud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioCloud {

    @Autowired
    private InterfaceCloud crud;

    public List<Cloud> getAll(){
        return (List<Cloud>) crud.findAll();
    }

    public Optional<Cloud> getCloud(int id){
        return crud.findById(id);
    }

    public Cloud save(Cloud cloud){
        return crud.save(cloud);
    }
    public void delete(Cloud cloud){crud.delete(cloud);
    }

}


