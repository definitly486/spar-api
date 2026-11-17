package ru.myspar.address.impl.addresslist.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/myspar/address/impl/addresslist/model/AddressItem;", "Landroid/os/Parcelable;", "DeliveryItem", "PickUpItem", "Lru/myspar/address/impl/addresslist/model/AddressItem$DeliveryItem;", "Lru/myspar/address/impl/addresslist/model/AddressItem$PickUpItem;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AddressItem extends Parcelable {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H×\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\b\u0010'R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b\t\u0010'R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/myspar/address/impl/addresslist/model/AddressItem$DeliveryItem;", "Lru/myspar/address/impl/addresslist/model/AddressItem;", "", "id", "", "addressName", "deliveryAddress", "", "isChecked", "isEnabled", "Lru/myspar/common/models/LocationData;", "addressLocation", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZZLru/myspar/common/models/LocationData;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "I", "getId", "yggfygwlhe", "Ljava/lang/String;", "getAddressName", "jyumaefscl", "getDeliveryAddress", "iwizpuwonk", "Z", "()Z", "cqumvgiudr", "esjtqupxsv", "Lru/myspar/common/models/LocationData;", "getAddressLocation", "()Lru/myspar/common/models/LocationData;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeliveryItem implements AddressItem {
        public static final Parcelable.Creator<DeliveryItem> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEnabled;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocationData addressLocation;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deliveryAddress;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String addressName;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final int id;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final DeliveryItem createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new DeliveryItem(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (LocationData) parcel.readParcelable(DeliveryItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final DeliveryItem[] newArray(int i13) {
                return new DeliveryItem[i13];
            }
        }

        public DeliveryItem(int i13, String addressName, String deliveryAddress, boolean z13, boolean z14, LocationData addressLocation) {
            zdlpuopuiu.btonecajqb(addressName, "addressName");
            zdlpuopuiu.btonecajqb(deliveryAddress, "deliveryAddress");
            zdlpuopuiu.btonecajqb(addressLocation, "addressLocation");
            this.id = i13;
            this.addressName = addressName;
            this.deliveryAddress = deliveryAddress;
            this.isChecked = z13;
            this.isEnabled = z14;
            this.addressLocation = addressLocation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeliveryItem)) {
                return false;
            }
            DeliveryItem deliveryItem = (DeliveryItem) other;
            return this.id == deliveryItem.id && zdlpuopuiu.eablkybsjg(this.addressName, deliveryItem.addressName) && zdlpuopuiu.eablkybsjg(this.deliveryAddress, deliveryItem.deliveryAddress) && this.isChecked == deliveryItem.isChecked && this.isEnabled == deliveryItem.isEnabled && zdlpuopuiu.eablkybsjg(this.addressLocation, deliveryItem.addressLocation);
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.id) * 31) + this.addressName.hashCode()) * 31) + this.deliveryAddress.hashCode()) * 31) + Boolean.hashCode(this.isChecked)) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.addressLocation.hashCode();
        }

        public String toString() {
            return "DeliveryItem(id=" + this.id + ", addressName=" + this.addressName + ", deliveryAddress=" + this.deliveryAddress + ", isChecked=" + this.isChecked + ", isEnabled=" + this.isEnabled + ", addressLocation=" + this.addressLocation + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(this.id);
            dest.writeString(this.addressName);
            dest.writeString(this.deliveryAddress);
            dest.writeInt(this.isChecked ? 1 : 0);
            dest.writeInt(this.isEnabled ? 1 : 0);
            dest.writeParcelable(this.addressLocation, flags);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H×\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\b\u0010'R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b\t\u0010'R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/myspar/address/impl/addresslist/model/AddressItem$PickUpItem;", "Lru/myspar/address/impl/addresslist/model/AddressItem;", "", "id", "", "shopAddress", "additionalInfo", "", "isChecked", "isEnabled", "Lru/myspar/common/models/LocationData;", "addressLocation", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZZLru/myspar/common/models/LocationData;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "I", "getId", "yggfygwlhe", "Ljava/lang/String;", "getShopAddress", "jyumaefscl", "getAdditionalInfo", "iwizpuwonk", "Z", "()Z", "cqumvgiudr", "esjtqupxsv", "Lru/myspar/common/models/LocationData;", "getAddressLocation", "()Lru/myspar/common/models/LocationData;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PickUpItem implements AddressItem {
        public static final Parcelable.Creator<PickUpItem> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEnabled;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocationData addressLocation;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String additionalInfo;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String shopAddress;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final int id;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final PickUpItem createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new PickUpItem(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (LocationData) parcel.readParcelable(PickUpItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final PickUpItem[] newArray(int i13) {
                return new PickUpItem[i13];
            }
        }

        public PickUpItem(int i13, String shopAddress, String additionalInfo, boolean z13, boolean z14, LocationData addressLocation) {
            zdlpuopuiu.btonecajqb(shopAddress, "shopAddress");
            zdlpuopuiu.btonecajqb(additionalInfo, "additionalInfo");
            zdlpuopuiu.btonecajqb(addressLocation, "addressLocation");
            this.id = i13;
            this.shopAddress = shopAddress;
            this.additionalInfo = additionalInfo;
            this.isChecked = z13;
            this.isEnabled = z14;
            this.addressLocation = addressLocation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PickUpItem)) {
                return false;
            }
            PickUpItem pickUpItem = (PickUpItem) other;
            return this.id == pickUpItem.id && zdlpuopuiu.eablkybsjg(this.shopAddress, pickUpItem.shopAddress) && zdlpuopuiu.eablkybsjg(this.additionalInfo, pickUpItem.additionalInfo) && this.isChecked == pickUpItem.isChecked && this.isEnabled == pickUpItem.isEnabled && zdlpuopuiu.eablkybsjg(this.addressLocation, pickUpItem.addressLocation);
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.id) * 31) + this.shopAddress.hashCode()) * 31) + this.additionalInfo.hashCode()) * 31) + Boolean.hashCode(this.isChecked)) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.addressLocation.hashCode();
        }

        public String toString() {
            return "PickUpItem(id=" + this.id + ", shopAddress=" + this.shopAddress + ", additionalInfo=" + this.additionalInfo + ", isChecked=" + this.isChecked + ", isEnabled=" + this.isEnabled + ", addressLocation=" + this.addressLocation + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(this.id);
            dest.writeString(this.shopAddress);
            dest.writeString(this.additionalInfo);
            dest.writeInt(this.isChecked ? 1 : 0);
            dest.writeInt(this.isEnabled ? 1 : 0);
            dest.writeParcelable(this.addressLocation, flags);
        }
    }
}
