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

package aula7.Ex2.application;

import aula7.Ex2.entities.Produtos;

import java.util.Scanner;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 30/08/2024
 * @brief Class Programa
 */

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos produtos você deseja ler?");
        int qtd = ler.nextInt();
        ler.nextLine();
        double media = 0;

        Produtos[] p1 = new Produtos[qtd];

        for (int i = 0; i < p1.length; i++) {
            System.out.println("Digite o nome do "+(i+1)+" produto: ");
            String nome = ler.nextLine();
            System.out.println("Digite o valor do "+(i+1)+" produto: ");
            double valor = ler.nextDouble();
            media+=valor;

            ler.nextLine();

            p1[i] = new Produtos(nome,valor);

        }

        media/= p1.length;

        System.out.println("PREÇO MEDIO = "+ media);

    }
}
