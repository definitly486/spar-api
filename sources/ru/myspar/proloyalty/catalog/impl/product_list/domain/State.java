package ru.myspar.proloyalty.catalog.impl.product_list.domain;

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
import mz0.ppxfxbqfkf;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.catalog.api.model.ProductListPayload;
import ru.myspar.proloyalty.catalog.impl.product_list.domain.model.ProductListFeatureToggles;
import ru.myspar.proloyalty.catalog.impl.product_list.domain.model.ProductListRecommendationBlock;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogSection;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogWithSubCatalogs;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.product.ProductListData;
import ru.myspar.proloyalty.core.domain.models.product.ProductsPromoBanner;
import ru.myspar.proloyalty.core.domain.models.product.PromoProduct;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import tp0.rgvfuqvkyq;

/* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.product_list.domain.ProductListStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0010\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u001f\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020)H\u0007¢\u0006\u0004\b.\u0010/Jð\u0001\u00101\u001a\u0002002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00062\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u00062\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#HÇ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020)H×\u0001¢\u0006\u0004\b5\u0010/J\u001a\u00108\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u000106H×\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\b\t\u0010ER\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u00104R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\b>\u0010VR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bI\u0010YR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00108\u0006¢\u0006\f\n\u0004\b^\u0010U\u001a\u0004\b_\u0010VR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010\u001b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bd\u0010C\u001a\u0004\be\u0010ER\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00108\u0006¢\u0006\f\n\u0004\bS\u0010U\u001a\u0004\bf\u0010VR\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bb\u0010C\u001a\u0004\bg\u0010ER\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f8\u0006¢\u0006\f\n\u0004\be\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bg\u0010k\u001a\u0004\bd\u0010lR\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\bG\u0010m\u001a\u0004\b^\u0010nR\u0011\u0010p\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bo\u00104R\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020q0\u00108F¢\u0006\u0006\u001a\u0004\bF\u0010VR\u0013\u0010t\u001a\u0004\u0018\u00010q8F¢\u0006\u0006\u001a\u0004\b`\u0010s¨\u0006u"}, d2 = {"ru/myspar/proloyalty/catalog/impl/product_list/domain/ProductListStore$State", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/catalog/api/model/ProductListPayload;", "payload", "Ltp0/rgvfuqvkyq$iobyxmoadg;", "headerType", "", "isSwipeToRefreshLoading", "isProductListLoading", "isFullScreenLoading", "Lru/myspar/proloyalty/catalog/impl/product_list/domain/model/ProductListFeatureToggles;", "featureToggles", "Lru/myspar/proloyalty/core/domain/models/catalog/CatalogWithSubCatalogs;", "catalogSection", "", "selectedCatalogSectionId", "", "Lru/myspar/proloyalty/core/domain/models/cart/ProductUIData;", "productDataList", "Lru/myspar/proloyalty/core/domain/models/product/ProductListData;", "productListData", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "deliveryCode", "Lru/myspar/proloyalty/core/domain/models/catalog/CatalogBanner;", "banners", "Lmz0/ppxfxbqfkf;", "selectedSort", "isGridType", "Lru/myspar/proloyalty/core/domain/models/comboset/ComboSet;", "comboSetList", "isNeededShowComboSetShimmer", "", "expandedProductIds", "Lru/myspar/proloyalty/catalog/impl/product_list/domain/model/ProductListRecommendationBlock;", "recommendations", "Lru/myspar/proloyalty/core/domain/models/product/ProductsPromoBanner;", "promoBanner", "<init>", "(Lru/myspar/proloyalty/catalog/api/model/ProductListPayload;Ltp0/rgvfuqvkyq$iobyxmoadg;ZZZLru/myspar/proloyalty/catalog/impl/product_list/domain/model/ProductListFeatureToggles;Lru/myspar/proloyalty/core/domain/models/catalog/CatalogWithSubCatalogs;Ljava/lang/String;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/product/ProductListData;Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;Ljava/util/List;Lmz0/ppxfxbqfkf;ZLjava/util/List;ZLjava/util/Set;Lru/myspar/proloyalty/catalog/impl/product_list/domain/model/ProductListRecommendationBlock;Lru/myspar/proloyalty/core/domain/models/product/ProductsPromoBanner;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/catalog/impl/product_list/domain/ProductListStore$State;", "zoijcleaow", "(Lru/myspar/proloyalty/catalog/api/model/ProductListPayload;Ltp0/rgvfuqvkyq$iobyxmoadg;ZZZLru/myspar/proloyalty/catalog/impl/product_list/domain/model/ProductListFeatureToggles;Lru/myspar/proloyalty/core/domain/models/catalog/CatalogWithSubCatalogs;Ljava/lang/String;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/product/ProductListData;Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;Ljava/util/List;Lmz0/ppxfxbqfkf;ZLjava/util/List;ZLjava/util/Set;Lru/myspar/proloyalty/catalog/impl/product_list/domain/model/ProductListRecommendationBlock;Lru/myspar/proloyalty/core/domain/models/product/ProductsPromoBanner;)Lru/myspar/proloyalty/catalog/impl/product_list/domain/ProductListStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/catalog/api/model/ProductListPayload;", "oxmwwwfdhm", "()Lru/myspar/proloyalty/catalog/api/model/ProductListPayload;", "yggfygwlhe", "Ltp0/rgvfuqvkyq$iobyxmoadg;", "wflxmlrfwp", "()Ltp0/rgvfuqvkyq$iobyxmoadg;", "jyumaefscl", "Z", "cllcsxoeiz", "()Z", "iwizpuwonk", "jpowsppfya", "cqumvgiudr", "esjtqupxsv", "Lru/myspar/proloyalty/catalog/impl/product_list/domain/model/ProductListFeatureToggles;", "btonecajqb", "()Lru/myspar/proloyalty/catalog/impl/product_list/domain/model/ProductListFeatureToggles;", "lereixgezr", "Lru/myspar/proloyalty/core/domain/models/catalog/CatalogWithSubCatalogs;", "gxszxtbevo", "()Lru/myspar/proloyalty/core/domain/models/catalog/CatalogWithSubCatalogs;", "pmvmpeiblj", "Ljava/lang/String;", "wwaezpbzkn", "zynmafqrjb", "Ljava/util/List;", "()Ljava/util/List;", "istkbnxepw", "Lru/myspar/proloyalty/core/domain/models/product/ProductListData;", "()Lru/myspar/proloyalty/core/domain/models/product/ProductListData;", "cdpycssgdh", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "nufgyqmvbu", "()Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "yadqdtsiqt", "eablkybsjg", "iozdgvuglv", "Lmz0/ppxfxbqfkf;", "ylkuphrtab", "()Lmz0/ppxfxbqfkf;", "lmojexxdyd", "pkzmftpjix", "lqeggnwhkg", "hcddaimhww", "Ljava/util/Set;", "dxjokdxxww", "()Ljava/util/Set;", "Lru/myspar/proloyalty/catalog/impl/product_list/domain/model/ProductListRecommendationBlock;", "()Lru/myspar/proloyalty/catalog/impl/product_list/domain/model/ProductListRecommendationBlock;", "Lru/myspar/proloyalty/core/domain/models/product/ProductsPromoBanner;", "()Lru/myspar/proloyalty/core/domain/models/product/ProductsPromoBanner;", "gtknphoqwx", "headerTitle", "Lru/myspar/proloyalty/core/domain/models/product/Product;", "productList", "()Lru/myspar/proloyalty/core/domain/models/product/Product;", "promoProduct", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryCode;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFullScreenLoading;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductListFeatureToggles featureToggles;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductListRecommendationBlock recommendations;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final ppxfxbqfkf selectedSort;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductListData productListData;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isProductListLoading;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductsPromoBanner promoBanner;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSwipeToRefreshLoading;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final CatalogWithSubCatalogs catalogSection;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGridType;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set expandedProductIds;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedCatalogSectionId;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final List comboSetList;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final List banners;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final rgvfuqvkyq.iobyxmoadg headerType;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNeededShowComboSetShimmer;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductListPayload payload;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productDataList;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.product_list.domain.ProductListStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            ProductListPayload productListPayload = (ProductListPayload) parcel.readParcelable(State.class.getClassLoader());
            rgvfuqvkyq.iobyxmoadg iobyxmoadgVarValueOf = rgvfuqvkyq.iobyxmoadg.valueOf(parcel.readString());
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            ProductListFeatureToggles productListFeatureTogglesCreateFromParcel = ProductListFeatureToggles.CREATOR.createFromParcel(parcel);
            CatalogWithSubCatalogs catalogWithSubCatalogs = (CatalogWithSubCatalogs) parcel.readParcelable(State.class.getClassLoader());
            String string = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            ProductListData productListData = (ProductListData) parcel.readParcelable(State.class.getClassLoader());
            DeliveryCode deliveryCode = (DeliveryCode) parcel.readParcelable(State.class.getClassLoader());
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList2.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            ppxfxbqfkf ppxfxbqfkfVarValueOf = ppxfxbqfkf.valueOf(parcel.readString());
            boolean z16 = parcel.readInt() != 0;
            int i17 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i17);
            int i18 = 0;
            while (i18 != i17) {
                arrayList3.add(parcel.readParcelable(State.class.getClassLoader()));
                i18++;
                i17 = i17;
            }
            boolean z17 = parcel.readInt() != 0;
            int i19 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i19);
            int i23 = 0;
            while (i23 != i19) {
                linkedHashSet.add(parcel.readString());
                i23++;
                i19 = i19;
            }
            return new State(productListPayload, iobyxmoadgVarValueOf, z13, z14, z15, productListFeatureTogglesCreateFromParcel, catalogWithSubCatalogs, string, arrayList, productListData, deliveryCode, arrayList2, ppxfxbqfkfVarValueOf, z16, arrayList3, z17, linkedHashSet, ProductListRecommendationBlock.CREATOR.createFromParcel(parcel), (ProductsPromoBanner) parcel.readParcelable(State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(ProductListPayload payload, rgvfuqvkyq.iobyxmoadg headerType, boolean z13, boolean z14, boolean z15, ProductListFeatureToggles featureToggles, CatalogWithSubCatalogs catalogWithSubCatalogs, String str, List productDataList, ProductListData productListData, DeliveryCode deliveryCode, List banners, ppxfxbqfkf selectedSort, boolean z16, List comboSetList, boolean z17, Set expandedProductIds, ProductListRecommendationBlock recommendations, ProductsPromoBanner productsPromoBanner) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        zdlpuopuiu.btonecajqb(headerType, "headerType");
        zdlpuopuiu.btonecajqb(featureToggles, "featureToggles");
        zdlpuopuiu.btonecajqb(productDataList, "productDataList");
        zdlpuopuiu.btonecajqb(banners, "banners");
        zdlpuopuiu.btonecajqb(selectedSort, "selectedSort");
        zdlpuopuiu.btonecajqb(comboSetList, "comboSetList");
        zdlpuopuiu.btonecajqb(expandedProductIds, "expandedProductIds");
        zdlpuopuiu.btonecajqb(recommendations, "recommendations");
        this.payload = payload;
        this.headerType = headerType;
        this.isSwipeToRefreshLoading = z13;
        this.isProductListLoading = z14;
        this.isFullScreenLoading = z15;
        this.featureToggles = featureToggles;
        this.catalogSection = catalogWithSubCatalogs;
        this.selectedCatalogSectionId = str;
        this.productDataList = productDataList;
        this.productListData = productListData;
        this.deliveryCode = deliveryCode;
        this.banners = banners;
        this.selectedSort = selectedSort;
        this.isGridType = z16;
        this.comboSetList = comboSetList;
        this.isNeededShowComboSetShimmer = z17;
        this.expandedProductIds = expandedProductIds;
        this.recommendations = recommendations;
        this.promoBanner = productsPromoBanner;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final ProductListFeatureToggles getFeatureToggles() {
        return this.featureToggles;
    }

    /* JADX INFO: renamed from: cllcsxoeiz, reason: from getter */
    public final boolean getIsSwipeToRefreshLoading() {
        return this.isSwipeToRefreshLoading;
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
    public final List getBanners() {
        return this.banners;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.payload, state.payload) && this.headerType == state.headerType && this.isSwipeToRefreshLoading == state.isSwipeToRefreshLoading && this.isProductListLoading == state.isProductListLoading && this.isFullScreenLoading == state.isFullScreenLoading && zdlpuopuiu.eablkybsjg(this.featureToggles, state.featureToggles) && zdlpuopuiu.eablkybsjg(this.catalogSection, state.catalogSection) && zdlpuopuiu.eablkybsjg(this.selectedCatalogSectionId, state.selectedCatalogSectionId) && zdlpuopuiu.eablkybsjg(this.productDataList, state.productDataList) && zdlpuopuiu.eablkybsjg(this.productListData, state.productListData) && this.deliveryCode == state.deliveryCode && zdlpuopuiu.eablkybsjg(this.banners, state.banners) && this.selectedSort == state.selectedSort && this.isGridType == state.isGridType && zdlpuopuiu.eablkybsjg(this.comboSetList, state.comboSetList) && this.isNeededShowComboSetShimmer == state.isNeededShowComboSetShimmer && zdlpuopuiu.eablkybsjg(this.expandedProductIds, state.expandedProductIds) && zdlpuopuiu.eablkybsjg(this.recommendations, state.recommendations) && zdlpuopuiu.eablkybsjg(this.promoBanner, state.promoBanner);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final ProductListData getProductListData() {
        return this.productListData;
    }

    public final String gtknphoqwx() {
        CatalogSection rootCatalogSection;
        String strEablkybsjg = dxjokdxxww.eablkybsjg(this.payload.getProductsTitle());
        if (strEablkybsjg != null) {
            return strEablkybsjg;
        }
        CatalogWithSubCatalogs catalogWithSubCatalogs = this.catalogSection;
        String name = (catalogWithSubCatalogs == null || (rootCatalogSection = catalogWithSubCatalogs.getRootCatalogSection()) == null) ? null : rootCatalogSection.getName();
        return name == null ? "" : name;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final CatalogWithSubCatalogs getCatalogSection() {
        return this.catalogSection;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.payload.hashCode() * 31) + this.headerType.hashCode()) * 31) + Boolean.hashCode(this.isSwipeToRefreshLoading)) * 31) + Boolean.hashCode(this.isProductListLoading)) * 31) + Boolean.hashCode(this.isFullScreenLoading)) * 31) + this.featureToggles.hashCode()) * 31;
        CatalogWithSubCatalogs catalogWithSubCatalogs = this.catalogSection;
        int iHashCode2 = (iHashCode + (catalogWithSubCatalogs == null ? 0 : catalogWithSubCatalogs.hashCode())) * 31;
        String str = this.selectedCatalogSectionId;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.productDataList.hashCode()) * 31;
        ProductListData productListData = this.productListData;
        int iHashCode4 = (iHashCode3 + (productListData == null ? 0 : productListData.hashCode())) * 31;
        DeliveryCode deliveryCode = this.deliveryCode;
        int iHashCode5 = (((((((((((((((iHashCode4 + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.banners.hashCode()) * 31) + this.selectedSort.hashCode()) * 31) + Boolean.hashCode(this.isGridType)) * 31) + this.comboSetList.hashCode()) * 31) + Boolean.hashCode(this.isNeededShowComboSetShimmer)) * 31) + this.expandedProductIds.hashCode()) * 31) + this.recommendations.hashCode()) * 31;
        ProductsPromoBanner productsPromoBanner = this.promoBanner;
        return iHashCode5 + (productsPromoBanner != null ? productsPromoBanner.hashCode() : 0);
    }

    /* JADX INFO: renamed from: hcddaimhww, reason: from getter */
    public final boolean getIsNeededShowComboSetShimmer() {
        return this.isNeededShowComboSetShimmer;
    }

    public final Product iozdgvuglv() {
        PromoProduct promo;
        ProductListData productListData = this.productListData;
        if (productListData == null || (promo = productListData.getPromo()) == null) {
            return null;
        }
        return promo.getProduct();
    }

    public final List iwizpuwonk() {
        ProductListData productListData = this.productListData;
        List productList = productListData != null ? productListData.getProductList() : null;
        return productList == null ? jyumaefscl.wflxmlrfwp() : productList;
    }

    /* JADX INFO: renamed from: jpowsppfya, reason: from getter */
    public final boolean getIsProductListLoading() {
        return this.isProductListLoading;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final ProductListRecommendationBlock getRecommendations() {
        return this.recommendations;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final List getComboSetList() {
        return this.comboSetList;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final DeliveryCode getDeliveryCode() {
        return this.deliveryCode;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final ProductListPayload getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: pkzmftpjix, reason: from getter */
    public final boolean getIsGridType() {
        return this.isGridType;
    }

    public String toString() {
        return "State(payload=" + this.payload + ", headerType=" + this.headerType + ", isSwipeToRefreshLoading=" + this.isSwipeToRefreshLoading + ", isProductListLoading=" + this.isProductListLoading + ", isFullScreenLoading=" + this.isFullScreenLoading + ", featureToggles=" + this.featureToggles + ", catalogSection=" + this.catalogSection + ", selectedCatalogSectionId=" + this.selectedCatalogSectionId + ", productDataList=" + this.productDataList + ", productListData=" + this.productListData + ", deliveryCode=" + this.deliveryCode + ", banners=" + this.banners + ", selectedSort=" + this.selectedSort + ", isGridType=" + this.isGridType + ", comboSetList=" + this.comboSetList + ", isNeededShowComboSetShimmer=" + this.isNeededShowComboSetShimmer + ", expandedProductIds=" + this.expandedProductIds + ", recommendations=" + this.recommendations + ", promoBanner=" + this.promoBanner + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final rgvfuqvkyq.iobyxmoadg getHeaderType() {
        return this.headerType;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.payload, flags);
        dest.writeString(this.headerType.name());
        dest.writeInt(this.isSwipeToRefreshLoading ? 1 : 0);
        dest.writeInt(this.isProductListLoading ? 1 : 0);
        dest.writeInt(this.isFullScreenLoading ? 1 : 0);
        this.featureToggles.writeToParcel(dest, flags);
        dest.writeParcelable(this.catalogSection, flags);
        dest.writeString(this.selectedCatalogSectionId);
        List list = this.productDataList;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeParcelable(this.productListData, flags);
        dest.writeParcelable(this.deliveryCode, flags);
        List list2 = this.banners;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        dest.writeString(this.selectedSort.name());
        dest.writeInt(this.isGridType ? 1 : 0);
        List list3 = this.comboSetList;
        dest.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            dest.writeParcelable((Parcelable) it3.next(), flags);
        }
        dest.writeInt(this.isNeededShowComboSetShimmer ? 1 : 0);
        Set set = this.expandedProductIds;
        dest.writeInt(set.size());
        Iterator it4 = set.iterator();
        while (it4.hasNext()) {
            dest.writeString((String) it4.next());
        }
        this.recommendations.writeToParcel(dest, flags);
        dest.writeParcelable(this.promoBanner, flags);
    }

    /* JADX INFO: renamed from: wwaezpbzkn, reason: from getter */
    public final String getSelectedCatalogSectionId() {
        return this.selectedCatalogSectionId;
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final ProductsPromoBanner getPromoBanner() {
        return this.promoBanner;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final List getProductDataList() {
        return this.productDataList;
    }

    /* JADX INFO: renamed from: ylkuphrtab, reason: from getter */
    public final ppxfxbqfkf getSelectedSort() {
        return this.selectedSort;
    }

    public final State zoijcleaow(ProductListPayload payload, rgvfuqvkyq.iobyxmoadg headerType, boolean isSwipeToRefreshLoading, boolean isProductListLoading, boolean isFullScreenLoading, ProductListFeatureToggles featureToggles, CatalogWithSubCatalogs catalogSection, String selectedCatalogSectionId, List productDataList, ProductListData productListData, DeliveryCode deliveryCode, List banners, ppxfxbqfkf selectedSort, boolean isGridType, List comboSetList, boolean isNeededShowComboSetShimmer, Set expandedProductIds, ProductListRecommendationBlock recommendations, ProductsPromoBanner promoBanner) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        zdlpuopuiu.btonecajqb(headerType, "headerType");
        zdlpuopuiu.btonecajqb(featureToggles, "featureToggles");
        zdlpuopuiu.btonecajqb(productDataList, "productDataList");
        zdlpuopuiu.btonecajqb(banners, "banners");
        zdlpuopuiu.btonecajqb(selectedSort, "selectedSort");
        zdlpuopuiu.btonecajqb(comboSetList, "comboSetList");
        zdlpuopuiu.btonecajqb(expandedProductIds, "expandedProductIds");
        zdlpuopuiu.btonecajqb(recommendations, "recommendations");
        return new State(payload, headerType, isSwipeToRefreshLoading, isProductListLoading, isFullScreenLoading, featureToggles, catalogSection, selectedCatalogSectionId, productDataList, productListData, deliveryCode, banners, selectedSort, isGridType, comboSetList, isNeededShowComboSetShimmer, expandedProductIds, recommendations, promoBanner);
    }

    public /* synthetic */ State(ProductListPayload productListPayload, rgvfuqvkyq.iobyxmoadg iobyxmoadgVar, boolean z13, boolean z14, boolean z15, ProductListFeatureToggles productListFeatureToggles, CatalogWithSubCatalogs catalogWithSubCatalogs, String str, List list, ProductListData productListData, DeliveryCode deliveryCode, List list2, ppxfxbqfkf ppxfxbqfkfVar, boolean z16, List list3, boolean z17, Set set, ProductListRecommendationBlock productListRecommendationBlock, ProductsPromoBanner productsPromoBanner, int i13, gtknphoqwx gtknphoqwxVar) {
        this(productListPayload, iobyxmoadgVar, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? false : z15, (i13 & 32) != 0 ? ProductListFeatureToggles.INSTANCE.iobyxmoadg() : productListFeatureToggles, (i13 & 64) != 0 ? null : catalogWithSubCatalogs, str, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : productListData, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : deliveryCode, (i13 & 2048) != 0 ? jyumaefscl.wflxmlrfwp() : list2, ppxfxbqfkfVar, (i13 & 8192) != 0 ? false : z16, (i13 & 16384) != 0 ? jyumaefscl.wflxmlrfwp() : list3, (32768 & i13) != 0 ? false : z17, (65536 & i13) != 0 ? ikoacuggdj.eablkybsjg() : set, (131072 & i13) != 0 ? ProductListRecommendationBlock.INSTANCE.iobyxmoadg() : productListRecommendationBlock, (i13 & 262144) != 0 ? null : productsPromoBanner);
    }
}
