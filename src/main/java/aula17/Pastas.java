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

import java.io.File;
import java.util.Scanner;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 07/10/2024
 * @brief Class Pastas
 */
public class Pastas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o caminho da pasta: ");
        String strPasta = ler.nextLine();

        File path = new File(strPasta);
        File[] pastas = path.listFiles(File::isDirectory);
        System.out.println("PASTAS:");
        for (File pasta : pastas) {
            System.out.println(pasta);
        }

        File[] arquivos = path.listFiles(File::isFile);
        System.out.println("ARQUIVOS:");
        for (File arquiv : arquivos) {
            System.out.println(arquiv);
        }

        boolean sucesso = new File(strPasta + "\\subdir").mkdir();
        System.out.println("Diretorio criado com sucesso: "+sucesso);
    }
}
