package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long f22546zdlpuopuiu;

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointBackward createFromParcel(Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointBackward[] newArray(int i13) {
            return new DateValidatorPointBackward[i13];
        }
    }

    /* synthetic */ DateValidatorPointBackward(long j13, iobyxmoadg iobyxmoadgVar) {
        this(j13);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointBackward) && this.f22546zdlpuopuiu == ((DateValidatorPointBackward) obj).f22546zdlpuopuiu;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f22546zdlpuopuiu)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean nuxfzjnpeb(long j13) {
        return j13 <= this.f22546zdlpuopuiu;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeLong(this.f22546zdlpuopuiu);
    }

    private DateValidatorPointBackward(long j13) {
        this.f22546zdlpuopuiu = j13;
    }
}
