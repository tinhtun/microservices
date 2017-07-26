# Logging

## EFK Stack (Elastic Search, Fluentd, Kibana)
- Go to EFK and run ($ docker-compose up -d)
- Send test log to Fluentd
   - $ docker run --rm --log-driver=fluentd --log-opt fluentd-address=localhost:24224 ubuntu echo "Hello world"

### Resources
- http://docs.fluentd.org/v0.12/articles/docker-logging-efk-compose
- https://geowarin.github.io/spring-boot-logs-in-elastic-search.html
  - github: https://github.com/geowarin/fluentd-boot

## ELK Stack (Elastic Search, Logstash, Kibana)

### Resources
- https://programmaticponderings.com/2017/04/10/streaming-docker-logs-to-the-elastic-stack-using-fluentd/