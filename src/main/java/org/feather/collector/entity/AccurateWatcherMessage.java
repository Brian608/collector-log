package org.feather.collector.entity;

import lombok.Data;

/**
 * @projectName: collector-log
 * @package: org.feather.collector.entity
 * @className: AccurateWatcherMessage
 * @author: feather(杜雪松)
 * @description: TODO
 * @since: 2023-04-25 16:16
 * @version: 1.0
 */

@Data
public class AccurateWatcherMessage {

    private String title;

    private String executionTime;

    private String applicationName;

    private String level;

    private String body;

}

