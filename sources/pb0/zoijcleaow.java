package pb0;

import hg.jyumaefscl;
import j00.gxszxtbevo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ob0.eablkybsjg;
import pm.dxjokdxxww;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.handler.ProductMessageType;
import ru.myspar.core.domain.models.AvailabilityUiModel;
import ru.myspar.core.domain.models.ButtonUiModel;
import ru.myspar.core.domain.models.ColorsModel;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.core.domain.models.ProductVariantUiModel;
import ru.myspar.core.domain.models.ProductVariantsUiModel;
import ru.myspar.core.domain.models.VideoProduct;
import ru.myspar.core.domain.models.VideoUiModel;
import ru.myspar.core.domain.models.VivinoRatingUiModel;
import ru.myspar.core.domain.models.cart.ProductUIData;
import ru.myspar.core.domain.models.product.Button;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.domain.models.product.ProductVariant;
import ru.myspar.core.domain.models.product.ProductVariants;
import ru.myspar.core.domain.models.product.VivinoRating;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg f76307iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gxszxtbevo f76308ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ob0.iobyxmoadg f76309zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f76306wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f76305eablkybsjg = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: pb0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public /* synthetic */ class C1685zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f76310iobyxmoadg;

        static {
            int[] iArr = new int[k10.zoijcleaow.values().length];
            try {
                iArr[k10.zoijcleaow.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k10.zoijcleaow.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f76310iobyxmoadg = iArr;
        }
    }

    public zoijcleaow(eablkybsjg stickerUiMapper, ob0.iobyxmoadg colorsUiModelMapper, gxszxtbevo productInteractor) {
        zdlpuopuiu.btonecajqb(stickerUiMapper, "stickerUiMapper");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        zdlpuopuiu.btonecajqb(productInteractor, "productInteractor");
        this.f76307iobyxmoadg = stickerUiMapper;
        this.f76309zoijcleaow = colorsUiModelMapper;
        this.f76308ppxfxbqfkf = productInteractor;
    }

    private final VivinoRatingUiModel btonecajqb(VivinoRating vivinoRating) {
        return new VivinoRatingUiModel(vivinoRating.getRating(), vivinoRating.getHeader(), vivinoRating.getDescription());
    }

    private final VideoUiModel dxjokdxxww(VideoProduct videoProduct) {
        return new VideoUiModel(videoProduct.getPreview(), videoProduct.getFile());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String eablkybsjg(rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        return (String) rgvfuqvkyqVar.invoke(Integer.valueOf(i13), null);
    }

    private final ButtonUiModel gxszxtbevo(Button button) {
        return new ButtonUiModel(button.getTitle(), button.getNavLink(), button.getReference());
    }

    private final ProductVariantUiModel lqeggnwhkg(ProductVariant productVariant, boolean z13, k10.zoijcleaow zoijcleaowVar) {
        ProductVariantUiModel text;
        int i13 = C1685zoijcleaow.f76310iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            String id2 = productVariant.getId();
            String article = productVariant.getArticle();
            Boolean isFavorite = productVariant.getIsFavorite();
            text = new ProductVariantUiModel.Text(id2, article, z13, isFavorite != null ? isFavorite.booleanValue() : false, productVariant.getUrl(), productVariant.getTitle());
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String id3 = productVariant.getId();
            String article2 = productVariant.getArticle();
            Boolean isFavorite2 = productVariant.getIsFavorite();
            text = new ProductVariantUiModel.Image(id3, article2, z13, isFavorite2 != null ? isFavorite2.booleanValue() : false, productVariant.getUrl());
        }
        return text;
    }

    private final ProductVariantsUiModel nufgyqmvbu(ProductVariants productVariants, String str) {
        String title = productVariants.getTitle();
        List<ProductVariant> items = productVariants.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        for (ProductVariant productVariant : items) {
            arrayList.add(lqeggnwhkg(productVariant, zdlpuopuiu.eablkybsjg(str, productVariant.getId()), productVariants.getType()));
        }
        return new ProductVariantsUiModel(title, arrayList);
    }

    private final List zoijcleaow(String str, String str2, List list) {
        return str != null ? jyumaefscl.eablkybsjg(str) : jyumaefscl.ixidwrxhsl(jyumaefscl.eablkybsjg(str2), list);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0269  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x013e  */
    public final ProductUiModel ppxfxbqfkf(Product product, List list, DeliveryCode deliveryCode, boolean z13, boolean z14, boolean z15, String str, final rgvfuqvkyq getStringRes) {
        String url;
        String str2;
        ProductUIData productUIData;
        MeasureType originalMeasure;
        List limits;
        VivinoRatingUiModel vivinoRatingUiModelBtonecajqb;
        Object next;
        List items;
        Object next2;
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        List productProperties = product.getProductProperties();
        eablkybsjg eablkybsjgVar = this.f76307iobyxmoadg;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(productProperties, 10));
        Iterator it = productProperties.iterator();
        while (it.hasNext()) {
            arrayList.add(eablkybsjgVar.invoke(it.next()));
        }
        ProductVariants productVariants = product.getProductVariants();
        ProductVariantsUiModel productVariantsUiModelNufgyqmvbu = productVariants != null ? nufgyqmvbu(productVariants, product.getId()) : null;
        if (productVariantsUiModelNufgyqmvbu == null || (items = productVariantsUiModelNufgyqmvbu.getItems()) == null) {
            url = null;
        } else {
            Iterator it2 = items.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!zdlpuopuiu.eablkybsjg(((ProductVariantUiModel) next2).getItemId(), product.getId()));
            ProductVariantUiModel productVariantUiModel = (ProductVariantUiModel) next2;
            if (productVariantUiModel != null) {
                url = productVariantUiModel.getUrl();
            } else {
                url = null;
            }
        }
        List listZoijcleaow = zoijcleaow(url, product.getPhotoUrl(), product.getPhotoUrls());
        boolean z16 = listZoijcleaow.size() > 1;
        boolean z17 = product.getPrice() == 0.0d;
        ColorsModel colorsModel = product.getColorsModel();
        ColorsUiModel colorsUiModelIobyxmoadg = colorsModel != null ? this.f76309zoijcleaow.iobyxmoadg(colorsModel) : null;
        Integer discount = product.getDiscount();
        if (discount != null) {
            str2 = (String) getStringRes.invoke(Integer.valueOf(dxjokdxxww.discount_badge), new Object[]{Integer.valueOf(discount.intValue())});
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = "";
        }
        String str3 = str2;
        if (list != null) {
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), product.getId()));
            productUIData = (ProductUIData) next;
        } else {
            productUIData = null;
        }
        if (productUIData == null || (originalMeasure = productUIData.getMeasureType()) == null) {
            originalMeasure = product.getMeasureTypeModel().getOriginalMeasure();
        }
        MeasureType measureType = originalMeasure;
        MeasureTypeModel measureTypeModelPpxfxbqfkf = MeasureTypeModel.ppxfxbqfkf(product.getMeasureTypeModel(), null, null, measureType, 3, null);
        if (productUIData == null || (limits = productUIData.getLimits()) == null) {
            limits = product.getLimits();
        } else {
            if (limits.isEmpty()) {
                limits = null;
            }
            if (limits == null) {
                limits = product.getLimits();
            }
        }
        List list2 = limits;
        AvailabilityUiModel availabilityUiModelIobyxmoadg = this.f76308ppxfxbqfkf.iobyxmoadg(product.getIsAvailable(), product.getOnlyInShop(), z17, product.getAvailableOnlyForPickup(), new draadjrbmk() { // from class: pb0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zoijcleaow.eablkybsjg(getStringRes, ((Integer) obj).intValue());
            }
        });
        boolean z18 = productUIData != null;
        boolean isAvailableToBuy = availabilityUiModelIobyxmoadg.getIsAvailableToBuy();
        boolean isLoading = productUIData != null ? productUIData.getIsLoading() : false;
        double price = product.getPrice();
        Double oldPrice = product.getOldPrice();
        Double avgWeight = product.getAvgWeight();
        boolean isDispPer100 = product.getIsDispPer100();
        double quantity = productUIData != null ? productUIData.getQuantity() : 0.0d;
        boolean zNufgyqmvbu = measureTypeModelPpxfxbqfkf.nufgyqmvbu();
        ProductMessageType messageType = productUIData != null ? productUIData.getMessageType() : null;
        ColorsModel colorsModel2 = product.getColorsModel();
        CounterModel counterModelIobyxmoadg = pt.iobyxmoadg.iobyxmoadg(isAvailableToBuy, z18, isLoading, price, oldPrice, avgWeight, isDispPer100, quantity, zNufgyqmvbu, measureType, messageType, colorsModel2 != null ? ob0.zoijcleaow.iobyxmoadg(colorsModel2) : null);
        String id2 = product.getId();
        String name = product.getName();
        String article = product.getArticle();
        double price2 = product.getPrice();
        Double oldPrice2 = product.getOldPrice();
        Integer discount2 = product.getDiscount();
        boolean hasDiscount = product.getHasDiscount();
        boolean isDispPer101 = product.getIsDispPer100();
        Double avgWeight2 = product.getAvgWeight();
        boolean isFavorite = product.getIsFavorite();
        boolean z19 = productUIData != null;
        String photoUrl = product.getPhotoUrl();
        Double fats = product.getFats();
        Double carbs = product.getCarbs();
        Double protein = product.getProtein();
        Double energy = product.getEnergy();
        Map params = product.getParams();
        String description = product.getDescription();
        String chemical = product.getChemical();
        List listEablkybsjg = xt.iobyxmoadg.eablkybsjg(product.getHints());
        boolean hidePrice = product.getHidePrice();
        Double rating = product.getRating();
        int reviews = product.getReviews();
        boolean isPmProduct = product.getIsPmProduct();
        VideoUiModel videoUiModelDxjokdxxww = dxjokdxxww(product.getVideo());
        String country = product.getCountry();
        String region = product.getRegion();
        String countryFlagEmoji = product.getCountryFlagEmoji();
        String type = product.getType();
        String kind = product.getKind();
        String grape = product.getGrape();
        String standart = product.getStandart();
        String countryMapIcon = product.getCountryMapIcon();
        String tasting = product.getTasting();
        String styling = product.getStyling();
        Button button = product.getButton();
        ButtonUiModel buttonUiModelGxszxtbevo = button != null ? gxszxtbevo(button) : null;
        VivinoRating vivino = product.getVivino();
        if (vivino == null) {
            vivinoRatingUiModelBtonecajqb = null;
        } else {
            if (!z15) {
                vivino = null;
            }
            if (vivino != null) {
                vivinoRatingUiModelBtonecajqb = btonecajqb(vivino);
            } else {
                vivinoRatingUiModelBtonecajqb = null;
            }
        }
        return new ProductUiModel(id2, name, article, z17, price2, oldPrice2, discount2, str3, hasDiscount, isDispPer101, measureTypeModelPpxfxbqfkf, avgWeight2, isFavorite, false, z19, photoUrl, listZoijcleaow, z16, fats, carbs, protein, energy, params, description, chemical, null, arrayList, hidePrice, rating, reviews, null, isPmProduct, videoUiModelDxjokdxxww, z13, z14, country, region, countryFlagEmoji, type, kind, grape, standart, countryMapIcon, tasting, styling, buttonUiModelGxszxtbevo, listEablkybsjg, colorsUiModelIobyxmoadg, counterModelIobyxmoadg, deliveryCode, vivinoRatingUiModelBtonecajqb, list2, availabilityUiModelIobyxmoadg, productVariantsUiModelNufgyqmvbu, null, str, 1073750016, 4194304, null);
    }
}
