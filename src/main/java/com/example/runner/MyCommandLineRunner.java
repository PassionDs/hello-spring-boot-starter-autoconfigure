/*
 * 四川生学教育科技有限公司
 * Copyright (c) 2015-2025 Founder Ltd. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Founder. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the agreements
 * you entered into with Founder.
 *
 */
package com.example.runner;

import org.springframework.boot.CommandLineRunner;

/**
 * 关于这货，我们需要关注的点有两个：
 * <p>
 * 1.所有CommandLineRunner的执行时间点是在SpringBoot应用的Application完全初始化工作之后(这里我们可以认为是SpringBoot应用启动类main方法执行完成之前的最后一步)。
 * 2.当前SpringBoot应用的ApplicationContext中的所有CommandLinerRunner都会被加载执行(无论是手动注册还是被自动扫描注册到IoC容器中)。
 * 　　跟其他几个扩展点接口类型相似，我们建议CommandLineRunner的实现类使用{@link org.springframework.core.annotation.Order}进行标注或者实现
 * {@link org.springframework.core.Ordered}接口，便于对他们的执行顺序进行排序调整，这是非常有必要的，因为我们不希望不合适的CommandLineRunner实现类阻塞了后面其他CommandLineRunner
 * 的执行。这个接口非常有用和重要，我们需要重点关注。
 *
 * @author di.mao
 * @version 1.0
 * Copyright: Copyright (c) 2020
 * @date 2020/5/26 9:49
 */
public class MyCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

    }
}
