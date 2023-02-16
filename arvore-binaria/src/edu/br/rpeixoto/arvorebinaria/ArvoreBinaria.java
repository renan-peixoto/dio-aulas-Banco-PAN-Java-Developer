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
    System.out.println("\n Exibindo em ordem: ");
    exibirEmOrdem(this.raiz);
  }

  private void exibirEmOrdem(BinNo<T> atual) {
    if (atual != null) {
      exibirEmOrdem(atual.getNoEsq());
      System.out.println(atual.getConteudo() + ", ");
      exibirEmOrdem(atual.getNoDir());
    }
  }

  public void exibirPosOrdem() {
    System.out.println("\n Exibindo Pos ordem: ");
    exibirPosOrdem(this.raiz);
  }

  private void exibirPosOrdem(BinNo<T> atual) {
    if (atual != null) {
      exibirEmOrdem(atual.getNoEsq());
      exibirEmOrdem(atual.getNoDir());
      System.out.println(atual.getConteudo() + ", ");
    }
  }

  public void exibirPreOrdem() {
    System.out.println("\n Exibindo Pré ordem: ");
    exibirPreOrdem(this.raiz);
  }

  private void exibirPreOrdem(BinNo<T> atual) {
    if (atual != null) {
      System.out.println(atual.getConteudo() + ", ");
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

    } catch (NullPointerException erro) {
      System.out.println("Conteúdo não encontrado! Bloco catch");
    }
  }

}
