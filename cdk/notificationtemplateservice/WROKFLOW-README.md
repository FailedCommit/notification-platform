## Notification Platform CI/CD

I have chosen `Github Actions` to build the CI/CD workflow for Notification Platform. 
This allows me to keep all my workflow changes `version controlled` and not to tightly couple 
to any existing 3rd party technologies like Jenkins, AWS CodePipeline etc.

You might see below code block in the workflow yml files. 
The actual values are configured in [Secrets context](https://github.com/FailedCommit/notification-platform/settings/secrets/actions) available under repo's Settings.

```
env:
AWS_ACCESS_KEY_ID: ${{ secrets.AWS_ACCESS_KEY_ID }}
AWS_SECRET_ACCESS_KEY: ${{ secrets.AWS_SECRET_ACCESS_KEY }}
AWS_DEFAULT_REGION: ${{ secrets.AWS_REGION }}
```

The Github repo's `secrets context` will make all the configured secrets available as and when required.
Secrets are `Write Only` and can not be viewed again after storing. They also won't be logged in `Github Action Logs`.
Even if one of our jobs prints them to the console, they'd be masked wih asterisk characters in the logs.