package mapper;

import org.mapstruct.factory.Mappers;
import org.modelmapper.ModelMapper;

public class MapperTester {
    public static void main(String[] args) {
      //  Mapping<Entity,DTO> map= Mappers.getMapper( Mapping.class );
        ModelMapper modelMapper = new ModelMapper();

        Entity ent=new Entity(10L,"ali");
       DTO dto= modelMapper.map(ent,DTO.class);
       Entity ent0=modelMapper.map(dto,Entity.class);
        System.out.println(dto);
    }
}
