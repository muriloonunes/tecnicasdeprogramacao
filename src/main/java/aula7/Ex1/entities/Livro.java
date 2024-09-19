/*
 * Copyright (C) 2024 Murilo Nunes <murilo_no@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package aula7.Ex1.entities;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 02/09/2024
 * @brief Class Livro
 */

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private boolean lancamento;

    public Livro() {
        super();
    }

    public Livro(String titulo, String autor, int paginas, boolean lancamento) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.lancamento = lancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if (paginas >= 0) {
            this.paginas = paginas;
        } else {
            this.paginas = 0;
        }
    }

    public boolean isLancamento() {
        return lancamento;
    }

    public void setLancamento(boolean lancamento) {
        this.lancamento = lancamento;
    }

    @Override
    public String toString() {
        return "LIVRO CADASTRADO: \n" +
                "Título: " + titulo +
                ", autor: " + autor +
                ", páginas: " + paginas +
                ", lançamento: " + lancamento;
    }
}
