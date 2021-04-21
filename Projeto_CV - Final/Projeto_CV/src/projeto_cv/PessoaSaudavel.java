package projeto_cv;
import java.util.Random;
/**
 *
 * @author Pedraum
 */
public class PessoaSaudavel extends Pessoa implements IMovable{
    Random g = new Random();
    public boolean vacinada;
    public boolean virus;
    public float time = 0;
    
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

    public PessoaSaudavel() {
        setCor(3);
        setX(g.nextInt(30));
        setY(g.nextInt(60));
        vacinada = false;
        virus = false;
    }

    public boolean isVacinada() {
        return vacinada;
    }

    public void setVacinada(boolean vacinada) {
        this.vacinada = vacinada;
    }

    public boolean isVirus() {
        return virus;
    }

    public void setVirus(boolean virus) {
        this.virus = virus;
    }
    public PessoaSaudavel(int x, int y) {
        setCor(3);
        setX(x);
        setY(y);
        vacinada = false;
        virus = true;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }
    
    
}
