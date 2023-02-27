package edu.br.rpeixoto.Exercicios.set;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
  private String nome;
  private int anoDeCriacao;
  private String ide;

  public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
    this.nome = nome;
    this.anoDeCriacao = anoDeCriacao;
    this.ide = ide;
  }

  public String getNome() {
    return nome;
  }

  public int getAnoDeCriacao() {
    return anoDeCriacao;
  }

  public String getIde() {
    return ide;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + anoDeCriacao;
    result = prime * result + ((ide == null) ? 0 : ide.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    LinguagemFavorita other = (LinguagemFavorita) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (anoDeCriacao != other.anoDeCriacao)
      return false;
    if (ide == null) {
      if (other.ide != null)
        return false;
    } else if (!ide.equals(other.ide))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "LinguagemFavorita [nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", ide=" + ide + "]";
  }

  @Override
  public int compareTo(LinguagemFavorita o) {
    return this.getNome().compareToIgnoreCase(o.getNome());
  }

}
