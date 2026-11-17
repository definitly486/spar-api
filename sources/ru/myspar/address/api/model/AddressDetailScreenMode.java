package ru.myspar.address.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;
import ru.myspar.components.address.api.model.UserAddress;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0012\u0013R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u0082\u0001\u0002\u0014\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lru/myspar/address/api/model/AddressDetailScreenMode;", "Landroid/os/Parcelable;", "", "jyumaefscl", "()Ljava/lang/String;", "shortAddress", "pmvmpeiblj", "fullAddress", "Lru/myspar/common/models/LocationData;", "iobyxmoadg", "()Lru/myspar/common/models/LocationData;", "location", "", "zynmafqrjb", "()Z", "isAvailableDelete", "wkgbmnqykc", "isSelected", "CreateNew", "EditExisted", "Lru/myspar/address/api/model/AddressDetailScreenMode$CreateNew;", "Lru/myspar/address/api/model/AddressDetailScreenMode$EditExisted;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AddressDetailScreenMode extends Parcelable {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006'"}, d2 = {"Lru/myspar/address/api/model/AddressDetailScreenMode$CreateNew;", "Lru/myspar/address/api/model/AddressDetailScreenMode;", "", "shortAddress", "fullAddress", "Lru/myspar/common/models/LocationData;", "location", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/myspar/common/models/LocationData;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "jyumaefscl", "yggfygwlhe", "pmvmpeiblj", "Lru/myspar/common/models/LocationData;", "iobyxmoadg", "()Lru/myspar/common/models/LocationData;", "zynmafqrjb", "()Z", "isAvailableDelete", "wkgbmnqykc", "isSelected", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CreateNew implements AddressDetailScreenMode {
        public static final Parcelable.Creator<CreateNew> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocationData location;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fullAddress;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String shortAddress;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final CreateNew createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new CreateNew(parcel.readString(), parcel.readString(), (LocationData) parcel.readParcelable(CreateNew.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final CreateNew[] newArray(int i13) {
                return new CreateNew[i13];
            }
        }

        public CreateNew(String shortAddress, String fullAddress, LocationData location) {
            zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            zdlpuopuiu.btonecajqb(location, "location");
            this.shortAddress = shortAddress;
            this.fullAddress = fullAddress;
            this.location = location;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateNew)) {
                return false;
            }
            CreateNew createNew = (CreateNew) other;
            return zdlpuopuiu.eablkybsjg(this.shortAddress, createNew.shortAddress) && zdlpuopuiu.eablkybsjg(this.fullAddress, createNew.fullAddress) && zdlpuopuiu.eablkybsjg(this.location, createNew.location);
        }

        public int hashCode() {
            return (((this.shortAddress.hashCode() * 31) + this.fullAddress.hashCode()) * 31) + this.location.hashCode();
        }

        @Override // ru.myspar.address.api.model.AddressDetailScreenMode
        /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
        public LocationData getLocation() {
            return this.location;
        }

        @Override // ru.myspar.address.api.model.AddressDetailScreenMode
        /* JADX INFO: renamed from: jyumaefscl, reason: from getter */
        public String getShortAddress() {
            return this.shortAddress;
        }

        @Override // ru.myspar.address.api.model.AddressDetailScreenMode
        /* JADX INFO: renamed from: pmvmpeiblj, reason: from getter */
        public String getFullAddress() {
            return this.fullAddress;
        }

        public String toString() {
            return "CreateNew(shortAddress=" + this.shortAddress + ", fullAddress=" + this.fullAddress + ", location=" + this.location + ")";
        }

        @Override // ru.myspar.address.api.model.AddressDetailScreenMode
        public boolean wkgbmnqykc() {
            return false;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.shortAddress);
            dest.writeString(this.fullAddress);
            dest.writeParcelable(this.location, flags);
        }

        @Override // ru.myspar.address.api.model.AddressDetailScreenMode
        public boolean zynmafqrjb() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"Lru/myspar/address/api/model/AddressDetailScreenMode$EditExisted;", "Lru/myspar/address/api/model/AddressDetailScreenMode;", "Lru/myspar/components/address/api/model/UserAddress$Delivery;", "userAddress", "<init>", "(Lru/myspar/components/address/api/model/UserAddress$Delivery;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/components/address/api/model/UserAddress$Delivery;", "zoijcleaow", "()Lru/myspar/components/address/api/model/UserAddress$Delivery;", "jyumaefscl", "shortAddress", "pmvmpeiblj", "fullAddress", "Lru/myspar/common/models/LocationData;", "iobyxmoadg", "()Lru/myspar/common/models/LocationData;", "location", "zynmafqrjb", "()Z", "isAvailableDelete", "wkgbmnqykc", "isSelected", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EditExisted implements AddressDetailScreenMode {
        public static final Parcelable.Creator<EditExisted> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final UserAddress.Delivery userAddress;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final EditExisted createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new EditExisted((UserAddress.Delivery) parcel.readParcelable(EditExisted.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final EditExisted[] newArray(int i13) {
                return new EditExisted[i13];
            }
        }

        public EditExisted(UserAddress.Delivery userAddress) {
            zdlpuopuiu.btonecajqb(userAddress, "userAddress");
            this.userAddress = userAddress;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EditExisted) && zdlpuopuiu.eablkybsjg(this.userAddress, ((EditExisted) other).userAddress);
        }

        public int hashCode() {
            return this.userAddress.hashCode();
        }

        @Override // ru.myspar.address.api.model.AddressDetailScreenMode
        /* JADX INFO: renamed from: iobyxmoadg */
        public LocationData getLocation() {
            return this.userAddress.getLocation();
        }

        @Override // ru.myspar.address.api.model.AddressDetailScreenMode
        /* JADX INFO: renamed from: jyumaefscl */
        public String getShortAddress() {
            return this.userAddress.getShortAddress();
        }

        @Override // ru.myspar.address.api.model.AddressDetailScreenMode
        /* JADX INFO: renamed from: pmvmpeiblj */
        public String getFullAddress() {
            return this.userAddress.getFullAddress();
        }

        public String toString() {
            return "EditExisted(userAddress=" + this.userAddress + ")";
        }

        @Override // ru.myspar.address.api.model.AddressDetailScreenMode
        public boolean wkgbmnqykc() {
            return this.userAddress.getIsSelected();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeParcelable(this.userAddress, flags);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final UserAddress.Delivery getUserAddress() {
            return this.userAddress;
        }

        @Override // ru.myspar.address.api.model.AddressDetailScreenMode
        public boolean zynmafqrjb() {
            return !this.userAddress.getIsSelected();
        }
    }

    /* JADX INFO: renamed from: iobyxmoadg */
    LocationData getLocation();

    /* JADX INFO: renamed from: jyumaefscl */
    String getShortAddress();

    /* JADX INFO: renamed from: pmvmpeiblj */
    String getFullAddress();

    boolean wkgbmnqykc();

    boolean zynmafqrjb();
}
