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

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 30/09/2024
 * @brief Class Pedido.
 */
public class Pedido {
    private LocalDate momento;
    private OrderStatus status;
    private ArrayList<ItemPedido> itens = new ArrayList<>();

    public LocalDate getMomento() {
        return momento;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido i : itens) {
            total += i.calcularTotal();
        }
        return total;
    }
}
