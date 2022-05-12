package SMS.twilioSmsApi;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("twilio")
public class TwilioSmsSender implements SmsSender{

    private static final Logger LOGGER = LoggerFactory.getLogger(TwilioSmsSender.class);


    private final TwilioConfiguration twilioConfiguration;

    @Autowired
    public TwilioSmsSender(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
    }

    @Override
    public void sendSms(SendRequest sendRequest) {
//        if (isNumberValid(sendRequest.getPhoneNumber())) {
            PhoneNumber to = new PhoneNumber(sendRequest.getPhoneNumber());
            PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
            String message = sendRequest.getMessage();
            MessageCreator creator = Message.creator(to, from, message);
            creator.create();
           LOGGER.info("Send sms {} " + sendRequest);
        }
//        throw new IllegalArgumentException("Phone number [ " + sendRequest.getPhoneNumber() + " ] is not a valid" +
//                "number");
 //   }

//    private boolean isNumberValid(String phoneNumber) {
//        //TODO implement phone number validator
//       // PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
//       return true;
//    }
}
