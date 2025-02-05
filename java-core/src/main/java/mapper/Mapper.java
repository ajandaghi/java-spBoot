package mapper;

@org.mapstruct.Mapper
public interface Mapper<E,D> {


    Entity<E> dTO2entity(DTO<D> dto);
    DTO<D> entity2DTO(Entity<E> entity);
}
