import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleContext;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Credits
  extends JFrame
{
  private JButton jButton1;
  private JButton jButton2;
  private JLabel jLabel1;
  
  public Credits()
  {
    super("Tournament Random 1v1 - by Internall");
    getContentPane().setBackground(Color.DARK_GRAY);
    initComponents();
    setResizable(false);
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);
  }
  
  private void initComponents()
  {
    this.jButton1 = new JButton();
    this.jButton1.setFont(new Font("Sitka Subheading", 0, 14));
    this.jButton1.setIcon(new ImageIcon(Credits.class.getResource("/imgs/youtube.png")));
    this.jButton2 = new JButton();
    this.jButton2.setFont(new Font("Sitka Subheading", 0, 14));
    this.jButton2.setIcon(new ImageIcon(Credits.class.getResource("/imgs/lala.png")));
    this.jLabel1 = new JLabel();
    this.jLabel1.setForeground(Color.WHITE);
    
    setDefaultCloseOperation(3);
    
    this.jButton1.setBackground(Color.LIGHT_GRAY);
    this.jButton1.setText("Youtube Channel");
    this.jButton1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Credits.this.jButton1ActionPerformed(evt);
      }
    });
    this.jButton2.setBackground(Color.LIGHT_GRAY);
    this.jButton2.setText("PayPal");
    this.jButton2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Credits.this.jButton2ActionPerformed(evt);
      }
    });
    this.jLabel1.setBackground(new Color(51, 255, 153));
    this.jLabel1.setFont(new Font("Trebuchet MS", 1, 19));
    this.jLabel1.setText("Created by M");
    
    JButton btnBack = new JButton("BACK");
    btnBack.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        Credits.this.setVisible(false);
        Credits.this.dispose();
        Frame s = new Frame();
        s.setVisible(true);
      }
    });
    btnBack.setFont(new Font("Sitka Text", 0, 11));
    
    JLabel lblSpecialThanksTo = new JLabel("Special Thanks to Everyone");
    lblSpecialThanksTo.setFont(new Font("Trebuchet MS", 1, 13));
    lblSpecialThanksTo.setForeground(Color.WHITE);
    
    JProgressBar progressBar = new JProgressBar();
    progressBar.setForeground(Color.PINK);
    
    GroupLayout layout = new GroupLayout(getContentPane());
    layout.setHorizontalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addGap(194)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.jButton2, -2, 165, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 88, 32767)
      .addComponent(btnBack)
      .addGap(21))
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.jButton1, -2, 165, -2)
      .addContainerGap(170, 32767))))
      .addGroup(layout.createSequentialGroup()
      .addGap(32)
      .addComponent(this.jLabel1, -2, 275, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 47, 32767)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(lblSpecialThanksTo, -1, -1, 32767)
      .addComponent(progressBar, -2, -1, -2))
      .addContainerGap()));
    
    layout.setVerticalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(btnBack))
      .addGroup(layout.createSequentialGroup()
      .addGap(6)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel1, -2, 96, -2)
      .addGroup(layout.createSequentialGroup()
      .addComponent(progressBar, -2, -1, -2)
      .addGap(9)
      .addComponent(lblSpecialThanksTo)))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jButton1, -2, 70, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, 32767)
      .addComponent(this.jButton2, -2, 69, -2)))
      .addGap(25)));
    
    getContentPane().setLayout(layout);
    
    this.jButton2.getAccessibleContext().setAccessibleName("b");
    
    pack();
  }
  
  private void jButton2ActionPerformed(ActionEvent evt)
  {
    Desktop broswer = Desktop.getDesktop();
    try
    {
      broswer.browse(new URI("my pp account.com"));
    }
    catch (IOException localIOException) {}catch (URISyntaxException localURISyntaxException) {}
  }
  
  private void jButton1ActionPerformed(ActionEvent evt)
  {
    Desktop broswer = Desktop.getDesktop();
    try
    {
      broswer.browse(new URI("my private yt channel!"));
    }
    catch (IOException localIOException) {}catch (URISyntaxException localURISyntaxException) {}
  }
  
  public static void main(String[] args)
  {
    try
    {
      UIManager.LookAndFeelInfo[] arrayOfLookAndFeelInfo;
      int j = (arrayOfLookAndFeelInfo = UIManager.getInstalledLookAndFeels()).length;
      for (int i = 0; i < j; i++)
      {
        UIManager.LookAndFeelInfo info = arrayOfLookAndFeelInfo[i];
        if ("Nimbus".equals(info.getName()))
        {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Credits().setVisible(true);
      }
    });
  }
}
