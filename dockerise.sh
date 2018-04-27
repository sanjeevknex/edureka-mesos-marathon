#!/usr/bin/env bash
set -e
docker build -t edureka/mesos-marathon-demo:1 .
docker push edureka/mesos-marathon-demo:1
