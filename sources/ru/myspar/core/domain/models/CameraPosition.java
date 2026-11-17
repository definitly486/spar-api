package ru.myspar.core.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#¨\u0006("}, d2 = {"Lru/myspar/core/domain/models/CameraPosition;", "Landroid/os/Parcelable;", "Lru/myspar/common/models/LocationData;", "target", "", "zoom", "azimuth", "tilt", "<init>", "(Lru/myspar/common/models/LocationData;FFF)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/common/models/LocationData;", "ppxfxbqfkf", "()Lru/myspar/common/models/LocationData;", "yggfygwlhe", "F", "cdpycssgdh", "()F", "jyumaefscl", "zoijcleaow", "iwizpuwonk", "eablkybsjg", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CameraPosition implements Parcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final float tilt;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final float azimuth;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final float zoom;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData target;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CameraPosition createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new CameraPosition((LocationData) parcel.readParcelable(CameraPosition.class.getClassLoader()), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CameraPosition[] newArray(int i13) {
            return new CameraPosition[i13];
        }
    }

    public CameraPosition(LocationData target, float f13, float f14, float f15) {
        zdlpuopuiu.btonecajqb(target, "target");
        this.target = target;
        this.zoom = f13;
        this.azimuth = f14;
        this.tilt = f15;
    }

    /* JADX INFO: renamed from: cdpycssgdh, reason: from getter */
    public final float getZoom() {
        return this.zoom;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final float getTilt() {
        return this.tilt;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) other;
        return zdlpuopuiu.eablkybsjg(this.target, cameraPosition.target) && Float.compare(this.zoom, cameraPosition.zoom) == 0 && Float.compare(this.azimuth, cameraPosition.azimuth) == 0 && Float.compare(this.tilt, cameraPosition.tilt) == 0;
    }

    public int hashCode() {
        return (((((this.target.hashCode() * 31) + Float.hashCode(this.zoom)) * 31) + Float.hashCode(this.azimuth)) * 31) + Float.hashCode(this.tilt);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final LocationData getTarget() {
        return this.target;
    }

    public String toString() {
        return "CameraPosition(target=" + this.target + ", zoom=" + this.zoom + ", azimuth=" + this.azimuth + ", tilt=" + this.tilt + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.target, flags);
        dest.writeFloat(this.zoom);
        dest.writeFloat(this.azimuth);
        dest.writeFloat(this.tilt);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final float getAzimuth() {
        return this.azimuth;
    }
}
