package tiposAbstratosDeDados.Pilhas.PilhaSequencialInfinita;

import tiposAbstratosDeDados.Pilhas.PilhaCheiaException;

public class main {
    public static void main(String[] args) throws PilhaCheiaException {
        PilhaInfinita<Integer> pilhaInfinita = new PilhaInfinita(Integer.class,4);
        pilhaInfinita.empilhar(1);
        pilhaInfinita.empilhar(2);
        pilhaInfinita.empilhar(3);
        pilhaInfinita.empilhar(4);
        pilhaInfinita.empilhar(5);
    }
}
