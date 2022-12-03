package bookExam.impl;

import bookExam.Book;
import bookExam.database.Connector;

import java.sql.ResultSet;
import java.util.ArrayList;

public class BookReposistory {
        @Override
        public ArrayList<Book> all() {
            ArrayList<Book> ls = new ArrayList<>();
            try {
                Connector connector = Connector.getInstance();
                String sql = "select * from students";
                ResultSet rs = connector.query(sql);

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    int mark = rs.getInt("mark");
                    String gender = rs.getString("gender");
                    Book b = new Book(id,name);
                    ls.add(b);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return ls;
        }

        @Override
        public Boolean create(Book b) {
            try {
                Connector connector = Connector.getInstance();
                String sql_txt = "insert into students(name,email,mark,gender) values(?,?,?,?)";
                ArrayList parameters = new ArrayList();
                parameters.add(b.getbCode());
                parameters.add(b.getbName());
                parameters.add(b.getbAuthor());
                parameters.add(b.getbPrice());
                return connector.execute(sql_txt,parameters);
            }catch (Exception e){
            }
            return false;
        }

        @Override
        public Boolean update(Book b) {
            try {
                Connector connector = Connector.getInstance();
                String sql_txt = "update students set name=?,email=?,mark=?,gender=? where id=?;";
                ArrayList parameters = new ArrayList();
                parameters.add(b.getbCode());
                parameters.add(b.getbName());
                parameters.add(b.getbAuthor());
                parameters.add(b.getbPrice());
                return connector.execute(sql_txt,parameters);
            }catch (Exception e){
            }
            return false;
        }
    }

