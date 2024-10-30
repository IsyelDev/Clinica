package org.isyel.clinicaalura.Entities.Medico;

import org.isyel.clinicaalura.Entities.Direccion.Direccion;

public record Medico(String nombre, String email, String documento, Especialidad especialidad, Direccion direccion) {


}

