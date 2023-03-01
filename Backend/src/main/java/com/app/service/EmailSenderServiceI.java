package com.app.service;

import org.springframework.web.multipart.MultipartFile;

import com.app.pojos.Customer;
import com.app.pojos.EmailSender;
import com.app.pojos.EnquiryDetails;

public interface EmailSenderServiceI {

	public void emailSend(EmailSender e);

	public EnquiryDetails emailSendwithAttachment(EnquiryDetails e);

	public void sendSanctionLetter(Customer customer, MultipartFile sanctionLetter);

}
