package upeu.edu.pe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Usuario {
    private int idusuario;
    private int idpersona;
    private int idrol;
    private String username;
    private String password;    
    private String fecha;
    private boolean estado;  

    public Usuario(int i, String usuario, String password, int idpersona, int idrol, String string, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public boolean getEstado() {
		return this.estado;
	}          
}
