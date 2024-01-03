package springbootWebReq.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootWebReq.pojo.Address;
import springbootWebReq.pojo.Result;

@RestController
public class ResponseController {

  @RequestMapping("/hello")
  public Result hello(){
    System.out.println("hello");
    return Result.success("hello");
  }


  @RequestMapping("/getAddr")
  public Result getAddress(){
    Address ad = new Address();
    ad.setCity("Los");
    ad.setCountry("US");
    return Result.success(ad);
  }
}
