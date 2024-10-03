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

package aula15.StringBuilder;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 30/09/2024
 * @brief Class TesteStringBuilder
 */
public class TesteStringBuilder {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("João Silveira Batista");
        System.out.printf("""
                buffer = %s
                tamanho = %d
                capacidade (%d (tamanho) + \
                16 (valor inicial padrão)) = %d
                """, buffer, buffer.length(), buffer.length(), buffer.capacity());
        //EXPANDE A CAPACIDADE P/ 75 CARACTERES
        buffer.ensureCapacity(75);
        System.out.printf("Nova Capacidade = %d\n\n", buffer.capacity());

        //REDEFINE O TAMANHO, NÃO APARECENDO OS CARACTERES SE O ARGUMENTO FOR MENOR QUE A QUANTIDADE DE CARACTERES ORIGINAL
//        buffer.setLength(10);
//        System.out.printf("Novo tamanho = % d\nbuffer = %s\n", buffer.length(), buffer);

        System.out.printf("""
                Caractere index 0: %s
                Caractere index 4: %s
                """, buffer.charAt(0), buffer.charAt(4));

        char[] charArray = new char[buffer.length()];
        buffer.getChars(0, buffer.length(), charArray, 0);
        System.out.print("Os caracteres são: ");
        for (char c : charArray) {
            System.out.println(c);
        }

        buffer.setCharAt(0, 'P');
        buffer.setCharAt(5, 'O');

        System.out.printf("\n\nbuffer = %s", buffer);

        buffer.reverse();
        System.out.printf("\n\nbuffer = %s", buffer);
        System.out.println();

       Object objRef = "Maria";
       String string = "Joaquina";
       char[] conjArray = {'S','i','l','v','a'};

        StringBuilder buffer2 = new StringBuilder();
        buffer2.insert(0, objRef);
        buffer2.insert(0, "");
        buffer2.insert(0, string);
        buffer2.insert(0, "");
        buffer2.insert(0, conjArray);
        buffer2.insert(0, "");
        System.out.printf("Valores antes do delete:\n %s\n\n", buffer2.toString());

        buffer2.delete(0,2);
        buffer2.deleteCharAt(4);
        System.out.printf("Valores depois do delete:\n %s\n\n", buffer2.toString());
    }
}
