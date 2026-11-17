package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final int f9645jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final int f9646yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final int f9647zdlpuopuiu;
    public static final Parcelable.Creator<StreamKey> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final String f9644iwizpuwonk = stevsuqkhv.uawqvzlxes(0);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final String f9642cqumvgiudr = stevsuqkhv.uawqvzlxes(1);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final String f9643esjtqupxsv = stevsuqkhv.uawqvzlxes(2);

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public StreamKey[] newArray(int i13) {
            return new StreamKey[i13];
        }
    }

    StreamKey(Parcel parcel) {
        this.f9647zdlpuopuiu = parcel.readInt();
        this.f9646yggfygwlhe = parcel.readInt();
        this.f9645jyumaefscl = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f9647zdlpuopuiu == streamKey.f9647zdlpuopuiu && this.f9646yggfygwlhe == streamKey.f9646yggfygwlhe && this.f9645jyumaefscl == streamKey.f9645jyumaefscl;
    }

    public int hashCode() {
        return (((this.f9647zdlpuopuiu * 31) + this.f9646yggfygwlhe) * 31) + this.f9645jyumaefscl;
    }

    public String toString() {
        return this.f9647zdlpuopuiu + "." + this.f9646yggfygwlhe + "." + this.f9645jyumaefscl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f9647zdlpuopuiu);
        parcel.writeInt(this.f9646yggfygwlhe);
        parcel.writeInt(this.f9645jyumaefscl);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i13 = this.f9647zdlpuopuiu - streamKey.f9647zdlpuopuiu;
        if (i13 != 0) {
            return i13;
        }
        int i14 = this.f9646yggfygwlhe - streamKey.f9646yggfygwlhe;
        return i14 == 0 ? this.f9645jyumaefscl - streamKey.f9645jyumaefscl : i14;
    }
}
