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

package aula5.entities;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 26/08/2024
 * @brief Class Program
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner ler = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X");
        x.a = ler.nextDouble();
        x.b = ler.nextDouble();
        x.c = ler.nextDouble();

        System.out.println("Enter the measures of triangle Y");
        y.a = ler.nextDouble();
        y.b = ler.nextDouble();
        y.c = ler.nextDouble();

        double areax = x.area();

        double areay = y.area();

        System.out.printf("Triangle x area: %.4f\n", areax);
        System.out.printf("Triangle Y area: %.4f\n", areay);
        if (areax > areay) {
            System.out.println("Larger area: x");
        } else {
            System.out.println("Larger area: Y");
        }
    }
}
