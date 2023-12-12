package CervejariaPOO;

import java.io.*;
import java.util.List;

import javax.swing.JOptionPane;

public class Menu {
    public static void salvarCervejas(CervejariaManager cervejariaManager) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("cervejas.txt"))) {
            List<Cerveja> cervejas = cervejariaManager.getCervejas();

            for (Cerveja cerveja : cervejas) {
                writer.write(cerveja.toString()); // Supondo que a classe Cerveja tenha um método toString apropriado
                writer.newLine();
            }

            JOptionPane.showMessageDialog(null, "Cervejas salvas com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar cervejas: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
