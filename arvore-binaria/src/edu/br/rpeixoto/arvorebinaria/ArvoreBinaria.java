package edu.br.rpeixoto.arvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {
  private BinNo<T> raiz;

  public ArvoreBinaria() {
    this.raiz = null;
  }

  public void inserir(T conteudo) {
    BinNo<T> novoNo = new BinNo<>(conteudo);
    raiz = inserir(raiz, novoNo);
  }

  private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
    if (atual == null) {
      return novoNo;
    } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
      atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
    } else {
      atual.setNoDir(inserir(atual.getNoDir(), novoNo));
    }
    return atual;

  }

  public void exibirEmOrdem() {
<<<<<<< HEAD
    System.out.print("\n Exibindo em ordem: ");
=======
    System.out.println("\n Exibindo em ordem: ");
>>>>>>> 7bc07c0f9d9976bfba7d43f27d33b0a2e32a4f97
    exibirEmOrdem(this.raiz);
  }

  private void exibirEmOrdem(BinNo<T> atual) {
    if (atual != null) {
      exibirEmOrdem(atual.getNoEsq());
<<<<<<< HEAD
      System.out.print(atual.getConteudo() + ", ");
=======
      System.out.println(atual.getConteudo() + ", ");
>>>>>>> 7bc07c0f9d9976bfba7d43f27d33b0a2e32a4f97
      exibirEmOrdem(atual.getNoDir());
    }
  }

  public void exibirPosOrdem() {
<<<<<<< HEAD
    System.out.print("\n Exibindo Pos ordem: ");
=======
    System.out.println("\n Exibindo Pos ordem: ");
>>>>>>> 7bc07c0f9d9976bfba7d43f27d33b0a2e32a4f97
    exibirPosOrdem(this.raiz);
  }

  private void exibirPosOrdem(BinNo<T> atual) {
    if (atual != null) {
      exibirEmOrdem(atual.getNoEsq());
      exibirEmOrdem(atual.getNoDir());
<<<<<<< HEAD
      System.out.print(atual.getConteudo() + ", ");
=======
      System.out.println(atual.getConteudo() + ", ");
>>>>>>> 7bc07c0f9d9976bfba7d43f27d33b0a2e32a4f97
    }
  }

  public void exibirPreOrdem() {
<<<<<<< HEAD
    System.out.print("\n Exibindo Pré ordem: ");
=======
    System.out.println("\n Exibindo Pré ordem: ");
>>>>>>> 7bc07c0f9d9976bfba7d43f27d33b0a2e32a4f97
    exibirPreOrdem(this.raiz);
  }

  private void exibirPreOrdem(BinNo<T> atual) {
    if (atual != null) {
<<<<<<< HEAD
      System.out.print(atual.getConteudo() + ", ");
=======
      System.out.println(atual.getConteudo() + ", ");
>>>>>>> 7bc07c0f9d9976bfba7d43f27d33b0a2e32a4f97
      exibirEmOrdem(atual.getNoEsq());
      exibirEmOrdem(atual.getNoDir());
    }
  }

  public void remover(T conteudo) {
    try {
      BinNo<T> atual = this.raiz;
      BinNo<T> pai = null;
      BinNo<T> filho = null;
      BinNo<T> temp = null;

      while (atual != null && !atual.getConteudo().equals(conteudo)) {
        pai = atual;
        if (conteudo.compareTo(atual.getConteudo()) < 0) {
          atual = atual.getNoEsq();
        } else {
          atual = atual.getNoDir();
        }
      }

      if (atual == null) {
        System.out.println("Conteúdo não encontrado! Bloco try");

      }

<<<<<<< HEAD
      if (pai == null) {
        if (atual.getNoDir()==null) {
          this.raiz=atual.getNoEsq();
        } else if(atual.getNoEsq()==null) {
          this.raiz=atual.getNoDir();
          
        }else{
          for(temp=atual, filho= atual.getNoEsq();
          filho.getNoDir() !=null;
          temp = filho, filho=filho.getNoEsq()
          ){
            if (filho != atual.getNoEsq()) {
              temp.setNoDir(filho.getNoEsq());
              filho.setNoEsq(raiz.getNoEsq());
            }
          }
          filho.setNoDir(filho.getNoDir());
          raiz=filho;
        }
      } else if(atual.getNoDir() == null){
        if(pai.getNoEsq() == atual){
            pai.setNoEsq(atual.getNoEsq());
        }else {
            pai.setNoDir(atual.getNoEsq());
        }
    }else if(atual.getNoEsq() == null){
        if(pai.getNoEsq() == atual){
            pai.setNoEsq(atual.getNoDir());
        }else {
            pai.setNoDir(atual.getNoDir());
        }
    }else{
        for(
                temp = atual, filho = atual.getNoEsq();
                filho.getNoDir() != null;
                temp = filho, filho = filho.getNoDir()
        ){
            if(filho != atual.getNoEsq()){
                temp.setNoDir(filho.getNoEsq());
                filho.setNoEsq(atual.getNoEsq());
            }
            filho.setNoDir(atual.getNoDir());
            if(pai.getNoEsq() == atual){
                pai.setNoEsq(filho);
            }else{
                pai.setNoDir(filho);
            }
        }
    }

=======
>>>>>>> 7bc07c0f9d9976bfba7d43f27d33b0a2e32a4f97
    } catch (NullPointerException erro) {
      System.out.println("Conteúdo não encontrado! Bloco catch");
    }
  }

}