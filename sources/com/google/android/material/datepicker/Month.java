package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes2.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    final int f22634cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    final long f22635esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final int f22636iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    final int f22637jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private String f22638lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final int f22639yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Calendar f22640zdlpuopuiu;

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(Parcel parcel) {
            return Month.ppxfxbqfkf(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i13) {
            return new Month[i13];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarEablkybsjg = vdvldrhtss.eablkybsjg(calendar);
        this.f22640zdlpuopuiu = calendarEablkybsjg;
        this.f22639yggfygwlhe = calendarEablkybsjg.get(2);
        this.f22637jyumaefscl = calendarEablkybsjg.get(1);
        this.f22636iwizpuwonk = calendarEablkybsjg.getMaximum(7);
        this.f22634cqumvgiudr = calendarEablkybsjg.getActualMaximum(5);
        this.f22635esjtqupxsv = calendarEablkybsjg.getTimeInMillis();
    }

    static Month eablkybsjg(long j13) {
        Calendar calendarWflxmlrfwp = vdvldrhtss.wflxmlrfwp();
        calendarWflxmlrfwp.setTimeInMillis(j13);
        return new Month(calendarWflxmlrfwp);
    }

    static Month gxszxtbevo() {
        return new Month(vdvldrhtss.gtknphoqwx());
    }

    static Month ppxfxbqfkf(int i13, int i14) {
        Calendar calendarWflxmlrfwp = vdvldrhtss.wflxmlrfwp();
        calendarWflxmlrfwp.set(1, i13);
        calendarWflxmlrfwp.set(2, i14);
        return new Month(calendarWflxmlrfwp);
    }

    String btonecajqb() {
        if (this.f22638lereixgezr == null) {
            this.f22638lereixgezr = nufgyqmvbu.draadjrbmk(this.f22640zdlpuopuiu.getTimeInMillis());
        }
        return this.f22638lereixgezr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    int dxjokdxxww(long j13) {
        Calendar calendarEablkybsjg = vdvldrhtss.eablkybsjg(this.f22640zdlpuopuiu);
        calendarEablkybsjg.setTimeInMillis(j13);
        return calendarEablkybsjg.get(5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f22639yggfygwlhe == month.f22639yggfygwlhe && this.f22637jyumaefscl == month.f22637jyumaefscl;
    }

    long gtknphoqwx() {
        return this.f22640zdlpuopuiu.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f22639yggfygwlhe), Integer.valueOf(this.f22637jyumaefscl)});
    }

    int lqeggnwhkg(int i13) {
        int i14 = this.f22640zdlpuopuiu.get(7);
        if (i13 <= 0) {
            i13 = this.f22640zdlpuopuiu.getFirstDayOfWeek();
        }
        int i15 = i14 - i13;
        return i15 < 0 ? i15 + this.f22636iwizpuwonk : i15;
    }

    long nufgyqmvbu(int i13) {
        Calendar calendarEablkybsjg = vdvldrhtss.eablkybsjg(this.f22640zdlpuopuiu);
        calendarEablkybsjg.set(5, i13);
        return calendarEablkybsjg.getTimeInMillis();
    }

    int oxmwwwfdhm(Month month) {
        if (this.f22640zdlpuopuiu instanceof GregorianCalendar) {
            return ((month.f22637jyumaefscl - this.f22637jyumaefscl) * 12) + (month.f22639yggfygwlhe - this.f22639yggfygwlhe);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    Month wflxmlrfwp(int i13) {
        Calendar calendarEablkybsjg = vdvldrhtss.eablkybsjg(this.f22640zdlpuopuiu);
        calendarEablkybsjg.add(2, i13);
        return new Month(calendarEablkybsjg);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f22637jyumaefscl);
        parcel.writeInt(this.f22639yggfygwlhe);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.f22640zdlpuopuiu.compareTo(month.f22640zdlpuopuiu);
    }
}
