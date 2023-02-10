package edu.br.rpeixoto.pilha;

public class Pilha {
  private No refNoEntradaPilha; // nó de referência

  public Pilha() {
    this.refNoEntradaPilha = null; // dizer que a referencia é nula
  }

  public No tirar() {
    if (!this.estaVazio()) {
      No noRetirado = refNoEntradaPilha; // quarda o nó retirado
      refNoEntradaPilha = refNoEntradaPilha.getRefNo(); // referencia de nó agora é um nó que estava abaixo dele
      return noRetirado;
    }
    return null;
  }

  /**
   * Adiciona um novo nó ao topo da pilha, fazendo o novo nó apontar para o antigo
   * topo da pilha e tornando o antigo topo da pilha o próximo nó abaixo do novo
   * nó.
   * 
   * @param novoNo novo nó que vai servir como referencia ao antigo topo da pilha.
   */
  public void colocar(No novoNo) {
    No refAuxiliar = refNoEntradaPilha; // Guarda a referência atual de entrada na pilha em uma variável temporária.
    refNoEntradaPilha = novoNo; // Atribui a referência de entrada da pilha para o novo nó passado como
                                // parâmetro.
    novoNo.setRefNo(refAuxiliar); // Atribui a referência anterior de entrada da pilha guardada na variável
                                  // temporária como a referência para o próximo nó abaixo no novo nó.

  }

  /**
   * @return retorna a referência de entrada da pilha, que representa o nó no topo
   *         da pilha.
   */
  public No cima() {
    return refNoEntradaPilha;
  }

  /**
   * verifica se a referencia está vazia
   * 
   * @return retorna true ou false
   */
  public boolean estaVazio() {
    return refNoEntradaPilha == null ? true : false;
  }

  @Override
  public String toString() {

    String stringRetorno = "----------------\n";
    stringRetorno += "Pilha\n";
    stringRetorno += "----------------\n";

    No noAuxiliar = refNoEntradaPilha; // recebe a referência ao nó de entrada da pilha.

    while (true) { // O objetivo deste laço é percorrer todos os nós da pilha, a partir do nó de
                   // entrada, até chegar ao final da pilha.
      if (noAuxiliar != null) { // verifica-se se o objeto noAuxiliar é diferente de nulo. Se for verdadeiro,
                                // significa que ainda existem nós na pilha que precisam ser percorridos.
        stringRetorno += "[No{dado = " + noAuxiliar.getDado() + "}]\n"; // É concatenado à string stringRetorno a
                                                                        // representação do nó atual, no formato
                                                                        // "[No{dado = valorDoDado}]\n". Aqui, o método
                                                                        // getDado() é usado para recuperar o valor
                                                                        // armazenado no dado deste nó.
        noAuxiliar = noAuxiliar.getRefNo(); // é atualizado o valor de noAuxiliar para ser a referência para o próximo
                                            // nó na pilha (recuperada com o método getRefNo()).
      } else {
        break; // Se não existir, o objeto noAuxiliar será nulo e o laço será encerrado
               // (break).
      }
    }
    stringRetorno += "===============\n";
    return stringRetorno; // retorna o valor da string stringRetorno. Esta string representa uma
                          // representação em formato de string da pilha.
  }

}
