package org.pgm.jpademo;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
@Log4j2
public class DataSourceTest {
    @Autowired
    private DataSource dataSource;
    @Test
    public void testDataSource(){
        try{
            Connection conn=dataSource.getConnection();
            log.info(conn);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
