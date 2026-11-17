package ru.myspar.core.domain.models.restaurants;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010?R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010?R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010&\u001a\u0004\bG\u0010\u001f¨\u0006H"}, d2 = {"Lru/myspar/core/domain/models/restaurants/RestaurantProductDetails;", "Landroid/os/Parcelable;", "", "id", "article", ExternalMetricsManagerImpl.NAME, "", "price", "photoUrl", "weight", "", "isDispPer100", "Lru/myspar/core/models/measure_type/MeasureTypeModel;", "measureTypeModel", "energy", "fats", "carbo", "protein", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;DZLru/myspar/core/models/measure_type/MeasureTypeModel;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "zoijcleaow", "jyumaefscl", "getName", "iwizpuwonk", "D", "btonecajqb", "()D", "cqumvgiudr", "dxjokdxxww", "esjtqupxsv", "wflxmlrfwp", "lereixgezr", "Z", "oxmwwwfdhm", "()Z", "pmvmpeiblj", "Lru/myspar/core/models/measure_type/MeasureTypeModel;", "nufgyqmvbu", "()Lru/myspar/core/models/measure_type/MeasureTypeModel;", "zynmafqrjb", "Ljava/lang/Double;", "gxszxtbevo", "()Ljava/lang/Double;", "istkbnxepw", "lqeggnwhkg", "cdpycssgdh", "ppxfxbqfkf", "yadqdtsiqt", "gtknphoqwx", "iozdgvuglv", "eablkybsjg", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RestaurantProductDetails implements Parcelable {
    public static final Parcelable.Creator<RestaurantProductDetails> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double carbo;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String photoUrl;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final double weight;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double fats;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDispPer100;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measureTypeModel;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double protein;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double energy;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final RestaurantProductDetails createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new RestaurantProductDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readDouble(), parcel.readInt() != 0, (MeasureTypeModel) parcel.readParcelable(RestaurantProductDetails.class.getClassLoader()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final RestaurantProductDetails[] newArray(int i13) {
            return new RestaurantProductDetails[i13];
        }
    }

    public RestaurantProductDetails(String id2, String article, String name, double d13, String photoUrl, double d14, boolean z13, MeasureTypeModel measureTypeModel, Double d15, Double d16, Double d17, Double d18, String description) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(photoUrl, "photoUrl");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        zdlpuopuiu.btonecajqb(description, "description");
        this.id = id2;
        this.article = article;
        this.name = name;
        this.price = d13;
        this.photoUrl = photoUrl;
        this.weight = d14;
        this.isDispPer100 = z13;
        this.measureTypeModel = measureTypeModel;
        this.energy = d15;
        this.fats = d16;
        this.carbo = d17;
        this.protein = d18;
        this.description = description;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestaurantProductDetails)) {
            return false;
        }
        RestaurantProductDetails restaurantProductDetails = (RestaurantProductDetails) other;
        return zdlpuopuiu.eablkybsjg(this.id, restaurantProductDetails.id) && zdlpuopuiu.eablkybsjg(this.article, restaurantProductDetails.article) && zdlpuopuiu.eablkybsjg(this.name, restaurantProductDetails.name) && Double.compare(this.price, restaurantProductDetails.price) == 0 && zdlpuopuiu.eablkybsjg(this.photoUrl, restaurantProductDetails.photoUrl) && Double.compare(this.weight, restaurantProductDetails.weight) == 0 && this.isDispPer100 == restaurantProductDetails.isDispPer100 && zdlpuopuiu.eablkybsjg(this.measureTypeModel, restaurantProductDetails.measureTypeModel) && zdlpuopuiu.eablkybsjg(this.energy, restaurantProductDetails.energy) && zdlpuopuiu.eablkybsjg(this.fats, restaurantProductDetails.fats) && zdlpuopuiu.eablkybsjg(this.carbo, restaurantProductDetails.carbo) && zdlpuopuiu.eablkybsjg(this.protein, restaurantProductDetails.protein) && zdlpuopuiu.eablkybsjg(this.description, restaurantProductDetails.description);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final Double getProtein() {
        return this.protein;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Double getEnergy() {
        return this.energy;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.id.hashCode() * 31) + this.article.hashCode()) * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + this.photoUrl.hashCode()) * 31) + Double.hashCode(this.weight)) * 31) + Boolean.hashCode(this.isDispPer100)) * 31) + this.measureTypeModel.hashCode()) * 31;
        Double d13 = this.energy;
        int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.fats;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.carbo;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.protein;
        return ((iHashCode4 + (d16 != null ? d16.hashCode() : 0)) * 31) + this.description.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final Double getFats() {
        return this.fats;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final MeasureTypeModel getMeasureTypeModel() {
        return this.measureTypeModel;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsDispPer100() {
        return this.isDispPer100;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final Double getCarbo() {
        return this.carbo;
    }

    public String toString() {
        return "RestaurantProductDetails(id=" + this.id + ", article=" + this.article + ", name=" + this.name + ", price=" + this.price + ", photoUrl=" + this.photoUrl + ", weight=" + this.weight + ", isDispPer100=" + this.isDispPer100 + ", measureTypeModel=" + this.measureTypeModel + ", energy=" + this.energy + ", fats=" + this.fats + ", carbo=" + this.carbo + ", protein=" + this.protein + ", description=" + this.description + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final double getWeight() {
        return this.weight;
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
        Double d13 = this.energy;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        Double d14 = this.fats;
        if (d14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d14.doubleValue());
        }
        Double d15 = this.carbo;
        if (d15 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d15.doubleValue());
        }
        Double d16 = this.protein;
        if (d16 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d16.doubleValue());
        }
        dest.writeString(this.description);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getArticle() {
        return this.article;
    }

    public /* synthetic */ RestaurantProductDetails(String str, String str2, String str3, double d13, String str4, double d14, boolean z13, MeasureTypeModel measureTypeModel, Double d15, Double d16, Double d17, Double d18, String str5, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? 0.0d : d13, (i13 & 16) != 0 ? "" : str4, (i13 & 32) == 0 ? d14 : 0.0d, (i13 & 64) != 0 ? false : z13, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? MeasureTypeModel.INSTANCE.iobyxmoadg() : measureTypeModel, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : d15, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : d16, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : d17, (i13 & 2048) != 0 ? null : d18, (i13 & 4096) == 0 ? str5 : "");
    }
}
