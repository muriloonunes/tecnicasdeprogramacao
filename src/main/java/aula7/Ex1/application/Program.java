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

package aula7.Ex1.application;

import aula7.Ex1.entities.Livro;

import java.util.Scanner;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 30/08/2024
 * @brief Class Program
 */

public class Program {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos livros voce deseja inserir?");
        int qtd = ler.nextInt();
        ler.nextLine();

        Livro[] l1 = new Livro[qtd];

        for (int i = 0; i < l1.length; i++) {
            System.out.println("Digite o nome do autor do " + (i + 1) + " livro:");
            String autor = (ler.nextLine());
            System.out.println("Digite o título do livro do " + (i + 1) + " livro:");
            String titulo = ler.nextLine();
            System.out.println("Digite o número de páginas do " + (i + 1) + " livro:");
            int pag = ler.nextInt();
            System.out.println("O livro" + (i + 1) + "já foi lançado? (true/false)");
            boolean lancamento = ler.nextBoolean();
            ler.nextLine();

            l1[i] = new Livro(titulo, autor, pag, lancamento);
        }
        for (Livro livro : l1) {
            System.out.println(livro);
        }

    }

}
