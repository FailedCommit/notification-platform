# Turning off the AWS pager so that the CLI doesn't open an editor for each command result
export AWS_PAGER=""

aws cloudformation delete-stack \
  --stack-name failedcommit-basic-service

aws cloudformation wait stack-delete-complete \
  --stack-name failedcommit-basic-service

aws cloudformation delete-stack \
  --stack-name failedcommit-basic-network

aws cloudformation wait stack-delete-complete \
  --stack-name failedcommit-basic-network