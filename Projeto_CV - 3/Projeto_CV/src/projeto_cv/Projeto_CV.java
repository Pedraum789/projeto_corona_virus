package projeto_cv;
/**
 *
 * @author Pedraum
 */
public class Projeto_CV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float mili = 500;
        float tempo = mili/1000;
        int Pessoa_Saudavel = 100;
        int Pessoa_Doente = 2;
        
        Mundo m = new Mundo();
        
        //Inicializando os objetos
        for(int c=0;c<Pessoa_Saudavel;c++){
            PessoaSaudavel p = new PessoaSaudavel();
            m.n.add(p);
        }
        for(int c=0;c<Pessoa_Doente;c++){
            m.n2.add(new PessoaDoente());
        }
        
        //Loop do mapa
        while(true){
            
            //Interface
            System.out.println("==============================================================");
            System.out.println("Tempo de simulação: " + tempo + " segundos");
            System.out.println("");
            System.out.print("\033[44m \033[0m");
            System.out.print(" Saudáveis: " + m.n.size());
            System.out.print("  \033[41m \033[0m");
            System.out.println(" Doentes: " + m.n2.size());
            System.out.println("");
            System.out.print("Total de pessoas: " + (m.n.size() + m.n2.size()));
            System.out.println("");
            
            
            
            tempo += mili/1000;

            m.atualizaMundo();
            m.desenhaMundo();
            
            //Atualiza o tempo
            for(int i=0;i<m.n2.size();i++){
                ((PessoaDoente)m.n2.get(i)).time += mili/1000;
            }
            for(int i=0;i<m.n.size();i++){
                if(((PessoaSaudavel)m.n.get(i)).isVacinada() == true)
                    ((PessoaSaudavel)m.n.get(i)).time += mili/1000;
            }
            
            
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
