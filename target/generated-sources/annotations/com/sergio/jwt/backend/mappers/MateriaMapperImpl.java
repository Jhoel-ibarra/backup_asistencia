package com.sergio.jwt.backend.mappers;

import com.sergio.jwt.backend.dtos.MateriaDto;
import com.sergio.jwt.backend.entites.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-08T00:40:08-0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
@Component
public class MateriaMapperImpl implements MateriaMapper {

    @Override
    public Materia toMateria(MateriaDto materiaDto) {
        if ( materiaDto == null ) {
            return null;
        }

        Materia.MateriaBuilder materia = Materia.builder();

        materia.id( materiaDto.getId() );
        materia.sigla( materiaDto.getSigla() );
        materia.name( materiaDto.getName() );

        return materia.build();
    }

    @Override
    public MateriaDto toMateriaDto(Materia materia) {
        if ( materia == null ) {
            return null;
        }

        MateriaDto.MateriaDtoBuilder materiaDto = MateriaDto.builder();

        materiaDto.id( materia.getId() );
        materiaDto.sigla( materia.getSigla() );
        materiaDto.name( materia.getName() );

        return materiaDto.build();
    }

    @Override
    public List<MateriaDto> toMateriaDtos(List<Materia> materias) {
        if ( materias == null ) {
            return null;
        }

        List<MateriaDto> list = new ArrayList<MateriaDto>( materias.size() );
        for ( Materia materia : materias ) {
            list.add( toMateriaDto( materia ) );
        }

        return list;
    }

    @Override
    public void updateMateria(Materia target, Materia materiaDto) {
        if ( materiaDto == null ) {
            return;
        }

        target.setId( materiaDto.getId() );
        target.setSigla( materiaDto.getSigla() );
        target.setName( materiaDto.getName() );
    }
}
