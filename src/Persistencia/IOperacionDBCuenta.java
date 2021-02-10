package Persistencia;


public interface IOperacionDBCuenta {
    void InsertarCuenta();

    void ComprobarExistencia(String usuario, String contraseña);

}
