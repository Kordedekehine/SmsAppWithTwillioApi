package SMS.twilioSmsApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SendRequest {
    //WHERE WE SENDING TO AND THE MESSAGE WE SENDING

    private final String phoneNumber;

    private final String message;

    public SendRequest(@JsonProperty("phoneNumber") String phoneNumber, @JsonProperty("message") String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "SendRequest{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
