package LibraryProJect_2017;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.AncestorListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class select extends JFrame implements ActionListener {
 
	private JPanel P1,P2,P3,con1,con2,con3;
	private JLabel img;
	private JButton btn1,btn2;
    private JLabel lab []=new JLabel[10];
    private JLabel lab1,lab2;
    private JTextField tfd;
    private JTextField tf[]=new JTextField[10];
    private String colname[]={"书名","出版社","作者","书号","购进时间","是否借阅","是否预约"};
    private JRadioButton sel1,sel2;
    private JTable table;
    private JScrollPane jsp;
    private Object data [][];
    private boolean b1,b2;
    private JComboBox<String> jcb;
    private String s,s1;
    private boolean bol=true;
    private DefaultTableModel model;
    private Object data1[][];
    public static void main(String args[]) throws SQLException
    {
    	select sel=new select("书本信息查询 ");
    	sel.pack();
    	sel.setSize(600,350);
    	sel.setLocation(500,150);
    	sel.setVisible(true);
    }
 
   public select(String title) throws SQLException 
   {
	/*测试
	 * 
	 * 
	super(title);
	String move[]={"书名","出版社","作者","书号","购进时间","是否借阅","是否预约"};
	for(int i=0;i<7;i++)
	{
		lab[i]=new JLabel(move[i]);
		tf[i]=new JTextField(10);
		ChooseTextField(tf[i]);
		if(i>0)
		{
			tf[i].setEditable(false);
		}
	}   
    //con1为顶部的框架
	con1=new JPanel();
	con1.setLayout(new GridLayout(2,1,0,5));
   	P1=new JPanel();
   	sel1=new JRadioButton("简单查询",true);
   	Radio(sel1);
   	P1.setLayout(new FlowLayout(FlowLayout.LEFT,50,5));
   	
    jcb=new JComboBox<String>(move);
   	jcb.setPreferredSize(new Dimension(100,20));
   	Choosecombobox(jcb);
   	btn1=new JButton("提交");
   	ChooseButtonaction(btn1);
   	P1.add(sel1);P1.add(jcb);P1.add(tf[0]);P1.add(btn1);
     
  	 
     
     P2=new JPanel();
 	 sel2=new JRadioButton("高级查询",false);
 	 Radio(sel2);
 	 P2.setLayout(new FlowLayout(FlowLayout.LEFT,10,5));
 	 P2.add(sel2);
 	 P2.add(lab[0]);P2.add(tf[1]);P2.add(lab[1]);P2.add(tf[2]);P2.add(lab[2]);P2.add(tf[3]);
 	 con1.add(P1);
 	 con1.add(P2);
 	 
 	 
 	 
 	//con2
 	
 	con2=new JPanel();
 	con2.setLayout(new BorderLayout());
 	createdata();
 	
 	con2.add(jsp,"Center");
 	 
 	 
 	
 	
 	 
 	ButtonGroup group=new ButtonGroup();  
    group.add(sel1);  
    group.add(sel2); 
   	add(con1,"North");
   	add(con2,"Center") ;
    */
   }
   JFrame sel=new JFrame("书本信息查询 ");
   public void Sel() throws SQLException
   {
	     
	   
       sel.pack();
   	   sel.setSize(600,350);
   	   sel.setLocation(500,150);
   	   sel.setVisible(true);
	   String move[]={"书名","出版社","作者","书号","购进时间","是否借阅","是否预约"};
	for(int i=0;i<7;i++)
	{
		lab[i]=new JLabel(move[i]);
		tf[i]=new JTextField(10);
		ChooseTextField(tf[i]);
		if(i>0)
		{
			tf[i].setEditable(false);
		}
	}   
    //con1为顶部的框架
	con1=new JPanel();
	con1.setLayout(new GridLayout(2,1,0,5));
   	P1=new JPanel();
   	sel1=new JRadioButton("简单查询",true);
   	Radio(sel1);
   	P1.setLayout(new FlowLayout(FlowLayout.LEFT,50,5));
   	
    jcb=new JComboBox<String>(move);
   	jcb.setPreferredSize(new Dimension(100,20));
   	Choosecombobox(jcb);
   	btn1=new JButton("提交");
   	ChooseButtonaction(btn1);
   	P1.add(sel1);P1.add(jcb);P1.add(tf[0]);P1.add(btn1);
     
  	 
     
     P2=new JPanel();
 	 sel2=new JRadioButton("高级查询",false);
 	 Radio(sel2);
 	 P2.setLayout(new FlowLayout(FlowLayout.LEFT,10,5));
 	 P2.add(sel2);
 	 P2.add(lab[0]);P2.add(tf[1]);P2.add(lab[1]);P2.add(tf[2]);P2.add(lab[2]);P2.add(tf[3]);
 	 con1.add(P1);
 	 con1.add(P2);
 	 
 	 
 	 
 	//con2
 	
 	con2=new JPanel();
 	con2.setLayout(new BorderLayout());
 	createdata();
 	
 	con2.add(jsp,"Center");
 	 
 	 
 	
 	
 	 
 	ButtonGroup group=new ButtonGroup();  
    group.add(sel1);  
    group.add(sel2); 
   	sel.add(con1,"North");
   	sel.add(con2,"Center") ;
	   	 
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
    //监听单选按钮
    public void Radio(JRadioButton rb)
    {
   	 rb.addActionListener(this);
    }
    //单选按钮的值
    public void Radioreturn()
    {
   	 
    	 b1=sel1.isSelected();
    	 b2=sel2.isSelected();
    	 if(b1==true) 
    	 {
    		 tf[0].setEditable(true);
    		 for(int i=1;i<=3;i++) tf[i].setEditable(false);
    	 }
    	 
    	 else
    	 {
    		 tf[0].setEditable(false);
    		 for(int i=1;i<=3;i++) tf[i].setEditable(true);
    	 }
    		
   	 
    }
    public void createdata() throws SQLException
    { 
 
		 DBHelper bb=new DBHelper();
		 data=new Object[20][10];
		 String ss=tf[0].getText().toString();
		 String sql="select * from book_fmag where 书名="+"'"+ss+"'";
		 bb.select(sql);
		 
		 for(int i=0;i<10;i++)
			{
				data[i]=new Object[]{bb.s1return1(i),bb.s1return2(i),bb.s1return3(i),bb.s1return4(i),bb.s1return5(i),bb.s1return6(i),bb.s1return7(i),bb.s1return8(i)};
			}
		    
		    model= new DefaultTableModel(data,colname); 
		 	table=new JTable(model);
		 	table.setModel(model);
		 	table.setEnabled(false);
			table.setShowHorizontalLines(false);
			table.setShowVerticalLines(false);
		 	jsp=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
   
		
    }
    public void B1updateTable() throws SQLException
    {
    	//清除表格东西再更新
    	while(model.getRowCount()>0){
		      model.removeRow(model.getRowCount()-1);
		 }
    	
    	
    	DBHelper bb=new DBHelper();
		data1=new Object[20][10];
		String ss=tf[0].getText().toString();
		String sql="select * from book_fmag where "+s+"="+"'"+ss+"'";
		bb.select(sql);
		for(int i=0;i<10;i++)
			{
				data1[i]=new Object[]{bb.s1return1(i),bb.s1return2(i),bb.s1return3(i),bb.s1return4(i),bb.s1return5(i),bb.s1return6(i),bb.s1return7(i),bb.s1return8(i)};
			}
        //更新表格数据
		model= new DefaultTableModel(data1,colname); 
		table.setModel(model);
    }
    public void B2updateTable() throws SQLException
    {
    	//清除表格东西再更新
    	while(model.getRowCount()>0){
		      model.removeRow(model.getRowCount()-1);
		 }
    	DBHelper bb=new DBHelper();
		data1=new Object[20][10];
		String s1=tf[1].getText().toString();
		String s2=tf[2].getText().toString();
		String s3=tf[3].getText().toString();
		String sql=" select * from book_fmag where (书名 like "+"'%"+s1+"%'"+" and 出版社 like "+"'%"+s2+"%'"+" and 作者  like "+"'%"+s3+"%'"+")";
		bb.select(sql);
		for(int i=0;i<10;i++)
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
		  Radioreturn();
		  comboboxreturn();
		  if(bt.equals("提交"))
		  {

			  try {
				if(b1==true)  
				B1updateTable();
				if(b2==true)
		        B2updateTable();	
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 }
        
	}
    
     
 }
