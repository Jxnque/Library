package LibraryProJect_2017;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Dialog implements ActionListener{
 
	private JButton btn;
	private JPanel p1,p2;
	private JDialog dig;
	public void Dialog()
	{
		btn=new JButton("确认");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("账号、密码输入有误！"));
		p1.setPreferredSize(new Dimension(50,50));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p2.setPreferredSize(new Dimension(50,50));
		p2.add(btn,"Center");
		dig.setLayout(new BorderLayout());
		dig.add(p1,"Center");
		dig.add(p2, "South");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              dig.dispose();
			}
			});
		  
	}
	public void Dialog1()
	{
		btn=new JButton("确认");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("请详细填好信息！"));
		p1.setPreferredSize(new Dimension(50,50));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p2.setPreferredSize(new Dimension(50,50));
		p2.add(btn,"Center");
		dig.setLayout(new BorderLayout());
		dig.add(p1,"Center");
		dig.add(p2, "South");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              dig.dispose();
			}
			});
		  
	}
	public void Dialog2()
	{
		btn=new JButton("确认");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("日期填写格式错误！"));
		p1.setPreferredSize(new Dimension(50,50));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p2.setPreferredSize(new Dimension(50,50));
		p2.add(btn,"Center");
		dig.setLayout(new BorderLayout());
		dig.add(p1,"Center");
		dig.add(p2, "South");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              dig.dispose();
			}
			});
		  
	}
	public void Dialog3()
	{
		btn=new JButton("确认");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("添加成功！"));
		p1.setPreferredSize(new Dimension(50,50));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p2.setPreferredSize(new Dimension(50,50));
		p2.add(btn,"Center");
		dig.setLayout(new BorderLayout());
		dig.add(p1,"Center");
		dig.add(p2, "South");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              dig.dispose();
			}
			});
		  
	}
	public void Dialog4()
	{
		btn=new JButton("确认");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("修改成功！"));
		p1.setPreferredSize(new Dimension(50,50));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p2.setPreferredSize(new Dimension(50,50));
		p2.add(btn,"Center");
		dig.setLayout(new BorderLayout());
		dig.add(p1,"Center");
		dig.add(p2, "South");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              dig.dispose();
			}
			});
		  
	}
	public void Dialog5()
	{	
		btn=new JButton("确认");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("记录清除！"));
		p1.setPreferredSize(new Dimension(50,50));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p2.setPreferredSize(new Dimension(50,50));
		p2.add(btn,"Center");
		dig.setLayout(new BorderLayout());
		dig.add(p1,"Center");
		dig.add(p2, "South");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              dig.dispose();
			}
			});
		  
	}
	public void Dialog6()
	{	
		btn=new JButton("确认");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("归还成功！"));
		p1.setPreferredSize(new Dimension(50,50));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p2.setPreferredSize(new Dimension(50,50));
		p2.add(btn,"Center");
		dig.setLayout(new BorderLayout());
		dig.add(p1,"Center");
		dig.add(p2, "South");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              dig.dispose();
			}
			});
		  
	}
	public void Dialog7()
	{	
		btn=new JButton("确认");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("您借书已经超出允许范围,请及时还书！"));
		p1.setPreferredSize(new Dimension(50,50));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p2.setPreferredSize(new Dimension(50,50));
		p2.add(btn,"Center");
		dig.setLayout(new BorderLayout());
		dig.add(p1,"Center");
		dig.add(p2, "South");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              dig.dispose();
			}
			});
		  
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 
		
	}
	 
}
