package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import nd.draadjrbmk;
import nd.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f24651jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Timer f24652yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f24653zdlpuopuiu;

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public PerfSession createFromParcel(Parcel parcel) {
            return new PerfSession(parcel, (iobyxmoadg) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public PerfSession[] newArray(int i13) {
            return new PerfSession[i13];
        }
    }

    /* synthetic */ PerfSession(Parcel parcel, iobyxmoadg iobyxmoadgVar) {
        this(parcel);
    }

    public static PerfSession eablkybsjg(String str) {
        PerfSession perfSession = new PerfSession(str.replace("-", ""), new md.iobyxmoadg());
        perfSession.gtknphoqwx(wflxmlrfwp());
        return perfSession;
    }

    public static gtknphoqwx[] ppxfxbqfkf(List list) {
        if (list.isEmpty()) {
            return null;
        }
        gtknphoqwx[] gtknphoqwxVarArr = new gtknphoqwx[list.size()];
        gtknphoqwx gtknphoqwxVarZoijcleaow = ((PerfSession) list.get(0)).zoijcleaow();
        boolean z13 = false;
        for (int i13 = 1; i13 < list.size(); i13++) {
            gtknphoqwx gtknphoqwxVarZoijcleaow2 = ((PerfSession) list.get(i13)).zoijcleaow();
            if (z13 || !((PerfSession) list.get(i13)).dxjokdxxww()) {
                gtknphoqwxVarArr[i13] = gtknphoqwxVarZoijcleaow2;
            } else {
                gtknphoqwxVarArr[0] = gtknphoqwxVarZoijcleaow2;
                gtknphoqwxVarArr[i13] = gtknphoqwxVarZoijcleaow;
                z13 = true;
            }
        }
        if (!z13) {
            gtknphoqwxVarArr[0] = gtknphoqwxVarZoijcleaow;
        }
        return gtknphoqwxVarArr;
    }

    public static boolean wflxmlrfwp() {
        com.google.firebase.perf.config.iobyxmoadg iobyxmoadgVarLqeggnwhkg = com.google.firebase.perf.config.iobyxmoadg.lqeggnwhkg();
        return iobyxmoadgVarLqeggnwhkg.hcddaimhww() && Math.random() < iobyxmoadgVarLqeggnwhkg.cdpycssgdh();
    }

    public String btonecajqb() {
        return this.f24653zdlpuopuiu;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean dxjokdxxww() {
        return this.f24651jyumaefscl;
    }

    public void gtknphoqwx(boolean z13) {
        this.f24651jyumaefscl = z13;
    }

    public Timer gxszxtbevo() {
        return this.f24652yggfygwlhe;
    }

    public boolean lqeggnwhkg() {
        return this.f24651jyumaefscl;
    }

    public boolean nufgyqmvbu() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f24652yggfygwlhe.eablkybsjg()) > com.google.firebase.perf.config.iobyxmoadg.lqeggnwhkg().pmvmpeiblj();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f24653zdlpuopuiu);
        parcel.writeByte(this.f24651jyumaefscl ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f24652yggfygwlhe, 0);
    }

    public gtknphoqwx zoijcleaow() {
        gtknphoqwx.ppxfxbqfkf ppxfxbqfkfVarNufgyqmvbu = gtknphoqwx.agtfadlqog().nufgyqmvbu(this.f24653zdlpuopuiu);
        if (this.f24651jyumaefscl) {
            ppxfxbqfkfVarNufgyqmvbu.lqeggnwhkg(draadjrbmk.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (gtknphoqwx) ppxfxbqfkfVarNufgyqmvbu.build();
    }

    public PerfSession(String str, md.iobyxmoadg iobyxmoadgVar) {
        this.f24651jyumaefscl = false;
        this.f24653zdlpuopuiu = str;
        this.f24652yggfygwlhe = iobyxmoadgVar.iobyxmoadg();
    }

    private PerfSession(Parcel parcel) {
        this.f24651jyumaefscl = false;
        this.f24653zdlpuopuiu = parcel.readString();
        this.f24651jyumaefscl = parcel.readByte() != 0;
        this.f24652yggfygwlhe = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
