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
		btn=new JButton("ȷ��");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("�˺š�������������"));
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
		btn=new JButton("ȷ��");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("����ϸ�����Ϣ��"));
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
		btn=new JButton("ȷ��");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("������д��ʽ����"));
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
		btn=new JButton("ȷ��");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("��ӳɹ���"));
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
		btn=new JButton("ȷ��");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("�޸ĳɹ���"));
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
		btn=new JButton("ȷ��");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("��¼�����"));
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
		btn=new JButton("ȷ��");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("�黹�ɹ���"));
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
		btn=new JButton("ȷ��");
		p1=new JPanel();
		p2=new JPanel();
		dig=new JDialog();		
		dig.setSize(350,150);
		dig.setLocation(500,250);
		dig.setVisible(true);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,10));
		p1.add(new Label("�������Ѿ���������Χ,�뼰ʱ���飡"));
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
