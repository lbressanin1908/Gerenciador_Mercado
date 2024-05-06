/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetogerenciadormercado.Estoque;

/**
 *
 * @author Luan Bressanin
 */
public class Estoque {
    private int ID;
    private int Est_atual;
    private int Est_saida;
    private int QtdeSaída;
    private int QtdeEntrada;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEst_atual() {
        return Est_atual;
    }

    public void setEst_atual(int Est_atual) {
        this.Est_atual = Est_atual;
    }

    public int getEst_saida() {
        return Est_saida;
    }

    public void setEst_saida(int Est_saida) {
        this.Est_saida = Est_saida;
    }

    public int getQtdeSaída() {
        return QtdeSaída;
    }

    public void setQtdeSaída(int QtdeSaída) {
        this.QtdeSaída = QtdeSaída;
    }

    public int getQtdeEntrada() {
        return QtdeEntrada;
    }

    public void setQtdeEntrada(int QtdeEntrada) {
        this.QtdeEntrada = QtdeEntrada;
    }
    
}
