package org.isyel.clinicaalura.Entities.Direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

@Embeddable
public class DireccionJpa {
    private String calle;
    private String distrito;
    private String ciudad ;
    private String numero;
    private String complemento;

    public DireccionJpa(Direccion direccion) {
        this.calle= direccion.calle();
        this.distrito= direccion.distrito();
        this.ciudad= direccion.ciudad();
        this.numero= direccion.numero();
        this.complemento= direccion.complemento();
    }

}
