package ru.myspar.core.domain.models.restaurants;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.core.models.paging.Paging;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u001f¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b(\u0010%J\u001a\u0010+\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010'R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010'R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u0010'R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b7\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010.\u001a\u0004\b?\u0010'R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010.\u001a\u0004\b0\u0010'R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010.\u001a\u0004\bB\u0010'R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010.\u001a\u0004\bD\u0010'R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bE\u00109\u001a\u0004\bF\u0010;R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bG\u00109\u001a\u0004\bH\u0010;R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b\u0012\u0010KR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bL\u0010J\u001a\u0004\b\u0013\u0010KR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148\u0006¢\u0006\f\n\u0004\bQ\u0010N\u001a\u0004\bR\u0010PR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006W"}, d2 = {"Lru/myspar/core/domain/models/restaurants/RestaurantDetails;", "Landroid/os/Parcelable;", "", "code", ExternalMetricsManagerImpl.NAME, "logo", "image", "avgOrderTime", "", "minOrderSum", "deliveryPrice", "hours", "shortDescription", "deliveryDescription", "address", "lat", "lon", "", "isPickupAvailable", "isDeliveryAvailable", "", "Lru/myspar/core/domain/models/restaurants/RestaurantSection;", "sections", "Lru/myspar/core/domain/models/restaurants/RestaurantProduct;", "items", "Lru/myspar/core/models/paging/Paging;", "paging", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDZZLjava/util/List;Ljava/util/List;Lru/myspar/core/models/paging/Paging;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "getName", "jyumaefscl", "btonecajqb", "iwizpuwonk", "nufgyqmvbu", "cqumvgiudr", "ppxfxbqfkf", "esjtqupxsv", "D", "gtknphoqwx", "()D", "lereixgezr", "gxszxtbevo", "pmvmpeiblj", "lqeggnwhkg", "zynmafqrjb", "istkbnxepw", "getDeliveryDescription", "cdpycssgdh", "zoijcleaow", "yadqdtsiqt", "getLat", "iozdgvuglv", "getLon", "lmojexxdyd", "Z", "()Z", "wwaezpbzkn", "ylkuphrtab", "Ljava/util/List;", "oxmwwwfdhm", "()Ljava/util/List;", "pkzmftpjix", "dxjokdxxww", "hcddaimhww", "Lru/myspar/core/models/paging/Paging;", "wflxmlrfwp", "()Lru/myspar/core/models/paging/Paging;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RestaurantDetails implements Parcelable {
    public static final Parcelable.Creator<RestaurantDetails> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final String address;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String avgOrderTime;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final double minOrderSum;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final Paging paging;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final double lon;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryDescription;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String image;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String logo;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double deliveryPrice;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPickupAvailable;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final List items;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hours;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDeliveryAvailable;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final double lat;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final List sections;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shortDescription;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final RestaurantDetails createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            double d13 = parcel.readDouble();
            double d14 = parcel.readDouble();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            double d15 = parcel.readDouble();
            double d16 = parcel.readDouble();
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            boolean z15 = z13;
            ArrayList arrayList = new ArrayList(i13);
            int i14 = 0;
            while (i14 != i13) {
                arrayList.add(RestaurantSection.CREATOR.createFromParcel(parcel));
                i14++;
                i13 = i13;
            }
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            int i16 = 0;
            while (i16 != i15) {
                arrayList2.add(RestaurantProduct.CREATOR.createFromParcel(parcel));
                i16++;
                i15 = i15;
            }
            return new RestaurantDetails(string, string2, string3, string4, string5, d13, d14, string6, string7, string8, string9, d15, d16, z15, z14, arrayList, arrayList2, (Paging) parcel.readParcelable(RestaurantDetails.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final RestaurantDetails[] newArray(int i13) {
            return new RestaurantDetails[i13];
        }
    }

    public RestaurantDetails(String code, String name, String logo, String image, String avgOrderTime, double d13, double d14, String hours, String shortDescription, String deliveryDescription, String address, double d15, double d16, boolean z13, boolean z14, List sections, List items, Paging paging) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(logo, "logo");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(avgOrderTime, "avgOrderTime");
        zdlpuopuiu.btonecajqb(hours, "hours");
        zdlpuopuiu.btonecajqb(shortDescription, "shortDescription");
        zdlpuopuiu.btonecajqb(deliveryDescription, "deliveryDescription");
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(sections, "sections");
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(paging, "paging");
        this.code = code;
        this.name = name;
        this.logo = logo;
        this.image = image;
        this.avgOrderTime = avgOrderTime;
        this.minOrderSum = d13;
        this.deliveryPrice = d14;
        this.hours = hours;
        this.shortDescription = shortDescription;
        this.deliveryDescription = deliveryDescription;
        this.address = address;
        this.lat = d15;
        this.lon = d16;
        this.isPickupAvailable = z13;
        this.isDeliveryAvailable = z14;
        this.sections = sections;
        this.items = items;
        this.paging = paging;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestaurantDetails)) {
            return false;
        }
        RestaurantDetails restaurantDetails = (RestaurantDetails) other;
        return zdlpuopuiu.eablkybsjg(this.code, restaurantDetails.code) && zdlpuopuiu.eablkybsjg(this.name, restaurantDetails.name) && zdlpuopuiu.eablkybsjg(this.logo, restaurantDetails.logo) && zdlpuopuiu.eablkybsjg(this.image, restaurantDetails.image) && zdlpuopuiu.eablkybsjg(this.avgOrderTime, restaurantDetails.avgOrderTime) && Double.compare(this.minOrderSum, restaurantDetails.minOrderSum) == 0 && Double.compare(this.deliveryPrice, restaurantDetails.deliveryPrice) == 0 && zdlpuopuiu.eablkybsjg(this.hours, restaurantDetails.hours) && zdlpuopuiu.eablkybsjg(this.shortDescription, restaurantDetails.shortDescription) && zdlpuopuiu.eablkybsjg(this.deliveryDescription, restaurantDetails.deliveryDescription) && zdlpuopuiu.eablkybsjg(this.address, restaurantDetails.address) && Double.compare(this.lat, restaurantDetails.lat) == 0 && Double.compare(this.lon, restaurantDetails.lon) == 0 && this.isPickupAvailable == restaurantDetails.isPickupAvailable && this.isDeliveryAvailable == restaurantDetails.isDeliveryAvailable && zdlpuopuiu.eablkybsjg(this.sections, restaurantDetails.sections) && zdlpuopuiu.eablkybsjg(this.items, restaurantDetails.items) && zdlpuopuiu.eablkybsjg(this.paging, restaurantDetails.paging);
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final double getMinOrderSum() {
        return this.minOrderSum;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final double getDeliveryPrice() {
        return this.deliveryPrice;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.logo.hashCode()) * 31) + this.image.hashCode()) * 31) + this.avgOrderTime.hashCode()) * 31) + Double.hashCode(this.minOrderSum)) * 31) + Double.hashCode(this.deliveryPrice)) * 31) + this.hours.hashCode()) * 31) + this.shortDescription.hashCode()) * 31) + this.deliveryDescription.hashCode()) * 31) + this.address.hashCode()) * 31) + Double.hashCode(this.lat)) * 31) + Double.hashCode(this.lon)) * 31) + Boolean.hashCode(this.isPickupAvailable)) * 31) + Boolean.hashCode(this.isDeliveryAvailable)) * 31) + this.sections.hashCode()) * 31) + this.items.hashCode()) * 31) + this.paging.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getHours() {
        return this.hours;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final List getSections() {
        return this.sections;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getAvgOrderTime() {
        return this.avgOrderTime;
    }

    public String toString() {
        return "RestaurantDetails(code=" + this.code + ", name=" + this.name + ", logo=" + this.logo + ", image=" + this.image + ", avgOrderTime=" + this.avgOrderTime + ", minOrderSum=" + this.minOrderSum + ", deliveryPrice=" + this.deliveryPrice + ", hours=" + this.hours + ", shortDescription=" + this.shortDescription + ", deliveryDescription=" + this.deliveryDescription + ", address=" + this.address + ", lat=" + this.lat + ", lon=" + this.lon + ", isPickupAvailable=" + this.isPickupAvailable + ", isDeliveryAvailable=" + this.isDeliveryAvailable + ", sections=" + this.sections + ", items=" + this.items + ", paging=" + this.paging + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final Paging getPaging() {
        return this.paging;
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
        dest.writeString(this.shortDescription);
        dest.writeString(this.deliveryDescription);
        dest.writeString(this.address);
        dest.writeDouble(this.lat);
        dest.writeDouble(this.lon);
        dest.writeInt(this.isPickupAvailable ? 1 : 0);
        dest.writeInt(this.isDeliveryAvailable ? 1 : 0);
        List list = this.sections;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((RestaurantSection) it.next()).writeToParcel(dest, flags);
        }
        List list2 = this.items;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((RestaurantProduct) it2.next()).writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.paging, flags);
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final String getShortDescription() {
        return this.shortDescription;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getAddress() {
        return this.address;
    }
}
