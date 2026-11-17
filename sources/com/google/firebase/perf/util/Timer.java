package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f24688yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private long f24689zdlpuopuiu;

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel, (iobyxmoadg) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public Timer[] newArray(int i13) {
            return new Timer[i13];
        }
    }

    /* synthetic */ Timer(Parcel parcel, iobyxmoadg iobyxmoadgVar) {
        this(parcel);
    }

    private static long btonecajqb() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public static Timer nufgyqmvbu(long j13) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j13);
        return new Timer(btonecajqb() + (micros - zoijcleaow()), micros);
    }

    private static long zoijcleaow() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void dxjokdxxww() {
        this.f24689zdlpuopuiu = btonecajqb();
        this.f24688yggfygwlhe = zoijcleaow();
    }

    public long eablkybsjg() {
        return gxszxtbevo(new Timer());
    }

    public long gxszxtbevo(Timer timer) {
        return timer.f24688yggfygwlhe - this.f24688yggfygwlhe;
    }

    public long lqeggnwhkg() {
        return this.f24689zdlpuopuiu;
    }

    public long ppxfxbqfkf() {
        return this.f24689zdlpuopuiu + eablkybsjg();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeLong(this.f24689zdlpuopuiu);
        parcel.writeLong(this.f24688yggfygwlhe);
    }

    public Timer() {
        this(btonecajqb(), zoijcleaow());
    }

    Timer(long j13, long j14) {
        this.f24689zdlpuopuiu = j13;
        this.f24688yggfygwlhe = j14;
    }

    private Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
