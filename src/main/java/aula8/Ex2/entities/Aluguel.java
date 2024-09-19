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

package aula8.Ex2.entities;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 02/09/2024
 * @brief Class Aluguel
 */

public class Aluguel {
    private final String[][] quartos = new String[10][2];

    public Aluguel() {
        for (int i = 0; i < quartos.length; i++) {
            quartos[i][0] = null;
            quartos[i][1] = null;
        }
    }

    public void alugarQuarto(int quarto, String email, String nome) {
        quartos[quarto - 1][0] = nome;
        quartos[quarto - 1][1] = email;
    }

    public boolean verificarOcupado(int quarto) {
        return quartos[quarto-1][0] != null;
    }

    public void imprimirQuartos() {
        System.out.println("QUARTOS OCUPADOS: ");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i][0] != null) {
                System.out.println((i + 1) + ": " + quartos[i][0] + ", " + quartos[i][1]);
            }
        }
    }
}
