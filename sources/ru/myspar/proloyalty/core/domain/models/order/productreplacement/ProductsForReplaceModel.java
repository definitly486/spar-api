package ru.myspar.proloyalty.core.domain.models.order.productreplacement;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ¢\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u001a\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b8\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b+\u00106R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b7\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010)\u001a\u0004\bA\u0010\"R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010)\u001a\u0004\b1\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010)\u001a\u0004\bD\u0010\"R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\bC\u0010<R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/order/productreplacement/ProductsForReplaceModel;", "Landroid/os/Parcelable;", "", "article", ExternalMetricsManagerImpl.NAME, "", "quantity", "price", "oldPrice", "pic", "", "available", "rating", "", "reviewsCount", "country", "region", "countryFlagEmoji", "isChecked", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "measureTypeModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/Double;Ljava/lang/String;ZLjava/lang/Double;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/Double;Ljava/lang/String;ZLjava/lang/Double;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;)Lru/myspar/proloyalty/core/domain/models/order/productreplacement/ProductsForReplaceModel;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "getName", "jyumaefscl", "D", "oxmwwwfdhm", "()D", "iwizpuwonk", "wflxmlrfwp", "cqumvgiudr", "Ljava/lang/Double;", "btonecajqb", "()Ljava/lang/Double;", "esjtqupxsv", "gtknphoqwx", "lereixgezr", "Z", "gxszxtbevo", "()Z", "pmvmpeiblj", "zynmafqrjb", "I", "istkbnxepw", "lqeggnwhkg", "cdpycssgdh", "yadqdtsiqt", "nufgyqmvbu", "iozdgvuglv", "lmojexxdyd", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "dxjokdxxww", "()Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductsForReplaceModel implements Parcelable {
    public static final Parcelable.Creator<ProductsForReplaceModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final String region;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double oldPrice;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pic;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isChecked;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean available;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measureTypeModel;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double rating;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryFlagEmoji;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final int reviewsCount;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ProductsForReplaceModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ProductsForReplaceModel(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (MeasureTypeModel) parcel.readParcelable(ProductsForReplaceModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ProductsForReplaceModel[] newArray(int i13) {
            return new ProductsForReplaceModel[i13];
        }
    }

    public ProductsForReplaceModel(String article, String name, double d13, double d14, Double d15, String pic, boolean z13, Double d16, int i13, String country, String region, String str, boolean z14, MeasureTypeModel measureTypeModel) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(pic, "pic");
        zdlpuopuiu.btonecajqb(country, "country");
        zdlpuopuiu.btonecajqb(region, "region");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        this.article = article;
        this.name = name;
        this.quantity = d13;
        this.price = d14;
        this.oldPrice = d15;
        this.pic = pic;
        this.available = z13;
        this.rating = d16;
        this.reviewsCount = i13;
        this.country = country;
        this.region = region;
        this.countryFlagEmoji = str;
        this.isChecked = z14;
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
    public final String getArticle() {
        return this.article;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsForReplaceModel)) {
            return false;
        }
        ProductsForReplaceModel productsForReplaceModel = (ProductsForReplaceModel) other;
        return zdlpuopuiu.eablkybsjg(this.article, productsForReplaceModel.article) && zdlpuopuiu.eablkybsjg(this.name, productsForReplaceModel.name) && Double.compare(this.quantity, productsForReplaceModel.quantity) == 0 && Double.compare(this.price, productsForReplaceModel.price) == 0 && zdlpuopuiu.eablkybsjg(this.oldPrice, productsForReplaceModel.oldPrice) && zdlpuopuiu.eablkybsjg(this.pic, productsForReplaceModel.pic) && this.available == productsForReplaceModel.available && zdlpuopuiu.eablkybsjg(this.rating, productsForReplaceModel.rating) && this.reviewsCount == productsForReplaceModel.reviewsCount && zdlpuopuiu.eablkybsjg(this.country, productsForReplaceModel.country) && zdlpuopuiu.eablkybsjg(this.region, productsForReplaceModel.region) && zdlpuopuiu.eablkybsjg(this.countryFlagEmoji, productsForReplaceModel.countryFlagEmoji) && this.isChecked == productsForReplaceModel.isChecked && zdlpuopuiu.eablkybsjg(this.measureTypeModel, productsForReplaceModel.measureTypeModel);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final int getReviewsCount() {
        return this.reviewsCount;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    public int hashCode() {
        int iHashCode = ((((((this.article.hashCode() * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.quantity)) * 31) + Double.hashCode(this.price)) * 31;
        Double d13 = this.oldPrice;
        int iHashCode2 = (((((iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31) + this.pic.hashCode()) * 31) + Boolean.hashCode(this.available)) * 31;
        Double d14 = this.rating;
        int iHashCode3 = (((((((iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31) + Integer.hashCode(this.reviewsCount)) * 31) + this.country.hashCode()) * 31) + this.region.hashCode()) * 31;
        String str = this.countryFlagEmoji;
        return ((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isChecked)) * 31) + this.measureTypeModel.hashCode();
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final String getRegion() {
        return this.region;
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
    public final double getQuantity() {
        return this.quantity;
    }

    public String toString() {
        return "ProductsForReplaceModel(article=" + this.article + ", name=" + this.name + ", quantity=" + this.quantity + ", price=" + this.price + ", oldPrice=" + this.oldPrice + ", pic=" + this.pic + ", available=" + this.available + ", rating=" + this.rating + ", reviewsCount=" + this.reviewsCount + ", country=" + this.country + ", region=" + this.region + ", countryFlagEmoji=" + this.countryFlagEmoji + ", isChecked=" + this.isChecked + ", measureTypeModel=" + this.measureTypeModel + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
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
        dest.writeInt(this.isChecked ? 1 : 0);
        dest.writeParcelable(this.measureTypeModel, flags);
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    public final ProductsForReplaceModel zoijcleaow(String article, String name, double quantity, double price, Double oldPrice, String pic, boolean available, Double rating, int reviewsCount, String country, String region, String countryFlagEmoji, boolean isChecked, MeasureTypeModel measureTypeModel) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(pic, "pic");
        zdlpuopuiu.btonecajqb(country, "country");
        zdlpuopuiu.btonecajqb(region, "region");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        return new ProductsForReplaceModel(article, name, quantity, price, oldPrice, pic, available, rating, reviewsCount, country, region, countryFlagEmoji, isChecked, measureTypeModel);
    }
}
