#!/usr/bin/env bash

mvn compile -Phadoop_yarn \
 -Dhadoop.version=2.7.0-mapr-1707 \
 -Ddep.hbase.version=1.1.8-mapr-1710 \
 -Ddep.hcatalog.version=2.1.1-mapr-1803 \
 -Ddep.hive.version=2.1.1-mapr-1803 \
 -Ddep.zookeeper.version=3.4.5-mapr-1604

