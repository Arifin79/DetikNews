package com.example.detiknews.NewsAdapter

import android.provider.ContactsContract
import com.example.detiknews.R

data class news(var title: String, var desc: String, var photo: Int, var detail: String)


object NewsModel{
    val newslist = listOf<news>(
        news("Pasar ramai di kunjungi warga meskipun wabah covid 19 belum di nyatakan usai",
        "detik | 1 jam yang lalu ",
        R.drawable.img_news1,
        "semua pasar ramai sehingga pandangan menjadi rentan terkena covid 19"),

        news("Pasar ramai di kunjungi warga meskipun wabah covid 19 belum di nyatakan usai",
            "detik | 1 jam yang lalu ",
            R.drawable.img_news2,
            "semua pasar ramai sehingga pandangan menjadi rentan terkena covid 19"),

        news("Pasar ramai di kunjungi warga meskipun wabah covid 19 belum di nyatakan usai",
            "detik | 1 jam yang lalu ",
            R.drawable.img_news3,
            "semua pasar ramai sehingga pandangan menjadi rentan terkena covid 19"),

        news("Pasar ramai di kunjungi warga meskipun wabah covid 19 belum di nyatakan usai",
            "detik | 1 jam yang lalu ",
            R.drawable.img_news4,
            "semua pasar ramai sehingga pandangan menjadi rentan terkena covid 19"),

        news("Pasar ramai di kunjungi warga meskipun wabah covid 19 belum di nyatakan usai",
            "detik | 1 jam yang lalu ",
            R.drawable.img_news5,
            "semua pasar ramai sehingga pandangan menjadi rentan terkena covid 19"),

        news("Pasar ramai di kunjungi warga meskipun wabah covid 19 belum di nyatakan usai",
            "detik | 1 jam yang lalu ",
            R.drawable.img_news6,
            "semua pasar ramai sehingga pandangan menjadi rentan terkena covid 19"),

        news("Pasar ramai di kunjungi warga meskipun wabah covid 19 belum di nyatakan usai",
            "detik | 1 jam yang lalu ",
            R.drawable.img_news7,
            "semua pasar ramai sehingga pandangan menjadi rentan terkena covid 19"),

        news("Pasar ramai di kunjungi warga meskipun wabah covid 19 belum di nyatakan usai",
            "detik | 1 jam yang lalu ",
            R.drawable.img_news8,
            "semua pasar ramai sehingga pandangan menjadi rentan terkena covid 19"),

        news("Pasar ramai di kunjungi warga meskipun wabah covid 19 belum di nyatakan usai",
            "detik | 1 jam yang lalu ",
            R.drawable.img_news9,
            "semua pasar ramai sehingga pandangan menjadi rentan terkena covid 19")
    )
}