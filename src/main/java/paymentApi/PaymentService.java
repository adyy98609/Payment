package paymentApi;

public interface PaymentService {
	
	public PaymentDetail proceedPayment(PaymentDetail paymentDetail);
	public String payuCallback(PaymentCallback paymentResponse);
}
