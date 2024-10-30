package org.isyel.clinicaalura.Repositori;

import org.isyel.clinicaalura.Entities.Medico.Medico;
import org.isyel.clinicaalura.Entities.Medico.MedicoJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepositori extends JpaRepository<MedicoJpa, Long> {

}
