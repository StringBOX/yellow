package com.yellow.requestp

import com.yellow.apidoc.ApiRequestDoc

/**
 * 注册的请求参数
 */
object RegisteredP {

    @ApiRequestDoc("是", "帐号")
    const val USERNAME = "username"

    @ApiRequestDoc("是", "密码")
    const val PASSWORD = "password"

    @ApiRequestDoc("是", "别名")
    const val ALIAS = "alias"

}