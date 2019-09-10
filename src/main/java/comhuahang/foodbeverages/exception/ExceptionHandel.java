package comhuahang.foodbeverages.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 *全局异常捕获类
 * @Author: 阿俊哥
 * @Date: 2019/9/10 12:18
 * @Version 1.0
 */
@ControllerAdvice
public class ExceptionHandel {

    //定义错误异常的页面
    public static final String EXCEPTION_VIEW = "/seller/common/error";

    @ExceptionHandler(ResultException.class)
    public ModelAndView resultExceptionHandel(ResultException e, Map<String,Object> map, HttpServletRequest request){

        map.put("url", request.getRequestURL());
        map.put("msg", e.getMessage());
        return new ModelAndView("/common/error",map);
    }
}
