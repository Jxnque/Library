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

public class Readeradd extends JFrame implements ActionListener{
	private JPanel P1,P2,P3,P4,sexGroup,con1,con2,con3;
	private JLabel img;
	private JButton btn1,btn2;
    private JLabel lab []=new JLabel[20];
    private JTextField tf[]=new JTextField[20];
    private String ll[]={"姓      名:","年      龄:","有效证件:","最大借书量:","电      话:","办证日期","性      别:","职      业:","证件号码:","会员证有效日期:","押      金:","读者编号:"};
    private JRadioButton sex1,sex2;
    private JTextArea ta;
    private String s1,s;
    private boolean b1=false,b2=false;
    private JComboBox<String>  jcb;
    private ButtonGroup group;
    public static void main(String args[])
    {
    	Readeradd add=new Readeradd("读者信息添加 ");
    	add.pack();
    	add.setSize(800,450);
    	add.setLocation(500,150);
    	add.setVisible(true);
    }
    public Readeradd(String title)
    {
    	super(title);
    	/*
    	//con1为顶部的框架
    	con1=new JPanel();
    	ImageIcon image = new ImageIcon("7.jpg");
    	img=new JLabel();
    	img.setIcon(image);
    	image.setImage(image.getImage().getScaledInstance(800,100,Image.SCALE_DEFAULT));
    	con1.add(img);
    	
    	//con2
    	for(int i=0;i<12;i++)
    	{
    		lab[i]=new JLabel(ll[i]);
    		tf[i]=new JTextField(10);
    	}
    	String[] move2 = { "工作证", "身份证", "学生证" };
    	jcb = new JComboBox<String>(move2);
    	jcb.setPreferredSize(new Dimension(30,20));
    	tf[3].setBackground(Color.GREEN);
    	tf[5].setBackground(Color.GREEN);
    	tf[9].setBackground(Color.GREEN);
    	tf[10].setBackground(Color.GREEN);
    	con2 =new JPanel();
    	P1=new JPanel();
    	P2=new JPanel();
    	P1.setLayout(new GridLayout(6,2,70,15));
    	
    	P2.setLayout(new GridLayout(6,3,50,10));
    	sex1=new JRadioButton("男");
    	sex2=new JRadioButton("女");
    	ButtonGroup group=new ButtonGroup();  
        group.add(sex1);  
        group.add(sex2);  
       
         
        P1.add(lab[0]);
        P1.add(tf[0]);
    	P1.add(lab[1]);
    	P1.add(tf[1]);
    	P1.add(lab[2]);
    	P1.add(jcb);
    	P1.add(lab[3]);
    	P1.add(tf[3]);
    	P1.add(lab[4]);
    	P1.add(tf[4]);
    	P1.add(lab[5]);
    	P1.add(tf[5]);
    	
    	P2.add(lab[6]);
    	P2.add(sex1);
    	P2.add(sex2);
    	P2.add(lab[7]);
    	P2.add(tf[7]);
    	P2.add(new Label(""));
    	P2.add(lab[8]);
    	P2.add(tf[8]);
    	P2.add(new Label(""));
    	P2.add(lab[9]);
    	P2.add(tf[9]);
    	P2.add(new Label(""));
    	P2.add(lab[10]);
    	P2.add(tf[10]);
    	P2.add(new Label(""));
    	P2.add(lab[11]);
    	P2.add(tf[11]);
    	P2.add(new Label(""));
    	
    	con2.add(P1,"West");
    	con2.add(P2,"East");
         
    	//con3 
    	P3=new JPanel();
    	con3=new JPanel();
    	btn1=new JButton("保存");
    	btn2=new JButton("返回");
    	con3.setBorder(new EtchedBorder(EtchedBorder.RAISED));  //设置边界
    	P3.setLayout(new FlowLayout(FlowLayout.CENTER,20,5));
    	con3.setLayout(new FlowLayout(FlowLayout.CENTER,50,0));
    	P3.add(btn1);
    	P3.add(btn2);
    	
    	con3.add(P3);
    	add(con1,"North");
    	add(con2,"Center");
    	add(con3,"South");
    	 
    	 */
    }
    JFrame frame=new JFrame("读者信息添加 ");
    public void Rdadd()
    {
    	
    	frame.pack();
    	frame.setSize(800,450);
    	frame.setLocation(500,150);
    	frame.setVisible(true);
    	//con1为顶部的框架
    	con1=new JPanel();
    	ImageIcon image = new ImageIcon("7.jpg");
    	img=new JLabel();
    	img.setIcon(image);
    	image.setImage(image.getImage().getScaledInstance(800,100,Image.SCALE_DEFAULT));
    	con1.add(img);
    	
    	//con2
    	for(int i=0;i<12;i++)
    	{
    		lab[i]=new JLabel(ll[i]);
    		tf[i]=new JTextField(10);
    		ChooseTextField(tf[i]);
    	}
    	String[] move2 = { "工作证", "身份证", "学生证" };
        jcb = new JComboBox<String>(move2);
    	jcb.setPreferredSize(new Dimension(30,20));
    	Choosecombobox(jcb);
    	tf[3].setBackground(Color.GREEN);
    	tf[5].setBackground(Color.GREEN);
    	tf[9].setBackground(Color.GREEN);
    	tf[10].setBackground(Color.GREEN);
    	con2 =new JPanel();
    	P1=new JPanel();
    	P2=new JPanel();
    	P1.setLayout(new GridLayout(6,2,70,15));
    	
    	P2.setLayout(new GridLayout(6,3,50,10));
    	sex1=new JRadioButton("男");
    	sex2=new JRadioButton("女");
        group=new ButtonGroup();  
        group.add(sex1);  
        group.add(sex2); 
   
        Radio(sex1);
        Radio(sex2);
         
        P1.add(lab[0]);
        P1.add(tf[0]);
    	P1.add(lab[1]);
    	P1.add(tf[1]);
    	P1.add(lab[2]);
    	P1.add(jcb);
    	P1.add(lab[3]);
    	P1.add(tf[3]);
    	P1.add(lab[4]);
    	P1.add(tf[4]);
    	P1.add(lab[5]);
    	P1.add(tf[5]);
    	
    	P2.add(lab[6]);
    	P2.add(sex1);
    	P2.add(sex2);
    	P2.add(lab[7]);
    	P2.add(tf[7]);
    	P2.add(new Label(""));
    	P2.add(lab[8]);
    	P2.add(tf[8]);
    	P2.add(new Label(""));
    	P2.add(lab[9]);
    	P2.add(tf[9]);
    	P2.add(new Label(""));
    	P2.add(lab[10]);
    	P2.add(tf[10]);
    	P2.add(new Label(""));
    	P2.add(lab[11]);
    	P2.add(tf[11]);
    	P2.add(new Label(""));
    	
    	con2.add(P1,"West");
    	con2.add(P2,"East");
         
    	//con3 
    	P3=new JPanel();
    	con3=new JPanel();
    	btn1=new JButton("保存");
    	btn2=new JButton("返回");
    	con3.setBorder(new EtchedBorder(EtchedBorder.RAISED));  //设置边界
    	P3.setLayout(new FlowLayout(FlowLayout.CENTER,20,5));
    	con3.setLayout(new FlowLayout(FlowLayout.CENTER,50,0));
    	P3.add(btn1);
    	P3.add(btn2);
    	ChooseButtonaction(btn1);
    	ChooseButtonaction(btn2);
    	
    	con3.add(P3);
    	add(con1,"North");
    	add(con2,"Center");
    	add(con3,"South");
    	
    	
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
	   
	   s1=jcb.getSelectedItem().toString();
	}
     //监听单选按钮
     public void Radio(JRadioButton rb)
     {
    	 rb.addActionListener(this);
     }
     //单选按钮的值
     public void Radioreturn()
     {
    	 b1=sex1.isSelected();
    	 b2=sex2.isSelected();
    	 
    	 
     }
	public void actionPerformed(ActionEvent e)
	{
		String bt=e.getActionCommand();
		DBHelper bb=new DBHelper();
		String sql="insert into book_reader(姓名,年龄,有效证件,最大借书量,电话,办证日期,性别,职业,证件号码,会员证有效日期,押金,读者编号) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		if(bt.equals("保存"))
		{
			Radioreturn();
			if(b1==true)
			{
				s=sex1.getText();
			}
			else
			{
                s=sex2.getText();				
			}
		 if(tf[0].getText().toString().equals("")||tf[1].getText().toString().equals("")||jcb.equals("")||tf[3].getText().toString().equals("")||tf[4].getText().toString().equals("")||tf[5].getText().toString().equals("")||!b1&&!b2||tf[7].getText().toString().equals("")||tf[8].getText().toString().equals("")||tf[9].getText().toString().equals("")||tf[10].getText().toString().equals("")||tf[11].getText().toString().equals(""))
		 {
			 Dialog gg=new Dialog();
				gg.Dialog1();
		 }
		 
		else
		{
			boolean flag=true;
			String m=tf[5].getText();
			int a=m.indexOf('-');
			if(a<0)
			{
				flag=false;
			}
			else
			{
				int b=m.indexOf('-',a+1);
				if(a!=4||b!=7) flag=false;
			}
			
			if(flag)
			{
				comboboxreturn();
				Radioreturn();
				try {
					bb.insertreader(sql,tf[0].getText(), tf[1].getText(), s1, tf[3].getText(), tf[4].getText(), tf[5].getText(),s, tf[7].getText(), tf[8].getText(), tf[9].getText(), tf[10].getText(), tf[11].getText());
				    
				} catch (SQLException e1) {
					 
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
		if(bt.equals("返回"))
		{
			frame.dispose();
		}
	   
		 
	}
}
