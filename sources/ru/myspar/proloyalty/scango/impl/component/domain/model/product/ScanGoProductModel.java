package ru.myspar.proloyalty.scango.impl.component.domain.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH×\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoProductModel;", "Landroid/os/Parcelable;", "", "article", "", "id", "Lc21/iobyxmoadg;", "measure", ExternalMetricsManagerImpl.NAME, "pictureUrl", "", "price", "quantity", "", "markCodes", "<init>", "(Ljava/lang/String;ILc21/iobyxmoadg;Ljava/lang/String;Ljava/lang/String;DDLjava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "I", "ppxfxbqfkf", "jyumaefscl", "Lc21/iobyxmoadg;", "gxszxtbevo", "()Lc21/iobyxmoadg;", "iwizpuwonk", "getName", "cqumvgiudr", "lqeggnwhkg", "esjtqupxsv", "D", "nufgyqmvbu", "()D", "lereixgezr", "dxjokdxxww", "pmvmpeiblj", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ScanGoProductModel implements Parcelable {
    public static final Parcelable.Creator<ScanGoProductModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pictureUrl;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final c21.iobyxmoadg measure;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final List markCodes;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ScanGoProductModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ScanGoProductModel(parcel.readString(), parcel.readInt(), c21.iobyxmoadg.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ScanGoProductModel[] newArray(int i13) {
            return new ScanGoProductModel[i13];
        }
    }

    public ScanGoProductModel(String article, int i13, c21.iobyxmoadg measure, String name, String str, double d13, double d14, List markCodes) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(measure, "measure");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(markCodes, "markCodes");
        this.article = article;
        this.id = i13;
        this.measure = measure;
        this.name = name;
        this.pictureUrl = str;
        this.price = d13;
        this.quantity = d14;
        this.markCodes = markCodes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getMarkCodes() {
        return this.markCodes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScanGoProductModel)) {
            return false;
        }
        ScanGoProductModel scanGoProductModel = (ScanGoProductModel) other;
        return zdlpuopuiu.eablkybsjg(this.article, scanGoProductModel.article) && this.id == scanGoProductModel.id && this.measure == scanGoProductModel.measure && zdlpuopuiu.eablkybsjg(this.name, scanGoProductModel.name) && zdlpuopuiu.eablkybsjg(this.pictureUrl, scanGoProductModel.pictureUrl) && Double.compare(this.price, scanGoProductModel.price) == 0 && Double.compare(this.quantity, scanGoProductModel.quantity) == 0 && zdlpuopuiu.eablkybsjg(this.markCodes, scanGoProductModel.markCodes);
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final c21.iobyxmoadg getMeasure() {
        return this.measure;
    }

    public int hashCode() {
        int iHashCode = ((((((this.article.hashCode() * 31) + Integer.hashCode(this.id)) * 31) + this.measure.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str = this.pictureUrl;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.price)) * 31) + Double.hashCode(this.quantity)) * 31) + this.markCodes.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public String toString() {
        return "ScanGoProductModel(article=" + this.article + ", id=" + this.id + ", measure=" + this.measure + ", name=" + this.name + ", pictureUrl=" + this.pictureUrl + ", price=" + this.price + ", quantity=" + this.quantity + ", markCodes=" + this.markCodes + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.article);
        dest.writeInt(this.id);
        dest.writeString(this.measure.name());
        dest.writeString(this.name);
        dest.writeString(this.pictureUrl);
        dest.writeDouble(this.price);
        dest.writeDouble(this.quantity);
        dest.writeStringList(this.markCodes);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getArticle() {
        return this.article;
    }

    public /* synthetic */ ScanGoProductModel(String str, int i13, c21.iobyxmoadg iobyxmoadgVar, String str2, String str3, double d13, double d14, List list, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? 0 : i13, (i14 & 4) != 0 ? c21.iobyxmoadg.UNDEFINED : iobyxmoadgVar, (i14 & 8) == 0 ? str2 : "", (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? 0.0d : d13, (i14 & 64) == 0 ? d14 : 0.0d, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? jyumaefscl.wflxmlrfwp() : list);
    }
}
