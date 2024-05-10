/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetogerenciadormercado.Funcionario.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Luan Bressanin
 */

@Getter
@Setter
public class Funcionario implements Serializable {
    
    private String nome;
    private String cargo;
    private String Login;
    private String CPF;
    private boolean isLogged;
    private String email;
    private float salario;
    private int tel;
    private String sexo;

}
