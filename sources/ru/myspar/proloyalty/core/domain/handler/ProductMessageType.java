package ru.myspar.proloyalty.core.domain.handler;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b¨\u0006\f"}, d2 = {"Lru/myspar/proloyalty/core/domain/handler/ProductMessageType;", "Landroid/os/Parcelable;", "", "durationInSeconds", "<init>", "(I)V", "zdlpuopuiu", "I", "zoijcleaow", "()I", "Limit", "Lru/myspar/proloyalty/core/domain/handler/ProductMessageType$Limit;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductMessageType implements Parcelable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final int durationInSeconds;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/myspar/proloyalty/core/domain/handler/ProductMessageType$Limit;", "Lru/myspar/proloyalty/core/domain/handler/ProductMessageType;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Limit extends ProductMessageType {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public static final Limit f94392yggfygwlhe = new Limit();
        public static final Parcelable.Creator<Limit> CREATOR = new iobyxmoadg();

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Limit createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return Limit.f94392yggfygwlhe;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Limit[] newArray(int i13) {
                return new Limit[i13];
            }
        }

        private Limit() {
            super(3, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Limit);
        }

        public int hashCode() {
            return -59069974;
        }

        public String toString() {
            return "Limit";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(1);
        }
    }

    public /* synthetic */ ProductMessageType(int i13, gtknphoqwx gtknphoqwxVar) {
        this(i13);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final int getDurationInSeconds() {
        return this.durationInSeconds;
    }

    private ProductMessageType(int i13) {
        this.durationInSeconds = i13;
    }
}
