package Domain.CasosDeUso;

import Domain.Entidades.Cuenta;


public class RegistrarCuenta extends IniciarCuenta {
    public void registrarCuenta(Cuenta cuenta) {
        if (cuenta.comprobarExistenciaUser(cuenta.getUsuario(), cuenta.getCorreo())) {
            System.out.println("Datos enviados correctamente :" + cuenta.getNombre() + " - " + cuenta.getUsuario() + " - " + cuenta.getCorreo() + "");
        } else {
            System.out.println("El email o login ya ha sido registrado. Por favor escriba otros datos");
        }
    }

}
