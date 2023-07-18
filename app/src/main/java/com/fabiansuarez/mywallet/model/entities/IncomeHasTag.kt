package com.fabiansuarez.mywallet.model.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(tableName = "income_has_tag",
    primaryKeys = ["income_idincome", "tag_idtag"],
    foreignKeys = [
        ForeignKey(
            entity = Income::class,
            parentColumns = ["idincome"],
            childColumns = ["income_idincome"],
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
data class IncomeHasTag(
    @ColumnInfo(name = "income_idincome")
    val income_idincome: Int,
    @ColumnInfo(name = "tag_idtag")
    val tag_idtag: Int
)