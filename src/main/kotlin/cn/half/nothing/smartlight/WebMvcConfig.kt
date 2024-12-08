package cn.half.nothing.smartlight

import com.alibaba.fastjson2.support.config.FastJsonConfig
import com.alibaba.fastjson2.support.spring6.http.converter.FastJsonHttpMessageConverter
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import java.nio.charset.Charset

@Configuration
@EnableWebMvc
class WebMvcConfig : WebMvcConfigurer {
    override fun configureMessageConverters(converters: MutableList<HttpMessageConverter<*>>) {
        val fastJsonConverter = FastJsonHttpMessageConverter()
        val config = FastJsonConfig()
        config.charset = Charset.forName("UTF-8")
        config.dateFormat = "yyyy-MM-dd HH:mm:ss"
        fastJsonConverter.fastJsonConfig = config
        fastJsonConverter.supportedMediaTypes = arrayListOf(MediaType.APPLICATION_JSON)
        converters.add(fastJsonConverter)
    }
}
