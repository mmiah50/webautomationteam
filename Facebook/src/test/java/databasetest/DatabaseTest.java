package databasetest;
import databasepack.Database;
import org.testng.annotations.Test;
public class DatabaseTest extends Database{
        @Test
        public void testSearchByDB() throws Exception {
            logIn();
            searchByDB();
        }
    }


