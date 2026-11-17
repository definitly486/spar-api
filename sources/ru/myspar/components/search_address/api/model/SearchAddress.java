package ru.myspar.components.search_address.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/myspar/components/search_address/api/model/SearchAddress;", "Landroid/os/Parcelable;", "", "fullAddress", "shortAddress", "Lru/myspar/common/models/LocationData;", "location", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/myspar/common/models/LocationData;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "pmvmpeiblj", "yggfygwlhe", "jyumaefscl", "Lru/myspar/common/models/LocationData;", "iobyxmoadg", "()Lru/myspar/common/models/LocationData;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SearchAddress implements Parcelable {
    public static final Parcelable.Creator<SearchAddress> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData location;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shortAddress;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fullAddress;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SearchAddress createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new SearchAddress(parcel.readString(), parcel.readString(), (LocationData) parcel.readParcelable(SearchAddress.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SearchAddress[] newArray(int i13) {
            return new SearchAddress[i13];
        }
    }

    public SearchAddress(String fullAddress, String shortAddress, LocationData location) {
        zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
        zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
        zdlpuopuiu.btonecajqb(location, "location");
        this.fullAddress = fullAddress;
        this.shortAddress = shortAddress;
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
        if (!(other instanceof SearchAddress)) {
            return false;
        }
        SearchAddress searchAddress = (SearchAddress) other;
        return zdlpuopuiu.eablkybsjg(this.fullAddress, searchAddress.fullAddress) && zdlpuopuiu.eablkybsjg(this.shortAddress, searchAddress.shortAddress) && zdlpuopuiu.eablkybsjg(this.location, searchAddress.location);
    }

    public int hashCode() {
        return (((this.fullAddress.hashCode() * 31) + this.shortAddress.hashCode()) * 31) + this.location.hashCode();
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
    public final LocationData getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: jyumaefscl, reason: from getter */
    public final String getShortAddress() {
        return this.shortAddress;
    }

    /* JADX INFO: renamed from: pmvmpeiblj, reason: from getter */
    public final String getFullAddress() {
        return this.fullAddress;
    }

    public String toString() {
        return "SearchAddress(fullAddress=" + this.fullAddress + ", shortAddress=" + this.shortAddress + ", location=" + this.location + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.fullAddress);
        dest.writeString(this.shortAddress);
        dest.writeParcelable(this.location, flags);
    }
}
