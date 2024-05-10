/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetogerenciadormercado.Produto;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Luan Bressanin
 */
@Getter
@Setter
public class Produto implements Serializable{
    
    private int ID;
    private String marca;
    private int Qtde_recebida;
    private float Preco_prod;
    private float Preco_venda;
    private String Fornecedor;
    private int Qtde_min;

    
}
