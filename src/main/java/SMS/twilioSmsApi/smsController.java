package SMS.twilioSmsApi;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sms")
public class smsController {

    private final Service service;

    public smsController(Service service) {
        this.service = service;
    }

    @PostMapping
    public void sendSms( @RequestBody SendRequest sendRequest){
        service.sendSms(sendRequest);
    }
}
