package ru.myspar.proloyalty.catalog.impl.search.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import j0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mz0.ppxfxbqfkf;
import p0.tzroggbefp;
import ru.myspar.proloyalty.catalog.api.model.SearchPayload;
import ru.myspar.proloyalty.core.domain.models.product.ProductListData;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.search.domain.SearchStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001Bá\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0019H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0019H\u0007¢\u0006\u0004\b*\u0010+Jð\u0001\u0010-\u001a\u00020,2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0019H×\u0001¢\u0006\u0004\b1\u0010+J\u001a\u00104\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u000102H×\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010;\u001a\u0004\bC\u0010=R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\bE\u0010=R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bB\u0010HR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\b:\u0010SR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00118\u0006¢\u0006\f\n\u0004\bT\u0010R\u001a\u0004\bF\u0010SR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118\u0006¢\u0006\f\n\u0004\bU\u0010R\u001a\u0004\bV\u0010SR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010N\u001a\u0004\bW\u0010PR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b<\u0010X\u001a\u0004\bY\u0010+R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bC\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\b]\u0010=R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b^\u0010;\u001a\u0004\b_\u0010=R\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b_\u0010;\u001a\u0004\b^\u0010=R\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b`\u0010;\u001a\u0004\ba\u0010=R\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\ba\u0010;\u001a\u0004\b`\u0010=R\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00140\u00118F¢\u0006\u0006\u001a\u0004\bb\u0010S¨\u0006d"}, d2 = {"ru/myspar/proloyalty/catalog/impl/search/domain/SearchStore$State", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/catalog/api/model/SearchPayload;", "payload", "", "isGridType", "Lmz0/ppxfxbqfkf;", "sortType", "isLoading", "isPageLoading", "Lp0/tzroggbefp;", "searchQuery", "Lru/myspar/proloyalty/core/domain/models/product/ProductListData;", "productListData", "", "", "expandedProductIds", "", "Lru/myspar/proloyalty/core/domain/models/searchquery/HistoryItemModel;", "searchHistory", "Lru/myspar/proloyalty/core/domain/models/product/Product;", "searchRecommendations", "Lru/myspar/proloyalty/core/domain/models/cart/ProductUIData;", "cartProductDataList", "favoritesProductIds", "", "currentPage", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "deliveryCode", "filterSortPanelIsVisible", "isRatingFeatureEnabled", "isPurchaseListsFeatureEnabled", "isVivinoFeatureEnabled", "isSearchSuggestionsEnabled", "<init>", "(Lru/myspar/proloyalty/catalog/api/model/SearchPayload;ZLmz0/ppxfxbqfkf;ZZLp0/tzroggbefp;Lru/myspar/proloyalty/core/domain/models/product/ProductListData;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;ILru/myspar/proloyalty/core/models/delivery/DeliveryCode;ZZZZZ)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/catalog/impl/search/domain/SearchStore$State;", "zoijcleaow", "(Lru/myspar/proloyalty/catalog/api/model/SearchPayload;ZLmz0/ppxfxbqfkf;ZZLp0/tzroggbefp;Lru/myspar/proloyalty/core/domain/models/product/ProductListData;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;ILru/myspar/proloyalty/core/models/delivery/DeliveryCode;ZZZZZ)Lru/myspar/proloyalty/catalog/impl/search/domain/SearchStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/catalog/api/model/SearchPayload;", "gtknphoqwx", "()Lru/myspar/proloyalty/catalog/api/model/SearchPayload;", "yggfygwlhe", "Z", "iozdgvuglv", "()Z", "jyumaefscl", "Lmz0/ppxfxbqfkf;", "yadqdtsiqt", "()Lmz0/ppxfxbqfkf;", "iwizpuwonk", "lmojexxdyd", "cqumvgiudr", "wwaezpbzkn", "esjtqupxsv", "Lp0/tzroggbefp;", "()Lp0/tzroggbefp;", "lereixgezr", "Lru/myspar/proloyalty/core/domain/models/product/ProductListData;", "oxmwwwfdhm", "()Lru/myspar/proloyalty/core/domain/models/product/ProductListData;", "pmvmpeiblj", "Ljava/util/Set;", "nufgyqmvbu", "()Ljava/util/Set;", "zynmafqrjb", "Ljava/util/List;", "()Ljava/util/List;", "istkbnxepw", "cdpycssgdh", "eablkybsjg", "dxjokdxxww", "I", "gxszxtbevo", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "lqeggnwhkg", "()Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "btonecajqb", "ylkuphrtab", "pkzmftpjix", "hcddaimhww", "jpowsppfya", "wflxmlrfwp", "productList", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final List cartProductDataList;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPageLoading;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp searchQuery;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVivinoFeatureEnabled;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final int currentPage;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final List searchRecommendations;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSearchSuggestionsEnabled;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final ppxfxbqfkf sortType;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductListData productListData;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryCode;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPurchaseListsFeatureEnabled;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set expandedProductIds;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean filterSortPanelIsVisible;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set favoritesProductIds;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGridType;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRatingFeatureEnabled;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final SearchPayload payload;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final List searchHistory;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.search.domain.SearchStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            SearchPayload searchPayload = (SearchPayload) parcel.readParcelable(State.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            ppxfxbqfkf ppxfxbqfkfVarValueOf = ppxfxbqfkf.valueOf(parcel.readString());
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            tzroggbefp tzroggbefpVarIobyxmoadg = yr0.iobyxmoadg.f126300iobyxmoadg.iobyxmoadg(parcel);
            ProductListData productListData = (ProductListData) parcel.readParcelable(State.class.getClassLoader());
            int i13 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                linkedHashSet.add(parcel.readString());
            }
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            int i17 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                arrayList2.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            int i19 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i19);
            for (int i23 = 0; i23 != i19; i23++) {
                arrayList3.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            int i24 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i24);
            int i25 = 0;
            while (i25 != i24) {
                linkedHashSet2.add(parcel.readString());
                i25++;
                i24 = i24;
            }
            return new State(searchPayload, z13, ppxfxbqfkfVarValueOf, z14, z15, tzroggbefpVarIobyxmoadg, productListData, linkedHashSet, arrayList, arrayList2, arrayList3, linkedHashSet2, parcel.readInt(), (DeliveryCode) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(SearchPayload payload, boolean z13, ppxfxbqfkf sortType, boolean z14, boolean z15, tzroggbefp searchQuery, ProductListData productListData, Set expandedProductIds, List searchHistory, List searchRecommendations, List cartProductDataList, Set favoritesProductIds, int i13, DeliveryCode deliveryCode, boolean z16, boolean z17, boolean z18, boolean z19, boolean z23) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        zdlpuopuiu.btonecajqb(sortType, "sortType");
        zdlpuopuiu.btonecajqb(searchQuery, "searchQuery");
        zdlpuopuiu.btonecajqb(expandedProductIds, "expandedProductIds");
        zdlpuopuiu.btonecajqb(searchHistory, "searchHistory");
        zdlpuopuiu.btonecajqb(searchRecommendations, "searchRecommendations");
        zdlpuopuiu.btonecajqb(cartProductDataList, "cartProductDataList");
        zdlpuopuiu.btonecajqb(favoritesProductIds, "favoritesProductIds");
        this.payload = payload;
        this.isGridType = z13;
        this.sortType = sortType;
        this.isLoading = z14;
        this.isPageLoading = z15;
        this.searchQuery = searchQuery;
        this.productListData = productListData;
        this.expandedProductIds = expandedProductIds;
        this.searchHistory = searchHistory;
        this.searchRecommendations = searchRecommendations;
        this.cartProductDataList = cartProductDataList;
        this.favoritesProductIds = favoritesProductIds;
        this.currentPage = i13;
        this.deliveryCode = deliveryCode;
        this.filterSortPanelIsVisible = z16;
        this.isRatingFeatureEnabled = z17;
        this.isPurchaseListsFeatureEnabled = z18;
        this.isVivinoFeatureEnabled = z19;
        this.isSearchSuggestionsEnabled = z23;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final boolean getFilterSortPanelIsVisible() {
        return this.filterSortPanelIsVisible;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final Set getFavoritesProductIds() {
        return this.favoritesProductIds;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getCartProductDataList() {
        return this.cartProductDataList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.payload, state.payload) && this.isGridType == state.isGridType && this.sortType == state.sortType && this.isLoading == state.isLoading && this.isPageLoading == state.isPageLoading && zdlpuopuiu.eablkybsjg(this.searchQuery, state.searchQuery) && zdlpuopuiu.eablkybsjg(this.productListData, state.productListData) && zdlpuopuiu.eablkybsjg(this.expandedProductIds, state.expandedProductIds) && zdlpuopuiu.eablkybsjg(this.searchHistory, state.searchHistory) && zdlpuopuiu.eablkybsjg(this.searchRecommendations, state.searchRecommendations) && zdlpuopuiu.eablkybsjg(this.cartProductDataList, state.cartProductDataList) && zdlpuopuiu.eablkybsjg(this.favoritesProductIds, state.favoritesProductIds) && this.currentPage == state.currentPage && this.deliveryCode == state.deliveryCode && this.filterSortPanelIsVisible == state.filterSortPanelIsVisible && this.isRatingFeatureEnabled == state.isRatingFeatureEnabled && this.isPurchaseListsFeatureEnabled == state.isPurchaseListsFeatureEnabled && this.isVivinoFeatureEnabled == state.isVivinoFeatureEnabled && this.isSearchSuggestionsEnabled == state.isSearchSuggestionsEnabled;
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final List getSearchRecommendations() {
        return this.searchRecommendations;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final SearchPayload getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.payload.hashCode() * 31) + Boolean.hashCode(this.isGridType)) * 31) + this.sortType.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isPageLoading)) * 31) + this.searchQuery.hashCode()) * 31;
        ProductListData productListData = this.productListData;
        int iHashCode2 = (((((((((((((iHashCode + (productListData == null ? 0 : productListData.hashCode())) * 31) + this.expandedProductIds.hashCode()) * 31) + this.searchHistory.hashCode()) * 31) + this.searchRecommendations.hashCode()) * 31) + this.cartProductDataList.hashCode()) * 31) + this.favoritesProductIds.hashCode()) * 31) + Integer.hashCode(this.currentPage)) * 31;
        DeliveryCode deliveryCode = this.deliveryCode;
        return ((((((((((iHashCode2 + (deliveryCode != null ? deliveryCode.hashCode() : 0)) * 31) + Boolean.hashCode(this.filterSortPanelIsVisible)) * 31) + Boolean.hashCode(this.isRatingFeatureEnabled)) * 31) + Boolean.hashCode(this.isPurchaseListsFeatureEnabled)) * 31) + Boolean.hashCode(this.isVivinoFeatureEnabled)) * 31) + Boolean.hashCode(this.isSearchSuggestionsEnabled);
    }

    /* JADX INFO: renamed from: hcddaimhww, reason: from getter */
    public final boolean getIsSearchSuggestionsEnabled() {
        return this.isSearchSuggestionsEnabled;
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final boolean getIsGridType() {
        return this.isGridType;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final tzroggbefp getSearchQuery() {
        return this.searchQuery;
    }

    /* JADX INFO: renamed from: jpowsppfya, reason: from getter */
    public final boolean getIsVivinoFeatureEnabled() {
        return this.isVivinoFeatureEnabled;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final DeliveryCode getDeliveryCode() {
        return this.deliveryCode;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final Set getExpandedProductIds() {
        return this.expandedProductIds;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final ProductListData getProductListData() {
        return this.productListData;
    }

    /* JADX INFO: renamed from: pkzmftpjix, reason: from getter */
    public final boolean getIsRatingFeatureEnabled() {
        return this.isRatingFeatureEnabled;
    }

    public String toString() {
        return "State(payload=" + this.payload + ", isGridType=" + this.isGridType + ", sortType=" + this.sortType + ", isLoading=" + this.isLoading + ", isPageLoading=" + this.isPageLoading + ", searchQuery=" + this.searchQuery + ", productListData=" + this.productListData + ", expandedProductIds=" + this.expandedProductIds + ", searchHistory=" + this.searchHistory + ", searchRecommendations=" + this.searchRecommendations + ", cartProductDataList=" + this.cartProductDataList + ", favoritesProductIds=" + this.favoritesProductIds + ", currentPage=" + this.currentPage + ", deliveryCode=" + this.deliveryCode + ", filterSortPanelIsVisible=" + this.filterSortPanelIsVisible + ", isRatingFeatureEnabled=" + this.isRatingFeatureEnabled + ", isPurchaseListsFeatureEnabled=" + this.isPurchaseListsFeatureEnabled + ", isVivinoFeatureEnabled=" + this.isVivinoFeatureEnabled + ", isSearchSuggestionsEnabled=" + this.isSearchSuggestionsEnabled + ")";
    }

    public final List wflxmlrfwp() {
        ProductListData productListData = this.productListData;
        List productList = productListData != null ? productListData.getProductList() : null;
        return productList == null ? jyumaefscl.wflxmlrfwp() : productList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.payload, flags);
        dest.writeInt(this.isGridType ? 1 : 0);
        dest.writeString(this.sortType.name());
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.isPageLoading ? 1 : 0);
        yr0.iobyxmoadg.f126300iobyxmoadg.zoijcleaow(this.searchQuery, dest, flags);
        dest.writeParcelable(this.productListData, flags);
        Set set = this.expandedProductIds;
        dest.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
        List list = this.searchHistory;
        dest.writeInt(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        List list2 = this.searchRecommendations;
        dest.writeInt(list2.size());
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            dest.writeParcelable((Parcelable) it3.next(), flags);
        }
        List list3 = this.cartProductDataList;
        dest.writeInt(list3.size());
        Iterator it4 = list3.iterator();
        while (it4.hasNext()) {
            dest.writeParcelable((Parcelable) it4.next(), flags);
        }
        Set set2 = this.favoritesProductIds;
        dest.writeInt(set2.size());
        Iterator it5 = set2.iterator();
        while (it5.hasNext()) {
            dest.writeString((String) it5.next());
        }
        dest.writeInt(this.currentPage);
        dest.writeParcelable(this.deliveryCode, flags);
        dest.writeInt(this.filterSortPanelIsVisible ? 1 : 0);
        dest.writeInt(this.isRatingFeatureEnabled ? 1 : 0);
        dest.writeInt(this.isPurchaseListsFeatureEnabled ? 1 : 0);
        dest.writeInt(this.isVivinoFeatureEnabled ? 1 : 0);
        dest.writeInt(this.isSearchSuggestionsEnabled ? 1 : 0);
    }

    /* JADX INFO: renamed from: wwaezpbzkn, reason: from getter */
    public final boolean getIsPageLoading() {
        return this.isPageLoading;
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final ppxfxbqfkf getSortType() {
        return this.sortType;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final List getSearchHistory() {
        return this.searchHistory;
    }

    /* JADX INFO: renamed from: ylkuphrtab, reason: from getter */
    public final boolean getIsPurchaseListsFeatureEnabled() {
        return this.isPurchaseListsFeatureEnabled;
    }

    public final State zoijcleaow(SearchPayload payload, boolean isGridType, ppxfxbqfkf sortType, boolean isLoading, boolean isPageLoading, tzroggbefp searchQuery, ProductListData productListData, Set expandedProductIds, List searchHistory, List searchRecommendations, List cartProductDataList, Set favoritesProductIds, int currentPage, DeliveryCode deliveryCode, boolean filterSortPanelIsVisible, boolean isRatingFeatureEnabled, boolean isPurchaseListsFeatureEnabled, boolean isVivinoFeatureEnabled, boolean isSearchSuggestionsEnabled) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        zdlpuopuiu.btonecajqb(sortType, "sortType");
        zdlpuopuiu.btonecajqb(searchQuery, "searchQuery");
        zdlpuopuiu.btonecajqb(expandedProductIds, "expandedProductIds");
        zdlpuopuiu.btonecajqb(searchHistory, "searchHistory");
        zdlpuopuiu.btonecajqb(searchRecommendations, "searchRecommendations");
        zdlpuopuiu.btonecajqb(cartProductDataList, "cartProductDataList");
        zdlpuopuiu.btonecajqb(favoritesProductIds, "favoritesProductIds");
        return new State(payload, isGridType, sortType, isLoading, isPageLoading, searchQuery, productListData, expandedProductIds, searchHistory, searchRecommendations, cartProductDataList, favoritesProductIds, currentPage, deliveryCode, filterSortPanelIsVisible, isRatingFeatureEnabled, isPurchaseListsFeatureEnabled, isVivinoFeatureEnabled, isSearchSuggestionsEnabled);
    }

    public /* synthetic */ State(SearchPayload searchPayload, boolean z13, ppxfxbqfkf ppxfxbqfkfVar, boolean z14, boolean z15, tzroggbefp tzroggbefpVar, ProductListData productListData, Set set, List list, List list2, List list3, Set set2, int i13, DeliveryCode deliveryCode, boolean z16, boolean z17, boolean z18, boolean z19, boolean z23, int i14, gtknphoqwx gtknphoqwxVar) {
        this(searchPayload, z13, ppxfxbqfkfVar, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar, (i14 & 64) != 0 ? null : productListData, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ikoacuggdj.eablkybsjg() : set, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? jyumaefscl.wflxmlrfwp() : list3, (i14 & 2048) != 0 ? ikoacuggdj.eablkybsjg() : set2, (i14 & 4096) != 0 ? 1 : i13, (i14 & 8192) != 0 ? null : deliveryCode, (i14 & 16384) != 0 ? false : z16, (32768 & i14) != 0 ? false : z17, (65536 & i14) != 0 ? false : z18, (131072 & i14) != 0 ? false : z19, (i14 & 262144) != 0 ? false : z23);
    }
}
