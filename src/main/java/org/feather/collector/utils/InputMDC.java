package org.feather.collector.utils;

import org.jboss.logging.MDC;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @projectName: collector-log
 * @package: org.feather.collector.utils
 * @className: InputMDC
 * @author: feather(杜雪松)
 * @description: TODO
 * @since: 2023-04-24 15:17
 * @version: 1.0
 */
@Component
public class InputMDC  implements EnvironmentAware {

    private  static  Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        InputMDC.environment=environment;
    }

    public static  void  putMDC(){
        MDC.put("hostName", NetUtil.getLocalHostName());
        MDC.put("ip", NetUtil.getLocalIp());
        MDC.put("applicationName", environment.getProperty("spring.application.name"));
    }
}
