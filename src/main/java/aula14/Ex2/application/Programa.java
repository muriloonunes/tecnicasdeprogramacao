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


package aula14.Ex2.application;

import aula14.Ex2.entites.ContratoPorHora;
import aula14.Ex2.entites.Departamento;
import aula14.Ex2.entites.Funcionario;
import aula14.Ex2.entites.NivelTrabalhador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 28/09/2024
 * @brief Class Programa.
 */
public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ArrayList<ContratoPorHora> contratoPorHora = new ArrayList<>();

        System.out.print("Digite o nome do departamento: ");
        String departamentoString = ler.next();
        ler.nextLine();
        Departamento departamento = new Departamento(departamentoString);

        System.out.println("Digite os dados do funcionário: ");
        System.out.print("Nome: ");
        String nome = ler.nextLine();
        System.out.print("Nível (1 - JUNIOR, 2 - PLENO, 3 - SENIOR): ");
        int nivelInt = ler.nextInt();
        NivelTrabalhador nivel = NivelTrabalhador.fromIndex(nivelInt);
        System.out.print("Salário base: ");
        double salarioBase = ler.nextDouble();
        System.out.print("Quantos contratos ele tem? ");
        int numeroContratos = ler.nextInt();

        Funcionario funcionario = new Funcionario(salarioBase,nome,nivel,departamento);

        for (int i = 1; i <= numeroContratos; i++) {
            System.out.println("Digite os dados do contrato #"+i+": ");
            System.out.print("Data (dd/MM/yyyy): ");
            String dataInput = ler.next();
            LocalDate data = LocalDate.parse(dataInput, fmt1);
            System.out.print("Valor por hora: ");
            double valorHora = ler.nextDouble();
            System.out.print("Duração em horas: ");
            int horas = ler.nextInt();
            contratoPorHora.add(i-1, new ContratoPorHora(data,valorHora,horas));

            funcionario.adicionarContrato(contratoPorHora.get(i-1));

            System.out.println();
        }

        System.out.println("Digite mês e ano para calcular o lucro: (MM/yyyy)");
        String[] mesAno = ler.next().split("/");
        int mes = Integer.parseInt(mesAno[0]);
        int ano = Integer.parseInt(mesAno[1]);

        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Departamento: "+funcionario.getDepartamento().getNome());
        System.out.println("Lucro em "+mes+"/"+ano+": "+funcionario.calcularSalario(ano,mes));
    }
}
