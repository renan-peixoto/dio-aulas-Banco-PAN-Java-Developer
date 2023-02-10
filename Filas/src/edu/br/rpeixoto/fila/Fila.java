package edu.br.rpeixoto.fila;

public class Fila {
  private No refNoEntradaFila;

  public Fila() {
    this.refNoEntradaFila = null;
  }

  public boolean isEmpty() {
    return refNoEntradaFila == null ? true : false;
  }

  public void enqueue(No novoNo) {
    novoNo.setRefNo(refNoEntradaFila); // a referência ao próximo nó do novo nó é definida como a referência ao nó de
                                       // entrada da fila atual. Isso significa que o novo nó aponta para o nó
                                       // anteriormente primeiro na fila.
    refNoEntradaFila = novoNo; // a referência ao nó de entrada da fila é atualizada para o novo nó. Isso
                               // significa que o novo nó é agora o primeiro elemento na fila.
  }

  public No first() {
    if (!this.isEmpty()) { // verifica-se se a fila está vazia. Se a fila estiver vazia, o método retornará
                           // null
      No primeiroNo = refNoEntradaFila; // a referência ao nó de entrada da fila é atribuída a uma variável local
                                        // chamada primeiroNo.
      while (true) { // Inicia-se um loop infinito.
        if (primeiroNo.getRefNo() != null) { // verifica-se se há um próximo nó após o primeiroNo. Se houver, o método
                                             // continua para a próxima iteração do loop.
          primeiroNo = primeiroNo.getRefNo(); // a referência ao próximo nó é atribuída a primeiroNo. Isso significa que
                                              // primeiroNo agora se refere ao próximo nó na fila.
        } else {
          break;
        }
      }
      return primeiroNo; // Retorna o valor de primeiroNo, que representa o primeiro elemento na fila.

    }
    return null;

  }

  public No dequeue() {
    if (!this.isEmpty()) { // verificação para saber se a fila está vazia. Se a fila estiver vazia, o
                           // método retorna null
      No primeiroNo = refNoEntradaFila; // Cria uma variável local primeiroNo e a inicializa com a referência ao nó de
                                        // entrada da fila, armazenada na variável de instância refNoEntradaFila.
      No noAuxiliar = refNoEntradaFila;
      while (true) { // loop infinito
        if (primeiroNo.getRefNo() != null) {
          noAuxiliar = primeiroNo; // Se o próximo nó referenciado por primeiroNo não é null, a variável noAuxiliar
                                   // é atualizada para ter a referência ao nó referenciado por primeiroNo.
          primeiroNo = primeiroNo.getRefNo(); // Atualiza a variável primeiroNo para ter a referência ao próximo nó.
        } else { // Se o próximo nó referenciado por primeiroNo for null.
          noAuxiliar.setRefNo(null); // A referência do nó referenciado por noAuxiliar é redefinida como null.
          break;
        }
      }
      return primeiroNo; // O método retorna o nó referenciado por primeiroNo, que é o primeiro nó da
                         // fila.
    }
    return null; // Se a fila estiver vazia, o método retorna null.

  }

  @Override
  public String toString() {
    String stringRetorno = "";
    No noAuxiliar = refNoEntradaFila;
    if (refNoEntradaFila != null) {
      while (true) {
        stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
        if (noAuxiliar.getRefNo() != null) {
          noAuxiliar = noAuxiliar.getRefNo();
        } else {
          stringRetorno += "null";
          break;
        }
      }
    } else {
      stringRetorno = null;
    }

    return stringRetorno;
  }

}
