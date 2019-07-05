package com.yu.learn.mongo.service.validation;

import javax.validation.constraints.*;
import java.util.List;

/**
 * 参数校验
 *
 * @author yuyonghua
 * @date 2019/7/5 15:15
 */
public interface ValidationService {

    /**
     * 不为null
     *
     * @param msg msg
     * @return msg
     */
    String notNull(@NotNull String msg);

    /**
     * 不为空
     *
     * @param msg msg
     * @return msg
     */
    String notBlank(@NotBlank String msg);

    /**
     * 范围
     *
     * @param msg msg
     * @return msg
     */
    String size(@Size(min = 1, max = 3) String msg);

    /**
     * 不为empty
     *
     * @param msg msg
     * @return msg
     */
    String notEmpty(@NotEmpty List<String> msg);

    /**
     * 最大值为3
     *
     * @param msg msg
     * @return msg
     */
    String max(@Max(3) int msg);

    /**
     * 最小值为3
     *
     * @param msg msg
     * @return msg
     */
    String min(@Min(3) long msg);
}
