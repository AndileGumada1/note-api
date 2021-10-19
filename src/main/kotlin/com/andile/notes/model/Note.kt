package com.andile.notes.model

import javax.persistence.*

@Entity
data class Note(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val text: String? = null,
    var user: String? = null
)
