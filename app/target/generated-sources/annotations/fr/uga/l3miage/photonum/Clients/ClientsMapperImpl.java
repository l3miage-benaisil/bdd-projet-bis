package fr.uga.l3miage.photonum.Clients;

import fr.uga.l3miage.photonum.Adresse.AdresseDTO;
import fr.uga.l3miage.photonum.data.domain.Adresse;
import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.data.domain.Impression;
import fr.uga.l3miage.photonum.impression.ImpressionDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.processing.Generated;
import main.java.fr.uga.l3miage.photonum.data.Enum.TypeImpression;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-03T00:54:48+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class ClientsMapperImpl implements ClientsMapper {

    @Override
    public ClientsDTO entityToDTO(Client client) {
        if ( client == null ) {
            return null;
        }

        Long id = null;
        String mail = null;
        String nom = null;
        String prenom = null;
        String motDePasse = null;
        Collection<AdresseDTO> adresses = null;
        Collection<ImpressionDTO> impressions = null;

        id = client.getId();
        mail = client.getMail();
        nom = client.getNom();
        prenom = client.getPrenom();
        motDePasse = client.getMotDePasse();
        adresses = adresseListToAdresseDTOCollection( client.getAdresses() );
        impressions = impressionListToImpressionDTOCollection( client.getImpressions() );

        ClientsDTO clientsDTO = new ClientsDTO( id, mail, nom, prenom, motDePasse, adresses, impressions );

        return clientsDTO;
    }

    @Override
    public Collection<ClientsDTO> entityToDTO(Iterable<Client> clients) {
        if ( clients == null ) {
            return null;
        }

        Collection<ClientsDTO> collection = new ArrayList<ClientsDTO>();
        for ( Client client : clients ) {
            collection.add( entityToDTO( client ) );
        }

        return collection;
    }

    @Override
    public Client dtoToEntity(ClientsDTO client) {
        if ( client == null ) {
            return null;
        }

        Client client1 = new Client();

        client1.setAdresses( adresseDTOCollectionToAdresseList( client.adresses() ) );
        if ( client.id() != null ) {
            client1.setId( client.id() );
        }
        client1.setImpressions( impressionDTOCollectionToImpressionList( client.impressions() ) );
        client1.setMail( client.mail() );
        client1.setMotDePasse( client.motDePasse() );
        client1.setNom( client.nom() );
        client1.setPrenom( client.prenom() );

        return client1;
    }

    @Override
    public Collection<Client> dtoToEntity(Iterable<ClientsDTO> client) {
        if ( client == null ) {
            return null;
        }

        Collection<Client> collection = new ArrayList<Client>();
        for ( ClientsDTO clientsDTO : client ) {
            collection.add( dtoToEntity( clientsDTO ) );
        }

        return collection;
    }

    protected AdresseDTO adresseToAdresseDTO(Adresse adresse) {
        if ( adresse == null ) {
            return null;
        }

        Long id = null;
        int numeroRue = 0;
        String rue = null;
        String ville = null;
        String codePostal = null;
        String pays = null;

        id = adresse.getId();
        numeroRue = adresse.getNumeroRue();
        rue = adresse.getRue();
        ville = adresse.getVille();
        codePostal = adresse.getCodePostal();
        pays = adresse.getPays();

        AdresseDTO adresseDTO = new AdresseDTO( id, numeroRue, rue, ville, codePostal, pays );

        return adresseDTO;
    }

    protected Collection<AdresseDTO> adresseListToAdresseDTOCollection(List<Adresse> list) {
        if ( list == null ) {
            return null;
        }

        Collection<AdresseDTO> collection = new ArrayList<AdresseDTO>( list.size() );
        for ( Adresse adresse : list ) {
            collection.add( adresseToAdresseDTO( adresse ) );
        }

        return collection;
    }

    protected ImpressionDTO impressionToImpressionDTO(Impression impression) {
        if ( impression == null ) {
            return null;
        }

        Long id = null;
        TypeImpression typeImpression = null;

        id = impression.getId();
        typeImpression = impression.getTypeImpression();

        ImpressionDTO impressionDTO = new ImpressionDTO( id, typeImpression );

        return impressionDTO;
    }

    protected Collection<ImpressionDTO> impressionListToImpressionDTOCollection(List<Impression> list) {
        if ( list == null ) {
            return null;
        }

        Collection<ImpressionDTO> collection = new ArrayList<ImpressionDTO>( list.size() );
        for ( Impression impression : list ) {
            collection.add( impressionToImpressionDTO( impression ) );
        }

        return collection;
    }

    protected Adresse adresseDTOToAdresse(AdresseDTO adresseDTO) {
        if ( adresseDTO == null ) {
            return null;
        }

        Adresse adresse = new Adresse();

        adresse.setCodePostal( adresseDTO.codePostal() );
        if ( adresseDTO.id() != null ) {
            adresse.setId( adresseDTO.id() );
        }
        adresse.setNumeroRue( adresseDTO.numeroRue() );
        adresse.setPays( adresseDTO.pays() );
        adresse.setRue( adresseDTO.rue() );
        adresse.setVille( adresseDTO.ville() );

        return adresse;
    }

    protected List<Adresse> adresseDTOCollectionToAdresseList(Collection<AdresseDTO> collection) {
        if ( collection == null ) {
            return null;
        }

        List<Adresse> list = new ArrayList<Adresse>( collection.size() );
        for ( AdresseDTO adresseDTO : collection ) {
            list.add( adresseDTOToAdresse( adresseDTO ) );
        }

        return list;
    }

    protected Impression impressionDTOToImpression(ImpressionDTO impressionDTO) {
        if ( impressionDTO == null ) {
            return null;
        }

        Impression impression = new Impression();

        if ( impressionDTO.id() != null ) {
            impression.setId( impressionDTO.id() );
        }
        impression.setTypeImpression( impressionDTO.typeImpression() );

        return impression;
    }

    protected List<Impression> impressionDTOCollectionToImpressionList(Collection<ImpressionDTO> collection) {
        if ( collection == null ) {
            return null;
        }

        List<Impression> list = new ArrayList<Impression>( collection.size() );
        for ( ImpressionDTO impressionDTO : collection ) {
            list.add( impressionDTOToImpression( impressionDTO ) );
        }

        return list;
    }
}
