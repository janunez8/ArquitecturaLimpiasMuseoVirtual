package Domain;

import Domain.Entidades.Cuenta;


public interface ILogeoXUsuario {
    void Logear(Cuenta cuenta);

    boolean VerificarCorreoExistente(Cuenta cuenta);

}
