package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
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

        PlanoDeSaude p1 = new PlanoDeSaude("Amil", "171110-01",
                "Individual",
                LocalDate.of(2025, 12, 29));
        PlanoDeSaude p2 = new PlanoDeSaude("Bradesco", "1927891-33",
                "Pleno",
                LocalDate.of(2023, 9, 11));
        PlanoDeSaude p3 = new PlanoDeSaude("BioSaude", "55321-02",
                "Empresarial",
                LocalDate.of(2023, 01, 13));
        planosDeSaude.add(p1);
        planosDeSaude.add(p2);
        planosDeSaude.add(p3);

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
            DateTimeFormatter padraoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][4] = p.getValidade().format(padraoBrasileiro);
        }

        return new DefaultTableModel(dados, titulo);
    }

}
