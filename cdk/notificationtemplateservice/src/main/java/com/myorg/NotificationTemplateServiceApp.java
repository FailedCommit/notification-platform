package com.myorg;

import dev.stratospheric.cdk.SpringBootApplicationStack;
import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;

import static java.util.Objects.requireNonNull;

public class NotificationTemplateServiceApp {
    public static void main(final String[] args) {
        App app = new App();
        String accountId = (String) app
                .getNode()
                .tryGetContext("accountId");
        requireNonNull(accountId, "context variable 'accountId' must not be null");

        String region = (String) app
                .getNode()
                .tryGetContext("region");
        requireNonNull(accountId, "context variable 'region' must not be null");

        new SpringBootApplicationStack(
                app,
                "SpringBootApplication",
                makeEnv(accountId, region),
                "docker.io/mohitchilkoti/notificationtemplateservice-v1:latest");

        app.synth();
    }

    private static Environment makeEnv(String accountId, String region) {
        return Environment.builder()
                .account(accountId)
                .region(region)
                .build();
    }
}

