package fr.uga.l3miage.photonum.data.repo;

import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.data.domain.Impression;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ImpressionRepository implements CRUDRepository<Long, Impression> {

    @PersistenceContext
    private EntityManager entityManager;

    private ClientRepository clientRepository;
    @Override
    public Impression save(Impression impression) {
        entityManager.persist(impression);
        return impression;
    }

    @Override
    public Impression get(Long id) {
        return entityManager.find(Impression.class, id);
    }


    @Override
    public void delete(Impression impression) {
        entityManager.remove(impression);
    }


    @Override
    public List<Impression> all() {
        return null;
    }

     
    public Impression newImpressionClientId(Long id, Impression impression){
        Client client = clientRepository.get(id);
        client.addImpression(impression);
        entityManager.persist(impression);

        return impression;
    }
}
