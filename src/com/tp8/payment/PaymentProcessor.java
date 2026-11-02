package com.tp8.payment;

public interface PaymentProcessor {
	  /**
     * Traite une transaction de paiement.
     * @param amount Le montant à payer en euros.
     * @return true si le paiement est réussi, false sinon.
     */
    boolean processPayment(double amount);

    /**
     * Retourne le nom du moyen de paiement.
     * @return Le nom du processeur.
     */
    String getPaymentMethod();
}
