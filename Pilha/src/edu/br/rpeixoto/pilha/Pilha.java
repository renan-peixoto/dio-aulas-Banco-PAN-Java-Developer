package edu.br.rpeixoto.pilha;

public class Pilha {
  private No refNoEntradaPilha; // nó de referência

  public Pilha() {
    this.refNoEntradaPilha = null; // dizer que a referencia é nula
  }

  public No tirar() {
    if ((!this.estaVazio())) {
      No noRetirado = refNoEntradaPilha; // quarda o nó retirado
      refNoEntradaPilha = refNoEntradaPilha.getRefNo(); // referencia de nó agora é um nó que estava abaixo dele
      return noRetirado;
    }
    return null;
  }

  /**
   * @param novoNo novo nó que vai servir como referencia ao antigo topo
   */
  public void colocar(No novoNo) {
    No refAuxiliar = refNoEntradaPilha; // vai guardar a referencia de entrada
    refNoEntradaPilha = novoNo; // referencia da entrada da pilha é o novo nó & novoNo vira uma referencia ao
                                // mesmo objeto
    novoNo.setRefNo(refAuxiliar);

  }

  /**
   * @return retorna a referencia
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
    return refNoEntradaPilha != null ? true : false;
  }

}
