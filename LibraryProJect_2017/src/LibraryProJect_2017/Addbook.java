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

public class Addbook extends JFrame implements ActionListener{
	private JPanel P1,P2,P3,con1,con2,con3;
	private JLabel img;
	private JButton btn1,btn2;
    private JLabel lab []=new JLabel[10];
    private JTextField tf[]=new JTextField[10];
    private String ll[]={"图书编号:","书名:","出版社:","出版日期:","类别:","作者:","译者:","单价："};
    private JComboBox<String> comboBox,jcb;
    private String s1,s2;
    private SimpleDateFormat sdf;
    private String dateNow; 
    public static void main(String args[])
    {
    	Addbook add=new Addbook("图书信息添加 ");
    	add.pack();
    	add.setSize(500,350);
    	add.setLocation(500,150);
    	add.setVisible(true);
    }
    public Addbook(String title)
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
    	image.setImage(image.getImage().getScaledInstance(600,100,Image.SCALE_DEFAULT));
    	con1.add(img);
    	
    	//con2为中间的框架
    	P1=new JPanel();
    	P2=new JPanel();
    	con2=new JPanel();
    	P1.setLayout(new GridLayout(4,2,-5,10));//4个参数分别为：行数，列数，水平间距，垂直间距
    	P2.setLayout(new GridLayout(4,2,-5,10));//4个参数分别为：行数，列数，水平间距，垂直间距
    	P1.setSize(200,200);
    	P2.setSize(200,200);
    	
    	String dateFormat = new String("2017-5-19");
    	 
    	tf[3].setBackground(Color.green);
    	tf[3].setText(dateFormat);
    	//左边
    	String[] move1 = { "***出版社", "华软南哥", "" };
        comboBox = new JComboBox<String>(move1);
        Choosecombobox(comboBox);
    	P1.add(lab[0]);
    	P1.add(tf[0]);
    	P1.add(lab[1]);
    	P1.add(tf[1]);
    	P1.add(lab[2]);
    	P1.add(comboBox);
    	P1.add(lab[3]);
    	P1.add(tf[3]);
    	
    	String[] move2 = { "软件工程", "计算机系", "网络系" };
    	 jcb = new JComboBox<String>(move2);
    	 Choosecombobox(jcb);
    	//右边
    	P2.add(lab[4]);
    	P2.add(jcb);
    	P2.add(lab[5]);
    	P2.add(tf[5]);
    	P2.add(lab[6]);
    	P2.add(tf[6]);
    	P2.add(lab[7]);
    	P2.add(tf[7]);
    	
    	
    	con2.add(P1);
    	con2.add(P2);
    	
    	//con3为底部的框架
    	P3=new JPanel();
    	con3=new JPanel();
    	btn1=new JButton("添加");
    	btn2=new JButton("关闭");
    	con3.setBorder(new EtchedBorder(EtchedBorder.RAISED));  //设置边界
    	P3.setLayout(new FlowLayout(FlowLayout.RIGHT,50,5));
    	con3.setLayout(new FlowLayout(FlowLayout.RIGHT,-50,0));
    	P3.add(btn1);
    	P3.add(btn2);
    	con3.add(P3);
    	ChooseButtonaction(btn1);
    	ChooseButtonaction(btn2);
    	
    	//将con1,con2,con3分别加入JF中
    	this.add(con1,"North");
    	this.add(con2,"Center");
    	this.add(con3,"South");
    	
