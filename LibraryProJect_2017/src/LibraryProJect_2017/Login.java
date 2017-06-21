package LibraryProJect_2017;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener,KeyListener {

	private JPanel P1;
	private JPanel P2;
	private JPanel P3;
	private JPanel con3;
	private JPanel con1;
	private JPanel con2;
	private Button btn1;
	private Button btn2;
	private JLabel lab1;
	private JLabel lab2;
	private JLabel aot;
	private JTextField Login;
	private JPasswordField psw;
	public static void main(String[] args) {
		 
				try {
					Login frame = new Login("����ͼ�����ϵͳ��½ҳ��");
					frame.setResizable(false); //���ڲ�������
					frame.setVisible(true);
					frame.setLocation(450, 200);
					frame.setSize(500,350);
					frame.addWindowListener(new WindowAdapter()
				 	   {
				 		   public void windowClosing(WindowEvent e)
				 		   {
				 		      frame.dispose();	  
				 		   }
				 	   });
				} catch (Exception e) {
					e.printStackTrace();
				}
			
	
	}
 
	public Login(String title){
		super(title); 
		//con1
		con1=new JPanel();
		ImageIcon image = new ImageIcon("7.jpg");
		aot=new JLabel();
		aot.setIcon(image);
		 image.setImage(image.getImage().getScaledInstance(500,150,Image.SCALE_DEFAULT));
		con1.add(aot);
		
		
		// P1������û������ı����ı���
		lab1=new JLabel("ѧ�ţ�");
		Login=new JTextField(15);
		P1=new JPanel();
		P1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));//�����ֱ���� ���У������ˮƽ�ʹ�ֱ���;
		P1.add(lab1);
	    P1.add(Login);
	    LoginFieldaction(Login);  //������½�ı���
		// P2����������ı����ı���
	    lab2=new JLabel("���룺");
	    psw=new JPasswordField(15);
	    psw.setEchoChar('*');  //������ʾΪ*;
	    P2=new JPanel();
	    P2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));//�����ֱ���� ���У������ˮƽ�ʹ�ֱ���;
	    P2.add(lab2);
	    P2.add(psw);
	    Passwordaction(psw);
	    //��P1,P2����con2��
	    con2=new JPanel();
	    con2.setLayout(new FlowLayout(FlowLayout.CENTER, 500, 10));//�����ֱ���� ���У������ˮƽ�ʹ�ֱ���;
	    con2.add(P1);
	    con2.add(P2);
	    
	    // con3����Ӱ�ť���
	    P3=new JPanel();
		btn1=new Button("��½");
		btn2=new Button("�˳�");
		con3=new JPanel();
		P3.setLayout(new FlowLayout(FlowLayout.CENTER, 45,20 ));//�����ֱ���� ���У������ˮƽ�ʹ�ֱ���
		P3.add(btn1);
		P3.add(btn2);
		con3.add(P3);
		ChooseButtonaction(btn1);
		ChooseButtonaction(btn2);
		 
		
		//��Frame�ڼ�����
		this.add("North", con1);
		this.add("Center",con2);
		this.add("South", con3);
	
 		
	}

	   //�����ı���
	   public void TextFieldaction(JTextField tf)
	   {
		   tf.addActionListener(this);
	   }
	   //������½���ı���
	   public void LoginFieldaction(JTextField tf)
	   {
		   tf.addActionListener(this);
		   tf.addKeyListener(new KeyAdapter(){  
	           public void keyTyped(KeyEvent e) {  
	               int keyChar = e.getKeyChar();                 
	               if(keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9){  
	                     
	               }else{  
	                   e.consume(); //���ε��Ƿ����룬�趨�û�ֻ������  
	               }  
	           }  
	       });
	   }
	   
	   
	   //���������ı���
	   public void Passwordaction(JPasswordField psw)
	   {
		   psw.addActionListener(this);
		   psw.addKeyListener(new KeyAdapter()
		   {
			   public void keyTyped(KeyEvent e)
			   {
				   if(e.getKeyChar() == KeyEvent.VK_ENTER)  
			        {  
				      	   String sql="select * from Login";
							   DBHelper bb=new DBHelper();
							   try {
								bb.select(sql, Login.getText(), psw.getText());
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							   if(bb.getFlag())
							       {
								     //����½�ɹ�
								   System.out.print("��½�ɹ�");
								   WindowsOne win=new WindowsOne("����ͼ��ݹ���ϵͳ��ҳ��"); 
								    win.Menu();
								     
							       }
							   
							   else
							   {
								  //����¼ʧ��
								   Dialog gg=new Dialog();
								   gg.Dialog();
							   }   
				    
						
					}          
			   }
		   });
		   psw.addKeyListener(new KeyAdapter(){  
	           public void keyTyped(KeyEvent e) {  
	               int keyChar = e.getKeyChar();
	               int len=psw.getText().length();
	               if(len<=10){  
	                     return;
	               }else{  
	            	   if((keyChar==KeyEvent.VK_TAB)||e.isActionKey())
	            		         return;
	                   e.consume(); //���ε��Ƿ�����,�趨��󳤶�Ϊ18; 
	               }  
	           }  
	       });
	   }
	   
	   //������ť����
	   public void ChooseButtonaction(Button bt)
	   {
		   bt.addActionListener(this);
	   }
	   //��һ������ѡ��ť�ķ���
	   public void actionChoose(String bt) throws SQLException
	   {
		   if(bt.equals("��½"))
		   {
			   String sql="select * from Login";
			   DBHelper bb=new DBHelper();
			   bb.select(sql, Login.getText(), psw.getText());
			   if(bb.getFlag())
			       {
				     //����½�ɹ�
				   System.out.print("��½�ɹ�");
				   WindowsOne win=new WindowsOne("����ͼ��ݹ���ϵͳ��ҳ��"); 
				    win.Menu();
				     
			       }
			   
			   else
			   {
				  //����¼ʧ��
				   Dialog gg=new Dialog();
				   gg.Dialog();
			   }  
			       
		           
		   }
		   if(bt.equals("�˳�"))
		   {
			   System.out.print("�ɹ��˳���");
			   System.exit(0); 
		   }
	   }
	 
	   public void actionPerformed(ActionEvent e)
	   {
		 
	       
		   String bt=e.getActionCommand();
		   try {
			actionChoose(bt);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	   }

	@Override
	public void keyPressed(KeyEvent e) {
		 
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		  
	}
	@Override
	public void keyTyped(KeyEvent e) {
	 
		
	}
	    
	   
	   
}
