package Domain.CasosDeUso;

import Domain.Entidades.Cuenta;
import Domain.ILogeoXUsuario;

public class IniciarCuenta implements ILogeoXUsuario {
    public void LogearXUsuario() {
        
    }

    @Override
    public void Logear(Cuenta cuenta) {
        if(VerificarCorreoExistente(cuenta)){
            System.out.println("Logeado");
        }
    }

    public boolean VerificarCorreoExistente(Cuenta cuenta) {
        String loginExistente = "milogin";
        String emailExistente = "miemail";
        return !loginExistente.equals(cuenta.getUsuario())&&!emailExistente.equals(cuenta.getCorreo());
    }

}
