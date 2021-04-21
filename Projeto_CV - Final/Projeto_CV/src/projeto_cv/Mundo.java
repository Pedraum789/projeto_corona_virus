/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_cv;
import java.util.ArrayList;

/**
 *
 * @author Pedraum
 */
public class Mundo {
    
    private int[][] mapa = new int[][]
    {
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,1},
        {1,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,1},
        {1,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,1},
        {1,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,1},
        {1,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    
    //Iniciando os arrays
    public ArrayList<Pessoa> n = new ArrayList<>();
    public ArrayList<Pessoa> n2 = new ArrayList<>();
    
    
    public void atualizaMundo(){
        //Auxiliar
        ArrayList<Pessoa> aux = new ArrayList<>(n);
        ArrayList<Pessoa> aux2 = new ArrayList<>(n2);
        
        
        
        //PessoaSaudavel entra em contato com PessoaDoente
        for(int i=0;i<n.size();i++){
            for(int j=0;j<n2.size();j++){
                try{
                    if(((PessoaSaudavel)n.get(i)).isVacinada() == false &&
                        
                        ((n.get(i).getX() <= n2.get(j).getX() + 1) && 
                        (n.get(i).getX() >= n2.get(j).getX() - 1)) &&
                        
                        ((n.get(i).getY() <= n2.get(j).getY() + 1) && 
                        (n.get(i).getY() >= n2.get(j).getY() - 1))){
                        
                        n2.add(new PessoaDoente(n.get(i).getX(), n.get(i).getY() ));
                        n.remove(i);
                    
                    }
                }
                catch(Exception e){
                    
                }
            }
        }
        
        //PessoaSaudavel entra no hospital
        for(int i=0;i<n.size();i++){
            try{
                if((((n.get(i).getX() >= 4) && (n.get(i).getX() <= 8) && (n.get(i).getY() >= 5) && (n.get(i).getY() <= 13)) ||
                    ((n.get(i).getX() >= 4) && (n.get(i).getX() <= 8) && (n.get(i).getY() >= 46) && (n.get(i).getY() <= 54))||
                    ((n.get(i).getX() >= 23) && (n.get(i).getX() <= 27) && (n.get(i).getY() >= 30) && (n.get(i).getY() <= 38)))){

                    ((PessoaSaudavel)n.get(i)).setVacinada(true);
                    n.get(i).setCor(5);
                }
            }
            catch(Exception e){

            }
        }
        
        //PessoaDoente entra no hospital
        for(int i=0;i<n2.size();i++){
            try{
                if((((n2.get(i).getX() >= 4) && (n2.get(i).getX() <= 8) && (n2.get(i).getY() >= 5) && (n2.get(i).getY() <= 13)) ||
                    ((n2.get(i).getX() >= 4) && (n2.get(i).getX() <= 8) && (n2.get(i).getY() >= 46) && (n2.get(i).getY() <= 54))||
                    ((n2.get(i).getX() >= 23) && (n2.get(i).getX() <= 27) && (n2.get(i).getY() >= 30) && (n2.get(i).getY() <= 38)))){

                    n.add(new PessoaSaudavel(n2.get(i).getX(), n2.get(i).getY()));
                    n2.remove(i);
                }
            }
            catch(Exception e){

            }
        }
        
        //PessoaSaudavel vascinada, entra em contato com PessoaDoente
        for(int i=0;i<n.size();i++){
            for(int j=0;j<n2.size();j++){
                try{
                    if(((PessoaSaudavel)n.get(i)).isVacinada() == true &&
                        
                        ((n.get(i).getX() <= n2.get(j).getX() + 1) && 
                         (n.get(i).getX() >= n2.get(j).getX() - 1)) &&

                        ((n.get(i).getY() <= n2.get(j).getY() + 1) && 
                         (n.get(i).getY() >= n2.get(j).getY() - 1))){

                        ((PessoaSaudavel)n.get(i)).setVirus(true);
                        n.get(i).setCor(6);
                    }
                }
                catch(Exception e){
                    
                }
            }
        }
        
        //PessoaSaudavel sai o virus
        for(int i=0;i<n.size();i++){
            try{
                if(((PessoaSaudavel)n.get(i)).isVacinada() == true &&
                   ((PessoaSaudavel)n.get(i)).isVirus() == true &&
                   ((PessoaSaudavel)n.get(i)).getTime() >= 30){
                    
                    ((PessoaSaudavel)n.get(i)).setVirus(false);
                    n.get(i).setCor(5);
                    ((PessoaSaudavel)n.get(i)).setTime(0);
                }
            }
            catch(Exception e){

            }
        }
        
        //PessoaMorre
        for(int i=0;i<n2.size();i++){
            try{
                if(((PessoaDoente)n2.get(i)).getTime() >= 30){
                    n2.remove(i);
                }
            }
            catch(Exception e){

            }
        }
        
        //Troca as cores que foram retiradas para as originais (PessoaSaudavel)
        for(int i=0;i<aux.size();i++){
            if((aux.get(i).getX() == 0) || (aux.get(i).getY() == 0) || (aux.get(i).getX() == 29) || (aux.get(i).getY() == 59)){
                mapa[aux.get(i).getX()][aux.get(i).getY()] = 1;
            }
            else if(((aux.get(i).getX() >= 4) && (aux.get(i).getX() <= 8) && (aux.get(i).getY() >= 5) && (aux.get(i).getY() <= 13)) ||
                    ((aux.get(i).getX() >= 4) && (aux.get(i).getX() <= 8) && (aux.get(i).getY() >= 46) && (aux.get(i).getY() <= 54))||
                    ((aux.get(i).getX() >= 23) && (aux.get(i).getX() <= 27) && (aux.get(i).getY() >= 30) && (aux.get(i).getY() <= 38))){
                mapa[aux.get(i).getX()][aux.get(i).getY()] = 2;
            }
            else{
                mapa[aux.get(i).getX()][aux.get(i).getY()] = 0;
            }
        }
        
        //Troca as cores que foram retiradas para as originais (PessoaDoente)
        for(int i=0;i<aux2.size();i++){
            if((aux2.get(i).getX() == 0) || (aux2.get(i).getY() == 0) || (aux2.get(i).getX() == 29) || (aux2.get(i).getY() == 59)){
                mapa[aux2.get(i).getX()][aux2.get(i).getY()] = 1;
            }
            else if(((aux2.get(i).getX() >= 4) && (aux2.get(i).getX() <= 8) && (aux2.get(i).getY() >= 5) && (aux2.get(i).getY() <= 13)) ||
                    ((aux2.get(i).getX() >= 4) && (aux2.get(i).getX() <= 8) && (aux2.get(i).getY() >= 46) && (aux2.get(i).getY() <= 54))||
                    ((aux2.get(i).getX() >= 23) && (aux2.get(i).getX() <= 27) && (aux2.get(i).getY() >= 30) && (aux2.get(i).getY() <= 38))){
                mapa[aux2.get(i).getX()][aux2.get(i).getY()] = 2;
            }
            else{
                mapa[aux2.get(i).getX()][aux2.get(i).getY()] = 0;
            }
        }
        
        //Movimento PessoaDoente
        for(int i=0;i<n2.size();i++){
            ((PessoaDoente)n2.get(i)).mover();
        }
        
        //Movimento PessoaSaudavel
        for(int i=0;i<n.size();i++){
            ((PessoaSaudavel)n.get(i)).mover();
        }
        
        //Pessoa Doente
        for(int i=0;i<n2.size();i++){
            mapa[n2.get(i).getX()][n2.get(i).getY()] = n2.get(i).getCor();
        }
        
        //Pessoa Saudavel
        for(int i=0;i<n.size();i++){
            mapa[n.get(i).getX()][n.get(i).getY()] = n.get(i).getCor();
        }
        
        
    }
    
    public void desenhaMundo(){
        for(int i=0; i < mapa.length; i++){
            for(int j=0; j < mapa[i].length; j++){
                switch(mapa[i][j]){
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("\033[47m \033[0m");
                        break;
                    case 2:
                        System.out.print("\033[45m \033[0m");
                        break;
                    case 3:
                        System.out.print("\033[44m \033[0m");
                        break;
                    case 4:
                        System.out.print("\033[41m \033[0m");
                        break;
                    case 5:
                        System.out.print("\033[43m \033[0m");
                        break;
                    case 6:
                        System.out.print("\033[42m \033[0m");
                        break;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
