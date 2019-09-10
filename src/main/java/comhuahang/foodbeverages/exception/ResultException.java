package comhuahang.foodbeverages.exception;

import comhuahang.foodbeverages.enums.ResultEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * 返回异常类
 *
 * @Author: 阿俊哥
 * @Date: 2019/3/6 19:52
 * @Version 1.0
 */
@Getter
@Setter
public class ResultException extends RuntimeException {

    private Integer code;


    public ResultException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());

        this.code = resultEnum.getCode();
    }

    public ResultException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
