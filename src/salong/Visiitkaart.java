package salong;
import java.applet.Applet;
import java.awt.*;

public class Visiitkaart extends Applet { 
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
        int w = getWidth(); // Akna suurus
        int h = getHeight(); 
        
        w=1800;
        h=1800;
        
        
        int x0 = getWidth() / 2; // Keskpunkt
        int y0 = getHeight() / 2;
        int r = Math.min(w / 2, h /2); // Raadius
        int x, y;
        double t;
       
        g.setColor(Color.green); // Tausa värv
        g.fillRect(0, 0, w, h);
        g.setColor(Color.yellow);

        setSize(500,500);  // Appleti akna suurus
        
        for (t = -Math.PI; t < Math.PI; t = t + Math.PI / 16) { // Kasutasin praktikumide materjale
            x = (int) (r * Math.cos(t) + x0);                     
            y = (int) (r * Math.sin(t) + y0);                   
            g.drawLine(x0, y0, x, y);                            
            
          
          Font f = new Font ("Dialog", Font.BOLD, 24);
          g.setFont (f);
          g.drawString("Külastage meid jälle, päikest!", 100, 100);
         
        	
        }
    }
    }

