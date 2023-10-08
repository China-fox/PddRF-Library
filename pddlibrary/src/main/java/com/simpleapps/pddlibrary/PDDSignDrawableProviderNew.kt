package com.simpleapps.pddlibrary

class PDDSignDrawableProviderNew {

    fun getDrawable(sign: String): SignDrawable {
        return when (sign) {
            SIGN_3_28, SIGN_003 -> SignDrawable(R.drawable.a3_28, 1f, 1f)
            SIGN_004 -> SignDrawable(R.drawable.a514, 1f, 1f)
            SIGN_005 -> SignDrawable(R.drawable.a441, 1f, 1f)
            SIGN_006 -> SignDrawable(R.drawable.a452, 1f, 1f)
            SIGN_007 -> SignDrawable(R.drawable.a454, 1f, 1f)
            Line_1_13, SIGN_008 -> SignDrawable(R.drawable.h1_13, 4f, 1f)
            SIGN_2_4, SIGN_009 -> SignDrawable(R.drawable.a2_4, 1f, 1f)
            Line_1_18,   SIGN_010 -> SignDrawable(R.drawable.h1_18, 4f, 1f)
            SIGN_4_6, SIGN_011 -> SignDrawable(R.drawable.a4_6, 1f, 1f)
            SIGN_4_7 -> SignDrawable(R.drawable.a4_7, 1f, 1f)
            SIGN_8_14, SIGN_012 -> SignDrawable(R.drawable.a8_14, 2f, 1f)
            SIGN_2_3_1, SIGN_013 -> SignDrawable(R.drawable.a2_3_1, 1f, 1f)
            SIGN_2_1, SIGN_014 -> SignDrawable(R.drawable.a2_1, 1f, 1f)
            SIGN_8_13, SIGN_015 -> SignDrawable(R.drawable.a8_13, 1f, 1f)
            SIGN_5_21, SIGN_016 -> SignDrawable(R.drawable.a5_21, 1f, 1.5f)
            SIGN_2_7, SIGN_017 -> SignDrawable(R.drawable.a2_7, 1f, 1f)
            SIGN_3_29, SIGN_018 -> SignDrawable(R.drawable.a3_29, 1f, 1f)
            SIGN_5_33, SIGN_019 -> SignDrawable(R.drawable.a5_33, 1f, 1.5f)
            Line_1_9, SIGN_020 -> SignDrawable(R.drawable.h1_9, 4f, 1f)
            Line_1_8 -> SignDrawable(R.drawable.h1_8, 4f, 1f)
            SIGN_5_15_1, SIGN_021 -> SignDrawable(R.drawable.a5_15_1, 2f, 1f)
            SIGN_5_1, SIGN_022 -> SignDrawable(R.drawable.a5_1, 1f, 1.8f)
            SIGN_5_2 -> SignDrawable(R.drawable.a5_2, 1f, 1.8f)
            SIGN_2_5, SIGN_023 -> SignDrawable(R.drawable.a2_5, 1f, 1f)
            Line_1_12,   SIGN_024 -> SignDrawable(R.drawable.h1_12, 4f, 1f)
            SIGN_8_16, SIGN_025 -> SignDrawable(R.drawable.a8_16, 2f, 1f)
            SIGN_8_15 -> SignDrawable(R.drawable.a8_15, 2f, 1f)
            SIGN_3_24, SIGN_026 -> SignDrawable(R.drawable.a3_24, 1f, 1f)
            SIGN_5_5, SIGN_027 -> SignDrawable(R.drawable.a5_5, 1f, 1f)
            SIGN_6_14_2, SIGN_028 -> SignDrawable(R.drawable.a6_14_2, 2.5f, 1f)
            SIGN_6_15_1, SIGN_029 -> SignDrawable(R.drawable.a6_15_1, 3f, 1f)
            SIGN_030 -> SignDrawable(R.drawable.h1_17, 4f, 1f)
            Line_1_11, SIGN_031 -> SignDrawable(R.drawable.h1_11, 4f, 1f)
            SIGN_6_4, SIGN_032 -> SignDrawable(R.drawable.a6_4, 1f, 1f)
            SIGN_6_4_1 -> SignDrawable(R.drawable.a6_4_1, 1f, 1f)
            SIGN_6_4_2 -> SignDrawable(R.drawable.a6_4_2, 1f, 1f)
            SIGN_7_11, SIGN_033 -> SignDrawable(R.drawable.a7_11, 1f, 1.8f)
            SIGN_7_1 -> SignDrawable(R.drawable.a7_1, 1f, 1.8f)
            SIGN_7_2 -> SignDrawable(R.drawable.a7_2, 1f, 1.8f)
            SIGN_7_3 -> SignDrawable(R.drawable.a7_3, 1f, 1.8f)
            SIGN_7_4 -> SignDrawable(R.drawable.a7_4, 1f, 1.8f)
            SIGN_7_5 -> SignDrawable(R.drawable.a7_5, 1f, 1.8f)
            SIGN_7_6 -> SignDrawable(R.drawable.a7_6, 1f, 1.8f)
            SIGN_7_7 -> SignDrawable(R.drawable.a7_7, 1f, 1.8f)
            SIGN_7_8 -> SignDrawable(R.drawable.a7_8, 1f, 1.8f)
            SIGN_7_9 -> SignDrawable(R.drawable.a7_9, 1f, 1.8f)
            SIGN_7_13 -> SignDrawable(R.drawable.a7_13, 1f, 1.8f)
            SIGN_7_15 -> SignDrawable(R.drawable.a7_15, 1f, 1.8f)
            SIGN_7_16 -> SignDrawable(R.drawable.a7_16, 1f, 1.8f)
            SIGN_7_17 -> SignDrawable(R.drawable.a7_17, 1f, 1.8f)
            SIGN_7_18 -> SignDrawable(R.drawable.a7_18, 1f, 1.8f)
            SIGN_7_19 -> SignDrawable(R.drawable.a7_19, 1f, 1.8f)
            SIGN_7_20 -> SignDrawable(R.drawable.a7_20, 1f, 1.8f)
            SIGN_7_21 -> SignDrawable(R.drawable.a7_21, 1f, 1.8f)
            SIGN_6_1 -> SignDrawable(R.drawable.a6_1, 1f, 1.8f)
            SIGN_4_1_2, SIGN_034 -> SignDrawable(R.drawable.a4_1_2, 1f, 1f)
            SIGN_8_11, SIGN_035 -> SignDrawable(R.drawable.a8_11, 2f, 1f)
            SIGN_8_10 -> SignDrawable(R.drawable.a8_10, 2f, 1f)
            SIGN_3_4, SIGN_036, SIGN_231 -> SignDrawable(R.drawable.a3_4, 1f, 1f)
            SIGN_1_12_2, SIGN_037 -> SignDrawable(R.drawable.a1_12_2, 1f, 1f)
            SIGN_8_2_1, SIGN_038 -> SignDrawable(R.drawable.a8_2_1, 2f, 1f)
            SIGN_5_15_3, SIGN_039 -> SignDrawable(R.drawable.a5_15_3, 3f, 1f)
            Line_1_21,  SIGN_040 -> SignDrawable(R.drawable.h1_21, 4f, 1f)
            SIGN_5_15_5, SIGN_041 -> SignDrawable(R.drawable.a5_15_5, 1f, 1f)
            Line_1_3, SIGN_042 -> SignDrawable(R.drawable.h1_3, 4f, 1f)
            SIGN_1_13, SIGN_043 -> SignDrawable(R.drawable.a1_13, 1f, 1f)
            SIGN_1_14, SIGN_044 -> SignDrawable(R.drawable.a1_14, 1f, 1f)
            SIGN_2_6, SIGN_045 -> SignDrawable(R.drawable.a2_6, 1f, 1f)
            SIGN_3_27, SIGN_046 -> SignDrawable(R.drawable.a3_27, 1f, 1f)
            SIGN_5_24_2, SIGN_047 -> SignDrawable(R.drawable.a5_24_2, 4f, 1f)
            SIGN_8_6_4, SIGN_048 -> SignDrawable(R.drawable.a8_6_4, 2f, 1f)
            Line_2_5, SIGN_049 -> SignDrawable(R.drawable.v2_5, 2f, 1f)
            SIGN_6_16, SIGN_050 -> SignDrawable(R.drawable.a6_16, 3f, 1f)
            SIGN_4_1_4, SIGN_051 -> SignDrawable(R.drawable.a4_1_4, 1f, 1f)
            SIGN_8_4_1, SIGN_052 -> SignDrawable(R.drawable.a8_4_1, 2f, 1f)
            SIGN_3_25, SIGN_053 -> SignDrawable(R.drawable.a3_25, 1f, 1f)
            SIGN_8_6_5, SIGN_054 -> SignDrawable(R.drawable.a8_6_5, 2f, 1f)
            SIGN_3_18_2, SIGN_055 -> SignDrawable(R.drawable.a3_18_2, 1f, 1f)
            SIGN_3_2, SIGN_056 -> SignDrawable(R.drawable.a3_2, 1f, 1f)
            SIGN_3_3, SIGN_057 -> SignDrawable(R.drawable.a3_3, 1f, 1f)
            SIGN_3_1, SIGN_058 -> SignDrawable(R.drawable.a3_1, 1f, 1f)
            SIGN_8_21_2, SIGN_059 -> SignDrawable(R.drawable.a8_21_2, 2f, 1f)
            SIGN_8_21_1 -> SignDrawable(R.drawable.a8_21_1, 2f, 1f)
            SIGN_8_21_3 -> SignDrawable(R.drawable.a8_21_3, 2f, 1f)
            SIGN_8_24 -> SignDrawable(R.drawable.a8_24, 2f, 1f)
            SIGN_8_25 -> SignDrawable(R.drawable.a8_25, 2f, 1f)
            SIGN_8_26 -> SignDrawable(R.drawable.a8_26, 2f, 1f)
            Line_1_20, SIGN_060 -> SignDrawable(R.drawable.h1_20, 4f, 1f)
            SIGN_061 -> SignDrawable(R.drawable.op_3, 1f, 1f)
            SIGN_7_14_2, SIGN_062 -> SignDrawable(R.drawable.a7_14, 1f, 1.8f)
            SIGN_8_1_2, SIGN_063 -> SignDrawable(R.drawable.a8_1_2, 1f, 1f)
            Line_1_4, SIGN_064 -> SignDrawable(R.drawable.h1_4, 4f, 1f)
            SIGN_5_31, SIGN_065 -> SignDrawable(R.drawable.a5_31, 1f, 1.5f)
            SIGN_5_30 -> SignDrawable(R.drawable.a5_30, 1f, 1.5f)
            SIGN_5_27, SIGN_066 -> SignDrawable(R.drawable.a5_27, 1f, 1.5f)
            SIGN_5_32, SIGN_067 -> SignDrawable(R.drawable.a5_32, 1f, 1.5f)
            SIGN_5_28, SIGN_068 -> SignDrawable(R.drawable.a5_28, 1f, 1.5f)
            Line_1_7, SIGN_069 -> SignDrawable(R.drawable.h1_7, 4f, 1f)
            SIGN_070 -> SignDrawable(R.drawable.dop8_8, 1f, 1f)
            SIGN_5_13_1, SIGN_071 -> SignDrawable(R.drawable.a5_13_1, 1f, 1f)
            SIGN_3_19, SIGN_072 -> SignDrawable(R.drawable.a3_19, 1f, 1f)
            SIGN_6_3_1, SIGN_073 -> SignDrawable(R.drawable.a6_3_1, 1f, 1f)
            SIGN_6_8_2, SIGN_074 -> SignDrawable(R.drawable.a6_8_2, 1f, 1f)
            SIGN_6_8_1 -> SignDrawable(R.drawable.a6_8_1, 1f, 1f)
            Line_1_5, SIGN_075 -> SignDrawable(R.drawable.h1_5, 4f, 1f)
            SIGN_4_1_1, SIGN_076 -> SignDrawable(R.drawable.a4_1_1, 1f, 1f)
            SIGN_1_22, SIGN_077 -> SignDrawable(R.drawable.a1_22, 1f, 1f)
            SIGN_5_19_1, SIGN_078 -> SignDrawable(R.drawable.a5_19_1, 1f, 1f)
            SIGN_5_19_2, SIGN_079 -> SignDrawable(R.drawable.a5_19_2, 1f, 1f)
            SIGN_8_1_1, SIGN_080 -> SignDrawable(R.drawable.a8_1_1, 2f, 1f)
            SIGN_8_1_3 -> SignDrawable(R.drawable.a8_1_3, 2f, 1f)
            SIGN_8_1_4 -> SignDrawable(R.drawable.a8_1_4, 2f, 1f)
            SIGN_4_3, SIGN_081 -> SignDrawable(R.drawable.a4_3, 1f, 1f)
            SIGN_3_18_1, SIGN_082 -> SignDrawable(R.drawable.a3_18_1, 1f, 1f)
            SIGN_4_8_2, SIGN_083 -> SignDrawable(R.drawable.a4_8_2, 1f, 1.8f)
            SIGN_4_8_1 -> SignDrawable(R.drawable.a4_8_1, 1f, 1.8f)
            SIGN_4_8_3 -> SignDrawable(R.drawable.a4_8_3, 1f, 1.8f)
            SIGN_5_10, SIGN_084 -> SignDrawable(R.drawable.a5_10, 1f, 1f)
            SIGN_1_18, SIGN_085 -> SignDrawable(R.drawable.a1_18, 1f, 1f)
            SIGN_1_15, SIGN_086 -> SignDrawable(R.drawable.a1_15, 1f, 1f)
            SIGN_8_2_2, SIGN_087 -> SignDrawable(R.drawable.a8_2_2, 1f, 2.2f)
            SIGN_6_15_2, SIGN_088 -> SignDrawable(R.drawable.a6_15_2, 3f, 1f)
            SIGN_6_15_3 -> SignDrawable(R.drawable.a6_15_3, 3f, 1f)
            Line_2_1_1,    SIGN_089 -> SignDrawable(R.drawable.v2_1_1, 2f, 1f)
            Line_2_1_3 , SIGN_090 -> SignDrawable(R.drawable.v2_1_3, 2f, 1f)
            Line_2_1_2 -> SignDrawable(R.drawable.v2_1_2, 2f, 1f)
            SIGN_5_6, SIGN_091 -> SignDrawable(R.drawable.a5_6, 1f, 1f)
            SIGN_1_21, SIGN_092 -> SignDrawable(R.drawable.a1_21, 1f, 1f)
            SIGN_1_2, SIGN_093 -> SignDrawable(R.drawable.a1_2, 1f, 1f)
            SIGN_1_4_1, SIGN_094 -> SignDrawable(R.drawable.a1_4_1, 1f, 1.8f)
            SIGN_6_20_1, SIGN_095 -> SignDrawable(R.drawable.a6_20_1, 1f, 1f)
            SIGN_6_20_2 -> SignDrawable(R.drawable.a6_20_2, 1f, 1f)
            Line_1_19,    SIGN_096 -> SignDrawable(R.drawable.h1_19, 4f, 1f)
            SIGN_5_15_6, SIGN_097 -> SignDrawable(R.drawable.a5_15_6, 1f, 1f)
            Line_1_14_1, SIGN_098 -> SignDrawable(R.drawable.h1_14_1, 1f, 1.8f)
            Line_1_14_3 -> SignDrawable(R.drawable.h1_14_3, 1f, 1f)
            SIGN_5_13_2, SIGN_099 -> SignDrawable(R.drawable.a5_13_2, 1f, 1f)
            SIGN_5_13_3 -> SignDrawable(R.drawable.a5_13_3, 1f, 1f)
            SIGN_5_13_4 -> SignDrawable(R.drawable.a5_13_4, 1f, 1f)
            SIGN_8_5_1, SIGN_100 -> SignDrawable(R.drawable.a8_5_1, 2f, 1f)
            SIGN_101 -> SignDrawable(R.drawable.dop8_7, 2f, 1f)
            SIGN_1_6, SIGN_102 -> SignDrawable(R.drawable.a1_6, 1f, 1f)
            SIGN_5_25, SIGN_103 -> SignDrawable(R.drawable.a5_25, 4f, 1f, )
            Line_1_23_1, SIGN_104 -> SignDrawable(R.drawable.h1_23_1, 4f, 1f)
            SIGN_5_3, SIGN_105 -> SignDrawable(R.drawable.a5_3, 1f, 1.8f)
            SIGN_5_4 -> SignDrawable(R.drawable.a5_4, 1f, 1.8f)
            SIGN_6_2, SIGN_106 -> SignDrawable(R.drawable.a6_2, 1f, 1f)
            SIGN_3_5, SIGN_107 -> SignDrawable(R.drawable.a3_5, 1f, 1f)
            SIGN_3_9, SIGN_108 -> SignDrawable(R.drawable.a3_9, 1f, 1f)
            SIGN_8_4_3_2, SIGN_8_4_3 -> SignDrawable(R.drawable.a8_4_3, 2f, 1f)
            SIGN_8_4_3_1 -> SignDrawable(R.drawable.a8_4_3_1, 2f, 1f)
            SIGN_110 -> SignDrawable(R.drawable.a8_6_2, 2f, 1f)
            SIGN_8_6_9, SIGN_111 -> SignDrawable(R.drawable.a8_6_9, 2f, 1f)
            SIGN_112 -> SignDrawable(R.drawable.a525, 4f, 1f)
            SIGN_1_25, SIGN_113 -> SignDrawable(R.drawable.a1_25, 1f, 1f)
            SIGN_8_12, SIGN_114 -> SignDrawable(R.drawable.a8_12, 2f, 1f)
            SIGN_5_15_2, SIGN_115, SIGN_232 -> SignDrawable(R.drawable.a5_15_2, 1.8f, 1f, )
            Line_1_2, SIGN_116 -> SignDrawable(R.drawable.h1_2, 4f, 1f)
            SIGN_5_7_2, SIGN_117, SIGN_233 -> SignDrawable(R.drawable.a5_7_2, 4f, 1f)
            SIGN_3_17_2, SIGN_118 -> SignDrawable(R.drawable.a3_17_2, 1f, 1f)
            SIGN_5_26, SIGN_119 -> SignDrawable(R.drawable.a5_26, 4f, 1f, )
            SIGN_1_16, SIGN_120 -> SignDrawable(R.drawable.a1_16, 1f, 1f)
            SIGN_3_30, SIGN_121 -> SignDrawable(R.drawable.a3_30, 1f, 1f)
            SIGN_5_23_1, SIGN_122 -> SignDrawable(R.drawable.a5_23_1, 4f, 1f)
            SIGN_5_23_2, SIGN_123 -> SignDrawable(R.drawable.a5_23_2, 4f, 1f)
            SIGN_5_7_1, SIGN_124 -> SignDrawable(R.drawable.a5_7_1, 4f, 1f)
            SIGN_8_6_1, SIGN_125 -> SignDrawable(R.drawable.a8_6_1, 2f, 1f)
            SIGN_3_17_1, SIGN_126 -> SignDrawable(R.drawable.a3_17_1, 1f, 1f)
            SIGN_3_17_3, SIGN_127 -> SignDrawable(R.drawable.a3_17_3, 1f, 1f)
            SIGN_7_12, SIGN_128 -> SignDrawable(R.drawable.a7_12, 1f, 1.8f)
            SIGN_3_21, SIGN_129 -> SignDrawable(R.drawable.a3_21, 1f, 1f)
            SIGN_8_6_3, SIGN_130 -> SignDrawable(R.drawable.a8_6_3, 2f, 1f)
            SIGN_8_7 -> SignDrawable(R.drawable.a8_7, 2f, 1f)
            SIGN_3_7, SIGN_131 -> SignDrawable(R.drawable.a3_7, 1f, 1f)
            SIGN_5_8, SIGN_132 -> SignDrawable(R.drawable.a5_8, 1f, 1f)
            SIGN_5_9 -> SignDrawable(R.drawable.a5_9, 1f, 1f)
            SIGN_5_11_1, SIGN_133 -> SignDrawable(R.drawable.a5_11, 1f, 1f)
            SIGN_5_12_1 -> SignDrawable(R.drawable.a5_12_1, 1f, 1f)
            SIGN_5_12_2 -> SignDrawable(R.drawable.a5_12_2, 1f, 1f)
            Line_2_7,   SIGN_134 -> SignDrawable(R.drawable.v2_7, 2f, 1f)
            SIGN_6_9_1 -> SignDrawable(R.drawable.a6_9_1, 2f, 1f, )
            SIGN_6_9_2 -> SignDrawable(R.drawable.a6_9_2, 1.8f, 1f, )
            SIGN_6_9_3 -> SignDrawable(R.drawable.a6_9_3, 1f, 1f)
            SIGN_6_11 -> SignDrawable(R.drawable.a6_11, 1f, 1f, )
            SIGN_6_12 -> SignDrawable(R.drawable.a6_12, 1f, 1f, )
            SIGN_6_10_1 -> SignDrawable(R.drawable.a6_10_1, 1.6f, 1f, )
            SIGN_6_10_2 -> SignDrawable(R.drawable.a6_10_2, 2.2f, 1f, )
            SIGN_3_26, SIGN_135 -> SignDrawable(R.drawable.a3_26, 1f, 1f)
            SIGN_1_29, SIGN_136 -> SignDrawable(R.drawable.a1_29, 1f, 1f)
            SIGN_1_33, SIGN_137 -> SignDrawable(R.drawable.a1_33, 1f, 1f)
            SIGN_1_8, SIGN_138 -> SignDrawable(R.drawable.a1_8, 1f, 1f)
            SIGN_3_11, SIGN_139 -> SignDrawable(R.drawable.a3_11, 1f, 1f)
            SIGN_3_16, SIGN_140 -> SignDrawable(R.drawable.a3_16, 1f, 1f)
            SIGN_4_1_6, SIGN_141 -> SignDrawable(R.drawable.a4_1_6, 1f, 1f)
            SIGN_1_5, SIGN_142 -> SignDrawable(R.drawable.a1_5, 1f, 1f)
            Line_1_10,  SIGN_143 -> SignDrawable(R.drawable.h1_10, 4f, 1f)
            SIGN_8_2_3, SIGN_144 -> SignDrawable(R.drawable.a8_2_3, 1f, 2.3f)
            Line_1_25,   SIGN_145 -> SignDrawable(R.drawable.h1_25, 4f, 1f)
            Line_1_15 -> SignDrawable(R.drawable.h1_15, 4f, 1f)
            Line_1_16_1 -> SignDrawable(R.drawable.h1_16_1, 4f, 1f)
            Line_1_16_2 -> SignDrawable(R.drawable.h1_16_2, 4f, 1f)
            Line_1_16_3 -> SignDrawable(R.drawable.h1_16_3, 4f, 1f)
            SIGN_3_20, SIGN_146 -> SignDrawable(R.drawable.a3_20, 1f, 1f)
            SIGN_3_31, SIGN_147 -> SignDrawable(R.drawable.a3_31, 1f, 1f)
            SIGN_3_23, SIGN_148 -> SignDrawable(R.drawable.a3_23, 1f, 1f)
            SIGN_2_2, SIGN_149 -> SignDrawable(R.drawable.a2_2, 1f, 1f)
            SIGN_1_20_2, SIGN_150 -> SignDrawable(R.drawable.a1_20_2, 1f, 1f)
            SIGN_1_3_2, SIGN_151 -> SignDrawable(R.drawable.a1_3_2, 1f, 1.2f)
            SIGN_152 -> SignDrawable(R.drawable.v2_6, 2f, 1f)
            SIGN_153 -> SignDrawable(R.drawable.a5_33_1, 1f, 1.5f)
            SIGN_154 -> SignDrawable(R.drawable.a5_34_1, 1f, 1.5f)
            SIGN_2_3_2, SIGN_155 -> SignDrawable(R.drawable.a2_3_2, 1f, 1f)
            SIGN_2_3_3, SIGN_156 -> SignDrawable(R.drawable.a2_3_3, 1f, 1f)
            SIGN_2_3_4, SIGN_157 -> SignDrawable(R.drawable.a2_3_4, 1f, 1f)
            SIGN_2_3_5, SIGN_158 -> SignDrawable(R.drawable.a2_3_5, 1f, 1f)
            SIGN_2_3_6, SIGN_159 -> SignDrawable(R.drawable.a2_3_6, 1f, 1f)
            SIGN_2_3_7, SIGN_160 -> SignDrawable(R.drawable.a2_3_7, 1f, 1f)
            SIGN_161 -> SignDrawable(R.drawable.doroga, 4f, 1f)
            SIGN_5_24_1, SIGN_162 -> SignDrawable(R.drawable.a5_24_1, 4f, 1f)
            SIGN_4_5_1, SIGN_163 -> SignDrawable(R.drawable.a4_5_1, 1f, 1f)
            SIGN_5_34, SIGN_164 -> SignDrawable(R.drawable.a5_34, 1f, 1.5f)
            SIGN_5_35 -> SignDrawable(R.drawable.a5_35, 1f, 1.5f)
            SIGN_5_36 -> SignDrawable(R.drawable.a5_36, 1f, 1.5f)
            SIGN_5_37 -> SignDrawable(R.drawable.a5_37, 1f, 1.5f)
            SIGN_5_38 -> SignDrawable(R.drawable.a5_38, 1f, 1.5f)
            SIGN_5_39 -> SignDrawable(R.drawable.a5_39, 1f, 1.5f)
            SIGN_5_40 -> SignDrawable(R.drawable.a5_40, 1f, 1.5f)
            SIGN_4_5_2, SIGN_165 -> SignDrawable(R.drawable.a4_5_2, 1f, 1f)
            SIGN_4_5_3, SIGN_166 -> SignDrawable(R.drawable.a4_5_3, 1f, 1f)
            SIGN_4_5_4, SIGN_167 -> SignDrawable(R.drawable.a4_5_4, 1f, 1f)
            SIGN_4_5_5, SIGN_168 -> SignDrawable(R.drawable.a4_5_5, 1f, 1f)
            SIGN_4_5_6, SIGN_169 -> SignDrawable(R.drawable.a4_5_6, 1f, 1f)
            SIGN_4_5_7, SIGN_170 -> SignDrawable(R.drawable.a4_5_7, 1f, 1f)
            Line_1_14_2, SIGN_171 -> SignDrawable(R.drawable.h1_14_2, 1f, 1.8f)
            SIGN_5_14_2, SIGN_172 -> SignDrawable(R.drawable.a5_14_2, 1f, 1f)
            SIGN_5_14_1 -> SignDrawable(R.drawable.a5_14_1, 1f, 1f)
            SIGN_5_14_3 -> SignDrawable(R.drawable.a5_14_3, 1f, 1f)
            SIGN_5_14_4 -> SignDrawable(R.drawable.a5_14_4, 1f, 1f)
            SIGN_6_5 -> SignDrawable(R.drawable.a6_5, 1f, 1f)
            SIGN_6_6 -> SignDrawable(R.drawable.a6_6, 1f, 1f)
            SIGN_6_7 -> SignDrawable(R.drawable.a6_7, 1f, 1f)
            SIGN_7_14_1, SIGN_173 -> SignDrawable(R.drawable.a7_14_1, 1f, 1.5f)
            SIGN_3_12, SIGN_174 -> SignDrawable(R.drawable.a3_12, 1f, 1f)
            SIGN_3_13, SIGN_175 -> SignDrawable(R.drawable.a3_13, 1f, 1f)
            SIGN_3_14, SIGN_176 -> SignDrawable(R.drawable.a3_14, 1f, 1f)
            SIGN_177 -> SignDrawable(R.drawable.svet_strelka, 3f, 1f, 2.4f)
            SIGN_178 -> SignDrawable(R.drawable.svet_vel, 3f, 1f, 2.4f)
            SIGN_179 -> SignDrawable(R.drawable.svet_revers, 4.5f, 1f, 2f)
            SIGN_180 -> SignDrawable(R.drawable.tram, 2.5f, 1f, 2.4f)
            SIGN_181 -> SignDrawable(R.drawable.regul1, 2f, 1f, 2.4f)
            SIGN_182 -> SignDrawable(R.drawable.regul2, 2f, 1f, 2.4f)
            SIGN_183 -> SignDrawable(R.drawable.regul3, 2f, 1f, 2.4f)
            SIGN_184 -> SignDrawable(R.drawable.perevozka_detey, 1f, 1f)
            SIGN_185 -> SignDrawable(R.drawable.avar, 5f, 1f, 1.6f)
            SIGN_186 -> SignDrawable(R.drawable.pov_left, 2f, 1f, 2.4f)
            SIGN_187 -> SignDrawable(R.drawable.pov_right, 2f, 1f, 2.4f)
            SIGN_188 -> SignDrawable(R.drawable.tormoz, 2f, 1f, 2.4f)
            SIGN_5_15_7, SIGN_189 -> SignDrawable(R.drawable.a5_15_7, 1.7f, 1f, )
            SIGN_5_15_8, SIGN_190 -> SignDrawable(R.drawable.a5_15_8, 2f, 1f)
            SIGN_5_15_4 -> SignDrawable(R.drawable.a5_15_4, 2f, 1f)
            Line_1_1, SIGN_191 -> SignDrawable(R.drawable.h1_1, 4f, 1f)
            SIGN_192 -> SignDrawable(R.drawable.speed_stop, 1.7f, 1f, 1.4f)
            SIGN_8_6_2, SIGN_193 -> SignDrawable(R.drawable.a8_6_2, 2f, 1f)
            SIGN_8_4_7_1, SIGN_8_4_7, SIGN_194 -> SignDrawable(R.drawable.a8_4_7, 2f, 1f)
            SIGN_8_4_7_2 -> SignDrawable(R.drawable.a8_4_7_2, 2f, 1f)
            SIGN_8_6_6, SIGN_195 -> SignDrawable(R.drawable.a8_6_6, 2f, 1f)
            SIGN_8_6_7, SIGN_196 -> SignDrawable(R.drawable.a8_6_7, 2f, 1f)
            SIGN_8_6_8, SIGN_197 -> SignDrawable(R.drawable.a8_6_8, 2f, 1f)
            SIGN_5_22, SIGN_198 -> SignDrawable(R.drawable.a5_22, 1f, 1.5f)
            SIGN_4_1_3, SIGN_199 -> SignDrawable(R.drawable.a4_1_3, 1f, 1f)
            SIGN_4_1_5, SIGN_200 -> SignDrawable(R.drawable.a4_1_5, 1f, 1f)
            SIGN_201 -> SignDrawable(R.drawable.op_1, 2f, 1f, 2f)
            SIGN_202 -> SignDrawable(R.drawable.ucheb, 1.8f, 1f, 2f)
            SIGN_203 -> SignDrawable(R.drawable.gab, 2f, 1f, 2f)
            SIGN_1_17, SIGN_204 -> SignDrawable(R.drawable.a1_17, 1f, 1f)
            SIGN_5_20, SIGN_205 -> SignDrawable(R.drawable.a5_20, 1f, 1f)
            SIGN_5_16, SIGN_206 -> SignDrawable(R.drawable.a5_16, 1f, 1.5f)
            SIGN_5_18, SIGN_207 -> SignDrawable(R.drawable.a5_18, 1f, 1.5f)
            SIGN_5_17 -> SignDrawable(R.drawable.a5_17, 1f, 1.5f)
            Line_1_24_2, SIGN_208 -> SignDrawable(R.drawable.h1_24_2, 1f, 1f)
            Line_1_24_1 -> SignDrawable(R.drawable.h1_24_1, 1f, 1f)
            Line_1_24_3 -> SignDrawable(R.drawable.h1_24_3, 1f, 1f)
            Line_1_24_4 -> SignDrawable(R.drawable.h1_24_4, 2f, 1f)
            Line_1_24_5 -> SignDrawable(R.drawable.h1_24_5, 2f, 1f)
            Line_1_24_6 -> SignDrawable(R.drawable.h1_24_6, 2f, 1f)
            Line_1_24_7 -> SignDrawable(R.drawable.h1_24_7, 2f, 1f)
            SIGN_6_14_1, SIGN_209 -> SignDrawable(R.drawable.a6_14_1, 2f, 1f)
            SIGN_6_13, SIGN_210 -> SignDrawable(R.drawable.a6_13, 1.5f, 1f, )
            Line_1_23_3, SIGN_211 -> SignDrawable(R.drawable.h1_23_3, 1.2f, 1f)
            Line_1_23_2 -> SignDrawable(R.drawable.h1_23_2, 1.2f, 1f)
            SIGN_3_22, SIGN_212 -> SignDrawable(R.drawable.a3_22, 1f, 1f)
            Line_2_2,  SIGN_213 -> SignDrawable(R.drawable.v2_2, 2f, 1f)
            Line_2_3 -> SignDrawable(R.drawable.v2_3, 2f, 1f)
            Line_2_4 -> SignDrawable(R.drawable.v2_4, 2f, 1f)
            Line_2_6 -> SignDrawable(R.drawable.v2_6, 2f, 1f)
            Line_1_22,  SIGN_214 -> SignDrawable(R.drawable.h1_22, 4f, 1f)
            SIGN_8_5_2, SIGN_215 -> SignDrawable(R.drawable.a8_5_2, 2f, 1f)
            SIGN_216 -> SignDrawable(R.drawable.a6_19_1, 1f, 1.4f)
            Line_1_6, SIGN_217 -> SignDrawable(R.drawable.h1_6, 4f, 1f)
            SIGN_1_34_3, SIGN_218 -> SignDrawable(R.drawable.a1_34_3, 3f, 1f)
            SIGN_6_3_2, SIGN_219 -> SignDrawable(R.drawable.a6_3_2, 1f, 1f)
            SIGN_8_18, SIGN_220 -> SignDrawable(R.drawable.a8_18, 2f, 1f)
            SIGN_8_19 -> SignDrawable(R.drawable.a8_19, 2f, 1f)
            SIGN_8_20_1 -> SignDrawable(R.drawable.a8_20_1, 2f, 1f)
            SIGN_8_20_2 -> SignDrawable(R.drawable.a8_20_2, 2f, 1f)
            SIGN_7_10, SIGN_221 -> SignDrawable(R.drawable.a7_10, 1f, 1.8f)
            SIGN_222 -> SignDrawable(R.drawable.a7_9, 1f, 1.8f)
            SIGN_4_2_2, SIGN_223 -> SignDrawable(R.drawable.a4_2_2, 1f, 1f)
            SIGN_1_28, SIGN_224 -> SignDrawable(R.drawable.a1_28, 1f, 1f)
            SIGN_1_1, SIGN_225 -> SignDrawable(R.drawable.a1_1, 1f, 1f)
            SIGN_1_4_3, SIGN_226 -> SignDrawable(R.drawable.a1_4_3, 1f, 1.8f)
            SIGN_227 -> SignDrawable(R.drawable.op12, 1f, 1f)
            SIGN_1_31, SIGN_228 -> SignDrawable(R.drawable.a1_31, 1f, 1f)
            SIGN_6_8_3, SIGN_229 -> SignDrawable(R.drawable.a6_8_3, 1f, 1f)
            SIGN_5_11_2, SIGN_230 -> SignDrawable(R.drawable.a5_11_2, 1f, 1f)
            SIGN_8_2_4, SIGN_234 -> SignDrawable(R.drawable.a8_2_4, 1f, 2f)
            Line_1_17_2, SIGN_235 -> SignDrawable(R.drawable.h1_17_2, 2f, 1f)
            SIGN_5_29, SIGN_236 -> SignDrawable(R.drawable.a5_29, 1f, 1.8f)
            SIGN_8_3_1, SIGN_237 -> SignDrawable(R.drawable.a8_3_1, 2f, 1f)
            SIGN_8_2_5 -> SignDrawable(R.drawable.a8_2_5, 2f, 1f)
            SIGN_8_2_6 -> SignDrawable(R.drawable.a8_2_6, 2f, 1f)
            SIGN_8_3_2, SIGN_238 -> SignDrawable(R.drawable.a8_3_2, 2f, 1f)
            SIGN_8_3_3, SIGN_239 -> SignDrawable(R.drawable.a8_3_3, 2f, 1f)
            Line_1_17_1, SIGN_240 -> SignDrawable(R.drawable.h1_17_1, 2f, 1f)
            SIGN_1_3_1 -> SignDrawable(R.drawable.a1_3_1, 2f, 1f)
            SIGN_1_4_2 -> SignDrawable(R.drawable.a1_4_2, 1f, 1.8f)
            SIGN_1_4_4 -> SignDrawable(R.drawable.a1_4_4, 1f, 1.8f)
            SIGN_1_4_5 -> SignDrawable(R.drawable.a1_4_5, 1f, 1.8f)
            SIGN_1_4_6 -> SignDrawable(R.drawable.a1_4_6, 1f, 1.8f)
            SIGN_1_7 -> SignDrawable(R.drawable.a1_7, 1f, 1f)
            SIGN_1_9 -> SignDrawable(R.drawable.a1_9, 1f, 1f)
            SIGN_1_10 -> SignDrawable(R.drawable.a1_10, 1f, 1f)
            SIGN_1_11_1 -> SignDrawable(R.drawable.a1_11_1, 1f, 1f)
            SIGN_001, SIGN_1_11_2 -> SignDrawable(R.drawable.a1_11_2, 1f, 1f)
            SIGN_1_12_1 -> SignDrawable(R.drawable.a1_12_1, 1f, 1f)
            SIGN_1_19 -> SignDrawable(R.drawable.a1_19, 1f, 1f)
            SIGN_1_20_1 -> SignDrawable(R.drawable.a1_20_1, 1f, 1f)
            SIGN_1_20_3 -> SignDrawable(R.drawable.a1_20_3, 1f, 1f)
            SIGN_1_23 -> SignDrawable(R.drawable.a1_23, 1f, 1f)
            SIGN_1_24 -> SignDrawable(R.drawable.a1_24, 1f, 1f)
            SIGN_1_26 -> SignDrawable(R.drawable.a1_26, 1f, 1f)
            SIGN_1_27 -> SignDrawable(R.drawable.a1_27, 1f, 1f)
            SIGN_1_30 -> SignDrawable(R.drawable.a1_30, 1f, 1f)
            SIGN_1_32 -> SignDrawable(R.drawable.a1_32, 1f, 1f)
            SIGN_1_34_1 -> SignDrawable(R.drawable.a1_34_1, 3f, 1f)
            SIGN_002, SIGN_1_34_2 -> SignDrawable(R.drawable.a1_34_2, 3f, 1f)
            SIGN_1_35 -> SignDrawable(R.drawable.a1_35, 1f, 1f)
            Line_1_26 -> SignDrawable(R.drawable.h1_26, 1f, 1f)
            SIGN_8_4_2 -> SignDrawable(R.drawable.a8_4_2, 2f, 1f)
            SIGN_8_4_4 -> SignDrawable(R.drawable.a8_4_4, 2f, 1f)
            SIGN_8_4_5 -> SignDrawable(R.drawable.a8_4_5, 2f, 1f)
            SIGN_8_4_6 -> SignDrawable(R.drawable.a8_4_6, 2f, 1f)
            SIGN_8_4_8 -> SignDrawable(R.drawable.a8_4_8, 2f, 1f)
            SIGN_8_4_9 -> SignDrawable(R.drawable.a8_4_9, 1.6f, 1f)
            SIGN_8_4_10 -> SignDrawable(R.drawable.a8_4_10, 1.6f, 1f)
            SIGN_8_4_11 -> SignDrawable(R.drawable.a8_4_11, 1.6f, 1f)
            SIGN_8_4_12 -> SignDrawable(R.drawable.a8_4_12, 1.6f, 1f)
            SIGN_8_4_13 -> SignDrawable(R.drawable.a8_4_13, 1.6f, 1f)
            SIGN_8_4_14 -> SignDrawable(R.drawable.a8_4_14, 1.6f, 1f)
            SIGN_8_4_15 -> SignDrawable(R.drawable.a8_4_15, 1.6f, 1f)
            SIGN_8_4_16 -> SignDrawable(R.drawable.a8_4_16, 1.6f, 1f)
            SIGN_8_8 -> SignDrawable(R.drawable.a8_8, 2f, 1f)
            SIGN_8_9_1 -> SignDrawable(R.drawable.a8_9_1, 2f, 1f)
            SIGN_8_9_2 -> SignDrawable(R.drawable.a8_9_2, 2f, 1f)
            SIGN_8_9_3 -> SignDrawable(R.drawable.a8_9_3, 2f, 1f)
            SIGN_3_6 -> SignDrawable(R.drawable.a3_6, 1f, 1f)
            SIGN_3_8 -> SignDrawable(R.drawable.a3_8, 1f, 1f)
            SIGN_3_10 -> SignDrawable(R.drawable.a3_10, 1f, 1f)
            SIGN_3_15 -> SignDrawable(R.drawable.a3_15, 1f, 1f)
            SIGN_3_32 -> SignDrawable(R.drawable.a3_32, 1f, 1f)
            SIGN_3_33 -> SignDrawable(R.drawable.a3_33, 1f, 1f)
            SIGN_3_34 -> SignDrawable(R.drawable.a3_34, 1f, 1f)
            SIGN_3_35 -> SignDrawable(R.drawable.a3_35, 1f, 1f)
            SIGN_4_2_1 -> SignDrawable(R.drawable.a4_2_1, 1f, 1f)
            SIGN_4_2_3 -> SignDrawable(R.drawable.a4_2_3, 1f, 1f)
            SIGN_4_4_1 -> SignDrawable(R.drawable.a4_4_1, 1f, 1f)
            SIGN_4_4_2 -> SignDrawable(R.drawable.a4_4_2, 1f, 1f)
            SIGN_6_22 -> SignDrawable(R.drawable.a6_22, 1f, 1f)
            SIGN_6_17 -> SignDrawable(R.drawable.a6_17, 1f, 1.4f)
            SIGN_6_19_1 -> SignDrawable(R.drawable.a6_19_1, 1f, 1.4f)
            SIGN_6_19_2 -> SignDrawable(R.drawable.a6_19_2, 1f, 1.4f)
            SIGN_6_18_1 -> SignDrawable(R.drawable.a6_18_1, 3f, 1f)
            SIGN_6_18_2 -> SignDrawable(R.drawable.a6_18_2, 3f, 1f)
            SIGN_6_18_3 -> SignDrawable(R.drawable.a6_18_3, 3f, 1f)

            SIGN_8_5_3 -> SignDrawable(R.drawable.a8_5_3, 2f, 1f)
            SIGN_8_5_4 -> SignDrawable(R.drawable.a8_5_4, 2f, 1f)
            SIGN_8_5_5 -> SignDrawable(R.drawable.a8_5_5, 2f, 1f)
            SIGN_8_5_6 -> SignDrawable(R.drawable.a8_5_6, 2f, 1f)
            SIGN_8_5_7 -> SignDrawable(R.drawable.a8_5_7, 2f, 1f)
            SIGN_8_17 -> SignDrawable(R.drawable.a8_17, 2f, 1f)
            SIGN_6_21_1 -> SignDrawable(R.drawable.a6_21_1, 3f, 1f)
            SIGN_6_21_2 -> SignDrawable(R.drawable.a6_21_2, 3f, 1f)
            SIGN_8_22_1 -> SignDrawable(R.drawable.a8_22_1, 1f, 4f)
            SIGN_8_22_2 -> SignDrawable(R.drawable.a8_22_2, 1f, 4f)
            SIGN_8_22_3 -> SignDrawable(R.drawable.a8_22_3, 1f, 4f)

            else -> SignDrawable(R.drawable.ic_help, 1f, 1f)
        }
    }

