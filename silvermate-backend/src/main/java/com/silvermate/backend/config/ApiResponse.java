package com.silvermate.backend.config;

import com.silvermate.backend.entity.AbnormalAlert;
import org.apache.logging.log4j.message.Message;

/**
 * ClassName: ApiResponse
 * Package: com.silvermate.backend.config
 * Description:统一返回类
 *
 * @Author Evander
 * @Create 2026/1/31 14:45
 * @Version 1.0
 */
public class ApiResponse<T> {
    private int code;
    private String message;
    private T data;

    public ApiResponse(){}

    public ApiResponse(int code,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public static <T> ApiResponse<T> success(T data){
        return new ApiResponse<>( 200,"success",data);
    }
    public static ApiResponse<?> success(){
        return new ApiResponse<>(200,"success",null);
    }
    public static ApiResponse<?> error(String message){
        return new ApiResponse<>(500, message,null);
    }
    //getter&setter
    public int getCode(){return code;}
    public void setCode(int code){this.code = code;}

    public String getMessage(){return message;}
    public void setMessage(String message){this.message = message;}

    public T getData(){return data;}
    public void setData(T data){this.data = data;}
}
