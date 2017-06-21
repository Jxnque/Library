package LibraryProJect_2017;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class WindowsOne extends JFrame implements ActionListener{
	
	
	private JPanel P1;
	private JLabel lab;
	public static void main(String args[])
	{
		WindowsOne frame=new WindowsOne("华软图书馆管理系统主页面");
		frame.pack();
		frame.setSize(800,500);
		frame.setLocation(280,150);
		frame.setBackground(Color.blue);
		frame.setVisible(true);
	}
	
	
	public void Menu() 
	{
		    WindowsOne f1=new WindowsOne("华软图书馆管理系统主页面");
		    
		    f1.pack();
		    f1.setSize(800,500);
		    f1.setLocation(280,150);
		    f1.setVisible(true);
		    P1=new JPanel();
			P1.setBackground(Color.CYAN);
			P1.setLayout(new FlowLayout(FlowLayout.CENTER,0,200));
			lab=new JLabel("欢迎登陆华软图书馆管理系统！");
			lab.setFont(new Font("",1,30));//设置字体大小
			lab.setForeground(Color.BLUE);//设置字体颜色

			  JMenuBar mbar = new JMenuBar(); //创建菜单条
			  
				//创建菜单对象
				JMenu menu1 = new JMenu("图书管理");
				JMenu menu2 = new JMenu("读者管理");
				JMenu menu3 = new JMenu("查询");
				JMenu menu4 = new JMenu("借还书管理");
				JMenu menu5 = new JMenu("系统管理");
				
				//创建"图书管理"菜单对应的菜单对象
				JMenuItem menu1Add=new JMenuItem("添加图书");
				JMenuItem menu1Upd=new JMenuItem("修改图书");
				JMenuItem menu1Del=new JMenuItem("删除图书");
		        menu1.add(menu1Add);
		        menu1.add(menu1Upd);
		        menu1.add(menu1Del);
		        menuaction(menu1Add);
		        menuaction(menu1Upd);
		        menuaction(menu1Del);
		        
		        
		        //创建"读者管理"菜单对应的菜单对象
		        JMenuItem menu2Add=new JMenuItem("添加读者");
			    JMenuItem menu2Upd=new JMenuItem("修改读者");
			    JMenuItem menu2Del=new JMenuItem("删除读者");
			    menu2.add(menu2Add);
			    menu2.add(menu2Upd);
			    menu2.add(menu2Del);
			    menuaction(menu2Add);
		        menuaction(menu2Upd);
		        menuaction(menu2Del);
		        
		        
			    
			    //创建"查询"菜单对应的菜单对象
			    JMenuItem menu3sel1=new JMenuItem("图书查询");
			    JMenuItem menu3sel2=new JMenuItem("读者查询");
			    menu3.add(menu3sel1);
			    menu3.add(menu3sel2);
			    menuaction(menu3sel1);
		        menuaction(menu3sel2);
		        
		        
			    //创建"借还书"菜单对应的菜单对象
			    JMenuItem menu4sel1=new JMenuItem("借书管理");
			    JMenuItem menu4sel2=new JMenuItem("还书管理");
			    JMenuItem menu4sel3=new JMenuItem("借还书历史查询");
			    menu4.add(menu4sel1);
			    menu4.add(menu4sel2);
			    menu4.add(menu4sel3);
			    menuaction(menu4sel1);
		        menuaction(menu4sel2);
		        menuaction(menu4sel3);

			    //创建"系统设置"菜单对应的菜单对象
			    JMenuItem menu5sel1=new JMenuItem("个人信息修改");
			    JMenuItem menu5sel2=new JMenuItem("密码修改");
			    JMenuItem menu5sel3=new JMenuItem("用户管理");
			    menu5.add(menu5sel1);
			    menu5.add(menu5sel2);
			    menu5.add(menu5sel3);
			    menuaction(menu5sel1);
		        menuaction(menu5sel2);
		        menuaction(menu5sel3);
			    
			   //将菜单添加到菜单条中
			    
				mbar.add(menu1);
				mbar.add(menu2);
				mbar.add(menu3);
				mbar.add(menu4);
				mbar.add(menu5);
				
				//将菜单条加入到框架
				 P1.add(lab);
				 f1.setJMenuBar(mbar);
				 f1.add(P1,"Center");
			  
			 
	}
	 

	
	// 菜单对象的操作
	public void menuChoose(String Menu) throws SQLException
	{
		 if(Menu.equals("添加图书"))
		 {
			 Addbook addbook=new Addbook("图书信息添加 ");
			 addbook.Abook();
		 }
		 if(Menu.equals("修改图书"))
		 {
			 Updbook updbook=new Updbook("图书信息修改 ");
			 updbook.Udbook();
		 }
		 if(Menu.equals("添加读者"))
		 {

		     Readeradd addReader=new Readeradd("读者信息添加 ");
		     addReader.Rdadd();
		 }
		 if(Menu.equals("图书查询"))
		 {
			 select sel=new select("读者信息添加 ");
			 sel.Sel();
		 }
		 if(Menu.equals("借书管理"))
		 {
			 Bookborrow bor=new Bookborrow("图书借阅管理 ");
			 bor.borbook();
		 }
		 if(Menu.equals("还书管理"))
		 {
			 Returnbook reb=new Returnbook("图书信息修改 ");
			 reb.rebook();
		 }
		 if(Menu.equals("个人信息修改"))
		 {
			 
		 }
	}
	public WindowsOne(String title)
	 {
		 super(title);
		  
		 P1=new JPanel();
		 P1.setBackground(Color.CYAN);
		 P1.setLayout(new FlowLayout(FlowLayout.CENTER,0,200));
		 lab=new JLabel("欢迎登陆华软图书馆管理系统！");
		 lab.setFont(new Font("",1,30));//设置字体大小
		 lab.setForeground(Color.BLUE);//设置字体颜色

		  
		 JMenuBar mbar = new JMenuBar(); //创建菜单条
			//创建菜单对象
			JMenu menu1 = new JMenu("图书管理");
			JMenu menu2 = new JMenu("读者管理");
			JMenu menu3 = new JMenu("查询");
			JMenu menu4 = new JMenu("借还书管理");
			JMenu menu5 = new JMenu("系统管理");
			
			//创建"图书管理"菜单对应的菜单对象
			JMenuItem menu1Add=new JMenuItem("添加图书");
			JMenuItem menu1Upd=new JMenuItem("修改图书");
			JMenuItem menu1Del=new JMenuItem("删除图书");
	        menu1.add(menu1Add);
	        menu1.add(menu1Upd);
	        menu1.add(menu1Del);
	        menuaction(menu1Add);
	        menuaction(menu1Upd);
	        menuaction(menu1Del);
	        
	        
	        //创建"读者管理"菜单对应的菜单对象
	        JMenuItem menu2Add=new JMenuItem("添加读者");
		    JMenuItem menu2Upd=new JMenuItem("修改读者");
		    JMenuItem menu2Del=new JMenuItem("删除读者");
		    menu2.add(menu2Add);
		    menu2.add(menu2Upd);
		    menu2.add(menu2Del);
		    menuaction(menu2Add);
	        menuaction(menu2Upd);
	        menuaction(menu2Del);
	        
	        
		    
		    //创建"查询"菜单对应的菜单对象
		    JMenuItem menu3sel1=new JMenuItem("图书查询");
		    JMenuItem menu3sel2=new JMenuItem("读者查询");
		    menu3.add(menu3sel1);
		    menu3.add(menu3sel2);
		    menuaction(menu3sel1);
	        menuaction(menu3sel2);
	        
	        
		    //创建"借还书"菜单对应的菜单对象
		    JMenuItem menu4sel1=new JMenuItem("借书管理");
		    JMenuItem menu4sel2=new JMenuItem("还书管理");
		    JMenuItem menu4sel3=new JMenuItem("借还书历史查询");
		    menu4.add(menu4sel1);
		    menu4.add(menu4sel2);
		    menu4.add(menu4sel3);
		    menuaction(menu4sel1);
	        menuaction(menu4sel2);
	        menuaction(menu4sel3);

		    //创建"系统设置"菜单对应的菜单对象
		    JMenuItem menu5sel1=new JMenuItem("个人信息修改");
		    JMenuItem menu5sel2=new JMenuItem("密码修改");
		    JMenuItem menu5sel3=new JMenuItem("用户管理");
		    menu5.add(menu5sel1);
		    menu5.add(menu5sel2);
		    menu5.add(menu5sel3);
		    menuaction(menu5sel1);
	        menuaction(menu5sel2);
	        menuaction(menu5sel3);
		    
		   //将菜单添加到菜单条中
		    
			mbar.add(menu1);
			mbar.add(menu2);
			mbar.add(menu3);
			mbar.add(menu4);
			mbar.add(menu5);
			
			//将菜单条加入到框架
			 P1.add(lab);
			 this.setJMenuBar(mbar);
			 this.add(P1,"Center"); 
			  
	 }
	// 菜单对象监听机制
	public void menuaction(JMenuItem Menu)
	{
		Menu.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String M=e.getActionCommand();
		try {
			menuChoose(M);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}  
	 
}
