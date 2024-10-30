package org.isyel.clinicaalura.Controller;

import org.isyel.clinicaalura.Entities.Medico.Medico;
import org.isyel.clinicaalura.Entities.Medico.MedicoJpa;
import org.isyel.clinicaalura.Repositori.MedicoRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepositori medicoRepositori;

    @PostMapping
    public void regitrarMedico(@RequestBody Medico medico) {
        medicoRepositori.save(new MedicoJpa(medico));
    }

}
