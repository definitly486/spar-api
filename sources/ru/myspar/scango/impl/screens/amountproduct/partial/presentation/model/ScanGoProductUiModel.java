package ru.myspar.scango.impl.screens.amountproduct.partial.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH×\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b4\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b6\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/myspar/scango/impl/screens/amountproduct/partial/presentation/model/ScanGoProductUiModel;", "Landroid/os/Parcelable;", "", "id", "", "article", ExternalMetricsManagerImpl.NAME, "pictureUrl", "amount", "", "quantity", "pricePerUnit", "totalPrice", "Lx30/iobyxmoadg;", "measureType", "", "markCodes", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lx30/iobyxmoadg;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "I", "eablkybsjg", "yggfygwlhe", "Ljava/lang/String;", "ppxfxbqfkf", "jyumaefscl", "getName", "iwizpuwonk", "nufgyqmvbu", "cqumvgiudr", "zoijcleaow", "esjtqupxsv", "D", "btonecajqb", "()D", "lereixgezr", "dxjokdxxww", "pmvmpeiblj", "gtknphoqwx", "zynmafqrjb", "Lx30/iobyxmoadg;", "lqeggnwhkg", "()Lx30/iobyxmoadg;", "istkbnxepw", "Ljava/util/List;", "gxszxtbevo", "()Ljava/util/List;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ScanGoProductUiModel implements Parcelable {
    public static final Parcelable.Creator<ScanGoProductUiModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String amount;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final List markCodes;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pictureUrl;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pricePerUnit;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String totalPrice;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final x30.iobyxmoadg measureType;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ScanGoProductUiModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ScanGoProductUiModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), x30.iobyxmoadg.valueOf(parcel.readString()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ScanGoProductUiModel[] newArray(int i13) {
            return new ScanGoProductUiModel[i13];
        }
    }

    public ScanGoProductUiModel(int i13, String article, String name, String str, String amount, double d13, String pricePerUnit, String totalPrice, x30.iobyxmoadg measureType, List markCodes) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(amount, "amount");
        zdlpuopuiu.btonecajqb(pricePerUnit, "pricePerUnit");
        zdlpuopuiu.btonecajqb(totalPrice, "totalPrice");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        zdlpuopuiu.btonecajqb(markCodes, "markCodes");
        this.id = i13;
        this.article = article;
        this.name = name;
        this.pictureUrl = str;
        this.amount = amount;
        this.quantity = d13;
        this.pricePerUnit = pricePerUnit;
        this.totalPrice = totalPrice;
        this.measureType = measureType;
        this.markCodes = markCodes;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getPricePerUnit() {
        return this.pricePerUnit;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScanGoProductUiModel)) {
            return false;
        }
        ScanGoProductUiModel scanGoProductUiModel = (ScanGoProductUiModel) other;
        return this.id == scanGoProductUiModel.id && zdlpuopuiu.eablkybsjg(this.article, scanGoProductUiModel.article) && zdlpuopuiu.eablkybsjg(this.name, scanGoProductUiModel.name) && zdlpuopuiu.eablkybsjg(this.pictureUrl, scanGoProductUiModel.pictureUrl) && zdlpuopuiu.eablkybsjg(this.amount, scanGoProductUiModel.amount) && Double.compare(this.quantity, scanGoProductUiModel.quantity) == 0 && zdlpuopuiu.eablkybsjg(this.pricePerUnit, scanGoProductUiModel.pricePerUnit) && zdlpuopuiu.eablkybsjg(this.totalPrice, scanGoProductUiModel.totalPrice) && this.measureType == scanGoProductUiModel.measureType && zdlpuopuiu.eablkybsjg(this.markCodes, scanGoProductUiModel.markCodes);
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final List getMarkCodes() {
        return this.markCodes;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + this.article.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str = this.pictureUrl;
        return ((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.amount.hashCode()) * 31) + Double.hashCode(this.quantity)) * 31) + this.pricePerUnit.hashCode()) * 31) + this.totalPrice.hashCode()) * 31) + this.measureType.hashCode()) * 31) + this.markCodes.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final x30.iobyxmoadg getMeasureType() {
        return this.measureType;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getArticle() {
        return this.article;
    }

    public String toString() {
        return "ScanGoProductUiModel(id=" + this.id + ", article=" + this.article + ", name=" + this.name + ", pictureUrl=" + this.pictureUrl + ", amount=" + this.amount + ", quantity=" + this.quantity + ", pricePerUnit=" + this.pricePerUnit + ", totalPrice=" + this.totalPrice + ", measureType=" + this.measureType + ", markCodes=" + this.markCodes + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.article);
        dest.writeString(this.name);
        dest.writeString(this.pictureUrl);
        dest.writeString(this.amount);
        dest.writeDouble(this.quantity);
        dest.writeString(this.pricePerUnit);
        dest.writeString(this.totalPrice);
        dest.writeString(this.measureType.name());
        dest.writeStringList(this.markCodes);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }
}
