package LibraryProJect_2017;
import java.sql.*;
public class DBHelper implements DBConfig {
	
	private String s1[]=new String[100],s2[]=new String[100],s3[]=new String[100],s4[]=new String[100],s5[]=new String[100],s6[]=new String[100],s7[]=new String[100],s8[]=new String[100];
	Connection conn=null;
	Statement sta=null;
	PreparedStatement pst=null;
    ResultSet ret=null;
    boolean flag=false;
    private Object data[][];
    private String p1,p2,p3,p4,p5,num; 
    public Connection getConnection()
    {   
        try {  
            Class.forName(driver);  
             System.out.println("驱动程序加载成功");  
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();  
        }  
          
       
         
        try {  
            conn=DriverManager.getConnection(url, user, password);  
            if (!conn.isClosed()) {  
              System.out.println("连接数据库成功");  
            }  
           
        } catch (SQLException e) {  
            // System.out.println("链接数据库失败: "+e.getMessage());  
        } 
	
	 return conn;
    }
    
   public void select(String sql,String use,String psw)throws SQLException
   {
	   conn=getConnection();
	   pst=conn.prepareStatement(sql);
	   ret=pst.executeQuery();
	   while(ret.next())
	   {
		   String Login_use=ret.getString(1);
		   String Login_psw=ret.getString(2);
		   if(Login_use.equals(use)&&Login_psw.equals(psw))
		   {
			   flag=true;
			   setFlag(flag); 
			   break;
		   }
	   }
	   ret.close();
	   pst.close();
	   conn.close();
	   
   }
   public void Readerselect(String sql)throws SQLException
   {
	   conn=getConnection();
	   pst=conn.prepareStatement(sql);
	   ret=pst.executeQuery();
	   while(ret.next()){
	   p1=ret.getString(1);
	   p2=ret.getString(4);
	   p3=ret.getString(11);
	   p4=ret.getString(6);
	   p5=ret.getString(10);
	   }
	   
	   ret.close();
	   pst.close();
	   conn.close();
   }
   public void Bookselect(String sql)throws SQLException
   {
	   conn=getConnection();
	   pst=conn.prepareStatement(sql);
	   ret=pst.executeQuery();
	   while(ret.next()){
	   p1=ret.getString(2);
	   p2=ret.getString(5);
	   p3=ret.getString(8);
	   }
	   
	   ret.close();
	   pst.close();
	   conn.close();
   }
   public void insert(String sql,String tf0,String tf1,String tf2,String tf3,String tf4,String tf5,String tf6,String tf7)throws SQLException
   {
	   
   	conn=getConnection();
   	pst=conn.prepareStatement(sql); 
     try{
   	   pst.setString(1,tf0);
       pst.setString(2,tf1);
       pst.setString(3,tf2);
       pst.setString(4, tf3);
       pst.setString(5,tf4);
       pst.setString(6, tf5); 
       pst.setString(7,tf6);
       pst.setString(8, tf7);
       pst.executeUpdate();
       
       
     }
     
     
     catch(SQLException e)
     {
   	  e.printStackTrace();
     }
   }
   public void finsert(String sql,String tf0,String tf1,String tf2,String tf3,String tf4,String tf5,String tf6)throws SQLException
   {
	   
   	conn=getConnection();
   	pst=conn.prepareStatement(sql); 
     try{
   	   pst.setString(1,tf0);
       pst.setString(2,tf1);
       pst.setString(3,tf2);
       pst.setString(4, tf3);
       pst.setString(5,tf4);
       pst.setString(6, tf5); 
       pst.setString(7,tf6);
       pst.executeUpdate();
       
       
     }
     
     
     catch(SQLException e)
     {
   	  e.printStackTrace();
     }
   }
   public void borrow(String sql,String tf0,String tf1,String tf2,String tf3,String tf4,String tf5,String tf6)throws SQLException
   {
	   
   	conn=getConnection();
   	pst=conn.prepareStatement(sql); 
     try{
   	   pst.setString(1,tf0);
       pst.setString(2,tf1);
       pst.setString(3,tf2);
       pst.setString(4, tf3);
       pst.setString(5,tf4);
       pst.setString(6, tf5); 
       pst.setString(7, tf6);
       pst.executeUpdate();

     }
     catch(SQLException e)
     {
   	  e.printStackTrace();
     }
   }
   public void insertreader(String sql,String tf0,String tf1,String tf2,String tf3,String tf4,String tf5,String tf6,String tf7,String tf8,String tf9,String tf10,String tf11)throws SQLException
   {
	   
   	conn=getConnection();
   	pst=conn.prepareStatement(sql); 
     try{
   	   pst.setString(1,tf0);
       pst.setString(2,tf1);
       pst.setString(3,tf2);
       pst.setString(4, tf3);
       pst.setString(5,tf4);
       pst.setString(6, tf5); 
       pst.setString(7,tf6);
       pst.setString(8, tf7);
       pst.setString(9, tf8);
       pst.setString(10, tf9);
       pst.setString(11, tf10);
       pst.setString(12, tf11);
       pst.executeUpdate();
       
       
     }
     
     
     catch(SQLException e)
     {
   	  e.printStackTrace();
     }
   }
   public void update(String sql)throws SQLException
   {
   	conn=getConnection();
   	pst=conn.prepareStatement(sql);
   	try
       {	
     		 pst.executeUpdate();
       }catch(SQLException e)
       {
       	 e.printStackTrace(); 
       }
   	 
   	conn.close();
   }
   public void Query(String sql) throws SQLException
   {
   	conn=getConnection();
   	pst=conn.prepareStatement(sql);
   	try
       {
        ret=pst.executeQuery();
        int i=0;
   		while (ret.next()) {  
              s1[i]=ret.getString(1);
              s2[i]=ret.getString(2);
              s3[i]=ret.getString(3);
              s4[i]=ret.getString(4);
              s5[i]=ret.getString(5);
              s6[i]=ret.getString(6);
              s7[i]=ret.getString(7);
              s8[i]=ret.getString(8);
              i++;       
     }
       
       }catch(SQLException e)
       {
       	 e.printStackTrace(); 
       }
   	
   	
   	ret.close();
   	pst.close();
   	conn.close();
   }
   
