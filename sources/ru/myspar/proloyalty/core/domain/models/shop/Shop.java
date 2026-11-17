package ru.myspar.proloyalty.core.domain.models.shop;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mapkit.geometry.Point;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.proloyalty.core.domain.models.shop.Shop;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b#\u0010 J\u001a\u0010&\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R+\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\"R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u0010\"R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b:\u0010\"R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b;\u00103\u001a\u0004\b<\u0010\"R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b=\u00103\u001a\u0004\b>\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b?\u00103\u001a\u0004\b@\u0010\"R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bA\u00103\u001a\u0004\bB\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010FR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b\u0015\u0010MR!\u0010U\u001a\u00020N8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\bO\u0010P\u0012\u0004\bS\u0010T\u001a\u0004\bQ\u0010R¨\u0006V"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/shop/Shop;", "Landroid/os/Parcelable;", "", "", "services", "pics", "", "intervals", "xmlId", "region", "city", ExternalMetricsManagerImpl.NAME, "type", "address", "metro", "hours", "", "lat", "lng", "distanceFromUser", "", "isForPickup", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/util/List;", "gtknphoqwx", "()Ljava/util/List;", "yggfygwlhe", "getPics", "jyumaefscl", "Ljava/util/Map;", "getIntervals", "()Ljava/util/Map;", "iwizpuwonk", "Ljava/lang/String;", "oxmwwwfdhm", "cqumvgiudr", "getRegion", "esjtqupxsv", "getCity", "lereixgezr", "getName", "pmvmpeiblj", "wflxmlrfwp", "zynmafqrjb", "ppxfxbqfkf", "istkbnxepw", "dxjokdxxww", "cdpycssgdh", "gxszxtbevo", "yadqdtsiqt", "D", "lqeggnwhkg", "()D", "iozdgvuglv", "nufgyqmvbu", "lmojexxdyd", "eablkybsjg", "wwaezpbzkn", "Z", "()Z", "Lcom/yandex/mapkit/geometry/Point;", "ylkuphrtab", "Lgg/gtknphoqwx;", "btonecajqb", "()Lcom/yandex/mapkit/geometry/Point;", "getPoint$annotations", "()V", "point", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Shop implements Parcelable {
    public static final Parcelable.Creator<Shop> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hours;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String region;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final double lng;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final String metro;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String xmlId;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map intervals;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final double distanceFromUser;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isForPickup;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final double lat;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final List pics;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx point;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final List services;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String address;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Shop createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    linkedHashMap2.put(parcel.readString(), parcel.createStringArrayList());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Shop(arrayListCreateStringArrayList, arrayListCreateStringArrayList2, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Shop[] newArray(int i13) {
            return new Shop[i13];
        }
    }

    public Shop(List services, List pics, Map map, String xmlId, String region, String city, String name, String type, String address, String str, String hours, double d13, double d14, double d15, boolean z13) {
        zdlpuopuiu.btonecajqb(services, "services");
        zdlpuopuiu.btonecajqb(pics, "pics");
        zdlpuopuiu.btonecajqb(xmlId, "xmlId");
        zdlpuopuiu.btonecajqb(region, "region");
        zdlpuopuiu.btonecajqb(city, "city");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(hours, "hours");
        this.services = services;
        this.pics = pics;
        this.intervals = map;
        this.xmlId = xmlId;
        this.region = region;
        this.city = city;
        this.name = name;
        this.type = type;
        this.address = address;
        this.metro = str;
        this.hours = hours;
        this.lat = d13;
        this.lng = d14;
        this.distanceFromUser = d15;
        this.isForPickup = z13;
        this.point = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: h01.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Shop.yggfygwlhe(this.f39034zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point yggfygwlhe(Shop shop) {
        return new Point(shop.lat, shop.lng);
    }

    public final Point btonecajqb() {
        return (Point) this.point.getValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getMetro() {
        return this.metro;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final double getDistanceFromUser() {
        return this.distanceFromUser;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shop)) {
            return false;
        }
        Shop shop = (Shop) other;
        return zdlpuopuiu.eablkybsjg(this.services, shop.services) && zdlpuopuiu.eablkybsjg(this.pics, shop.pics) && zdlpuopuiu.eablkybsjg(this.intervals, shop.intervals) && zdlpuopuiu.eablkybsjg(this.xmlId, shop.xmlId) && zdlpuopuiu.eablkybsjg(this.region, shop.region) && zdlpuopuiu.eablkybsjg(this.city, shop.city) && zdlpuopuiu.eablkybsjg(this.name, shop.name) && zdlpuopuiu.eablkybsjg(this.type, shop.type) && zdlpuopuiu.eablkybsjg(this.address, shop.address) && zdlpuopuiu.eablkybsjg(this.metro, shop.metro) && zdlpuopuiu.eablkybsjg(this.hours, shop.hours) && Double.compare(this.lat, shop.lat) == 0 && Double.compare(this.lng, shop.lng) == 0 && Double.compare(this.distanceFromUser, shop.distanceFromUser) == 0 && this.isForPickup == shop.isForPickup;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final List getServices() {
        return this.services;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getHours() {
        return this.hours;
    }

    public int hashCode() {
        int iHashCode = ((this.services.hashCode() * 31) + this.pics.hashCode()) * 31;
        Map map = this.intervals;
        int iHashCode2 = (((((((((((((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.xmlId.hashCode()) * 31) + this.region.hashCode()) * 31) + this.city.hashCode()) * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + this.address.hashCode()) * 31;
        String str = this.metro;
        return ((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.hours.hashCode()) * 31) + Double.hashCode(this.lat)) * 31) + Double.hashCode(this.lng)) * 31) + Double.hashCode(this.distanceFromUser)) * 31) + Boolean.hashCode(this.isForPickup);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final double getLng() {
        return this.lng;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final String getXmlId() {
        return this.xmlId;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public String toString() {
        return "Shop(services=" + this.services + ", pics=" + this.pics + ", intervals=" + this.intervals + ", xmlId=" + this.xmlId + ", region=" + this.region + ", city=" + this.city + ", name=" + this.name + ", type=" + this.type + ", address=" + this.address + ", metro=" + this.metro + ", hours=" + this.hours + ", lat=" + this.lat + ", lng=" + this.lng + ", distanceFromUser=" + this.distanceFromUser + ", isForPickup=" + this.isForPickup + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeStringList(this.services);
        dest.writeStringList(this.pics);
        Map map = this.intervals;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                dest.writeString((String) entry.getKey());
                dest.writeStringList((List) entry.getValue());
            }
        }
        dest.writeString(this.xmlId);
        dest.writeString(this.region);
        dest.writeString(this.city);
        dest.writeString(this.name);
        dest.writeString(this.type);
        dest.writeString(this.address);
        dest.writeString(this.metro);
        dest.writeString(this.hours);
        dest.writeDouble(this.lat);
        dest.writeDouble(this.lng);
        dest.writeDouble(this.distanceFromUser);
        dest.writeInt(this.isForPickup ? 1 : 0);
    }

    public /* synthetic */ Shop(List list, List list2, Map map, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, double d13, double d14, double d15, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i13 & 4) != 0 ? null : map, (i13 & 8) != 0 ? "" : str, (i13 & 16) != 0 ? "" : str2, (i13 & 32) != 0 ? "" : str3, (i13 & 64) != 0 ? "" : str4, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str5, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? "" : str6, (i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? str7 : null, (i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0 ? str8 : "", (i13 & 2048) != 0 ? 0.0d : d13, (i13 & 4096) != 0 ? 0.0d : d14, (i13 & 8192) == 0 ? d15 : 0.0d, (i13 & 16384) != 0 ? false : z13);
    }
}
