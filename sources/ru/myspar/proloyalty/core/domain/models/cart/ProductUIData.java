package ru.myspar.proloyalty.core.domain.models.cart;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.handler.ProductMessageType;
import ru.myspar.proloyalty.core.domain.models.product.ProductLimit;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJd\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ\u001a\u0010%\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/cart/ProductUIData;", "Landroid/os/Parcelable;", "", "id", "article", "", "quantity", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "measureType", "", "isLoading", "", "Lru/myspar/proloyalty/core/domain/models/product/ProductLimit;", "limits", "Lru/myspar/proloyalty/core/domain/handler/ProductMessageType;", "messageType", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLru/myspar/proloyalty/core/models/measure_type/MeasureType;ZLjava/util/List;Lru/myspar/proloyalty/core/domain/handler/ProductMessageType;)V", "Lru/myspar/proloyalty/core/domain/models/cart/ProductData;", "productData", "(Lru/myspar/proloyalty/core/domain/models/cart/ProductData;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;DLru/myspar/proloyalty/core/models/measure_type/MeasureType;ZLjava/util/List;Lru/myspar/proloyalty/core/domain/handler/ProductMessageType;)Lru/myspar/proloyalty/core/domain/models/cart/ProductUIData;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "eablkybsjg", "jyumaefscl", "D", "dxjokdxxww", "()D", "iwizpuwonk", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "lqeggnwhkg", "()Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "cqumvgiudr", "Z", "btonecajqb", "()Z", "esjtqupxsv", "Ljava/util/List;", "gxszxtbevo", "()Ljava/util/List;", "lereixgezr", "Lru/myspar/proloyalty/core/domain/handler/ProductMessageType;", "nufgyqmvbu", "()Lru/myspar/proloyalty/core/domain/handler/ProductMessageType;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductUIData implements Parcelable {
    public static final Parcelable.Creator<ProductUIData> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final List limits;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureType measureType;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductMessageType messageType;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ProductUIData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            double d13 = parcel.readDouble();
            MeasureType measureType = (MeasureType) parcel.readParcelable(ProductUIData.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(ProductLimit.CREATOR.createFromParcel(parcel));
                }
            }
            return new ProductUIData(string, string2, d13, measureType, z13, arrayList, (ProductMessageType) parcel.readParcelable(ProductUIData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ProductUIData[] newArray(int i13) {
            return new ProductUIData[i13];
        }
    }

    public ProductUIData(String id2, String str, double d13, MeasureType measureType, boolean z13, List list, ProductMessageType productMessageType) {
        zdlpuopuiu.btonecajqb(id2, "id");
        this.id = id2;
        this.article = str;
        this.quantity = d13;
        this.measureType = measureType;
        this.isLoading = z13;
        this.limits = list;
        this.messageType = productMessageType;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
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
    public final String getArticle() {
        return this.article;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductUIData)) {
            return false;
        }
        ProductUIData productUIData = (ProductUIData) other;
        return zdlpuopuiu.eablkybsjg(this.id, productUIData.id) && zdlpuopuiu.eablkybsjg(this.article, productUIData.article) && Double.compare(this.quantity, productUIData.quantity) == 0 && zdlpuopuiu.eablkybsjg(this.measureType, productUIData.measureType) && this.isLoading == productUIData.isLoading && zdlpuopuiu.eablkybsjg(this.limits, productUIData.limits) && zdlpuopuiu.eablkybsjg(this.messageType, productUIData.messageType);
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final List getLimits() {
        return this.limits;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.article;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.quantity)) * 31;
        MeasureType measureType = this.measureType;
        int iHashCode3 = (((iHashCode2 + (measureType == null ? 0 : measureType.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        List list = this.limits;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ProductMessageType productMessageType = this.messageType;
        return iHashCode4 + (productMessageType != null ? productMessageType.hashCode() : 0);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final MeasureType getMeasureType() {
        return this.measureType;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final ProductMessageType getMessageType() {
        return this.messageType;
    }

    public String toString() {
        return "ProductUIData(id=" + this.id + ", article=" + this.article + ", quantity=" + this.quantity + ", measureType=" + this.measureType + ", isLoading=" + this.isLoading + ", limits=" + this.limits + ", messageType=" + this.messageType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.article);
        dest.writeDouble(this.quantity);
        dest.writeParcelable(this.measureType, flags);
        dest.writeInt(this.isLoading ? 1 : 0);
        List list = this.limits;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ProductLimit) it.next()).writeToParcel(dest, flags);
            }
        }
        dest.writeParcelable(this.messageType, flags);
    }

    public final ProductUIData zoijcleaow(String id2, String article, double quantity, MeasureType measureType, boolean isLoading, List limits, ProductMessageType messageType) {
        zdlpuopuiu.btonecajqb(id2, "id");
        return new ProductUIData(id2, article, quantity, measureType, isLoading, limits, messageType);
    }

    public /* synthetic */ ProductUIData(String str, String str2, double d13, MeasureType measureType, boolean z13, List list, ProductMessageType productMessageType, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : str2, d13, measureType, (i13 & 16) != 0 ? false : z13, list, productMessageType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductUIData(ProductData productData) {
        this(productData.getId(), productData.getArticle(), productData.getQuantity(), productData.getMeasureType(), productData.getIsLoading(), productData.getLimits(), productData.getMessageType());
        zdlpuopuiu.btonecajqb(productData, "productData");
    }
}
