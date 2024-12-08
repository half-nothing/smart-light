package cn.half.nothing.smartlight.service.impl

import cn.half.nothing.smartlight.dao.IUserDao
import cn.half.nothing.smartlight.model.UserInfo
import cn.half.nothing.smartlight.service.IUserService
import cn.half.nothing.smartlight.utils.SecurityUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service("userService")
class UserServiceImpl : IUserService {
    @Autowired
    private lateinit var userDao: IUserDao
    override fun login(username: String, password: String): UserInfo? {
        val userEntity = userDao.getByUsername(username)
        userEntity ?: return null
        val encryptedPassword = SecurityUtils.encryptPassword(password, userEntity.salt)
        if (encryptedPassword == userEntity.password) {
            return userEntity.toUserInfo()
        }
        return null
    }
}
