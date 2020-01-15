package hello;

public interface ConnectionJDBC {
	String db = "trigo_com_v3_china";
	String url = "jdbc:mysql://localhost/"+db+"?useUnicode=true&useJDBCCompliantTimeZoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String user="root";
	String password="";
}
