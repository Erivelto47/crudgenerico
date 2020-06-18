package br.com.crud.crudgenerico.temperatura;

import br.com.crud.crudgenerico.crud.CrudController;
import br.com.crud.crudgenerico.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/temperatura")
public class TemperaturaController extends CrudController<Temperatura, Long> {

    @Autowired
    private TemperaturaService temperaturaService;

    @Override
    public CrudService<Temperatura, Long> getService() {
        return temperaturaService;
    }
}
