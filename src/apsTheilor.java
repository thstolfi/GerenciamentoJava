import javax.swing.JOptionPane;
import java.util.TreeMap;

public class apsTheilor {
    public static void main(String[] args) throws Exception {
        int[] matricula = new int[3];
        int[] idade = new int[3];
        String entrada;

        // Coleta matriculas e idades
        for (int i = 0; i < matricula.length; i++) {
            entrada = JOptionPane.showInputDialog("Informe o número da matrícula do funcionário " + (i + 1) + ":");
            matricula[i] = Integer.parseInt(entrada);
            entrada = JOptionPane.showInputDialog("Informe a idade do funcionário " + (i + 1) + ":");
            idade[i] = Integer.parseInt(entrada);
        }

        do {
            entrada = JOptionPane.showInputDialog("DIGITE SUA OPCAO\n" +
                    "1. Mostrar Lista\n" +
                    "2. Ordenar Crescente por Matricula\n" +
                    "3. Ordenar Decrescente por Idade\n" +
                    "4. Inverter\n" +
                    "5. Procurar Idade\n" +
                    "6. Procurar Matricula\n" +
                    "7. Repete\n" +
                    "99. Sair\n");
            int opcao = Integer.parseInt(entrada);

            if (opcao == 99) {
                break;
            }

            switch (opcao) {
                case 1:
                    for (int i = 0; i < matricula.length; i++) {
                        System.out.println("FUNCIONARIO " + (i + 1) +": Matricula: " + matricula[i] + " - Idade: " + idade[i]);
                    }
                    break;
                case 2:
                    TreeMap<Integer, Integer> matriculaMap = new TreeMap<>();
                    for (int i = 0; i < matricula.length; i++) {
                        matriculaMap.put(matricula[i], idade[i]);
                    }
                    System.out.println("Matriculas em ordem crescente:");
                    for (int matriculaKey : matriculaMap.keySet()) {
                        System.out.println("Matricula: " + matriculaKey + " - Idade: " + matriculaMap.get(matriculaKey));
                    }
                    break;
                case 3:
                    TreeMap<Integer, Integer> idadeMap = new TreeMap<>();
                    for (int i = 0; i < idade.length; i++) {
                        idadeMap.put(idade[i], matricula[i]);
                    }
                    System.out.println("Idades em ordem decrescente:");
                    for (int idadeKey : idadeMap.descendingKeySet()) {
                        System.out.println("Idade: " + idadeKey + " - Matricula: " + idadeMap.get(idadeKey));
                    }
                    break;
                default:
                    System.out.println("OPCAO INVALIDA");
            }
        } while (true);
    }
}
