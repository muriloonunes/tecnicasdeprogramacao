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

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 27/09/2024
 * @brief Class Principal
 */
public class Principal {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        LocalDate d1 = LocalDate.now(); //apenas a data
        System.out.println("d1 = " + d1);

        LocalDateTime d2 = LocalDateTime.now(); //data e hora no fuso local (brasileiro, nesse caso)
        System.out.println("d2 = " + d2);

        Instant d3 = Instant.now(); //data e hora no fuso de greenwich
        System.out.println("d3 = " + d3);

        LocalDate d4 = LocalDate.parse("2024-09-27");
        System.out.println("d4 = " + d4.format(fmt1));

        LocalDateTime d5 = LocalDateTime.parse("2024-09-27T19:23:30");
        //System.out.println("d5 = " + d5.format(fmt1)); //imprime sem a hora, ja que fmt1 não possui esse padrao
        System.out.println("d5 = " + d5.format(fmt2)); //imprime com a hora no formato HH:mm, como o fmt2
        //System.out.println("d5 = " + d5.format(fmt4)); //imprime no formato ISO, definido no fmt4 (nesse caso, d5 ja esta definido no formato ISO)

        Instant d6 = Instant.parse("2024-09-27T22:23:30Z");
        System.out.println("d6 = " + fmt3.format(d6)); //imprime com a hora no formato HH:mm, como no fmt3

        Instant d7 = Instant.parse("2024-09-27T19:23:30-03:00");
        System.out.println("d7 = " + d7);

        LocalDate d8 = LocalDate.parse("27/09/2024", fmt1);
        System.out.println("d8 = " + d8);

        LocalDate d9 = LocalDate.parse("27/09/2024 19:34", fmt2);
        System.out.println("d9 = " + d9);

        LocalDate d10 = LocalDate.of(2024, 9, 20);
        System.out.println("d10 = " + d10);

        LocalDateTime d11 = LocalDateTime.of(2024, 7, 27, 19, 36);
        System.out.println("d11 = " + d11.format(fmt4));

        //imprime cada time zone disponivel
        /*for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }*/

        System.out.println();

        LocalDate r1 = LocalDate.ofInstant(d6, ZoneId.systemDefault());
        System.out.println("r1 = " + r1);

        LocalDate r2 = LocalDate.ofInstant(d6, ZoneId.of("Egypt"));
        System.out.println("r2 = " + r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d6, ZoneId.systemDefault());
        System.out.println("r3 = " + r3);

        LocalDateTime r4 = LocalDateTime.ofInstant(d6, ZoneId.of("Egypt"));
        System.out.println("r4 = " + r4);

        System.out.println();

        System.out.println("d01 dia = " + d1.getDayOfMonth()); //obter dia do mes
        System.out.println("d01 dia da semana = " + d1.getDayOfWeek()); //obter dia da semana
        System.out.println("d01 mes = " + d1.getMonth()); //obter mês
        System.out.println("d01 ano = " + d1.getYear()); //obter ano

        System.out.println("d02 hora = " + d2.getHour());
        System.out.println("d02 minuto = " + d2.getMinute());
        System.out.println("d02 segundo = " + d2.getSecond());

        System.out.println();

        LocalDate dataLocalSemanaPassada = d1.minusDays(7); //subtrair dias
        LocalDate dataLocalSemanaQueVem = d1.plusDays(7);   //adicionar dias
        System.out.println(dataLocalSemanaPassada.format(fmt1));
        System.out.println(dataLocalSemanaQueVem);

        System.out.println();

        LocalDateTime dataEHoraLocalSemanaPassada = d5.minusDays(7);
        LocalDateTime dataEHoraLocalSemanaqueVem = d5.plusDays(7);
        System.out.println(dataEHoraLocalSemanaPassada);
        System.out.println(dataEHoraLocalSemanaqueVem);

        System.out.println();

        Duration t1 = Duration.between(dataEHoraLocalSemanaPassada, d5);
        System.out.println(t1.toDays());
    }

}
