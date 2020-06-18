package br.com.crud.crudgenerico.crud;

import java.io.Serializable;
import java.util.List;

public interface CrudService<T, ID extends Serializable> {

    List<T> findAll();//qualquer metodo na interface é publico, no java 11 aceita privados, mas com implementação

    T save(T entity);

    void delete(ID id);

    void delete(T entity);
}
