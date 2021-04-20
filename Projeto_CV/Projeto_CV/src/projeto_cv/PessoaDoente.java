package projeto_cv;
import java.util.Random;
/**
 *
 * @author Pedraum
 */
public class PessoaDoente extends Pessoa implements IMovable{
    Random g = new Random();
    
    public void mover(){
        int random = g.nextInt(4);
        //Andar para direita
        if(random == 0){
            if(getX() == 29){
                setX(0);
            }
            else{
                setX(getX() + 1);
            }            
        }
        //Andar para esquerda
        else if(random == 1){
            if(getX() == 0){
                setX(29);
            }
            else{
                setX(getX() - 1);
            }
        }
        //Andar para baixo
        else if(random == 2){
            if(getY() == 59){
                setY(0);
            }
            else{
                setY(getY() + 1);
            }
        }
        else{
            if(getY() == 0){
                setY(59);
            }
            else{
                setY(getY() - 1);
            }
        }
    }

    public PessoaDoente() {
        setCor(1);
        setX(g.nextInt(30));
        setY(g.nextInt(60));
    }
    
    
}
