package CursoJavaTrheds;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.SimpleAttributeSet;

public class TelaTimeThread extends JDialog{
	
	
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	
	private JLabel DescricaoHora = new JLabel("Time Thred 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel DescricaoHora2 = new JLabel("Time Thred 2");
	private JTextField mostraTempo2= new JTextField();
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton(" Stop ");
	
   private Runnable thread1 = new Runnable() {
	
	@Override
	public void run() {
		
		while(true) {
	mostraTempo.setText(new SimpleDateFormat("dd/MM/yyy hh:mm.ss").format(Calendar.getInstance().getTime()));
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
					
		}
		
	}
};

private Runnable thread2 = new Runnable() {
	
	@Override
	public void run() {
		
		while(true) {
	mostraTempo.setText(new SimpleDateFormat("dd/MM/yyy hh:mm.ss").format(Calendar.getInstance().getTime()));
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
					
		}
		
	}
};


 private Thread thread1Time;
 private Thread thread2Time;
	
	public TelaTimeThread() {
		
			
		setTitle("Minha tela de time com thread.");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		/* Primeira parte concluida*/
		
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx =0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;
		
		DescricaoHora.setPreferredSize(new Dimension(200,25)); //label
		jPanel.add(DescricaoHora, gridBagConstraints);
	
		mostraTempo.setPreferredSize(new Dimension(200,25));
		mostraTempo.setEditable(false);
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo, gridBagConstraints);
		
	
	     DescricaoHora2.setPreferredSize(new Dimension(200,25)); // label Descri??o
	     gridBagConstraints.gridy++;
	     jPanel.add(DescricaoHora2,gridBagConstraints);
	     
	     mostraTempo2.setPreferredSize(new Dimension(200,25)); // Caixa de testo
	     mostraTempo2.setEditable(false);
	     gridBagConstraints.gridy++;
	     jPanel.add(mostraTempo2, gridBagConstraints);
	     
	     gridBagConstraints.gridwidth = 1;
		 jButton.setPreferredSize(new Dimension(92,25));
		 gridBagConstraints.gridy++;
		 jPanel.add(jButton, gridBagConstraints);
		 
		 jButton.setPreferredSize(new Dimension(92,25));
		 gridBagConstraints.gridx++;
		 jPanel.add(jButton2, gridBagConstraints);
		 
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			thread1Time = new Thread(thread1);
			thread1Time.start();
			
			thread2Time = new Thread(thread2);
			thread2Time.start();
				
				
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				thread2Time.stop();
				
				
			}
		});
		add(jPanel, BorderLayout.WEST);
		setVisible(true);
	}
	
	
	

}
