# mqtt-demo
基于spring-boot2.0.3，eclipse.paho.mqttv3.1.2的接收与推送集成；

使用中需要注意的一点推送的clientId和订阅的clientId不能是同一个ID，启动的时候需要有一个默认的订阅，否则启动的时候会抛出一个异常（org.eclipse.paho.client.mqttv3.MqttException: 已断开连接）；推送的主题在推送的时候可以动态添加；

配置文件根据自己的实际需要进行修改。
