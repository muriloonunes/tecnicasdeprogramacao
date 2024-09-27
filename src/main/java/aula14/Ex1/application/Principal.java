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

package aula14.Ex1.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 27/09/2024
 * @brief Class Principal
 */
public class Principal {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now(); //apenas a data
        LocalDateTime d2 = LocalDateTime.now(); //data e hora no fuso local (brasileiro, nesse caso)
        Instant d3 = Instant.now(); //data e hora no fuso de greenwhich

        LocalDate d4 = LocalDate.parse("2024-09-27");
        LocalDateTime d5 = LocalDateTime.parse("2024-09-27T19:23:30");
        Instant d6 = Instant.parse("2024-09-27T22:23:30Z");
        Instant d7 = Instant.parse("2024-09-27T19:23:30-03:00");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4.toString());
        System.out.println("d5 = " + d5.toString());
        System.out.println("d6 = " + d6.toString());
        System.out.println("d7 = " + d7.toString());
    }

}
