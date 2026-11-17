package ru.myspar.proloyalty.catalog.impl.specific_product.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.rate.review.api.model.Reviews;

/* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.SpecificProductStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\"H\u0007¢\u0006\u0004\b'\u0010(JÆ\u0001\u0010*\u001a\u00020)2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\"H×\u0001¢\u0006\u0004\b.\u0010(J\u001a\u00101\u001a\u00020\u00182\b\u00100\u001a\u0004\u0018\u00010/H×\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b7\u0010MR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bN\u0010@\u001a\u0004\bO\u0010BR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bX\u0010U\u001a\u0004\bY\u0010WR\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bV\u0010U\u001a\u0004\bG\u0010WR\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bY\u0010U\u001a\u0004\b?\u0010WR\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bZ\u0010U\u001a\u0004\b[\u0010W¨\u0006\\"}, d2 = {"ru/myspar/proloyalty/catalog/impl/specific_product/domain/store/SpecificProductStore$State", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/core/domain/models/product/Product;", "mainProduct", "", "", "expandedProductIds", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "deliveryCode", "", "Lru/myspar/proloyalty/core/domain/models/cart/ProductUIData;", "productDataList", "Lru/myspar/proloyalty/catalog/api/model/ProductPayload;", "payload", "", "Ld01/iobyxmoadg;", "Lru/myspar/proloyalty/core/domain/models/recommendations/Recommendation;", "recommendations", "Lru/myspar/proloyalty/rate/review/api/model/Reviews;", "reviews", "Lru/myspar/proloyalty/core/domain/models/comboset/ComboSet;", "comboSetList", "Lru/myspar/proloyalty/catalog/impl/specific_product/domain/store/SpecificProductStore$Dialog;", "dialog", "", "isRatingFeatureEnabled", "isVivinoFeatureEnabled", "isPurchaseListsFeatureEnabled", "isLoading", "analyticLoadCompletedFirstTime", "<init>", "(Lru/myspar/proloyalty/core/domain/models/product/Product;Ljava/util/Set;Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;Ljava/util/List;Lru/myspar/proloyalty/catalog/api/model/ProductPayload;Ljava/util/Map;Lru/myspar/proloyalty/rate/review/api/model/Reviews;Ljava/util/List;Lru/myspar/proloyalty/catalog/impl/specific_product/domain/store/SpecificProductStore$Dialog;ZZZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/catalog/impl/specific_product/domain/store/SpecificProductStore$State;", "zoijcleaow", "(Lru/myspar/proloyalty/core/domain/models/product/Product;Ljava/util/Set;Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;Ljava/util/List;Lru/myspar/proloyalty/catalog/api/model/ProductPayload;Ljava/util/Map;Lru/myspar/proloyalty/rate/review/api/model/Reviews;Ljava/util/List;Lru/myspar/proloyalty/catalog/impl/specific_product/domain/store/SpecificProductStore$Dialog;ZZZZZ)Lru/myspar/proloyalty/catalog/impl/specific_product/domain/store/SpecificProductStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/core/domain/models/product/Product;", "btonecajqb", "()Lru/myspar/proloyalty/core/domain/models/product/Product;", "yggfygwlhe", "Ljava/util/Set;", "dxjokdxxww", "()Ljava/util/Set;", "jyumaefscl", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "lqeggnwhkg", "()Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "iwizpuwonk", "Ljava/util/List;", "wflxmlrfwp", "()Ljava/util/List;", "cqumvgiudr", "Lru/myspar/proloyalty/catalog/api/model/ProductPayload;", "gtknphoqwx", "()Lru/myspar/proloyalty/catalog/api/model/ProductPayload;", "esjtqupxsv", "Ljava/util/Map;", "oxmwwwfdhm", "()Ljava/util/Map;", "lereixgezr", "Lru/myspar/proloyalty/rate/review/api/model/Reviews;", "()Lru/myspar/proloyalty/rate/review/api/model/Reviews;", "pmvmpeiblj", "gxszxtbevo", "zynmafqrjb", "Lru/myspar/proloyalty/catalog/impl/specific_product/domain/store/SpecificProductStore$Dialog;", "nufgyqmvbu", "()Lru/myspar/proloyalty/catalog/impl/specific_product/domain/store/SpecificProductStore$Dialog;", "istkbnxepw", "Z", "yadqdtsiqt", "()Z", "cdpycssgdh", "iozdgvuglv", "lmojexxdyd", "eablkybsjg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVivinoFeatureEnabled;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductPayload payload;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map recommendations;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRatingFeatureEnabled;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productDataList;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryCode;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Reviews reviews;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean analyticLoadCompletedFirstTime;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final List comboSetList;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPurchaseListsFeatureEnabled;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set expandedProductIds;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final Product mainProduct;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final SpecificProductStore$Dialog dialog;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.SpecificProductStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            Product product = (Product) parcel.readParcelable(State.class.getClassLoader());
            int i13 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                linkedHashSet.add(parcel.readString());
            }
            DeliveryCode deliveryCode = (DeliveryCode) parcel.readParcelable(State.class.getClassLoader());
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList2.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            ProductPayload productPayload = (ProductPayload) parcel.readParcelable(State.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i17 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    linkedHashMap.put(d01.iobyxmoadg.valueOf(parcel.readString()), parcel.readParcelable(State.class.getClassLoader()));
                }
            }
            Reviews reviews = (Reviews) parcel.readParcelable(State.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i19 = parcel.readInt();
                arrayList = new ArrayList(i19);
                for (int i23 = 0; i23 != i19; i23++) {
                    arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
                }
            }
            return new State(product, linkedHashSet, deliveryCode, arrayList2, productPayload, linkedHashMap, reviews, arrayList, (SpecificProductStore$Dialog) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(Product product, Set expandedProductIds, DeliveryCode deliveryCode, List productDataList, ProductPayload payload, Map map, Reviews reviews, List list, SpecificProductStore$Dialog specificProductStore$Dialog, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        zdlpuopuiu.btonecajqb(expandedProductIds, "expandedProductIds");
        zdlpuopuiu.btonecajqb(productDataList, "productDataList");
        zdlpuopuiu.btonecajqb(payload, "payload");
        this.mainProduct = product;
        this.expandedProductIds = expandedProductIds;
        this.deliveryCode = deliveryCode;
        this.productDataList = productDataList;
        this.payload = payload;
        this.recommendations = map;
        this.reviews = reviews;
        this.comboSetList = list;
        this.dialog = specificProductStore$Dialog;
        this.isRatingFeatureEnabled = z13;
        this.isVivinoFeatureEnabled = z14;
        this.isPurchaseListsFeatureEnabled = z15;
        this.isLoading = z16;
        this.analyticLoadCompletedFirstTime = z17;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final Product getMainProduct() {
        return this.mainProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final Set getExpandedProductIds() {
        return this.expandedProductIds;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getAnalyticLoadCompletedFirstTime() {
        return this.analyticLoadCompletedFirstTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.mainProduct, state.mainProduct) && zdlpuopuiu.eablkybsjg(this.expandedProductIds, state.expandedProductIds) && this.deliveryCode == state.deliveryCode && zdlpuopuiu.eablkybsjg(this.productDataList, state.productDataList) && zdlpuopuiu.eablkybsjg(this.payload, state.payload) && zdlpuopuiu.eablkybsjg(this.recommendations, state.recommendations) && zdlpuopuiu.eablkybsjg(this.reviews, state.reviews) && zdlpuopuiu.eablkybsjg(this.comboSetList, state.comboSetList) && zdlpuopuiu.eablkybsjg(this.dialog, state.dialog) && this.isRatingFeatureEnabled == state.isRatingFeatureEnabled && this.isVivinoFeatureEnabled == state.isVivinoFeatureEnabled && this.isPurchaseListsFeatureEnabled == state.isPurchaseListsFeatureEnabled && this.isLoading == state.isLoading && this.analyticLoadCompletedFirstTime == state.analyticLoadCompletedFirstTime;
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final boolean getIsPurchaseListsFeatureEnabled() {
        return this.isPurchaseListsFeatureEnabled;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final ProductPayload getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final List getComboSetList() {
        return this.comboSetList;
    }

    public int hashCode() {
        Product product = this.mainProduct;
        int iHashCode = (((product == null ? 0 : product.hashCode()) * 31) + this.expandedProductIds.hashCode()) * 31;
        DeliveryCode deliveryCode = this.deliveryCode;
        int iHashCode2 = (((((iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.productDataList.hashCode()) * 31) + this.payload.hashCode()) * 31;
        Map map = this.recommendations;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Reviews reviews = this.reviews;
        int iHashCode4 = (iHashCode3 + (reviews == null ? 0 : reviews.hashCode())) * 31;
        List list = this.comboSetList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        SpecificProductStore$Dialog specificProductStore$Dialog = this.dialog;
        return ((((((((((iHashCode5 + (specificProductStore$Dialog != null ? specificProductStore$Dialog.hashCode() : 0)) * 31) + Boolean.hashCode(this.isRatingFeatureEnabled)) * 31) + Boolean.hashCode(this.isVivinoFeatureEnabled)) * 31) + Boolean.hashCode(this.isPurchaseListsFeatureEnabled)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.analyticLoadCompletedFirstTime);
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
    public final DeliveryCode getDeliveryCode() {
        return this.deliveryCode;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final SpecificProductStore$Dialog getDialog() {
        return this.dialog;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final Map getRecommendations() {
        return this.recommendations;
    }

    public String toString() {
        return "State(mainProduct=" + this.mainProduct + ", expandedProductIds=" + this.expandedProductIds + ", deliveryCode=" + this.deliveryCode + ", productDataList=" + this.productDataList + ", payload=" + this.payload + ", recommendations=" + this.recommendations + ", reviews=" + this.reviews + ", comboSetList=" + this.comboSetList + ", dialog=" + this.dialog + ", isRatingFeatureEnabled=" + this.isRatingFeatureEnabled + ", isVivinoFeatureEnabled=" + this.isVivinoFeatureEnabled + ", isPurchaseListsFeatureEnabled=" + this.isPurchaseListsFeatureEnabled + ", isLoading=" + this.isLoading + ", analyticLoadCompletedFirstTime=" + this.analyticLoadCompletedFirstTime + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final List getProductDataList() {
        return this.productDataList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.mainProduct, flags);
        Set set = this.expandedProductIds;
        dest.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
        dest.writeParcelable(this.deliveryCode, flags);
        List list = this.productDataList;
        dest.writeInt(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        dest.writeParcelable(this.payload, flags);
        Map map = this.recommendations;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                dest.writeString(((d01.iobyxmoadg) entry.getKey()).name());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        dest.writeParcelable(this.reviews, flags);
        List list2 = this.comboSetList;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                dest.writeParcelable((Parcelable) it3.next(), flags);
            }
        }
        dest.writeParcelable(this.dialog, flags);
        dest.writeInt(this.isRatingFeatureEnabled ? 1 : 0);
        dest.writeInt(this.isVivinoFeatureEnabled ? 1 : 0);
        dest.writeInt(this.isPurchaseListsFeatureEnabled ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.analyticLoadCompletedFirstTime ? 1 : 0);
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final boolean getIsRatingFeatureEnabled() {
        return this.isRatingFeatureEnabled;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final Reviews getReviews() {
        return this.reviews;
    }

    public final State zoijcleaow(Product mainProduct, Set expandedProductIds, DeliveryCode deliveryCode, List productDataList, ProductPayload payload, Map recommendations, Reviews reviews, List comboSetList, SpecificProductStore$Dialog dialog, boolean isRatingFeatureEnabled, boolean isVivinoFeatureEnabled, boolean isPurchaseListsFeatureEnabled, boolean isLoading, boolean analyticLoadCompletedFirstTime) {
        zdlpuopuiu.btonecajqb(expandedProductIds, "expandedProductIds");
        zdlpuopuiu.btonecajqb(productDataList, "productDataList");
        zdlpuopuiu.btonecajqb(payload, "payload");
        return new State(mainProduct, expandedProductIds, deliveryCode, productDataList, payload, recommendations, reviews, comboSetList, dialog, isRatingFeatureEnabled, isVivinoFeatureEnabled, isPurchaseListsFeatureEnabled, isLoading, analyticLoadCompletedFirstTime);
    }

    public /* synthetic */ State(Product product, Set set, DeliveryCode deliveryCode, List list, ProductPayload productPayload, Map map, Reviews reviews, List list2, SpecificProductStore$Dialog specificProductStore$Dialog, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i13, gtknphoqwx gtknphoqwxVar) {
        this(product, set, deliveryCode, list, productPayload, map, reviews, list2, specificProductStore$Dialog, z13, z14, z15, z16, (i13 & 8192) != 0 ? false : z17);
    }
}
