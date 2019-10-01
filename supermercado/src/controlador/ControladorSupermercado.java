/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoSupermercado;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import modelo.Supermercado;
import tela.manutencao.ManutencaoSupermercado;
import tela.manutencao.ManutencaoSupermercado;

/**
 *
 * @author Administrador
 */
public class ControladorSupermercado {

    public static void inserir(ManutencaoSupermercado man){
        Supermercado objeto = new Supermercado();
        objeto.setNome_fantasia(man.jtfNomeFantasia.getText());
        objeto.setRazao_social(man.jtfRazaoSocial.getText());
        objeto.setFundacao(LocalDate.parse(man.jtfFundacao.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        objeto.setNr_funcionarios(Integer.parseInt(man.jtfNrDeFuncionarios.getText()));
        objeto.setValor_na_bolsa(Double.parseDouble(man.jtfValorNaBolsa.getText()));
        boolean resultado = DaoSupermercado.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(ManutencaoSupermercado man){
        Supermercado objeto = new Supermercado();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setNome_fantasia(man.jtfNomeFantasia.getText());
        objeto.setRazao_social(man.jtfRazaoSocial.getText());
        objeto.setFundacao(LocalDate.parse(man.jtfFundacao.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        objeto.setNr_funcionarios(Integer.parseInt(man.jtfNrDeFuncionarios.getText()));
        boolean resultado = DaoProduto.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    
}
