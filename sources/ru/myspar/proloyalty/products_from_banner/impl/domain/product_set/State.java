package ru.myspar.proloyalty.products_from_banner.impl.domain.product_set;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ru.myspar.proloyalty.products_from_banner.impl.domain.product_set.ProductsFromBannerStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0019H\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0019H\u0007¢\u0006\u0004\b#\u0010$Jà\u0001\u0010&\u001a\u00020%2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0019HÇ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0019H×\u0001¢\u0006\u0004\b*\u0010$J\u001a\u0010-\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010+H×\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b8\u0010)R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b2\u00105R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010CR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010KR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u00103\u001a\u0004\b:\u00105R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u00103\u001a\u0004\bL\u00105R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u00103\u001a\u0004\bQ\u00105R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u00103\u001a\u0004\bN\u00105R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010$¨\u0006V"}, d2 = {"ru/myspar/proloyalty/products_from_banner/impl/domain/product_set/ProductsFromBannerStore$State", "Landroid/os/Parcelable;", "", "blockId", "", "isLoading", "title", "imageBannerUrl", "isChangeProductCountEnabled", "", "Lru/myspar/proloyalty/core/domain/models/product/Product;", "products", "Lru/myspar/proloyalty/core/domain/models/cart/ProductData;", "productData", "", "selectedProductsIds", "expandedProductIds", "favoriteDisabledProductIds", "", "actualSum", "oldSum", "isPurchasesListFeatureEnabled", "isSharedFeatureEnabled", "isCatalogRatingFeatureEnabled", "isVivinoFeatureEnabled", "", "productSetCount", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/lang/Double;Ljava/lang/Double;ZZZZI)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/products_from_banner/impl/domain/product_set/ProductsFromBannerStore$State;", "zoijcleaow", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/lang/Double;Ljava/lang/Double;ZZZZI)Lru/myspar/proloyalty/products_from_banner/impl/domain/product_set/ProductsFromBannerStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "Z", "iwizpuwonk", "()Z", "jyumaefscl", "wflxmlrfwp", "lqeggnwhkg", "cqumvgiudr", "esjtqupxsv", "Ljava/util/List;", "btonecajqb", "()Ljava/util/List;", "lereixgezr", "nufgyqmvbu", "pmvmpeiblj", "Ljava/util/Set;", "gtknphoqwx", "()Ljava/util/Set;", "zynmafqrjb", "getExpandedProductIds", "istkbnxepw", "gxszxtbevo", "cdpycssgdh", "Ljava/lang/Double;", "getActualSum", "()Ljava/lang/Double;", "yadqdtsiqt", "getOldSum", "iozdgvuglv", "lmojexxdyd", "wwaezpbzkn", "oxmwwwfdhm", "ylkuphrtab", "pkzmftpjix", "I", "dxjokdxxww", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double actualSum;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isChangeProductCountEnabled;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final List products;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPurchasesListFeatureEnabled;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set favoriteDisabledProductIds;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageBannerUrl;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productData;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSharedFeatureEnabled;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final int productSetCount;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set selectedProductsIds;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCatalogRatingFeatureEnabled;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double oldSum;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVivinoFeatureEnabled;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String blockId;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set expandedProductIds;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.products_from_banner.impl.domain.product_set.ProductsFromBannerStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z14 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList2.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            int i17 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                linkedHashSet.add(parcel.readString());
            }
            int i19 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i19);
            for (int i23 = 0; i23 != i19; i23++) {
                linkedHashSet2.add(parcel.readString());
            }
            int i24 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i24);
            for (int i25 = 0; i25 != i24; i25++) {
                linkedHashSet3.add(parcel.readString());
            }
            return new State(string, z13, string2, string3, z14, arrayList, arrayList2, linkedHashSet, linkedHashSet2, linkedHashSet3, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String blockId, boolean z13, String str, String str2, boolean z14, List products, List productData, Set selectedProductsIds, Set expandedProductIds, Set favoriteDisabledProductIds, Double d13, Double d14, boolean z15, boolean z16, boolean z17, boolean z18, int i13) {
        zdlpuopuiu.btonecajqb(blockId, "blockId");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(productData, "productData");
        zdlpuopuiu.btonecajqb(selectedProductsIds, "selectedProductsIds");
        zdlpuopuiu.btonecajqb(expandedProductIds, "expandedProductIds");
        zdlpuopuiu.btonecajqb(favoriteDisabledProductIds, "favoriteDisabledProductIds");
        this.blockId = blockId;
        this.isLoading = z13;
        this.title = str;
        this.imageBannerUrl = str2;
        this.isChangeProductCountEnabled = z14;
        this.products = products;
        this.productData = productData;
        this.selectedProductsIds = selectedProductsIds;
        this.expandedProductIds = expandedProductIds;
        this.favoriteDisabledProductIds = favoriteDisabledProductIds;
        this.actualSum = d13;
        this.oldSum = d14;
        this.isPurchasesListFeatureEnabled = z15;
        this.isSharedFeatureEnabled = z16;
        this.isCatalogRatingFeatureEnabled = z17;
        this.isVivinoFeatureEnabled = z18;
        this.productSetCount = i13;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final List getProducts() {
        return this.products;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final int getProductSetCount() {
        return this.productSetCount;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getBlockId() {
        return this.blockId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.blockId, state.blockId) && this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.title, state.title) && zdlpuopuiu.eablkybsjg(this.imageBannerUrl, state.imageBannerUrl) && this.isChangeProductCountEnabled == state.isChangeProductCountEnabled && zdlpuopuiu.eablkybsjg(this.products, state.products) && zdlpuopuiu.eablkybsjg(this.productData, state.productData) && zdlpuopuiu.eablkybsjg(this.selectedProductsIds, state.selectedProductsIds) && zdlpuopuiu.eablkybsjg(this.expandedProductIds, state.expandedProductIds) && zdlpuopuiu.eablkybsjg(this.favoriteDisabledProductIds, state.favoriteDisabledProductIds) && zdlpuopuiu.eablkybsjg(this.actualSum, state.actualSum) && zdlpuopuiu.eablkybsjg(this.oldSum, state.oldSum) && this.isPurchasesListFeatureEnabled == state.isPurchasesListFeatureEnabled && this.isSharedFeatureEnabled == state.isSharedFeatureEnabled && this.isCatalogRatingFeatureEnabled == state.isCatalogRatingFeatureEnabled && this.isVivinoFeatureEnabled == state.isVivinoFeatureEnabled && this.productSetCount == state.productSetCount;
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final boolean getIsPurchasesListFeatureEnabled() {
        return this.isPurchasesListFeatureEnabled;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final Set getSelectedProductsIds() {
        return this.selectedProductsIds;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Set getFavoriteDisabledProductIds() {
        return this.favoriteDisabledProductIds;
    }

    public int hashCode() {
        int iHashCode = ((this.blockId.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageBannerUrl;
        int iHashCode3 = (((((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isChangeProductCountEnabled)) * 31) + this.products.hashCode()) * 31) + this.productData.hashCode()) * 31) + this.selectedProductsIds.hashCode()) * 31) + this.expandedProductIds.hashCode()) * 31) + this.favoriteDisabledProductIds.hashCode()) * 31;
        Double d13 = this.actualSum;
        int iHashCode4 = (iHashCode3 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.oldSum;
        return ((((((((((iHashCode4 + (d14 != null ? d14.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPurchasesListFeatureEnabled)) * 31) + Boolean.hashCode(this.isSharedFeatureEnabled)) * 31) + Boolean.hashCode(this.isCatalogRatingFeatureEnabled)) * 31) + Boolean.hashCode(this.isVivinoFeatureEnabled)) * 31) + Integer.hashCode(this.productSetCount);
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final boolean getIsVivinoFeatureEnabled() {
        return this.isVivinoFeatureEnabled;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getImageBannerUrl() {
        return this.imageBannerUrl;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final List getProductData() {
        return this.productData;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsCatalogRatingFeatureEnabled() {
        return this.isCatalogRatingFeatureEnabled;
    }

    public String toString() {
        return "State(blockId=" + this.blockId + ", isLoading=" + this.isLoading + ", title=" + this.title + ", imageBannerUrl=" + this.imageBannerUrl + ", isChangeProductCountEnabled=" + this.isChangeProductCountEnabled + ", products=" + this.products + ", productData=" + this.productData + ", selectedProductsIds=" + this.selectedProductsIds + ", expandedProductIds=" + this.expandedProductIds + ", favoriteDisabledProductIds=" + this.favoriteDisabledProductIds + ", actualSum=" + this.actualSum + ", oldSum=" + this.oldSum + ", isPurchasesListFeatureEnabled=" + this.isPurchasesListFeatureEnabled + ", isSharedFeatureEnabled=" + this.isSharedFeatureEnabled + ", isCatalogRatingFeatureEnabled=" + this.isCatalogRatingFeatureEnabled + ", isVivinoFeatureEnabled=" + this.isVivinoFeatureEnabled + ", productSetCount=" + this.productSetCount + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.blockId);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeString(this.title);
        dest.writeString(this.imageBannerUrl);
        dest.writeInt(this.isChangeProductCountEnabled ? 1 : 0);
        List list = this.products;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        List list2 = this.productData;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        Set set = this.selectedProductsIds;
        dest.writeInt(set.size());
        Iterator it3 = set.iterator();
        while (it3.hasNext()) {
            dest.writeString((String) it3.next());
        }
        Set set2 = this.expandedProductIds;
        dest.writeInt(set2.size());
        Iterator it4 = set2.iterator();
        while (it4.hasNext()) {
            dest.writeString((String) it4.next());
        }
        Set set3 = this.favoriteDisabledProductIds;
        dest.writeInt(set3.size());
        Iterator it5 = set3.iterator();
        while (it5.hasNext()) {
            dest.writeString((String) it5.next());
        }
        Double d13 = this.actualSum;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        Double d14 = this.oldSum;
        if (d14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d14.doubleValue());
        }
        dest.writeInt(this.isPurchasesListFeatureEnabled ? 1 : 0);
        dest.writeInt(this.isSharedFeatureEnabled ? 1 : 0);
        dest.writeInt(this.isCatalogRatingFeatureEnabled ? 1 : 0);
        dest.writeInt(this.isVivinoFeatureEnabled ? 1 : 0);
        dest.writeInt(this.productSetCount);
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final boolean getIsSharedFeatureEnabled() {
        return this.isSharedFeatureEnabled;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final boolean getIsChangeProductCountEnabled() {
        return this.isChangeProductCountEnabled;
    }

    public final State zoijcleaow(String blockId, boolean isLoading, String title, String imageBannerUrl, boolean isChangeProductCountEnabled, List products, List productData, Set selectedProductsIds, Set expandedProductIds, Set favoriteDisabledProductIds, Double actualSum, Double oldSum, boolean isPurchasesListFeatureEnabled, boolean isSharedFeatureEnabled, boolean isCatalogRatingFeatureEnabled, boolean isVivinoFeatureEnabled, int productSetCount) {
        zdlpuopuiu.btonecajqb(blockId, "blockId");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(productData, "productData");
        zdlpuopuiu.btonecajqb(selectedProductsIds, "selectedProductsIds");
        zdlpuopuiu.btonecajqb(expandedProductIds, "expandedProductIds");
        zdlpuopuiu.btonecajqb(favoriteDisabledProductIds, "favoriteDisabledProductIds");
        return new State(blockId, isLoading, title, imageBannerUrl, isChangeProductCountEnabled, products, productData, selectedProductsIds, expandedProductIds, favoriteDisabledProductIds, actualSum, oldSum, isPurchasesListFeatureEnabled, isSharedFeatureEnabled, isCatalogRatingFeatureEnabled, isVivinoFeatureEnabled, productSetCount);
    }

    public /* synthetic */ State(String str, boolean z13, String str2, String str3, boolean z14, List list, List list2, Set set, Set set2, Set set3, Double d13, Double d14, boolean z15, boolean z16, boolean z17, boolean z18, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(str, (i14 & 2) != 0 ? false : z13, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & 64) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ikoacuggdj.eablkybsjg() : set, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? ikoacuggdj.eablkybsjg() : set2, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? ikoacuggdj.eablkybsjg() : set3, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : d13, (i14 & 2048) == 0 ? d14 : null, (i14 & 4096) != 0 ? false : z15, (i14 & 8192) != 0 ? false : z16, (i14 & 16384) != 0 ? false : z17, (i14 & 32768) == 0 ? z18 : false, (i14 & 65536) != 0 ? 1 : i13);
    }
}
