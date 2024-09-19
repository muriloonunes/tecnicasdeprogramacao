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

package aula7.Ex3.application;

import java.util.Scanner;

import aula7.Ex3.entities.Employee;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 02/09/2024
 * @brief Class Program
 */

public class Program {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos funcionários você deseja cadastrar?");
        int qtd = ler.nextInt();
        ler.nextLine();

        Employee[] e1 = new Employee[qtd];

        for (int i = 0; i < e1.length; i++) {
            System.out.println("Qual o nome do " + (i + 1) + " funcionário?");
            String nome = ler.nextLine();

            System.out.println("Qual o valor bruto do salário?");
            double grossSalary = ler.nextDouble();

            System.out.println("Qual o valor do imposto?");
            double tax = ler.nextDouble();
            ler.nextLine();

            e1[i] = new Employee(nome, grossSalary, tax);
            System.out.println("Funcionário: " + nome + ", $ " + e1[i].netSalary());
            System.out.println();
        }

        for (int i = 0; i < e1.length; i++) {
            System.out.print("Funcionário " + (i + 1) + ": ");
            System.out.println(e1[i].getName());
        }

        while (true) {
            System.out.println("De qual funcionário você deseja aumentar o salário? (Digite 0 para sair)");
            int func = ler.nextInt();
            if (func == 0) {
                break;
            } else if ((func > 0 && func <= e1.length) ){
                System.out.println("Qual a porcentagem do aumento?");
                double percent = ler.nextDouble();
                e1[func - 1].increaseSalary(percent);

                System.out.println("Dados atualizados: " + e1[func - 1]);
            } else {
                System.out.println("Número de funcinário inválido.");
            }
        }
    }
}
