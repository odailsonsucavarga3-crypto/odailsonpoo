package pe.edu.upeu.sysventas.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface ICrudGenericoRepository    <T, ID >{
    T save (ID entity);
    T  update( T entity );
    Optional<T> findById(ID entity);
    List<T> findAll();
    void deleteById(ID id);
    boolean existsById(ID id);




}
