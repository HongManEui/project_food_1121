package projectfood.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name = "shop", url = "${api.url.shop}")
public interface ShopService {
    @RequestMapping(method= RequestMethod.PUT, path="/shops/{id}/accept")
    public void accept(@PathVariable("id") Long id, @RequestBody AcceptCommand acceptCommand );
}

