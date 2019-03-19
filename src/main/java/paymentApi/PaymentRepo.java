package paymentApi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("rawtypes")
@Repository
public interface PaymentRepo extends CrudRepository {

    Payment findByTxnId(String txnId);
}