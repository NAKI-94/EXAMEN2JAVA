package co.com.ps.C22JA.error;

public class UsusarioErrorMessage extends RuntimeException {

    UsusarioErrorMessage(String mensaje){
        super("Error en Usuario"+mensaje);
    }
}
