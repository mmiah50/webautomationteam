package databasepack;
import base.CommonApi;
import database.ConnectToSqlDB;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
public class Database extends CommonApi{
        public void logIn(){
            driver.findElement(By.xpath("//*[@name='email']")).sendKeys("miah_monir@yahoo.com");
            driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("rahimam12");
            driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
         }
        //insert data to database
        public static List<String> getItemValue() {
            List<String> itemsList = new ArrayList<String>();
            itemsList.add("Nikelback");
            itemsList.add("Green Day");
            itemsList.add("Dire Straights");
            itemsList.add("Black Eyed Peace");
            return itemsList;
        }
        //put Data to DB-Mysql
        public static void main(String[] args) throws IllegalAccessException, InstantiationException {
            ConnectToSqlDB connectDB = new ConnectToSqlDB();
            connectDB.insertDataFromArrayListToSqlTable(getItemValue(),"MusicBands","");
        }
        //bring data from db and search using them
        public void searchByDB() throws Exception {
            ConnectToSqlDB connectDB = new ConnectToSqlDB();
            List<String> items = connectDB.readDataBase("MusicBands","Names");
            for (int i = 0; i < items.size(); i++) {
                typeByXpath("//*[@name='q']", items.get(i));
                clearInputField("//*[@name='q']");
            }
        }
    }


