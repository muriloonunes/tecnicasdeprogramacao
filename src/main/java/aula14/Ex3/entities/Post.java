/*
 * Copyright (C) 2024. Murilo Nunes <murilo_no@outlook.com>
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

package aula14.Ex3.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 28/09/2024
 * @brief Class Post
 */
public class Post {
    private LocalDateTime momento;
    private String titulo;
    private String conteudo;
    private int likes;
    private ArrayList<Comentario> comentarios = new ArrayList<>();

    public Post(String momentoString, String titulo, String conteudo, int likes) {
        this.momento = LocalDateTime.parse(momentoString, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder(titulo + "\n"
                + likes + " Likes - "
                + momento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n"
                + conteudo + "\n"
                + "Comentários: \n");

        for (Comentario comentario : comentarios) {
            resultado.append(comentario.getComentario()).append("\n");
        }
        return resultado.toString();
    }

}
