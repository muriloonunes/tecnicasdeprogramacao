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

package aula15.Ex1.application;

import aula15.Ex1.entities.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 01/10/2024
 * @brief Class Programa
 */
public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<ItemPedido> item = new ArrayList<>();

        System.out.println("Digite os dados do cliente: ");
        System.out.print("Nome: ");
        String nomeCliente = ler.nextLine();
        System.out.print("Email: ");
        String email = ler.nextLine();
        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        LocalDate dataNascimento = null;
        while (dataNascimento == null) {
            try {
                dataNascimento = LocalDate.parse(ler.nextLine(), fmt1);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida! Tente novamente");
            }
        }
        Cliente cliente = new Cliente(nomeCliente, email, dataNascimento);

        System.out.println("Digite os dados do pedido: ");
        System.out.print("Status (1 - Pendente, 2 - Processando, 3 - Enviado, 4 - Entregue): ");
        OrderStatus status = null;
        while (status == null) {
            try {
                status = OrderStatus.fromIndex(ler.nextInt());
            } catch (IllegalArgumentException e) {
                System.out.println("Nível inválido! Tente novamente");
                ler.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números");
                ler.nextLine();
            }
        }
        Pedido pedido = new Pedido(status, cliente);

        System.out.println("Quantos itens tem o pedido? ");
        int itens = 0;
        while (itens <= 0) {
            try {
                itens = ler.nextInt();
                if (itens < 0) {
                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException e) {
                System.out.println("A quantidade deve ser um número inteiro");
                ler.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("A quantidade de itens não pode ser negativa");
                ler.nextLine();
            }
        }
        ler.nextLine();
        for (int i = 1; i <= itens; i++) {
            System.out.println("Digite os dados do item #" + i + ": ");
            System.out.print("Nome do item: ");
            String nomeItem = ler.nextLine();
            System.out.print("Preço: ");
            double preco = 0;
            while (preco <= 0) {
                try {
                    preco = ler.nextDouble();
                    if (preco < 0) {
                        throw new IllegalArgumentException();
                    }
                } catch (InputMismatchException | IllegalArgumentException e) {
                    System.out.println("Preço inválido! Tente novamente");
                    ler.nextLine();
                }
            }

            produtos.add(new Produto(nomeItem, preco));

            System.out.print("Quantidade: ");
            int quantidade = 0;
            while (quantidade <= 0) {
                try {
                    quantidade = ler.nextInt();
                    if (quantidade < 0) {
                        throw new IllegalArgumentException();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("A quantidade deve ser um número inteiro");
                    ler.nextLine();
                } catch (IllegalArgumentException e) {
                    System.out.println("A quantidade do item não pode ser negativa.");
                    ler.nextLine();
                }
            }

            item.add(new ItemPedido(quantidade, produtos.get(i - 1)));

            pedido.adicionarItem(item.get(i - 1));
            ler.nextLine();
        }

        System.out.println();
        pedido.resumirPedido();
    }
}
