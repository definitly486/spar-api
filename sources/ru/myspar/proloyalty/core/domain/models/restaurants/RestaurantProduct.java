package ru.myspar.proloyalty.core.domain.models.restaurants;

import android.os.Parcel;
import android.os.Parcelable;
import gz0.zoijcleaow;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.proloyalty.core.domain.models.BaseProduct;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJl\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u001a\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/restaurants/RestaurantProduct;", "Lru/myspar/proloyalty/core/domain/models/BaseProduct;", "", "id", "article", ExternalMetricsManagerImpl.NAME, "", "price", "photoUrl", "weight", "", "isDispPer100", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "measureTypeModel", "Lgz0/zoijcleaow;", "buyState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;DZLru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;Lgz0/zoijcleaow;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;DZLru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;Lgz0/zoijcleaow;)Lru/myspar/proloyalty/core/domain/models/restaurants/RestaurantProduct;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "eablkybsjg", "jyumaefscl", "getName", "iwizpuwonk", "D", "dxjokdxxww", "()D", "cqumvgiudr", "nufgyqmvbu", "esjtqupxsv", "btonecajqb", "lereixgezr", "Z", "gtknphoqwx", "()Z", "pmvmpeiblj", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "lqeggnwhkg", "()Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "zynmafqrjb", "Lgz0/zoijcleaow;", "gxszxtbevo", "()Lgz0/zoijcleaow;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RestaurantProduct implements BaseProduct {
    public static final Parcelable.Creator<RestaurantProduct> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String photoUrl;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final double weight;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDispPer100;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measureTypeModel;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow buyState;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final RestaurantProduct createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new RestaurantProduct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readDouble(), parcel.readInt() != 0, (MeasureTypeModel) parcel.readParcelable(RestaurantProduct.class.getClassLoader()), parcel.readInt() == 0 ? null : zoijcleaow.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final RestaurantProduct[] newArray(int i13) {
            return new RestaurantProduct[i13];
        }
    }

    public RestaurantProduct(String id2, String article, String name, double d13, String photoUrl, double d14, boolean z13, MeasureTypeModel measureTypeModel, zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(photoUrl, "photoUrl");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        this.id = id2;
        this.article = article;
        this.name = name;
        this.price = d13;
        this.photoUrl = photoUrl;
        this.weight = d14;
        this.isDispPer100 = z13;
        this.measureTypeModel = measureTypeModel;
        this.buyState = zoijcleaowVar;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final double getWeight() {
        return this.weight;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getArticle() {
        return this.article;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestaurantProduct)) {
            return false;
        }
        RestaurantProduct restaurantProduct = (RestaurantProduct) other;
        return zdlpuopuiu.eablkybsjg(this.id, restaurantProduct.id) && zdlpuopuiu.eablkybsjg(this.article, restaurantProduct.article) && zdlpuopuiu.eablkybsjg(this.name, restaurantProduct.name) && Double.compare(this.price, restaurantProduct.price) == 0 && zdlpuopuiu.eablkybsjg(this.photoUrl, restaurantProduct.photoUrl) && Double.compare(this.weight, restaurantProduct.weight) == 0 && this.isDispPer100 == restaurantProduct.isDispPer100 && zdlpuopuiu.eablkybsjg(this.measureTypeModel, restaurantProduct.measureTypeModel) && this.buyState == restaurantProduct.buyState;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getIsDispPer100() {
        return this.isDispPer100;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final zoijcleaow getBuyState() {
        return this.buyState;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.id.hashCode() * 31) + this.article.hashCode()) * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + this.photoUrl.hashCode()) * 31) + Double.hashCode(this.weight)) * 31) + Boolean.hashCode(this.isDispPer100)) * 31) + this.measureTypeModel.hashCode()) * 31;
        zoijcleaow zoijcleaowVar = this.buyState;
        return iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode());
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final MeasureTypeModel getMeasureTypeModel() {
        return this.measureTypeModel;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public String toString() {
        return "RestaurantProduct(id=" + this.id + ", article=" + this.article + ", name=" + this.name + ", price=" + this.price + ", photoUrl=" + this.photoUrl + ", weight=" + this.weight + ", isDispPer100=" + this.isDispPer100 + ", measureTypeModel=" + this.measureTypeModel + ", buyState=" + this.buyState + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.article);
        dest.writeString(this.name);
        dest.writeDouble(this.price);
        dest.writeString(this.photoUrl);
        dest.writeDouble(this.weight);
        dest.writeInt(this.isDispPer100 ? 1 : 0);
        dest.writeParcelable(this.measureTypeModel, flags);
        zoijcleaow zoijcleaowVar = this.buyState;
        if (zoijcleaowVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(zoijcleaowVar.name());
        }
    }

    public final RestaurantProduct zoijcleaow(String id2, String article, String name, double price, String photoUrl, double weight, boolean isDispPer100, MeasureTypeModel measureTypeModel, zoijcleaow buyState) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(photoUrl, "photoUrl");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        return new RestaurantProduct(id2, article, name, price, photoUrl, weight, isDispPer100, measureTypeModel, buyState);
    }
}
