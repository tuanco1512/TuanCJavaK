package bookExam.database;

import java.sql.*;
import java.util.ArrayList;

public class Connector {
    public final static String connectionString = "jdbc:mysql://localhost:3306/t2204m";
    public final static String user = "root";
    public final static String pwd = ""; // xampp: ""   mamp: "root"

    private Connection conn;

    private static Connector instance;

    public static Connector getInstance(){
        if (instance == null){
            instance = new Connector();
        }
        return instance;
    }

    public Connector() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(connectionString, user, pwd);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private Statement getStatement() throws Exception{
        return this.conn.createStatement();
    }

    public ResultSet query(String sql) throws Exception{
        return this.getStatement().executeQuery(sql);
    }

    public boolean execute(String sql) throws Exception{
        return this.getStatement().executeUpdate(sql) > 0;
    }

        //prepared statement
        private PreparedStatement getPreparedStatement(String sql) throws Exception{
            return this.conn.prepareStatement(sql);
        }

        public ResultSet query(String sql, ArrayList parameters) throws Exception{
            PreparedStatement stt = this.getPreparedStatement(sql);
            for(int i=0;i<parameters.size();i++){
                if(parameters.get(i) instanceof String){
                    stt.setString(i+1,(String)parameters.get(i));
                }else if(parameters.get(i) instanceof Integer){
                    stt.setInt(i+1,(int) parameters.get(i));
                }else if(parameters.get(i) instanceof Double){
                    stt.setDouble(i+1,(double) parameters.get(i));
                }
            }
            return stt.executeQuery();
        }

        public boolean execute(String sql, ArrayList parameters) throws Exception{
            PreparedStatement stt = this.getPreparedStatement(sql);
            for(int i=0;i<parameters.size();i++){
                if(parameters.get(i) instanceof String){
                    stt.setString(i+1,(String)parameters.get(i));
                }else if(parameters.get(i) instanceof Integer){
                    stt.setInt(i+1,(int) parameters.get(i));
                }else if(parameters.get(i) instanceof Double){
                    stt.setDouble(i+1,(double) parameters.get(i));
                }
            }
            return stt.executeUpdate() > 0;
        }
}
