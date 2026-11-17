package ru.myspar.proloyalty.components.address.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lru/myspar/proloyalty/components/address/api/model/UserAddress;", "Landroid/os/Parcelable;", "", "getId", "()Ljava/lang/String;", "id", "", "wkgbmnqykc", "()Z", "isSelected", "Delivery", "PickUp", "Lru/myspar/proloyalty/components/address/api/model/UserAddress$Delivery;", "Lru/myspar/proloyalty/components/address/api/model/UserAddress$PickUp;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UserAddress extends Parcelable {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0088\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u001a\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b3\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\b?\u00107R\u0014\u0010A\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u001f¨\u0006B"}, d2 = {"Lru/myspar/proloyalty/components/address/api/model/UserAddress$Delivery;", "Lru/myspar/proloyalty/components/address/api/model/UserAddress;", "", "addressId", "shortAddress", "fullAddress", "customName", "flat", "entrance", "floor", "intercom", "", "isPrivateHouse", "hasGate", "Lru/myspar/proloyalty/common/models/LocationData;", "location", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLru/myspar/proloyalty/common/models/LocationData;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLru/myspar/proloyalty/common/models/LocationData;Z)Lru/myspar/proloyalty/components/address/api/model/UserAddress$Delivery;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "jyumaefscl", "pmvmpeiblj", "iwizpuwonk", "gxszxtbevo", "cqumvgiudr", "nufgyqmvbu", "esjtqupxsv", "lqeggnwhkg", "lereixgezr", "dxjokdxxww", "gtknphoqwx", "zynmafqrjb", "Z", "wflxmlrfwp", "()Z", "istkbnxepw", "btonecajqb", "cdpycssgdh", "Lru/myspar/proloyalty/common/models/LocationData;", "iobyxmoadg", "()Lru/myspar/proloyalty/common/models/LocationData;", "yadqdtsiqt", "wkgbmnqykc", "getId", "id", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Delivery implements UserAddress {
        public static final Parcelable.Creator<Delivery> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocationData location;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final String flat;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
        private final String entrance;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasGate;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customName;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fullAddress;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
        private final String floor;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
        private final String intercom;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSelected;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String shortAddress;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String addressId;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPrivateHouse;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Delivery createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Delivery(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (LocationData) parcel.readParcelable(Delivery.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Delivery[] newArray(int i13) {
                return new Delivery[i13];
            }
        }

        public Delivery(String addressId, String shortAddress, String fullAddress, String customName, String flat, String entrance, String floor, String intercom, boolean z13, boolean z14, LocationData location, boolean z15) {
            zdlpuopuiu.btonecajqb(addressId, "addressId");
            zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            zdlpuopuiu.btonecajqb(customName, "customName");
            zdlpuopuiu.btonecajqb(flat, "flat");
            zdlpuopuiu.btonecajqb(entrance, "entrance");
            zdlpuopuiu.btonecajqb(floor, "floor");
            zdlpuopuiu.btonecajqb(intercom, "intercom");
            zdlpuopuiu.btonecajqb(location, "location");
            this.addressId = addressId;
            this.shortAddress = shortAddress;
            this.fullAddress = fullAddress;
            this.customName = customName;
            this.flat = flat;
            this.entrance = entrance;
            this.floor = floor;
            this.intercom = intercom;
            this.isPrivateHouse = z13;
            this.hasGate = z14;
            this.location = location;
            this.isSelected = z15;
        }

        /* JADX INFO: renamed from: btonecajqb, reason: from getter */
        public final boolean getHasGate() {
            return this.hasGate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
        public final String getFloor() {
            return this.floor;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final String getAddressId() {
            return this.addressId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Delivery)) {
                return false;
            }
            Delivery delivery = (Delivery) other;
            return zdlpuopuiu.eablkybsjg(this.addressId, delivery.addressId) && zdlpuopuiu.eablkybsjg(this.shortAddress, delivery.shortAddress) && zdlpuopuiu.eablkybsjg(this.fullAddress, delivery.fullAddress) && zdlpuopuiu.eablkybsjg(this.customName, delivery.customName) && zdlpuopuiu.eablkybsjg(this.flat, delivery.flat) && zdlpuopuiu.eablkybsjg(this.entrance, delivery.entrance) && zdlpuopuiu.eablkybsjg(this.floor, delivery.floor) && zdlpuopuiu.eablkybsjg(this.intercom, delivery.intercom) && this.isPrivateHouse == delivery.isPrivateHouse && this.hasGate == delivery.hasGate && zdlpuopuiu.eablkybsjg(this.location, delivery.location) && this.isSelected == delivery.isSelected;
        }

        @Override // ru.myspar.proloyalty.components.address.api.model.UserAddress
        /* JADX INFO: renamed from: getId */
        public String getShopId() {
            return this.addressId;
        }

        /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
        public final String getIntercom() {
            return this.intercom;
        }

        /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
        public final String getCustomName() {
            return this.customName;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.addressId.hashCode() * 31) + this.shortAddress.hashCode()) * 31) + this.fullAddress.hashCode()) * 31) + this.customName.hashCode()) * 31) + this.flat.hashCode()) * 31) + this.entrance.hashCode()) * 31) + this.floor.hashCode()) * 31) + this.intercom.hashCode()) * 31) + Boolean.hashCode(this.isPrivateHouse)) * 31) + Boolean.hashCode(this.hasGate)) * 31) + this.location.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
        }

        /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
        public final LocationData getLocation() {
            return this.location;
        }

        /* JADX INFO: renamed from: jyumaefscl, reason: from getter */
        public final String getShortAddress() {
            return this.shortAddress;
        }

        /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
        public final String getEntrance() {
            return this.entrance;
        }

        /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
        public final String getFlat() {
            return this.flat;
        }

        /* JADX INFO: renamed from: pmvmpeiblj, reason: from getter */
        public final String getFullAddress() {
            return this.fullAddress;
        }

        public String toString() {
            return "Delivery(addressId=" + this.addressId + ", shortAddress=" + this.shortAddress + ", fullAddress=" + this.fullAddress + ", customName=" + this.customName + ", flat=" + this.flat + ", entrance=" + this.entrance + ", floor=" + this.floor + ", intercom=" + this.intercom + ", isPrivateHouse=" + this.isPrivateHouse + ", hasGate=" + this.hasGate + ", location=" + this.location + ", isSelected=" + this.isSelected + ")";
        }

        /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
        public final boolean getIsPrivateHouse() {
            return this.isPrivateHouse;
        }

        @Override // ru.myspar.proloyalty.components.address.api.model.UserAddress
        /* JADX INFO: renamed from: wkgbmnqykc, reason: from getter */
        public boolean getIsSelected() {
            return this.isSelected;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.addressId);
            dest.writeString(this.shortAddress);
            dest.writeString(this.fullAddress);
            dest.writeString(this.customName);
            dest.writeString(this.flat);
            dest.writeString(this.entrance);
            dest.writeString(this.floor);
            dest.writeString(this.intercom);
            dest.writeInt(this.isPrivateHouse ? 1 : 0);
            dest.writeInt(this.hasGate ? 1 : 0);
            dest.writeParcelable(this.location, flags);
            dest.writeInt(this.isSelected ? 1 : 0);
        }

        public final Delivery zoijcleaow(String addressId, String shortAddress, String fullAddress, String customName, String flat, String entrance, String floor, String intercom, boolean isPrivateHouse, boolean hasGate, LocationData location, boolean isSelected) {
            zdlpuopuiu.btonecajqb(addressId, "addressId");
            zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            zdlpuopuiu.btonecajqb(customName, "customName");
            zdlpuopuiu.btonecajqb(flat, "flat");
            zdlpuopuiu.btonecajqb(entrance, "entrance");
            zdlpuopuiu.btonecajqb(floor, "floor");
            zdlpuopuiu.btonecajqb(intercom, "intercom");
            zdlpuopuiu.btonecajqb(location, "location");
            return new Delivery(addressId, shortAddress, fullAddress, customName, flat, entrance, floor, intercom, isPrivateHouse, hasGate, location, isSelected);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0014¨\u0006'"}, d2 = {"Lru/myspar/proloyalty/components/address/api/model/UserAddress$PickUp;", "Lru/myspar/proloyalty/components/address/api/model/UserAddress;", "", "shopId", "fullAddress", "additionalInfo", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ppxfxbqfkf", "yggfygwlhe", "pmvmpeiblj", "jyumaefscl", "zoijcleaow", "iwizpuwonk", "Z", "wkgbmnqykc", "()Z", "getId", "id", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PickUp implements UserAddress {
        public static final Parcelable.Creator<PickUp> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSelected;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String additionalInfo;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fullAddress;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String shopId;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final PickUp createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new PickUp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final PickUp[] newArray(int i13) {
                return new PickUp[i13];
            }
        }

        public PickUp(String shopId, String fullAddress, String additionalInfo, boolean z13) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            zdlpuopuiu.btonecajqb(additionalInfo, "additionalInfo");
            this.shopId = shopId;
            this.fullAddress = fullAddress;
            this.additionalInfo = additionalInfo;
            this.isSelected = z13;
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
            return zdlpuopuiu.eablkybsjg(this.shopId, pickUp.shopId) && zdlpuopuiu.eablkybsjg(this.fullAddress, pickUp.fullAddress) && zdlpuopuiu.eablkybsjg(this.additionalInfo, pickUp.additionalInfo) && this.isSelected == pickUp.isSelected;
        }

        @Override // ru.myspar.proloyalty.components.address.api.model.UserAddress
        /* JADX INFO: renamed from: getId, reason: from getter */
        public String getShopId() {
            return this.shopId;
        }

        public int hashCode() {
            return (((((this.shopId.hashCode() * 31) + this.fullAddress.hashCode()) * 31) + this.additionalInfo.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
        }

        /* JADX INFO: renamed from: pmvmpeiblj, reason: from getter */
        public final String getFullAddress() {
            return this.fullAddress;
        }

        public final String ppxfxbqfkf() {
            return this.shopId;
        }

        public String toString() {
            return "PickUp(shopId=" + this.shopId + ", fullAddress=" + this.fullAddress + ", additionalInfo=" + this.additionalInfo + ", isSelected=" + this.isSelected + ")";
        }

        @Override // ru.myspar.proloyalty.components.address.api.model.UserAddress
        /* JADX INFO: renamed from: wkgbmnqykc, reason: from getter */
        public boolean getIsSelected() {
            return this.isSelected;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.shopId);
            dest.writeString(this.fullAddress);
            dest.writeString(this.additionalInfo);
            dest.writeInt(this.isSelected ? 1 : 0);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getAdditionalInfo() {
            return this.additionalInfo;
        }
    }

    /* JADX INFO: renamed from: getId */
    String getShopId();

    /* JADX INFO: renamed from: wkgbmnqykc */
    boolean getIsSelected();
}
