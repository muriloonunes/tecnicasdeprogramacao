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

package aula17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 07/10/2024
 * @brief Class FileWriter
 */
public class Arquivos2 {
    public static void main(String[] args) {
        String[] materias = {"Técnicas de programação", "Fundamentos matématicos", "Processos de Engenharia de software",
                "Sistrmas Operacionais", "Circuitos digitais e microcontroladores"};

        String path = "C:\\Users\\Aluno\\Documents\\NetBeansProjects\\tecnicasdeprogramacao\\src\\main\\java\\aula17\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String materia : materias) {
                bw.write(materia);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
