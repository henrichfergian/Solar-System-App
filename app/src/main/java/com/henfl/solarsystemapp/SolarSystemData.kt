package com.henfl.solarsystemapp

object SolarSystemData {
    private val data = arrayOf(
        arrayOf(
            "Matahari",
            "(2,25–2,50)×10^8 periode galaksi",
            "25,05 hari",
            """
                6,0877×10^12 km²
                11.990 × Bumi"
            """.trimIndent(),
            """
                1.9885×10^30 kg
                333 × Bumi
            """.trimIndent(),
            """
                1,412×10^18 km³
                1.300.000 × Bumi
            """.trimIndent(),
            "1,392684×10^6 km",
            "Matahari atau Surya adalah bintang di pusat Tata Surya. Bentuknya nyaris bulat dan terdiri dari plasma panas bercampur medan magnet. Secara kimiawi, sekitar tiga perempat massa Matahari terdiri dari hidrogen, sedangkan sisanya didominasi helium. Sisa massa tersebut (1,69%, setara dengan 5.629 kali massa Bumi) terdiri dari elemen-elemen berat seperti oksigen, karbon, neon, besi, dan lain-lain.",
            "https://upload.wikimedia.org/wikipedia/commons/b/b4/The_Sun_by_the_Atmospheric_Imaging_Assembly_of_NASA%27s_Solar_Dynamics_Observatory_-_20100819.jpg"
        ),
        arrayOf(
            "Merkurius",
            """
                87.969 1 hari
                0.240 846 tahun
            """.trimIndent(),
            "1407,5 jam",
            """
                7,48×10^7 km²
                0,108 × Bumi
            """.trimIndent(),
            """
                3,3022×10^23 kg
                0,055 × Bumi
            """.trimIndent(),
            """
                6,083×10^10 km³
                0,054 × Bumi
            """.trimIndent(),
            "Merkurius adalah planet terkecil di dalam tata surya dan juga yang terdekat dengan Matahari dengan kala revolusi 88 hari dan kala rotasi 59 hari. Merkurius mempunyai inti besi yang menciptakan sebuah medan magnet dengan kekuatan 0.1% dari kekuatan medan magnet bumi. Suhu permukaan dari Merkurius berkisar antara 90 sampai 700 Kelvin (-180 sampai 430 derajat Celcius).",
            "https://upload.wikimedia.org/wikipedia/commons/d/d9/Mercury_in_color_-_Prockter07-edit1.jpg"
        ),
        arrayOf(
            "Venus",
            """
                224,701 hari
                0,615 198 tahun
            """.trimIndent(),
            "−243,018 5 hari (maju mundur)",
            """
                4,60×10^8 km²
                0,902 Bumi
            """.trimIndent(),
            """
                4,8676×10^24 kg
                0,815 × Bumi
            """.trimIndent(),
            """
                9,28×10^11 km³
                0,866 × Bumi
            """.trimIndent(),
            "12.092 km",
            "Venus dalah salah satu dari empat planet kebumian di Tata Surya, yang berarti bahwa Venus merupakan planet yang berbatu layaknya Bumi. Akan tetapi, keadaan di permukaan Venus sangat berbeda dengan Bumi, dan hal ini disebabkan oleh atmosfer tebal Venus yang terdiri dari 96,5% karbon dioksida dan 3,5% nitrogen.",
            "https://upload.wikimedia.org/wikipedia/commons/e/e5/Venus-real_color.jpg"
        ),
        arrayOf(
            "Bumi",
            """
                365,256363004 hari
                1,000017421 tahun
            """.trimIndent(),
            "0,99726968 hari",
            "510.072.000 km²",
            "5,97219×10^24 kg",
            "1,08321×10^12 km³",
            "12.742 km",
            "Bumi adalah planet ketiga dari Matahari yang merupakan planet terpadat dan terbesar kelima dari delapan planet dalam Tata Surya. Bumi terbentuk sekitar 4,54 miliar tahun yang lalu, dan kehidupan sudah muncul di permukaannya paling tidak sekitar 3,5 miliar tahun yang lalu.",
            "https://upload.wikimedia.org/wikipedia/commons/6/6f/Earth_Eastern_Hemisphere.jpg"
        ),
        arrayOf(
            "Mars",
            "686,971 hari",
            "1,025 957 hari",
            """
                144.798.500 km²
                0,284 × Bumi
            """.trimIndent(),
            """
                6,4185×10^23 kg
                0,107 × Bumi
            """.trimIndent(),
            """
                1,6318×10^11 km³
                0,151 × Bumi
            """.trimIndent(),
            "",
            "Mars adalah planet terdekat keempat dari Matahari. Namanya diambil dari dewa perang Romawi, Mars. Planet ini sering dijuluki sebagai \"planet merah\" karena tampak dari jauh berwarna kemerah-kemerahan. Ini disebabkan oleh keberadaan besi(III) oksida di permukaan planet Mars.",
            "https://upload.wikimedia.org/wikipedia/commons/7/76/Mars_Hubble.jpg"
        ),
        arrayOf(
            "Ceres",
            """
                4,60 tahun
                1679,67 hari
            """.trimIndent(),
            "0,3781 hari",
            "2.850.000 km²",
            """
                9,43 ± 0,07×10^20 kg
                0,00015 × Bumi
            """.trimIndent(),
            "km³",
            "950 km",
            "Ceres merupakan benda langit berbatu dan ber-es dengan diameter sebesar 950 km dan merupakan planet katai terkecil yang pernah ditemukan. Massa Ceres meliputi sepertiga massa sabuk asteroid. Permukaan Ceres mungkin merupakan campuran antara es air dan berbagai mineral terhidrasi seperti karbonat dan lempung.",
            "https://upload.wikimedia.org/wikipedia/commons/7/76/Ceres_-_RC3_-_Haulani_Crater_%2822381131691%29_%28cropped%29.jpg"
        ),
        arrayOf(
            "Jupiter",
            """
                4.332,59 hari
                11,8618 tahun
            """.trimIndent(),
            "9,925 jam",
            """
                6,1419×10^10 km²
                121,9 × Bumi
            """.trimIndent(),
            """
                1,8986×10^27 kg
                317,8 × Bumi
            """.trimIndent(),
            """
                1,4313×10^15 km³
                1321,3 × Bumi
            """.trimIndent(),
            "142.984 km",
            "Jupiter adalah planet terdekat kelima dari Matahari setelah Merkurius, Venus, Bumi, dan Mars. Planet ini juga merupakan planet terbesar di Tata Surya. upiter sebagian besar terdiri dari hidrogen dan helium. Seperempat massa Jupiter merupakan helium, walaupun jumlahnya hanya sepersepuluh komposisi Jupiter. Planet ini mungkin memiliki inti berbatu yang terdiri dari unsur-unsur berat, namun tidak memiliki permukaan yang padat layaknya raksasa gas lainnya.",
            "https://upload.wikimedia.org/wikipedia/commons/2/2b/Jupiter_and_its_shrunken_Great_Red_Spot.jpg"
        ),
        arrayOf(
            "Saturnus",
            """
                10.832,327 hari
                29,657 296 tahun
            """.trimIndent(),
            "0,439 – 0,449 hari",
            """
                4,27×10^10 km²
                83,703 × Bumi
            """.trimIndent(),
            """
                5,6846×10^26 kg
                95,152 × Bumi
            """.trimIndent(),
            """
                8,2713×10^14 km³
                763,59 × Bumi
            """.trimIndent(),
            "120.536 km",
            "Saturnus adalah sebuah planet di tata surya yang dikenal juga sebagai planet bercincin, dan merupakan planet terbesar kedua di tata surya setelah Jupiter. Saturnus memiliki kerapatan yang rendah karena sebagian besar zat penyusunnya berupa gas dan cairan. Inti Saturnus diperkirakan terdiri dari batuan padat dengan atmosfer tersusun atas gas amonia dan metana, hal ini tidak memungkinkan adanya kehidupan di Saturnus.",
            "https://upload.wikimedia.org/wikipedia/commons/archive/e/e3/20120129143153%21Saturn_from_Cassini_Orbiter_%282004-10-06%29.jpg"
        ),
        arrayOf(
            "Uranus",
            """
                30.799,095 hari
                84,323 326 tahun
            """.trimIndent(),
            "−0,718 33 hari",
            """
                8,115 6×10^9 km²
                15,91 × Bumi
            """.trimIndent(),
            """
                (8,6810 ± 0,0013)×10^25 kg
                14,536 × Bumi
            """.trimIndent(),
            """
                6,833×10^13 km³
                63,086 × Bumi
            """.trimIndent(),
            "25.559 ± 4 km",
            "Uranus adalah planet ketujuh dari Matahari. Uranus merupakan planet yang memiliki jari-jari terbesar ketiga sekaligus massa terbesar keempat di Tata Surya. Komposisi Uranus serupa dengan Neptunus, dan keduanya mempunyai komposisi kimiawi yang berbeda dari raksasa gas yang lebih besar, Jupiter dan Saturnus.",
            "https://upload.wikimedia.org/wikipedia/commons/3/3d/Uranus2.jpg"
        ),
        arrayOf(
            "Neptunus",
            """
                164.8 tahun
                60.190,03 hari
            """.trimIndent(),
            "0,6713 hari",
            """
                7,6408×10^9 km²
                14,98 × Bumi
            """.trimIndent(),
            """
                1,0243×10^26 kg
                17,147 × Bumi
            """.trimIndent(),
            """
                6,254×10^13 km³
                57,74 × Bumi
            """.trimIndent(),
            "49.530 km",
            "Neptunus merupakan planet terjauh (kedelapan) jika ditinjau dari Matahari. Neptunus merupakan planet terbesar keempat berdasarkan diameter (49.530 km) dan terbesar ketiga berdasarkan massa. Komposisi penyusun planet ini mirip dengan Uranus, dan komposisi keduanya berbeda dari raksasa gas Jupiter dan Saturnus.",
            "https://upload.wikimedia.org/wikipedia/commons/5/56/Neptune_Full.jpg"
        ),
        arrayOf(
            "Pluto",
            """
                247,68 tahun
                90.465 hari
            """.trimIndent(),
            "−6,387230 hari",
            """
                1,665×10^7 km²
                0,033 × Bumi
            """.trimIndent(),
            """
                (1,305±0,007)×10^22 kg
                0,00218 × Bumi
            """.trimIndent(),
            """
                6,39×10^9 km³
                0,0059 × Bumi
            """.trimIndent(),
            "2370 km",
            "Pluto merupakan planet katai terbesar dan bermassa terbesar kedua di Tata Surya dan benda terbesar kesembilan dan bermassa terbesar kesepuluh yang mengorbit Matahari secara langsung. Pluto merupakan objek trans-Neptunus dengan volume terbesar dan massa yang sedikit lebih kecil daripada Eris, planet katai di piringan tersebar. ",
            "https://upload.wikimedia.org/wikipedia/commons/5/5a/Pluto_by_LORRI_and_Ralph%2C_13_July_2015.jpg"
        )
    )

    val listData: ArrayList<SolarSystem>
        get() {
            val list = arrayListOf<SolarSystem>()
            for (aData in data) {
                val spaceObj = SolarSystem()
                spaceObj.name=aData[0]
                spaceObj.orbitP=aData[1]
                spaceObj.rotP=aData[2]
                spaceObj.area=aData[3]
                spaceObj.mass=aData[4]
                spaceObj.volume=aData[5]
                spaceObj.diameter=aData[6]
                spaceObj.desc=aData[7]
                spaceObj.photo=aData[8]

                list.add(spaceObj)
            }
            return list
        }
}