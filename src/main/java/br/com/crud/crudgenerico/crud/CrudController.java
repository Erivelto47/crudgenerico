package br.com.crud.crudgenerico.crud;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

public abstract class CrudController<T, ID extends Serializable> {

    public abstract CrudService<T, ID> getService();

    @PostMapping
    public ResponseEntity<T> save(@Valid @RequestBody T entity) {
        return ResponseEntity.ok(getService().save(entity));
    }

    @GetMapping
    public List<T> findAll() {
        return getService().findAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable ID id) {
        getService().delete(id);
    }
}
