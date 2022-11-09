package com.simpleapps.pddlibrary

class PDDSignDrawableProvider {

    fun getDrawable(sign: String): SignDrawable {
        return when (sign) {
            SIGN_001 -> SignDrawable(R.drawable.a111, 1f, 1f)
            SIGN_002 -> SignDrawable(R.drawable.a1342, 3f, 1f)
            SIGN_003 -> SignDrawable(R.drawable.a328, 1f, 1f)
            SIGN_004 -> SignDrawable(R.drawable.a514, 1f, 1f)
            SIGN_005 -> SignDrawable(R.drawable.a441, 1f, 1f)
            SIGN_006 -> SignDrawable(R.drawable.a452, 1f, 1f)
            SIGN_007 -> SignDrawable(R.drawable.a454, 1f, 1f)
            SIGN_008 -> SignDrawable(R.drawable.h1_13, 4f, 1f)
            SIGN_009 -> SignDrawable(R.drawable.a2_4, 1f, 1f)
            SIGN_010 -> SignDrawable(R.drawable.h1_18, 4f, 1f)
            SIGN_011 -> SignDrawable(R.drawable.a4_6, 1f, 1f)
            SIGN_012 -> SignDrawable(R.drawable.a8_14, 2f, 1f)
            SIGN_013 -> SignDrawable(R.drawable.a2_3_1, 1f, 1f)
            SIGN_014 -> SignDrawable(R.drawable.a2_1, 1f, 1f)
            SIGN_015 -> SignDrawable(R.drawable.a8_13, 1f, 1f)
            SIGN_016 -> SignDrawable(R.drawable.a5_21, 1f, 1.5f)
            SIGN_017 -> SignDrawable(R.drawable.a2_7, 1f, 1f)
            SIGN_018 -> SignDrawable(R.drawable.a3_29, 1f, 1f)
            SIGN_019 -> SignDrawable(R.drawable.a5_33, 1f, 1.5f)
            SIGN_020 -> SignDrawable(R.drawable.h1_9, 4f, 1f)
            SIGN_021 -> SignDrawable(R.drawable.a5_15_1, 2f, 1f)
            SIGN_022 -> SignDrawable(R.drawable.a5_1, 1f, 1.8f)
            SIGN_023 -> SignDrawable(R.drawable.a2_5, 1f, 1f)
            SIGN_024 -> SignDrawable(R.drawable.h1_12, 4f, 1f)
            SIGN_025 -> SignDrawable(R.drawable.a8_16, 2f, 1f)
            SIGN_026 -> SignDrawable(R.drawable.a3_24, 1f, 1f)
            SIGN_027 -> SignDrawable(R.drawable.a5_5, 1f, 1f)
            SIGN_028 -> SignDrawable(R.drawable.a6_14_2, 2.5f, 1f)
            SIGN_029 -> SignDrawable(R.drawable.a6_15_1, 3f, 1f)
            SIGN_030 -> SignDrawable(R.drawable.h1_17, 4f, 1f)
            SIGN_031 -> SignDrawable(R.drawable.h1_11, 4f, 1f)
            SIGN_032 -> SignDrawable(R.drawable.a6_4, 1f, 1f)
            SIGN_033 -> SignDrawable(R.drawable.a7_11, 1f, 1.8f)
            SIGN_034 -> SignDrawable(R.drawable.a4_1_2, 1f, 1f)
            SIGN_035 -> SignDrawable(R.drawable.a8_11, 2f, 1f)
            SIGN_036 -> SignDrawable(R.drawable.a3_4, 1f, 1f)
            SIGN_037 -> SignDrawable(R.drawable.a1_12_2, 1f, 1f)
            SIGN_038 -> SignDrawable(R.drawable.a8_2_1, 2f, 1f)
            SIGN_039 -> SignDrawable(R.drawable.a5_15_3, 3f, 1f)
            SIGN_040 -> SignDrawable(R.drawable.h1_21, 4f, 1f)
            SIGN_041 -> SignDrawable(R.drawable.a5_15_5, 1f, 1f)
            SIGN_042 -> SignDrawable(R.drawable.h1_3, 4f, 1f)
            SIGN_043 -> SignDrawable(R.drawable.a1_13, 1f, 1f)
            SIGN_044 -> SignDrawable(R.drawable.a1_14, 1f, 1f)
            SIGN_045 -> SignDrawable(R.drawable.a2_6, 1f, 1f)
            SIGN_046 -> SignDrawable(R.drawable.a3_27, 1f, 1f)
            SIGN_047 -> SignDrawable(R.drawable.a5_24_2, 4f, 1f)
            SIGN_048 -> SignDrawable(R.drawable.a8_6_4, 2f, 1f)
            SIGN_049 -> SignDrawable(R.drawable.v2_5, 2f, 1f)
            SIGN_050 -> SignDrawable(R.drawable.a6_16, 3f, 1f)
            SIGN_051 -> SignDrawable(R.drawable.a4_1_4, 1f, 1f)
            SIGN_052 -> SignDrawable(R.drawable.a8_4_1, 2f, 1f)
            SIGN_053 -> SignDrawable(R.drawable.a3_25, 1f, 1f)
            SIGN_054 -> SignDrawable(R.drawable.a8_6_5, 2f, 1f)
            SIGN_055 -> SignDrawable(R.drawable.a3_18_2, 1f, 1f)
            SIGN_056 -> SignDrawable(R.drawable.a3_2, 1f, 1f)
            SIGN_057 -> SignDrawable(R.drawable.a3_3, 1f, 1f)
            SIGN_058 -> SignDrawable(R.drawable.a3_1, 1f, 1f)
            SIGN_059 -> SignDrawable(R.drawable.a8_21_2, 2f, 1f)
            SIGN_060 -> SignDrawable(R.drawable.h1_20, 4f, 1f)
            SIGN_061 -> SignDrawable(R.drawable.op_3, 1f, 1f)
            SIGN_062 -> SignDrawable(R.drawable.a7_14, 1f, 1.8f)
            SIGN_063 -> SignDrawable(R.drawable.a8_1_2, 1f, 1f)
            SIGN_064 -> SignDrawable(R.drawable.h1_4, 4f, 1f)
            SIGN_065 -> SignDrawable(R.drawable.a5_31, 1f, 1.5f)
            SIGN_066 -> SignDrawable(R.drawable.a5_27, 1f, 1.5f)
            SIGN_067 -> SignDrawable(R.drawable.a5_32, 1f, 1.5f)
            SIGN_068 -> SignDrawable(R.drawable.a5_28, 1f, 1.5f)
            SIGN_069 -> SignDrawable(R.drawable.h1_7, 4f, 1f)
            SIGN_070 -> SignDrawable(R.drawable.dop8_8, 1f, 1f)
            SIGN_071 -> SignDrawable(R.drawable.a5_13_1, 1f, 1f)
            SIGN_072 -> SignDrawable(R.drawable.a3_19, 1f, 1f)
            SIGN_073 -> SignDrawable(R.drawable.a6_3_1, 1f, 1f)
            SIGN_074 -> SignDrawable(R.drawable.a6_8_2, 1f, 1f)
            SIGN_075 -> SignDrawable(R.drawable.h1_5, 4f, 1f)
            SIGN_076 -> SignDrawable(R.drawable.a4_1_1, 1f, 1f)
            SIGN_077 -> SignDrawable(R.drawable.a1_22, 1f, 1f)
            SIGN_078 -> SignDrawable(R.drawable.a5_19_1, 1f, 1f)
            SIGN_079 -> SignDrawable(R.drawable.a5_19_2, 1f, 1f)
            SIGN_080 -> SignDrawable(R.drawable.a8_1_1, 2f, 1f)
            SIGN_081 -> SignDrawable(R.drawable.a4_3, 1f, 1f)
            SIGN_082 -> SignDrawable(R.drawable.a3_18_1, 1f, 1f)
            SIGN_083 -> SignDrawable(R.drawable.a4_8_2, 1f, 1.8f)
            SIGN_084 -> SignDrawable(R.drawable.a5_10, 1f, 1f)
            SIGN_085 -> SignDrawable(R.drawable.a1_18, 1f, 1f)
            SIGN_086 -> SignDrawable(R.drawable.a1_15, 1f, 1f)
            SIGN_087 -> SignDrawable(R.drawable.a8_2_2, 1f, 2.2f)
            SIGN_088 -> SignDrawable(R.drawable.a6_15_2, 4f, 1f)
            SIGN_089 -> SignDrawable(R.drawable.v2_1_1, 2f, 1f)
            SIGN_090 -> SignDrawable(R.drawable.v2_1_3, 2f, 1f)
            SIGN_091 -> SignDrawable(R.drawable.a5_6, 1f, 1f)
            SIGN_092 -> SignDrawable(R.drawable.a1_21, 1f, 1f)
            SIGN_093 -> SignDrawable(R.drawable.a1_2, 1f, 1f)
            SIGN_094 -> SignDrawable(R.drawable.a1_4_1, 1f, 1.8f)
            SIGN_095 -> SignDrawable(R.drawable.a6_20_1, 1f, 1f)
            SIGN_096 -> SignDrawable(R.drawable.h1_19, 4f, 1f)
            SIGN_097 -> SignDrawable(R.drawable.a5_15_6, 1f, 1f)
            SIGN_098 -> SignDrawable(R.drawable.h1_14_1, 1f, 1.8f)
            SIGN_099 -> SignDrawable(R.drawable.a5_13_2, 1f, 1f)
            SIGN_100 -> SignDrawable(R.drawable.a8_5_1, 2f, 1f)
            SIGN_101 -> SignDrawable(R.drawable.dop8_7, 2f, 1f)
            SIGN_102 -> SignDrawable(R.drawable.a1_6, 1f, 1f)
            SIGN_103 -> SignDrawable(R.drawable.a5_25, 4f, 1f)
            SIGN_104 -> SignDrawable(R.drawable.h1_23_1, 4f, 1f)
            SIGN_105 -> SignDrawable(R.drawable.a5_3, 1f, 1.8f)
            SIGN_106 -> SignDrawable(R.drawable.a6_2, 1f, 1f)
            SIGN_107 -> SignDrawable(R.drawable.a3_5, 1f, 1f)
            SIGN_108 -> SignDrawable(R.drawable.a3_9, 1f, 1f)
            SIGN_109 -> SignDrawable(R.drawable.a843, 2f, 1f)
            SIGN_110 -> SignDrawable(R.drawable.a862, 2f, 1f)
            SIGN_111 -> SignDrawable(R.drawable.a869, 2f, 1f)
            SIGN_112 -> SignDrawable(R.drawable.a525, 4f, 1f)
            SIGN_113 -> SignDrawable(R.drawable.a1_25, 1f, 1f)
            SIGN_114 -> SignDrawable(R.drawable.a8_12, 2f, 1f)
            SIGN_115 -> SignDrawable(R.drawable.a5_15_2, 1.8f, 1f)
            SIGN_116 -> SignDrawable(R.drawable.h1_2, 4f, 1f)
            SIGN_117 -> SignDrawable(R.drawable.a5_7_2, 4f, 1f)
            SIGN_118 -> SignDrawable(R.drawable.a3_17_2, 1f, 1f)
            SIGN_119 -> SignDrawable(R.drawable.a5_26, 4f, 1f)
            SIGN_120 -> SignDrawable(R.drawable.a1_16, 1f, 1f)
            SIGN_121 -> SignDrawable(R.drawable.a3_30, 1f, 1f)
            SIGN_122 -> SignDrawable(R.drawable.a5_23_1, 4f, 1f)
            SIGN_123 -> SignDrawable(R.drawable.a5_23_2, 4f, 1f)
            SIGN_124 -> SignDrawable(R.drawable.a5_7_1, 4f, 1f)
            SIGN_125 -> SignDrawable(R.drawable.a8_6_1, 2f, 1f)
            SIGN_126 -> SignDrawable(R.drawable.a3_17_1, 1f, 1f)
            SIGN_127 -> SignDrawable(R.drawable.a3_17_3, 1f, 1f)
            SIGN_128 -> SignDrawable(R.drawable.a7_12, 1f, 1.8f)
            SIGN_129 -> SignDrawable(R.drawable.a3_21, 1f, 1f)
            SIGN_130 -> SignDrawable(R.drawable.a8_6_3, 2f, 1f)
            SIGN_131 -> SignDrawable(R.drawable.a3_7, 1f, 1f)
            SIGN_132 -> SignDrawable(R.drawable.a5_8, 1f, 1f)
            SIGN_133 -> SignDrawable(R.drawable.a5_11, 1f, 1f)
            SIGN_134 -> SignDrawable(R.drawable.v2_7, 2f, 1f)
            SIGN_135 -> SignDrawable(R.drawable.a3_26, 1f, 1f)
            SIGN_136 -> SignDrawable(R.drawable.a1_29, 1f, 1f)
            SIGN_137 -> SignDrawable(R.drawable.a1_33, 1f, 1f)
            SIGN_138 -> SignDrawable(R.drawable.a1_8, 1f, 1f)
            SIGN_139 -> SignDrawable(R.drawable.a3_11, 1f, 1f)
            SIGN_140 -> SignDrawable(R.drawable.a3_16, 1f, 1f)
            SIGN_141 -> SignDrawable(R.drawable.a4_1_6, 1f, 1f)
            SIGN_142 -> SignDrawable(R.drawable.a1_5, 1f, 1f)
            SIGN_143 -> SignDrawable(R.drawable.h1_10, 4f, 1f)
            SIGN_144 -> SignDrawable(R.drawable.a8_2_3, 1f, 2.3f)
            SIGN_145 -> SignDrawable(R.drawable.h1_25, 4f, 1f)
            SIGN_146 -> SignDrawable(R.drawable.a3_20, 1f, 1f)
            SIGN_147 -> SignDrawable(R.drawable.a3_31, 1f, 1f)
            SIGN_148 -> SignDrawable(R.drawable.a3_23, 1f, 1f)
            SIGN_149 -> SignDrawable(R.drawable.a2_2, 1f, 1f)
            SIGN_150 -> SignDrawable(R.drawable.a1_20_2, 1f, 1f)
            SIGN_151 -> SignDrawable(R.drawable.a1_3_2, 1f, 1.2f)
            SIGN_152 -> SignDrawable(R.drawable.v2_6, 2f, 1f)
            SIGN_153 -> SignDrawable(R.drawable.a5_33_1, 1f, 1.5f)
            SIGN_154 -> SignDrawable(R.drawable.a5_34_1, 1f, 1.5f)
            SIGN_155 -> SignDrawable(R.drawable.a2_3_2, 1f, 1f)
            SIGN_156 -> SignDrawable(R.drawable.a2_3_3, 1f, 1f)
            SIGN_157 -> SignDrawable(R.drawable.a2_3_4, 1f, 1f)
            SIGN_158 -> SignDrawable(R.drawable.a2_3_5, 1f, 1f)
            SIGN_159 -> SignDrawable(R.drawable.a2_3_6, 1f, 1f)
            SIGN_160 -> SignDrawable(R.drawable.a2_3_7, 1f, 1f)
            SIGN_161 -> SignDrawable(R.drawable.doroga, 4f, 1f)
            SIGN_162 -> SignDrawable(R.drawable.a5_24_1, 4f, 1f)
            SIGN_163 -> SignDrawable(R.drawable.a4_5_1, 1f, 1f)
            SIGN_164 -> SignDrawable(R.drawable.a5_34, 1f, 1.5f)
            SIGN_165 -> SignDrawable(R.drawable.a4_5_2, 1f, 1f)
            SIGN_166 -> SignDrawable(R.drawable.a4_5_3, 1f, 1f)
            SIGN_167 -> SignDrawable(R.drawable.a4_5_4, 1f, 1f)
            SIGN_168 -> SignDrawable(R.drawable.a4_5_5, 1f, 1f)
            SIGN_169 -> SignDrawable(R.drawable.a4_5_6, 1f, 1f)
            SIGN_170 -> SignDrawable(R.drawable.a4_5_7, 1f, 1f)
            SIGN_171 -> SignDrawable(R.drawable.h1_14_2, 1f, 1.8f)
            SIGN_172 -> SignDrawable(R.drawable.a5_14_2, 1f, 1f)
            SIGN_173 -> SignDrawable(R.drawable.a7_14_1, 1f, 1.5f)
            SIGN_174 -> SignDrawable(R.drawable.a3_12, 1f, 1f)
            SIGN_175 -> SignDrawable(R.drawable.a3_13, 1f, 1f)
            SIGN_176 -> SignDrawable(R.drawable.a3_14, 1f, 1f)
            SIGN_177 -> SignDrawable(R.drawable.svet_strelka, 3f, 1f)
            SIGN_178 -> SignDrawable(R.drawable.svet_vel, 3f, 1f)
            SIGN_179 -> SignDrawable(R.drawable.svet_revers, 4.5f, 1f)
            SIGN_180 -> SignDrawable(R.drawable.tram, 2.5f, 1f)
            SIGN_181 -> SignDrawable(R.drawable.regul1, 2f, 1f)
            SIGN_182 -> SignDrawable(R.drawable.regul2, 2f, 1f)
            SIGN_183 -> SignDrawable(R.drawable.regul3, 2f, 1f)
            SIGN_184 -> SignDrawable(R.drawable.perevozka_detey, 1f, 1f)
            SIGN_185 -> SignDrawable(R.drawable.avar, 5f, 1f)
            SIGN_186 -> SignDrawable(R.drawable.pov_left, 2f, 1f)
            SIGN_187 -> SignDrawable(R.drawable.pov_right, 2f, 1f)
            SIGN_188 -> SignDrawable(R.drawable.tormoz, 2f, 1f)
            SIGN_189 -> SignDrawable(R.drawable.a5_15_7, 1.7f, 1f)
            SIGN_190 -> SignDrawable(R.drawable.a5_15_8, 2f, 1f)
            SIGN_191 -> SignDrawable(R.drawable.h1_1, 4f, 1f)
            SIGN_192 -> SignDrawable(R.drawable.speed_stop, 1.7f, 1f)
            SIGN_193 -> SignDrawable(R.drawable.a8_6_2, 2f, 1f)
            SIGN_194 -> SignDrawable(R.drawable.a8_4_7, 2f, 1f)
            SIGN_195 -> SignDrawable(R.drawable.a8_6_6, 2f, 1f)
            SIGN_196 -> SignDrawable(R.drawable.a8_6_7, 2f, 1f)
            SIGN_197 -> SignDrawable(R.drawable.a8_6_8, 2f, 1f)
            SIGN_198 -> SignDrawable(R.drawable.a5_22, 1f, 1.5f)
            SIGN_199 -> SignDrawable(R.drawable.a4_1_3, 1f, 1f)
            SIGN_200 -> SignDrawable(R.drawable.a4_1_5, 1f, 1f)
            SIGN_201 -> SignDrawable(R.drawable.op_1, 2f, 1f)
            SIGN_202 -> SignDrawable(R.drawable.ucheb, 1.8f, 1f)
            SIGN_203 -> SignDrawable(R.drawable.gab, 2f, 1f)
            SIGN_204 -> SignDrawable(R.drawable.a1_17, 1f, 1f)
            SIGN_205 -> SignDrawable(R.drawable.a5_20, 1f, 1f)
            SIGN_206 -> SignDrawable(R.drawable.a5_16, 1f, 1.5f)
            SIGN_207 -> SignDrawable(R.drawable.a5_18, 1f, 1.5f)
            SIGN_208 -> SignDrawable(R.drawable.h1_24_2, 1f, 1f)
            SIGN_209 -> SignDrawable(R.drawable.a6_14_1, 2f, 1f)
            SIGN_210 -> SignDrawable(R.drawable.a6_13, 1.5f, 1f)
            SIGN_211 -> SignDrawable(R.drawable.h1_23_3, 1.2f, 1f)
            SIGN_212 -> SignDrawable(R.drawable.a3_22, 1f, 1f)
            SIGN_213 -> SignDrawable(R.drawable.v2_2, 2f, 1f)
            SIGN_214 -> SignDrawable(R.drawable.h1_22, 4f, 1f)
            SIGN_215 -> SignDrawable(R.drawable.a8_5_2, 2f, 1f)
            SIGN_216 -> SignDrawable(R.drawable.a6_19_1, 1f, 1.4f)
            SIGN_217 -> SignDrawable(R.drawable.h1_6, 4f, 1f)
            SIGN_218 -> SignDrawable(R.drawable.a1_34_3, 3f, 1f)
            SIGN_219 -> SignDrawable(R.drawable.a6_3_2, 1f, 1f)
            SIGN_220 -> SignDrawable(R.drawable.a8_18, 2f, 1f)
            SIGN_221 -> SignDrawable(R.drawable.a7_10, 1f, 1.8f)
            SIGN_222 -> SignDrawable(R.drawable.a7_9, 1f, 1.8f)
            SIGN_223 -> SignDrawable(R.drawable.a4_2_2, 1f, 1f)
            SIGN_224 -> SignDrawable(R.drawable.a1_28, 1f, 1f)
            SIGN_225 -> SignDrawable(R.drawable.a1_1, 1f, 1f)
            SIGN_226 -> SignDrawable(R.drawable.a1_4_3, 1f, 1.8f)
            SIGN_227 -> SignDrawable(R.drawable.op12, 1f, 1f)
            SIGN_228 -> SignDrawable(R.drawable.a1_31, 1f, 1f)
            SIGN_229 -> SignDrawable(R.drawable.a6_8_3, 1f, 1f)
            SIGN_230 -> SignDrawable(R.drawable.a5_11_2, 1f, 1f)

            else -> SignDrawable(R.drawable.ic_help, 1f, 1f)
        }
    }

    companion object {
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
        const val SIGN_109 = "XZВид транспортного средстваXZ"
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
    }
}


data class SignDrawable(
    val resId: Int,
    val width: Float,
    val height: Float
)
