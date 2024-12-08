package cn.half.nothing.smartlight.entity

import cn.half.nothing.smartlight.model.UserInfo

data class User(
    var id: Int,
    var username: String,
    var password: String,
    var salt: String
) {
    fun toUserInfo(): UserInfo {
        return UserInfo(username)
    }
}
