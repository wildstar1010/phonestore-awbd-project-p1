package dev.project.awbd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    private DataSource dataSource;

   // @GetMapping("/login")
   // public String login() {
  //      return "login";
  //  }

   // @GetMapping("/home")
   // public String home() {
   //     return "home";
  //  }
   @GetMapping("/home")
   public String home(Model model) {
       model.addAttribute("message", "Welcome to the Main Home Page!");
       return "main/home";  // Ensure this path corresponds to a valid view template
   }
    @GetMapping("/connect-mysql")
    @ResponseBody
    public String connectMySQL() {
        try (Connection connection = dataSource.getConnection()) {
            return "Connected to MySQL database successfully!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to connect to MySQL database.";
        }
    }

    @GetMapping("/view-data")
    public String viewData(Model model) {
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM some_table")) {

            // Assuming 'some_table' has a column 'name'
            StringBuilder data = new StringBuilder();
            while (resultSet.next()) {
                data.append(resultSet.getString("name")).append("<br>");
            }
            model.addAttribute("data", data.toString());
            return "data";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
}
