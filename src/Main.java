//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    GestorAuditoria gestor = new GestorAuditoria();

    LogArchivoLocal archivo = new LogArchivoLocal();
    LogBaseDatos baseDatos = new LogBaseDatos();
    LogServicioNube nube = new LogServicioNube();

    String nivel = "CRITICO";
    String mensaje = "Error en el servidor principal.";

    gestor.enviarArchivo(archivo, nivel, mensaje);
    gestor.enviarBaseDatos(baseDatos, nivel, mensaje);
    gestor.enviarNube(nube, nivel, mensaje);
    
}
