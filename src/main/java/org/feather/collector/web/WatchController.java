package org.feather.collector.web;

import com.alibaba.fastjson.JSON;
import org.feather.collector.entity.AccurateWatcherMessage;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: collector-log
 * @package: org.feather.collector.web
 * @className: WatchController
 * @author: feather(杜雪松)
 * @description: TODO
 * @since: 2023-04-25 16:14
 * @version: 1.0
 */
@RestController
public class WatchController {

    @RequestMapping("/accurateWatch")
    public String watch(@RequestBody AccurateWatcherMessage accurateWatcherMessage){
        String ret= JSON.toJSONString(accurateWatcherMessage);
        return "is watched"+ret;
    }

}
