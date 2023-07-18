package com.fabiansuarez.mywallet.model.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "spent_has_tag",
    primaryKeys = ["spent_idspent", "tag_idtag"],
    foreignKeys = [
        ForeignKey(
            entity = Spent::class,
            parentColumns = ["idspent"],
            childColumns = ["spent_idspent"],
            onDelete = ForeignKey.NO_ACTION,
            onUpdate = ForeignKey.NO_ACTION
        ),
        ForeignKey(
            entity = Tag::class,
            parentColumns = ["idtag"],
            childColumns = ["tag_idtag"],
            onDelete = ForeignKey.NO_ACTION,
            onUpdate = ForeignKey.NO_ACTION
        )
    ]
)
data class SpentHasTag(
    @ColumnInfo(name = "spent_idspent")
    val spent_idspent: Int,
    @ColumnInfo(name = "tag_idtag")
    val tag_idtag: Int
)