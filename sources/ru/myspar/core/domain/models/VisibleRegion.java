package ru.myspar.core.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001e¨\u0006%"}, d2 = {"Lru/myspar/core/domain/models/VisibleRegion;", "Landroid/os/Parcelable;", "Lru/myspar/common/models/LocationData;", "topLeft", "topRight", "bottomLeft", "bottomRight", "<init>", "(Lru/myspar/common/models/LocationData;Lru/myspar/common/models/LocationData;Lru/myspar/common/models/LocationData;Lru/myspar/common/models/LocationData;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/common/models/LocationData;", "ppxfxbqfkf", "()Lru/myspar/common/models/LocationData;", "yggfygwlhe", "getTopRight", "jyumaefscl", "getBottomLeft", "iwizpuwonk", "zoijcleaow", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VisibleRegion implements Parcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData bottomRight;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData bottomLeft;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData topRight;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData topLeft;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final VisibleRegion createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new VisibleRegion((LocationData) parcel.readParcelable(VisibleRegion.class.getClassLoader()), (LocationData) parcel.readParcelable(VisibleRegion.class.getClassLoader()), (LocationData) parcel.readParcelable(VisibleRegion.class.getClassLoader()), (LocationData) parcel.readParcelable(VisibleRegion.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final VisibleRegion[] newArray(int i13) {
            return new VisibleRegion[i13];
        }
    }

    public VisibleRegion(LocationData topLeft, LocationData topRight, LocationData bottomLeft, LocationData bottomRight) {
        zdlpuopuiu.btonecajqb(topLeft, "topLeft");
        zdlpuopuiu.btonecajqb(topRight, "topRight");
        zdlpuopuiu.btonecajqb(bottomLeft, "bottomLeft");
        zdlpuopuiu.btonecajqb(bottomRight, "bottomRight");
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) other;
        return zdlpuopuiu.eablkybsjg(this.topLeft, visibleRegion.topLeft) && zdlpuopuiu.eablkybsjg(this.topRight, visibleRegion.topRight) && zdlpuopuiu.eablkybsjg(this.bottomLeft, visibleRegion.bottomLeft) && zdlpuopuiu.eablkybsjg(this.bottomRight, visibleRegion.bottomRight);
    }

    public int hashCode() {
        return (((((this.topLeft.hashCode() * 31) + this.topRight.hashCode()) * 31) + this.bottomLeft.hashCode()) * 31) + this.bottomRight.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final LocationData getTopLeft() {
        return this.topLeft;
    }

    public String toString() {
        return "VisibleRegion(topLeft=" + this.topLeft + ", topRight=" + this.topRight + ", bottomLeft=" + this.bottomLeft + ", bottomRight=" + this.bottomRight + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.topLeft, flags);
        dest.writeParcelable(this.topRight, flags);
        dest.writeParcelable(this.bottomLeft, flags);
        dest.writeParcelable(this.bottomRight, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final LocationData getBottomRight() {
        return this.bottomRight;
    }
}
