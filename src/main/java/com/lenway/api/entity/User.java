package com.lenway.api.entity;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
/** 用户实体类, 可以通过右键生成 get/set等方法 */
public class User  {
    /** 持久化参数 */
    private static final long serialVersionUID = -8447170587360305408L;

    @NotNull(message = "id不能为空")  // json没有该字段
    @NotEmpty(message = "id不能为空") // json有该字段，值为空
    private String id;
    @NotNull(message = "账号不能为空")
    @Size(min = 6, max = 11, message = "账号长度必须是6-11个字符")
    private String ant;
    @NotNull(message = "密码不能为空")
    @Size(min = 6, max = 11, message = "密码长度必须是6-16个字符")
    private String pwd;
    @NotNull(message = "电话或手机号不能为空")
    @Pattern(regexp = "^1\\d{10}$|^(0\\d{2,3}-?|\\(0\\d{2,3}\\))?[1-9]\\d{4,7}(-\\d{1,8})?$", message = "电话或手机号格式不正确")
    private String phone;
    @NotNull(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnt() {
        return ant;
    }

    public void setAnt(String ant) {
        this.ant = ant;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
