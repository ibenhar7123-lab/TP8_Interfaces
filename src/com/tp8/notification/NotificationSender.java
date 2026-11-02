package com.tp8.notification;

public interface NotificationSender {
	 /**
     * Envoie une notification.
     * @param recipient Le destinataire (email, téléphone, etc.).
     * @param message Le contenu du message.
     */
    void sendNotification(String recipient, String message);

    /**
     * Retourne le type de canal de notification.
     * @return Le nom du canal.
     */
    String getChannelType();
}
