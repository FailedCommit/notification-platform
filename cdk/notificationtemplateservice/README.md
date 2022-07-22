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

* `cdk bootstrap -c accountId=123456789012 -c region=us-east-1` Refer: https://docs.aws.amazon.com/cdk/v2/guide/bootstrapping.html
* `cdk deploy -c accountId=123456789012 -c region=us-east-1`

### Output 
```
 ✅  SpringBootApplication

✨  Deployment time: 363.24s

Outputs:
SpringBootApplication.loadbalancerDnsName = prod-loadbalancer-580696646.us-east-1.elb.amazonaws.com
Stack ARN:
arn:aws:cloudformation:us-east-1:987337930789:stack/SpringBootApplication/eb92fad0-09cc-11ed-8c49-0aeeac31847b

✨  Total time: 372.42s
```


### Verify

You can hit the <SpringBootApplication.loadbalancerDnsName>/notification-templates URL on the browser to see

```Hello From Cloudformation :-)```

Also, resources are created on AWS

![img.png](cdkstackcreated.png)

:bangbang: Note

Don't forget to invoke ```cdk destroy``` when done. Leaving the infra running will cost money on hourly basis.

* `cdk destroy -c accountId=123456789012 -c region=us-east-1`

Without accountId and region params, the command will pick the default values configured in the CLI.

Enjoy!
