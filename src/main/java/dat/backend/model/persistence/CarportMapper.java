package dat.backend.model.persistence;

import dat.backend.model.entities.Carport;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class CarportMapper {
    private ConnectionPool connectionPool;

    public CarportMapper(ConnectionPool connectionPool){
        this.connectionPool = connectionPool;
    }
    //public Carport makeCarport(Carport carport){
        //try (Connection connection = connectionPool.getConnection()){
            //String sql = ;
           // try(PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){

       //     }
     //   }
   // }
}
