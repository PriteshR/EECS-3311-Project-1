package shape;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	static int load = 0;
	int a[][] = {{50,90} ,{130,160} ,{210, 230} ,{290,300} ,{370,370} ,{450,440}};
	static int i = 0;
	
	static sort shapes[] = new sort[6];
	/**
	 * This method creates two rectangles
	 * @return
	 */
	private MyRectangle createRectangle(int id, int x, int y, int w, int h){
		Color myColor1 = new Color((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
		MyRectangle rectangleShape1 = new MyRectangle (id, x, y, w, h, myColor1);
		
		
		return rectangleShape1;
	}
	
	private MyCircle createCircle(int id, int x, int y, int r) {
		Color myColor1 = new Color((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
		MyCircle CircleShape = new MyCircle (id, x , y, r, myColor1);
		
		return CircleShape;
		
	}
	
	
	/**
	 * This method displays the created rectangles.
	 */
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D) g;
      
      //calling the method that creates two shapes (rectangles)
      
      if(load==1) {
    	  try {
    	  for(; i<6; i++) {
    		  
    		  int x = ((int) getRandomNumber(1, 4));
    		  
    		  switch(x) {
    		  	case 1:
    		  		int l = (int) getRandomNumber(25,70);
    		  		int b = (int) getRandomNumber(25,50);
    		  		MyRectangle rect = createRectangle(i, a[i][0], a[i][1], l, b);
    		    	g2d.setColor(rect.getColor());
    		    	
    		    	sort s = new sort(a[i][0], a[i][1], 0, l, b, rect.getArea(), false, rect.getColor());
    		    	
    		    	shapes[i] = s;
    		    	rect.drawShape(g2d);
    		    	break;
    		    	
    		  	case 2:
    		  		int r = (int) getRandomNumber(20,40);
    		  		MyCircle circle = createCircle(i, a[i][0], a[i][1], r);
    		    	g2d.setColor(circle.getColor());
    		    	
    		    	sort s1 = new sort(a[i][0], a[i][1], r, 0, 0, circle.getArea(), true, circle.getColor());
    		    	
    		    	shapes[i] = s1;
    		    	circle.drawShape(g2d);
    		    	break;
    		    	
    		  	case 3:
    		  		int l1 = (int) getRandomNumber(40, 70);
    		  		MyRectangle rect1 = createRectangle(i, a[i][0], a[i][1], l1, l1);
    		    	g2d.setColor(rect1.getColor());
    		    	
    		    	sort s2 = new sort(a[i][0], a[i][1], 0, l1, l1, rect1.getArea(), false, rect1.getColor());
    		    	
    		    	shapes[i] = s2;
    		    	rect1.drawShape(g2d);
    		    	break;
    		    	
    		    default:
    		    	int l2 = (int) getRandomNumber(25,70);
    		  		int b2 = (int) getRandomNumber(25,50);
    		  		MyRectangle rect2 = createRectangle(i, a[i][0], a[i][1], l2, b2);
    		    	g2d.setColor(rect2.getColor());
    		    	
    		    	sort s3 = new sort(a[i][0], a[i][1], 0, l2, b2, rect2.getArea(), false, rect2.getColor());
    		    	
    		    	shapes[i] = s3;
    		    	rect2.drawShape(g2d);
    		    	break;
    		  }
    		  
    	  }
    	  }catch(Exception e) {
    		  
    	  }
      }
      
      if(load==2) {
    	  
    	  for(int i = 0 ; i<6 ;i++) {
    		  try {
    			  if(shapes[i].isItCircle()) {
    				  MyCircle circle3 = createCircle(i, a[i][0], a[i][1], shapes[i].getr());
      		    	  g2d.setColor(shapes[i].getColor());
      		    	  circle3.drawShape(g2d);
    			  } else {
    				  MyRectangle recto = createRectangle(i, a[i][0], a[i][1], shapes[i].getl(), shapes[i].getb());
      		    	  g2d.setColor(shapes[i].getColor());
      		    	  recto.drawShape(g2d);
    			  }
    		  } catch (Exception e) {
    			  
    		  }
    	  }
      }
   } 
   
   static void BubbleSort(sort shape[]) {
	   
	   sort temp;
	   
	   
	   for(int i=0;i<5;i++) {
		   for(int j=0;j<6-i-1;j++) {
			   if(shape[j].getArea()>shape[j+1].getArea()) {
				   temp = shape[j];
				   shape[j] = shape[j+1];
				   shape[j+1] = temp;
			   }
		   }
	   }
	   
   }
   

/**
    * This is the main method of the class.
    * @param args
    */
   public static void main(String[] args) {
      MyPanel rects = new MyPanel();
      JFrame frame = new JFrame("Display Shapes");
      JButton loadShapes = new JButton("Load shapes");
      JButton SortShapes = new JButton("Sort shapes");
      loadShapes.setBounds(170, 10, 130, 50);
      SortShapes.setBounds(300, 10, 130, 50);
      
      loadShapes.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			load = 1;
			i=0;
			frame.repaint();
		}
      });
    
      SortShapes.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			BubbleSort(shapes);
			load = 2;
			frame.repaint();
		}
    	  
      });
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(loadShapes);
      frame.add(SortShapes);
      
      frame.add(rects);
      
      frame.setSize(600, 600);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
   
   public int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
}
