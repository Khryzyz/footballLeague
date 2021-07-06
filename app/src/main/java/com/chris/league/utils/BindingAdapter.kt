package com.chris.league.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.chris.league.utils.glide.GlideManager

@BindingAdapter("loadBadgeTeam")
fun bindLoadBadgeTeam(imageView: ImageView, imageUrl: String?) {
    if (imageUrl != null) {
        GlideManager.loadBadge(
            target = imageView,
            imageUrl = imageUrl
        )
    }
}