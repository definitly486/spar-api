package ru.myspar.catalog.impl.product_list.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.draadjrbmk;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0001,B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH×\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lru/myspar/catalog/impl/product_list/domain/model/ProductListRecommendationBlock;", "Landroid/os/Parcelable;", "", "title", "", "Lru/myspar/core/domain/models/product/Product;", "products", "backgroundColor", "", "isNeededShowShimmer", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)Lru/myspar/catalog/impl/product_list/domain/model/ProductListRecommendationBlock;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "gxszxtbevo", "yggfygwlhe", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "jyumaefscl", "getBackgroundColor", "iwizpuwonk", "Z", "lqeggnwhkg", "()Z", "cqumvgiudr", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductListRecommendationBlock implements Parcelable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNeededShowShimmer;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String backgroundColor;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final List products;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f85264esjtqupxsv = 8;
    public static final Parcelable.Creator<ProductListRecommendationBlock> CREATOR = new zoijcleaow();

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.product_list.domain.model.ProductListRecommendationBlock$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ProductListRecommendationBlock iobyxmoadg() {
            return new ProductListRecommendationBlock(draadjrbmk.ppxfxbqfkf(), jyumaefscl.wflxmlrfwp(), draadjrbmk.ppxfxbqfkf(), false);
        }

        private Companion() {
        }
    }

    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ProductListRecommendationBlock createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(ProductListRecommendationBlock.class.getClassLoader()));
            }
            return new ProductListRecommendationBlock(string, arrayList, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ProductListRecommendationBlock[] newArray(int i13) {
            return new ProductListRecommendationBlock[i13];
        }
    }

    public ProductListRecommendationBlock(String title, List products, String backgroundColor, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(backgroundColor, "backgroundColor");
        this.title = title;
        this.products = products;
        this.backgroundColor = backgroundColor;
        this.isNeededShowShimmer = z13;
    }

    public static /* synthetic */ ProductListRecommendationBlock ppxfxbqfkf(ProductListRecommendationBlock productListRecommendationBlock, String str, List list, String str2, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = productListRecommendationBlock.title;
        }
        if ((i13 & 2) != 0) {
            list = productListRecommendationBlock.products;
        }
        if ((i13 & 4) != 0) {
            str2 = productListRecommendationBlock.backgroundColor;
        }
        if ((i13 & 8) != 0) {
            z13 = productListRecommendationBlock.isNeededShowShimmer;
        }
        return productListRecommendationBlock.zoijcleaow(str, list, str2, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getProducts() {
        return this.products;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListRecommendationBlock)) {
            return false;
        }
        ProductListRecommendationBlock productListRecommendationBlock = (ProductListRecommendationBlock) other;
        return zdlpuopuiu.eablkybsjg(this.title, productListRecommendationBlock.title) && zdlpuopuiu.eablkybsjg(this.products, productListRecommendationBlock.products) && zdlpuopuiu.eablkybsjg(this.backgroundColor, productListRecommendationBlock.backgroundColor) && this.isNeededShowShimmer == productListRecommendationBlock.isNeededShowShimmer;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.products.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31) + Boolean.hashCode(this.isNeededShowShimmer);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsNeededShowShimmer() {
        return this.isNeededShowShimmer;
    }

    public String toString() {
        return "ProductListRecommendationBlock(title=" + this.title + ", products=" + this.products + ", backgroundColor=" + this.backgroundColor + ", isNeededShowShimmer=" + this.isNeededShowShimmer + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.title);
        List list = this.products;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeString(this.backgroundColor);
        dest.writeInt(this.isNeededShowShimmer ? 1 : 0);
    }

    public final ProductListRecommendationBlock zoijcleaow(String title, List products, String backgroundColor, boolean isNeededShowShimmer) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(backgroundColor, "backgroundColor");
        return new ProductListRecommendationBlock(title, products, backgroundColor, isNeededShowShimmer);
    }
}
