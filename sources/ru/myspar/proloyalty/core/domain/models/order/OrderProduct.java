package ru.myspar.proloyalty.core.domain.models.order;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.proloyalty.core.domain.models.order.productreplacement.ReplaceData;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\f¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010&J\u001a\u0010,\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010(R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u0010(R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b1\u00107R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u00107R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\b?\u00107R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u00107R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010/\u001a\u0004\bG\u0010(R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bL\u0010;\u001a\u0004\b5\u0010=R\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bM\u0010&R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010/\u001a\u0004\bO\u0010(R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010/\u001a\u0004\b:\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010/\u001a\u0004\bR\u0010(R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bL\u0010UR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00168\u0006¢\u0006\f\n\u0004\bV\u0010T\u001a\u0004\bW\u0010UR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/order/OrderProduct;", "Landroid/os/Parcelable;", "", "id", "article", ExternalMetricsManagerImpl.NAME, "", "quantity", "price", "oldPrice", "sum", "oldSum", "", "discount", "pic", "", "available", "rating", "reviewsCount", "country", "region", "countryFlagEmoji", "", "Lru/myspar/proloyalty/core/domain/models/order/productreplacement/ReplaceData;", "replaces", "Lru/myspar/proloyalty/catalog/api/hint/model/Hint;", "hints", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "measureTypeModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/Double;DDLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/Double;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "zoijcleaow", "jyumaefscl", "getName", "iwizpuwonk", "D", "()D", "cqumvgiudr", "oxmwwwfdhm", "esjtqupxsv", "Ljava/lang/Double;", "btonecajqb", "()Ljava/lang/Double;", "lereixgezr", "lmojexxdyd", "pmvmpeiblj", "gtknphoqwx", "zynmafqrjb", "Ljava/lang/Integer;", "lqeggnwhkg", "()Ljava/lang/Integer;", "istkbnxepw", "wflxmlrfwp", "cdpycssgdh", "Z", "ppxfxbqfkf", "()Z", "yadqdtsiqt", "iozdgvuglv", "I", "eablkybsjg", "wwaezpbzkn", "ylkuphrtab", "gxszxtbevo", "pkzmftpjix", "Ljava/util/List;", "()Ljava/util/List;", "hcddaimhww", "nufgyqmvbu", "jpowsppfya", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "dxjokdxxww", "()Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrderProduct implements Parcelable {
    public static final Parcelable.Creator<OrderProduct> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean available;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double oldPrice;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final List hints;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final int reviewsCount;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pic;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measureTypeModel;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double sum;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final List replaces;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final double oldSum;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final String region;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double rating;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryFlagEmoji;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer discount;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final OrderProduct createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            double d13 = parcel.readDouble();
            double d14 = parcel.readDouble();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            double d15 = parcel.readDouble();
            double d16 = parcel.readDouble();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            Double dValueOf2 = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
            int i13 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i14 = parcel.readInt();
            boolean z14 = z13;
            ArrayList arrayList = new ArrayList(i14);
            Integer num = numValueOf;
            int i15 = 0;
            while (i15 != i14) {
                arrayList.add(ReplaceData.CREATOR.createFromParcel(parcel));
                i15++;
                i14 = i14;
            }
            int i16 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i16);
            int i17 = 0;
            while (i17 != i16) {
                arrayList2.add(parcel.readParcelable(OrderProduct.class.getClassLoader()));
                i17++;
                i16 = i16;
            }
            return new OrderProduct(string, string2, string3, d13, d14, dValueOf, d15, d16, num, string4, z14, dValueOf2, i13, string5, string6, string7, arrayList, arrayList2, (MeasureTypeModel) parcel.readParcelable(OrderProduct.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final OrderProduct[] newArray(int i13) {
            return new OrderProduct[i13];
        }
    }

    public OrderProduct(String id2, String article, String name, double d13, double d14, Double d15, double d16, double d17, Integer num, String pic, boolean z13, Double d18, int i13, String country, String region, String str, List replaces, List hints, MeasureTypeModel measureTypeModel) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(pic, "pic");
        zdlpuopuiu.btonecajqb(country, "country");
        zdlpuopuiu.btonecajqb(region, "region");
        zdlpuopuiu.btonecajqb(replaces, "replaces");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        this.id = id2;
        this.article = article;
        this.name = name;
        this.quantity = d13;
        this.price = d14;
        this.oldPrice = d15;
        this.sum = d16;
        this.oldSum = d17;
        this.discount = num;
        this.pic = pic;
        this.available = z13;
        this.rating = d18;
        this.reviewsCount = i13;
        this.country = country;
        this.region = region;
        this.countryFlagEmoji = str;
        this.replaces = replaces;
        this.hints = hints;
        this.measureTypeModel = measureTypeModel;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final Double getOldPrice() {
        return this.oldPrice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final MeasureTypeModel getMeasureTypeModel() {
        return this.measureTypeModel;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderProduct)) {
            return false;
        }
        OrderProduct orderProduct = (OrderProduct) other;
        return zdlpuopuiu.eablkybsjg(this.id, orderProduct.id) && zdlpuopuiu.eablkybsjg(this.article, orderProduct.article) && zdlpuopuiu.eablkybsjg(this.name, orderProduct.name) && Double.compare(this.quantity, orderProduct.quantity) == 0 && Double.compare(this.price, orderProduct.price) == 0 && zdlpuopuiu.eablkybsjg(this.oldPrice, orderProduct.oldPrice) && Double.compare(this.sum, orderProduct.sum) == 0 && Double.compare(this.oldSum, orderProduct.oldSum) == 0 && zdlpuopuiu.eablkybsjg(this.discount, orderProduct.discount) && zdlpuopuiu.eablkybsjg(this.pic, orderProduct.pic) && this.available == orderProduct.available && zdlpuopuiu.eablkybsjg(this.rating, orderProduct.rating) && this.reviewsCount == orderProduct.reviewsCount && zdlpuopuiu.eablkybsjg(this.country, orderProduct.country) && zdlpuopuiu.eablkybsjg(this.region, orderProduct.region) && zdlpuopuiu.eablkybsjg(this.countryFlagEmoji, orderProduct.countryFlagEmoji) && zdlpuopuiu.eablkybsjg(this.replaces, orderProduct.replaces) && zdlpuopuiu.eablkybsjg(this.hints, orderProduct.hints) && zdlpuopuiu.eablkybsjg(this.measureTypeModel, orderProduct.measureTypeModel);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final double getOldSum() {
        return this.oldSum;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getCountryFlagEmoji() {
        return this.countryFlagEmoji;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.article.hashCode()) * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.quantity)) * 31) + Double.hashCode(this.price)) * 31;
        Double d13 = this.oldPrice;
        int iHashCode2 = (((((iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31) + Double.hashCode(this.sum)) * 31) + Double.hashCode(this.oldSum)) * 31;
        Integer num = this.discount;
        int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.pic.hashCode()) * 31) + Boolean.hashCode(this.available)) * 31;
        Double d14 = this.rating;
        int iHashCode4 = (((((((iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31) + Integer.hashCode(this.reviewsCount)) * 31) + this.country.hashCode()) * 31) + this.region.hashCode()) * 31;
        String str = this.countryFlagEmoji;
        return ((((((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.replaces.hashCode()) * 31) + this.hints.hashCode()) * 31) + this.measureTypeModel.hashCode();
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final int getReviewsCount() {
        return this.reviewsCount;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final double getSum() {
        return this.sum;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final Integer getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final List getHints() {
        return this.hints;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    public String toString() {
        return "OrderProduct(id=" + this.id + ", article=" + this.article + ", name=" + this.name + ", quantity=" + this.quantity + ", price=" + this.price + ", oldPrice=" + this.oldPrice + ", sum=" + this.sum + ", oldSum=" + this.oldSum + ", discount=" + this.discount + ", pic=" + this.pic + ", available=" + this.available + ", rating=" + this.rating + ", reviewsCount=" + this.reviewsCount + ", country=" + this.country + ", region=" + this.region + ", countryFlagEmoji=" + this.countryFlagEmoji + ", replaces=" + this.replaces + ", hints=" + this.hints + ", measureTypeModel=" + this.measureTypeModel + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.article);
        dest.writeString(this.name);
        dest.writeDouble(this.quantity);
        dest.writeDouble(this.price);
        Double d13 = this.oldPrice;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        dest.writeDouble(this.sum);
        dest.writeDouble(this.oldSum);
        Integer num = this.discount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.pic);
        dest.writeInt(this.available ? 1 : 0);
        Double d14 = this.rating;
        if (d14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d14.doubleValue());
        }
        dest.writeInt(this.reviewsCount);
        dest.writeString(this.country);
        dest.writeString(this.region);
        dest.writeString(this.countryFlagEmoji);
        List list = this.replaces;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ReplaceData) it.next()).writeToParcel(dest, flags);
        }
        List list2 = this.hints;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        dest.writeParcelable(this.measureTypeModel, flags);
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final List getReplaces() {
        return this.replaces;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getArticle() {
        return this.article;
    }
}
