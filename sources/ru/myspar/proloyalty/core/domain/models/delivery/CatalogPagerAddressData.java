package ru.myspar.proloyalty.core.domain.models.delivery;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import q11.dxjokdxxww;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/delivery/CatalogPagerAddressData;", "Landroid/os/Parcelable;", "", "address", "deliveryType", "", "isCartHasAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "cityName", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "ppxfxbqfkf", "jyumaefscl", "Z", "eablkybsjg", "()Z", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CatalogPagerAddressData implements Parcelable {
    public static final Parcelable.Creator<CatalogPagerAddressData> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCartHasAddress;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryType;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String address;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CatalogPagerAddressData createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new CatalogPagerAddressData(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CatalogPagerAddressData[] newArray(int i13) {
            return new CatalogPagerAddressData[i13];
        }
    }

    public CatalogPagerAddressData(String address, String deliveryType, boolean z13) {
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(deliveryType, "deliveryType");
        this.address = address;
        this.deliveryType = deliveryType;
        this.isCartHasAddress = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getIsCartHasAddress() {
        return this.isCartHasAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogPagerAddressData)) {
            return false;
        }
        CatalogPagerAddressData catalogPagerAddressData = (CatalogPagerAddressData) other;
        return zdlpuopuiu.eablkybsjg(this.address, catalogPagerAddressData.address) && zdlpuopuiu.eablkybsjg(this.deliveryType, catalogPagerAddressData.deliveryType) && this.isCartHasAddress == catalogPagerAddressData.isCartHasAddress;
    }

    public int hashCode() {
        return (((this.address.hashCode() * 31) + this.deliveryType.hashCode()) * 31) + Boolean.hashCode(this.isCartHasAddress);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getDeliveryType() {
        return this.deliveryType;
    }

    public String toString() {
        return "CatalogPagerAddressData(address=" + this.address + ", deliveryType=" + this.deliveryType + ", isCartHasAddress=" + this.isCartHasAddress + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.address);
        dest.writeString(this.deliveryType);
        dest.writeInt(this.isCartHasAddress ? 1 : 0);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatalogPagerAddressData(String cityName) {
        this(cityName, dxjokdxxww.ppxfxbqfkf(), true);
        zdlpuopuiu.btonecajqb(cityName, "cityName");
    }
}
