package ru.myspar.proloyalty.address.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressMapResultHelper {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final iobyxmoadg f91810iobyxmoadg = new iobyxmoadg(null);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/myspar/proloyalty/address/api/AddressMapResultHelper$Result;", "Landroid/os/Parcelable;", "", "shortAddress", "fullAddress", "Lru/myspar/proloyalty/common/models/LocationData;", "location", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/common/models/LocationData;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "jyumaefscl", "yggfygwlhe", "pmvmpeiblj", "Lru/myspar/proloyalty/common/models/LocationData;", "iobyxmoadg", "()Lru/myspar/proloyalty/common/models/LocationData;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocationData location;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fullAddress;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String shortAddress;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Result createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Result(parcel.readString(), parcel.readString(), (LocationData) parcel.readParcelable(Result.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Result[] newArray(int i13) {
                return new Result[i13];
            }
        }

        public Result(String shortAddress, String fullAddress, LocationData location) {
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
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return zdlpuopuiu.eablkybsjg(this.shortAddress, result.shortAddress) && zdlpuopuiu.eablkybsjg(this.fullAddress, result.fullAddress) && zdlpuopuiu.eablkybsjg(this.location, result.location);
        }

        public int hashCode() {
            return (((this.shortAddress.hashCode() * 31) + this.fullAddress.hashCode()) * 31) + this.location.hashCode();
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
            return "Result(shortAddress=" + this.shortAddress + ", fullAddress=" + this.fullAddress + ", location=" + this.location + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.shortAddress);
            dest.writeString(this.fullAddress);
            dest.writeParcelable(this.location, flags);
        }
    }

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public final Parcelable iobyxmoadg(String shortAddress, String fullAddress, LocationData location) {
        zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
        zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
        zdlpuopuiu.btonecajqb(location, "location");
        return new Result(shortAddress, fullAddress, location);
    }

    public final String ppxfxbqfkf() {
        return "address_map_screen_result";
    }

    public final Result zoijcleaow(Object result) {
        zdlpuopuiu.btonecajqb(result, "result");
        if (result instanceof Result) {
            return (Result) result;
        }
        return null;
    }
}
