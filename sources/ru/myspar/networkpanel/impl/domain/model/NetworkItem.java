package ru.myspar.networkpanel.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H×\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010,\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u0012\n\u0004\b(\u0010%\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010'¨\u0006-"}, d2 = {"Lru/myspar/networkpanel/impl/domain/model/NetworkItem;", "Landroid/os/Parcelable;", "", "id", ImagesContract.URL, "", "requestTime", "responseTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "agtfadlqog", "jyumaefscl", "J", "ppxfxbqfkf", "()J", "iwizpuwonk", "Ljava/lang/Long;", "eablkybsjg", "()Ljava/lang/Long;", "cqumvgiudr", "zoijcleaow", "getDuration$annotations", "()V", "duration", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NetworkItem implements Parcelable {
    public static final Parcelable.Creator<NetworkItem> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    private final Long duration;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long responseTime;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final long requestTime;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final NetworkItem createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new NetworkItem(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final NetworkItem[] newArray(int i13) {
            return new NetworkItem[i13];
        }
    }

    public NetworkItem(String id2, String url, long j13, Long l13) {
        Long lValueOf;
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(url, "url");
        this.id = id2;
        this.url = url;
        this.requestTime = j13;
        this.responseTime = l13;
        if (l13 != null) {
            lValueOf = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(l13.longValue() - j13));
        } else {
            lValueOf = null;
        }
        this.duration = lValueOf;
    }

    /* JADX INFO: renamed from: agtfadlqog, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final Long getResponseTime() {
        return this.responseTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkItem)) {
            return false;
        }
        NetworkItem networkItem = (NetworkItem) other;
        return zdlpuopuiu.eablkybsjg(this.id, networkItem.id) && zdlpuopuiu.eablkybsjg(this.url, networkItem.url) && this.requestTime == networkItem.requestTime && zdlpuopuiu.eablkybsjg(this.responseTime, networkItem.responseTime);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.url.hashCode()) * 31) + Long.hashCode(this.requestTime)) * 31;
        Long l13 = this.responseTime;
        return iHashCode + (l13 == null ? 0 : l13.hashCode());
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final long getRequestTime() {
        return this.requestTime;
    }

    public String toString() {
        return "NetworkItem(id=" + this.id + ", url=" + this.url + ", requestTime=" + this.requestTime + ", responseTime=" + this.responseTime + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.url);
        dest.writeLong(this.requestTime);
        Long l13 = this.responseTime;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }
}
