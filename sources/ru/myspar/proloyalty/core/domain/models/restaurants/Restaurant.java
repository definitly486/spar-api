package ru.myspar.proloyalty.core.domain.models.restaurants;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010\u001bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b\r\u00106R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b\u000e\u00106¨\u00068"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/restaurants/Restaurant;", "Landroid/os/Parcelable;", "", "code", ExternalMetricsManagerImpl.NAME, "logo", "image", "avgOrderTime", "", "minOrderSum", "deliveryPrice", "hours", "", "isPickupAvailable", "isDeliveryAvailable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ppxfxbqfkf", "yggfygwlhe", "getName", "jyumaefscl", "gxszxtbevo", "iwizpuwonk", "eablkybsjg", "cqumvgiudr", "zoijcleaow", "esjtqupxsv", "D", "lqeggnwhkg", "()D", "lereixgezr", "getDeliveryPrice", "pmvmpeiblj", "getHours", "zynmafqrjb", "Z", "()Z", "istkbnxepw", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Restaurant implements Parcelable {
    public static final Parcelable.Creator<Restaurant> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String avgOrderTime;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final double minOrderSum;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDeliveryAvailable;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String image;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String logo;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double deliveryPrice;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hours;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPickupAvailable;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Restaurant createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new Restaurant(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Restaurant[] newArray(int i13) {
            return new Restaurant[i13];
        }
    }

    public Restaurant(String code, String name, String logo, String image, String avgOrderTime, double d13, double d14, String hours, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(logo, "logo");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(avgOrderTime, "avgOrderTime");
        zdlpuopuiu.btonecajqb(hours, "hours");
        this.code = code;
        this.name = name;
        this.logo = logo;
        this.image = image;
        this.avgOrderTime = avgOrderTime;
        this.minOrderSum = d13;
        this.deliveryPrice = d14;
        this.hours = hours;
        this.isPickupAvailable = z13;
        this.isDeliveryAvailable = z14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Restaurant)) {
            return false;
        }
        Restaurant restaurant = (Restaurant) other;
        return zdlpuopuiu.eablkybsjg(this.code, restaurant.code) && zdlpuopuiu.eablkybsjg(this.name, restaurant.name) && zdlpuopuiu.eablkybsjg(this.logo, restaurant.logo) && zdlpuopuiu.eablkybsjg(this.image, restaurant.image) && zdlpuopuiu.eablkybsjg(this.avgOrderTime, restaurant.avgOrderTime) && Double.compare(this.minOrderSum, restaurant.minOrderSum) == 0 && Double.compare(this.deliveryPrice, restaurant.deliveryPrice) == 0 && zdlpuopuiu.eablkybsjg(this.hours, restaurant.hours) && this.isPickupAvailable == restaurant.isPickupAvailable && this.isDeliveryAvailable == restaurant.isDeliveryAvailable;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    public int hashCode() {
        return (((((((((((((((((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.logo.hashCode()) * 31) + this.image.hashCode()) * 31) + this.avgOrderTime.hashCode()) * 31) + Double.hashCode(this.minOrderSum)) * 31) + Double.hashCode(this.deliveryPrice)) * 31) + this.hours.hashCode()) * 31) + Boolean.hashCode(this.isPickupAvailable)) * 31) + Boolean.hashCode(this.isDeliveryAvailable);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final double getMinOrderSum() {
        return this.minOrderSum;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public String toString() {
        return "Restaurant(code=" + this.code + ", name=" + this.name + ", logo=" + this.logo + ", image=" + this.image + ", avgOrderTime=" + this.avgOrderTime + ", minOrderSum=" + this.minOrderSum + ", deliveryPrice=" + this.deliveryPrice + ", hours=" + this.hours + ", isPickupAvailable=" + this.isPickupAvailable + ", isDeliveryAvailable=" + this.isDeliveryAvailable + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.name);
        dest.writeString(this.logo);
        dest.writeString(this.image);
        dest.writeString(this.avgOrderTime);
        dest.writeDouble(this.minOrderSum);
        dest.writeDouble(this.deliveryPrice);
        dest.writeString(this.hours);
        dest.writeInt(this.isPickupAvailable ? 1 : 0);
        dest.writeInt(this.isDeliveryAvailable ? 1 : 0);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getAvgOrderTime() {
        return this.avgOrderTime;
    }
}
