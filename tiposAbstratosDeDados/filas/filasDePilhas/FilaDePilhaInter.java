package tiposAbstratosDeDados.filas.filasDePilhas;

public abstract class FilaDePilhaInter<PilhaEncadeada> {
    abstract void enfileirar(PilhaEncadeada dado) throws Exception;
    abstract PilhaEncadeada desenfileirar() throws Exception;

}
