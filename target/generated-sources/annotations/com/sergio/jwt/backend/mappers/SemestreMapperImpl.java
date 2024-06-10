package com.sergio.jwt.backend.mappers;

import com.sergio.jwt.backend.dtos.SemestreDto;
import com.sergio.jwt.backend.entites.Materia;
import com.sergio.jwt.backend.entites.Semestre;
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
public class SemestreMapperImpl implements SemestreMapper {

    @Override
    public Semestre toSemestre(SemestreDto semestreDto) {
        if ( semestreDto == null ) {
            return null;
        }

        Semestre.SemestreBuilder semestre = Semestre.builder();

        semestre.id( semestreDto.getId() );
        semestre.nivel( semestreDto.getNivel() );
        semestre.descripcion( semestreDto.getDescripcion() );

        return semestre.build();
    }

    @Override
    public SemestreDto toSemestreDto(Semestre semestre) {
        if ( semestre == null ) {
            return null;
        }

        SemestreDto.SemestreDtoBuilder semestreDto = SemestreDto.builder();

        semestreDto.id( semestre.getId() );
        semestreDto.nivel( semestre.getNivel() );
        semestreDto.descripcion( semestre.getDescripcion() );

        return semestreDto.build();
    }

    @Override
    public List<SemestreDto> toSemestresDtos(List<Semestre> semestres) {
        if ( semestres == null ) {
            return null;
        }

        List<SemestreDto> list = new ArrayList<SemestreDto>( semestres.size() );
        for ( Semestre semestre : semestres ) {
            list.add( toSemestreDto( semestre ) );
        }

        return list;
    }

    @Override
    public void updateSemestre(Semestre target, Semestre semestreDto) {
        if ( semestreDto == null ) {
            return;
        }

        target.setId( semestreDto.getId() );
        target.setNivel( semestreDto.getNivel() );
        target.setDescripcion( semestreDto.getDescripcion() );
        if ( target.getMaterias() != null ) {
            List<Materia> list = semestreDto.getMaterias();
            if ( list != null ) {
                target.getMaterias().clear();
                target.getMaterias().addAll( list );
            }
            else {
                target.setMaterias( null );
            }
        }
        else {
            List<Materia> list = semestreDto.getMaterias();
            if ( list != null ) {
                target.setMaterias( new ArrayList<Materia>( list ) );
            }
        }
    }
}
