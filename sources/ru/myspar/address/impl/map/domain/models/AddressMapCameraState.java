package ru.myspar.address.impl.map.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/myspar/address/impl/map/domain/models/AddressMapCameraState;", "Landroid/os/Parcelable;", "Lru/myspar/common/models/LocationData;", "cameraPosition", "", "cameraZoom", "<init>", "(Lru/myspar/common/models/LocationData;F)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Lru/myspar/common/models/LocationData;F)Lru/myspar/address/impl/map/domain/models/AddressMapCameraState;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/common/models/LocationData;", "eablkybsjg", "()Lru/myspar/common/models/LocationData;", "yggfygwlhe", "F", "gxszxtbevo", "()F", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AddressMapCameraState implements Parcelable {
    public static final Parcelable.Creator<AddressMapCameraState> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final float cameraZoom;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData cameraPosition;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final AddressMapCameraState createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new AddressMapCameraState((LocationData) parcel.readParcelable(AddressMapCameraState.class.getClassLoader()), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final AddressMapCameraState[] newArray(int i13) {
            return new AddressMapCameraState[i13];
        }
    }

    public AddressMapCameraState(LocationData cameraPosition, float f13) {
        zdlpuopuiu.btonecajqb(cameraPosition, "cameraPosition");
        this.cameraPosition = cameraPosition;
        this.cameraZoom = f13;
    }

    public static /* synthetic */ AddressMapCameraState ppxfxbqfkf(AddressMapCameraState addressMapCameraState, LocationData locationData, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            locationData = addressMapCameraState.cameraPosition;
        }
        if ((i13 & 2) != 0) {
            f13 = addressMapCameraState.cameraZoom;
        }
        return addressMapCameraState.zoijcleaow(locationData, f13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final LocationData getCameraPosition() {
        return this.cameraPosition;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressMapCameraState)) {
            return false;
        }
        AddressMapCameraState addressMapCameraState = (AddressMapCameraState) other;
        return zdlpuopuiu.eablkybsjg(this.cameraPosition, addressMapCameraState.cameraPosition) && Float.compare(this.cameraZoom, addressMapCameraState.cameraZoom) == 0;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final float getCameraZoom() {
        return this.cameraZoom;
    }

    public int hashCode() {
        return (this.cameraPosition.hashCode() * 31) + Float.hashCode(this.cameraZoom);
    }

    public String toString() {
        return "AddressMapCameraState(cameraPosition=" + this.cameraPosition + ", cameraZoom=" + this.cameraZoom + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.cameraPosition, flags);
        dest.writeFloat(this.cameraZoom);
    }

    public final AddressMapCameraState zoijcleaow(LocationData cameraPosition, float cameraZoom) {
        zdlpuopuiu.btonecajqb(cameraPosition, "cameraPosition");
        return new AddressMapCameraState(cameraPosition, cameraZoom);
    }
}
