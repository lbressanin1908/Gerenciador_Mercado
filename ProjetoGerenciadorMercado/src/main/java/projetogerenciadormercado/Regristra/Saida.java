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
public class Saida implements Serializable{
    private int ID;
    private Date dtSaida;
    private String motivo;

}
