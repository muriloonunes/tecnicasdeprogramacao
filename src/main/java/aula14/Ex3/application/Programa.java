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

package aula14.Ex3.application;

import aula14.Ex3.entities.Comentario;
import aula14.Ex3.entities.Post;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 28/09/2024
 * @brief Class Programa.
 */
public class Programa {
    public static void main(String[] args) {
        Post post1 = new Post("2024-09-27T19:23:30","Viajando para a Nova Zelandia",
                "Estou indo visitar esse lindo pais!", 12);

        post1.adicionarComentario(new Comentario("Faça uma boa viagem!"));
        post1.adicionarComentario(new Comentario("Nossa que incrivel"));

        Post post2 = new Post("2024-09-28T16:15:58","Boa noite gnt",
                "Vejo vcs amanha", 5);

        post2.adicionarComentario(new Comentario("Boa noite"));
        post2.adicionarComentario(new Comentario("Que a Força esteja com voce"));

        System.out.println(post1);
        System.out.println(post2);
    }
}
