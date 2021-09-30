package com.example.androidutils.extension

import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

//import androidx.s.widget.SwipeRefreshLayout

@BindingAdapter("refreshing")
fun SwipeRefreshLayout.isRefreshing(visibility: Boolean) {
    isRefreshing = visibility
}