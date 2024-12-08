package cn.half.nothing.smartlight.dao

import cn.half.nothing.smartlight.entity.User
import org.apache.ibatis.annotations.Mapper

@Mapper
interface IUserDao {
    fun getById(id: Int): User?
    fun getByUsername(username: String): User?
}
