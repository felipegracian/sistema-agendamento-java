package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

    /*
    Essa classe será responsável pela persistência de dados
    dos Planos de Saude, por exemplo, adicionar um nova plano de saude,
    excluir uma plano de saude, etc.
     */
    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

    public static void gravar(PlanoDeSaude p) {
        planosDeSaude.add(p);
    }

    public static ArrayList<PlanoDeSaude> getPlanoDeSaude() {
        return planosDeSaude;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo() == codigo) {
                return p;
            }

        }
        return null;
    }

    public static void atualizar(PlanoDeSaude planoDeSaudeAtualizado) { // UPDATE

        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo() == planoDeSaudeAtualizado.getCodigo()) {
                planosDeSaude.set(planosDeSaude.indexOf(p), planoDeSaudeAtualizado);
                break;
            }

        }
    }

    public static void excluir(Integer codigo) { // DELETE

        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo() == codigo) {
                planosDeSaude.remove(p);
                break;
            }
        }

    }

    public static void criarListaPlanosDeSaude() {
        PlanoDeSaude p1 = new PlanoDeSaude("Amil", "55321-470", "Preferencial",
                LocalDate.of(2022, 03, 10));
        
        planosDeSaude.add(p1);

    }

    public static DefaultTableModel getTabelaPlanosDeSaude() {

        String[] titulo = {"CÓDIGO", "OPERADORA", "NÚMERO", "CATEGORIA", "VALIDADE"};
        String[][] dados = new String[planosDeSaude.size()][5];

        for (PlanoDeSaude p : planosDeSaude) {
            int i = planosDeSaude.indexOf(p);
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getNumero();
            dados[i][3] = p.getCategoria();
            dados[i][4] = p.getValidade().toString();
        }

        return new DefaultTableModel(dados, titulo);
    }

}
