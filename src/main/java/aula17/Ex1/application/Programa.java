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

package aula17.Ex1.application;

import aula17.Ex1.entities.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 07/10/2024
 * @brief Class Programa
 */
public class Programa {
    public static void main(String[] args) {

        File produtosFile = new File("C:\\Users\\Aluno\\Documents\\NetBeansProjects\\tecnicasdeprogramacao\\src\\main\\java\\aula17\\Ex1\\files\\input.csv");
        File total = new File("C:\\Users\\Aluno\\Documents\\NetBeansProjects\\tecnicasdeprogramacao\\src\\main\\java\\aula17\\Ex1\\files\\out\\out.csv");
        ArrayList<Produto> produtos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(produtosFile))) {
            String line = br.readLine();
            while (line != null) {
                String[] values = line.split(",");
                String nome = values[0];
                double preco = Double.parseDouble(values[1]);
                int quantidade = Integer.parseInt(values[2]);
                produtos.add(new Produto(nome, preco, quantidade));
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("nao tem arquivo");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(total))) {
            for (Produto p : produtos) {
                bw.write(p.getNome() + "," + String.format("%.2f", p.calcularTotal()) + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
