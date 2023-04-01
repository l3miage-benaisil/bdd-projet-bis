package fr.uga.l3miage.photonum.data.repo;

import fr.uga.l3miage.photonum.data.domain.Photo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PhotoRepository implements CRUDRepository<Long, Photo> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Photo save(Photo photo) {
        entityManager.persist(photo);
        return photo;
    }

    @Override
    public Photo get(Long id) {
        return entityManager.find(Photo.class, id);
    }

    @Override
    public void delete(Photo photo) {
        entityManager.remove(photo);
    }


    @Override
    public List<Photo> all() {
        return null;
    }

}
