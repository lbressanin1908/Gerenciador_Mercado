/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetogerenciadormercado.Produto;

/**
 *
 * @author Luan Bressanin
 */
public class Produto {
    
    private int ID;
    private String marca;
    private int Qtde_recebida;
    private float Preco_prod;
    private float Preco_venda;
    private String Fornecedor;
    private int Qtde_min;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtde_recebida() {
        return Qtde_recebida;
    }

    public void setQtde_recebida(int Qtde_recebida) {
        this.Qtde_recebida = Qtde_recebida;
    }

    public float getPreco_prod() {
        return Preco_prod;
    }

    public void setPreco_prod(float Preco_prod) {
        this.Preco_prod = Preco_prod;
    }

    public float getPreco_venda() {
        return Preco_venda;
    }

    public void setPreco_venda(float Preco_venda) {
        this.Preco_venda = Preco_venda;
    }

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    public int getQtde_min() {
        return Qtde_min;
    }

    public void setQtde_min(int Qtde_min) {
        this.Qtde_min = Qtde_min;
    }
    
}
