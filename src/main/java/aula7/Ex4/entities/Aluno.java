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

package aula7.Ex4.entities;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 30/08/2024
 * @brief Class Aluno
 */

public class Aluno {
    private String nome;
    private double grade1;
    private double grade2;
    private double grade3;

    public Aluno(double grade1, double grade2, double grade3, String nome) {
        this.nome = nome;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        if (grade1 + grade2 + grade3 >= 60) {
            return "NOME: " + nome + "\n" +
                    "NOTA FINAL = " + String.format("%.2f", (grade1 + grade2 + grade3)) + "\n"
                    + "APROVADO";
        } else {
            return "NOME: " + nome + "\n" +
                    "NOTA FINAL = " + String.format("%.2f", (grade1 + grade2 + grade3)) + "\n"
                    + "REPROVADO \n" +
                    "FALTANDO " + String.format("%.2f", (60 - (grade1 + grade2 + grade3)));
        }
    }
}
