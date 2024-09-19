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

package aula6.application;

import aula6.entities.Livro;
import aula6.entities.Pessoa;

import java.util.Scanner;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 30/08/2024
 * @brief Class Aula
 */
public class Aula {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos livros voce deseja inserir?");
        int qtd = ler.nextInt();
        ler.nextLine();

        String[] infos = new String[4];

        while(qtd!=0) {
            System.out.println("Digite o nome do autor:");
            infos[0] = ler.nextLine();
            System.out.println("Digite o título do livro:");
            infos[1] = ler.nextLine();
            System.out.println("Digite o número de páginas:");
            infos[2] = ler.nextLine();
            System.out.println("O livro já foi lançado? (true/false)");
            infos[3] = ler.nextLine();

            Livro livro = new Livro();
            livro.setAutor(infos[0]);
            livro.setTitulo(infos[1]);
            livro.setPaginas(Integer.parseInt(infos[2]));
            livro.setLancamento(Boolean.parseBoolean(infos[3]));
            System.out.println(livro);
            qtd--;
        }


    }
}
