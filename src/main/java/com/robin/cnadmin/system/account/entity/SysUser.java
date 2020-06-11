package com.robin.cnadmin.system.account.entity;

import com.robin.cnadmin.common.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Data
@Entity
public class SysUser extends BaseEntity {

  private Long deptId;
  private String username;
  private String nickName;
  private String gender;
  private String phone;
  private String email;
  private String avatarName;
  private String avatarPath;
  private String password;
  private Boolean isAdmin;
  private Boolean enabled;
  private String createBy;
  private String updateBy;
  private LocalDateTime pwdResetTime;


}




