package com.aplikasi.myportofolio


object DataProjects {
    private val titleProjects = arrayOf(
        "Doa dan Dzikir App",
        "News App",
        "Portofolio App",
        "Recipe App",
        "My Portofolio App"
    )

    private val descProjects = arrayOf(
        "Doa dan Dzikir App" +
                "\n" +
                "mempermudah kaum muslimin untuk berdzikir" +
                "\n" +
                "Dibuat oleh IDN",
        "News App" +
                "\n" +
                "dibuat untuk membaca berita-berita" +
                "\n" +
                "Dibuat oleh IDN",
        "Portofolio App" +
                "\n" +
                "dibuat untuk me-mamerkan skill-skill anda" +
                "\n" +
                "Dibuat oleh IDN",
        "Recipe App" +
                "\n" +
                "Resep-resep yang mungkin anda cari ada di aplikasi ini" +
                "\n" +
                "Dibuat oleh IDN",
        "My Portofolio App" +
                "\n" +
                "Mirip dengan aplikasi portofolio app" +
                "\n" +
                "namun, Aplikasi ini lebih ringkas dan" +
                "\n" +
                "dibuat oleh sekelompok santri teladan" +
                "\n" +
                "Dibuat oleh Kelompok Alif"
    )

    private val imgProjects = intArrayOf(
        R.drawable.dzikir_app,
        R.drawable.news_app,
        R.drawable.portofolio_app,
        R.drawable.recipe_app,
        R.drawable.recipe_app
    )

    val listAllProjects: ArrayList<Projects>
        get() {
            val listProjects = arrayListOf<Projects>()
            for (position in titleProjects.indices) {
                val projects = Projects(
                    title = titleProjects[position],
                    desc = descProjects[position],
                    image = imgProjects[position]
                )
                listProjects.add(projects)
            }
            return listProjects
        }
}