package upeu.edu.pe.sw;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import upeu.edu.pe.dao.UsuarioDao;
import upeu.edu.pe.daoImpl.UsuarioDaoImpl;
import upeu.edu.pe.model.Usuario;
import upeu.edu.pe.model.UsuarioLista;


@WebService(serviceName = "UsuarioSW")
public class UsuarioSW {
 UsuarioDao usuarioDao=new UsuarioDaoImpl();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
     @WebMethod(operationName = "insertar")
    public int insertar(@WebParam(name = "user") String usuario,@WebParam(name = "password") String password,@WebParam(name = "idpersona") int idpersona,@WebParam(name = "idrol") int idrol) {
        //TODO write your implementation code here:
        return usuarioDao.create(new Usuario(0,usuario,password,idpersona,idrol,"",true));
    }
    
      @WebMethod(operationName = "readall")
    public List<UsuarioLista> readallpersona() {
        //TODO write your implementation code here:
        return usuarioDao.readAll();
    }
    @WebMethod(operationName = "editar")
    public int editar(@WebParam(name = "id") int id, @WebParam(name = "user") String user,@WebParam(name = "pass") String pass,@WebParam(name = "estado") boolean estado) {
        //TODO write your implementation code here:
        return usuarioDao.update(new Usuario(id,user,pass,0,0,"",estado));
    }
         @WebMethod(operationName = "eliminar")
    public int eliminar(@WebParam(name = "id") final int id) {
        //TODO write your implementation code here:
        return usuarioDao.delete(id);
    }
        @WebMethod(operationName = "validarusuario")
        public UsuarioLista read(@WebParam(name = "user") String user) {
        //TODO write your implementation code here:
        return usuarioDao.read(user);
    }
    
}
