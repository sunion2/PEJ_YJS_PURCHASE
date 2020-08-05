package PEJ;

import PEJ.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PolicyHandler{

    @Autowired
    PurchaseRepository purchaseRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverOutOfStock_Cancel(@Payload OutOfStock outOfStock){

        System.out.println("#####START");
        System.out.println("#####START"+ outOfStock.getEventType());

       // if(outOfStock.isMe()){

            if ("ONEPLUS".equals(outOfStock.getEventType())){
                //원플러스원 이면 금액 반값으로 계산
                System.out.println("#####START_3 + " + outOfStock.getPurchaseId());

                Optional<Purchase> purchaseOptional = purchaseRepository.findAllByPurchaseIdEquals(outOfStock.getPurchaseId());

                Purchase purchase = purchaseOptional.get();

                purchase.setPurchaseAmt(purchase.getPurchaseAmt() / 2 );

                System.out.println("#####START_4 + "  + purchase.getId());

                purchaseRepository.save(purchase);

            } else if(outOfStock.isMe()){
                //수량부족
                System.out.println("#####START_1 + " + outOfStock.getPurchaseId());

                Optional<Purchase> purchaseOptional = purchaseRepository.findAllByPurchaseIdEquals(outOfStock.getPurchaseId());

                Purchase purchase = purchaseOptional.get();

                System.out.println("#####START_2 + "  + purchase.getId());

                purchaseRepository.delete(purchase);
            }

       // }

    }

}
