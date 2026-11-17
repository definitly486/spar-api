package ru.myspar.core.domain.models.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010#\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b7\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bD\u00109\u001a\u0004\b(\u0010;R\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bE\u00109\u001a\u0004\bF\u0010;R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010\u001d¨\u0006J"}, d2 = {"Lru/myspar/core/domain/models/order/PurchaseHistoryProduct;", "Landroid/os/Parcelable;", "", "article", ExternalMetricsManagerImpl.NAME, "", "price", "sum", "Lru/myspar/core/models/measure_type/MeasureTypeModel;", "measureTypeModel", "pic", "quantity", "", "isFavorite", "rating", "", "reviews", "isOnlyPickup", "isAvailable", "userRating", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDLru/myspar/core/models/measure_type/MeasureTypeModel;Ljava/lang/String;DZLjava/lang/Double;Ljava/lang/Integer;ZZI)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "getName", "jyumaefscl", "D", "gxszxtbevo", "()D", "iwizpuwonk", "btonecajqb", "cqumvgiudr", "Lru/myspar/core/models/measure_type/MeasureTypeModel;", "ppxfxbqfkf", "()Lru/myspar/core/models/measure_type/MeasureTypeModel;", "esjtqupxsv", "eablkybsjg", "lereixgezr", "lqeggnwhkg", "pmvmpeiblj", "Z", "oxmwwwfdhm", "()Z", "zynmafqrjb", "Ljava/lang/Double;", "nufgyqmvbu", "()Ljava/lang/Double;", "istkbnxepw", "Ljava/lang/Integer;", "dxjokdxxww", "()Ljava/lang/Integer;", "cdpycssgdh", "yadqdtsiqt", "wflxmlrfwp", "iozdgvuglv", "I", "gtknphoqwx", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PurchaseHistoryProduct implements Parcelable {
    public static final Parcelable.Creator<PurchaseHistoryProduct> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOnlyPickup;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measureTypeModel;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pic;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final int userRating;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer reviews;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final double sum;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFavorite;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAvailable;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double rating;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PurchaseHistoryProduct createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new PurchaseHistoryProduct(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), (MeasureTypeModel) parcel.readParcelable(PurchaseHistoryProduct.class.getClassLoader()), parcel.readString(), parcel.readDouble(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PurchaseHistoryProduct[] newArray(int i13) {
            return new PurchaseHistoryProduct[i13];
        }
    }

    public PurchaseHistoryProduct(String article, String name, double d13, double d14, MeasureTypeModel measureTypeModel, String pic, double d15, boolean z13, Double d16, Integer num, boolean z14, boolean z15, int i13) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        zdlpuopuiu.btonecajqb(pic, "pic");
        this.article = article;
        this.name = name;
        this.price = d13;
        this.sum = d14;
        this.measureTypeModel = measureTypeModel;
        this.pic = pic;
        this.quantity = d15;
        this.isFavorite = z13;
        this.rating = d16;
        this.reviews = num;
        this.isOnlyPickup = z14;
        this.isAvailable = z15;
        this.userRating = i13;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final double getSum() {
        return this.sum;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final Integer getReviews() {
        return this.reviews;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseHistoryProduct)) {
            return false;
        }
        PurchaseHistoryProduct purchaseHistoryProduct = (PurchaseHistoryProduct) other;
        return zdlpuopuiu.eablkybsjg(this.article, purchaseHistoryProduct.article) && zdlpuopuiu.eablkybsjg(this.name, purchaseHistoryProduct.name) && Double.compare(this.price, purchaseHistoryProduct.price) == 0 && Double.compare(this.sum, purchaseHistoryProduct.sum) == 0 && zdlpuopuiu.eablkybsjg(this.measureTypeModel, purchaseHistoryProduct.measureTypeModel) && zdlpuopuiu.eablkybsjg(this.pic, purchaseHistoryProduct.pic) && Double.compare(this.quantity, purchaseHistoryProduct.quantity) == 0 && this.isFavorite == purchaseHistoryProduct.isFavorite && zdlpuopuiu.eablkybsjg(this.rating, purchaseHistoryProduct.rating) && zdlpuopuiu.eablkybsjg(this.reviews, purchaseHistoryProduct.reviews) && this.isOnlyPickup == purchaseHistoryProduct.isOnlyPickup && this.isAvailable == purchaseHistoryProduct.isAvailable && this.userRating == purchaseHistoryProduct.userRating;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final int getUserRating() {
        return this.userRating;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.article.hashCode() * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + Double.hashCode(this.sum)) * 31) + this.measureTypeModel.hashCode()) * 31) + this.pic.hashCode()) * 31) + Double.hashCode(this.quantity)) * 31) + Boolean.hashCode(this.isFavorite)) * 31;
        Double d13 = this.rating;
        int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        Integer num = this.reviews;
        return ((((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.isOnlyPickup)) * 31) + Boolean.hashCode(this.isAvailable)) * 31) + Integer.hashCode(this.userRating);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final MeasureTypeModel getMeasureTypeModel() {
        return this.measureTypeModel;
    }

    public String toString() {
        return "PurchaseHistoryProduct(article=" + this.article + ", name=" + this.name + ", price=" + this.price + ", sum=" + this.sum + ", measureTypeModel=" + this.measureTypeModel + ", pic=" + this.pic + ", quantity=" + this.quantity + ", isFavorite=" + this.isFavorite + ", rating=" + this.rating + ", reviews=" + this.reviews + ", isOnlyPickup=" + this.isOnlyPickup + ", isAvailable=" + this.isAvailable + ", userRating=" + this.userRating + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.article);
        dest.writeString(this.name);
        dest.writeDouble(this.price);
        dest.writeDouble(this.sum);
        dest.writeParcelable(this.measureTypeModel, flags);
        dest.writeString(this.pic);
        dest.writeDouble(this.quantity);
        dest.writeInt(this.isFavorite ? 1 : 0);
        Double d13 = this.rating;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        Integer num = this.reviews;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeInt(this.isOnlyPickup ? 1 : 0);
        dest.writeInt(this.isAvailable ? 1 : 0);
        dest.writeInt(this.userRating);
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final boolean getIsOnlyPickup() {
        return this.isOnlyPickup;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getArticle() {
        return this.article;
    }

    public /* synthetic */ PurchaseHistoryProduct(String str, String str2, double d13, double d14, MeasureTypeModel measureTypeModel, String str3, double d15, boolean z13, Double d16, Integer num, boolean z14, boolean z15, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? 0.0d : d13, (i14 & 8) != 0 ? 0.0d : d14, measureTypeModel, (i14 & 32) == 0 ? str3 : "", (i14 & 64) != 0 ? 0.0d : d15, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z13, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : d16, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num, z14, z15, (i14 & 4096) != 0 ? 0 : i13);
    }
}
