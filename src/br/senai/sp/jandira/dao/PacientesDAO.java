package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Paciente;
import java.util.ArrayList;

/**
 *
 * @author 22282790
 */
public class PacientesDAO {

    /*
    Essa classe será responsável pela persistência de dados
    das especialidades, por exemplo, adicionar uma nova especialidade,
    excluir uma especialidade, etc.
     */
    private static ArrayList<Paciente> pacientes = new ArrayList<>();

    private static void gravar(Paciente p) {
        pacientes.add(p);
    }

    public static ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public static Paciente getPaciente(Integer codigo) {
        for (Paciente p : pacientes) {
            if (p.getCodigo() == codigo) {
                return p;
            }

        }

        return null;
    }

    public static void atualizar(Paciente pacienteAtualizado) { // UPDATE

        for (Paciente p : pacientes) {
            if (p.getCodigo() == pacienteAtualizado.getCodigo()) {
                pacientes.set(pacientes.indexOf(p), pacienteAtualizado);
                break;
            }

        }
    }

    public static void excluir(Integer codigo) { // DELETE

        for (Paciente p : pacientes) {
            if (p.getCodigo() == codigo) {
                pacientes.remove(p);
                break;
            }
        }

    }
}
