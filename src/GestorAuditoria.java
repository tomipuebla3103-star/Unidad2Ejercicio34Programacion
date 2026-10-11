public class GestorAuditoria {
    public void enviarArchivo(LogArchivoLocal archivo, String nivel, String mensaje) {
        archivo.guardarRegistro(nivel, mensaje);
    }

    public void enviarBaseDatos(LogBaseDatos baseDatos, String nivel, String mensaje) {
        baseDatos.guardarRegistro(nivel, mensaje);
    }

    public void enviarNube(LogServicioNube nube, String nivel, String mensaje) {
        nube.guardarRegistro(nivel, mensaje);
    }
}
