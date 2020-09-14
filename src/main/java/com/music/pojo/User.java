package com.music.pojo;


import com.laoxuai.ibatis.annotation.Column;
import com.laoxuai.ibatis.annotation.Id;
import com.laoxuai.ibatis.annotation.Table;

@Table(value = "t_user")
public class User {

    @Id
    @Column("id")
    private Long id;

    @Column("name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }

}
