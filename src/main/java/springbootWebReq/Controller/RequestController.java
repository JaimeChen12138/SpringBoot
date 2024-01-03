package springbootWebReq.Controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springbootWebReq.pojo.User;

@RestController
public class RequestController {

  @RequestMapping("/simplePara")
  public String simplePara(String name, int age){
    System.out.println(name + ":" + age);
    return "OK";
  }
  // origin request 参数方式
//  public String simplePara(HttpServletRequest request){
//    String name = request.getParameter("name");
//    String ageStr = request.getParameter("age");
//    int age = Integer.parseInt(ageStr);
//    System.out.println(name + ":" + age);
//    return "OK";
//  }

  // array request
  @RequestMapping("/arrayParam")
  public String arrayPara(String[] hobby){
    System.out.println(Arrays.toString(hobby));
    return "ok";
  }

  @RequestMapping("/listParam")
  public String listPara(@RequestParam List<String> hobby){
    System.out.println(hobby);
    return "ok";
  }
  // date time param
  @RequestMapping("/dateParam")
  public String dataParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")LocalDateTime updateTime) {
    System.out.println(updateTime);
    return "OK";
  }

  // json param receive, post request. param in the body
  @RequestMapping("/jsonParam")
  public String jsonParam(@RequestBody User user){
    System.out.println(user);
    return "OK";
  }

  // path param
  @RequestMapping("/path/{id}")
  public String pathParam(@PathVariable Integer id){
    System.out.println(id);
    return "Ok";
  }
}
