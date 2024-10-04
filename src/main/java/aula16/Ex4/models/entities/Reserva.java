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

package aula16.Ex4.models.entities;

import aula16.Ex4.models.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 04/10/2024
 * @brief Class Reserva
 */
public class Reserva {
    private int numeroQuarto;
    private LocalDate checkIn;
    private LocalDate checkOut;
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //construtor
    public Reserva(int numeroQuarto, LocalDate checkIn, LocalDate checkOut) {
        //se a data do check-out for antes da data do check-in, lanca uma exceção
        if (checkOut.isBefore(checkIn)){
            throw new DomainException("A data do check-out deve ser posterior a data do check-in");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public long duracao() {
        //usa a classe ChronoUnit para retornar a diferença entre os dias
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    public void atualizarDatas(LocalDate checkIn, LocalDate checkOut) {
        LocalDate agora = LocalDate.now(); //cria uma variavel com a data de hoje para comparação

        //lança uma exceção se as datas de check-in e/ou check-out forem antes da data de hoje
        if (checkIn.isBefore(agora) || checkOut.isBefore(agora)) {
          throw new IllegalArgumentException("As novas datas devem ser futuras");
        }
        //lança uma exceção se a data do check-out for antes da data do check-in
        else if (!checkOut.isAfter(checkIn)) {
            throw new IllegalArgumentException("A data do check-out deve ser posterior a data do check-in");
        } else {
            this.checkIn = checkIn;
            this.checkOut = checkOut;
        }
    }

    public String toString() {
        return "Quarto " + numeroQuarto
                + ", check-in: " + checkIn.format(fmt1)
                + ", check-out: " + checkOut.format(fmt1)
                + ", " + duracao() + " noites";
    }
}