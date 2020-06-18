package br.com.crud.crudgenerico.temperatura;

import br.com.crud.crudgenerico.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TemperaturaServiceImpl extends CrudServiceImpl<Temperatura, Long> implements TemperaturaService {

    @Autowired
    private TemperaturaRepository temperaturaRepository;

    @Override
    protected JpaRepository<Temperatura, Long> getRepository() {
        return temperaturaRepository;
    }
}
