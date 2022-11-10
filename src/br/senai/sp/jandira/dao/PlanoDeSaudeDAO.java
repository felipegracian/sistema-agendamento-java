package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

    //Atributos de classe para gravar em um arquivo
    private final static String URL
            = "C:\\Users\\22282790\\java\\PlanosDeSaude.txt";
    private final static Path PATH = Paths.get(URL);

    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

    public static void gravar(PlanoDeSaude p) {
        planosDeSaude.add(p);

        //**Gravar em um arquivo**
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro");
        }
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

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();

            while (linha != null) {
                //Transformar os dados da linha em um Plano de Saude
                String[] vetor = linha.split(";");
                
                PlanoDeSaude p = new PlanoDeSaude(vetor[1],
                        vetor[2],
                        vetor[3],
                        LocalDate.parse(vetor[4]),
                        Integer.valueOf(vetor[0]));

                //Gravar o plano na lista
                planosDeSaude.add(p);

                //Ler a próxima linha
                linha = leitor.readLine();
            }

            leitor.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro");
        }

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
