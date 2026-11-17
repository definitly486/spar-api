package ru.myspar.proloyalty.address.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import cl0.zoijcleaow;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/myspar/proloyalty/address/api/model/AddressListArgs;", "Landroid/os/Parcelable;", "Lcl0/zoijcleaow;", "addressType", "", "typeSelectionEnable", "<init>", "(Lcl0/zoijcleaow;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lcl0/zoijcleaow;", "zoijcleaow", "()Lcl0/zoijcleaow;", "yggfygwlhe", "Z", "ppxfxbqfkf", "()Z", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AddressListArgs implements Parcelable {
    public static final Parcelable.Creator<AddressListArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean typeSelectionEnable;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow addressType;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final AddressListArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new AddressListArgs(zoijcleaow.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final AddressListArgs[] newArray(int i13) {
            return new AddressListArgs[i13];
        }
    }

    public AddressListArgs(zoijcleaow addressType, boolean z13) {
        zdlpuopuiu.btonecajqb(addressType, "addressType");
        this.addressType = addressType;
        this.typeSelectionEnable = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressListArgs)) {
            return false;
        }
        AddressListArgs addressListArgs = (AddressListArgs) other;
        return this.addressType == addressListArgs.addressType && this.typeSelectionEnable == addressListArgs.typeSelectionEnable;
    }

    public int hashCode() {
        return (this.addressType.hashCode() * 31) + Boolean.hashCode(this.typeSelectionEnable);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final boolean getTypeSelectionEnable() {
        return this.typeSelectionEnable;
    }

    public String toString() {
        return "AddressListArgs(addressType=" + this.addressType + ", typeSelectionEnable=" + this.typeSelectionEnable + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.addressType.name());
        dest.writeInt(this.typeSelectionEnable ? 1 : 0);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final zoijcleaow getAddressType() {
        return this.addressType;
    }

    public /* synthetic */ AddressListArgs(zoijcleaow zoijcleaowVar, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? zoijcleaow.Delivery : zoijcleaowVar, (i13 & 2) != 0 ? true : z13);
    }
}
