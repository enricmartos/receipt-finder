package org.emartos.multimodulespringbootskeleton;

public class HealthCheck {
    private String message;

    public HealthCheck(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
