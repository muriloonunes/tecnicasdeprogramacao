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

package aula7.Ex4.application;

import aula7.Ex4.entities.Aluno;

import java.util.Scanner;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 02/09/2024
 * @brief Class Program
 */

public class Program {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos alunos você deseja cadastrar?");
        int qtd = ler.nextInt();
        ler.nextLine();

        Aluno[] a1 = new Aluno[qtd];

        for (int i = 0; i < a1.length; i++) {
            System.out.println("Qual o nome do " + (i + 1) + " aluno?");
            String nome = ler.nextLine();

            System.out.println("Qual a primeira nota?");
            double n1 = ler.nextDouble();

            System.out.println("Qual a segunda nota?");
            double n2 = ler.nextDouble();

            System.out.println("Qual a terceira nota?");
            double n3 = ler.nextDouble();
            ler.nextLine();

            a1[i] = new Aluno(n1, n2, n3, nome);
            System.out.println(a1[i]);
            System.out.println();
        }

        for (int i = 0; i < a1.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            System.out.println(a1[i].getNome());
        }

        while (true) {
            System.out.println("De qual aluno você deseja ver as notas? (Digite 0 para sair)");
            int alun = ler.nextInt();
            if (alun == 0) {
                break;
            } else if (alun > 0 && alun <= a1.length) {
                System.out.println(a1[alun - 1].toString());
            } else {
                System.out.println("Número de aluno inválido.");
            }
        }
    }

}
