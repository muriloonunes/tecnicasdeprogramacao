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

package aula15.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 30/09/2024
 * @brief Class StackTrace.
 */
public class StackTrace {
    public static void main(String[] args) {
        metodo1();
        System.out.println("Fim do programa");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo 2");
        Scanner ler = new Scanner(System.in);

        String[] vetor = ler.nextLine().split(" ");
        try {
            int posicao = ler.nextInt();
            System.out.println(vetor[posicao]);
        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição invalida");
            e.printStackTrace();
            ler.next();
        }
        System.out.println("Fim do metodo 2");



        ler.close();
    }
}
