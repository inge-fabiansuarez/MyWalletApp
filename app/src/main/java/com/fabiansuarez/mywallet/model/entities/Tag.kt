package com.fabiansuarez.mywallet.model.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tag")
data class Tag(
    @PrimaryKey(autoGenerate = true)
    val idtag: Int,
    val name: String
)
