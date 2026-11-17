package ru.myspar.proloyalty.core.domain.interactor.product_change.models;

import android.os.Parcel;
import android.os.Parcelable;
import ez0.iobyxmoadg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.cart.CartProduct;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.product.ProductLimit;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b%\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0001KBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b&\u0010#J\u001a\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lru/myspar/proloyalty/core/domain/interactor/product_change/models/ChangeProductParams;", "Landroid/os/Parcelable;", "", "productId", "article", "Lez0/zoijcleaow;", "changeType", "", "isProductAvailableToBuy", "isPmProduct", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "measureTypeModel", "", "awgWeight", "", "Lru/myspar/proloyalty/core/domain/models/product/ProductLimit;", "limits", "Lru/myspar/proloyalty/core/domain/interactor/product_change/models/ChangeProductAnalyticParams;", "analyticParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lez0/zoijcleaow;ZZLru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;Ljava/lang/Double;Ljava/util/List;Lru/myspar/proloyalty/core/domain/interactor/product_change/models/ChangeProductAnalyticParams;)V", "quantity", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "measure", "Lez0/iobyxmoadg;", "btonecajqb", "(DLru/myspar/proloyalty/core/models/measure_type/MeasureType;)Lez0/iobyxmoadg;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "lqeggnwhkg", "yggfygwlhe", "getArticle", "jyumaefscl", "Lez0/zoijcleaow;", "ppxfxbqfkf", "()Lez0/zoijcleaow;", "iwizpuwonk", "Z", "dxjokdxxww", "()Z", "cqumvgiudr", "nufgyqmvbu", "esjtqupxsv", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "gxszxtbevo", "()Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "lereixgezr", "Ljava/lang/Double;", "zoijcleaow", "()Ljava/lang/Double;", "pmvmpeiblj", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "zynmafqrjb", "Lru/myspar/proloyalty/core/domain/interactor/product_change/models/ChangeProductAnalyticParams;", "getAnalyticParams", "()Lru/myspar/proloyalty/core/domain/interactor/product_change/models/ChangeProductAnalyticParams;", "istkbnxepw", "iobyxmoadg", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChangeProductParams implements Parcelable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPmProduct;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measureTypeModel;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isProductAvailableToBuy;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final ez0.zoijcleaow changeType;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double awgWeight;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final List limits;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productId;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChangeProductAnalyticParams analyticParams;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ChangeProductParams> CREATOR = new zoijcleaow();

    /* JADX INFO: renamed from: ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ChangeProductParams iobyxmoadg(CartProduct cartProduct, ProductCardEvent productCardEvent, ChangeProductAnalyticParams changeProductAnalyticParams) {
            zdlpuopuiu.btonecajqb(cartProduct, "cartProduct");
            zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            ez0.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
            if (zoijcleaowVarIobyxmoadg == null) {
                return null;
            }
            return new ChangeProductParams(cartProduct.getId(), cartProduct.getArticle(), zoijcleaowVarIobyxmoadg, cartProduct.getIsAvailable(), false, cartProduct.getMeasureTypeModel(), cartProduct.getAvgWeight(), cartProduct.getLimits(), changeProductAnalyticParams);
        }

        public final ChangeProductParams zoijcleaow(Product product, ProductCardEvent productCardEvent, ChangeProductAnalyticParams changeProductAnalyticParams) {
            zdlpuopuiu.btonecajqb(product, "product");
            zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            ez0.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
            if (zoijcleaowVarIobyxmoadg == null) {
                return null;
            }
            return new ChangeProductParams(product.getId(), product.getArticle(), zoijcleaowVarIobyxmoadg, product.getIsAvailable(), false, product.getMeasureTypeModel(), product.getAvgWeight(), product.getLimits(), changeProductAnalyticParams);
        }

        private Companion() {
        }
    }

    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ChangeProductParams createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ez0.zoijcleaow zoijcleaowVarValueOf = ez0.zoijcleaow.valueOf(parcel.readString());
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            MeasureTypeModel measureTypeModel = (MeasureTypeModel) parcel.readParcelable(ChangeProductParams.class.getClassLoader());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(ProductLimit.CREATOR.createFromParcel(parcel));
            }
            return new ChangeProductParams(string, string2, zoijcleaowVarValueOf, z13, z14, measureTypeModel, dValueOf, arrayList, parcel.readInt() != 0 ? ChangeProductAnalyticParams.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ChangeProductParams[] newArray(int i13) {
            return new ChangeProductParams[i13];
        }
    }

    public ChangeProductParams(String productId, String article, ez0.zoijcleaow changeType, boolean z13, boolean z14, MeasureTypeModel measureTypeModel, Double d13, List limits, ChangeProductAnalyticParams changeProductAnalyticParams) {
        zdlpuopuiu.btonecajqb(productId, "productId");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(changeType, "changeType");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        zdlpuopuiu.btonecajqb(limits, "limits");
        this.productId = productId;
        this.article = article;
        this.changeType = changeType;
        this.isProductAvailableToBuy = z13;
        this.isPmProduct = z14;
        this.measureTypeModel = measureTypeModel;
        this.awgWeight = d13;
        this.limits = limits;
        this.analyticParams = changeProductAnalyticParams;
    }

    public final iobyxmoadg btonecajqb(double quantity, MeasureType measure) {
        zdlpuopuiu.btonecajqb(measure, "measure");
        return new iobyxmoadg(this.productId, this.article, quantity, measure, this.limits, this.analyticParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getIsProductAvailableToBuy() {
        return this.isProductAvailableToBuy;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getLimits() {
        return this.limits;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeProductParams)) {
            return false;
        }
        ChangeProductParams changeProductParams = (ChangeProductParams) other;
        return zdlpuopuiu.eablkybsjg(this.productId, changeProductParams.productId) && zdlpuopuiu.eablkybsjg(this.article, changeProductParams.article) && this.changeType == changeProductParams.changeType && this.isProductAvailableToBuy == changeProductParams.isProductAvailableToBuy && this.isPmProduct == changeProductParams.isPmProduct && zdlpuopuiu.eablkybsjg(this.measureTypeModel, changeProductParams.measureTypeModel) && zdlpuopuiu.eablkybsjg(this.awgWeight, changeProductParams.awgWeight) && zdlpuopuiu.eablkybsjg(this.limits, changeProductParams.limits) && zdlpuopuiu.eablkybsjg(this.analyticParams, changeProductParams.analyticParams);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final MeasureTypeModel getMeasureTypeModel() {
        return this.measureTypeModel;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.productId.hashCode() * 31) + this.article.hashCode()) * 31) + this.changeType.hashCode()) * 31) + Boolean.hashCode(this.isProductAvailableToBuy)) * 31) + Boolean.hashCode(this.isPmProduct)) * 31) + this.measureTypeModel.hashCode()) * 31;
        Double d13 = this.awgWeight;
        int iHashCode2 = (((iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31) + this.limits.hashCode()) * 31;
        ChangeProductAnalyticParams changeProductAnalyticParams = this.analyticParams;
        return iHashCode2 + (changeProductAnalyticParams != null ? changeProductAnalyticParams.hashCode() : 0);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsPmProduct() {
        return this.isPmProduct;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final ez0.zoijcleaow getChangeType() {
        return this.changeType;
    }

    public String toString() {
        return "ChangeProductParams(productId=" + this.productId + ", article=" + this.article + ", changeType=" + this.changeType + ", isProductAvailableToBuy=" + this.isProductAvailableToBuy + ", isPmProduct=" + this.isPmProduct + ", measureTypeModel=" + this.measureTypeModel + ", awgWeight=" + this.awgWeight + ", limits=" + this.limits + ", analyticParams=" + this.analyticParams + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.productId);
        dest.writeString(this.article);
        dest.writeString(this.changeType.name());
        dest.writeInt(this.isProductAvailableToBuy ? 1 : 0);
        dest.writeInt(this.isPmProduct ? 1 : 0);
        dest.writeParcelable(this.measureTypeModel, flags);
        Double d13 = this.awgWeight;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        List list = this.limits;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ProductLimit) it.next()).writeToParcel(dest, flags);
        }
        ChangeProductAnalyticParams changeProductAnalyticParams = this.analyticParams;
        if (changeProductAnalyticParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            changeProductAnalyticParams.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final Double getAwgWeight() {
        return this.awgWeight;
    }
}
