package handle;

import entity.Library;

public interface Service<T> {
    void insert(T object, Library library);

    void delete(T object, Library library);

    void update(T object, Library library);
}
