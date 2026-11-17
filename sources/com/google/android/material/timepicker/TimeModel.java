package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    int f23491cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    int f23492esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    int f23493iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    final int f23494jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    int f23495lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final wkgbmnqykc f23496yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f23497zdlpuopuiu;

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i13) {
            return new TimeModel[i13];
        }
    }

    public TimeModel() {
        this(0);
    }

    private static int dxjokdxxww(int i13) {
        return i13 >= 12 ? 1 : 0;
    }

    public static String ppxfxbqfkf(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String zoijcleaow(Resources resources, CharSequence charSequence) {
        return ppxfxbqfkf(resources, charSequence, "%02d");
    }

    public void btonecajqb(int i13) {
        if (this.f23494jyumaefscl == 1) {
            this.f23493iwizpuwonk = i13;
        } else {
            this.f23493iwizpuwonk = (i13 % 12) + (this.f23495lereixgezr != 1 ? 0 : 12);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int eablkybsjg() {
        return this.f23494jyumaefscl == 1 ? da.btonecajqb.material_hour_24h_suffix : da.btonecajqb.material_hour_suffix;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f23493iwizpuwonk == timeModel.f23493iwizpuwonk && this.f23491cqumvgiudr == timeModel.f23491cqumvgiudr && this.f23494jyumaefscl == timeModel.f23494jyumaefscl && this.f23492esjtqupxsv == timeModel.f23492esjtqupxsv;
    }

    public void gtknphoqwx(int i13) {
        this.f23491cqumvgiudr = i13 % 60;
    }

    public int gxszxtbevo() {
        if (this.f23494jyumaefscl == 1) {
            return this.f23493iwizpuwonk % 24;
        }
        int i13 = this.f23493iwizpuwonk;
        if (i13 % 12 == 0) {
            return 12;
        }
        return this.f23495lereixgezr == 1 ? i13 - 12 : i13;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23494jyumaefscl), Integer.valueOf(this.f23493iwizpuwonk), Integer.valueOf(this.f23491cqumvgiudr), Integer.valueOf(this.f23492esjtqupxsv)});
    }

    public wkgbmnqykc lqeggnwhkg() {
        return this.f23496yggfygwlhe;
    }

    public wkgbmnqykc nufgyqmvbu() {
        return this.f23497zdlpuopuiu;
    }

    public void wflxmlrfwp(int i13) {
        if (i13 != this.f23495lereixgezr) {
            this.f23495lereixgezr = i13;
            int i14 = this.f23493iwizpuwonk;
            if (i14 < 12 && i13 == 1) {
                this.f23493iwizpuwonk = i14 + 12;
            } else {
                if (i14 < 12 || i13 != 0) {
                    return;
                }
                this.f23493iwizpuwonk = i14 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f23493iwizpuwonk);
        parcel.writeInt(this.f23491cqumvgiudr);
        parcel.writeInt(this.f23492esjtqupxsv);
        parcel.writeInt(this.f23494jyumaefscl);
    }

    public TimeModel(int i13) {
        this(0, 0, 10, i13);
    }

    public TimeModel(int i13, int i14, int i15, int i16) {
        this.f23493iwizpuwonk = i13;
        this.f23491cqumvgiudr = i14;
        this.f23492esjtqupxsv = i15;
        this.f23494jyumaefscl = i16;
        this.f23495lereixgezr = dxjokdxxww(i13);
        this.f23497zdlpuopuiu = new wkgbmnqykc(59);
        this.f23496yggfygwlhe = new wkgbmnqykc(i16 == 1 ? 23 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
