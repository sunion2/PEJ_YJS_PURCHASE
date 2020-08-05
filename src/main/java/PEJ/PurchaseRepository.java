package PEJ;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface PurchaseRepository extends PagingAndSortingRepository<Purchase, Long>{

    Optional<Purchase> findAllByPurchaseIdEquals(String purchaseId);

}