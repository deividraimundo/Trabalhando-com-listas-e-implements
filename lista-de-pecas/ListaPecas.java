
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;


public class ListaPecas {

    public static void main(String[] args) {
        List<Pecas> listaPecas = new ArrayList<Pecas>();
        Pecas p = new Pecas();
        
        for (int i = 0; i < 3; i++) {
            Pecas pecas = new Pecas();
            
            String nome = JOptionPane.showInputDialog("Nome da peça: ");
            pecas.setNome(nome);
            
            double altura = Integer.parseInt(JOptionPane.showInputDialog("Altura da peça (em metros): "));
            pecas.setAltura(altura);
            
            double peso = Integer.parseInt(JOptionPane.showInputDialog("Peso da peça (em quilos): "));
            pecas.setPeso(peso);
            
            listaPecas.add(pecas);
        }
        
        List<Pecas> pComp = new ArrayList<Pecas>();
        pComp = p.comparar(listaPecas);
        for (int i = 0; i < pComp.size(); i++) {
            JOptionPane.showMessageDialog(null, pComp.get(i).getAltura());
            
        }   
        
    }
}
