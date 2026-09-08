package pe.edu.upeu.sysventas;

import pe.edu.upeu.sysventas.repository.ICrudGenericoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public abstract class AbstractJpaRepository<T, ID>
    implements ICrudGenericoRepository<T,ID>{
    protected final List<T> data=new ArrayList<>();
    protected abstract ID generateId();

    @Override
    public T save (ID entity) {
        return null;
    }

    @Override
    public T update(T entity) {
        return null;
    }

    @Override
    public Optional<T> findById(ID entity) {
        return Optional.empty();
    }

    @Override
    public List<T> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(ID id) {

    }

    @Override
    public boolean existsById(ID id) {
        return false;
    }
}










}
