package fr.uga.l3miage.photonum.impression;

import fr.uga.l3miage.photonum.data.domain.Impression;
import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.processing.Generated;
import main.java.fr.uga.l3miage.photonum.data.Enum.TypeImpression;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-03T00:54:48+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class ImpressionMapperImpl implements ImpressionMapper {

    @Override
    public ImpressionDTO entityToDTO(Impression impression) {
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

    @Override
    public Collection<ImpressionDTO> entityToDTO(Iterable<Impression> impression) {
        if ( impression == null ) {
            return null;
        }

        Collection<ImpressionDTO> collection = new ArrayList<ImpressionDTO>();
        for ( Impression impression1 : impression ) {
            collection.add( entityToDTO( impression1 ) );
        }

        return collection;
    }

    @Override
    public Impression dtoToEntity(ImpressionDTO impression) {
        if ( impression == null ) {
            return null;
        }

        Impression impression1 = new Impression();

        if ( impression.id() != null ) {
            impression1.setId( impression.id() );
        }
        impression1.setTypeImpression( impression.typeImpression() );

        return impression1;
    }

    @Override
    public Collection<Impression> dtoToEntity(Iterable<ImpressionDTO> impression) {
        if ( impression == null ) {
            return null;
        }

        Collection<Impression> collection = new ArrayList<Impression>();
        for ( ImpressionDTO impressionDTO : impression ) {
            collection.add( dtoToEntity( impressionDTO ) );
        }

        return collection;
    }
}
