package com.example.jasamedika.b2app


enum class Model private constructor(val titleResId: Int, val layoutResId: Int) {
    RED(R.string.one, R.layout.fragment_tab1),
    BLUE(R.string.two, R.layout.fragment_tab2),
    GREEN(R.string.three, R.layout.fragment_tab3)
}