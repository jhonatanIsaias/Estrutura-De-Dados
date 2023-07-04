package tiposAbstratosDeDados.Pilhas;

public interface Pilha<T> {
     void empilhar(T elemento) throws PilhaCheiaException;
     T desempilhar() throws PilhaVaziaException;
     T getTopo() throws PilhaVaziaException;
     int getQtd();
     boolean estaVazia();
}
