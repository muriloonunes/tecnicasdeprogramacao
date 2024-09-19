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

package aula8.Ex1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 06/09/2024
 * @brief Class Programa
 */

public class Programa {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2,"Mateus");

        System.out.println(list.size());

        for (String i : list) {
            System.out.println(i);
        }
        System.out.println("--------------------------------------");

        list.remove(1);
        list.removeIf(x->x.charAt(0)=='M');

        for (String i : list) {
            System.out.println(i);
        }
        System.out.println("--------------------------------------");

        System.out.println("Index do Bob: "+list.indexOf("Bob"));
        System.out.println("Index do Joao: "+list.indexOf("Joao"));
        System.out.println("--------------------------------------");

        List<String> result = list.stream().filter(x->x.charAt(0)=='A').toList();
        for (String i : result) {
            System.out.println(i);
        }
        System.out.println("--------------------------------------");

        String name = list.stream().filter(x->x.charAt(0)=='A').findFirst().orElse(null);
        System.out.println(name);
    }
}
