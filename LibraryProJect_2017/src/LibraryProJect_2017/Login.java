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
					Login frame = new Login("华软图书管理系统登陆页面");
					frame.setResizable(false); //窗口不能缩放
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
		
		
		// P1内添加用户名的文本和文本框
		lab1=new JLabel("学号：");
		Login=new JTextField(15);
		P1=new JPanel();
		P1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));//参数分别代表： 居中，组件的水平和垂直间距;
		P1.add(lab1);
	    P1.add(Login);
	    LoginFieldaction(Login);  //监听登陆文本框
		// P2内添加密码文本和文本框
	    lab2=new JLabel("密码：");
	    psw=new JPasswordField(15);
	    psw.setEchoChar('*');  //密码显示为*;
	    P2=new JPanel();
	    P2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));//参数分别代表： 居中，组件的水平和垂直间距;
	    P2.add(lab2);
	    P2.add(psw);
	    Passwordaction(psw);
	    //将P1,P2加入con2中
	    con2=new JPanel();
	    con2.setLayout(new FlowLayout(FlowLayout.CENTER, 500, 10));//参数分别代表： 居中，组件的水平和垂直间距;
	    con2.add(P1);
	    con2.add(P2);
	    
	    // con3内添加按钮组件
	    P3=new JPanel();
		btn1=new Button("登陆");
		btn2=new Button("退出");
		con3=new JPanel();
		P3.setLayout(new FlowLayout(FlowLayout.CENTER, 45,20 ));//参数分别代表： 居中，组件的水平和垂直间距
		P3.add(btn1);
		P3.add(btn2);
		con3.add(P3);
		ChooseButtonaction(btn1);
		ChooseButtonaction(btn2);
		 
		
		//往Frame内加容器
		this.add("North", con1);
		this.add("Center",con2);
		this.add("South", con3);
	
 		
	}

	   //监听文本框
	   public void TextFieldaction(JTextField tf)
	   {
		   tf.addActionListener(this);
	   }
	   //监听登陆的文本框
	   public void LoginFieldaction(JTextField tf)
	   {
		   tf.addActionListener(this);
		   tf.addKeyListener(new KeyAdapter(){  
	           public void keyTyped(KeyEvent e) {  
	               int keyChar = e.getKeyChar();                 
	               if(keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9){  
	                     
	               }else{  
	                   e.consume(); //屏蔽掉非法输入，设定用户只能数字  
	               }  
	           }  
	       });
	   }
	   
	   
	   //监听密码文本框
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
								     //若登陆成功
								   System.out.print("登陆成功");
								   WindowsOne win=new WindowsOne("华软图书馆管理系统主页面"); 
								    win.Menu();
								     
							       }
							   
							   else
							   {
								  //若登录失败
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
	                   e.consume(); //屏蔽掉非法输入,设定最大长度为18; 
	               }  
	           }  
	       });
	   }
	   
	   //监听按钮操作
	   public void ChooseButtonaction(Button bt)
	   {
		   bt.addActionListener(this);
	   }
	   //来一波监听选择按钮的方法
	   public void actionChoose(String bt) throws SQLException
	   {
		   if(bt.equals("登陆"))
		   {
			   String sql="select * from Login";
			   DBHelper bb=new DBHelper();
			   bb.select(sql, Login.getText(), psw.getText());
			   if(bb.getFlag())
			       {
				     //若登陆成功
				   System.out.print("登陆成功");
				   WindowsOne win=new WindowsOne("华软图书馆管理系统主页面"); 
				    win.Menu();
				     
			       }
			   
			   else
			   {
				  //若登录失败
				   Dialog gg=new Dialog();
				   gg.Dialog();
			   }  
			       
		           
		   }
		   if(bt.equals("退出"))
		   {
			   System.out.print("成功退出！");
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
