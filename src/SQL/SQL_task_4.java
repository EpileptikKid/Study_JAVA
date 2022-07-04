package SQL;

import java.sql.*;

public class SQL_task_4 {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/ms_db?serverTimezone=Europe/Kiev&useSSL=false&useUnicode=true&characterEncoding=utf-8";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stat = conn.createStatement();
            try {
                stat.executeUpdate("ALTER TABLE themes ADD COLUMN id_professor INT;");
            } catch (SQLException e) {
                System.out.println("колонка ид_профессора уже существовала");
            }
            stat.executeUpdate("UPDATE themes SET id_professor =  1 WHERE name_theme = 'математика';");
            stat.executeUpdate("UPDATE themes SET id_professor =  2 WHERE name_theme = 'география';");
            stat.executeUpdate("UPDATE themes SET id_professor =  3 WHERE name_theme = 'биология' OR name_theme = 'информатика';");
            stat.executeUpdate("UPDATE education_part SET GPA = 5.0 WHERE student_id = 8;");
            //ResultSet rs = stat.executeQuery("SELECT students.student_name, students.student_surname, students.student_patronymic, G.group_name FROM students LEFT JOIN education_part as G ON (students.student_id = G.id);");
            ResultSet rs = stat.executeQuery("SELECT S.student_name, S.student_surname, S.student_patronymic, G.group_name, T.name_theme, T.num_hours, P.prof_name, P.prof_surname, P.prof_patronymic, P.post FROM students AS S, education_part AS G, themes AS T, professors AS P WHERE S.student_id = G.student_id AND P.id = T.id_professor;");
            while (rs.next()) {
                System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t %s\t %s\t %s\t %s%n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
