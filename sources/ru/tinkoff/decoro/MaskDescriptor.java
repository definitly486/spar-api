package ru.tinkoff.decoro;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Arrays;
import ru.tinkoff.decoro.slots.Slot;

/* JADX INFO: loaded from: classes6.dex */
public class MaskDescriptor implements Serializable, Parcelable {
    public static final Parcelable.Creator<MaskDescriptor> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f104829cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f104830esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f104831iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private String f104832jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private String f104833yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Slot[] f104834zdlpuopuiu;

    static class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public MaskDescriptor createFromParcel(Parcel parcel) {
            return new MaskDescriptor(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public MaskDescriptor[] newArray(int i13) {
            return new MaskDescriptor[i13];
        }
    }

    protected MaskDescriptor(Parcel parcel) {
        this.f104831iwizpuwonk = true;
        this.f104829cqumvgiudr = false;
        this.f104830esjtqupxsv = false;
        this.f104834zdlpuopuiu = (Slot[]) parcel.createTypedArray(Slot.CREATOR);
        this.f104833yggfygwlhe = parcel.readString();
        this.f104832jyumaefscl = parcel.readString();
        this.f104831iwizpuwonk = parcel.readByte() != 0;
        this.f104829cqumvgiudr = parcel.readByte() != 0;
        this.f104830esjtqupxsv = parcel.readByte() != 0;
    }

    private String lqeggnwhkg() {
        StringBuilder sb3 = new StringBuilder(this.f104834zdlpuopuiu.length);
        for (Slot slot : this.f104834zdlpuopuiu) {
            char cLmojexxdyd = slot.lmojexxdyd();
            if (cLmojexxdyd == null) {
                cLmojexxdyd = '_';
            }
            sb3.append(cLmojexxdyd);
        }
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MaskDescriptor maskDescriptor = (MaskDescriptor) obj;
        if (this.f104831iwizpuwonk != maskDescriptor.f104831iwizpuwonk || this.f104829cqumvgiudr != maskDescriptor.f104829cqumvgiudr || this.f104830esjtqupxsv != maskDescriptor.f104830esjtqupxsv || !Arrays.equals(this.f104834zdlpuopuiu, maskDescriptor.f104834zdlpuopuiu)) {
            return false;
        }
        String str = this.f104833yggfygwlhe;
        if (str == null ? maskDescriptor.f104833yggfygwlhe != null : !str.equals(maskDescriptor.f104833yggfygwlhe)) {
            return false;
        }
        String str2 = this.f104832jyumaefscl;
        String str3 = maskDescriptor.f104832jyumaefscl;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f104834zdlpuopuiu) * 31;
        String str = this.f104833yggfygwlhe;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f104832jyumaefscl;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f104831iwizpuwonk ? 1 : 0)) * 31) + (this.f104829cqumvgiudr ? 1 : 0)) * 31) + (this.f104830esjtqupxsv ? 1 : 0);
    }

    public String toString() {
        if (!zoijcleaow.iobyxmoadg(this.f104833yggfygwlhe)) {
            return this.f104833yggfygwlhe;
        }
        Slot[] slotArr = this.f104834zdlpuopuiu;
        return (slotArr == null || slotArr.length <= 0) ? "(empty)" : lqeggnwhkg();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeTypedArray(this.f104834zdlpuopuiu, i13);
        parcel.writeString(this.f104833yggfygwlhe);
        parcel.writeString(this.f104832jyumaefscl);
        parcel.writeByte(this.f104831iwizpuwonk ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f104829cqumvgiudr ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f104830esjtqupxsv ? (byte) 1 : (byte) 0);
    }
}
