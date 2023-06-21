package tiposAbstratosDeDados.Pilhas;

public interface Pilha<T> {
     void empilhar(T elemento) throws Exception;
     T desempilhar() throws Exception;
     T getTopo() throws Exception;
     int getQtd();
     boolean estaVazia();
}
