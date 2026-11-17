package ru.myspar.proloyalty.core.domain.models.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b\r\u00105¨\u00066"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/order/FutureProduct;", "Landroid/os/Parcelable;", "", "article", ExternalMetricsManagerImpl.NAME, "", "price", "sum", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "measureTypeModel", "pic", "quantity", "", "isFavorite", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDLru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;Ljava/lang/String;DZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "getName", "jyumaefscl", "D", "gxszxtbevo", "()D", "iwizpuwonk", "nufgyqmvbu", "cqumvgiudr", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "esjtqupxsv", "eablkybsjg", "lereixgezr", "lqeggnwhkg", "pmvmpeiblj", "Z", "()Z", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FutureProduct implements Parcelable {
    public static final Parcelable.Creator<FutureProduct> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measureTypeModel;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pic;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final double sum;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFavorite;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final FutureProduct createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new FutureProduct(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), (MeasureTypeModel) parcel.readParcelable(FutureProduct.class.getClassLoader()), parcel.readString(), parcel.readDouble(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final FutureProduct[] newArray(int i13) {
            return new FutureProduct[i13];
        }
    }

    public FutureProduct(String article, String name, double d13, double d14, MeasureTypeModel measureTypeModel, String pic, double d15, boolean z13) {
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
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FutureProduct)) {
            return false;
        }
        FutureProduct futureProduct = (FutureProduct) other;
        return zdlpuopuiu.eablkybsjg(this.article, futureProduct.article) && zdlpuopuiu.eablkybsjg(this.name, futureProduct.name) && Double.compare(this.price, futureProduct.price) == 0 && Double.compare(this.sum, futureProduct.sum) == 0 && zdlpuopuiu.eablkybsjg(this.measureTypeModel, futureProduct.measureTypeModel) && zdlpuopuiu.eablkybsjg(this.pic, futureProduct.pic) && Double.compare(this.quantity, futureProduct.quantity) == 0 && this.isFavorite == futureProduct.isFavorite;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    public int hashCode() {
        return (((((((((((((this.article.hashCode() * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + Double.hashCode(this.sum)) * 31) + this.measureTypeModel.hashCode()) * 31) + this.pic.hashCode()) * 31) + Double.hashCode(this.quantity)) * 31) + Boolean.hashCode(this.isFavorite);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final double getSum() {
        return this.sum;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final MeasureTypeModel getMeasureTypeModel() {
        return this.measureTypeModel;
    }

    public String toString() {
        return "FutureProduct(article=" + this.article + ", name=" + this.name + ", price=" + this.price + ", sum=" + this.sum + ", measureTypeModel=" + this.measureTypeModel + ", pic=" + this.pic + ", quantity=" + this.quantity + ", isFavorite=" + this.isFavorite + ")";
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
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getArticle() {
        return this.article;
    }

    public /* synthetic */ FutureProduct(String str, String str2, double d13, double d14, MeasureTypeModel measureTypeModel, String str3, double d15, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? 0.0d : d13, (i13 & 8) != 0 ? 0.0d : d14, measureTypeModel, (i13 & 32) == 0 ? str3 : "", (i13 & 64) != 0 ? 0.0d : d15, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z13);
    }
}
