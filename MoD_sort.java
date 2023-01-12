import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Arrays;
import java.lang.Math;


/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 23.02.2022
 * @author 
 */

public class MoD_sort extends JFrame {
  // Anfang Attribute
  private JButton bGeneriere = new JButton();
  private JButton bSort = new JButton();
  private JNumberField laengeNF = new JNumberField();
  private JLabel unsortLabel = new JLabel();
  private JLabel sortLabel = new JLabel();
  public int[] unsorted;
  
  
  
  
  private JLabel lAnzahlVergleiche = new JLabel();
  private JNumberField versucheNF = new JNumberField();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JLabel jLabel6 = new JLabel();
  // Ende Attribute
  
  public MoD_sort() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 945; 
    int frameHeight = 237;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Sortieren von Zufallszahlen");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    bGeneriere.setBounds(6, 10, 131, 25);
    bGeneriere.setText("Generiere Zahlen");
    bGeneriere.setMargin(new Insets(2, 2, 2, 2));
    bGeneriere.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bGeneriere_ActionPerformed(evt);
      }
    });
    cp.add(bGeneriere);
    bSort.setBounds(6, 78, 131, 25);
    bSort.setText("Sortiere");
    bSort.setMargin(new Insets(2, 2, 2, 2));
    bSort.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSort_ActionPerformed(evt);
      }
    });
    cp.add(bSort);
    laengeNF.setBounds(144, 10, 41, 25);
    laengeNF.setText("20");
    cp.add(laengeNF);
    unsortLabel.setBounds(14, 43, 902, 25);
    unsortLabel.setText("");
    cp.add(unsortLabel);
    sortLabel.setBounds(14, 115, 910, 25);
    sortLabel.setText("");
    cp.add(sortLabel);
    lAnzahlVergleiche.setBounds(144, 72, 117, 33);
    lAnzahlVergleiche.setText("Anzahl Vergleiche:");
    cp.add(lAnzahlVergleiche);
    versucheNF.setBounds(256, 72, 65, 33);
    versucheNF.setText("");
    versucheNF.setEditable(false);
    cp.add(versucheNF);
    jLabel1.setBounds(332, 71, 70, 36);
    jLabel1.setText("Worst Case: ");
    cp.add(jLabel1);
    jLabel2.setBounds(326, 9, 78, 36);
    jLabel2.setText("Best Case: ");
    cp.add(jLabel2);
    jLabel3.setBounds(410, 11, 110, 36);
    jLabel3.setText("");
    cp.add(jLabel3);
    jLabel4.setBounds(404, 77, 110, 36);
    jLabel4.setText("");
    cp.add(jLabel4);
    jLabel5.setBounds(7, 139, 110, 28);
    jLabel5.setText("Durchschnitt:");
    cp.add(jLabel5);
    jLabel6.setBounds(126, 131, 110, 36);
    jLabel6.setText("");
    cp.add(jLabel6);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public MoD_sort
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new MoD_sort();
  } // end of main
  
  public void bGeneriere_ActionPerformed(ActionEvent evt) {
    //Generierung und Ausgabe der unsortierten Zufallszahlen (voreingestellte Maximall�nge: 80 Zahlen)
    int laenge = Math.min(laengeNF.getInt(),laengeNF.getInt());
    unsorted = new int[laengeNF.getInt()];
    for (int i = 0;i<laengeNF.getInt() ;i++ ) {
      unsorted[i] = 0;
    } // end of for
    
    for (int k = 0;k < laenge ;k++ ) {
      unsorted[k] = (int)(Math.random()*100);
    } // end of for
    
    unsortLabel.setText("" + unsorted[0]);
    for (int j = 1;j < laenge ;j++ ) {
      unsortLabel.setText(unsortLabel.getText() + ";" + unsorted[j]);
    } // end of for
    
  } // end of bGeneriere_ActionPerformed 

    public void bSort_ActionPerformed(ActionEvent evt) {
      int a = 0;
      int vergleiche = 0;
           for (int i = 0; i < unsorted.length; i++) {
               for (int b = 1; b < (unsorted.length - i); b++) {
                   vergleiche++;
                   if (unsorted[b-1] > unsorted[b]) {
                      a = unsorted[b-1]; //Hier beginnt 
                      unsorted[b-1] = unsorted[b];
                      unsorted[b] = a;
          
          } // end of if
        
      }
      
    
    }
    sortLabel.setText("");
    
  for (int i = 0 ;i < unsorted.length ;i++ ) {
      sortLabel.setText(sortLabel.getText() + unsorted[i]+".");
     }           
  versucheNF.setText(vergleiche + "."); vergleiche = 0;
   jLabel3.setText(laengeNF.getInt()+ "");
   jLabel4.setText(laengeNF.getInt() * laengeNF.getInt() + "");
   jLabel6.setText(0,25 * (Math.pow(laengeNF.getInt(), 2) - laengeNF.getInt()) + "");
   
    }
  
  
  
 }// end of class MoD_sort
