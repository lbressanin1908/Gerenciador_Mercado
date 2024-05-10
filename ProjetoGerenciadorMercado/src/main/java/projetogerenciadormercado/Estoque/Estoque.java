/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetogerenciadormercado.Estoque;

/**
 *
 * @author Luan Bressanin
 */
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Estoque implements Serializable{
    private int ID;
    private int Estoque_atual;
    private int Estoque_saida;
    private int QtdeSaída;
    private int QtdeEntrada;

    @Override
    public String toString() {
        return "Estoque atual: "+Estoque_atual;
        }

    
}
