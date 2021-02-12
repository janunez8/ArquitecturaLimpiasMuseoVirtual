package Adaptadores;

import Domain.ILogeoXUsuario;
import Domain.Entidades.Cuenta;
import Persistencia.IOperacionDBCuenta;

import Persistencia.RepositorioCuenta;

public class LogeoPortInt {

    ILogeoXUsuario logeoXUsuario;
    IOperacionDBCuenta operacionCuenta;

    public RepositorioCuenta repositorioCuenta;

    public LogeoPortInt(ILogeoXUsuario iLogeoXUsuario, IOperacionDBCuenta operacionCuenta) {
        this.logeoXUsuario = iLogeoXUsuario;
        this.operacionCuenta = operacionCuenta;
    }

    public int RegistrarCuenta(Cuenta cuenta) {
        return this.logeoXUsuario.Registrar(cuenta);

    }

}
