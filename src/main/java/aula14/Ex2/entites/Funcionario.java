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

package aula14.Ex2.entites;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 27/09/2024
 * @brief Class Funcionario
 */
public class Funcionario {
    private String nome;
    private NivelTrabalhador nivel;
    private double salarioBase;
    private Departamento departamento;
    private ArrayList<ContratoPorHora> contratos = new ArrayList<>();

    public Funcionario(double salarioBase, String nome, NivelTrabalhador nivel, Departamento departamento) {
        this.salarioBase = salarioBase;
        this.nome = nome;
        this.nivel = nivel;
        this.departamento = departamento;
    }

    public void adicionarContrato(ContratoPorHora contrato){
        contratos.add(contrato);
    }

    public void removerContrato(ContratoPorHora contrato) {
        contratos.remove(contrato);
    }

    public double calcularSalario(int ano, int mes) {
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();

        for (ContratoPorHora c : contratos) {
            cal.setTime(c.getData());
            int calendarioAno = cal.get(Calendar.YEAR);
            int calendarioMes = cal.get(Calendar.MONTH)+1;

            if (ano==calendarioAno && mes==calendarioMes){
                soma+=c.valorTotal();
            }
        }
        return soma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public ArrayList<ContratoPorHora> getContratos() {
        return contratos;
    }

    public void setContratos(ArrayList<ContratoPorHora> contratos) {
        this.contratos = contratos;
    }
}
