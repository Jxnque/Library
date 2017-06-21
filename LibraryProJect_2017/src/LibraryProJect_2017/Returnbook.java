package LibraryProJect_2017;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Returnbook extends JFrame implements ActionListener{
	private JPanel P1,P2,P3,P4,con1,con2,con3,o1,o2,o3;
	private JLabel img;
	private JButton btn1,btn2;
    private JLabel lab1 []=new JLabel[10];
     
    private JTextField tf[]=new JTextField[20];
    private String colname[]={"读者编号","书籍编号","读者姓名","书籍名称","图书类别","借书时间","归还时间"};
    private String ll1[]={"读者编号：","借书日期:","规定天数:","实际天数:","超出天数:","罚款金额:","当前时间:","操作人员:"};
    private Object data[][],data1[][];
    private JTable table;
    private JScrollPane jsp;
    private DefaultTableModel model;
    private SimpleDateFormat sdf;
    private String dateNow; 
    public static void main(String args[])
    {
    	Returnbook reb=new Returnbook("图书归还管理 ");
    	reb.pack();
    	reb.setSize(800,550);
    	reb.setLocation(300,150);
    	reb.setVisible(true);
    }
    public Returnbook(String title)
    {
    	super(title);
    	 
    	for(int i=0;i<8;i++)
    	{
    		lab1[i]=new JLabel(ll1[i]);
    		
    		if(i==0)
    		{
    			tf[i]=new JTextField(18);
    			ChooseTextField(tf[i]);
    			continue;
    		}
    		
    		tf[i]=new JTextField(10);
    		ChooseTextField(tf[i]);
    	    tf[i].setEditable(false);
    	}
    	//con1
         con1=new JPanel();
         con1.setLayout(new BorderLayout());
         con1.setBorder(BorderFactory.createEtchedBorder());
         P1=new JPanel();
         P1.setLayout(new FlowLayout(FlowLayout.CENTER,200,10));
         P1.add(lab1[0],"West");P1.add(tf[0],"East");
         createdata();
         model= new DefaultTableModel(data,colname); 
 		table=new JTable(model);
     	table.setEnabled(false);
     	table.setShowHorizontalLines(false);
     	table.setShowVerticalLines(false);
     	jsp=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
         jsp.setPreferredSize(new Dimension(700,200));
         con1.add(P1,"North");
         con1.add(jsp,"Center");
         
         
    	//con2
         con2=new JPanel();
         con2.setBorder(BorderFactory.createTitledBorder("罚款信息"));
         P2=new JPanel(); 
         P2.setLayout(new GridLayout(5,2,20,10));
         P2.add(lab1[1]);P2.add(tf[1]);
         P2.add(lab1[2]);P2.add(tf[2]);
         P2.add(lab1[3]);P2.add(tf[3]);
         P2.add(lab1[4]);P2.add(tf[4]);
         P2.add(lab1[5]);P2.add(tf[5]);
         con2.add(P2);
         
    	//con3
         con3=new JPanel();
         con3.setBorder(BorderFactory.createTitledBorder("系统信息"));
         con3.setLayout(new BorderLayout());
         btn1=new JButton("图书归还");
         btn2=new JButton("退出");
         ChooseButtonaction(btn1);
         ChooseButtonaction(btn2);
         P3=new JPanel();
         P4=new JPanel();
         P3.setLayout(new BorderLayout());
         P4.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
         o1=new JPanel();
         o2=new JPanel();
         o3=new JPanel();
         o1.setLayout(new FlowLayout(FlowLayout.CENTER,100,5));
         o2.setLayout(new FlowLayout(FlowLayout.CENTER,100,5));
         o1.add(lab1[6]);o1.add(tf[6]); 
         o2.add(lab1[7]);o2.add(tf[7]); 
         
         P3.add(o1,"North");
         P3.add(o2, "South");
         P4.add(btn1);P4.add(btn2);
         con3.add(P3, "North");
         con3.add(P4, "Center");
          add(con1,"North");
          add(con2,"West");
          add(con3,"East");
    }
    JFrame reb=new JFrame("图书归还管理 ");
    public void rebook()
    {
    	
    	reb.pack();
    	reb.setSize(800,550);
    	reb.setLocation(300,150);
    	reb.setVisible(true);
    	
    	for(int i=0;i<8;i++)
    	{
    		lab1[i]=new JLabel(ll1[i]);
    		
    		if(i==0)
    		{
    			tf[i]=new JTextField(18);
    			ChooseTextField(tf[i]);
    			continue;
    		}
    		
    		tf[i]=new JTextField(10);
    		ChooseTextField(tf[i]);
    	    tf[i].setEditable(false);
    	}
    	//con1
         con1=new JPanel();
         con1.setLayout(new BorderLayout());
         con1.setBorder(BorderFactory.createEtchedBorder());
         P1=new JPanel();
         P1.setLayout(new FlowLayout(FlowLayout.CENTER,200,10));
         P1.add(lab1[0],"West");P1.add(tf[0],"East");
         createdata();
         model= new DefaultTableModel(data,colname); 
 		table=new JTable(model);
     	table.setEnabled(false);
     	table.setShowHorizontalLines(false);
     	table.setShowVerticalLines(false);
     	jsp=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
         jsp.setPreferredSize(new Dimension(700,200));
         con1.add(P1,"North");
         con1.add(jsp,"Center");
         
         
    	//con2
         con2=new JPanel();
         con2.setBorder(BorderFactory.createTitledBorder("罚款信息"));
         P2=new JPanel(); 
         P2.setLayout(new GridLayout(5,2,20,10));
         P2.add(lab1[1]);P2.add(tf[1]);
         P2.add(lab1[2]);P2.add(tf[2]);
         P2.add(lab1[3]);P2.add(tf[3]);
         P2.add(lab1[4]);P2.add(tf[4]);
         P2.add(lab1[5]);P2.add(tf[5]);
         con2.add(P2);
         
    	//con3
         con3=new JPanel();
         con3.setBorder(BorderFactory.createTitledBorder("系统信息"));
         con3.setLayout(new BorderLayout());
         btn1=new JButton("图书归还");
         btn2=new JButton("退出");
         ChooseButtonaction(btn1);
         ChooseButtonaction(btn2);
         P3=new JPanel();
         P4=new JPanel();
         P3.setLayout(new BorderLayout());
         P4.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
         o1=new JPanel();
         o2=new JPanel();
         o3=new JPanel();
         o1.setLayout(new FlowLayout(FlowLayout.CENTER,100,5));
         o2.setLayout(new FlowLayout(FlowLayout.CENTER,100,5));
         o1.add(lab1[6]);o1.add(tf[6]); 
         o2.add(lab1[7]);o2.add(tf[7]); 
         
         P3.add(o1,"North");
         P3.add(o2, "South");
         P4.add(btn1);P4.add(btn2);
         con3.add(P3, "North");
         con3.add(P4, "Center");
         reb.add(con1,"North");
         reb.add(con2,"West");
         reb.add(con3,"East");
    }
    public void update() throws SQLException, ParseException
    {
    	//清除表格东西再更新
    	while(model.getRowCount()>0){
		      model.removeRow(model.getRowCount()-1);
		 }
    	data1=new Object[1][10];
    	DBHelper bb=new DBHelper();
    	
    	String sql="update borrow set 归还时间="+"'"+dateNow+"'"+" where 读者编号="+"'"+tf[0].getText().toLowerCase()+"'"+" ";
    	String ssql1="select * from book_reader where 读者编号="+"'"+tf[0].getText().trim()+"'"+" ";
    	bb.Readerselect(ssql1);
		int num=Integer.parseInt(bb.borrowable());
		String n=Integer.toString(num+1);
		String upsql="update book_reader set 最大借书量="+"'"+n+"'"+" where 读者编号="+"'"+tf[0].getText().trim()+"'"+" ";
		bb.update(upsql);
		bb.update(sql);
    	String sql1="select * from borrow where 读者编号="+"'"+tf[0].getText().trim()+"'"+" ";
    	bb.Query(sql1);
    	String Usql="update book_fmag set 是否借阅='否'  where 书号="+"'"+bb.s1return2(0)+"'"+"";
    	bb.update(Usql);
		data1[0]=new Object[]{bb.s1return1(0),bb.s1return2(0),bb.s1return3(0),bb.s1return4(0),bb.s1return7(0),bb.s1return5(0),dateNow};
		Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(bb.s1return5(0));
		Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse(dateNow);
		tf[1].setText(bb.s1return5(0));
        tf[2].setText("30");
        tf[3].setText(""+daysBetween(d1,d2));
        tf[4].setText("0");
        tf[5].setText("0");
        //更新表格数据
		model= new DefaultTableModel(data1,colname); 
		table.setModel(model);
		String del="delete from borrow where 读者编号="+"'"+tf[0].getText().trim()+"'"+" ";
    	bb.delect(del);
    }
    public static int daysBetween(Date smdate,Date bdate) throws ParseException    
    {    
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
        smdate=sdf.parse(sdf.format(smdate));  
        bdate=sdf.parse(sdf.format(bdate));  
        Calendar cal = Calendar.getInstance();    
        cal.setTime(smdate);    
        long time1 = cal.getTimeInMillis();                 
        cal.setTime(bdate);    
        long time2 = cal.getTimeInMillis();         
        long between_days=(time2-time1)/(1000*3600*24);  
            
       return Integer.parseInt(String.valueOf(between_days));           
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
    public void createdata()
    {
    	data=new Object[1][10];
    }
    public void actionPerformed(ActionEvent e)
    {
    	String bt=e.getActionCommand();
    	Date d = new Date(); 
	    sdf = new SimpleDateFormat("yyyy-MM-dd");
		dateNow = sdf.format(d);
		Dialog gg=new Dialog();
		if(bt.equals("图书归还"))
		{
			try {
				update();
				tf[6].setText(dateNow);
				tf[7].setText("Nan");
				gg.Dialog6();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(bt.equals("退出"))
		{
			reb.dispose();
		}
		
    }
}
