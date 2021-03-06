package com.liambeckman.removemywaste.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.time.LocalTime;

@Entity(tableName = "centers_materials", primaryKeys = {"cid", "mid"}, foreignKeys = {@ForeignKey(entity = Centers.class,
        parentColumns = "id",
        childColumns = "cid"),
        @ForeignKey(entity = Materials.class,
        parentColumns = "id",
        childColumns = "mid")}
        )
public class CentersMaterials {
    @NonNull
    @ColumnInfo(name = "cid")
    public int cid;
    @NonNull
    @ColumnInfo(name = "mid")
    public int mid;
}

