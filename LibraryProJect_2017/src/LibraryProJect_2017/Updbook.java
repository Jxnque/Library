package LibraryProJect_2017;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Updbook extends JFrame implements ActionListener{
	
	private JPanel P0,P1,P2,P3,con1,con2,con3,con4,con;
	private JLabel img;
	private JButton btn1,btn2,btn3;
	private JTable table;
	private Object[][] data; 
	private Object[][] data1;
	private Object[][] data2;
    private JLabel lab []=new JLabel[10];
    private JTextField tf[]=new JTextField[10];
    private String ll[]={"书           号:","作          者:","出  版   日   期:","类          别	:","出     版    社:","单          价","书          名:","译          者:"};
	private JScrollPane jsp;
	private  String[] colname = {"图书编号","书名","出版社","出版日期","类别","作者","译者","单价"};
	private JTextArea ta;
	private JComboBox<String> jcb;
	private String s;
    private DefaultTableModel model;
    public static void main(String args[])throws SQLException
	{
		Updbook upd=new Updbook("图书信息修改 ");
    	upd.pack();
    	upd.setSize(800,450);
    	upd.setLocation(300,150);
    	upd.setVisible(true);
	}
	public Updbook(String title) throws SQLException
	{
		super(title);
		/*
		 
		for(int i=0;i<8;i++)
        {
        	lab[i]=new JLabel(ll[i]);
        	tf[i]=new JTextField(10);
        	ChooseTextField(tf[i]);
        }
		
		//con1为顶部的框架
    	con1=new JPanel();
    	ImageIcon image = new ImageIcon("7.jpg");
    	img=new JLabel();
    	img.setIcon(image);
    	image.setImage(image.getImage().getScaledInstance(800,100,Image.SCALE_DEFAULT));
    	con1.add(img);
    	
    	//con2
    	data =new Object[10][10];
    	con2=new JPanel();
    	con2.setLayout(new BorderLayout());
    	createdata();
    	con2.add(jsp,"Center");
    
 	
    	//con3+con4=con
    	con=new JPanel();
    	for(int i=0;i<8;i++)
        {
        	lab[i]=new JLabel(ll[i]);
        	tf[i]=new JTextField(10);
        }
    	String dateFormat = new String("2017-05-19");
    	tf[2].setEditable(false);
    	tf[2].setBackground(Color.green);
    	tf[2].setText(dateFormat);
    	String[] move2 = { "软件工程", "计算机系", "网络系" };
        jcb = new JComboBox<String>(move2);
    	jcb.setPreferredSize(new Dimension(30,10));
    	Choosecombobox(jcb);
    	con3=new JPanel();
    	P0 =new JPanel();
    	P1 =new JPanel();
    	P2 =new JPanel();
        P0.setLayout(new GridLayout(3,2,0,10));
        P1.setLayout(new GridLayout(3,2,0,10));
        P2.setLayout(new GridLayout(3,2,0,10));
        P0.add(lab[0]);
        P0.add(tf[0]);
        P0.add(lab[1]);
        P0.add(tf[1]);
        P0.add(lab[2]);
        P0.add(tf[2]);
        P1.add(lab[3]);
        P1.add(jcb);
        P1.add(lab[4]);
        P1.add(tf[4]);
        P1.add(lab[5]);
        P1.add(tf[5]);
        P2.add(lab[6]);
        P2.add(tf[6]);
        P2.add(lab[7]);
        P2.add(tf[7]);
         
        con3.add(P0);
        con3.add(P1);
        con3.add(P2);
    	
    	 
        P3=new JPanel();
    	con4=new JPanel();
    	btn1=new JButton("修改");
    	btn2=new JButton("关闭");
    	ChooseButtonaction(btn1);
    	ChooseButtonaction(btn2);
    	con4.setBorder(new EtchedBorder(EtchedBorder.RAISED));  //设置边界
    	P3.setLayout(new FlowLayout(FlowLayout.RIGHT,50,5));
    	con4.setLayout(new FlowLayout(FlowLayout.RIGHT,-50,0));
    	P3.add(btn1);
    	P3.add(btn2);
    	con4.add(P3);
    	con.setLayout(new BorderLayout());
    	con.add("Center",con3);
    	con.add("South",con4);
    	
    	
    	this.add(con1,"North");
    	this.add(con2,"Center");
    	this.add(con,"South");
    	*/
	}
	
    	
	JFrame frame=new JFrame("图书信息修改 ");
	public void Udbook() throws SQLException  
	{
		
		
		frame.pack();
		frame.setSize(800,450);
		frame.setLocation(300,150);
		frame.setVisible(true);
		
		for(int i=0;i<8;i++)
        {
        	lab[i]=new JLabel(ll[i]);
        	tf[i]=new JTextField(10);
        	ChooseTextField(tf[i]);
        }
		
		//con1为顶部的框架
    	con1=new JPanel();
    	ImageIcon image = new ImageIcon("7.jpg");
    	img=new JLabel();
    	img.setIcon(image);
    	image.setImage(image.getImage().getScaledInstance(800,100,Image.SCALE_DEFAULT));
    	con1.add(img);
    	
    	//con2
    	data =new Object[10][10];
    	con2=new JPanel();
    	con2.setLayout(new BorderLayout());
    	createdata();
    	con2.add(jsp,"Center");
    
 	
    	//con3+con4=con
    	con=new JPanel();
    	for(int i=0;i<8;i++)
        {
        	lab[i]=new JLabel(ll[i]);
        	tf[i]=new JTextField(10);
        }
    	String dateFormat = new String("2017-05-19");
    	tf[2].setBackground(Color.green);
    	tf[2].setText(dateFormat);
    	String[] move2 = { "软件工程", "计算机系", "网络系" };
        jcb = new JComboBox<String>(move2);
    	jcb.setPreferredSize(new Dimension(30,10));
    	Choosecombobox(jcb);
    	con3=new JPanel();
    	P0 =new JPanel();
    	P1 =new JPanel();
    	P2 =new JPanel();
        P0.setLayout(new GridLayout(3,2,0,10));
        P1.setLayout(new GridLayout(3,2,0,10));
        P2.setLayout(new GridLayout(3,2,0,10));
        P0.add(lab[0]);
        P0.add(tf[0]);
        P0.add(lab[1]);
        P0.add(tf[1]);
        P0.add(lab[2]);
        P0.add(tf[2]);
        P1.add(lab[3]);
        P1.add(jcb);
        P1.add(lab[4]);
        P1.add(tf[4]);
        P1.add(lab[5]);
        P1.add(tf[5]);
        P2.add(lab[6]);
        P2.add(tf[6]);
        P2.add(lab[7]);
        P2.add(tf[7]);
         
        con3.add(P0);
        con3.add(P1);
        con3.add(P2);
    	
    	 
        P3=new JPanel();
    	con4=new JPanel();
    	btn2=new JButton("修改");
    	btn3=new JButton("关闭");
    	ChooseButtonaction(btn2);
    	ChooseButtonaction(btn3);
    	con4.setBorder(new EtchedBorder(EtchedBorder.RAISED));  //设置边界
    	P3.setLayout(new FlowLayout(FlowLayout.RIGHT,50,5));
    	con4.setLayout(new FlowLayout(FlowLayout.RIGHT,-50,0));
    	P3.add(btn2);
    	P3.add(btn3);
    	con4.add(P3);
    	con.setLayout(new BorderLayout());
    	con.add("Center",con3);
    	con.add("South",con4);
    	
    	
    	frame.add(con1,"North");
    	frame.add(con2,"Center");
    	frame.add(con,"South");
    		 
	}

	//创建表格数据
	public void createdata() throws SQLException
	{
		
		DBHelper bb=new DBHelper();
		data=new Object[20][10];
		String sql="select * from book_mag";
		bb.Query(sql);
		for(int i=0;i<20;i++)
		{
			data[i]=new Object[]{bb.s1return1(i),bb.s1return2(i),bb.s1return3(i),bb.s1return4(i),bb.s1return5(i),bb.s1return6(i),bb.s1return7(i),bb.s1return8(i)};
		}
		model= new DefaultTableModel(data,colname); 
		table=new JTable(model);
    	table.setEnabled(true);
    	jsp=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    	table.addMouseListener(new MouseAdapter(){    //鼠标事件
            public void mouseClicked(MouseEvent e){
                int selectedRow = table.getSelectedRow(); //获得选中行索引
                Object o1 = model.getValueAt(selectedRow, 0);
                Object o2 = model.getValueAt(selectedRow, 5);
                Object o3 = model.getValueAt(selectedRow, 3);
                
                Object o4 = model.getValueAt(selectedRow, 4);
                Object o5 = model.getValueAt(selectedRow, 2);
                Object o6 = model.getValueAt(selectedRow, 7);
                
                Object o7 = model.getValueAt(selectedRow, 1);
                Object o8 = model.getValueAt(selectedRow, 6);
                 
                tf[0].setText(o1.toString());  //给文本框赋值
                tf[1].setText(o2.toString());
                tf[2].setText(o3.toString());
                
                jcb.setSelectedItem(o4);  //给文本框赋值
                tf[4].setText(o5.toString());
                tf[5].setText(o6.toString());
                
                tf[6].setText(o7.toString());  //给文本框赋值
                tf[7].setText(o8.toString());
             
            }
        });
    	table.addKeyListener(new KeyAdapter()//键盘监听按钮
		        {
	           public void keyPressed(KeyEvent e)
	           {
	        	   int selectedRow = table.getSelectedRow(); //获得选中行索引
	                Object o1 = model.getValueAt(selectedRow, 0);
	                Object o2 = model.getValueAt(selectedRow, 5);
	                Object o3 = model.getValueAt(selectedRow, 3);
	                
	                Object o4 = model.getValueAt(selectedRow, 4);
	                Object o5 = model.getValueAt(selectedRow, 2);
	                Object o6 = model.getValueAt(selectedRow, 7);
	                
	                Object o7 = model.getValueAt(selectedRow, 1);
	                Object o8 = model.getValueAt(selectedRow, 6);
	                 
	                tf[0].setText(o1.toString());  //给文本框赋值
	                tf[1].setText(o2.toString());
	                tf[2].setText(o3.toString());
	                
	                jcb.setSelectedItem(o4);  //给文本框赋值
	                tf[4].setText(o5.toString());
	                tf[5].setText(o6.toString());
	                
	                tf[6].setText(o7.toString());  //给文本框赋值
	                tf[7].setText(o8.toString());
	               }
	        	    
	        	    
	           });
		             
		         
	}
	//监听按钮操作
    public void ChooseButtonaction(JButton bt)
    {
        bt.addActionListener(this);
    } 
    //监听文本操作
	   public void ChooseTextField(JTextField tf)
    {
	    tf.addActionListener(this); 
    }
    //监听下拉框选项
	 public void Choosecombobox(JComboBox b)
    {
	    b.addActionListener(this);
    }
	//下拉选项的值
     public void comboboxreturn() 
    {
	  
	   s=jcb.getSelectedItem().toString();
	} 
    //修改信息方法
	public void update() throws SQLException
	{
		DBHelper bb=new DBHelper();
		comboboxreturn();
		String tf0=tf[0].getText().toString();
		String tf1=tf[1].getText().toString();
		String tf2=tf[2].getText().toString();
		String tf4=tf[4].getText().toString();
		String tf5=tf[5].getText().toString();
		String tf6=tf[6].getText().toString();
		String tf7=tf[7].getText().toString();
		String sql="update book_mag set 作者="+"'"+tf1+"'"+",出版日期="+"'"+tf2+"'"+",类别="+"'"+s+"'"+",出版社="+"'"+tf4+"'"+",单价="+"'"+tf5+"'"+",书名="+"'"+tf6+"'"+",译者="+"'"+tf7+"'"+"  where 图书编号="+"'"+tf0+"'"+"";
		String sql1="update book_fmag set 作者="+"'"+tf1+"'"+",出版社="+"'"+tf4+"'"+",书名="+"'"+tf6+"'"+"  where 书号="+"'"+tf0+"'"+"";
		bb.update(sql);
		bb.update(sql1);
	}
	public void updateTable() throws SQLException
    {
    	//清除表格东西再更新
    	while(model.getRowCount()>0){
		      model.removeRow(model.getRowCount()-1);
		 }
    	data1=new Object[20][10];
    	DBHelper bb=new DBHelper();
    	String sql="select * from book_mag";
		bb.Query(sql);
		for(int i=0;i<20;i++)
		{
			data1[i]=new Object[]{bb.s1return1(i),bb.s1return2(i),bb.s1return3(i),bb.s1return4(i),bb.s1return5(i),bb.s1return6(i),bb.s1return7(i),bb.s1return8(i)};
		}
        //更新表格数据
		model= new DefaultTableModel(data1,colname); 
		table.setModel(model);
    }
	 
	 
	public void actionPerformed(ActionEvent e)
    {
		String bt=e.getActionCommand();
		Dialog gg=new Dialog();
		comboboxreturn();
		if(bt.equals("修改"))
		{
			if(tf[0].getText().toString().equals("")||s.equals("")||tf[1].getText().toString().equals("")||tf[2].getText().toString().equals("")||tf[4].getText().toString().equals("")||tf[5].getText().toString().equals("")||tf[6].getText().toString().equals("")||tf[7].getText().toString().equals(""))
			{
				gg.Dialog1();
			}
			else
			{
				boolean flag=true;
    			String m=tf[2].getText();
    			int a=m.indexOf('-');
    			if(a<0)
    			{
    				flag=false;
    			}
    			else
    			{
    				int b=m.indexOf('-',a+1);
    				if(a!=4&&b!=7) flag=false;
    			}
    			if(flag)
    			{
    				
    				try {
						update();
						updateTable();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
    				
    				gg.Dialog4();
    			}
    			else
    			{
 
 				     gg.Dialog2();
    			}
			}
		}
		if(bt.equals("关闭"))
		{
			 frame.dispose();
		}
		 
    }
}
