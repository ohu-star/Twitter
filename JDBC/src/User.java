import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class User {
	public String user_id;
	public String pwd;
	public String username;
	public String profile_Image_Dir;
	List<String> images;
	
	User(){
		user_id = "";
		pwd = "";
		username = "";
		profile_Image_Dir = "";
	}
	
	User(String u_id){
		user_id = "";
		pwd = "";
		username = "";
		profile_Image_Dir = "";
		
		String q1 = "select * from user where user_id = \"" + u_id + "\";";
		
		ResultSet rs = SQLMethods.ExecuteQuery(SQLMethods.GetCon(),q1);
		
		try {
			if(rs.next()) {
				user_id = rs.getString(1);
				pwd = rs.getString(2);
				username = rs.getString(3);
				profile_Image_Dir = rs.getString(4);
				if(profile_Image_Dir.compareTo("") == 0) {
					System.out.println("Dfw");
					profile_Image_Dir = "https://play-lh.googleusercontent.com/38AGKCqmbjZ9OuWx4YjssAz3Y0DTWbiM5HB0ove1pNBq_o9mtWfGszjZNxZdwt_vgHo";
				}
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
