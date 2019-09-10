package comhuahang.foodbeverages.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: 阿俊哥
 * @Date: 2019/9/10 12:11
 * @Version 1.0
 */
@Data
@Entity
public class OrderDetail {

    @Id
    private String detailId;

    private String orderId;

    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productQuantity;

    private String productIcon;

    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;
}
