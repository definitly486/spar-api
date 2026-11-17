package ru.myspar.proloyalty.purchases.impl.create_list.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/myspar/proloyalty/purchases/impl/create_list/domain/store/CreatePurchaseListsFragmentArgs;", "Landroid/os/Parcelable;", "SingleProduct", "ProductsListFromBanner", "Empty", "Lru/myspar/proloyalty/purchases/impl/create_list/domain/store/CreatePurchaseListsFragmentArgs$Empty;", "Lru/myspar/proloyalty/purchases/impl/create_list/domain/store/CreatePurchaseListsFragmentArgs$ProductsListFromBanner;", "Lru/myspar/proloyalty/purchases/impl/create_list/domain/store/CreatePurchaseListsFragmentArgs$SingleProduct;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CreatePurchaseListsFragmentArgs extends Parcelable {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H×\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/myspar/proloyalty/purchases/impl/create_list/domain/store/CreatePurchaseListsFragmentArgs$Empty;", "Lru/myspar/proloyalty/purchases/impl/create_list/domain/store/CreatePurchaseListsFragmentArgs;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Empty implements CreatePurchaseListsFragmentArgs {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final Empty f99518zdlpuopuiu = new Empty();
        public static final Parcelable.Creator<Empty> CREATOR = new iobyxmoadg();

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Empty createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return Empty.f99518zdlpuopuiu;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Empty[] newArray(int i13) {
                return new Empty[i13];
            }
        }

        private Empty() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Empty);
        }

        public int hashCode() {
            return 307026464;
        }

        public String toString() {
            return "Empty";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H×\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/myspar/proloyalty/purchases/impl/create_list/domain/store/CreatePurchaseListsFragmentArgs$ProductsListFromBanner;", "Lru/myspar/proloyalty/purchases/impl/create_list/domain/store/CreatePurchaseListsFragmentArgs;", "", "productListName", "blockId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ppxfxbqfkf", "yggfygwlhe", "zoijcleaow", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductsListFromBanner implements CreatePurchaseListsFragmentArgs {
        public static final Parcelable.Creator<ProductsListFromBanner> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String blockId;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productListName;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final ProductsListFromBanner createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new ProductsListFromBanner(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final ProductsListFromBanner[] newArray(int i13) {
                return new ProductsListFromBanner[i13];
            }
        }

        public ProductsListFromBanner(String productListName, String blockId) {
            zdlpuopuiu.btonecajqb(productListName, "productListName");
            zdlpuopuiu.btonecajqb(blockId, "blockId");
            this.productListName = productListName;
            this.blockId = blockId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductsListFromBanner)) {
                return false;
            }
            ProductsListFromBanner productsListFromBanner = (ProductsListFromBanner) other;
            return zdlpuopuiu.eablkybsjg(this.productListName, productsListFromBanner.productListName) && zdlpuopuiu.eablkybsjg(this.blockId, productsListFromBanner.blockId);
        }

        public int hashCode() {
            return (this.productListName.hashCode() * 31) + this.blockId.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getProductListName() {
            return this.productListName;
        }

        public String toString() {
            return "ProductsListFromBanner(productListName=" + this.productListName + ", blockId=" + this.blockId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.productListName);
            dest.writeString(this.blockId);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getBlockId() {
            return this.blockId;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"Lru/myspar/proloyalty/purchases/impl/create_list/domain/store/CreatePurchaseListsFragmentArgs$SingleProduct;", "Lru/myspar/proloyalty/purchases/impl/create_list/domain/store/CreatePurchaseListsFragmentArgs;", "", "article", "", "quantity", "measure", "<init>", "(Ljava/lang/String;DLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "D", "eablkybsjg", "()D", "jyumaefscl", "ppxfxbqfkf", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SingleProduct implements CreatePurchaseListsFragmentArgs {
        public static final Parcelable.Creator<SingleProduct> CREATOR = new iobyxmoadg();

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
                return new SingleProduct(parcel.readString(), parcel.readDouble(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final SingleProduct[] newArray(int i13) {
                return new SingleProduct[i13];
            }
        }

        public SingleProduct(String article, double d13, String measure) {
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(measure, "measure");
            this.article = article;
            this.quantity = d13;
            this.measure = measure;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final double getQuantity() {
            return this.quantity;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SingleProduct)) {
                return false;
            }
            SingleProduct singleProduct = (SingleProduct) other;
            return zdlpuopuiu.eablkybsjg(this.article, singleProduct.article) && Double.compare(this.quantity, singleProduct.quantity) == 0 && zdlpuopuiu.eablkybsjg(this.measure, singleProduct.measure);
        }

        public int hashCode() {
            return (((this.article.hashCode() * 31) + Double.hashCode(this.quantity)) * 31) + this.measure.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getMeasure() {
            return this.measure;
        }

        public String toString() {
            return "SingleProduct(article=" + this.article + ", quantity=" + this.quantity + ", measure=" + this.measure + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.article);
            dest.writeDouble(this.quantity);
            dest.writeString(this.measure);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getArticle() {
            return this.article;
        }
    }
}
