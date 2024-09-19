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

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 16/08/2024
 * @brief Class Conta
 */
public class Conta {
    int numero;
    String nome;
    String tipo;
    double saldo;
    double limite;

    boolean sacar(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo-=valor;
            return true;
        }
    }

    void depositar(double valor) {
        saldo += valor;
    }

    void transferir(double valor, Conta c2) {
        saldo -= valor;
        c2.saldo += valor;
    }

}
