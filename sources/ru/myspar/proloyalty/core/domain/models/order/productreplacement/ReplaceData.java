package ru.myspar.proloyalty.core.domain.models.order.productreplacement;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b3\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010$\u001a\u0004\b<\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b>\u0010\u001cR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u0010$\u001a\u0004\b@\u0010\u001c¨\u0006A"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/order/productreplacement/ReplaceData;", "Landroid/os/Parcelable;", "", "id", ExternalMetricsManagerImpl.NAME, "", "quantity", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "measureTypeModel", "price", "pic", "rating", "", "reviewsCount", "country", "region", "countryFlagEmoji", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;DLjava/lang/String;Ljava/lang/Double;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "getName", "jyumaefscl", "D", "nufgyqmvbu", "()D", "iwizpuwonk", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "eablkybsjg", "()Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "cqumvgiudr", "lqeggnwhkg", "esjtqupxsv", "gxszxtbevo", "lereixgezr", "Ljava/lang/Double;", "dxjokdxxww", "()Ljava/lang/Double;", "pmvmpeiblj", "I", "gtknphoqwx", "zynmafqrjb", "zoijcleaow", "istkbnxepw", "btonecajqb", "cdpycssgdh", "ppxfxbqfkf", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReplaceData implements Parcelable {
    public static final Parcelable.Creator<ReplaceData> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryFlagEmoji;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pic;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final String region;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measureTypeModel;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double rating;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final int reviewsCount;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ReplaceData createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ReplaceData(parcel.readString(), parcel.readString(), parcel.readDouble(), (MeasureTypeModel) parcel.readParcelable(ReplaceData.class.getClassLoader()), parcel.readDouble(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ReplaceData[] newArray(int i13) {
            return new ReplaceData[i13];
        }
    }

    public ReplaceData(String id2, String name, double d13, MeasureTypeModel measureTypeModel, double d14, String pic, Double d15, int i13, String country, String region, String str) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        zdlpuopuiu.btonecajqb(pic, "pic");
        zdlpuopuiu.btonecajqb(country, "country");
        zdlpuopuiu.btonecajqb(region, "region");
        this.id = id2;
        this.name = name;
        this.quantity = d13;
        this.measureTypeModel = measureTypeModel;
        this.price = d14;
        this.pic = pic;
        this.rating = d15;
        this.reviewsCount = i13;
        this.country = country;
        this.region = region;
        this.countryFlagEmoji = str;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final MeasureTypeModel getMeasureTypeModel() {
        return this.measureTypeModel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplaceData)) {
            return false;
        }
        ReplaceData replaceData = (ReplaceData) other;
        return zdlpuopuiu.eablkybsjg(this.id, replaceData.id) && zdlpuopuiu.eablkybsjg(this.name, replaceData.name) && Double.compare(this.quantity, replaceData.quantity) == 0 && zdlpuopuiu.eablkybsjg(this.measureTypeModel, replaceData.measureTypeModel) && Double.compare(this.price, replaceData.price) == 0 && zdlpuopuiu.eablkybsjg(this.pic, replaceData.pic) && zdlpuopuiu.eablkybsjg(this.rating, replaceData.rating) && this.reviewsCount == replaceData.reviewsCount && zdlpuopuiu.eablkybsjg(this.country, replaceData.country) && zdlpuopuiu.eablkybsjg(this.region, replaceData.region) && zdlpuopuiu.eablkybsjg(this.countryFlagEmoji, replaceData.countryFlagEmoji);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final int getReviewsCount() {
        return this.reviewsCount;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.quantity)) * 31) + this.measureTypeModel.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + this.pic.hashCode()) * 31;
        Double d13 = this.rating;
        int iHashCode2 = (((((((iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31) + Integer.hashCode(this.reviewsCount)) * 31) + this.country.hashCode()) * 31) + this.region.hashCode()) * 31;
        String str = this.countryFlagEmoji;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getCountryFlagEmoji() {
        return this.countryFlagEmoji;
    }

    public String toString() {
        return "ReplaceData(id=" + this.id + ", name=" + this.name + ", quantity=" + this.quantity + ", measureTypeModel=" + this.measureTypeModel + ", price=" + this.price + ", pic=" + this.pic + ", rating=" + this.rating + ", reviewsCount=" + this.reviewsCount + ", country=" + this.country + ", region=" + this.region + ", countryFlagEmoji=" + this.countryFlagEmoji + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeDouble(this.quantity);
        dest.writeParcelable(this.measureTypeModel, flags);
        dest.writeDouble(this.price);
        dest.writeString(this.pic);
        Double d13 = this.rating;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        dest.writeInt(this.reviewsCount);
        dest.writeString(this.country);
        dest.writeString(this.region);
        dest.writeString(this.countryFlagEmoji);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getCountry() {
        return this.country;
    }
}
