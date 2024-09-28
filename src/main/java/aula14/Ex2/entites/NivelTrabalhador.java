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

package aula14.Ex2.entites;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 27/09/2024
 * @brief Enum NivelTrabalhador
 */
public enum NivelTrabalhador {
    JUNIOR(1),
    PLENO(2),
    SENIOR(3);

    private int index;

    NivelTrabalhador(int i) {
        this.index = i;
    }

    public int getIndex() {
        return index;
    }

    public static NivelTrabalhador fromIndex(int index) {
        for (NivelTrabalhador nivel : NivelTrabalhador.values()) {
            if (nivel.getIndex() == index) {
                return nivel;
            }
        }
        throw new IllegalArgumentException("Nível inválido: " + index);
    }
}
