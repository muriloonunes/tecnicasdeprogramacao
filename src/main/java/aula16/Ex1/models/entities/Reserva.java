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

package aula16.Ex1.models.entities;

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

    //atualiza as datas
    public void atualizarDatas(LocalDate checkIn, LocalDate checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String toString() {
        return "Quarto " + numeroQuarto
                + ", check-in: " + checkIn.format(fmt1)
                + ", check-out: " + checkOut.format(fmt1)
                + ", " + duracao() + " noites";
    }
}
