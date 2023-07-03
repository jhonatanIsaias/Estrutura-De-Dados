package tiposAbstratosDeDados.filas;

public abstract class Fila<T> {
    abstract void enfileirar(T dado) throws Exception;
    abstract T desenfileirar() throws Exception;


}
