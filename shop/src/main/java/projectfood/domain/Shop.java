package projectfood.domain;

import projectfood.domain.CookStarted;
import projectfood.domain.CookEnded;
import projectfood.ShopApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Shop_table")
@Data

public class Shop  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String status;
    
    
    
    @ElementCollection
    
    private List<String> options;
    
    
    
    
    
    private String adress;
    
    
    
    
    
    private String price;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String storeId;

    @PostPersist
    public void onPostPersist(){


        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();



        CookEnded cookEnded = new CookEnded(this);
        cookEnded.publishAfterCommit();

    }

    public static ShopRepository repository(){
        ShopRepository shopRepository = ShopApplication.applicationContext.getBean(ShopRepository.class);
        return shopRepository;
    }



    public void accept(AcceptCommand acceptCommand){
        OrderAccepted orderAccepted = new OrderAccepted(this);
        orderAccepted.publishAfterCommit();

        OrderRejected orderRejected = new OrderRejected(this);
        orderRejected.publishAfterCommit();

    }

    public static void copyData(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Shop shop = new Shop();
        repository().save(shop);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(shop->{
            
            shop // do something
            repository().save(shop);


         });
        */

        
    }
    public static void updateStatus(Payed payed){

        /** Example 1:  new item 
        Shop shop = new Shop();
        repository().save(shop);

        */

        /** Example 2:  finding and process
        
        repository().findById(payed.get???()).ifPresent(shop->{
            
            shop // do something
            repository().save(shop);


         });
        */

        
    }


}
