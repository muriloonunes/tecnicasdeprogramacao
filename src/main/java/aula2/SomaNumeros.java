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

package aula2;

import java.util.Scanner;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 12/08/2024
 * @brief Class SomaNumeros
 */
public class SomaNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, soma;

        System.out.println("Informe o primeiro numero inteiro:");
        n1 = input.nextInt();

        System.out.println("Informe o segundo numero inteiro:");
        n2 = input.nextInt();

        soma = n1 + n2;

        System.out.printf("A soma é %d\n", soma);
    }

}
