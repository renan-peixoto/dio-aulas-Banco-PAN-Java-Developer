package edu.br.rpeixoto.map.ordenacaomap;

public class Livro {
  private String nome;
  private int paginas;

  public Livro(String nome, int paginas) {
    this.nome = nome;
    this.paginas = paginas;
  }

  public String getNome() {
    return nome;
  }

  public int getPaginas() {
    return paginas;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + paginas;
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
    Livro other = (Livro) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (paginas != other.paginas)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
  }

}
