package comhuahang.foodbeverages.repository;

import comhuahang.foodbeverages.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: 阿俊哥
 * @Date: 2019/9/10 12:16
 * @Version 1.0
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

    //根据订单id 查询订单详情

    List<OrderDetail> findByOrderId();
}
