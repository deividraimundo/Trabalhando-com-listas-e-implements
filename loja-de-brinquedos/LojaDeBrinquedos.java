import bean.Aviao;
import bean.Barco;
import bean.Carro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LojaDeBrinquedos {

    public static void main(String[] args) {

        ArrayList<Carro> listaCarros = new ArrayList<>();
        ArrayList<Barco> listaBarcos = new ArrayList<>();
        ArrayList<Aviao> listaAvioes = new ArrayList<>();

        boolean loop = true;

        while (loop) {

            int tipoBrinquedo = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de brinquedo:\n"
                    + "1 - Barquinho\n"
                    + "2 - Carrinho\n"
                    + "3 - Aviaozinho"));

            switch (tipoBrinquedo) {

                case 1: {

                    Barco b = new Barco();
                    b.setNome(JOptionPane.showInputDialog("Digite o nome do Barquinho."));
                    listaBarcos.add(b);

                }
                break;

                case 2: {

                    Carro c = new Carro();
                    c.setNome(JOptionPane.showInputDialog("Digite o nome do Carrinho."));
                    listaCarros.add(c);

                }
                break;

                case 3: {

                    Aviao a = new Aviao();
                    a.setNome(JOptionPane.showInputDialog("Digite o nome do Aviaozinho."));
                    listaAvioes.add(a);

                }
                break;

            }
            
            int resposta = Integer.parseInt(JOptionPane.showInputDialog("Deseja registrar outro brinquedo?\n"
                    + "1 - Sim\n"
                    + "2 - Nao"));
            
            if(resposta == 2){
                loop = false;
            }
            

        }
        
        String resultado = "Briquedos Registrados:";
        
        resultado += "\nAvioes: \n";
        for(Aviao a: listaAvioes){
            
            resultado += a.getNome() + "\n";
            
        }
        resultado += "\nCarros: \n";
        for(Carro c: listaCarros){
            
            resultado += c.getNome() + "\n";
            
        }
        resultado += "\nBarcos: \n";
        for(Barco b: listaBarcos){
            
            resultado += b.getNome() + "\n";
            
        }
        
        JOptionPane.showMessageDialog(null, resultado);

    }

}
