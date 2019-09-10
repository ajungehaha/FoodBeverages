package comhuahang.foodbeverages.enums;

import lombok.Getter;

/**
 * @Author: 阿俊哥
 * @Date: 2019/3/6 20:00
 * @Version 1.0
 */
@Getter
public enum ResultEnum {

    ;

    private Integer code;

    private String msg;

    private String url;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
