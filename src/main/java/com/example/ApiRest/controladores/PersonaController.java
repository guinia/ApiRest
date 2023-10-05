package com.example.ApiRest.controladores;

import com.example.ApiRest.entidades.Persona;
import com.example.ApiRest.servicios.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{


}
