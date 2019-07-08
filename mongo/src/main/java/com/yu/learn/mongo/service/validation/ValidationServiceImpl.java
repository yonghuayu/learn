package com.yu.learn.mongo.service.validation;

import com.yu.learn.global.web.group.IAddGroup;
import com.yu.learn.global.web.group.IModifyGroup;
import com.yu.learn.mongo.form.ValidationFormBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

/**
 * 参数校验
 *
 * @author yuyonghua
 * @date 2019/7/5 15:21
 */
@Slf4j
@Service
@Validated
public class ValidationServiceImpl implements ValidationService {

    @Override
    public String notNull(@NotNull String msg) {
        return msg;
    }

    @Override
    public String notBlank(@NotBlank String msg) {
        return msg;
    }

    @Override
    public String size(@Size(min = 1, max = 3) String msg) {
        return msg;
    }

    @Override
    public String notEmpty(@NotEmpty List<String> msg) {
        return msg.toString();
    }

    @Override
    public String max(@Max(3) int msg) {
        return String.valueOf(msg);
    }

    @Override
    public String min(@Min(3) long msg) {
        return String.valueOf(msg);
    }

    @Override
    public String add(@Valid ValidationFormBean validationFormBean) {

        return validationFormBean.toString();
    }

    @Override
    public String modify(@Validated({IModifyGroup.class}) ValidationFormBean validationFormBean) {
        return validationFormBean.toString();
    }
}
