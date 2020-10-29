package daos;
import daos.impl.*;
import model.*;
import java.sql.*;

public interface SedanDAOS {
    public void insertarSedan(Sedan sedan);
    Connection conexion = null;

    try{
        String url = "jdbc:mysql://localhost:3306/autos";
        String usuario = "root";
        String clave = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection(url, usuario, clave);
    } catch (Exception ex) {

        ex.printStackTrace();
    }
    try{ String consulta ="insert into automoviles (idCliente,idClaseDeAuto,costoTotal) values " +
            "("Sedan.getidCliente() + "," +
            Sedan.getidClaseDeAuto()+ "," +
            Sedan.calcularcostoTotal()+")";

        Statement sentencia = connection.createStatement();
        sentencia.execute(consulta);
    }catch (Exception ex){
        ex.printStackTrace();
    }finally {conexion.close();
    }
}
