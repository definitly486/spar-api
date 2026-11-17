package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import v2.iwizpuwonk;
import v2.nufgyqmvbu;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final int f9619iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final String f9620jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f9621yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final SchemeData[] f9622zdlpuopuiu;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        public final byte[] f9623cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public final String f9624iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public final String f9625jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public final UUID f9626yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f9627zdlpuopuiu;

        class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SchemeData[] newArray(int i13) {
                return new SchemeData[i13];
            }
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return Objects.equals(this.f9625jyumaefscl, schemeData.f9625jyumaefscl) && Objects.equals(this.f9624iwizpuwonk, schemeData.f9624iwizpuwonk) && Objects.equals(this.f9626yggfygwlhe, schemeData.f9626yggfygwlhe) && Arrays.equals(this.f9623cqumvgiudr, schemeData.f9623cqumvgiudr);
        }

        public int hashCode() {
            if (this.f9627zdlpuopuiu == 0) {
                int iHashCode = this.f9626yggfygwlhe.hashCode() * 31;
                String str = this.f9625jyumaefscl;
                this.f9627zdlpuopuiu = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f9624iwizpuwonk.hashCode()) * 31) + Arrays.hashCode(this.f9623cqumvgiudr);
            }
            return this.f9627zdlpuopuiu;
        }

        public boolean ppxfxbqfkf(UUID uuid) {
            return nufgyqmvbu.f115645iobyxmoadg.equals(this.f9626yggfygwlhe) || uuid.equals(this.f9626yggfygwlhe);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            parcel.writeLong(this.f9626yggfygwlhe.getMostSignificantBits());
            parcel.writeLong(this.f9626yggfygwlhe.getLeastSignificantBits());
            parcel.writeString(this.f9625jyumaefscl);
            parcel.writeString(this.f9624iwizpuwonk);
            parcel.writeByteArray(this.f9623cqumvgiudr);
        }

        public SchemeData zoijcleaow(byte[] bArr) {
            return new SchemeData(this.f9626yggfygwlhe, this.f9625jyumaefscl, this.f9624iwizpuwonk, bArr);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this.f9626yggfygwlhe = (UUID) y2.iobyxmoadg.eablkybsjg(uuid);
            this.f9625jyumaefscl = str;
            this.f9624iwizpuwonk = iwizpuwonk.oxmwwwfdhm((String) y2.iobyxmoadg.eablkybsjg(str2));
            this.f9623cqumvgiudr = bArr;
        }

        SchemeData(Parcel parcel) {
            this.f9626yggfygwlhe = new UUID(parcel.readLong(), parcel.readLong());
            this.f9625jyumaefscl = parcel.readString();
            this.f9624iwizpuwonk = (String) stevsuqkhv.nufgyqmvbu(parcel.readString());
            this.f9623cqumvgiudr = parcel.createByteArray();
        }
    }

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public DrmInitData[] newArray(int i13) {
            return new DrmInitData[i13];
        }
    }

    public DrmInitData(List list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SchemeData eablkybsjg(int i13) {
        return this.f9622zdlpuopuiu[i13];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return Objects.equals(this.f9620jyumaefscl, drmInitData.f9620jyumaefscl) && Arrays.equals(this.f9622zdlpuopuiu, drmInitData.f9622zdlpuopuiu);
    }

    public int hashCode() {
        if (this.f9621yggfygwlhe == 0) {
            String str = this.f9620jyumaefscl;
            this.f9621yggfygwlhe = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f9622zdlpuopuiu);
        }
        return this.f9621yggfygwlhe;
    }

    public DrmInitData ppxfxbqfkf(String str) {
        return Objects.equals(this.f9620jyumaefscl, str) ? this : new DrmInitData(str, false, this.f9622zdlpuopuiu);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f9620jyumaefscl);
        parcel.writeTypedArray(this.f9622zdlpuopuiu, 0);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = nufgyqmvbu.f115645iobyxmoadg;
        if (uuid.equals(schemeData.f9626yggfygwlhe)) {
            return uuid.equals(schemeData2.f9626yggfygwlhe) ? 0 : 1;
        }
        return schemeData.f9626yggfygwlhe.compareTo(schemeData2.f9626yggfygwlhe);
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, schemeDataArr);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    private DrmInitData(String str, boolean z13, SchemeData... schemeDataArr) {
        this.f9620jyumaefscl = str;
        schemeDataArr = z13 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f9622zdlpuopuiu = schemeDataArr;
        this.f9619iwizpuwonk = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    DrmInitData(Parcel parcel) {
        this.f9620jyumaefscl = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) stevsuqkhv.nufgyqmvbu((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f9622zdlpuopuiu = schemeDataArr;
        this.f9619iwizpuwonk = schemeDataArr.length;
    }
}
