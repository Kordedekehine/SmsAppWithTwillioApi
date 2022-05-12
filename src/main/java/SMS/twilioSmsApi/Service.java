package SMS.twilioSmsApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service
public class Service {
  //  private final TwilioSmsSender twilioSmsSender;
    private final SmsSender smsSender;
@Autowired
    public Service(@Qualifier("twilio") SmsSender smsSender) {
        this.smsSender = smsSender;
    }

    public void sendSms(SendRequest smsRequest){
        smsSender.sendSms(smsRequest);
    }
}
