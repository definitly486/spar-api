package ru.myspar.core.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/myspar/core/domain/models/ShopOnMap;", "Landroid/os/Parcelable;", "", "id", "address", "hours", "Lru/myspar/common/models/LocationData;", "location", "", "distanceToUser", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/common/models/LocationData;D)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "getAddress", "jyumaefscl", "getHours", "iwizpuwonk", "Lru/myspar/common/models/LocationData;", "getLocation", "()Lru/myspar/common/models/LocationData;", "cqumvgiudr", "D", "getDistanceToUser", "()D", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShopOnMap implements Parcelable {
    public static final Parcelable.Creator<ShopOnMap> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double distanceToUser;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData location;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hours;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String address;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ShopOnMap createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ShopOnMap(parcel.readString(), parcel.readString(), parcel.readString(), (LocationData) parcel.readParcelable(ShopOnMap.class.getClassLoader()), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ShopOnMap[] newArray(int i13) {
            return new ShopOnMap[i13];
        }
    }

    public ShopOnMap(String id2, String address, String hours, LocationData location, double d13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(hours, "hours");
        zdlpuopuiu.btonecajqb(location, "location");
        this.id = id2;
        this.address = address;
        this.hours = hours;
        this.location = location;
        this.distanceToUser = d13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopOnMap)) {
            return false;
        }
        ShopOnMap shopOnMap = (ShopOnMap) other;
        return zdlpuopuiu.eablkybsjg(this.id, shopOnMap.id) && zdlpuopuiu.eablkybsjg(this.address, shopOnMap.address) && zdlpuopuiu.eablkybsjg(this.hours, shopOnMap.hours) && zdlpuopuiu.eablkybsjg(this.location, shopOnMap.location) && Double.compare(this.distanceToUser, shopOnMap.distanceToUser) == 0;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.address.hashCode()) * 31) + this.hours.hashCode()) * 31) + this.location.hashCode()) * 31) + Double.hashCode(this.distanceToUser);
    }

    public String toString() {
        return "ShopOnMap(id=" + this.id + ", address=" + this.address + ", hours=" + this.hours + ", location=" + this.location + ", distanceToUser=" + this.distanceToUser + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.address);
        dest.writeString(this.hours);
        dest.writeParcelable(this.location, flags);
        dest.writeDouble(this.distanceToUser);
    }
}
