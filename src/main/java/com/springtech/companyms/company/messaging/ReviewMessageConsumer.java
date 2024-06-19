package com.springtech.companyms.company.messaging;

import com.springtech.companyms.company.CompanyService;
import com.springtech.companyms.company.dto.ReviewMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewMessageConsumer {
    @Autowired
    private CompanyService companyService;

    @RabbitListener(queues = "companyRatingQueue")
    public void consumeMessage(ReviewMessage reviewMessage){
        companyService.updateCompanyRating(reviewMessage);
    }
}
