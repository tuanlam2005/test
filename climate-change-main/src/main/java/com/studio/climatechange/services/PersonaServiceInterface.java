package com.studio.climatechange.services;

import com.studio.climatechange.dto.PersonaDto;
import com.studio.climatechange.dto.StudentDto;

import java.util.List;

public interface PersonaServiceInterface {
    List<PersonaDto> findAllPersonas();

}
