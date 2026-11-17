package ru.myspar.address.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes3.dex */
public final class AddressSearchResultHelper {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final iobyxmoadg f83789iobyxmoadg = new iobyxmoadg(null);

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/myspar/address/api/AddressSearchResultHelper$Result;", "Landroid/os/Parcelable;", "", "address", "Lru/myspar/common/models/LocationData;", "location", "<init>", "(Ljava/lang/String;Lru/myspar/common/models/LocationData;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getAddress", "yggfygwlhe", "Lru/myspar/common/models/LocationData;", "iobyxmoadg", "()Lru/myspar/common/models/LocationData;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocationData location;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String address;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Result createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Result(parcel.readString(), (LocationData) parcel.readParcelable(Result.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Result[] newArray(int i13) {
                return new Result[i13];
            }
        }

        public Result(String address, LocationData location) {
            zdlpuopuiu.btonecajqb(address, "address");
            zdlpuopuiu.btonecajqb(location, "location");
            this.address = address;
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
            return zdlpuopuiu.eablkybsjg(this.address, result.address) && zdlpuopuiu.eablkybsjg(this.location, result.location);
        }

        public int hashCode() {
            return (this.address.hashCode() * 31) + this.location.hashCode();
        }

        /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
        public final LocationData getLocation() {
            return this.location;
        }

        public String toString() {
            return "Result(address=" + this.address + ", location=" + this.location + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.address);
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

    public final Parcelable iobyxmoadg(String address, LocationData location) {
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(location, "location");
        return new Result(address, location);
    }

    public final String ppxfxbqfkf() {
        return "address_search_screen_result";
    }

    public final Result zoijcleaow(Object result) {
        zdlpuopuiu.btonecajqb(result, "result");
        if (result instanceof Result) {
            return (Result) result;
        }
        return null;
    }
}
