package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.StreamKey;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final byte[] f10917cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final String f10918esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final List f10919iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final String f10920jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public final byte[] f10921lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public final ByteRange f10922pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final Uri f10923yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final String f10924zdlpuopuiu;

    public static class UnsupportedRequestException extends IOException {
    }

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public DownloadRequest[] newArray(int i13) {
            return new DownloadRequest[i13];
        }
    }

    DownloadRequest(Parcel parcel) {
        this.f10924zdlpuopuiu = (String) stevsuqkhv.nufgyqmvbu(parcel.readString());
        this.f10923yggfygwlhe = Uri.parse((String) stevsuqkhv.nufgyqmvbu(parcel.readString()));
        this.f10920jyumaefscl = parcel.readString();
        int i13 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f10919iwizpuwonk = Collections.unmodifiableList(arrayList);
        this.f10917cqumvgiudr = parcel.createByteArray();
        this.f10918esjtqupxsv = parcel.readString();
        this.f10921lereixgezr = (byte[]) stevsuqkhv.nufgyqmvbu(parcel.createByteArray());
        this.f10922pmvmpeiblj = (ByteRange) parcel.readParcelable(ByteRange.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f10924zdlpuopuiu.equals(downloadRequest.f10924zdlpuopuiu) && this.f10923yggfygwlhe.equals(downloadRequest.f10923yggfygwlhe) && Objects.equals(this.f10920jyumaefscl, downloadRequest.f10920jyumaefscl) && this.f10919iwizpuwonk.equals(downloadRequest.f10919iwizpuwonk) && Arrays.equals(this.f10917cqumvgiudr, downloadRequest.f10917cqumvgiudr) && Objects.equals(this.f10918esjtqupxsv, downloadRequest.f10918esjtqupxsv) && Arrays.equals(this.f10921lereixgezr, downloadRequest.f10921lereixgezr) && Objects.equals(this.f10922pmvmpeiblj, downloadRequest.f10922pmvmpeiblj);
    }

    public int hashCode() {
        int iHashCode = ((this.f10924zdlpuopuiu.hashCode() * 961) + this.f10923yggfygwlhe.hashCode()) * 31;
        String str = this.f10920jyumaefscl;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f10919iwizpuwonk.hashCode()) * 31) + Arrays.hashCode(this.f10917cqumvgiudr)) * 31;
        String str2 = this.f10918esjtqupxsv;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f10921lereixgezr)) * 31;
        ByteRange byteRange = this.f10922pmvmpeiblj;
        return iHashCode3 + (byteRange != null ? byteRange.hashCode() : 0);
    }

    public String toString() {
        return this.f10920jyumaefscl + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f10924zdlpuopuiu;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f10924zdlpuopuiu);
        parcel.writeString(this.f10923yggfygwlhe.toString());
        parcel.writeString(this.f10920jyumaefscl);
        parcel.writeInt(this.f10919iwizpuwonk.size());
        for (int i14 = 0; i14 < this.f10919iwizpuwonk.size(); i14++) {
            parcel.writeParcelable((Parcelable) this.f10919iwizpuwonk.get(i14), 0);
        }
        parcel.writeByteArray(this.f10917cqumvgiudr);
        parcel.writeString(this.f10918esjtqupxsv);
        parcel.writeByteArray(this.f10921lereixgezr);
        parcel.writeParcelable(this.f10922pmvmpeiblj, 0);
    }

    public static final class ByteRange implements Parcelable {
        public static final Parcelable.Creator<ByteRange> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public final long f10925yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final long f10926zdlpuopuiu;

        class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public ByteRange createFromParcel(Parcel parcel) {
                return new ByteRange(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public ByteRange[] newArray(int i13) {
                return new ByteRange[i13];
            }
        }

        ByteRange(long j13, long j14) {
            y2.iobyxmoadg.iobyxmoadg(j13 >= 0);
            y2.iobyxmoadg.iobyxmoadg(j14 >= 0 || j14 == -1);
            this.f10926zdlpuopuiu = j13;
            this.f10925yggfygwlhe = j14;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ByteRange)) {
                return false;
            }
            ByteRange byteRange = (ByteRange) obj;
            return this.f10926zdlpuopuiu == byteRange.f10926zdlpuopuiu && this.f10925yggfygwlhe == byteRange.f10925yggfygwlhe;
        }

        public int hashCode() {
            return (((int) this.f10926zdlpuopuiu) * 961) + ((int) this.f10925yggfygwlhe);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            parcel.writeLong(this.f10926zdlpuopuiu);
            parcel.writeLong(this.f10925yggfygwlhe);
        }

        ByteRange(Parcel parcel) {
            this(parcel.readLong(), parcel.readLong());
        }
    }
}
