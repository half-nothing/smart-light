package cn.half.nothing.smartlight.model

data class Response(
    val status: Boolean,
    val message: String? = null,
    val data: Any? = null
) {
    companion object {
        fun success(data: Any): Response = Response(true, "success", data)
        fun success(data: Any, message: String): Response = Response(true, message, data)
        fun error(message: String): Response = Response(false, message)
        fun error(message: String, data: Any): Response = Response(false, message, data)
    }
}
