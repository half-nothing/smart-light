package cn.half.nothing.smartlight.controller

import cn.half.nothing.smartlight.model.Response
import cn.half.nothing.smartlight.service.IUserService
import com.alibaba.fastjson2.JSON
import com.alibaba.fastjson2.JSONObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller("userController")
@RequestMapping("/user")
class UserController {
    @Autowired
    private lateinit var userService: IUserService

    @PostMapping("/login")
    @ResponseBody
    fun login(@RequestBody jsonString: String): Response {
        val jsonObject = JSON.parse(jsonString) as JSONObject
        val username = jsonObject.getString("username")
        val password = jsonObject.getString("password")
        val userInfo = userService.login(username, password)
        userInfo ?: return Response.error("Login fail")
        return Response.success(userInfo)
    }
}
