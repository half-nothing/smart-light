package cn.half.nothing.smartlight.service

import cn.half.nothing.smartlight.model.UserInfo

interface IUserService {
    fun login(username: String, password: String): UserInfo?
}
