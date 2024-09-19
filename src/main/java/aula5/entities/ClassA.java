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

package aula5.entities;

/**
 *
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 26/08/2024
 * @brief Class ClassA
 */
public class ClassA {
    private String privado;
    
    protected String protegido;
    
    public String publico;
    
    String pacote;
    
    public static void main(String[] args) {
        ClassA a = new ClassA();
        
        a.pacote = "pacote a";
        a.protegido = "protegido a";
        a.publico = "publico a";
       
    }
}
