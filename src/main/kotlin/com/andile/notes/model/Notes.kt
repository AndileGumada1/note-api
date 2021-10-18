package com.andile.notes.model

import javax.persistence.*

@Entity
data class Notes(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val text: String? = null,
    val user: String? = null
)
