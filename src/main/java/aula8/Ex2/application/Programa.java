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

package aula8.Ex2.application;

import aula8.Ex2.entities.Aluguel;

import java.util.Scanner;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 02/09/2024
 * @brief Class Programa
 */

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos quartos serão alugados?");
        int qtd = ler.nextInt();
        ler.nextLine();

        Aluguel aluguel = new Aluguel();

        for (int i = 0; i < qtd; i++) {
            System.out.println("ALUGUEL " + (i + 1));
            int quarto;
            String email;

            System.out.println("Qual o quarto que será alugado?");
            while (true) {
                quarto = ler.nextInt();
                ler.nextLine();
                if (quarto < 1 || quarto > 10) {
                    System.out.println("Número do quarto inválido! Informe um número entre 1 e 10.");
                } else if (aluguel.verificarOcupado(quarto)) {
                    System.out.println("Quarto ocupado! Escolha outro quarto.");
                } else {
                    break;
                }
            }

            System.out.println("Qual o nome do hóspede?");
            String nome = ler.nextLine();

            System.out.println("Qual o email do hóspede?");
            while (true) {
                email = ler.nextLine();
                if (email.contains("@") && email.contains(".")) {
                    break;
                } else {
                    System.out.println("Email inválido! Digite um email válido.");
                }
            }

            aluguel.alugarQuarto(quarto, email, nome);
            System.out.println("Aluguel " + (i + 1)+" concluído.");
            System.out.println();
        }
        aluguel.imprimirQuartos();

    }
}
