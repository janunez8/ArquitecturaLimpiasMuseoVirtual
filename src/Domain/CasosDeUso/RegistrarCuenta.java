package Domain.CasosDeUso;

import Domain.Entidades.Cuenta;
import Domain.ILogeoXUsuario;
import Persistencia.IOperacionDBCuenta;

public class RegistrarCuenta implements ILogeoXUsuario {

    IOperacionDBCuenta operacionCuenta;

    public RegistrarCuenta(IOperacionDBCuenta operacionCuenta) {
        this.operacionCuenta = operacionCuenta;
    }

    @Override
    public void Logear(Cuenta cuenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Registrar(Cuenta cuenta) {
        Cuenta objCue = cuenta;

        if (!VerificarCorreoExistente(cuenta.getUsuario(), cuenta.getCorreo())) {
            //Insertar cuenta
            Persistencia.Cuenta objCuenrepo = new Persistencia.Cuenta();
            objCuenrepo.setNombre(cuenta.getNombre());
            objCuenrepo.setApellido(cuenta.getApellido());
            objCuenrepo.setCorreo(cuenta.getCorreo());
            objCuenrepo.setUsuario(cuenta.getUsuario());
            objCuenrepo.setContraseña(cuenta.getContraseña());

            objCuenrepo.setId(1);
            operacionCuenta.InsertarCuenta(objCue);
            return 1;
        }
        return -1;
    }

    @Override
    public boolean VerificarCorreoExistente(String user, String correo) {
        return operacionCuenta.ComprobarExistencia(user, correo);
    }

}
