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

package aula15.TryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 30/09/2024
 * @brief Class Finally.
 */
public class Finally {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Aluno\\Documents\\NetBeansProjects\\tecnicasdeprogramacao\\src\\main\\java\\aula15\\TryCatch\\in.txt");
        Scanner ler = null;
        try {
            ler = new Scanner(file);
            while (ler.hasNextLine()) {
                System.out.println(ler.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("nao tem arquivo");
        } finally {
            if (ler!=null) {
                ler.close();
            }
            System.out.println("Bloco finally executado");
        }
    }
}
