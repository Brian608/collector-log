# collector-log
本地日志通过filebeat组件生成到kafak，通过logstash 过滤后sync到es上，用kabina展示  watcher 监控告警

-- 查看所有topic
.\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --list

-- 查看指定topic信息
.\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic your_topic_name
