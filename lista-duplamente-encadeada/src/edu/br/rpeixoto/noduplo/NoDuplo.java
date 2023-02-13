package edu.br.rpeixoto.noduplo;

public class NoDuplo<T> {
  private T conteudo;
  private NoDuplo<T> noAnterior, proximoNo;

  public NoDuplo(T conteudo) {
    this.conteudo = conteudo;
  }

  public T getConteudo() {
    return conteudo;
  }

  public void setConteudo(T conteudo) {
    this.conteudo = conteudo;
  }

  public NoDuplo<T> getNoAnterior() {
    return noAnterior;
  }

  public void setNoAnterior(NoDuplo<T> noAnterior) {
    this.noAnterior = noAnterior;
  }

  public NoDuplo<T> getProximoNo() {
    return proximoNo;
  }

  public void setProximoNo(NoDuplo<T> proximoNo) {
    this.proximoNo = proximoNo;
  }

  @Override
  public String toString() {
    return "NoDuplo [conteudo=" + conteudo + "]";
  }

}
