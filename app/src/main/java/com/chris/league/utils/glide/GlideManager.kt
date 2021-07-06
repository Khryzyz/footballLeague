package com.chris.league.utils.glide

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.chris.league.R

object GlideManager {

    fun loadBadge(target: ImageView, imageUrl: String) {
        val options: RequestOptions = RequestOptions()
            .placeholder(R.mipmap.loading)
            .error(R.drawable.default_badge)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .priority(Priority.HIGH)
            .dontTransform()

        Glide.with(target.context)
            .setDefaultRequestOptions(options)
            .load(imageUrl)
            .into(target)
    }

}