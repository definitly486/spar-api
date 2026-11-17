package ru.myspar.purchases.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/myspar/purchases/api/model/PurchaseListAddProductDialogArgs;", "Landroid/os/Parcelable;", "SingleProduct", "ProductsListFromBanner", "Lru/myspar/purchases/api/model/PurchaseListAddProductDialogArgs$ProductsListFromBanner;", "Lru/myspar/purchases/api/model/PurchaseListAddProductDialogArgs$SingleProduct;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PurchaseListAddProductDialogArgs extends Parcelable {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/myspar/purchases/api/model/PurchaseListAddProductDialogArgs$ProductsListFromBanner;", "Lru/myspar/purchases/api/model/PurchaseListAddProductDialogArgs;", "", "blockId", "productListName", "", "Lru/myspar/purchases_list/api/models/PurchaseList;", "purchaseLists", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "ppxfxbqfkf", "jyumaefscl", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductsListFromBanner implements PurchaseListAddProductDialogArgs {
        public static final Parcelable.Creator<ProductsListFromBanner> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final List purchaseLists;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productListName;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String blockId;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final ProductsListFromBanner createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(parcel.readParcelable(ProductsListFromBanner.class.getClassLoader()));
                }
                return new ProductsListFromBanner(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final ProductsListFromBanner[] newArray(int i13) {
                return new ProductsListFromBanner[i13];
            }
        }

        public ProductsListFromBanner(String blockId, String productListName, List purchaseLists) {
            zdlpuopuiu.btonecajqb(blockId, "blockId");
            zdlpuopuiu.btonecajqb(productListName, "productListName");
            zdlpuopuiu.btonecajqb(purchaseLists, "purchaseLists");
            this.blockId = blockId;
            this.productListName = productListName;
            this.purchaseLists = purchaseLists;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public List getPurchaseLists() {
            return this.purchaseLists;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductsListFromBanner)) {
                return false;
            }
            ProductsListFromBanner productsListFromBanner = (ProductsListFromBanner) other;
            return zdlpuopuiu.eablkybsjg(this.blockId, productsListFromBanner.blockId) && zdlpuopuiu.eablkybsjg(this.productListName, productsListFromBanner.productListName) && zdlpuopuiu.eablkybsjg(this.purchaseLists, productsListFromBanner.purchaseLists);
        }

        public int hashCode() {
            return (((this.blockId.hashCode() * 31) + this.productListName.hashCode()) * 31) + this.purchaseLists.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getProductListName() {
            return this.productListName;
        }

        public String toString() {
            return "ProductsListFromBanner(blockId=" + this.blockId + ", productListName=" + this.productListName + ", purchaseLists=" + this.purchaseLists + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.blockId);
            dest.writeString(this.productListName);
            List list = this.purchaseLists;
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable((Parcelable) it.next(), flags);
            }
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getBlockId() {
            return this.blockId;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/myspar/purchases/api/model/PurchaseListAddProductDialogArgs$SingleProduct;", "Lru/myspar/purchases/api/model/PurchaseListAddProductDialogArgs;", "", "article", "", "quantity", "measure", "", "Lru/myspar/purchases_list/api/models/PurchaseList;", "purchaseLists", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "D", "gxszxtbevo", "()D", "jyumaefscl", "ppxfxbqfkf", "iwizpuwonk", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SingleProduct implements PurchaseListAddProductDialogArgs {
        public static final Parcelable.Creator<SingleProduct> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final List purchaseLists;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String measure;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final double quantity;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String article;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final SingleProduct createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                String string = parcel.readString();
                double d13 = parcel.readDouble();
                String string2 = parcel.readString();
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(parcel.readParcelable(SingleProduct.class.getClassLoader()));
                }
                return new SingleProduct(string, d13, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final SingleProduct[] newArray(int i13) {
                return new SingleProduct[i13];
            }
        }

        public SingleProduct(String article, double d13, String measure, List purchaseLists) {
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(measure, "measure");
            zdlpuopuiu.btonecajqb(purchaseLists, "purchaseLists");
            this.article = article;
            this.quantity = d13;
            this.measure = measure;
            this.purchaseLists = purchaseLists;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public List getPurchaseLists() {
            return this.purchaseLists;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SingleProduct)) {
                return false;
            }
            SingleProduct singleProduct = (SingleProduct) other;
            return zdlpuopuiu.eablkybsjg(this.article, singleProduct.article) && Double.compare(this.quantity, singleProduct.quantity) == 0 && zdlpuopuiu.eablkybsjg(this.measure, singleProduct.measure) && zdlpuopuiu.eablkybsjg(this.purchaseLists, singleProduct.purchaseLists);
        }

        /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
        public final double getQuantity() {
            return this.quantity;
        }

        public int hashCode() {
            return (((((this.article.hashCode() * 31) + Double.hashCode(this.quantity)) * 31) + this.measure.hashCode()) * 31) + this.purchaseLists.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getMeasure() {
            return this.measure;
        }

        public String toString() {
            return "SingleProduct(article=" + this.article + ", quantity=" + this.quantity + ", measure=" + this.measure + ", purchaseLists=" + this.purchaseLists + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.article);
            dest.writeDouble(this.quantity);
            dest.writeString(this.measure);
            List list = this.purchaseLists;
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable((Parcelable) it.next(), flags);
            }
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getArticle() {
            return this.article;
        }
    }
}
