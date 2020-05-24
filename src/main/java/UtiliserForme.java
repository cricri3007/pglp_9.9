import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.List;  

public class UtiliserForme implements Forme{

private int.x;
private int.y;
private string type;

 List<Forme> formes = new ArrayList<Forme>();  
 
     @Override  
     public void add(Forme forme) {  
        formes.add(forme);  
     }  

 @Override  
     public void deplacer(Forme forme, int x, int y) {  
     forme.centrex=x;
     forme.centrey=y;
     }  
     
     @Override
     public void afficher (Forme forme){
     System.out.println("Cette forme "+this.type);
     System.out.println("est aux coordonnées " +this.centrex +this.centrey);
     }
     
     @Override
     public void remove(Forme forme){
     formes.remove(forme);
     }
}
