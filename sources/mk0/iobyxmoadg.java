package mk0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.cqumvgiudr;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import lk0.dxjokdxxww;
import qs.eablkybsjg;
import rt.ppxfxbqfkf;
import ru.myspar.common.view.counter.model.Price;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.cart.ProductData;
import ru.myspar.core.domain.models.cart.ProductUIData;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.products_from_banner.impl.domain.product_set.State;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final d60.iobyxmoadg f67385yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final pb0.zoijcleaow f67386zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final C1392iobyxmoadg f67384jyumaefscl = new C1392iobyxmoadg(null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final int f67383iwizpuwonk = 8;

    /* JADX INFO: renamed from: mk0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1392iobyxmoadg {
        public /* synthetic */ C1392iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1392iobyxmoadg() {
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements rgvfuqvkyq {
        zoijcleaow(Object obj) {
            super(2, obj, d60.iobyxmoadg.class, "getStringWithArrayArgs", "getStringWithArrayArgs(I[Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (Object[]) obj2);
        }

        public final String iobyxmoadg(int i13, Object[] objArr) {
            return ((d60.iobyxmoadg) this.receiver).eablkybsjg(i13, objArr);
        }
    }

    public iobyxmoadg(pb0.zoijcleaow productToUiModelMapper, d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(productToUiModelMapper, "productToUiModelMapper");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f67386zdlpuopuiu = productToUiModelMapper;
        this.f67385yggfygwlhe = resourcesManager;
    }

    private final double btonecajqb(Product product, ProductData productData) {
        return gtknphoqwx(productData.getQuantity(), productData.getMeasureType(), product.getPrice(), product.getAvgWeight(), product.getIsDispPer100());
    }

    private final double gtknphoqwx(double d13, MeasureType measureType, double d14, Double d15, boolean z13) {
        Double dValueOf = Double.valueOf(d14);
        if (dValueOf.doubleValue() <= 0.009d) {
            dValueOf = null;
        }
        return ppxfxbqfkf.f83717iobyxmoadg.iobyxmoadg(d13, measureType, Double.valueOf(dValueOf != null ? dValueOf.doubleValue() : 0.0d), d15, z13);
    }

    private final gg.vdvldrhtss gxszxtbevo(List list, Set set, boolean z13) {
        boolean z14 = !z13 || (list.size() == set.size());
        Iterator it = list.iterator();
        double dNufgyqmvbu = 0.0d;
        double d13 = 0.0d;
        while (it.hasNext()) {
            ProductUiModel productUiModel = (ProductUiModel) it.next();
            if (z14 || set.contains(productUiModel.getId())) {
                double dLqeggnwhkg = lqeggnwhkg(productUiModel);
                double dNufgyqmvbu2 = eablkybsjg.nufgyqmvbu(dLqeggnwhkg, d13, null, 2, null);
                Double dIobyxmoadg = iobyxmoadg(productUiModel);
                dNufgyqmvbu = eablkybsjg.nufgyqmvbu(dIobyxmoadg != null ? dIobyxmoadg.doubleValue() : dLqeggnwhkg, dNufgyqmvbu, null, 2, null);
                d13 = dNufgyqmvbu2;
            }
        }
        return cqumvgiudr.iobyxmoadg(Double.valueOf(d13), Double.valueOf(dNufgyqmvbu));
    }

    private final Double iobyxmoadg(ProductUiModel productUiModel) {
        return ppxfxbqfkf(productUiModel.getCounterModel().getQuantity(), productUiModel.getMeasureTypeModel().getCurrentMeasure(), productUiModel.getOldPrice(), productUiModel.getAvgWeight(), productUiModel.getIsDispPer100());
    }

    private final double lqeggnwhkg(ProductUiModel productUiModel) {
        return gtknphoqwx(productUiModel.getCounterModel().getQuantity(), productUiModel.getMeasureTypeModel().getCurrentMeasure(), productUiModel.getPrice(), productUiModel.getAvgWeight(), productUiModel.getIsDispPer100());
    }

    private final List ojitshcjhn(State state) {
        List<Product> products = state.getProducts();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(products, 10));
        for (Product product : products) {
            Boolean bool = state.getIsChangeProductCountEnabled() ? state.getSelectedProductsIds().contains(product.getId()) ? Boolean.TRUE : Boolean.FALSE : null;
            List productData = state.getProductData();
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(productData, 10));
            Iterator it = productData.iterator();
            while (it.hasNext()) {
                arrayList2.add(new ProductUIData((ProductData) it.next()));
            }
            ProductUiModel productUiModelPpxfxbqfkf = this.f67386zdlpuopuiu.ppxfxbqfkf(product, arrayList2, null, state.getIsCatalogRatingFeatureEnabled(), state.getIsPurchasesListFeatureEnabled(), state.getIsVivinoFeatureEnabled(), (64 & 64) != 0 ? null : null, new zoijcleaow(this.f67385yggfygwlhe));
            arrayList.add(productUiModelPpxfxbqfkf.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModelPpxfxbqfkf.id : null, ((-1025) & 2) != 0 ? productUiModelPpxfxbqfkf.name : null, ((-1025) & 4) != 0 ? productUiModelPpxfxbqfkf.article : null, ((-1025) & 8) != 0 ? productUiModelPpxfxbqfkf.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModelPpxfxbqfkf.price : 0.0d, ((-1025) & 32) != 0 ? productUiModelPpxfxbqfkf.oldPrice : null, ((-1025) & 64) != 0 ? productUiModelPpxfxbqfkf.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelPpxfxbqfkf.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelPpxfxbqfkf.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelPpxfxbqfkf.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelPpxfxbqfkf.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModelPpxfxbqfkf.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModelPpxfxbqfkf.isFavorite : false, ((-1025) & 8192) != 0 ? productUiModelPpxfxbqfkf.favoriteEnabledState : !state.getFavoriteDisabledProductIds().contains(product.getId()), ((-1025) & 16384) != 0 ? productUiModelPpxfxbqfkf.inCart : false, ((-1025) & 32768) != 0 ? productUiModelPpxfxbqfkf.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModelPpxfxbqfkf.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModelPpxfxbqfkf.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModelPpxfxbqfkf.fats : null, ((-1025) & 524288) != 0 ? productUiModelPpxfxbqfkf.carbs : null, ((-1025) & 1048576) != 0 ? productUiModelPpxfxbqfkf.protein : null, ((-1025) & 2097152) != 0 ? productUiModelPpxfxbqfkf.energy : null, ((-1025) & 4194304) != 0 ? productUiModelPpxfxbqfkf.params : null, ((-1025) & 8388608) != 0 ? productUiModelPpxfxbqfkf.description : null, ((-1025) & 16777216) != 0 ? productUiModelPpxfxbqfkf.chemical : null, ((-1025) & 33554432) != 0 ? productUiModelPpxfxbqfkf.buyState : null, ((-1025) & 67108864) != 0 ? productUiModelPpxfxbqfkf.stickers : null, ((-1025) & 134217728) != 0 ? productUiModelPpxfxbqfkf.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModelPpxfxbqfkf.rating : null, ((-1025) & 536870912) != 0 ? productUiModelPpxfxbqfkf.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModelPpxfxbqfkf.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModelPpxfxbqfkf.isPmProduct : false, (16777215 & 1) != 0 ? productUiModelPpxfxbqfkf.video : null, (16777215 & 2) != 0 ? productUiModelPpxfxbqfkf.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModelPpxfxbqfkf.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModelPpxfxbqfkf.country : null, (16777215 & 16) != 0 ? productUiModelPpxfxbqfkf.region : null, (16777215 & 32) != 0 ? productUiModelPpxfxbqfkf.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModelPpxfxbqfkf.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelPpxfxbqfkf.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelPpxfxbqfkf.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelPpxfxbqfkf.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelPpxfxbqfkf.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModelPpxfxbqfkf.tasting : null, (16777215 & 4096) != 0 ? productUiModelPpxfxbqfkf.styling : null, (16777215 & 8192) != 0 ? productUiModelPpxfxbqfkf.button : null, (16777215 & 16384) != 0 ? productUiModelPpxfxbqfkf.hints : null, (16777215 & 32768) != 0 ? productUiModelPpxfxbqfkf.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModelPpxfxbqfkf.counterModel : null, (16777215 & 131072) != 0 ? productUiModelPpxfxbqfkf.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModelPpxfxbqfkf.vivino : null, (16777215 & 524288) != 0 ? productUiModelPpxfxbqfkf.limits : null, (16777215 & 1048576) != 0 ? productUiModelPpxfxbqfkf.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModelPpxfxbqfkf.productVariants : null, (16777215 & 4194304) != 0 ? productUiModelPpxfxbqfkf.isSelected : bool, (16777215 & 8388608) != 0 ? productUiModelPpxfxbqfkf.adv : null));
        }
        return arrayList;
    }

    private final Double ppxfxbqfkf(double d13, MeasureType measureType, Double d14, Double d15, boolean z13) {
        if (d14 == null) {
            return null;
        }
        double dDoubleValue = d14.doubleValue();
        if (dDoubleValue <= 0.009d) {
            dDoubleValue = 0.0d;
        }
        return Double.valueOf(ppxfxbqfkf.f83717iobyxmoadg.iobyxmoadg(d13, measureType, Double.valueOf(dDoubleValue), d15, z13));
    }

    private final Price wflxmlrfwp(double d13, int i13) {
        return ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkf.f83717iobyxmoadg, d13, i13, false, 4, null);
    }

    private final Double zoijcleaow(Product product, ProductData productData) {
        return ppxfxbqfkf(productData.getQuantity(), productData.getMeasureType(), product.getOldPrice(), product.getAvgWeight(), product.getIsDispPer100());
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww invoke(State state) {
        String string;
        Boolean bool;
        zdlpuopuiu.btonecajqb(state, "state");
        int size = state.getSelectedProductsIds().size();
        int size2 = state.getProducts().size();
        boolean z13 = size2 == size;
        if (z13 || !state.getIsChangeProductCountEnabled()) {
            string = this.f67385yggfygwlhe.getString(ak0.eablkybsjg.buy_all);
        } else {
            string = this.f67385yggfygwlhe.getString(ak0.eablkybsjg.buy_some_count_products, this.f67385yggfygwlhe.nufgyqmvbu(h00.zoijcleaow.plural_products, size, String.valueOf(size)));
        }
        String str = string;
        boolean z14 = (state.getIsChangeProductCountEnabled() && state.getSelectedProductsIds().isEmpty()) ? false : true;
        List listOjitshcjhn = ojitshcjhn(state);
        gg.vdvldrhtss vdvldrhtssVarGxszxtbevo = gxszxtbevo(listOjitshcjhn, state.getSelectedProductsIds(), state.getIsChangeProductCountEnabled());
        double dDoubleValue = ((Number) vdvldrhtssVarGxszxtbevo.iobyxmoadg()).doubleValue();
        Double d13 = (Double) vdvldrhtssVarGxszxtbevo.wkgbmnqykc();
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(wflxmlrfwp(dDoubleValue, 2), d13 != null ? wflxmlrfwp(d13.doubleValue(), 1) : null);
        Price price = (Price) vdvldrhtssVarIobyxmoadg.iobyxmoadg();
        Price price2 = (Price) vdvldrhtssVarIobyxmoadg.wkgbmnqykc();
        if (state.getIsChangeProductCountEnabled()) {
            bool = z13 ? Boolean.TRUE : Boolean.FALSE;
        } else {
            bool = null;
        }
        String strNufgyqmvbu = state.getProducts().isEmpty() ? null : this.f67385yggfygwlhe.nufgyqmvbu(h00.zoijcleaow.plural_products, size2, String.valueOf(size2));
        boolean isLoading = state.getIsLoading();
        String title = state.getTitle();
        String str2 = title == null ? "" : title;
        String imageBannerUrl = state.getImageBannerUrl();
        String price3 = price.getPrice();
        String priceFractional = price.getPriceFractional();
        String strEablkybsjg = price2 != null ? price2.eablkybsjg() : null;
        return new dxjokdxxww(isLoading, str2, imageBannerUrl, strNufgyqmvbu, bool, listOjitshcjhn, price3, priceFractional, strEablkybsjg == null ? "" : strEablkybsjg, str, z14, state.getIsSharedFeatureEnabled(), state.getIsPurchasesListFeatureEnabled());
    }

    public final gg.vdvldrhtss eablkybsjg(List products, List productDataList) {
        Object next;
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(productDataList, "productDataList");
        Iterator it = products.iterator();
        double dNufgyqmvbu = 0.0d;
        double d13 = 0.0d;
        while (it.hasNext()) {
            Product product = (Product) it.next();
            Iterator it2 = productDataList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!zdlpuopuiu.eablkybsjg(((ProductData) next).getId(), product.getId()));
            ProductData productData = (ProductData) next;
            if (productData != null) {
                double dBtonecajqb = btonecajqb(product, productData);
                double dNufgyqmvbu2 = eablkybsjg.nufgyqmvbu(dBtonecajqb, d13, null, 2, null);
                Double dZoijcleaow = zoijcleaow(product, productData);
                dNufgyqmvbu = eablkybsjg.nufgyqmvbu(dNufgyqmvbu, dZoijcleaow != null ? dZoijcleaow.doubleValue() : dBtonecajqb, null, 2, null);
                d13 = dNufgyqmvbu2;
            }
        }
        return cqumvgiudr.iobyxmoadg(Double.valueOf(d13), Double.valueOf(dNufgyqmvbu));
    }
}
