package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final AtomicLong f24620yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f24621zdlpuopuiu;

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public Counter[] newArray(int i13) {
            return new Counter[i13];
        }
    }

    /* synthetic */ Counter(Parcel parcel, iobyxmoadg iobyxmoadgVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    void eablkybsjg(long j13) {
        this.f24620yggfygwlhe.set(j13);
    }

    String getName() {
        return this.f24621zdlpuopuiu;
    }

    public void ppxfxbqfkf(long j13) {
        this.f24620yggfygwlhe.addAndGet(j13);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f24621zdlpuopuiu);
        parcel.writeLong(this.f24620yggfygwlhe.get());
    }

    long zoijcleaow() {
        return this.f24620yggfygwlhe.get();
    }

    public Counter(String str) {
        this.f24621zdlpuopuiu = str;
        this.f24620yggfygwlhe = new AtomicLong(0L);
    }

    private Counter(Parcel parcel) {
        this.f24621zdlpuopuiu = parcel.readString();
        this.f24620yggfygwlhe = new AtomicLong(parcel.readLong());
    }
}
