package com.cb.notificationtemplate.beans.dtos;

import com.cb.notificationtemplate.beans.NotificationTemplate;
import com.cb.notificationtemplate.beans.enums.TemplateType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@NotBlank
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotificationTemplateRequest {
    @NotBlank
    private String customerId;
    private List<NotificationParameter> notificationParameters;
    // TODO: thse should be coming from preference service for the given customer Id
    private String notificationTemplateName;
    private String notificationMode;

    @Data
    @NoArgsConstructor
    public static class NotificationParameter {
        private String notificationParameterName;
        private String notificationParameterValue;
    }
}
