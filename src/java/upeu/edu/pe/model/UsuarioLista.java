package upeu.edu.pe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UsuarioLista {
    private int idusuario;
    private String username;
    private String password;
    private int idpersona; 
    private String nombrepersona;
    private String apellido;
    private String nombrerol;
}
