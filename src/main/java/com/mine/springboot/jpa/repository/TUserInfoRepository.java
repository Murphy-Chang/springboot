package com.mine.springboot.jpa.repository;

import com.mine.springboot.jpa.entity.TUserInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c) 2018
 *
 * @author Murphy.Chang
 * @version 1.0
 * @date 2018/5/29
 */
public interface TUserInfoRepository extends CrudRepository<TUserInfo, Integer> {
}
