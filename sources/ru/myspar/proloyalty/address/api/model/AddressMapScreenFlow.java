package ru.myspar.proloyalty.address.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \n2\u00020\u0001:\u0003\u000b\f\u0003R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\r\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lru/myspar/proloyalty/address/api/model/AddressMapScreenFlow;", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/common/models/LocationData;", "iobyxmoadg", "()Lru/myspar/proloyalty/common/models/LocationData;", "location", "", "cdpycssgdh", "()F", "zoom", "ojitshcjhn", "Delivery", "PickUp", "Lru/myspar/proloyalty/address/api/model/AddressMapScreenFlow$Delivery;", "Lru/myspar/proloyalty/address/api/model/AddressMapScreenFlow$PickUp;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AddressMapScreenFlow extends Parcelable {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f91839iobyxmoadg;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/myspar/proloyalty/address/api/model/AddressMapScreenFlow$Delivery;", "Lru/myspar/proloyalty/address/api/model/AddressMapScreenFlow;", "", "shortAddress", "fullAddress", "Lru/myspar/proloyalty/common/models/LocationData;", "location", "", "isIncludedInTheDeliveryArea", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/common/models/LocationData;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/common/models/LocationData;Z)Lru/myspar/proloyalty/address/api/model/AddressMapScreenFlow$Delivery;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "jyumaefscl", "yggfygwlhe", "pmvmpeiblj", "Lru/myspar/proloyalty/common/models/LocationData;", "iobyxmoadg", "()Lru/myspar/proloyalty/common/models/LocationData;", "iwizpuwonk", "Z", "ppxfxbqfkf", "()Z", "", "cdpycssgdh", "()F", "zoom", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Delivery implements AddressMapScreenFlow {
        public static final Parcelable.Creator<Delivery> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isIncludedInTheDeliveryArea;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocationData location;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fullAddress;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String shortAddress;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Delivery createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Delivery(parcel.readString(), parcel.readString(), (LocationData) parcel.readParcelable(Delivery.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Delivery[] newArray(int i13) {
                return new Delivery[i13];
            }
        }

        public Delivery(String shortAddress, String fullAddress, LocationData locationData, boolean z13) {
            zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            this.shortAddress = shortAddress;
            this.fullAddress = fullAddress;
            this.location = locationData;
            this.isIncludedInTheDeliveryArea = z13;
        }

        @Override // ru.myspar.proloyalty.address.api.model.AddressMapScreenFlow
        public float cdpycssgdh() {
            return 17.0f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Delivery)) {
                return false;
            }
            Delivery delivery = (Delivery) other;
            return zdlpuopuiu.eablkybsjg(this.shortAddress, delivery.shortAddress) && zdlpuopuiu.eablkybsjg(this.fullAddress, delivery.fullAddress) && zdlpuopuiu.eablkybsjg(this.location, delivery.location) && this.isIncludedInTheDeliveryArea == delivery.isIncludedInTheDeliveryArea;
        }

        public int hashCode() {
            int iHashCode = ((this.shortAddress.hashCode() * 31) + this.fullAddress.hashCode()) * 31;
            LocationData locationData = this.location;
            return ((iHashCode + (locationData == null ? 0 : locationData.hashCode())) * 31) + Boolean.hashCode(this.isIncludedInTheDeliveryArea);
        }

        @Override // ru.myspar.proloyalty.address.api.model.AddressMapScreenFlow
        /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
        public LocationData getLocation() {
            return this.location;
        }

        /* JADX INFO: renamed from: jyumaefscl, reason: from getter */
        public final String getShortAddress() {
            return this.shortAddress;
        }

        /* JADX INFO: renamed from: pmvmpeiblj, reason: from getter */
        public String getFullAddress() {
            return this.fullAddress;
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final boolean getIsIncludedInTheDeliveryArea() {
            return this.isIncludedInTheDeliveryArea;
        }

        public String toString() {
            return "Delivery(shortAddress=" + this.shortAddress + ", fullAddress=" + this.fullAddress + ", location=" + this.location + ", isIncludedInTheDeliveryArea=" + this.isIncludedInTheDeliveryArea + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.shortAddress);
            dest.writeString(this.fullAddress);
            dest.writeParcelable(this.location, flags);
            dest.writeInt(this.isIncludedInTheDeliveryArea ? 1 : 0);
        }

        public final Delivery zoijcleaow(String shortAddress, String fullAddress, LocationData location, boolean isIncludedInTheDeliveryArea) {
            zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            return new Delivery(shortAddress, fullAddress, location, isIncludedInTheDeliveryArea);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/myspar/proloyalty/address/api/model/AddressMapScreenFlow$PickUp;", "Lru/myspar/proloyalty/address/api/model/AddressMapScreenFlow;", "", "shopId", "fullAddress", "Lru/myspar/proloyalty/common/models/LocationData;", "location", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/common/models/LocationData;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/common/models/LocationData;)Lru/myspar/proloyalty/address/api/model/AddressMapScreenFlow$PickUp;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ppxfxbqfkf", "yggfygwlhe", "pmvmpeiblj", "jyumaefscl", "Lru/myspar/proloyalty/common/models/LocationData;", "iobyxmoadg", "()Lru/myspar/proloyalty/common/models/LocationData;", "", "cdpycssgdh", "()F", "zoom", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PickUp implements AddressMapScreenFlow {
        public static final Parcelable.Creator<PickUp> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocationData location;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fullAddress;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String shopId;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final PickUp createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new PickUp(parcel.readString(), parcel.readString(), (LocationData) parcel.readParcelable(PickUp.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final PickUp[] newArray(int i13) {
                return new PickUp[i13];
            }
        }

        public PickUp(String str, String fullAddress, LocationData locationData) {
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            this.shopId = str;
            this.fullAddress = fullAddress;
            this.location = locationData;
        }

        @Override // ru.myspar.proloyalty.address.api.model.AddressMapScreenFlow
        public float cdpycssgdh() {
            return 13.0f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PickUp)) {
                return false;
            }
            PickUp pickUp = (PickUp) other;
            return zdlpuopuiu.eablkybsjg(this.shopId, pickUp.shopId) && zdlpuopuiu.eablkybsjg(this.fullAddress, pickUp.fullAddress) && zdlpuopuiu.eablkybsjg(this.location, pickUp.location);
        }

        public int hashCode() {
            String str = this.shopId;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.fullAddress.hashCode()) * 31;
            LocationData locationData = this.location;
            return iHashCode + (locationData != null ? locationData.hashCode() : 0);
        }

        @Override // ru.myspar.proloyalty.address.api.model.AddressMapScreenFlow
        /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
        public LocationData getLocation() {
            return this.location;
        }

        /* JADX INFO: renamed from: pmvmpeiblj, reason: from getter */
        public String getFullAddress() {
            return this.fullAddress;
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getShopId() {
            return this.shopId;
        }

        public String toString() {
            return "PickUp(shopId=" + this.shopId + ", fullAddress=" + this.fullAddress + ", location=" + this.location + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.shopId);
            dest.writeString(this.fullAddress);
            dest.writeParcelable(this.location, flags);
        }

        public final PickUp zoijcleaow(String shopId, String fullAddress, LocationData location) {
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            return new PickUp(shopId, fullAddress, location);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.address.api.model.AddressMapScreenFlow$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ Companion f91839iobyxmoadg = new Companion();

        private Companion() {
        }

        public final Delivery iobyxmoadg() {
            return new Delivery(dxjokdxxww.ppxfxbqfkf(), dxjokdxxww.ppxfxbqfkf(), null, true);
        }

        public final PickUp zoijcleaow() {
            return new PickUp(null, dxjokdxxww.ppxfxbqfkf(), null);
        }
    }

    float cdpycssgdh();

    /* JADX INFO: renamed from: iobyxmoadg */
    LocationData getLocation();
}
