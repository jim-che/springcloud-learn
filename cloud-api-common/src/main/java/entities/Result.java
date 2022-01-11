package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenguo
 * @date 2021/11/25 9:02 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Integer code;
    private String message;
    private Object data;

    public static Result success(Object data){
        return new Result(200, "操作成功", data);
    }

    public static Result success(String message, Object data){
        return new Result(200, message, data);
    }

    public static Result failed(Integer code, String message){
        return new Result(code, message, null);
    }


    public static Result failed(String message){
        return new Result(400, message, null);
    }

}
