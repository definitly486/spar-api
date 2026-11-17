package ru.myspar.purchases_list.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001B×\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\u001d\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\t¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u0090\u0002\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b/\u0010*J\u001a\u00102\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010.R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010.R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b7\u0010AR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010K\u001a\u0004\bO\u0010MR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bT\u0010@\u001a\u0004\bU\u0010AR\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010K\u001a\u0004\bV\u0010MR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u00105\u001a\u0004\bB\u0010.R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bX\u0010<\u001a\u0004\bW\u0010>R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u00105\u001a\u0004\bZ\u0010.R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b[\u00105\u001a\u0004\bY\u0010.R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\\\u00105\u001a\u0004\b]\u0010.R\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\b^\u0010MR\u0017\u0010\u001b\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b^\u0010K\u001a\u0004\b\\\u0010MR\u0017\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b_\u0010K\u001a\u0004\b`\u0010MR\u0017\u0010\u001d\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bV\u0010K\u001a\u0004\b;\u0010MR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\ba\u0010@\u001a\u0004\bX\u0010AR\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\b[\u0010*R\u0017\u0010 \u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bd\u0010K\u001a\u0004\b \u0010M¨\u0006e"}, d2 = {"Lru/myspar/purchases_list/api/models/PurchaseProduct;", "Landroid/os/Parcelable;", "", "id", "article", ExternalMetricsManagerImpl.NAME, "", "price", "oldPrice", "", "discount", "", "Lru/myspar/catalog/api/hint/model/Hint;", "hints", "", "hidePrice", "isDispPer100", "Lru/myspar/core/models/measure_type/MeasureTypeModel;", "measureTypeModel", "avgWeight", "isProductWithZeroPrice", "pic", "quantity", "country", "region", "countryFlagEmoji", "isFavorite", "isAvailable", "availableOnlyForPickup", "onlyInShop", "rating", "reviews", "isInPiece", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;Ljava/util/List;ZZLru/myspar/core/models/measure_type/MeasureTypeModel;Ljava/lang/Double;ZLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Double;IZ)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;Ljava/util/List;ZZLru/myspar/core/models/measure_type/MeasureTypeModel;Ljava/lang/Double;ZLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Double;IZ)Lru/myspar/purchases_list/api/models/PurchaseProduct;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "eablkybsjg", "jyumaefscl", "getName", "iwizpuwonk", "D", "yadqdtsiqt", "()D", "cqumvgiudr", "Ljava/lang/Double;", "()Ljava/lang/Double;", "esjtqupxsv", "Ljava/lang/Integer;", "btonecajqb", "()Ljava/lang/Integer;", "lereixgezr", "Ljava/util/List;", "wflxmlrfwp", "()Ljava/util/List;", "pmvmpeiblj", "Z", "gtknphoqwx", "()Z", "zynmafqrjb", "hcddaimhww", "istkbnxepw", "Lru/myspar/core/models/measure_type/MeasureTypeModel;", "oxmwwwfdhm", "()Lru/myspar/core/models/measure_type/MeasureTypeModel;", "cdpycssgdh", "lqeggnwhkg", "cllcsxoeiz", "iozdgvuglv", "lmojexxdyd", "wwaezpbzkn", "nufgyqmvbu", "ylkuphrtab", "pkzmftpjix", "dxjokdxxww", "jpowsppfya", "hkdspvbjdz", "gxszxtbevo", "dsvhmnatus", "wypolnanlu", "I", "stevsuqkhv", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PurchaseProduct implements Parcelable {
    public static final Parcelable.Creator<PurchaseProduct> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double avgWeight;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean onlyInShop;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double oldPrice;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double rating;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer discount;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFavorite;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean availableOnlyForPickup;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pic;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measureTypeModel;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAvailable;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List hints;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryFlagEmoji;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hidePrice;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isInPiece;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name and from kotlin metadata and from toString */
    private final int reviews;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isProductWithZeroPrice;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final String region;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDispPer100;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PurchaseProduct createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            double d13 = parcel.readDouble();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(PurchaseProduct.class.getClassLoader()));
            }
            return new PurchaseProduct(string, string2, string3, d13, dValueOf, numValueOf, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, (MeasureTypeModel) parcel.readParcelable(PurchaseProduct.class.getClassLoader()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0, parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PurchaseProduct[] newArray(int i13) {
            return new PurchaseProduct[i13];
        }
    }

    public PurchaseProduct(String id2, String article, String name, double d13, Double d14, Integer num, List hints, boolean z13, boolean z14, MeasureTypeModel measureTypeModel, Double d15, boolean z15, String pic, double d16, String country, String region, String str, boolean z16, boolean z17, boolean z18, boolean z19, Double d17, int i13, boolean z23) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        zdlpuopuiu.btonecajqb(pic, "pic");
        zdlpuopuiu.btonecajqb(country, "country");
        zdlpuopuiu.btonecajqb(region, "region");
        this.id = id2;
        this.article = article;
        this.name = name;
        this.price = d13;
        this.oldPrice = d14;
        this.discount = num;
        this.hints = hints;
        this.hidePrice = z13;
        this.isDispPer100 = z14;
        this.measureTypeModel = measureTypeModel;
        this.avgWeight = d15;
        this.isProductWithZeroPrice = z15;
        this.pic = pic;
        this.quantity = d16;
        this.country = country;
        this.region = region;
        this.countryFlagEmoji = str;
        this.isFavorite = z16;
        this.isAvailable = z17;
        this.availableOnlyForPickup = z18;
        this.onlyInShop = z19;
        this.rating = d17;
        this.reviews = i13;
        this.isInPiece = z23;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final Integer getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: cllcsxoeiz, reason: from getter */
    public final boolean getIsProductWithZeroPrice() {
        return this.isProductWithZeroPrice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getCountryFlagEmoji() {
        return this.countryFlagEmoji;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getArticle() {
        return this.article;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseProduct)) {
            return false;
        }
        PurchaseProduct purchaseProduct = (PurchaseProduct) other;
        return zdlpuopuiu.eablkybsjg(this.id, purchaseProduct.id) && zdlpuopuiu.eablkybsjg(this.article, purchaseProduct.article) && zdlpuopuiu.eablkybsjg(this.name, purchaseProduct.name) && Double.compare(this.price, purchaseProduct.price) == 0 && zdlpuopuiu.eablkybsjg(this.oldPrice, purchaseProduct.oldPrice) && zdlpuopuiu.eablkybsjg(this.discount, purchaseProduct.discount) && zdlpuopuiu.eablkybsjg(this.hints, purchaseProduct.hints) && this.hidePrice == purchaseProduct.hidePrice && this.isDispPer100 == purchaseProduct.isDispPer100 && zdlpuopuiu.eablkybsjg(this.measureTypeModel, purchaseProduct.measureTypeModel) && zdlpuopuiu.eablkybsjg(this.avgWeight, purchaseProduct.avgWeight) && this.isProductWithZeroPrice == purchaseProduct.isProductWithZeroPrice && zdlpuopuiu.eablkybsjg(this.pic, purchaseProduct.pic) && Double.compare(this.quantity, purchaseProduct.quantity) == 0 && zdlpuopuiu.eablkybsjg(this.country, purchaseProduct.country) && zdlpuopuiu.eablkybsjg(this.region, purchaseProduct.region) && zdlpuopuiu.eablkybsjg(this.countryFlagEmoji, purchaseProduct.countryFlagEmoji) && this.isFavorite == purchaseProduct.isFavorite && this.isAvailable == purchaseProduct.isAvailable && this.availableOnlyForPickup == purchaseProduct.availableOnlyForPickup && this.onlyInShop == purchaseProduct.onlyInShop && zdlpuopuiu.eablkybsjg(this.rating, purchaseProduct.rating) && this.reviews == purchaseProduct.reviews && this.isInPiece == purchaseProduct.isInPiece;
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getHidePrice() {
        return this.hidePrice;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getAvailableOnlyForPickup() {
        return this.availableOnlyForPickup;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.article.hashCode()) * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.price)) * 31;
        Double d13 = this.oldPrice;
        int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        Integer num = this.discount;
        int iHashCode3 = (((((((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.hints.hashCode()) * 31) + Boolean.hashCode(this.hidePrice)) * 31) + Boolean.hashCode(this.isDispPer100)) * 31) + this.measureTypeModel.hashCode()) * 31;
        Double d14 = this.avgWeight;
        int iHashCode4 = (((((((((((iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31) + Boolean.hashCode(this.isProductWithZeroPrice)) * 31) + this.pic.hashCode()) * 31) + Double.hashCode(this.quantity)) * 31) + this.country.hashCode()) * 31) + this.region.hashCode()) * 31;
        String str = this.countryFlagEmoji;
        int iHashCode5 = (((((((((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isFavorite)) * 31) + Boolean.hashCode(this.isAvailable)) * 31) + Boolean.hashCode(this.availableOnlyForPickup)) * 31) + Boolean.hashCode(this.onlyInShop)) * 31;
        Double d15 = this.rating;
        return ((((iHashCode5 + (d15 != null ? d15.hashCode() : 0)) * 31) + Integer.hashCode(this.reviews)) * 31) + Boolean.hashCode(this.isInPiece);
    }

    /* JADX INFO: renamed from: hcddaimhww, reason: from getter */
    public final boolean getIsDispPer100() {
        return this.isDispPer100;
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final boolean getOnlyInShop() {
        return this.onlyInShop;
    }

    /* JADX INFO: renamed from: jpowsppfya, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final Double getAvgWeight() {
        return this.avgWeight;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final MeasureTypeModel getMeasureTypeModel() {
        return this.measureTypeModel;
    }

    /* JADX INFO: renamed from: pkzmftpjix, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    public String toString() {
        return "PurchaseProduct(id=" + this.id + ", article=" + this.article + ", name=" + this.name + ", price=" + this.price + ", oldPrice=" + this.oldPrice + ", discount=" + this.discount + ", hints=" + this.hints + ", hidePrice=" + this.hidePrice + ", isDispPer100=" + this.isDispPer100 + ", measureTypeModel=" + this.measureTypeModel + ", avgWeight=" + this.avgWeight + ", isProductWithZeroPrice=" + this.isProductWithZeroPrice + ", pic=" + this.pic + ", quantity=" + this.quantity + ", country=" + this.country + ", region=" + this.region + ", countryFlagEmoji=" + this.countryFlagEmoji + ", isFavorite=" + this.isFavorite + ", isAvailable=" + this.isAvailable + ", availableOnlyForPickup=" + this.availableOnlyForPickup + ", onlyInShop=" + this.onlyInShop + ", rating=" + this.rating + ", reviews=" + this.reviews + ", isInPiece=" + this.isInPiece + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final List getHints() {
        return this.hints;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.article);
        dest.writeString(this.name);
        dest.writeDouble(this.price);
        Double d13 = this.oldPrice;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        Integer num = this.discount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        List list = this.hints;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeInt(this.hidePrice ? 1 : 0);
        dest.writeInt(this.isDispPer100 ? 1 : 0);
        dest.writeParcelable(this.measureTypeModel, flags);
        Double d14 = this.avgWeight;
        if (d14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d14.doubleValue());
        }
        dest.writeInt(this.isProductWithZeroPrice ? 1 : 0);
        dest.writeString(this.pic);
        dest.writeDouble(this.quantity);
        dest.writeString(this.country);
        dest.writeString(this.region);
        dest.writeString(this.countryFlagEmoji);
        dest.writeInt(this.isFavorite ? 1 : 0);
        dest.writeInt(this.isAvailable ? 1 : 0);
        dest.writeInt(this.availableOnlyForPickup ? 1 : 0);
        dest.writeInt(this.onlyInShop ? 1 : 0);
        Double d15 = this.rating;
        if (d15 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d15.doubleValue());
        }
        dest.writeInt(this.reviews);
        dest.writeInt(this.isInPiece ? 1 : 0);
    }

    /* JADX INFO: renamed from: wwaezpbzkn, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final Double getOldPrice() {
        return this.oldPrice;
    }

    /* JADX INFO: renamed from: ylkuphrtab, reason: from getter */
    public final int getReviews() {
        return this.reviews;
    }

    public final PurchaseProduct zoijcleaow(String id2, String article, String name, double price, Double oldPrice, Integer discount, List hints, boolean hidePrice, boolean isDispPer100, MeasureTypeModel measureTypeModel, Double avgWeight, boolean isProductWithZeroPrice, String pic, double quantity, String country, String region, String countryFlagEmoji, boolean isFavorite, boolean isAvailable, boolean availableOnlyForPickup, boolean onlyInShop, Double rating, int reviews, boolean isInPiece) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        zdlpuopuiu.btonecajqb(pic, "pic");
        zdlpuopuiu.btonecajqb(country, "country");
        zdlpuopuiu.btonecajqb(region, "region");
        return new PurchaseProduct(id2, article, name, price, oldPrice, discount, hints, hidePrice, isDispPer100, measureTypeModel, avgWeight, isProductWithZeroPrice, pic, quantity, country, region, countryFlagEmoji, isFavorite, isAvailable, availableOnlyForPickup, onlyInShop, rating, reviews, isInPiece);
    }
}
