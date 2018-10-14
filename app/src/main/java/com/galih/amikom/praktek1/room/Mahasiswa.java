package com.galih.amikom.praktek1.room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Mahasiswa {

    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "NamaLengkap")
    String NamaLengkap;
    @ColumnInfo(name = "NIM")
    String NIM;
    @ColumnInfo(name = "Jurusan")
    String Jurusan;
    @ColumnInfo(name = "AlamatLengkap")
    String AlamatLengkap;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaLengkap() {
        return NamaLengkap;
    }

    public void setNamaLengkap(String namalengkap) {
        this.NamaLengkap = namalengkap;
    }

    public String getNim() {
        return NIM;
    }

    public void setNIM(String nim) {
        this.NIM = nim;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    public String getAlamatLengkap() {
        return AlamatLengkap;
    }

    public void setAlamatLengkap(String alamatlengkap) {
        this.AlamatLengkap = alamatlengkap;
    }
}
