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
		WindowsOne frame=new WindowsOne("����ͼ��ݹ���ϵͳ��ҳ��");
		frame.pack();
		frame.setSize(800,500);
		frame.setLocation(280,150);
		frame.setBackground(Color.blue);
		frame.setVisible(true);
	}
	
	
	public void Menu() 
	{
		    WindowsOne f1=new WindowsOne("����ͼ��ݹ���ϵͳ��ҳ��");
		    
		    f1.pack();
		    f1.setSize(800,500);
		    f1.setLocation(280,150);
		    f1.setVisible(true);
		    P1=new JPanel();
			P1.setBackground(Color.CYAN);
			P1.setLayout(new FlowLayout(FlowLayout.CENTER,0,200));
			lab=new JLabel("��ӭ��½����ͼ��ݹ���ϵͳ��");
			lab.setFont(new Font("",1,30));//���������С
			lab.setForeground(Color.BLUE);//����������ɫ

			  JMenuBar mbar = new JMenuBar(); //�����˵���
			  
				//�����˵�����
				JMenu menu1 = new JMenu("ͼ�����");
				JMenu menu2 = new JMenu("���߹���");
				JMenu menu3 = new JMenu("��ѯ");
				JMenu menu4 = new JMenu("�軹�����");
				JMenu menu5 = new JMenu("ϵͳ����");
				
				//����"ͼ�����"�˵���Ӧ�Ĳ˵�����
				JMenuItem menu1Add=new JMenuItem("���ͼ��");
				JMenuItem menu1Upd=new JMenuItem("�޸�ͼ��");
				JMenuItem menu1Del=new JMenuItem("ɾ��ͼ��");
		        menu1.add(menu1Add);
		        menu1.add(menu1Upd);
		        menu1.add(menu1Del);
		        menuaction(menu1Add);
		        menuaction(menu1Upd);
		        menuaction(menu1Del);
		        
		        
		        //����"���߹���"�˵���Ӧ�Ĳ˵�����
		        JMenuItem menu2Add=new JMenuItem("��Ӷ���");
			    JMenuItem menu2Upd=new JMenuItem("�޸Ķ���");
			    JMenuItem menu2Del=new JMenuItem("ɾ������");
			    menu2.add(menu2Add);
			    menu2.add(menu2Upd);
			    menu2.add(menu2Del);
			    menuaction(menu2Add);
		        menuaction(menu2Upd);
		        menuaction(menu2Del);
		        
		        
			    
			    //����"��ѯ"�˵���Ӧ�Ĳ˵�����
			    JMenuItem menu3sel1=new JMenuItem("ͼ���ѯ");
			    JMenuItem menu3sel2=new JMenuItem("���߲�ѯ");
			    menu3.add(menu3sel1);
			    menu3.add(menu3sel2);
			    menuaction(menu3sel1);
		        menuaction(menu3sel2);
		        
		        
			    //����"�軹��"�˵���Ӧ�Ĳ˵�����
			    JMenuItem menu4sel1=new JMenuItem("�������");
			    JMenuItem menu4sel2=new JMenuItem("�������");
			    JMenuItem menu4sel3=new JMenuItem("�軹����ʷ��ѯ");
			    menu4.add(menu4sel1);
			    menu4.add(menu4sel2);
			    menu4.add(menu4sel3);
			    menuaction(menu4sel1);
		        menuaction(menu4sel2);
		        menuaction(menu4sel3);

			    //����"ϵͳ����"�˵���Ӧ�Ĳ˵�����
			    JMenuItem menu5sel1=new JMenuItem("������Ϣ�޸�");
			    JMenuItem menu5sel2=new JMenuItem("�����޸�");
			    JMenuItem menu5sel3=new JMenuItem("�û�����");
			    menu5.add(menu5sel1);
			    menu5.add(menu5sel2);
			    menu5.add(menu5sel3);
			    menuaction(menu5sel1);
		        menuaction(menu5sel2);
		        menuaction(menu5sel3);
			    
			   //���˵���ӵ��˵�����
			    
				mbar.add(menu1);
				mbar.add(menu2);
				mbar.add(menu3);
				mbar.add(menu4);
				mbar.add(menu5);
				
				//���˵������뵽���
				 P1.add(lab);
				 f1.setJMenuBar(mbar);
				 f1.add(P1,"Center");
			  
			 
	}
	 

	
	// �˵�����Ĳ���
	public void menuChoose(String Menu) throws SQLException
	{
		 if(Menu.equals("���ͼ��"))
		 {
			 Addbook addbook=new Addbook("ͼ����Ϣ��� ");
			 addbook.Abook();
		 }
		 if(Menu.equals("�޸�ͼ��"))
		 {
			 Updbook updbook=new Updbook("ͼ����Ϣ�޸� ");
			 updbook.Udbook();
		 }
		 if(Menu.equals("��Ӷ���"))
		 {

		     Readeradd addReader=new Readeradd("������Ϣ��� ");
		     addReader.Rdadd();
		 }
		 if(Menu.equals("ͼ���ѯ"))
		 {
			 select sel=new select("������Ϣ��� ");
			 sel.Sel();
		 }
		 if(Menu.equals("�������"))
		 {
			 Bookborrow bor=new Bookborrow("ͼ����Ĺ��� ");
			 bor.borbook();
		 }
		 if(Menu.equals("�������"))
		 {
			 Returnbook reb=new Returnbook("ͼ����Ϣ�޸� ");
			 reb.rebook();
		 }
		 if(Menu.equals("������Ϣ�޸�"))
		 {
			 
		 }
	}
	public WindowsOne(String title)
	 {
		 super(title);
		  
		 P1=new JPanel();
		 P1.setBackground(Color.CYAN);
		 P1.setLayout(new FlowLayout(FlowLayout.CENTER,0,200));
		 lab=new JLabel("��ӭ��½����ͼ��ݹ���ϵͳ��");
		 lab.setFont(new Font("",1,30));//���������С
		 lab.setForeground(Color.BLUE);//����������ɫ

		  
		 JMenuBar mbar = new JMenuBar(); //�����˵���
			//�����˵�����
			JMenu menu1 = new JMenu("ͼ�����");
			JMenu menu2 = new JMenu("���߹���");
			JMenu menu3 = new JMenu("��ѯ");
			JMenu menu4 = new JMenu("�軹�����");
			JMenu menu5 = new JMenu("ϵͳ����");
			
			//����"ͼ�����"�˵���Ӧ�Ĳ˵�����
			JMenuItem menu1Add=new JMenuItem("���ͼ��");
			JMenuItem menu1Upd=new JMenuItem("�޸�ͼ��");
			JMenuItem menu1Del=new JMenuItem("ɾ��ͼ��");
	        menu1.add(menu1Add);
	        menu1.add(menu1Upd);
	        menu1.add(menu1Del);
	        menuaction(menu1Add);
	        menuaction(menu1Upd);
	        menuaction(menu1Del);
	        
	        
	        //����"���߹���"�˵���Ӧ�Ĳ˵�����
	        JMenuItem menu2Add=new JMenuItem("��Ӷ���");
		    JMenuItem menu2Upd=new JMenuItem("�޸Ķ���");
		    JMenuItem menu2Del=new JMenuItem("ɾ������");
		    menu2.add(menu2Add);
		    menu2.add(menu2Upd);
		    menu2.add(menu2Del);
		    menuaction(menu2Add);
	        menuaction(menu2Upd);
	        menuaction(menu2Del);
	        
	        
		    
		    //����"��ѯ"�˵���Ӧ�Ĳ˵�����
		    JMenuItem menu3sel1=new JMenuItem("ͼ���ѯ");
		    JMenuItem menu3sel2=new JMenuItem("���߲�ѯ");
		    menu3.add(menu3sel1);
		    menu3.add(menu3sel2);
		    menuaction(menu3sel1);
	        menuaction(menu3sel2);
	        
	        
		    //����"�軹��"�˵���Ӧ�Ĳ˵�����
		    JMenuItem menu4sel1=new JMenuItem("�������");
		    JMenuItem menu4sel2=new JMenuItem("�������");
		    JMenuItem menu4sel3=new JMenuItem("�軹����ʷ��ѯ");
		    menu4.add(menu4sel1);
		    menu4.add(menu4sel2);
		    menu4.add(menu4sel3);
		    menuaction(menu4sel1);
	        menuaction(menu4sel2);
	        menuaction(menu4sel3);

		    //����"ϵͳ����"�˵���Ӧ�Ĳ˵�����
		    JMenuItem menu5sel1=new JMenuItem("������Ϣ�޸�");
		    JMenuItem menu5sel2=new JMenuItem("�����޸�");
		    JMenuItem menu5sel3=new JMenuItem("�û�����");
		    menu5.add(menu5sel1);
		    menu5.add(menu5sel2);
		    menu5.add(menu5sel3);
		    menuaction(menu5sel1);
	        menuaction(menu5sel2);
	        menuaction(menu5sel3);
		    
		   //���˵���ӵ��˵�����
		    
			mbar.add(menu1);
			mbar.add(menu2);
			mbar.add(menu3);
			mbar.add(menu4);
			mbar.add(menu5);
			
			//���˵������뵽���
			 P1.add(lab);
			 this.setJMenuBar(mbar);
			 this.add(P1,"Center"); 
			  
	 }
	// �˵������������
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
