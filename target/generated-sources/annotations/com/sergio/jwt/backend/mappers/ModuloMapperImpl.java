package com.sergio.jwt.backend.mappers;

import com.sergio.jwt.backend.dtos.ModuloDto;
import com.sergio.jwt.backend.entites.Modulo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-07T11:57:45-0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
@Component
public class ModuloMapperImpl implements ModuloMapper {

    @Override
    public Modulo toModulo(ModuloDto moduloDto) {
        if ( moduloDto == null ) {
            return null;
        }

        Modulo.ModuloBuilder modulo = Modulo.builder();

        modulo.id( (int) moduloDto.getId() );
        modulo.name( moduloDto.getName() );

        return modulo.build();
    }

    @Override
    public ModuloDto toModuloDto(Modulo modulo) {
        if ( modulo == null ) {
            return null;
        }

        ModuloDto.ModuloDtoBuilder moduloDto = ModuloDto.builder();

        moduloDto.id( modulo.getId() );
        moduloDto.name( modulo.getName() );

        return moduloDto.build();
    }

    @Override
    public List<ModuloDto> toModuloDtos(List<Modulo> modulos) {
        if ( modulos == null ) {
            return null;
        }

        List<ModuloDto> list = new ArrayList<ModuloDto>( modulos.size() );
        for ( Modulo modulo : modulos ) {
            list.add( toModuloDto( modulo ) );
        }

        return list;
    }

    @Override
    public void updateModulo(Modulo target, Modulo moduloDto) {
        if ( moduloDto == null ) {
            return;
        }

        target.setId( moduloDto.getId() );
        target.setName( moduloDto.getName() );
    }
}
