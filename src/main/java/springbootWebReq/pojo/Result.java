package springbootWebReq.pojo;

// 统一 response 封装
public class Result {
  private Integer code; // 1 represent success, 0 means fail
  private String msg; // reminder info
  private Object data; // data

  public Result() {
  }

  public Result(Integer code, String msg, Object data) {
    this.code = code;
    this.msg = msg;
    this.data = data;
  }

  public static Result success(Object data){
    return new Result(1, "success", data);
  }

  public static Result success(){
    return new Result(1, "success", null);
  }

  public static Result error(String msg){
    return new Result(0, msg, null);
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Result{" +
        "code=" + code +
        ", msg='" + msg + '\'' +
        ", data=" + data +
        '}';
  }
}
