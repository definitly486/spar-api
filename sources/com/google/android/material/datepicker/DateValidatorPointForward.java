package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long f22547zdlpuopuiu;

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward[] newArray(int i13) {
            return new DateValidatorPointForward[i13];
        }
    }

    /* synthetic */ DateValidatorPointForward(long j13, iobyxmoadg iobyxmoadgVar) {
        this(j13);
    }

    public static DateValidatorPointForward zoijcleaow(long j13) {
        return new DateValidatorPointForward(j13);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f22547zdlpuopuiu == ((DateValidatorPointForward) obj).f22547zdlpuopuiu;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f22547zdlpuopuiu)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean nuxfzjnpeb(long j13) {
        return j13 >= this.f22547zdlpuopuiu;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeLong(this.f22547zdlpuopuiu);
    }

    private DateValidatorPointForward(long j13) {
        this.f22547zdlpuopuiu = j13;
    }
}
