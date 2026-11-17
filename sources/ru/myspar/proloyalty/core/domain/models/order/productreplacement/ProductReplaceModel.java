package ru.myspar.proloyalty.core.domain.models.order.productreplacement;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/order/productreplacement/ProductReplaceModel;", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/core/domain/models/order/productreplacement/ProductToReplaceModel;", "productToReplace", "", "Lru/myspar/proloyalty/core/domain/models/order/productreplacement/ProductsForReplaceModel;", "productsForReplace", "<init>", "(Lru/myspar/proloyalty/core/domain/models/order/productreplacement/ProductToReplaceModel;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Lru/myspar/proloyalty/core/domain/models/order/productreplacement/ProductToReplaceModel;Ljava/util/List;)Lru/myspar/proloyalty/core/domain/models/order/productreplacement/ProductReplaceModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/core/domain/models/order/productreplacement/ProductToReplaceModel;", "eablkybsjg", "()Lru/myspar/proloyalty/core/domain/models/order/productreplacement/ProductToReplaceModel;", "yggfygwlhe", "Ljava/util/List;", "gxszxtbevo", "()Ljava/util/List;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductReplaceModel implements Parcelable {
    public static final Parcelable.Creator<ProductReplaceModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productsForReplace;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductToReplaceModel productToReplace;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ProductReplaceModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            ProductToReplaceModel productToReplaceModelCreateFromParcel = ProductToReplaceModel.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(ProductsForReplaceModel.CREATOR.createFromParcel(parcel));
            }
            return new ProductReplaceModel(productToReplaceModelCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ProductReplaceModel[] newArray(int i13) {
            return new ProductReplaceModel[i13];
        }
    }

    public ProductReplaceModel(ProductToReplaceModel productToReplace, List productsForReplace) {
        zdlpuopuiu.btonecajqb(productToReplace, "productToReplace");
        zdlpuopuiu.btonecajqb(productsForReplace, "productsForReplace");
        this.productToReplace = productToReplace;
        this.productsForReplace = productsForReplace;
    }

    public static /* synthetic */ ProductReplaceModel ppxfxbqfkf(ProductReplaceModel productReplaceModel, ProductToReplaceModel productToReplaceModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            productToReplaceModel = productReplaceModel.productToReplace;
        }
        if ((i13 & 2) != 0) {
            list = productReplaceModel.productsForReplace;
        }
        return productReplaceModel.zoijcleaow(productToReplaceModel, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final ProductToReplaceModel getProductToReplace() {
        return this.productToReplace;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductReplaceModel)) {
            return false;
        }
        ProductReplaceModel productReplaceModel = (ProductReplaceModel) other;
        return zdlpuopuiu.eablkybsjg(this.productToReplace, productReplaceModel.productToReplace) && zdlpuopuiu.eablkybsjg(this.productsForReplace, productReplaceModel.productsForReplace);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final List getProductsForReplace() {
        return this.productsForReplace;
    }

    public int hashCode() {
        return (this.productToReplace.hashCode() * 31) + this.productsForReplace.hashCode();
    }

    public String toString() {
        return "ProductReplaceModel(productToReplace=" + this.productToReplace + ", productsForReplace=" + this.productsForReplace + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        this.productToReplace.writeToParcel(dest, flags);
        List list = this.productsForReplace;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ProductsForReplaceModel) it.next()).writeToParcel(dest, flags);
        }
    }

    public final ProductReplaceModel zoijcleaow(ProductToReplaceModel productToReplace, List productsForReplace) {
        zdlpuopuiu.btonecajqb(productToReplace, "productToReplace");
        zdlpuopuiu.btonecajqb(productsForReplace, "productsForReplace");
        return new ProductReplaceModel(productToReplace, productsForReplace);
    }
}
