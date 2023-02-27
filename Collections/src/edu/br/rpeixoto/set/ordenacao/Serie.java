package edu.br.rpeixoto.set.ordenacao;

public class Serie implements Comparable<Serie> {
  private String nome;
  private String genero;
  private int tempoEpisodio;

  public Serie(String name, String genero, int tempoEpisodio) {
    this.nome = name;
    this.genero = genero;
    this.tempoEpisodio = tempoEpisodio;
  }

  public String getNome() {
    return nome;
  }

  public String getGenero() {
    return genero;
  }

  public int getTempoEpisodio() {
    return tempoEpisodio;
  }

  @Override
  public String toString() {
    return "Serie [name=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((genero == null) ? 0 : genero.hashCode());
    result = prime * result + tempoEpisodio;
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
    Serie other = (Serie) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (genero == null) {
      if (other.genero != null)
        return false;
    } else if (!genero.equals(other.genero))
      return false;
    if (tempoEpisodio != other.tempoEpisodio)
      return false;
    return true;
  }

  @Override
  public int compareTo(Serie o) {
    int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), o.getTempoEpisodio());
    if (tempoEpisodio != 0) {
      return tempoEpisodio;
    }
    return this.getGenero().compareTo(o.getGenero());
  }

}
