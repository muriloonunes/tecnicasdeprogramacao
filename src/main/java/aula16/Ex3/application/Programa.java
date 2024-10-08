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

package aula16.Ex3.application;

import aula16.Ex3.models.entities.Reserva;
import aula16.Ex3.models.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 04/10/2024
 * @brief Class Programa
 */
public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Número do quarto: ");
            int quarto = ler.nextInt();
            System.out.print("Data do check-in (dd/MM/yyyy):");
            LocalDate checkIn = LocalDate.parse(ler.next(), fmt1);
            System.out.print("Data do check-out (dd/MM/yyyy):");
            LocalDate checkOut = LocalDate.parse(ler.next(), fmt1);

            Reserva reserva = new Reserva(quarto, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();

            System.out.println("Digite informações para atualizar a reserva:");
            System.out.print("Data do check-in (dd/MM/yyyy):");
            checkIn = LocalDate.parse(ler.next(), fmt1);
            System.out.print("Data do check-out (dd/MM/yyyy):");
            checkOut = LocalDate.parse(ler.next(), fmt1);

            reserva.atualizarDatas(checkIn, checkOut);
            System.out.println("Reserva: " + reserva);
        } catch (DateTimeParseException e) {
            //erro ao digitar a data (por exemplo, em um formato inválido)
            System.out.println("Formato de data inválido");
        } catch (DomainException e) {
            //erro personalizado, caso haja algum problema com as datas
            System.out.println("Erro na reserva: " + e.getMessage());
        } catch (RuntimeException e) {
            //qualquer outro tipo de erro
            System.out.println("Erro inesperado");
        }
    }
}
