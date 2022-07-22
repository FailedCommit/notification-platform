# Welcome to your CDK Java project!

This is a blank project for CDK development with Java.

The `cdk.json` file tells the CDK Toolkit how to execute your app.

It is a [Maven](https://maven.apache.org/) based project, so you can open this project with any Maven compatible Java IDE to build and run tests.

## Useful commands

 * `mvn package`     compile and run tests
 * `cdk ls`          list all stacks in the app
 * `cdk synth`       emits the synthesized CloudFormation template
 * `cdk deploy`      deploy this stack to your default AWS account/region
 * `cdk diff`        compare deployed stack with current state
 * `cdk docs`        open CDK documentation

:bangbang: ### Note

Don't forget to invoke ```cdk destroy``` to remove any infrastructure you've created. Leaving the infra running will cost money on hourly basis.

```cdk deploy -c accountId=123456789012 -c region=us-east-1```

Without accountId and region params, the command will pick the default values configured in the CLI.

Enjoy!
