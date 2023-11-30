package com.pgp.app.modules.courses10.data.model

import com.pgp.app.R
import com.pgp.app.appcomponents.di.MyApp
import kotlin.String

data class ListtitleRowModel2 (
    var txtTitle2: String? = MyApp.getInstance().resources.getString(R.string.msg_glenmarie_golf),
    var imageResId2: Int? = null
)