package edu.br.rpeixoto.listaencadeada;

public class ListaEncadeada<T> {

  No<T> referenciaDeEntrada;

  public ListaEncadeada() {
    this.referenciaDeEntrada = null;
  }

  /**
   * @param index
   * @return retorna um nó específico da lista encadeada baseado em um índice
   *         fornecido como parâmetro.
   */
  private No<T> getNo(int index) {
    validarIndex(index);
    No<T> noAuxiliar = referenciaDeEntrada;
    No<T> noRetorno = null;

    for (int i = 0; i <= index; i++) {
      noRetorno = noAuxiliar;
      noAuxiliar = noAuxiliar.getProximoNo();
    }

    return noRetorno;

  }

  /**
   * verifica se o índice fornecido é válido, que lanca uma exceção
   * IndexOutOfBoundsException se o índice fornecido for maior ou igual ao tamanho
   * da lista.
   * 
   * @param index
   */
  private void validarIndex(int index) {
    if (index >= size()) {
      int ultimoIndex = size() - 1;
      throw new IndexOutOfBoundsException(
          "Não existe conteúdo no index " + index + " desta lista. Esta lista só vai até o indice" + ultimoIndex + ".");
    }
  }

  /**
   * @param index
   * @return retorna o conteúdo do nó indicado pelo index.
   */
  public T get(int index) {
    return getNo(index).getConteudo();
  }

  /**
   * <h3>Esse método tem como objetivo remover um nó em uma determinada
   * posição (index) na lista encadeada.</h3>
   * Primeiramente, ele usa o método getNo para obter o nó que deseja remover. Em
   * seguida, ele verifica se o index é igual a 0, ou seja, se é o primeiro nó da
   * lista. Se for, então a referência de entrada da lista é atualizada para
   * apontar para o próximo nó na lista. Finalmente, o conteúdo do nó removido é
   * retornado.
   * Se o index não for igual a 0, o método getNo é chamado de novo, passando
   * index-1 como parâmetro. Isso retorna o nó anterior ao nó que desejamos
   * remover. Em seguida, a referência do nó anterior é atualizada para apontar
   * para o próximo nó após o nó que será removido, removendo-o assim da lista.
   * Finalmente, o conteúdo do nó removido é retornado.
   * 
   * @param index
   */
  public T remover(int index) {
    validarIndex(index);
    No<T> noPivor = this.getNo(index);
    if (index == 0) {
      referenciaDeEntrada = noPivor.getProximoNo();
      return noPivor.getConteudo();
    }

    No<T> noAnterior = this.getNo(index - 1);
    noAnterior.setProximoNo(noPivor.getProximoNo());
    return noPivor.getConteudo();
  }

  /**
   * <h3>Este método é usado para adicionar um novo elemento à lista
   * encadeada.</h3>
   * O método começa verificando se a lista está vazia, o que significa que não há
   * nenhum elemento na lista. Se a lista estiver vazia, ele adiciona o novo
   * elemento como a referência de entrada.
   * 
   * Se a lista não estiver vazia, ele usa um ponteiro auxiliar (noAuxiliar) para
   * navegar até o último elemento na lista. Ele faz isso usando o tamanho da
   * lista e um loop que percorre todos os elementos menos um (já que o último
   * elemento tem um próximo nulo). Quando o loop termina, o ponteiro auxiliar
   * aponta para o último elemento na lista.
   * 
   * Finalmente, ele adiciona o novo elemento ao final da lista usando o método
   * setProximoNo, passando como parâmetro o novo nó que foi criado no começo do
   * método.
   * 
   * @param conteudo
   */
  public void add(T conteudo) {
    No<T> novoNo = new No<>(conteudo);
    if (isEmpty()) {
      referenciaDeEntrada = novoNo;
      return;
    }

    No<T> noAuxiliar = referenciaDeEntrada;
    for (int i = 0; i < this.size() - 1; i++) {
      noAuxiliar = noAuxiliar.getProximoNo();
    }

    noAuxiliar.setProximoNo(novoNo);
  }

  /**
   * @return retorna true se a lista estiver vazia e false caso contrário. Ele
   *         verifica se "referenciaDeEntrada" é igual a null.
   */
  public boolean isEmpty() {
    return referenciaDeEntrada == null ? true : false;
  }

  /**
   * Esse método usa uma referência auxiliar para percorrer a lista e contar o
   * número de nós. Enquanto a referência auxiliar não for null, ele incrementa o
   * tamanho da lista e avança para o próximo nó. Quando a referência auxiliar for
   * igual a null, significa que chegou ao final da lista e pode retornar o
   * tamanho da lista.
   * 
   * @return retorna o número de nós na lista
   */
  public int size() { // retorna o tamanho da lista
    int tamanhoLista = 0;

    No<T> referenciaAuxiliar = referenciaDeEntrada;

    while (true) {
      if (referenciaAuxiliar != null) {
        tamanhoLista++;
        if (referenciaAuxiliar.getProximoNo() != null) {
          referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
        } else {
          break;
        }
      } else {
        break;
      }
    }

    return tamanhoLista;

  }

  /**
   * <h3>Retorna uma representação em forma de String da lista encadeada. Ele
   * itera pela lista a partir da referência de entrada, obtendo o conteúdo de
   * cada nó e concatenando com uma string.</h3>
   * A representação final é uma string que mostra a sequência de conteúdos, onde
   * cada nó é representado por "[No {Conteudo = ...}]-->". O conteúdo de cada nó
   * é obtido a partir do método getConteudo do nó. O nó atual é obtido através da
   * referência "noAuxiliar", que inicia na referência de entrada da lista, e vai
   * sendo atualizada para o próximo nó em cada iteração do loop.
   * 
   * Ao final da iteração, a string retornada terá a representação de todos os nós
   * da lista, concatenada com "null", que representa o final da lista encadeada.
   */
  @Override
  public String toString() {

    String strRetorno = "";
    No<T> noAuxiliar = referenciaDeEntrada;

    for (int i = 0; i < this.size(); i++) {
      strRetorno += "[No {Conteudo = " + noAuxiliar.getConteudo() + "}]-->";
      noAuxiliar = noAuxiliar.getProximoNo();
    }
    strRetorno += "null";

    return strRetorno;
  }

}