   public void select(String sql) throws SQLException
   {
   	conn=getConnection();
   	pst=conn.prepareStatement(sql);
   	try
       {
        ret=pst.executeQuery();
        int i=0;
   		while (ret.next()) {  
              s1[i]=ret.getString(1);
              s2[i]=ret.getString(2);
              s3[i]=ret.getString(3);
              s4[i]=ret.getString(4);
              s5[i]=ret.getString(5);
              s6[i]=ret.getString(6);
              s7[i]=ret.getString(7);
              i++;       
     }
       
       }catch(SQLException e)
       {
       	 e.printStackTrace(); 
       }
   	
   	
   	ret.close();
   	pst.close();
   	conn.close();
   }
   
   public void delect(String sql)throws SQLException
   {

	    conn=getConnection();
       pst=conn.prepareStatement(sql);
   	try
       { 
           pst.executeUpdate();
        
       }catch(SQLException e)
       {
       	 e.printStackTrace(); 
       }

   }
   
   public void setFlag(boolean f)
   {
	    flag=f;
   }
   public boolean getFlag()
   {
	   return flag;
   }
   //返回查询的数据
   public String s1return1(int i)
   {
	   return s1[i];
   }
   public String s1return2(int i)
   {
	   return s2[i];
   }
   public String s1return3(int i)
   {
	   return s3[i];
   }
   public String s1return4(int i)
   {
	   return s4[i];
   }
   public String s1return5(int i)
   {
	   return s5[i];
   }
   public String s1return6(int i)
   {
	   return s6[i];
   }
   public String s1return7(int i)
   {
	   return s7[i];
   }
   public String s1return8(int i)
   {
	   return s8[i];
   }
   //返回查询读者和书籍的数据
   public String name()
   {
	   return p1;
   }
   public String borrowable()
   {
	   return p2;
   }
   public String pmoney()
   {
	   return p3;
   }
   public String rtime()
   {
	   return p5;
   }
   public String rnum()
   {
	   return num;
   }
   

}