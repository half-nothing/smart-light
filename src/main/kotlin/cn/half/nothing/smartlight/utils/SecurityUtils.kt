package cn.half.nothing.smartlight.utils

import cn.hutool.core.util.RandomUtil
import cn.hutool.crypto.SecureUtil

object SecurityUtils {
    fun getSalt(): String {
        return RandomUtil.randomString(32)
    }

    fun encryptPassword(password: String, salt: String): String {
        return SecureUtil.sha256(salt.substring(0, 16) + "." + password + "." + salt.substring(16))
    }
}
