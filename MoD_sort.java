import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

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
  public int[] unsorted = new int[20];
  int n = unsorted.length;
  int a = 0;
  
  private JLabel lAnzahlVergleiche = new JLabel();
  private JNumberField versucheNF = new JNumberField();
  private JLabel jLabel1 = new JLabel();
  // Ende Attribute
  
  public MoD_sort() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 945; 
    int frameHeight = 194;
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
    jLabel1.setBounds(232, 120, 110, 20);
    jLabel1.setText("text");
    cp.add(jLabel1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public MoD_sort
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new MoD_sort();
  } // end of main
  
  public void bGeneriere_ActionPerformed(ActionEvent evt) {
    //Generierung und Ausgabe der unsortierten Zufallszahlen (voreingestellte Maximall�nge: 80 Zahlen)
    int laenge = Math.min(laengeNF.getInt(),20);
    for (int i = 0;i<20 ;i++ ) {
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
           for (int i = 0; i < n; i++) {
               for (int b = 1; b < (n-i); b++) {
                   if (unsorted[b-1] > unsorted[b]) {
                      a = unsorted[b-1];
                      unsorted[b-1] = unsorted[b];
                      unsorted[b] = a;
          
          } // end of if
        
        }

      }
   
    for (int u=0; u < unsorted.length ;u++ ) {
      sortLabel.setText(";" + unsorted[u]);
    } // end of for
    
    
      
      
      
    
            
   
  
    }// TODO - hier sind Sie gefragt: Sortieren Sie die Zahlen im array unsorted aufsteigend!
    
  } // end of bSort_ActionPerformed

  // Ende Methoden
 // end of class MoD_sort
