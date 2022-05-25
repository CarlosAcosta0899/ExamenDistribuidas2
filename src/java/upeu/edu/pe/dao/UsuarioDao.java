
package upeu.edu.pe.dao;

import java.util.List;
import upeu.edu.pe.model.Usuario;
import upeu.edu.pe.model.UsuarioLista;

public interface UsuarioDao {
    int create(Usuario usuario);
    int delete(int id);
    int update(Usuario usuario);    
    UsuarioLista read(String user);
    List<UsuarioLista> readAll();
}
