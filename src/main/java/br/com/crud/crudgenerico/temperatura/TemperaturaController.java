package br.com.crud.crudgenerico.temperatura;

import br.com.crud.crudgenerico.crud.CrudController;
import br.com.crud.crudgenerico.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temperatura")
public class TemperaturaController extends CrudController<Temperatura, Long> {

    @Autowired
    private TemperaturaService temperaturaService;

    @Override
    public CrudService<Temperatura, Long> getService() {
        return temperaturaService;
    }
}
