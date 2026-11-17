package ru.myspar.core.domain.models.cart;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.core.domain.models.product.ProductLimit;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import t00.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\r¢\u0006\u0004\b#\u0010$J\u001d\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u000b¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b/\u0010,J\u001a\u00102\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010.R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010.R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b=\u0010AR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010,R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bM\u0010@\u001a\u0004\bN\u0010AR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bP\u0010ER\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u00105\u001a\u0004\b7\u0010.R\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bR\u0010@\u001a\u0004\bB\u0010AR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bS\u0010C\u001a\u0004\bR\u0010ER\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bT\u0010G\u001a\u0004\bT\u0010,R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u00105\u001a\u0004\bU\u0010.R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u00105\u001a\u0004\bS\u0010.R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u00105\u001a\u0004\bX\u0010.R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bY\u0010[R\u0017\u0010\u001b\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\\\u0010Z\u001a\u0004\bW\u0010[R\u0017\u0010\u001c\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b]\u0010Z\u001a\u0004\b\u001c\u0010[R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\r8\u0006¢\u0006\f\n\u0004\bf\u0010J\u001a\u0004\bg\u0010LR\u0011\u0010h\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bV\u0010[¨\u0006i"}, d2 = {"Lru/myspar/core/domain/models/cart/CartProduct;", "Landroid/os/Parcelable;", "", "id", "article", "Lt00/nufgyqmvbu;", "availability", ExternalMetricsManagerImpl.NAME, "", "price", "oldPrice", "", "percent", "", "Lru/myspar/catalog/api/hint/model/Hint;", "hints", "weight", "avgWeight", "pic", "quantity", "rating", "reviewsCount", "country", "region", "countryFlagEmoji", "", "isFavorite", "isDispPer100", "isDailyLimit", "Lru/myspar/core/domain/models/cart/AvailableInterval;", "availableInterval", "Lru/myspar/core/models/measure_type/MeasureTypeModel;", "measureTypeModel", "Lru/myspar/core/domain/models/product/ProductLimit;", "limits", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lt00/nufgyqmvbu;Ljava/lang/String;DLjava/lang/Double;ILjava/util/List;DLjava/lang/Double;Ljava/lang/String;DLjava/lang/Double;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLru/myspar/core/domain/models/cart/AvailableInterval;Lru/myspar/core/models/measure_type/MeasureTypeModel;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "zoijcleaow", "jyumaefscl", "Lt00/nufgyqmvbu;", "ppxfxbqfkf", "()Lt00/nufgyqmvbu;", "iwizpuwonk", "getName", "cqumvgiudr", "D", "()D", "esjtqupxsv", "Ljava/lang/Double;", "wflxmlrfwp", "()Ljava/lang/Double;", "lereixgezr", "I", "oxmwwwfdhm", "pmvmpeiblj", "Ljava/util/List;", "dxjokdxxww", "()Ljava/util/List;", "zynmafqrjb", "wwaezpbzkn", "istkbnxepw", "gxszxtbevo", "cdpycssgdh", "yadqdtsiqt", "iozdgvuglv", "lmojexxdyd", "lqeggnwhkg", "ylkuphrtab", "pkzmftpjix", "nufgyqmvbu", "hcddaimhww", "Z", "()Z", "jpowsppfya", "hkdspvbjdz", "cllcsxoeiz", "Lru/myspar/core/domain/models/cart/AvailableInterval;", "eablkybsjg", "()Lru/myspar/core/domain/models/cart/AvailableInterval;", "dsvhmnatus", "Lru/myspar/core/models/measure_type/MeasureTypeModel;", "gtknphoqwx", "()Lru/myspar/core/models/measure_type/MeasureTypeModel;", "wypolnanlu", "btonecajqb", "isAvailable", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CartProduct implements Parcelable {
    public static final Parcelable.Creator<CartProduct> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pic;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name and from kotlin metadata and from toString */
    private final AvailableInterval availableInterval;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measureTypeModel;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double oldPrice;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFavorite;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDailyLimit;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double rating;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double avgWeight;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDispPer100;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final nufgyqmvbu availability;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final int percent;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final int reviewsCount;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryFlagEmoji;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final List hints;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name and from kotlin metadata and from toString */
    private final List limits;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final String region;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final double weight;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CartProduct createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            nufgyqmvbu nufgyqmvbuVarValueOf = nufgyqmvbu.valueOf(parcel.readString());
            String string3 = parcel.readString();
            double d13 = parcel.readDouble();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(parcel.readParcelable(CartProduct.class.getClassLoader()));
            }
            double d14 = parcel.readDouble();
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string4 = parcel.readString();
            double d15 = parcel.readDouble();
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int i16 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            AvailableInterval availableIntervalCreateFromParcel = parcel.readInt() != 0 ? AvailableInterval.CREATOR.createFromParcel(parcel) : null;
            MeasureTypeModel measureTypeModel = (MeasureTypeModel) parcel.readParcelable(CartProduct.class.getClassLoader());
            int i17 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                arrayList2.add(ProductLimit.CREATOR.createFromParcel(parcel));
            }
            return new CartProduct(string, string2, nufgyqmvbuVarValueOf, string3, d13, dValueOf, i13, arrayList, d14, dValueOf2, string4, d15, dValueOf3, i16, string5, string6, string7, z13, z14, z15, availableIntervalCreateFromParcel, measureTypeModel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CartProduct[] newArray(int i13) {
            return new CartProduct[i13];
        }
    }

    public CartProduct(String id2, String article, nufgyqmvbu availability, String name, double d13, Double d14, int i13, List hints, double d15, Double d16, String str, double d17, Double d18, int i14, String country, String region, String str2, boolean z13, boolean z14, boolean z15, AvailableInterval availableInterval, MeasureTypeModel measureTypeModel, List limits) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(availability, "availability");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(country, "country");
        zdlpuopuiu.btonecajqb(region, "region");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        zdlpuopuiu.btonecajqb(limits, "limits");
        this.id = id2;
        this.article = article;
        this.availability = availability;
        this.name = name;
        this.price = d13;
        this.oldPrice = d14;
        this.percent = i13;
        this.hints = hints;
        this.weight = d15;
        this.avgWeight = d16;
        this.pic = str;
        this.quantity = d17;
        this.rating = d18;
        this.reviewsCount = i14;
        this.country = country;
        this.region = region;
        this.countryFlagEmoji = str2;
        this.isFavorite = z13;
        this.isDispPer100 = z14;
        this.isDailyLimit = z15;
        this.availableInterval = availableInterval;
        this.measureTypeModel = measureTypeModel;
        this.limits = limits;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final List getLimits() {
        return this.limits;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final List getHints() {
        return this.hints;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final AvailableInterval getAvailableInterval() {
        return this.availableInterval;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartProduct)) {
            return false;
        }
        CartProduct cartProduct = (CartProduct) other;
        return zdlpuopuiu.eablkybsjg(this.id, cartProduct.id) && zdlpuopuiu.eablkybsjg(this.article, cartProduct.article) && this.availability == cartProduct.availability && zdlpuopuiu.eablkybsjg(this.name, cartProduct.name) && Double.compare(this.price, cartProduct.price) == 0 && zdlpuopuiu.eablkybsjg(this.oldPrice, cartProduct.oldPrice) && this.percent == cartProduct.percent && zdlpuopuiu.eablkybsjg(this.hints, cartProduct.hints) && Double.compare(this.weight, cartProduct.weight) == 0 && zdlpuopuiu.eablkybsjg(this.avgWeight, cartProduct.avgWeight) && zdlpuopuiu.eablkybsjg(this.pic, cartProduct.pic) && Double.compare(this.quantity, cartProduct.quantity) == 0 && zdlpuopuiu.eablkybsjg(this.rating, cartProduct.rating) && this.reviewsCount == cartProduct.reviewsCount && zdlpuopuiu.eablkybsjg(this.country, cartProduct.country) && zdlpuopuiu.eablkybsjg(this.region, cartProduct.region) && zdlpuopuiu.eablkybsjg(this.countryFlagEmoji, cartProduct.countryFlagEmoji) && this.isFavorite == cartProduct.isFavorite && this.isDispPer100 == cartProduct.isDispPer100 && this.isDailyLimit == cartProduct.isDailyLimit && zdlpuopuiu.eablkybsjg(this.availableInterval, cartProduct.availableInterval) && zdlpuopuiu.eablkybsjg(this.measureTypeModel, cartProduct.measureTypeModel) && zdlpuopuiu.eablkybsjg(this.limits, cartProduct.limits);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final MeasureTypeModel getMeasureTypeModel() {
        return this.measureTypeModel;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Double getAvgWeight() {
        return this.avgWeight;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.article.hashCode()) * 31) + this.availability.hashCode()) * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.price)) * 31;
        Double d13 = this.oldPrice;
        int iHashCode2 = (((((((iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31) + Integer.hashCode(this.percent)) * 31) + this.hints.hashCode()) * 31) + Double.hashCode(this.weight)) * 31;
        Double d14 = this.avgWeight;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str = this.pic;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.quantity)) * 31;
        Double d15 = this.rating;
        int iHashCode5 = (((((((iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31) + Integer.hashCode(this.reviewsCount)) * 31) + this.country.hashCode()) * 31) + this.region.hashCode()) * 31;
        String str2 = this.countryFlagEmoji;
        int iHashCode6 = (((((((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isFavorite)) * 31) + Boolean.hashCode(this.isDispPer100)) * 31) + Boolean.hashCode(this.isDailyLimit)) * 31;
        AvailableInterval availableInterval = this.availableInterval;
        return ((((iHashCode6 + (availableInterval != null ? availableInterval.hashCode() : 0)) * 31) + this.measureTypeModel.hashCode()) * 31) + this.limits.hashCode();
    }

    /* JADX INFO: renamed from: hcddaimhww, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final int getReviewsCount() {
        return this.reviewsCount;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getCountryFlagEmoji() {
        return this.countryFlagEmoji;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final int getPercent() {
        return this.percent;
    }

    /* JADX INFO: renamed from: pkzmftpjix, reason: from getter */
    public final boolean getIsDispPer100() {
        return this.isDispPer100;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final nufgyqmvbu getAvailability() {
        return this.availability;
    }

    public String toString() {
        return "CartProduct(id=" + this.id + ", article=" + this.article + ", availability=" + this.availability + ", name=" + this.name + ", price=" + this.price + ", oldPrice=" + this.oldPrice + ", percent=" + this.percent + ", hints=" + this.hints + ", weight=" + this.weight + ", avgWeight=" + this.avgWeight + ", pic=" + this.pic + ", quantity=" + this.quantity + ", rating=" + this.rating + ", reviewsCount=" + this.reviewsCount + ", country=" + this.country + ", region=" + this.region + ", countryFlagEmoji=" + this.countryFlagEmoji + ", isFavorite=" + this.isFavorite + ", isDispPer100=" + this.isDispPer100 + ", isDailyLimit=" + this.isDailyLimit + ", availableInterval=" + this.availableInterval + ", measureTypeModel=" + this.measureTypeModel + ", limits=" + this.limits + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final Double getOldPrice() {
        return this.oldPrice;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.article);
        dest.writeString(this.availability.name());
        dest.writeString(this.name);
        dest.writeDouble(this.price);
        Double d13 = this.oldPrice;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        dest.writeInt(this.percent);
        List list = this.hints;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeDouble(this.weight);
        Double d14 = this.avgWeight;
        if (d14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d14.doubleValue());
        }
        dest.writeString(this.pic);
        dest.writeDouble(this.quantity);
        Double d15 = this.rating;
        if (d15 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d15.doubleValue());
        }
        dest.writeInt(this.reviewsCount);
        dest.writeString(this.country);
        dest.writeString(this.region);
        dest.writeString(this.countryFlagEmoji);
        dest.writeInt(this.isFavorite ? 1 : 0);
        dest.writeInt(this.isDispPer100 ? 1 : 0);
        dest.writeInt(this.isDailyLimit ? 1 : 0);
        AvailableInterval availableInterval = this.availableInterval;
        if (availableInterval == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            availableInterval.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.measureTypeModel, flags);
        List list2 = this.limits;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((ProductLimit) it2.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: wwaezpbzkn, reason: from getter */
    public final double getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    public final boolean ylkuphrtab() {
        return this.availability == nufgyqmvbu.AVAILABLE;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getArticle() {
        return this.article;
    }

    public /* synthetic */ CartProduct(String str, String str2, nufgyqmvbu nufgyqmvbuVar, String str3, double d13, Double d14, int i13, List list, double d15, Double d16, String str4, double d17, Double d18, int i14, String str5, String str6, String str7, boolean z13, boolean z14, boolean z15, AvailableInterval availableInterval, MeasureTypeModel measureTypeModel, List list2, int i15, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, nufgyqmvbuVar, str3, d13, d14, i13, list, d15, d16, str4, d17, d18, i14, str5, str6, str7, z13, (i15 & 262144) != 0 ? false : z14, (i15 & 524288) != 0 ? false : z15, (i15 & 1048576) != 0 ? null : availableInterval, measureTypeModel, list2);
    }
}
