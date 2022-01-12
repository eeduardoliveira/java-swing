/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

 import entidades.Produto;

/**
 *
 * @author eduar
 */
public class CadastroControle {
       public boolean cadastrarProduto(produto p){
        boolean result = false;

        if (p != null && p.getNome().lenght()>0 && p.getPrecoCusto() !=0.0f && 
                p.getPrecoVenda() !=0.0f && p.getEspecificacoes().length()>0){
            result = true;
        }
        
        return result;
    }
       
}

