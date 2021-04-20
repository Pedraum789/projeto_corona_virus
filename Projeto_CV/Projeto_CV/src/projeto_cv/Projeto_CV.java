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
        Mundo m = new Mundo();
        for(int c=0;c<100;c++){
            m.n.add(new PessoaSaudavel());
        }
        
        for(int c=0;c<2;c++){
            m.n2.add(new PessoaDoente());
        }
        
        while(true){
            
            m.desenhaMundo();
            m.atualizaMundo();
            m.atualizaMundo2();
            m.desenhaMundo();

            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
