package SMS.twilioSmsApi;

import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioInitializer {

    private final static Logger LOGGER = LoggerFactory.getLogger(TwilioInitializer.class);
    private final TwilioConfiguration twilioConfiguration;

    public TwilioInitializer(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
        Twilio.init(
                twilioConfiguration.getAccountSid(),twilioConfiguration.getAuthToken()
        ); //this is to initialize the connection to twilio api.We get to install the api

        LOGGER.info("Twilio initialized...with account sid {} ",twilioConfiguration.getAccountSid());
    }



}
