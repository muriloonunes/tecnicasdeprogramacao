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

package aula15.Ex1.entities;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 30/09/2024
 * @brief Enum OrderStatus.
 */
public enum OrderStatus {
    PAGAMENTO_PENDENTE(1),
    PROCESSANDO(2),
    ENVIADO(3),
    ENTREGUE(4);

    private int index;

    OrderStatus(int i) {
        this.index = i;
    }

    public int getIndex() {
        return index;
    }

    public static OrderStatus fromIndex(int index) {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.getIndex() == index) {
                return status;
            }
        }
        throw new IllegalArgumentException("Nível inválido: " + index);
    }
}
