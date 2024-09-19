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

package aula3.exercicio1;

import java.util.Scanner;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 16/08/2024
 * @brief Class Main
 */
public class Programa {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        Scanner ler = new Scanner(System.in);

        minhaConta.saldo = 200.00;
        minhaConta.nome = "Maria";

        System.out.println("Bem-vindo!");
        
        boolean verdadeira = true;
        
        while (verdadeira) {
            System.out.printf("Seu saldo atual é de R$%.2f\n",minhaConta.saldo);
            System.out.println("Digite 1 para depositar, 2 para sacar ou 3 para sair!");
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor que você deseja depositar:");
                    double valorDepositar = ler.nextDouble();
                    minhaConta.depositar(valorDepositar);

                    System.out.println("Transação concluída.");
                    break;
                case 2:
                    System.out.println("Digite o valor que você deseja sacar:");
                    double valorSacar = ler.nextDouble();
                    if (minhaConta.sacar(valorSacar)) {
                        System.out.println("Transação concluída.");
                    } else {
                        System.out.println("Saldo insuficiente! Não é possível sacar");
                    }
                    break;
                case 3:
                    verdadeira = false;
            }

        }

    }
}
