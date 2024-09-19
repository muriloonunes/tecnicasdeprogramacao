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

package aula8.Ex3.application;

import java.util.ArrayList;
import java.util.Scanner;

import aula8.Ex3.entities.Funcionario;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 06/09/2024
 * @brief Class Programa
 */

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Quantos funcionários você deseja cadastrar?");
        int qtd = ler.nextInt();
        ler.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite os dados do funcionário " + (i + 1));
            System.out.print("ID: ");
            int id = ler.nextInt();
            ler.nextLine();

            System.out.print("Nome: ");
            String nome = ler.nextLine();

            System.out.print("Salário: ");
            double salario = ler.nextDouble();
            ler.nextLine();

            funcionarios.add(new Funcionario(id, nome, salario));
            System.out.println();
        }

        System.out.print("Digite o ID do funcionário para aumento: ");
        int id = ler.nextInt();
        ler.nextLine();

        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                System.out.println("Digite o percentual do aumento: ");
                double percentual = ler.nextDouble();
                f.aumentarSalario(percentual);
                break;
            }
        }
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

    }
}

