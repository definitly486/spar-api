package ru.myspar.core.domain.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.paging.Paging;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015JJ\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\n\u0010,¨\u0006-"}, d2 = {"Lru/myspar/core/domain/models/product/Products;", "Landroid/os/Parcelable;", "", "Lru/myspar/core/domain/models/BaseProduct;", "productList", "Lru/myspar/core/models/paging/Paging;", "paging", "Lru/myspar/core/domain/models/product/FavoriteFilterSection;", "favoriteFilterSections", "", "isAgeCheckNeeded", "<init>", "(Ljava/util/List;Lru/myspar/core/models/paging/Paging;Ljava/util/List;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/util/List;Lru/myspar/core/models/paging/Paging;Ljava/util/List;Z)Lru/myspar/core/domain/models/product/Products;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/util/List;", "lqeggnwhkg", "()Ljava/util/List;", "yggfygwlhe", "Lru/myspar/core/models/paging/Paging;", "gxszxtbevo", "()Lru/myspar/core/models/paging/Paging;", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "Z", "()Z", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Products implements Parcelable {
    public static final Parcelable.Creator<Products> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAgeCheckNeeded;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final List favoriteFilterSections;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final Paging paging;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productList;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Products createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(parcel.readParcelable(Products.class.getClassLoader()));
                }
            }
            Paging paging = (Paging) parcel.readParcelable(Products.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList2.add(FavoriteFilterSection.CREATOR.createFromParcel(parcel));
                }
            }
            return new Products(arrayList, paging, arrayList2, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Products[] newArray(int i13) {
            return new Products[i13];
        }
    }

    public Products(List list, Paging paging, List list2, boolean z13) {
        this.productList = list;
        this.paging = paging;
        this.favoriteFilterSections = list2;
        this.isAgeCheckNeeded = z13;
    }

    public static /* synthetic */ Products ppxfxbqfkf(Products products, List list, Paging paging, List list2, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = products.productList;
        }
        if ((i13 & 2) != 0) {
            paging = products.paging;
        }
        if ((i13 & 4) != 0) {
            list2 = products.favoriteFilterSections;
        }
        if ((i13 & 8) != 0) {
            z13 = products.isAgeCheckNeeded;
        }
        return products.zoijcleaow(list, paging, list2, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getFavoriteFilterSections() {
        return this.favoriteFilterSections;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Products)) {
            return false;
        }
        Products products = (Products) other;
        return zdlpuopuiu.eablkybsjg(this.productList, products.productList) && zdlpuopuiu.eablkybsjg(this.paging, products.paging) && zdlpuopuiu.eablkybsjg(this.favoriteFilterSections, products.favoriteFilterSections) && this.isAgeCheckNeeded == products.isAgeCheckNeeded;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Paging getPaging() {
        return this.paging;
    }

    public int hashCode() {
        List list = this.productList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Paging paging = this.paging;
        int iHashCode2 = (iHashCode + (paging == null ? 0 : paging.hashCode())) * 31;
        List list2 = this.favoriteFilterSections;
        return ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAgeCheckNeeded);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final List getProductList() {
        return this.productList;
    }

    public String toString() {
        return "Products(productList=" + this.productList + ", paging=" + this.paging + ", favoriteFilterSections=" + this.favoriteFilterSections + ", isAgeCheckNeeded=" + this.isAgeCheckNeeded + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        List list = this.productList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable((Parcelable) it.next(), flags);
            }
        }
        dest.writeParcelable(this.paging, flags);
        List list2 = this.favoriteFilterSections;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((FavoriteFilterSection) it2.next()).writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.isAgeCheckNeeded ? 1 : 0);
    }

    public final Products zoijcleaow(List productList, Paging paging, List favoriteFilterSections, boolean isAgeCheckNeeded) {
        return new Products(productList, paging, favoriteFilterSections, isAgeCheckNeeded);
    }

    public /* synthetic */ Products(List list, Paging paging, List list2, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? null : paging, (i13 & 4) != 0 ? null : list2, (i13 & 8) != 0 ? false : z13);
    }
}
