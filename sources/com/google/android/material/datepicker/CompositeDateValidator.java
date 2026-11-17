package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f22544yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f22545zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final wkgbmnqykc f22543jyumaefscl = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final wkgbmnqykc f22542iwizpuwonk = new zoijcleaow();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new ppxfxbqfkf();

    class iobyxmoadg implements wkgbmnqykc {
        iobyxmoadg() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.wkgbmnqykc
        public int getId() {
            return 1;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.wkgbmnqykc
        public boolean iobyxmoadg(List list, long j13) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && dateValidator.nuxfzjnpeb(j13)) {
                    return true;
                }
            }
            return false;
        }
    }

    class ppxfxbqfkf implements Parcelable.Creator {
        ppxfxbqfkf() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator createFromParcel(Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i13 = parcel.readInt();
            wkgbmnqykc wkgbmnqykcVar = (i13 != 2 && i13 == 1) ? CompositeDateValidator.f22543jyumaefscl : CompositeDateValidator.f22542iwizpuwonk;
            return new CompositeDateValidator((List) u1.nufgyqmvbu.gxszxtbevo(arrayList), wkgbmnqykcVar, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator[] newArray(int i13) {
            return new CompositeDateValidator[i13];
        }
    }

    private interface wkgbmnqykc {
        int getId();

        boolean iobyxmoadg(List list, long j13);
    }

    class zoijcleaow implements wkgbmnqykc {
        zoijcleaow() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.wkgbmnqykc
        public int getId() {
            return 2;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.wkgbmnqykc
        public boolean iobyxmoadg(List list, long j13) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && !dateValidator.nuxfzjnpeb(j13)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* synthetic */ CompositeDateValidator(List list, wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) {
        this(list, wkgbmnqykcVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f22544yggfygwlhe.equals(compositeDateValidator.f22544yggfygwlhe) && this.f22545zdlpuopuiu.getId() == compositeDateValidator.f22545zdlpuopuiu.getId();
    }

    public int hashCode() {
        return this.f22544yggfygwlhe.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean nuxfzjnpeb(long j13) {
        return this.f22545zdlpuopuiu.iobyxmoadg(this.f22544yggfygwlhe, j13);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeList(this.f22544yggfygwlhe);
        parcel.writeInt(this.f22545zdlpuopuiu.getId());
    }

    private CompositeDateValidator(List list, wkgbmnqykc wkgbmnqykcVar) {
        this.f22544yggfygwlhe = list;
        this.f22545zdlpuopuiu = wkgbmnqykcVar;
    }
}
