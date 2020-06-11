package com.robin.cnadmin.system.account.repo;

import com.robin.cnadmin.system.account.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @作者 Robin
 * @日期 2020/06/11
 * @描述
 **/
public interface SysUserRepo extends JpaRepository<SysUser,Long> {
}
