package org.uv.mavencrud;

import java.util.List;

/**
 *
 * @author dnieln7
 */
public interface interfaceDAO<T, V>
{
    public boolean insert(T entity);
    public boolean update(T entity);
    public boolean delete(V id);
    public T find(V id);
    public List<T> findAll();
}