    companion object {
        const val SIGN_1_1 = "XZsign_1_1XZ"
        const val SIGN_1_2 = "XZsign_1_2XZ"
        const val SIGN_1_3_1 = "XZsign_1_3_1XZ"
        const val SIGN_1_3_2 = "XZsign_1_3_2XZ"
        const val SIGN_1_4_1 = "XZsign_1_4_1XZ"
        const val SIGN_1_4_2 = "XZsign_1_4_2XZ"
        const val SIGN_1_4_3 = "XZsign_1_4_3XZ"
        const val SIGN_1_4_4 = "XZsign_1_4_4XZ"
        const val SIGN_1_4_5 = "XZsign_1_4_5XZ"
        const val SIGN_1_4_6 = "XZsign_1_4_6XZ"
        const val SIGN_1_5 = "XZsign_1_5XZ"
        const val SIGN_1_6 = "XZsign_1_6XZ"
        const val SIGN_1_7 = "XZsign_1_7XZ"
        const val SIGN_1_8 = "XZsign_1_8XZ"
        const val SIGN_1_9 = "XZsign_1_9XZ"
        const val SIGN_1_10 = "XZsign_1_10XZ"
        const val SIGN_1_11_1 = "XZsign_1_11_1XZ"
        const val SIGN_1_11_2 = "XZsign_1_11_2XZ"
        const val SIGN_1_12_1 = "XZsign_1_12_1XZ"
        const val SIGN_1_12_2 = "XZsign_1_12_2XZ"
        const val SIGN_1_13 = "XZsign_1_13XZ"
        const val SIGN_1_14 = "XZsign_1_14XZ"
        const val SIGN_1_15 = "XZsign_1_15XZ"
        const val SIGN_1_16 = "XZsign_1_16XZ"
        const val SIGN_1_17 = "XZsign_1_17XZ"
        const val SIGN_1_18 = "XZsign_1_18XZ"
        const val SIGN_1_19 = "XZsign_1_19XZ"
        const val SIGN_1_20_1 = "XZsign_1_20_1XZ"
        const val SIGN_1_20_2 = "XZsign_1_20_2XZ"
        const val SIGN_1_20_3 = "XZsign_1_20_3XZ"
        const val SIGN_1_21 = "XZsign_1_21XZ"
        const val SIGN_1_22 = "XZsign_1_22XZ"
        const val SIGN_1_23 = "XZsign_1_23XZ"
        const val SIGN_1_24 = "XZsign_1_24XZ"
        const val SIGN_1_25 = "XZsign_1_25XZ"
        const val SIGN_1_26 = "XZsign_1_26XZ"
        const val SIGN_1_27 = "XZsign_1_27XZ"
        const val SIGN_1_28 = "XZsign_1_28XZ"
        const val SIGN_1_29 = "XZsign_1_29XZ"
        const val SIGN_1_30 = "XZsign_1_30XZ"
        const val SIGN_1_31 = "XZsign_1_31XZ"
        const val SIGN_1_32 = "XZsign_1_32XZ"
        const val SIGN_1_33 = "XZsign_1_33XZ"
        const val SIGN_1_34_1 = "XZsign_1_34_1XZ"
        const val SIGN_1_34_2 = "XZsign_1_34_2XZ"
        const val SIGN_1_34_3 = "XZsign_1_34_3XZ"
        const val SIGN_1_35 = "XZsign_1_35XZ"
        const val SIGN_2_1 = "XZsign_2_1XZ"
        const val SIGN_2_2 = "XZsign_2_2XZ"
        const val SIGN_2_3_1 = "XZsign_2_3_1XZ"
        const val SIGN_2_3_2 = "XZsign_2_3_2XZ"
        const val SIGN_2_3_3 = "XZsign_2_3_3XZ"
        const val SIGN_2_3_4 = "XZsign_2_3_4XZ"
        const val SIGN_2_3_5 = "XZsign_2_3_5XZ"
        const val SIGN_2_3_6 = "XZsign_2_3_6XZ"
        const val SIGN_2_3_7 = "XZsign_2_3_7XZ"
        const val SIGN_2_4 = "XZsign_2_4XZ"
        const val SIGN_2_5 = "XZsign_2_5XZ"
        const val SIGN_2_6 = "XZsign_2_6XZ"
        const val SIGN_2_7 = "XZsign_2_7XZ"
        const val SIGN_3_1 = "XZsign_3_1XZ"
        const val SIGN_3_2 = "XZsign_3_2XZ"
        const val SIGN_3_3 = "XZsign_3_3XZ"
        const val SIGN_3_4 = "XZsign_3_4XZ"
        const val SIGN_3_5 = "XZsign_3_5XZ"
        const val SIGN_3_6 = "XZsign_3_6XZ"
        const val SIGN_3_7 = "XZsign_3_7XZ"
        const val SIGN_3_8 = "XZsign_3_8XZ"
        const val SIGN_3_9 = "XZsign_3_9XZ"
        const val SIGN_3_10 = "XZsign_3_10XZ"
        const val SIGN_3_11 = "XZsign_3_11XZ"
        const val SIGN_3_12 = "XZsign_3_12XZ"
        const val SIGN_3_13 = "XZsign_3_13XZ"
        const val SIGN_3_14 = "XZsign_3_14XZ"
        const val SIGN_3_15 = "XZsign_3_15XZ"
        const val SIGN_3_16 = "XZsign_3_16XZ"
        const val SIGN_3_17_1 = "XZsign_3_17_1XZ"
        const val SIGN_3_17_2 = "XZsign_3_17_2XZ"
        const val SIGN_3_17_3 = "XZsign_3_17_3XZ"
        const val SIGN_3_18_1 = "XZsign_3_18_1XZ"
        const val SIGN_3_18_2 = "XZsign_3_18_2XZ"
        const val SIGN_3_19 = "XZsign_3_19XZ"
        const val SIGN_3_20 = "XZsign_3_20XZ"
        const val SIGN_3_21 = "XZsign_3_21XZ"
        const val SIGN_3_22 = "XZsign_3_22XZ"
        const val SIGN_3_23 = "XZsign_3_23XZ"
        const val SIGN_3_24 = "XZsign_3_24XZ"
        const val SIGN_3_25 = "XZsign_3_25XZ"
        const val SIGN_3_26 = "XZsign_3_26XZ"
        const val SIGN_3_27 = "XZsign_3_27XZ"
        const val SIGN_3_28 = "XZsign_3_28XZ"
        const val SIGN_3_29 = "XZsign_3_29XZ"
        const val SIGN_3_30 = "XZsign_3_30XZ"
        const val SIGN_3_31 = "XZsign_3_31XZ"
        const val SIGN_3_32 = "XZsign_3_32XZ"
        const val SIGN_3_33 = "XZsign_3_33XZ"
        const val SIGN_3_34 = "XZsign_3_34XZ"
        const val SIGN_3_35 = "XZsign_3_35XZ"
        const val SIGN_4_1_1 = "XZsign_4_1_1XZ"
        const val SIGN_4_1_2 = "XZsign_4_1_2XZ"
        const val SIGN_4_1_3 = "XZsign_4_1_3XZ"
        const val SIGN_4_1_4 = "XZsign_4_1_4XZ"
        const val SIGN_4_1_5 = "XZsign_4_1_5XZ"
        const val SIGN_4_1_6 = "XZsign_4_1_6XZ"
        const val SIGN_4_2_1 = "XZsign_4_2_1XZ"
        const val SIGN_4_2_2 = "XZsign_4_2_2XZ"
        const val SIGN_4_2_3 = "XZsign_4_2_3XZ"
        const val SIGN_4_3 = "XZsign_4_3XZ"
        const val SIGN_4_4_1 = "XZsign_4_4_1XZ"
        const val SIGN_4_4_2 = "XZsign_4_4_2XZ"
        const val SIGN_4_5_1 = "XZsign_4_5_1XZ"
        const val SIGN_4_5_2 = "XZsign_4_5_2XZ"
        const val SIGN_4_5_3 = "XZsign_4_5_3XZ"
        const val SIGN_4_5_4 = "XZsign_4_5_4XZ"
        const val SIGN_4_5_5 = "XZsign_4_5_5XZ"
        const val SIGN_4_5_6 = "XZsign_4_5_6XZ"
        const val SIGN_4_5_7 = "XZsign_4_5_7XZ"
        const val SIGN_4_6 = "XZsign_4_6XZ"
        const val SIGN_4_7 = "XZsign_4_7XZ"
        const val SIGN_4_8_1 = "XZsign_4_8_1XZ"
        const val SIGN_4_8_2 = "XZsign_4_8_2XZ"
        const val SIGN_4_8_3 = "XZsign_4_8_3XZ"

        const val SIGN_5_1 = "XZsign_5_1XZ"
        const val SIGN_5_2 = "XZsign_5_2XZ"
        const val SIGN_5_3 = "XZsign_5_3XZ"
        const val SIGN_5_4 = "XZsign_5_4XZ"
        const val SIGN_5_5 = "XZsign_5_5XZ"
        const val SIGN_5_6 = "XZsign_5_6XZ"
        const val SIGN_5_7_1 = "XZsign_5_7_1XZ"
        const val SIGN_5_7_2 = "XZsign_5_7_2XZ"
        const val SIGN_5_8 = "XZsign_5_8XZ"
        const val SIGN_5_9 = "XZsign_5_9XZ"
        const val SIGN_5_10 = "XZsign_5_10XZ"
        const val SIGN_5_11_1 = "XZsign_5_11_1XZ"
        const val SIGN_5_11_2 = "XZsign_5_11_2XZ"
        const val SIGN_5_12_1 = "XZsign_5_12_1XZ"
        const val SIGN_5_12_2 = "XZsign_5_12_2XZ"
        const val SIGN_5_13_1 = "XZsign_5_13_1XZ"
        const val SIGN_5_13_2 = "XZsign_5_13_2XZ"
        const val SIGN_5_13_3 = "XZsign_5_13_3XZ"
        const val SIGN_5_13_4 = "XZsign_5_13_4XZ"
        const val SIGN_5_14_1 = "XZsign_5_14_1XZ"
        const val SIGN_5_14_2 = "XZsign_5_14_2XZ"
        const val SIGN_5_14_3 = "XZsign_5_14_3XZ"
        const val SIGN_5_14_4 = "XZsign_5_14_4XZ"
        const val SIGN_5_15_1 = "XZsign_5_15_1XZ"
        const val SIGN_5_15_2 = "XZsign_5_15_2XZ"
        const val SIGN_5_15_3 = "XZsign_5_15_3XZ"
        const val SIGN_5_15_4 = "XZsign_5_15_4XZ"
        const val SIGN_5_15_5 = "XZsign_5_15_5XZ"
        const val SIGN_5_15_6 = "XZsign_5_15_6XZ"
        const val SIGN_5_15_7 = "XZsign_5_15_7XZ"
        const val SIGN_5_15_8 = "XZsign_5_15_8XZ"

        const val SIGN_5_16 = "XZsign_5_16XZ"
        const val SIGN_5_17 = "XZsign_5_17XZ"
        const val SIGN_5_18 = "XZsign_5_18XZ"
        const val SIGN_5_19_1 = "XZsign_5_19_1XZ"
        const val SIGN_5_19_2 = "XZsign_5_19_2XZ"
        const val SIGN_5_20 = "XZsign_5_20XZ"
        const val SIGN_5_21 = "XZsign_5_21XZ"
        const val SIGN_5_22 = "XZsign_5_22XZ"

        const val SIGN_5_23_1 = "XZsign_5_23_1XZ"
        const val SIGN_5_23_2 = "XZsign_5_23_2XZ"
        const val SIGN_5_24_1 = "XZsign_5_24_1XZ"
        const val SIGN_5_24_2 = "XZsign_5_24_2XZ"
        const val SIGN_5_25 = "XZsign_5_25XZ"
        const val SIGN_5_26 = "XZsign_5_26XZ"
        const val SIGN_5_27 = "XZsign_5_27XZ"
        const val SIGN_5_28 = "XZsign_5_28XZ"
        const val SIGN_5_29 = "XZsign_5_29XZ"
        const val SIGN_5_30 = "XZsign_5_30XZ"
        const val SIGN_5_31 = "XZsign_5_31XZ"
        const val SIGN_5_32 = "XZsign_5_32XZ"
        const val SIGN_5_33 = "XZsign_5_33XZ"
        const val SIGN_5_34 = "XZsign_5_34XZ"
        const val SIGN_5_35 = "XZsign_5_35XZ"
        const val SIGN_5_36 = "XZsign_5_36XZ"
        const val SIGN_5_37 = "XZsign_5_37XZ"
        const val SIGN_5_38 = "XZsign_5_38XZ"
        const val SIGN_5_39 = "XZsign_5_39XZ"
        const val SIGN_5_40 = "XZsign_5_40XZ"

        const val SIGN_6_1 = "XZsign_6_1XZ"
        const val SIGN_6_2 = "XZsign_6_2XZ"
        const val SIGN_6_3_1 = "XZsign_6_3_1XZ"
        const val SIGN_6_3_2 = "XZsign_6_3_2XZ"
        const val SIGN_6_4 = "XZsign_6_4XZ"
        const val SIGN_6_4_1 = "XZsign_6_4_1XZ"
        const val SIGN_6_4_2 = "XZsign_6_4_2XZ"
        const val SIGN_6_5 = "XZsign_6_5XZ"
        const val SIGN_6_6 = "XZsign_6_6XZ"
        const val SIGN_6_7 = "XZsign_6_7XZ"
        const val SIGN_6_8_1 = "XZsign_6_8_1XZ"
        const val SIGN_6_8_2 = "XZsign_6_8_2XZ"
        const val SIGN_6_8_3 = "XZsign_6_8_3XZ"
        const val SIGN_6_9_1 = "XZsign_6_9_1XZ"
        const val SIGN_6_9_2 = "XZsign_6_9_2XZ"
        const val SIGN_6_9_3 = "XZsign_6_9_3XZ"
        const val SIGN_6_10_1 = "XZsign_6_10_1XZ"
        const val SIGN_6_10_2 = "XZsign_6_10_2XZ"
        const val SIGN_6_11 = "XZsign_6_11XZ"
        const val SIGN_6_12 = "XZsign_6_12XZ"
        const val SIGN_6_13 = "XZsign_6_13XZ"
        const val SIGN_6_14_1 = "XZsign_6_14_1XZ"
        const val SIGN_6_14_2 = "XZsign_6_14_2XZ"
        const val SIGN_6_15_1 = "XZsign_6_15_1XZ"
        const val SIGN_6_15_2 = "XZsign_6_15_2XZ"
        const val SIGN_6_15_3 = "XZsign_6_15_3XZ"
        const val SIGN_6_16 = "XZsign_6_16XZ"
        const val SIGN_6_17 = "XZsign_6_17XZ"
        const val SIGN_6_18_1 = "XZsign_6_18_1XZ"
        const val SIGN_6_18_2 = "XZsign_6_18_2XZ"
        const val SIGN_6_18_3 = "XZsign_6_18_3XZ"
        const val SIGN_6_19_1 = "XZsign_6_19_1XZ"
        const val SIGN_6_19_2 = "XZsign_6_19_2XZ"
        const val SIGN_6_20_1 = "XZsign_6_20_1XZ"
        const val SIGN_6_20_2 = "XZsign_6_20_2XZ"
        const val SIGN_6_21_1 = "XZsign_6_21_1XZ"
        const val SIGN_6_21_2 = "XZsign_6_21_2XZ"
        const val SIGN_6_22 = "XZsign_6_22XZ"
        const val SIGN_7_1 = "XZsign_7_1XZ"
        const val SIGN_7_2 = "XZsign_7_2XZ"
        const val SIGN_7_3 = "XZsign_7_3XZ"
        const val SIGN_7_4 = "XZsign_7_4XZ"
        const val SIGN_7_5 = "XZsign_7_5XZ"
        const val SIGN_7_6 = "XZsign_7_6XZ"
        const val SIGN_7_7 = "XZsign_7_7XZ"
        const val SIGN_7_8 = "XZsign_7_8XZ"
        const val SIGN_7_9 = "XZsign_7_9XZ"
        const val SIGN_7_10 = "XZsign_7_10XZ"
        const val SIGN_7_11 = "XZsign_7_11XZ"
        const val SIGN_7_12 = "XZsign_7_12XZ"
        const val SIGN_7_13 = "XZsign_7_13XZ"
        const val SIGN_7_14_1 = "XZsign_7_14_1XZ"
        const val SIGN_7_14_2 = "XZsign_7_14_2XZ"
        const val SIGN_7_15 = "XZsign_7_15XZ"
        const val SIGN_7_16 = "XZsign_7_16XZ"
        const val SIGN_7_17 = "XZsign_7_17XZ"
        const val SIGN_7_18 = "XZsign_7_18XZ"
        const val SIGN_7_19 = "XZsign_7_19XZ"
        const val SIGN_7_20 = "XZsign_7_20XZ"
        const val SIGN_7_21 = "XZsign_7_21XZ"

        const val Line_1_1 = "XZline_1_1XZ"
        const val Line_1_2 = "XZline_1_2XZ"
        const val Line_1_3 = "XZline_1_3XZ"
        const val Line_1_4 = "XZline_1_4XZ"
        const val Line_1_5 = "XZline_1_5XZ"
        const val Line_1_6 = "XZline_1_6XZ"
        const val Line_1_7 = "XZline_1_7XZ"
        const val Line_1_8 = "XZline_1_8XZ"
        const val Line_1_9 = "XZline_1_9XZ"
        const val Line_1_10 = "XZline_1_10XZ"
        const val Line_1_11 = "XZline_1_11XZ"
        const val Line_1_12 = "XZline_1_12XZ"
        const val Line_1_13 = "XZline_1_13XZ"

        const val Line_1_14_1 = "XZline_1_14_1XZ"
        const val Line_1_14_2 = "XZline_1_14_2XZ"
        const val Line_1_14_3 = "XZline_1_14_3XZ"
        const val Line_1_15 = "XZline_1_15XZ"

        const val Line_1_16_1 = "XZline_1_16_1XZ"
        const val Line_1_16_2 = "XZline_1_16_2XZ"
        const val Line_1_16_3 = "XZline_1_16_3XZ"

        const val Line_1_17_1 = "XZline_1_17_1XZ"
        const val Line_1_17_2 = "XZline_1_17_2XZ"
        const val Line_1_18 = "XZline_1_18XZ"
        const val Line_1_19 = "XZline_1_19XZ"
        const val Line_1_20 = "XZline_1_20XZ"
        const val Line_1_21 = "XZline_1_21XZ"
        const val Line_1_22 = "XZline_1_22XZ"
        const val Line_1_23_1 = "XZline_1_23_1XZ"
        const val Line_1_23_2 = "XZline_1_23_2XZ"
        const val Line_1_23_3 = "XZline_1_23_3XZ"

        const val Line_1_24_1 = "XZline_1_24_1XZ"
        const val Line_1_24_2 = "XZline_1_24_2XZ"
        const val Line_1_24_3 = "XZline_1_24_3XZ"
        const val Line_1_24_4 = "XZline_1_24_4XZ"
        const val Line_1_24_5 = "XZline_1_24_5XZ"
        const val Line_1_24_6 = "XZline_1_24_6XZ"
        const val Line_1_24_7 = "XZline_1_24_7XZ"

        const val Line_1_25 = "XZline_1_25XZ"
        const val Line_1_26 = "XZline_1_26XZ"

        const val Line_2_1_1 = "XZline_2_1_1XZ"
        const val Line_2_1_2 = "XZline_2_1_2XZ"
        const val Line_2_1_3 = "XZline_2_1_3XZ"
        const val Line_2_2 = "XZline_2_2XZ"
        const val Line_2_3 = "XZline_2_3XZ"
        const val Line_2_4 = "XZline_2_4XZ"
        const val Line_2_5 = "XZline_2_5XZ"
        const val Line_2_6 = "XZline_2_6XZ"
        const val Line_2_7 = "XZline_2_7XZ"


        const val SIGN_8_1_1 = "XZsign_8_1_1XZ"
        const val SIGN_8_1_2 = "XZsign_8_1_2XZ"
        const val SIGN_8_1_3 = "XZsign_8_1_3XZ"
        const val SIGN_8_1_4 = "XZsign_8_1_4XZ"
        const val SIGN_8_2_1 = "XZsign_8_2_1XZ"
        const val SIGN_8_2_2 = "XZsign_8_2_2XZ"
        const val SIGN_8_2_3 = "XZsign_8_2_3XZ"
        const val SIGN_8_2_4 = "XZsign_8_2_4XZ"
        const val SIGN_8_2_5 = "XZsign_8_2_5XZ"
        const val SIGN_8_2_6 = "XZsign_8_2_6XZ"
        const val SIGN_8_3_1 = "XZsign_8_3_1XZ"
        const val SIGN_8_3_2 = "XZsign_8_3_2XZ"
        const val SIGN_8_3_3 = "XZsign_8_3_3XZ"

        const val SIGN_8_4_1 = "XZsign_8_4_1XZ"
        const val SIGN_8_4_2 = "XZsign_8_4_2XZ"
        const val SIGN_8_4_3 = "XZsign_8_4_3XZ"
        const val SIGN_8_4_3_2 = "XZsign_8_4_3_2XZ"
        const val SIGN_8_4_3_1 = "XZsign_8_4_3_1XZ"

        const val SIGN_8_4_4 = "XZsign_8_4_4XZ"
        const val SIGN_8_4_5 = "XZsign_8_4_5XZ"
        const val SIGN_8_4_6 = "XZsign_8_4_6XZ"
        const val SIGN_8_4_7 = "XZsign_8_4_7XZ"
        const val SIGN_8_4_7_1 = "XZsign_8_4_7_1XZ"
        const val SIGN_8_4_7_2 = "XZsign_8_4_7_2XZ"
        const val SIGN_8_4_8 = "XZsign_8_4_8XZ"
        const val SIGN_8_4_9 = "XZsign_8_4_9XZ"
        const val SIGN_8_4_10 = "XZsign_8_4_10XZ"
        const val SIGN_8_4_11 = "XZsign_8_4_11XZ"
        const val SIGN_8_4_12 = "XZsign_8_4_12XZ"
        const val SIGN_8_4_13 = "XZsign_8_4_13XZ"
        const val SIGN_8_4_14 = "XZsign_8_4_14XZ"
        const val SIGN_8_4_15 = "XZsign_8_4_15XZ"
        const val SIGN_8_4_16 = "XZsign_8_4_16XZ"

        const val SIGN_8_5_1 = "XZsign_8_5_1XZ"
        const val SIGN_8_5_2 = "XZsign_8_5_2XZ"
        const val SIGN_8_5_3 = "XZsign_8_5_3XZ"
        const val SIGN_8_5_4 = "XZsign_8_5_4XZ"
        const val SIGN_8_5_5 = "XZsign_8_5_5XZ"
        const val SIGN_8_5_6 = "XZsign_8_5_6XZ"
        const val SIGN_8_5_7 = "XZsign_8_5_7XZ"

        const val SIGN_8_6_1 = "XZsign_8_6_1XZ"
        const val SIGN_8_6_2 = "XZsign_8_6_2XZ"
        const val SIGN_8_6_3 = "XZsign_8_6_3XZ"
        const val SIGN_8_6_4 = "XZsign_8_6_4XZ"
        const val SIGN_8_6_5 = "XZsign_8_6_5XZ"
        const val SIGN_8_6_6 = "XZsign_8_6_6XZ"
        const val SIGN_8_6_7 = "XZsign_8_6_7XZ"
        const val SIGN_8_6_8 = "XZsign_8_6_8XZ"
        const val SIGN_8_6_9 = "XZsign_8_6_9XZ"
        const val SIGN_8_7 = "XZsign_8_7XZ"

        const val SIGN_8_8 = "XZsign_8_8XZ"
        const val SIGN_8_9_1 = "XZsign_8_9_1XZ"
        const val SIGN_8_9_2 = "XZsign_8_9_2XZ"
        const val SIGN_8_9_3 = "XZsign_8_9_3XZ"
        const val SIGN_8_10 = "XZsign_8_10XZ"
        const val SIGN_8_11 = "XZsign_8_11XZ"
        const val SIGN_8_12 = "XZsign_8_12XZ"
        const val SIGN_8_13 = "XZsign_8_13XZ"
        const val SIGN_8_14 = "XZsign_8_14XZ"
        const val SIGN_8_15 = "XZsign_8_15XZ"
        const val SIGN_8_16 = "XZsign_8_16XZ"
        const val SIGN_8_17 = "XZsign_8_17XZ"
        const val SIGN_8_18 = "XZsign_8_18XZ"
        const val SIGN_8_19 = "XZsign_8_19XZ"
        const val SIGN_8_20_1 = "XZsign_8_20_1XZ"
        const val SIGN_8_20_2 = "XZsign_8_20_2XZ"
        const val SIGN_8_21_1 = "XZsign_8_21_1XZ"
        const val SIGN_8_21_2 = "XZsign_8_21_2XZ"
        const val SIGN_8_21_3 = "XZsign_8_21_3XZ"
        const val SIGN_8_22_1 = "XZsign_8_22_1XZ"
        const val SIGN_8_22_2 = "XZsign_8_22_2XZ"
        const val SIGN_8_22_3 = "XZsign_8_22_3XZ"

        const val SIGN_8_24 = "XZsign_8_24XZ"
        const val SIGN_8_25 = "XZsign_8_25XZ"
        const val SIGN_8_26 = "XZsign_8_26XZ"

        const val SIGN_001 = "XZОпасный поворотXZ"
        const val SIGN_002 = "XZНаправление поворотаXZ"
        const val SIGN_003 = "XZСтоянка запрещенаXZ"
        const val SIGN_004 = "XZПолоса для маршрутных транспортных средствXZ"
        const val SIGN_005 = "XZВелосипедная дорожкаXZ"
        const val SIGN_006 = "XZПешеходная и велосипедная дорожка с совмещенным движениемXZ"
        const val SIGN_007 = "XZПешеходная и велосипедная дорожка с разделением движенияXZ"
        const val SIGN_008 = "XZРазметка1.13XZ"
        const val SIGN_009 = "XZУступите дорогуXZ"
        const val SIGN_010 = "XZСтрелыразметки118XZ"
        const val SIGN_011 = "XZОграничение минимальной скоростиXZ"
        const val SIGN_012 = "XZПолоса движенияXZ"
        const val SIGN_013 = "XZПересечение со второстепенной дорогойXZ"
        const val SIGN_014 = "XZГлавная дорогаXZ"
        const val SIGN_015 = "XZНаправление главной дорогиXZ"
        const val SIGN_016 = "XZЖилая зонаXZ"
        const val SIGN_017 = "XZПреимущество перед встречным движениемXZ"
        const val SIGN_018 = "XZСтоянка запрещена по нечетным числам месяцаXZ"
        const val SIGN_019 = "XZПешеходная зонаXZ"
        const val SIGN_020 = "XZразметкой1.9XZ"
        const val SIGN_021 = "XZНаправления движения по полосамXZ"
        const val SIGN_022 = "XZАвтомагистральXZ"
        const val SIGN_023 = "XZДвижение без остановки запрещеноXZ"
        const val SIGN_024 = "XZстоп-линияXZ"
        const val SIGN_025 = "XZВлажное покрытиеXZ"
        const val SIGN_026 = "XZОграничение максимальной скоростиXZ"
        const val SIGN_027 = "XZДорога с односторонним движениемXZ"
        const val SIGN_028 = "XZНомер маршрутаXZ"
        const val SIGN_029 = "XZНаправление движения для грузовых автомобилейXZ"
        const val SIGN_030 = "XZРазметка1.17XZ"
        const val SIGN_031 = "XZразметки1.11XZ"
        const val SIGN_032 = "XZПарковкаXZ"
        const val SIGN_033 = "XZМесто отдыхаXZ"
        const val SIGN_034 = "XZДвижение направоXZ"
        const val SIGN_035 = "XZОграничение разрешенной максимальной массыXZ"
        const val SIGN_036 = "XZДвижение грузовых автомобилей запрещеноXZ"
        const val SIGN_037 = "XZОпасные поворотыXZ"
        const val SIGN_038 = "XZЗона действияXZ"
        const val SIGN_039 = "XZНачало полосыXZ"
        const val SIGN_040 = "XZРазметка 1.21XZ"
        const val SIGN_041 = "XZКонец полосыXZ"
        const val SIGN_042 = "XZРазметка1.3XZ"
        const val SIGN_043 = "XZКрутой спускXZ"
        const val SIGN_044 = "XZКрутой подъемXZ"
        const val SIGN_045 = "XZПреимущество встречного движенияXZ"
        const val SIGN_046 = "XZОстановка запрещенаXZ"
        const val SIGN_047 = "XZКонец населенного пунктаXZ"
        const val SIGN_048 = "XZСпособ постановки транспортного средства на стоянкуXZ"
        const val SIGN_049 = "XZРазметка 2.5XZ"
        const val SIGN_050 = "XZзнак 6.16XZ"
        const val SIGN_051 = "XZДвижение прямо или направоXZ"
        const val SIGN_052 = "XZВид транспортного средстваXZ"
        const val SIGN_053 = "XZКонец зоны ограничения максимальной скоростиXZ"
        const val SIGN_054 = "XZСпособ постановки транспортного средства на стоянку8.6.9XZ"
        const val SIGN_055 = "XZПоворот налево запрещенXZ"
        const val SIGN_056 = "XZДвижение запрещеноXZ"
        const val SIGN_057 = "XZДвижение механических транспортных средств запрещеноXZ"
        const val SIGN_058 = "XZВъезд запрещенXZ"
        const val SIGN_059 = "XZВид маршрутного транспортного средстваXZ"
        const val SIGN_060 = "XZРазметка 1.20XZ"
        const val SIGN_061 = "XZПеревозка детейXZ"
        const val SIGN_062 = "XZПункт контроля международных транспортных перевозокXZ"
        const val SIGN_063 = "XZРасстояние до объектаXZ"
        const val SIGN_064 = "XZРазметка 1.4XZ"
        const val SIGN_065 = "XZЗона с ограничением максимальной скоростиXZ"
        const val SIGN_066 = "XZЗона с ограничением стоянкиXZ"
        const val SIGN_067 = "XZКонец зоны с ограничением максимальной скоростиXZ"
        const val SIGN_068 = "XZКонец зоны с ограничением стоянкиXZ"
        const val SIGN_069 = "XZРазметка1.7XZ"
        const val SIGN_070 = "XZКрупногабаритный грузXZ"
        const val SIGN_071 = "XZВыезд на дорогу с полосой для маршрутных транспортных средствXZ"
        const val SIGN_072 = "XZРазворот запрещенXZ"
        const val SIGN_073 = "XZМесто для разворотаXZ"
        const val SIGN_074 = "XZТупикXZ"
        const val SIGN_075 = "XZРазметка1.5XZ"
        const val SIGN_076 = "XZДвижение прямоXZ"
        const val SIGN_077 = "XZПешеходный переходКраснXZ"
        const val SIGN_078 = "XZПешеходный переход Синий1XZ"
        const val SIGN_079 = "XZПешеходный переход Синий2XZ"
        const val SIGN_080 = "XZРасстояние до объекта811XZ"
        const val SIGN_081 = "XZКруговое движениеXZ"
        const val SIGN_082 = "XZПоворот направо запрещенXZ"
        const val SIGN_083 = "XZНаправление движения транспортных средств с опасными грузамиXZ"
        const val SIGN_084 = "XZВыезд на дорогу с реверсивным движениемXZ"
        const val SIGN_085 = "XZВыброс гравияXZ"
        const val SIGN_086 = "XZСкользкая дорогаXZ"
        const val SIGN_087 = "XZЗона действия822XZ"
        const val SIGN_088 = "XZНаправление движения для грузовых автомобилей6.15XZ"
        const val SIGN_089 = "XZРазметкой 2.1.1XZ"
        const val SIGN_090 = "XZРазметкой 2.1.3XZ"
        const val SIGN_091 = "XZКонец дороги с односторонним движениемXZ"
        const val SIGN_092 = "XZДвустороннее движениеXZ"
        const val SIGN_093 = "XZЖелезнодорожный переезд без шлагбаумаXZ"
        const val SIGN_094 = "XZПриближение к железнодорожному переездуXZ"
        const val SIGN_095 = "XZНаправление движения к аварийному выходуXZ"
        const val SIGN_096 = "XZРазметка1.19XZ"
        const val SIGN_097 = "XZКонец полосы5156XZ"
        const val SIGN_098 = "XZРазметка зебраXZ"
        const val SIGN_099 = "XZВыезд на дорогу с полосой для маршрутных транспортных средств2XZ"
        const val SIGN_100 = "XZТабличка 8.5.1XZ"
        const val SIGN_101 = "XZОпасный грузXZ"
        const val SIGN_102 = "XZПересечение равнозначных дорогXZ"
        const val SIGN_103 = "XZНачало населенного пункта на синем фонеXZ"
        const val SIGN_104 = "XZРазметка 1231XZ"
        const val SIGN_105 = "XZДорога для автомобилейXZ"
        const val SIGN_106 = "XZРекомендуемая скоростьXZ"
        const val SIGN_107 = "XZДвижение мотоциклов запрещеноXZ"
        const val SIGN_108 = "XZДвижение на велосипедах запрещеноXZ"
        const val SIGN_110 = "XZСпособ постановки на стоянку 1XZ"
        const val SIGN_111 = "XZСпособ постановки на стоянку 2XZ"
        const val SIGN_112 = "XZНачало населенного пунктаXZ"
        const val SIGN_113 = "XZДорожные работыXZ"
        const val SIGN_114 = "XZОпасная обочинаXZ"
        const val SIGN_115 = "XZНаправления движения по полосеXZ"
        const val SIGN_116 = "XZлиниz разметки 1.2XZ"
        const val SIGN_117 = "XZВыезд на дорогу с односторонним движениемXZ"
        const val SIGN_118 = "XZОпасностьXZ"
        const val SIGN_119 = "XZКонец526XZ"
        const val SIGN_120 = "XZНеровная дорогаXZ"
        const val SIGN_121 = "XZСтоянка запрещена по четным числам месяцаXZ"
        const val SIGN_122 = "XZНачало населенного пунктаАXZ"
        const val SIGN_123 = "XZНачало населенного пунктаБXZ"
        const val SIGN_124 = "XZВыезд на дорогу с односторонним движением2XZ"
        const val SIGN_125 = "XZСпособ постановки на стоянку 3XZ"
        const val SIGN_126 = "XZТаможняXZ"
        const val SIGN_127 = "XZКонтрольXZ"
        const val SIGN_128 = "XZдпсXZ"
        const val SIGN_129 = "XZКонец зоны запрещения обгонаXZ"
        const val SIGN_130 = "XZСпособ постановки на стоянку4XZ"
        const val SIGN_131 = "XZДвижение с прицепом запрещеноXZ"
        const val SIGN_132 = "XZРеверсивное движениеXZ"
        const val SIGN_133 = "XZДорога с полосой для маршрутных транспортных средствXZ"
        const val SIGN_134 = "XZРазметка 2.7XZ"
        const val SIGN_135 = "XZПодача звукового сигнала запрещенаXZ"
        const val SIGN_136 = "XZБоковой ветерXZ"
        const val SIGN_137 = "XZПрочие опасностиXZ"
        const val SIGN_138 = "XZСветофорное регулированиеXZ"
        const val SIGN_139 = "XZОграничение массыXZ"
        const val SIGN_140 = "XZОграничение минимальной дистанцииXZ"
        const val SIGN_141 = "XZДвижение направо или налевоXZ"
        const val SIGN_142 = "XZПересечение с трамвайной линиейXZ"
        const val SIGN_143 = "XZРазметка 1.10XZ"
        const val SIGN_144 = "XZЗона действия 823XZ"
        const val SIGN_145 = "XZРазметка 1.25XZ"
        const val SIGN_146 = "XZОбгон запрещенXZ"
        const val SIGN_147 = "XZКонец зоны всех ограниченийXZ"
        const val SIGN_148 = "XZКонец зоны запрещения обгона грузовым автомобилямXZ"
        const val SIGN_149 = "XZКонец главной дорогиXZ"
        const val SIGN_150 = "XZСужение дорогиXZ"
        const val SIGN_151 = "XZмногопутная железная дорогаXZ"
        const val SIGN_152 = "XZвертикальная разметка 2.6XZ"
        const val SIGN_153 = "XZВелосипеднаяНачалоXZ"
        const val SIGN_154 = "XZВелосипеднаяКонецXZ"
        const val SIGN_155 = "XZЗнак2.3.2XZ"
        const val SIGN_156 = "XZЗнак2.3.3XZ"
        const val SIGN_157 = "XZЗнак2.3.4XZ"
        const val SIGN_158 = "XZЗнак2.3.5XZ"
        const val SIGN_159 = "XZЗнак2.3.6XZ"
        const val SIGN_160 = "XZЗнак2.3.7XZ"
        const val SIGN_161 = "XZДорогаXZ"
        const val SIGN_162 = "XZКонец5241XZ"
        const val SIGN_163 = "XZПешеходная дорожкаXZ"
        const val SIGN_164 = "XZКонец зоны534XZ"
        const val SIGN_165 = "XZЗнак 452XZ"
        const val SIGN_166 = "XZЗнак 453XZ"
        const val SIGN_167 = "XZЗнак 454XZ"
        const val SIGN_168 = "XZЗнак 455XZ"
        const val SIGN_169 = "XZЗнак 456XZ"
        const val SIGN_170 = "XZЗнак 457XZ"
        const val SIGN_171 = "XZЗнак 1142XZ"
        const val SIGN_172 = "XZЗнак 5142XZ"
        const val SIGN_173 = "XZЗнак 7141XZ"
        const val SIGN_174 = "XZЗнак 312XZ"
        const val SIGN_175 = "XZЗнак 313XZ"
        const val SIGN_176 = "XZЗнак 314XZ"
        const val SIGN_177 = "XZСветстрелкиXZ"
        const val SIGN_178 = "XZСветвелXZ"
        const val SIGN_179 = "XZСветреверсXZ"
        const val SIGN_180 = "XZтрамXZ"
        const val SIGN_181 = "XZрегул1XZ"
        const val SIGN_182 = "XZрегул2XZ"
        const val SIGN_183 = "XZрегул3XZ"
        const val SIGN_184 = "XZПеревозкаДетейXZ"
        const val SIGN_185 = "XZАварXZ"
        const val SIGN_186 = "XZПовлевXZ"
        const val SIGN_187 = "XZПоврайтXZ"
        const val SIGN_188 = "XZтормозXZ"
        const val SIGN_189 = "XZзнак5157XZ"
        const val SIGN_190 = "XZзнак5158XZ"
        const val SIGN_191 = "XZразметка11XZ"
        const val SIGN_192 = "XZспидстопXZ"
        const val SIGN_193 = "XZзнак862XZ"
        const val SIGN_194 = "XZзнак847XZ"
        const val SIGN_195 = "XZзнак866XZ"
        const val SIGN_196 = "XZзнак867XZ"
        const val SIGN_197 = "XZзнак868XZ"
        const val SIGN_198 = "XZзнак522XZ"
        const val SIGN_199 = "XZзнак413XZ"
        const val SIGN_200 = "XZзнак415XZ"
        const val SIGN_201 = "XZop1XZ"
        const val SIGN_202 = "XZучебXZ"
        const val SIGN_203 = "XZгабXZ"
        const val SIGN_204 = "XZЗнак 117XZ"
        const val SIGN_205 = "XZЗнак 520XZ"
        const val SIGN_206 = "XZЗнак 516XZ"
        const val SIGN_207 = "XZЗнак 518XZ"
        const val SIGN_208 = "XZЗнак 1242XZ"
        const val SIGN_209 = "XZЗнак 6141XZ"
        const val SIGN_210 = "XZЗнак 613XZ"
        const val SIGN_211 = "XZЗнак 1233XZ"
        const val SIGN_212 = "XZЗнак 322XZ"
        const val SIGN_213 = "XZразметка22XZ"
        const val SIGN_214 = "XZразметка122XZ"
        const val SIGN_215 = "XZзнак 852XZ"
        const val SIGN_216 = "XZзнак 6191XZ"
        const val SIGN_217 = "XZразметка16XZ"
        const val SIGN_218 = "XZзнак 134316XZ"
        const val SIGN_219 = "XZзнак 632XZ"
        const val SIGN_220 = "XZзнак 818XZ"
        const val SIGN_221 = "XZзнак 710XZ"
        const val SIGN_222 = "XZзнак 79XZ"
        const val SIGN_223 = "XZзнак 422XZ"
        const val SIGN_224 = "XZзнак 128XZ"
        const val SIGN_225 = "XZзнак 11XZ"
        const val SIGN_226 = "XZзнак 143XZ"
        const val SIGN_227 = "XZзнак инвалидXZ"
        const val SIGN_228 = "XZзнак 131XZ"
        const val SIGN_229 = "XZзнак 683XZ"
        const val SIGN_230 = "XZзнак 5112XZ"
        const val SIGN_231 = "XZзнак34XZ"
        const val SIGN_232 = "XZзнак5152XZ"
        const val SIGN_233 = "XZзнак572XZ"
        const val SIGN_234 = "XZзнак824XZ"
        const val SIGN_235 = "XZразметка1172XZ"
        const val SIGN_236 = "XZзнак529XZ"
        const val SIGN_237 = "XZзнак831XZ"
        const val SIGN_238 = "XZзнак832XZ"
        const val SIGN_239 = "XZзнак833XZ"
        const val SIGN_240 = "XZразметка1171XZ"
    }
}
