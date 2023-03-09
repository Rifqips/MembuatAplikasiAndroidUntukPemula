package com.rifqipadisiliwangi.barkasin.model

import com.rifqipadisiliwangi.barkasin.R

object BarkasSingleton {

    private val image = intArrayOf(
        R.drawable.iphonexr,
        R.drawable.nikedunk,
        R.drawable.vespasprint,
        R.drawable.f30,
        R.drawable.macbookm2,
        R.drawable.mouserexus,
        R.drawable.monitormsi,
        R.drawable.daxa,
        R.drawable.jbl,
        R.drawable.legion,
    )

    private val title = arrayOf(
        "I phone XR",
        "Nike Dunk 999",
        "Vespa Sprint",
        "BMW F30",
        "Macbook M2 2022 ",
        "Mouse Rexus",
        "Monitor MSI",
        "Keyboard DAXA ",
        "Headphone Wireless JBL ",
        "Laptop Legion ",
    )

    private val subTitle = arrayOf(
        "Barang mulus, BH 85%. RP. 3.700.000 Net",
        "Masih segel, dijual karena kekecilan, size 41. Rp. 1.250.000 Nego bensin",
        "Vespa Sprint 2020, surat surat lengkap, jarang pakai. Rp. 38.000.000 Net",
        "BMW F30 2009, Mesin halus, service rutin. 2000 KM. Rp. 230.000.000",
        "Barang masih segel, Tidak dipakai karena sudah punya. Rp. 21.000.000",
        "Mouse Rexus, dijual karena hadiah lomba tidak terpakai. Rp.300.000",
        "Monitor MSI, sudah kalibrasi. Dijual karena BU. Rp. 2.300.000",
        "Dijual cepat BU, Keyboard Daxa mulus Rp. 700.000",
        "Headphone wireless JBL, dijual karena bosan. Rp. 800.000",
        "Dijual Laptop Legion 2021, Dijual karena mau ganti mac. RP. 15.000.000",
    )



    private val date = arrayOf(
        "10/01/2023",
        "10/02/2023",
        "10/03/2023",
        "10/04/2023",
        "10/05/2023",
        "10/06/2023",
        "10/07/2023",
        "10/08/2023",
        "10/09/2023",
        "10/10/2023",
    )




    private val number = arrayOf(
        "+6212349295592",
        "+6284127474747",
        "+6287758493939",
        "+6285243214214",
        "+6285683837318",
        "+6281234939382",
        "+6292838282929",
        "+6288272728928",
        "+6285788292920",
        "+6285828290192",
    )

    val listProduk: ArrayList<BarangBekas>
    get() {
        val list = arrayListOf<BarangBekas>()
        for (position in title.indices){
            val barkas = BarangBekas()
            barkas.pict = image[position]
            barkas.title = title[position]
            barkas.subTitle = subTitle[position]
            barkas.date = date[position]
            barkas.number = number[position]
            list.add(barkas)

        }
        return list
    }
}