    	*/
    	 
    }
    JFrame frame=new JFrame("图书信息添加 ");
    public void Abook()
    {
    	frame.setLocation(500,150);
    	frame.setSize(500,350);
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
    	image.setImage(image.getImage().getScaledInstance(600,100,Image.SCALE_DEFAULT));
    	con1.add(img);
    	
    	//con2为中间的框架
    	P1=new JPanel();
    	P2=new JPanel();
    	con2=new JPanel();
    	P1.setLayout(new GridLayout(4,2,-5,10));//4个参数分别为：行数，列数，水平间距，垂直间距
    	P2.setLayout(new GridLayout(4,2,-5,10));//4个参数分别为：行数，列数，水平间距，垂直间距
    	P1.setSize(200,200);
    	P2.setSize(200,200);
    	
    	String dateFormat = new String("2017-05-19");
    	 
    	tf[3].setBackground(Color.green);
    	tf[3].setText(dateFormat);
    	//左边
    	String[] move1 = { "***出版社", "华软南哥", "" };
        comboBox = new JComboBox<String>(move1);
        Choosecombobox(comboBox);
    	P1.add(lab[0]);
    	P1.add(tf[0]);
    	P1.add(lab[1]);
    	P1.add(tf[1]);
    	P1.add(lab[2]);
    	P1.add(comboBox);
    	P1.add(lab[3]);
    	P1.add(tf[3]);
    	
    	String[] move2 = { "软件工程", "计算机系", "网络系" };
    	 jcb = new JComboBox<String>(move2);
    	 Choosecombobox(jcb);
    	//右边
    	P2.add(lab[4]);
    	P2.add(jcb);
    	P2.add(lab[5]);
    	P2.add(tf[5]);
    	P2.add(lab[6]);
    	P2.add(tf[6]);
    	P2.add(lab[7]);
    	P2.add(tf[7]);
    	
    	
    	con2.add(P1);
    	con2.add(P2);
    	
    	//con3为底部的框架
    	P3=new JPanel();
    	con3=new JPanel();
    	btn1=new JButton("添加");
    	btn2=new JButton("关闭");
    	con3.setBorder(new EtchedBorder(EtchedBorder.RAISED));  //设置边界
    	P3.setLayout(new FlowLayout(FlowLayout.RIGHT,50,5));
    	con3.setLayout(new FlowLayout(FlowLayout.RIGHT,-50,0));
    	P3.add(btn1);
    	P3.add(btn2);
    	con3.add(P3);
    	ChooseButtonaction(btn1);
    	ChooseButtonaction(btn2);
    	
    	//将con1,con2,con3分别加入JF中
    	frame.add(con1,"North");
    	frame.add(con2,"Center");
    	frame.add(con3,"South");
    	
    	
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
		   s1=comboBox.getSelectedItem().toString();
		   s2=jcb.getSelectedItem().toString();
	   }
    public void actionPerformed(ActionEvent e)
    {
    	String bt=e.getActionCommand();
    	Date d = new Date(); 
	    sdf = new SimpleDateFormat("yyyy-MM-dd");
		dateNow = sdf.format(d);
    	if(bt.equals("添加"))
    	{
    		String sql="insert into book_mag(图书编号,书名,出版社,出版日期,类别,作者,译者,单价) values(?,?,?,?,?,?,?,?)";
    		String sql1="insert into book_fmag(书名,出版社,作者,书号,购进时间,是否借阅,是否预约) values(?,?,?,?,?,?,?)";
    		DBHelper bb=new DBHelper();

    		if(tf[0].getText().equals("")||tf[1].equals("")||comboBox.equals("")||tf[3].equals("")||jcb.equals("")||tf[5].equals("")||tf[6].equals("")||tf[7].equals(""))
    		{
    			 Dialog gg=new Dialog();
				 gg.Dialog1();
				  
    		}
    		else
    		{
    			boolean flag=true;
    			String m=tf[3].getText();
    			int a=m.indexOf('-');
    			if(a<0)
    			{
    				flag=false;
    			}
    			else
    			{
    				int b=m.indexOf("-",a+1);
    				if(a!=4||b!=7) flag=false;
    			}
    			
    			
    			if(flag)
    			{
    				comboboxreturn();
    				 
    				try {
						bb.insert(sql,tf[0].getText(),tf[1].getText(),s1,tf[3].getText(),s2,tf[5].getText(),tf[6].getText(),tf[7].getText());
						bb.finsert(sql1,tf[1].getText(),s1,tf[5].getText(),tf[0].getText(),dateNow,"否","否");
    				} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 
    				 
    					Dialog gg=new Dialog();
       				    gg.Dialog3();
    				 
    				
    			}
    			else
    			{
    				Dialog gg=new Dialog();
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
