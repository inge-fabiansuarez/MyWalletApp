package com.fabiansuarez.mywallet.model.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Account")
data class Account(
    @PrimaryKey(autoGenerate = true)
    val idAccount: Int,
    val name: String,
    val numberCount: String,
    val color: String,
    val initialValue: Double,
    val typeCount: Int,
    val currency: Int,
    val currentValue: Double?
)

