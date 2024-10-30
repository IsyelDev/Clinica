package org.isyel.clinicaalura.Entities.Medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.isyel.clinicaalura.Entities.Direccion.Direccion;
import org.isyel.clinicaalura.Entities.Direccion.DireccionJpa;

@Data
@Entity
@Table(name = "medico")
@AllArgsConstructor
@NoArgsConstructor

public class MedicoJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Cambiado a Long para el ID
    private String nombre;
    private String email;
    private String documento;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Embedded
    private DireccionJpa direccion;

    public MedicoJpa(Medico medico) {
        this.nombre = medico.nombre();
        this.email = medico.email();
        this.documento = medico.documento();
        this.especialidad = medico.especialidad();
        this.direccion = new DireccionJpa(medico.direccion());
    }
}
