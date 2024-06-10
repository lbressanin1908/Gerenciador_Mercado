/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetogerenciadormercado.Regristra;

import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Luan Bressanin
 */
@Getter
@Setter
public class Entrada implements Serializable{
    private String secao;
    private String notaFiscalAssoc;
    private Date dataEntrada;

}
