package com.simpleapps.pddlibrary

import androidx.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class PDDDto(
    @SerialName("title") val title: String? = null,
    @SerialName("num") val num: String? = null,
    @SerialName("subsection") val subsection: List<SubsectionDto>? = null
)

@Keep
@Serializable
data class SubsectionDto(
    @SerialName("num") val num: String? = null,
    @SerialName("text") val text: String? = null,
    @SerialName("img") val img: String? = null,
    @SerialName("defs") val defs: List<DefinitionDto>? = null
)

@Keep
@Serializable
data class DefinitionDto(
    @SerialName("name") val name: String? = null,
    @SerialName("des") val des: String? = null,
    @SerialName("img") val img: String? = null
)