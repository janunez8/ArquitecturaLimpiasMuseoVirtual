package Domain;

import Domain.Entidades.Cuenta;
import Persistencia.IOperacionDBCuenta;

public interface ILogeoXUsuario {

    void Logear(Cuenta cuenta);

    int Registrar(Cuenta cuenta);

    boolean VerificarCorreoExistente(String user, String contraseña);

}
