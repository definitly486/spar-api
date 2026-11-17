package ru.myspar.proloyalty.core.domain.models.comboset;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010\u0017¨\u0006/"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/comboset/ComboSetProduct;", "Landroid/os/Parcelable;", "", "id", "article", ExternalMetricsManagerImpl.NAME, "", "price", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "measure", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "zoijcleaow", "jyumaefscl", "getName", "iwizpuwonk", "D", "eablkybsjg", "()D", "cqumvgiudr", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "esjtqupxsv", "ojitshcjhn", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ComboSetProduct implements Parcelable {
    public static final Parcelable.Creator<ComboSetProduct> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measure;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ComboSetProduct createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ComboSetProduct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), (MeasureTypeModel) parcel.readParcelable(ComboSetProduct.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ComboSetProduct[] newArray(int i13) {
            return new ComboSetProduct[i13];
        }
    }

    public ComboSetProduct(String id2, String article, String name, double d13, MeasureTypeModel measure, String str) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(measure, "measure");
        this.id = id2;
        this.article = article;
        this.name = name;
        this.price = d13;
        this.measure = measure;
        this.imageUrl = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComboSetProduct)) {
            return false;
        }
        ComboSetProduct comboSetProduct = (ComboSetProduct) other;
        return zdlpuopuiu.eablkybsjg(this.id, comboSetProduct.id) && zdlpuopuiu.eablkybsjg(this.article, comboSetProduct.article) && zdlpuopuiu.eablkybsjg(this.name, comboSetProduct.name) && Double.compare(this.price, comboSetProduct.price) == 0 && zdlpuopuiu.eablkybsjg(this.measure, comboSetProduct.measure) && zdlpuopuiu.eablkybsjg(this.imageUrl, comboSetProduct.imageUrl);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.article.hashCode()) * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + this.measure.hashCode()) * 31;
        String str = this.imageUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: ojitshcjhn, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final MeasureTypeModel getMeasure() {
        return this.measure;
    }

    public String toString() {
        return "ComboSetProduct(id=" + this.id + ", article=" + this.article + ", name=" + this.name + ", price=" + this.price + ", measure=" + this.measure + ", imageUrl=" + this.imageUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.article);
        dest.writeString(this.name);
        dest.writeDouble(this.price);
        dest.writeParcelable(this.measure, flags);
        dest.writeString(this.imageUrl);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getArticle() {
        return this.article;
    }
}
