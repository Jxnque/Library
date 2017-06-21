package LibraryProJect_2017;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Bookborrow extends JFrame implements ActionListener{
	private JPanel P1,P2,P3,con1,con2,con3;
	private JLabel img;
	private JButton btn1,btn2;
    private JLabel lab []=new JLabel[20];
    private JTextField tf[]=new JTextField[20];
    private String ll[]={"���߱��:","��������:","�ɽ�����:","Ѻ        ��:","�鼮���:","�鼮����:","�鼮���:","�鼮�۸�:","��ǰʱ��:","����Ա:"};
    private Object colname[]={"�鼮���","���߱��","��������","Ӧ������"};
    private JTextArea ta1,ta2;
    private JTable table;
    private JScrollPane jsp;
    private Object data[][],data1[][];
    private DefaultTableModel model;
    private SimpleDateFormat sdf;
    private String dateNow; 
    private String re="2018-01-01";
    public static void main(String args[])
    {
    	Bookborrow bor=new Bookborrow("ͼ����Ĺ��� ");
    	bor.pack();
    	bor.setSize(800,450);
    	bor.setLocation(300,150);
    	bor.setVisible(true);
    }
    public Bookborrow(String title)
    {
    	super(title);
    	 
    	for(int i=0;i<10;i++)
    	{
    		
    		lab[i]=new JLabel(ll[i]);
    		tf[i]=new JTextField(8);
    		ChooseTextField(tf[i]);
    		if(i!=0&&i!=4)
    		{
    			tf[i].setEditable(false);
    			 
    		}
    		
    		
    		
    	}
    	//con1 
    	con1=new JPanel();
    	con1.setVisible(true);
    	 
    	P1=new JPanel();
        P2=new JPanel();
        P1.setBorder(BorderFactory.createLoweredBevelBorder());
        P2.setBorder(BorderFactory.createLoweredBevelBorder()); //б��߿�
        P1.setSize(400,150);
        P2.setSize(400,150);
        P1.setLayout(new GridLayout(4,2,50,5));
        P2.setLayout(new GridLayout(4,2,50,5));
        P1.add(lab[0]);P1.add(tf[0]);
        P1.add(lab[1]);P1.add(tf[1]);
        P1.add(lab[2]);P1.add(tf[2]);
        P1.add(lab[3]);P1.add(tf[3]);
        
        P2.add(lab[4]);P2.add(tf[4]);
        P2.add(lab[5]);P2.add(tf[5]);
        P2.add(lab[6]);P2.add(tf[6]);
        P2.add(lab[7]);P2.add(tf[7]);
    	
    	con1.add(P1,"West");
    	con1.add(P2, "East");
    	
    	//con2 
    	con2=new JPanel();
    	createdata();
    	model= new DefaultTableModel(data,colname); 
		table=new JTable(model);
    	table.setEnabled(false);
    	table.setShowHorizontalLines(false);
    	table.setShowVerticalLines(false);
    	jsp=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    	jsp.setPreferredSize(new Dimension(600,200));
    	con2.add(jsp,"Center");
    	 
    	
    	//con3
    	con3=new JPanel();
        P3=new JPanel();
        P3.setPreferredSize(new Dimension(600,50));
        P3.setLayout(new GridLayout(2,3,10,10));
    	btn1=new JButton("�����ǰͼ��");
    	btn2=new JButton("������м�¼");
    	P3.add(lab[8]);P3.add(tf[8]);P3.add(btn1);
    	P3.add(lab[9]);P3.add(tf[9]);P3.add(btn2);
    	con3.add(P3,"Center");
    	ChooseButtonaction(btn1);
    	ChooseButtonaction(btn2);
    	
    	add(con1,"North");
    	add(con2,"Center");
    	add(con3,"South");
    	 
    }
    public void createdata()
    {
		data=new Object[10][10];
    }
    public void update() throws SQLException
    {
    	//���������ٸ���
    	while(model.getRowCount()>0){
		      model.removeRow(model.getRowCount()-1);
		 }
    	data1=new Object[1][10];
    	DBHelper bb=new DBHelper();
    	String sql="select * from book_reader where ���߱��="+"'"+tf[0].getText().trim()+"'"+" ";
    	bb.Readerselect(sql);
		data1[0]=new Object[]{tf[0].getText().trim(),tf[4].getText().trim(),dateNow,re};
		 
        //���±������
		model= new DefaultTableModel(data1,colname); 
		table.setModel(model);
    }
    public void delete()
    {
    	//���������ٸ���
    	while(model.getRowCount()>0){
		      model.removeRow(model.getRowCount()-1);
		 }
    	for(int i=0;i<8;i++)
    	{
    		tf[i].setText("");
    	}
    }
    JFrame bor=new JFrame("ͼ����Ĺ��� ");
    public void borbook()
    {
     
    	
    	bor.pack();
    	bor.setSize(800,450);
    	bor.setLocation(300,150);
    	bor.setVisible(true);
    	for(int i=0;i<10;i++)
    	{
    		lab[i]=new JLabel(ll[i]);
    		tf[i]=new JTextField(8);
    		if(i!=0&&i!=4)
    		{
    			tf[i].setEditable(false);
    			 
    		}
    		
    		
    		
    	}
    	for(int i=0;i<10;i++)
    	{
    		
    		lab[i]=new JLabel(ll[i]);
    		tf[i]=new JTextField(8);
    		ChooseTextField(tf[i]);
    		if(i!=0&&i!=4)
    		{
    			tf[i].setEditable(false);
    			 
    		}
    		
    		
    		
    	}
    	//con1 
    	con1=new JPanel();
    	con1.setVisible(true);
    	 
    	P1=new JPanel();
        P2=new JPanel();
        P1.setBorder(BorderFactory.createLoweredBevelBorder());
        P2.setBorder(BorderFactory.createLoweredBevelBorder()); //б��߿�
        P1.setSize(400,150);
        P2.setSize(400,150);
        P1.setLayout(new GridLayout(4,2,50,5));
        P2.setLayout(new GridLayout(4,2,50,5));
        P1.add(lab[0]);P1.add(tf[0]);
        P1.add(lab[1]);P1.add(tf[1]);
        P1.add(lab[2]);P1.add(tf[2]);
        P1.add(lab[3]);P1.add(tf[3]);
        
        P2.add(lab[4]);P2.add(tf[4]);
        P2.add(lab[5]);P2.add(tf[5]);
        P2.add(lab[6]);P2.add(tf[6]);
        P2.add(lab[7]);P2.add(tf[7]);
    	
    	con1.add(P1,"West");
    	con1.add(P2, "East");
    	
    	//con2 
    	con2=new JPanel();
    	createdata();
    	model= new DefaultTableModel(data,colname); 
		table=new JTable(model);
    	table.setEnabled(false);
    	table.setShowHorizontalLines(false);
    	table.setShowVerticalLines(false);
    	jsp=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    	jsp.setPreferredSize(new Dimension(600,200));
    	con2.add(jsp,"Center");
    	 
    	
    	//con3
    	con3=new JPanel();
        P3=new JPanel();
        P3.setPreferredSize(new Dimension(600,50));
        P3.setLayout(new GridLayout(2,3,10,10));
    	btn1=new JButton("�����ǰͼ��");
    	btn2=new JButton("������м�¼");
    	P3.add(lab[8]);P3.add(tf[8]);P3.add(btn1);
    	P3.add(lab[9]);P3.add(tf[9]);P3.add(btn2);
    	con3.add(P3,"Center");
    	ChooseButtonaction(btn1);
    	ChooseButtonaction(btn2);
    	
    	
    	bor.add(con1,"North");
    	bor.add(con2,"Center");
    	bor.add(con3,"South");
     
    }
    //������ť����
    public void ChooseButtonaction(JButton bt)
    {
        bt.addActionListener(this);
    } 
    //�����ı�����
	   public void ChooseTextField(JTextField tf)
    {
	    tf.addActionListener(this); 
    }
    public void actionPerformed(ActionEvent e)
    {
    	String bt=e.getActionCommand();
    	DBHelper bb=new DBHelper();
    	String Usql="update book_fmag set �Ƿ����='��' where ����="+"'"+tf[4].getText().trim()+"'"+"";
    	String sql1="select * from book_reader where ���߱��="+"'"+tf[0].getText().trim()+"'"+" ";
    	String sql2="select * from book_mag where ͼ����="+"'"+tf[4].getText().trim()+"'"+" ";
    	String sql3="delete from book_mag where ͼ����="+"'"+tf[4].getText().trim()+"'"+" ";
    	String sql4="delete from book_reader where ���߱��="+"'"+tf[0].getText().trim()+"'"+" ";
    	String sql="insert into borrow(���߱��,�鼮���,��������,�鼮����,����ʱ��,Ӧ��ʱ��,ͼ�����) values(?,?,?,?,?,?,?)";
    	
    	if(bt.equals("�����ǰͼ��"))
    	{
    		Date d = new Date(); 
    	    sdf = new SimpleDateFormat("yyyy-MM-dd");
    		dateNow = sdf.format(d);  
    	try {
    		bb.update(Usql);
    		bb.Readerselect(sql1);
    		int num=Integer.parseInt(bb.borrowable());
			bb.borrow(sql, tf[0].getText().trim(), tf[4].getText().trim(),tf[1].getText().trim(), tf[5].getText().trim(), dateNow.trim(), re,tf[6].getText().trim());
			 
			if(num==0) 
			{
				Dialog gg=new Dialog();
				gg.Dialog7();
			}
			else
			{
				String n=Integer.toString(num-1);
				String upsql="update book_reader set ��������="+"'"+n+"'"+" where ���߱��="+"'"+tf[0].getText().trim()+"'"+" ";
				bb.update(upsql);
				bb.Readerselect(sql1);
				tf[1].setText(bb.name());
				tf[2].setText(bb.borrowable());
				tf[3].setText(bb.pmoney());
				bb.Bookselect(sql2);
				tf[5].setText(bb.name());
				tf[6].setText(bb.borrowable());
				tf[7].setText(bb.pmoney());
				update();
			}
			
			tf[8].setText(dateNow);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        }
    	if(bt.equals("������м�¼"))
    	{
    		delete();
			tf[9].setText("Nan");
			Dialog gg=new Dialog();
			gg.Dialog5();
    	}
      }
}
