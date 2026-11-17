package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final int f22528cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final int f22529esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Month f22530iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final DateValidator f22531jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final int f22532lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Month f22533yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Month f22534zdlpuopuiu;

    public interface DateValidator extends Parcelable {
        boolean nuxfzjnpeb(long j13);
    }

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i13) {
            return new CalendarConstraints[i13];
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        static final long f22535gxszxtbevo = vdvldrhtss.iobyxmoadg(Month.ppxfxbqfkf(1900, 0).f22635esjtqupxsv);

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        static final long f22536lqeggnwhkg = vdvldrhtss.iobyxmoadg(Month.ppxfxbqfkf(2100, 11).f22635esjtqupxsv);

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private DateValidator f22537eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private long f22538iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Long f22539ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f22540wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private long f22541zoijcleaow;

        zoijcleaow(CalendarConstraints calendarConstraints) {
            this.f22538iobyxmoadg = f22535gxszxtbevo;
            this.f22541zoijcleaow = f22536lqeggnwhkg;
            this.f22537eablkybsjg = DateValidatorPointForward.zoijcleaow(Long.MIN_VALUE);
            this.f22538iobyxmoadg = calendarConstraints.f22534zdlpuopuiu.f22635esjtqupxsv;
            this.f22541zoijcleaow = calendarConstraints.f22533yggfygwlhe.f22635esjtqupxsv;
            this.f22539ppxfxbqfkf = Long.valueOf(calendarConstraints.f22530iwizpuwonk.f22635esjtqupxsv);
            this.f22540wkgbmnqykc = calendarConstraints.f22528cqumvgiudr;
            this.f22537eablkybsjg = calendarConstraints.f22531jyumaefscl;
        }

        public CalendarConstraints iobyxmoadg() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f22537eablkybsjg);
            Month monthEablkybsjg = Month.eablkybsjg(this.f22538iobyxmoadg);
            Month monthEablkybsjg2 = Month.eablkybsjg(this.f22541zoijcleaow);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l13 = this.f22539ppxfxbqfkf;
            return new CalendarConstraints(monthEablkybsjg, monthEablkybsjg2, dateValidator, l13 == null ? null : Month.eablkybsjg(l13.longValue()), this.f22540wkgbmnqykc, null);
        }

        public zoijcleaow zoijcleaow(long j13) {
            this.f22539ppxfxbqfkf = Long.valueOf(j13);
            return this;
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i13, iobyxmoadg iobyxmoadgVar) {
        this(month, month2, dateValidator, month3, i13);
    }

    Month btonecajqb() {
        return this.f22533yggfygwlhe;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DateValidator dxjokdxxww() {
        return this.f22531jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f22534zdlpuopuiu.equals(calendarConstraints.f22534zdlpuopuiu) && this.f22533yggfygwlhe.equals(calendarConstraints.f22533yggfygwlhe) && u1.zoijcleaow.iobyxmoadg(this.f22530iwizpuwonk, calendarConstraints.f22530iwizpuwonk) && this.f22528cqumvgiudr == calendarConstraints.f22528cqumvgiudr && this.f22531jyumaefscl.equals(calendarConstraints.f22531jyumaefscl);
    }

    boolean esjtqupxsv(long j13) {
        if (this.f22534zdlpuopuiu.nufgyqmvbu(1) <= j13) {
            Month month = this.f22533yggfygwlhe;
            if (j13 <= month.nufgyqmvbu(month.f22634cqumvgiudr)) {
                return true;
            }
        }
        return false;
    }

    int gtknphoqwx() {
        return this.f22528cqumvgiudr;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22534zdlpuopuiu, this.f22533yggfygwlhe, this.f22530iwizpuwonk, Integer.valueOf(this.f22528cqumvgiudr), this.f22531jyumaefscl});
    }

    int iwizpuwonk() {
        return this.f22529esjtqupxsv;
    }

    Month nufgyqmvbu(Month month) {
        if (month.compareTo(this.f22534zdlpuopuiu) < 0) {
            return this.f22534zdlpuopuiu;
        }
        return month.compareTo(this.f22533yggfygwlhe) > 0 ? this.f22533yggfygwlhe : month;
    }

    Month oxmwwwfdhm() {
        return this.f22530iwizpuwonk;
    }

    int wflxmlrfwp() {
        return this.f22532lereixgezr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeParcelable(this.f22534zdlpuopuiu, 0);
        parcel.writeParcelable(this.f22533yggfygwlhe, 0);
        parcel.writeParcelable(this.f22530iwizpuwonk, 0);
        parcel.writeParcelable(this.f22531jyumaefscl, 0);
        parcel.writeInt(this.f22528cqumvgiudr);
    }

    Month yggfygwlhe() {
        return this.f22534zdlpuopuiu;
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i13) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f22534zdlpuopuiu = month;
        this.f22533yggfygwlhe = month2;
        this.f22530iwizpuwonk = month3;
        this.f22528cqumvgiudr = i13;
        this.f22531jyumaefscl = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i13 < 0 || i13 > vdvldrhtss.wflxmlrfwp().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f22532lereixgezr = month.oxmwwwfdhm(month2) + 1;
        this.f22529esjtqupxsv = (month2.f22637jyumaefscl - month.f22637jyumaefscl) + 1;
    }
}
