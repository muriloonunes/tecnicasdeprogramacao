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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 30/09/2024
 * @brief Class Pedido
 */
public class Pedido {
    private LocalDateTime momento;
    private OrderStatus status;
    private ArrayList<ItemPedido> itens = new ArrayList<>();
    private Cliente cliente;

    public Pedido(OrderStatus status, Cliente cliente) {
        this.status = status;
        this.cliente = cliente;
        this.momento = LocalDateTime.now();
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
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

    public void resumirPedido() {
        StringBuilder resumo = new StringBuilder("Resumo do pedido: \n" +
                "Momento do pedido: " + this.momento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n"
                + "Status do pedido: " + this.status + "\n"
                + "Cliente: " + this.cliente.getNome() + " ("
                + this.cliente.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ") - "
                + this.cliente.getEmail() + "\n"
                + "Itens do pedido: \n");

        for (ItemPedido item : itens) {
            resumo.append("Item: ").append(item.getProduto().getNome())
                    .append(", Preço: $").append(String.format("%.2f", item.getProduto().getPreco()))
                    .append(", Quantidade: ").append(item.getQuantidade())
                    .append(", Subtotal: $").append(String.format("%.2f", item.calcularTotal())).append("\n");
        }

        resumo.append("Total: $").append(String.format("%.2f", calcularTotal()));
        System.out.println(resumo);
    }
}
