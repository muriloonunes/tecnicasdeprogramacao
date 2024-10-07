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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 07/10/2024
 * @brief Class Arquivos
 */
public class Arquivos {
    public static void main(String[] args) {
        String path = "C:\\Users\\Aluno\\Documents\\NetBeansProjects\\tecnicasdeprogramacao\\src\\main\\java\\aula15\\TryCatch\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try {
            //fr = new FileReader(path);
            br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
