package com.pgp.app.appcomponents.database

object GolfCourseData {
    fun getCourses(): List<GolfCourse> {
        return GolfCourseData.course
    }
    val course = listOf(
        GolfCourse(courseName = "BUKIT JALIL", clubId = 1, blueCr = 72.0, blueSr = 124, whiteCr = 69.9, whiteSr = 120, redCr = 72.2, redSr = 128),
        GolfCourse(courseName = "HILLS/LAKE", clubId = 2, blueCr = 71.0, blueSr = 131, whiteCr = 69.0, whiteSr = 128, redCr = 72.2, redSr = 130),
        GolfCourse(courseName = "LAKE/FORREST", clubId = 2, blueCr = 70.3, blueSr = 131, whiteCr = 67.9, whiteSr = 124, redCr = 70.6, redSr = 127),
        GolfCourse(courseName = "HILLS/FORREST", clubId = 2, blueCr = 69.3, blueSr = 129, whiteCr = 67.8, whiteSr = 123, redCr = 68.5, redSr = 126),
        GolfCourse(courseName = "WH", clubId = 3, blueCr = 73.3, blueSr = 126, whiteCr = 73.3, whiteSr = 126, redCr = 69.8, redSr = 121),
        GolfCourse(courseName = "KRAT", clubId = 4, blueCr = 70.7, blueSr = 126, whiteCr = 70.7, whiteSr = 126, redCr = 73.4, redSr = 132),
        GolfCourse(courseName = "EAST", clubId = 5, blueCr = 70.8, blueSr = 132, whiteCr = 68.9, whiteSr = 129, redCr = 71.7, redSr = 132),
        GolfCourse(courseName = "WEST", clubId = 5, blueCr = 72.1, blueSr = 130, whiteCr = 69.5, whiteSr = 124, redCr = 73.2, redSr = 129),
        GolfCourse(courseName = "OLD COURSE", clubId = 6, blueCr = 72.3, blueSr = 126, whiteCr = 70.3, whiteSr = 125, redCr = 71.7, redSr = 127),
        GolfCourse(courseName ="EAST COURSE", clubId = 6, blueCr = 71.2, blueSr = 130, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "NEW COURSE", clubId = 6, blueCr = 72.0, blueSr = 128, whiteCr = 69.7, whiteSr = 125, redCr = 71.9, redSr = 126),
        GolfCourse(courseName ="NORTH COURSE", clubId = 6, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "SOUTH COURSE", clubId = 6, blueCr = 72.7, blueSr = 128, whiteCr = 70.5, whiteSr = 127, redCr = 70.5, redSr = 127),
        GolfCourse(courseName = "WEST COURSE", clubId = 6, blueCr = 72.3, blueSr = 127, whiteCr = 72.3, whiteSr = 127, redCr = 72.3, redSr = 127),
        GolfCourse(courseName = "ACGIR", clubId = 7, blueCr = 68.2, blueSr = 121, whiteCr = 60.7, whiteSr = 107, redCr = 55.1, redSr = 72),
        GolfCourse(courseName ="BANGI", clubId = 8, blueCr = 68.5, blueSr = 122, whiteCr = 72.0, whiteSr = 72, redCr = 65.6, redSr = 67),
        GolfCourse(courseName = "BUKIT BERUNTUNG", clubId = 9, blueCr = 72.0, blueSr = 120, whiteCr = 72.0, whiteSr = 125, redCr = 72.0, redSr = 125),
        GolfCourse(courseName = "BUKIT KEMUNING", clubId = 10, blueCr = 72.0, blueSr = 129, whiteCr = 71.0, whiteSr = 124, redCr = 73.0, redSr = 127),
        GolfCourse(courseName = "BUKIT UNGGUL", clubId = 11, blueCr = 70.8, blueSr = 125, whiteCr = 68.3, whiteSr = 119, redCr = 70.8, redSr = 125),
        GolfCourse(courseName ="PERMAS JAYA", clubId = 12, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "DANAU", clubId = 13, blueCr = 72.8, blueSr = 131, whiteCr = 68.9, whiteSr = 117, redCr = 71.3, redSr = 122),
        GolfCourse(courseName = "GARDEN", clubId = 14, blueCr = 71.5, blueSr = 125, whiteCr = 68.8, whiteSr = 122, redCr = 71.6, redSr = 117),
        GolfCourse(courseName = "VALLEY", clubId = 14, blueCr = 71.3, blueSr = 130, whiteCr = 68.0, whiteSr = 123, redCr = 71.0, redSr = 122),
        GolfCourse(courseName = "SEGAMAT", clubId = 15, blueCr = 72.2, blueSr = 129, whiteCr = 72.2, whiteSr = 129, redCr = 72.2, redSr = 129),
        GolfCourse(courseName = "IMPIAN", clubId = 16, blueCr = 71.8, blueSr = 127, whiteCr = 72.4, whiteSr = 126, redCr = 72.4, redSr = 126),
        GolfCourse(courseName = "DARUL EHSAN", clubId = 17, blueCr = 71.0, blueSr = 123, whiteCr = 69.2, whiteSr = 121, redCr = 72.8, redSr = 128),
        GolfCourse(courseName = "AGONG/TUNKU", clubId = 18, blueCr = 73.6, blueSr = 130, whiteCr = 71.4, whiteSr = 128, redCr = 76.4, redSr = 137),
        GolfCourse(courseName = "SULTAN/TUN", clubId = 18, blueCr = 74.0, blueSr = 130, whiteCr = 74.0, whiteSr = 130, redCr = 74.0, redSr = 130),
        GolfCourse(courseName ="S SELANGOR", clubId = 19, blueCr = 72.4, blueSr = 131, whiteCr = 70.4, whiteSr = 129, redCr = 72.5, redSr = 131),
        GolfCourse(courseName = "KGPUPM", clubId = 20, blueCr = 72.7, blueSr = 133, whiteCr = 75.6, whiteSr = 134, redCr = 75.6, redSr = 134),
        GolfCourse(courseName = "KGCKKB", clubId = 21, blueCr = 69.7, blueSr = 133, whiteCr = 67.9, whiteSr = 129, redCr = 71.7, redSr = 129),
        GolfCourse(courseName = "THE HILLS", clubId = 22, blueCr = 71.6, blueSr = 135, whiteCr = 69.7, whiteSr = 131, redCr = 72.2, redSr = 137),
        GolfCourse(courseName = "THE LAKES", clubId = 22, blueCr = 72.1, blueSr = 136, whiteCr = 70.5, whiteSr = 130, redCr = 72.3, redSr = 135),
        GolfCourse(courseName = "KRTU", clubId = 23, blueCr = 73.6, blueSr = 140, whiteCr = 70.0, whiteSr = 129, redCr = 74.0, redSr = 138),
        GolfCourse(courseName ="B/W", clubId = 24, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "CREEK-WATERFALL", clubId = 25, blueCr = 71.7, blueSr = 132, whiteCr = 68.9, whiteSr = 127, redCr = 71.4, redSr = 127),
        GolfCourse(courseName = "KOTA PERMAI", clubId = 26, blueCr = 71.0, blueSr = 125, whiteCr = 69.0, whiteSr = 123, redCr = 71.5, redSr = 127),
        GolfCourse(courseName = "BERINGIN", clubId = 27, blueCr = 71.0, blueSr = 131, whiteCr = 68.4, whiteSr = 125, redCr = 72.2, redSr = 123),
        GolfCourse(courseName = "MONTEREZ", clubId = 28, blueCr = 69.7, blueSr = 130, whiteCr = 67.2, whiteSr = 121, redCr = 71.0, redSr = 123),
        GolfCourse(courseName = "EUGENIA_BISMARCK", clubId = 29, blueCr = 70.2, blueSr = 128, whiteCr = 68.2, whiteSr = 123, redCr = 70.9, redSr = 127),
        GolfCourse(courseName = "PORT KLANG", clubId = 30, blueCr = 72.3, blueSr = 126, whiteCr = 70.3, whiteSr = 123, redCr = 65.6, redSr = 116),
        GolfCourse(courseName ="BUNGA RAYA", clubId = 31, blueCr = 72.0, blueSr = 133, whiteCr = 69.7, whiteSr = 130, redCr = 72.9, redSr = 129),
        GolfCourse(courseName = "PALM", clubId = 31, blueCr = 72.9, blueSr = 140, whiteCr = 70.3, whiteSr = 135, redCr = 74.2, redSr = 134),
        GolfCourse(courseName = "PRESIDENT", clubId = 32, blueCr = 72.3, blueSr = 128, whiteCr = 70.2, whiteSr = 126, redCr = 71.9, redSr = 126),
        GolfCourse(courseName = "SULTAN", clubId = 32, blueCr = 72.3, blueSr = 128, whiteCr = 70.2, whiteSr = 126, redCr = 71.9, redSr = 127),
        GolfCourse(courseName = "ALAM SHAH", clubId = 32, blueCr = 72.2, blueSr = 129, whiteCr = 69.8, whiteSr = 128, redCr = 71.8, redSr = 126),
        GolfCourse(courseName = "SUNGAILONG", clubId = 33, blueCr = 71.3, blueSr = 131, whiteCr = 69.3, whiteSr = 128, redCr = 73.3, redSr = 129),
        GolfCourse(courseName = "PUTERI & PUTERA", clubId = 34, blueCr = 70.9, blueSr = 127, whiteCr = 70.9, whiteSr = 127, redCr = 70.9, redSr = 127),
        GolfCourse(courseName = "PUTERA & TASIK", clubId = 34, blueCr = 72.3, blueSr = 129, whiteCr = 72.3, whiteSr = 129, redCr = 72.3, redSr = 129),
        GolfCourse(courseName = "PUTERI & TASIK", clubId = 34, blueCr = 72.0, blueSr = 128, whiteCr = 72.0, whiteSr = 128, redCr = 72.0, redSr = 128),
        GolfCourse(courseName = "PUTERA & PUTERI", clubId = 34, blueCr = 70.9, blueSr = 127, whiteCr = 70.9, whiteSr = 127, redCr = 70.9, redSr = 127),
        GolfCourse(courseName = "TEMPLER", clubId = 35, blueCr = 72.6, blueSr = 132, whiteCr = 69.8, whiteSr = 124, redCr = 71.8, redSr = 126),
        GolfCourse(courseName = "THE MINES", clubId = 36, blueCr = 70.6, blueSr = 126, whiteCr = 68.5, whiteSr = 124, redCr = 70.2, redSr = 122),
        GolfCourse(courseName = "ROYAL KG KUANTAN", clubId = 37, blueCr = 70.7, blueSr = 133, whiteCr = 68.8, whiteSr = 124, redCr = 71.4, redSr = 129),
        GolfCourse(courseName = "E1/E2", clubId = 38, blueCr = 72.7, blueSr = 125, whiteCr = 70.4, whiteSr = 120, redCr = 70.4, redSr = 120),
        GolfCourse(courseName = "E2/W3", clubId = 38, blueCr = 72.3, blueSr = 125, whiteCr = 70.2, whiteSr = 120, redCr = 70.2, redSr = 120),
        GolfCourse(courseName = "W3/E1", clubId = 38, blueCr = 71.9, blueSr = 118, whiteCr = 68.9, whiteSr = 114, redCr = 68.9, redSr = 114),
        GolfCourse(courseName = "E1-E2-STD", clubId = 38, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "VALENCIA", clubId = 39, blueCr = 33.7, blueSr = 133, whiteCr = 32.9, whiteSr = 130, redCr = 33.5, redSr = 124),
        GolfCourse(courseName = "LABUAN GOLF CLUB", clubId = 40, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "LIGC", clubId = 41, blueCr = 72.4, blueSr = 130, whiteCr = 70.4, whiteSr = 126, redCr = 70.7, redSr = 125),
        GolfCourse(courseName = "DAMAI", clubId = 42, blueCr = 73.2, blueSr = 124, whiteCr = 70.8, whiteSr = 119, redCr = 70.8, redSr = 119),
        GolfCourse(courseName = "MIRI-CITY", clubId = 43, blueCr = 72.2, blueSr = 126, whiteCr = 70.1, whiteSr = 126, redCr = 71.8, redSr = 119),
        GolfCourse(courseName = "ADONG & LIKU", clubId = 43, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "BINTULU", clubId = 44, blueCr = 71.5, blueSr = 134, whiteCr = 72.2, whiteSr = 122, redCr = 72.2, redSr = 122),
        GolfCourse(courseName = "MIRI", clubId = 45, blueCr = 71.9, blueSr = 128, whiteCr = 73.6, whiteSr = 130, redCr = 73.6, redSr = 130),
        GolfCourse(courseName = "SIOL/DEMAK", clubId = 46, blueCr = 72.8, blueSr = 138, whiteCr = 69.9, whiteSr = 130, redCr = 72.4, redSr = 128),
        GolfCourse(courseName = "MATANG/SANTUBONG", clubId = 46, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "SIBU", clubId = 47, blueCr = 69.9, blueSr = 127, whiteCr = 71.3, whiteSr = 125, redCr = 71.3, redSr = 125),
        GolfCourse(courseName = "SAMARAHAN", clubId = 48, blueCr = 69.9, blueSr = 124, whiteCr = 67.6, whiteSr = 119, redCr = 70.0, redSr = 122),
        GolfCourse(courseName = "BORNEO", clubId = 49, blueCr = 71.0, blueSr = 124, whiteCr = 69.0, whiteSr = 114, redCr = 73.0, redSr = 114),
        GolfCourse(courseName = "DALIT BAY", clubId = 50, blueCr = 71.7, blueSr = 132, whiteCr = 69.2, whiteSr = 124, redCr = 72.3, redSr = 129),
        GolfCourse(courseName = "KENINGAU", clubId = 51, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "KUDATGC", clubId = 52, blueCr = 70.2, blueSr = 130, whiteCr = 68.2, whiteSr = 125, redCr = 70.8, redSr = 129),
        GolfCourse(courseName = "LAHAD DATU", clubId = 53, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "MOUNT KINABALU", clubId = 54, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "NEXUS", clubId = 55, blueCr = 66.6, blueSr = 114, whiteCr = 65.8, whiteSr = 117, redCr = 70.4, redSr = 116),
        GolfCourse(courseName = "RANAU", clubId = 56, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "SABAH", clubId = 57, blueCr = 71.6, blueSr = 131, whiteCr = 70.7, whiteSr = 126, redCr = 71.6, redSr = 128),
        GolfCourse(courseName = "SABAH GOLF&CC", clubId = 57, blueCr = 71.6, blueSr = 131, whiteCr = 70.7, whiteSr = 126, redCr = 71.6, redSr = 128),
        GolfCourse(courseName = "SANDAKAN GOLF", clubId = 58, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "SHAN-SHUI", clubId = 59, blueCr = 73.6, blueSr = 137, whiteCr = 71.4, whiteSr = 135, redCr = 74.1, redSr = 137),
        GolfCourse(courseName = "SIGALONG", clubId = 60, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "HERITAGE GARDEN", clubId = 61, blueCr = 70.7, blueSr = 125, whiteCr = 68.6, whiteSr = 121, redCr = 70.8, redSr = 119),
        GolfCourse(courseName = "GARDEN LAKES", clubId = 61, blueCr = 70.2, blueSr = 127, whiteCr = 68.1, whiteSr = 122, redCr = 70.6, redSr = 120),
        GolfCourse(courseName = "LAKES HERITAGE", clubId = 61, blueCr = 71.1, blueSr = 125, whiteCr = 68.9, whiteSr = 121, redCr = 67.0, redSr = 127),
        GolfCourse(courseName = "TAMBUNAN", clubId = 62, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "TAWAU", clubId = 63, blueCr = 70.7, blueSr = 136, whiteCr = 70.7, whiteSr = 136, redCr = 72.8, redSr = 138),
        GolfCourse(courseName = "KINABALU", clubId = 64, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "GREEN ACRES", clubId = 65, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "DESA DUNGUN", clubId = 66, blueCr = 72.0, blueSr = 113, whiteCr = 70.1, whiteSr = 124, redCr = 70.1, redSr = 124),
        GolfCourse(courseName = "RTGC", clubId = 67, blueCr = 72.9, blueSr = 129, whiteCr = 72.9, whiteSr = 129, redCr = 72.9, redSr = 129),
        GolfCourse(courseName = "KGRP", clubId = 68, blueCr = 71.2, blueSr = 134, whiteCr = 70.1, whiteSr = 132, redCr = 70.1, redSr = 132),
        GolfCourse(courseName = "KTGR", clubId = 69, blueCr = 69.3, blueSr = 117, whiteCr = 69.3, whiteSr = 117, redCr = 69.3, redSr = 117),
        GolfCourse(courseName = "KIJAL/PALMA", clubId = 70, blueCr = 72.7, blueSr = 129, whiteCr = 68.5, whiteSr = 121, redCr = 63.2, redSr = 112),
        GolfCourse(courseName = "PUTRA", clubId = 71, blueCr = 77.3, blueSr = 137, whiteCr = 69.4, whiteSr = 123, redCr = 69.4, redSr = 123),
        GolfCourse(courseName = "CLEARWATER", clubId = 72, blueCr = 74.0, blueSr = 135, whiteCr = 71.6, whiteSr = 129, redCr = 74.7, redSr = 132),
        GolfCourse(courseName = "DAMAI LAUT", clubId = 73, blueCr = 72.0, blueSr = 128, whiteCr = 69.0, whiteSr = 122, redCr = 72.0, redSr = 127),
        GolfCourse(courseName = "BRIGET UTARA", clubId = 74, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "KINTA", clubId = 75, blueCr = 68.7, blueSr = 125, whiteCr = 67.0, whiteSr = 122, redCr = 67.9, redSr = 121),
        GolfCourse(courseName = "KUALA KANGSAR", clubId = 76, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "SEBANA", clubId = 77, blueCr = 74.3, blueSr = 135, whiteCr = 72.1, whiteSr = 131, redCr = 72.1, redSr = 131),
        GolfCourse(courseName = "VALLEY/RIVER", clubId = 78, blueCr = 70.0, blueSr = 128, whiteCr = 70.0, whiteSr = 128, redCr = 70.0, redSr = 128),
        GolfCourse(courseName = "VALLEY/WATER", clubId = 78, blueCr = 71.5, blueSr = 130, whiteCr = 71.5, whiteSr = 130, redCr = 71.5, redSr = 130),
        GolfCourse(courseName = "WATER/RIVER", clubId = 78, blueCr = 73.2, blueSr = 127, whiteCr = 73.2, whiteSr = 127, redCr = 73.2, redSr = 127),
        GolfCourse(courseName = "ROYAL PERAK", clubId = 79, blueCr = 73.6, blueSr = 136, whiteCr = 72.4, whiteSr = 133, redCr = 75.3, redSr = 132),
        GolfCourse(courseName = "PONDEROSA", clubId = 80, blueCr = 71.2, blueSr = 127, whiteCr = 68.2, whiteSr = 123, redCr = 71.0, redSr = 127),
        GolfCourse(courseName = "TELUK INTAN GCC", clubId = 81, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "AWANA", clubId = 82, blueCr = 70.5, blueSr = 137, whiteCr = 68.0, whiteSr = 129, redCr = 70.3, redSr = 130),
        GolfCourse(courseName = "BKTTINGGI", clubId = 83, blueCr = 70.6, blueSr = 133, whiteCr = 68.4, whiteSr = 129, redCr = 70.5, redSr = 125),
        GolfCourse(courseName = "BENTONG", clubId = 84, blueCr = 71.7, blueSr = 123, whiteCr = 72.0, whiteSr = 117, redCr = 72.0, redSr = 117),
        GolfCourse(courseName = "ROYAL PEKAN", clubId = 85, blueCr = 71.6, blueSr = 130, whiteCr = 71.6, whiteSr = 130, redCr = 71.6, redSr = 130),
        GolfCourse(courseName = "CAMERON", clubId = 86, blueCr = 69.0, blueSr = 131, whiteCr = 69.0, whiteSr = 131, redCr = 69.0, redSr = 131),
        GolfCourse(courseName = "KRIK", clubId = 87, blueCr = 70.7, blueSr = 133, whiteCr = 68.8, whiteSr = 124, redCr = 71.4, redSr = 129),
        GolfCourse(courseName = "S MAHKOTA", clubId = 88, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "KTUKUANTAN", clubId = 89, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "MAHKOTA GCC", clubId = 90, blueCr = 72.9, blueSr = 136, whiteCr = 40.6, whiteSr = 131, redCr = 73.9, redSr = 133),
        GolfCourse(courseName = "MARAN HILLS", clubId = 91, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "RPGC", clubId = 92, blueCr = 72.6, blueSr = 132, whiteCr = 70.5, whiteSr = 128, redCr = 72.7, redSr = 125),
        GolfCourse(courseName = "LAKE", clubId = 93, blueCr = 72.9, blueSr = 132, whiteCr = 70.8, whiteSr = 124, redCr = 72.6, redSr = 130),
        GolfCourse(courseName = "HILL", clubId = 93, blueCr = 73.3, blueSr = 137, whiteCr = 70.1, whiteSr = 134, redCr = 72.6, redSr = 130),
        GolfCourse(courseName = "KGTU", clubId = 94, blueCr = 71.0, blueSr = 113, whiteCr = 71.0, whiteSr = 113, redCr = 71.0, redSr = 113),
        GolfCourse(courseName = "PENANG GOLF CLUB", clubId = 95, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "PENANG GOLF RESORT", clubId = 96, blueCr = 70.8, blueSr = 122, whiteCr = 69.4, whiteSr = 72, redCr = 70.8, redSr = 122),
        GolfCourse(courseName = "PENANG TURF", clubId = 97, blueCr = 66.0, blueSr = 119, whiteCr = 66.0, whiteSr = 119, redCr = 66.0, redSr = 119),
        GolfCourse(courseName = "ORCHARD", clubId = 98, blueCr = 73.0, blueSr = 132, whiteCr = 71.8, whiteSr = 127, redCr = 65.8, redSr = 116),
        GolfCourse(courseName = "ISLAND/PINES", clubId = 99, blueCr = 70.9, blueSr = 123, whiteCr = 68.6, whiteSr = 72, redCr = 70.6, redSr = 122),
        GolfCourse(courseName = "PINES/MANGGO", clubId = 99, blueCr = 71.0, blueSr = 128, whiteCr = 68.5, whiteSr = 123, redCr = 71.2, redSr = 126),
        GolfCourse(courseName = "MANGGO/ISLAND", clubId = 99, blueCr = 68.5, blueSr = 122, whiteCr = 68.5, whiteSr = 122, redCr = 71.5, redSr = 123),
        GolfCourse(courseName = "RUSA", clubId = 100, blueCr = 71.3, blueSr = 124, whiteCr = 72.2, whiteSr = 125, redCr = 68.5, redSr = 118),
        GolfCourse(courseName = "SRI MENANTI", clubId = 101, blueCr = 70.8, blueSr = 133, whiteCr = 69.9, whiteSr = 131, redCr = 70.5, redSr = 124),
        GolfCourse(courseName = "SEREMBAN", clubId = 102, blueCr = 76.2, blueSr = 135, whiteCr = 67.9, whiteSr = 120, redCr = 67.9, redSr = 120),
        GolfCourse(courseName = "SOUTH/NORTH", clubId = 103, blueCr = 72.8, blueSr = 131, whiteCr = 70.7, whiteSr = 128, redCr = 73.3, redSr = 130),
        GolfCourse(courseName = "WEST/SOUTH", clubId = 103, blueCr = 72.3, blueSr = 130, whiteCr = 69.9, whiteSr = 125, redCr = 72.7, redSr = 130),
        GolfCourse(courseName = "NORTH/WEST", clubId = 103, blueCr = 72.9, blueSr = 129, whiteCr = 70.8, whiteSr = 126, redCr = 73.4, redSr = 129),
        GolfCourse(courseName = "CINTA SAYANG", clubId = 104, blueCr = 72.3, blueSr = 130, whiteCr = 70.7, whiteSr = 128, redCr = 72.5, redSr = 126),
        GolfCourse(courseName = "DARULAMAN", clubId = 105, blueCr = 72.7, blueSr = 126, whiteCr = 70.6, whiteSr = 124, redCr = 72.7, redSr = 120),
        GolfCourse(courseName = "GUNUNG RAYA", clubId = 106, blueCr = 70.2, blueSr = 123, whiteCr = 68.0, whiteSr = 115, redCr = 70.3, redSr = 121),
        GolfCourse(courseName = "HARVARD", clubId = 107, blueCr = 73.1, blueSr = 136, whiteCr = 70.2, whiteSr = 130, redCr = 72.7, redSr = 131),
        GolfCourse(courseName = "GH", clubId = 107, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "JG", clubId = 107, blueCr = 72.7, blueSr = 138, whiteCr = 69.1, whiteSr = 124, redCr = 71.8, redSr = 126),
        GolfCourse(courseName = "JH", clubId = 107, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "ROYAL KEDAH", clubId = 108, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "KELAB GOLF UUM", clubId = 109, blueCr = 72.3, blueSr = 123, whiteCr = 70.3, whiteSr = 119, redCr = 70.3, redSr = 119),
        GolfCourse(courseName = "SG PETANI", clubId = 110, blueCr = 72.3, blueSr = 130, whiteCr = 70.7, whiteSr = 128, redCr = 72.5, redSr = 126),
        GolfCourse(courseName = "KULIM", clubId = 111, blueCr = 72.0, blueSr = 130, whiteCr = 72.0, whiteSr = 125, redCr = 72.0, redSr = 122),
        GolfCourse(courseName = "RIDGE/LAKES", clubId = 112, blueCr = 72.5, blueSr = 135, whiteCr = 69.8, whiteSr = 128, redCr = 70.3, redSr = 116),
        GolfCourse(courseName = "COAST/RIDGE", clubId = 112, blueCr = 72.7, blueSr = 135, whiteCr = 70.0, whiteSr = 129, redCr = 70.4, redSr = 119),
        GolfCourse(courseName = "LAKES/COAST", clubId = 112, blueCr = 72.4, blueSr = 133, whiteCr = 69.6, whiteSr = 126, redCr = 70.1, redSr = 115),
        GolfCourse(courseName = "THE ELS CLUB TELUK DALAI", clubId = 112, blueCr = 69.6, blueSr = 118, whiteCr = 68.3, whiteSr = 115, redCr = 69.9, redSr = 113),
        GolfCourse(courseName = "PERMAIPURA", clubId = 113, blueCr = 69.6, blueSr = 129, whiteCr = 68.0, whiteSr = 124, redCr = 70.6, redSr = 125),
        GolfCourse(courseName = "GUA MUSANG", clubId = 114, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "KUKUP", clubId = 115, blueCr = 71.0, blueSr = 126, whiteCr = 69.0, whiteSr = 122, redCr = 72.0, redSr = 127),
        GolfCourse(courseName = "KELANTAN", clubId = 116, blueCr = 72.1, blueSr = 131, whiteCr = 71.3, whiteSr = 123, redCr = 72.9, redSr = 122),
        GolfCourse(courseName = "GOVENOR/TUNKU", clubId = 117, blueCr = 73.1, blueSr = 134, whiteCr = 73.1, whiteSr = 134, redCr = 73.1, redSr = 134),
        GolfCourse(courseName = "TUNKU/GHAFAR", clubId = 117, blueCr = 72.9, blueSr = 132, whiteCr = 72.9, whiteSr = 132, redCr = 72.9, redSr = 132),
        GolfCourse(courseName = "GHAFAR/GOVENOR", clubId = 117, blueCr = 73.1, blueSr = 134, whiteCr = 73.1, whiteSr = 134, redCr = 73.1, redSr = 134),
        GolfCourse(courseName = "ROCKIE/PALM", clubId = 118, blueCr = 73.3, blueSr = 125, whiteCr = 73.3, whiteSr = 125, redCr = 73.3, redSr = 125),
        GolfCourse(courseName = "CROCODILE/ROCKIES", clubId = 118, blueCr = 73.0, blueSr = 130, whiteCr = 73.0, whiteSr = 130, redCr = 73.0, redSr = 130),
        GolfCourse(courseName = "PALM/CROCODILE", clubId = 118, blueCr = 73.3, blueSr = 133, whiteCr = 73.3, whiteSr = 133, redCr = 73.3, redSr = 133),
        GolfCourse(courseName = "EAST/NORTH", clubId = 119, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "EAST/WEST", clubId = 119, blueCr = 72.7, blueSr = 127, whiteCr = 69.4, whiteSr = 123, redCr = 71.5, redSr = 128),
        GolfCourse(courseName = "WEST/NORTH", clubId = 119, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "NORTH/WEST", clubId = 119, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "M-W", clubId = 120, blueCr = 74.4, blueSr = 142, whiteCr = 72.1, whiteSr = 137, redCr = 70.9, redSr = 128),
        GolfCourse(courseName = "L-M", clubId = 120, blueCr = 71.3, blueSr = 134, whiteCr = 68.7, whiteSr = 127, redCr = 69.7, redSr = 124),
        GolfCourse(courseName = "W-L", clubId = 120, blueCr = 72.4, blueSr = 130, whiteCr = 70.0, whiteSr = 125, redCr = 68.3, redSr = 118),
        GolfCourse(courseName = "HILL COURSE", clubId = 121, blueCr = 71.4, blueSr = 131, whiteCr = 72.0, whiteSr = 125, redCr = 69.5, redSr = 124),
        GolfCourse(courseName = "AUSTIN COURSE", clubId = 121, blueCr = 70.9, blueSr = 133, whiteCr = 69.7, whiteSr = 130, redCr = 75.1, redSr = 136),
        GolfCourse(courseName = "BLUE", clubId = 121, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "AUSTIN HEIGHTS", clubId = 121, blueCr = 70.9, blueSr = 133, whiteCr = 69.7, whiteSr = 130, redCr = 75.1, redSr = 136),
        GolfCourse(courseName = "BANANG", clubId = 122, blueCr = 72.8, blueSr = 132, whiteCr = 70.3, whiteSr = 127, redCr = 74.8, redSr = 134),
        GolfCourse(courseName = "DAIMAN 18", clubId = 123, blueCr = 71.2, blueSr = 132, whiteCr = 68.2, whiteSr = 126, redCr = 71.3, redSr = 128),
        GolfCourse(courseName = "HORIZON", clubId = 124, blueCr = 71.9, blueSr = 132, whiteCr = 69.2, whiteSr = 128, redCr = 73.4, redSr = 126),
        GolfCourse(courseName = "JOHOR GOLF", clubId = 125, blueCr = 72.2, blueSr = 127, whiteCr = 69.0, whiteSr = 125, redCr = 75.5, redSr = 137),
        GolfCourse(courseName = "BATU PAHAT", clubId = 126, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "EMAS", clubId = 127, blueCr = 70.0, blueSr = 120, whiteCr = 70.0, whiteSr = 120, redCr = 70.0, redSr = 120),
        GolfCourse(courseName = "KLUANG", clubId = 128, blueCr = null, blueSr = null, whiteCr = null, whiteSr = null, redCr = null, redSr = null),
        GolfCourse(courseName = "ALAMANDA", clubId = 129, blueCr = 71.2, blueSr = 134, whiteCr = 68.8, whiteSr = 130, redCr = 72.2, redSr = 136),
        GolfCourse(courseName = "CEMPAKA", clubId = 129, blueCr = 72.6, blueSr = 135, whiteCr = 70.4, whiteSr = 132, redCr = 73.2, redSr = 132),
        GolfCourse(courseName = "MELATI", clubId = 129, blueCr = 72.4, blueSr = 129, whiteCr = 69.7, whiteSr = 123, redCr = 69.8, redSr = 113),
        GolfCourse(courseName = "PALM/PUTRA", clubId = 130, blueCr = 72.1, blueSr = 130, whiteCr = 69.4, whiteSr = 124, redCr = 68.0, redSr = 120),
        GolfCourse(courseName = "PALM/IOI", clubId = 130, blueCr = 72.9, blueSr = 130, whiteCr = 70.3, whiteSr = 126, redCr = 69.4, redSr = 120),
        GolfCourse(courseName = "IOI/PUTRA", clubId = 130, blueCr = 69.4, blueSr = 120, whiteCr = 72.9, whiteSr = 130, redCr = 69.4, redSr = 120),
        GolfCourse(courseName = "IOI/PALM", clubId = 130, blueCr = 74.0, blueSr = 131, whiteCr = 71.4, whiteSr = 127, redCr = 71.4, redSr = 124),
        GolfCourse(courseName = "BINTANG COURSE", clubId = 131, blueCr = 73.8, blueSr = 139, whiteCr = 70.8, whiteSr = 133, redCr = 72.8, redSr = 131),
        GolfCourse(courseName = "BUKIT COURSE", clubId = 131, blueCr = 73.5, blueSr = 139, whiteCr = 70.6, whiteSr = 133, redCr = 71.8, redSr = 123),
        GolfCourse(courseName = "PLANTATION COURSE", clubId = 132, blueCr = 73.5, blueSr = 124, whiteCr = 70.7, whiteSr = 119, redCr = 71.9, redSr = 123),
        GolfCourse(courseName = "STRAITS COURSE", clubId = 132, blueCr = 71.2, blueSr = 120, whiteCr = 70.8, whiteSr = 119, redCr = 71.6, redSr = 124),
        GolfCourse(courseName = "VILLAGE COURSE", clubId = 132, blueCr = 73.3, blueSr = 127, whiteCr = 71.3, whiteSr = 123, redCr = 72.4, redSr = 129),
        GolfCourse(courseName = "HILL/PALM", clubId = 133, blueCr = 72.4, blueSr = 137, whiteCr = 69.5, whiteSr = 126, redCr = 72.8, redSr = 128),
        GolfCourse(courseName = "HILL/WATER", clubId = 133, blueCr = 73.4, blueSr = 139, whiteCr = 71.4, whiteSr = 130, redCr = 75.7, redSr = 141),
        GolfCourse(courseName = "PALM/WATER", clubId = 133, blueCr = 72.8, blueSr = 137, whiteCr = 70.3, whiteSr = 127, redCr = 73.7, redSr = 135)
    )
}