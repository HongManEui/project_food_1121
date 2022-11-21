package projectfood.domain;

import projectfood.domain.Payed;
import projectfood.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Pay_table")
@Data

public class Pay  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String payOption;
    
    
    
    
    
    private String price;

    @PostPersist
    public void onPostPersist(){


        Payed payed = new Payed(this);
        payed.publishAfterCommit();

    }

    public static PayRepository repository(){
        PayRepository payRepository = FrontApplication.applicationContext.getBean(PayRepository.class);
        return payRepository;
    }




    public static void canclePay(OrderCancled orderCancled){

        /** Example 1:  new item 
        Pay pay = new Pay();
        repository().save(pay);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancled.get???()).ifPresent(pay->{
            
            pay // do something
            repository().save(pay);


         });
        */

        
    }
    public static void canclePay(OrderRejected orderRejected){

        /** Example 1:  new item 
        Pay pay = new Pay();
        repository().save(pay);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderRejected.get???()).ifPresent(pay->{
            
            pay // do something
            repository().save(pay);


         });
        */

        
    }


}
