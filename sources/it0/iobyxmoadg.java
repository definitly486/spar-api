package it0;

import java.util.List;
import jt0.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.AvailabilityUiModel;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.domain.models.VivinoRatingUiModel;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    public static final wkgbmnqykc iobyxmoadg(lt0.iobyxmoadg iobyxmoadgVar) {
        String string;
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        String id2 = iobyxmoadgVar.getId();
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        String strWflxmlrfwp = iobyxmoadgVar.wflxmlrfwp();
        String strOjitshcjhn = iobyxmoadgVar.ojitshcjhn();
        Double dRgvfuqvkyq = iobyxmoadgVar.rgvfuqvkyq();
        if (dRgvfuqvkyq == null) {
            string = null;
        } else {
            if (!iobyxmoadgVar.cqumvgiudr()) {
                dRgvfuqvkyq = null;
            }
            if (dRgvfuqvkyq != null) {
                string = dRgvfuqvkyq.toString();
            } else {
                string = null;
            }
        }
        boolean z13 = iobyxmoadgVar.nufgyqmvbu().nufgyqmvbu() && iobyxmoadgVar.draadjrbmk().nufgyqmvbu() && !iobyxmoadgVar.jyumaefscl();
        MeasureTypeModel measureTypeModelDraadjrbmk = iobyxmoadgVar.draadjrbmk();
        CounterModel counterModelNufgyqmvbu = iobyxmoadgVar.nufgyqmvbu();
        AvailabilityUiModel availabilityUiModelWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        int iOxmwwwfdhm = iobyxmoadgVar.oxmwwwfdhm();
        String country = iobyxmoadgVar.getCountry();
        String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        List listGtknphoqwx = iobyxmoadgVar.gtknphoqwx();
        String strDxjokdxxww = iobyxmoadgVar.btonecajqb() ? iobyxmoadgVar.dxjokdxxww() : null;
        VivinoRatingUiModel vivinoRatingUiModelZdlpuopuiu = iobyxmoadgVar.zdlpuopuiu();
        boolean zYggfygwlhe = iobyxmoadgVar.yggfygwlhe();
        boolean zIwizpuwonk = iobyxmoadgVar.iwizpuwonk();
        ColorsUiModel colorsUiModelLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg();
        return new wkgbmnqykc(id2, strIobyxmoadg, strWflxmlrfwp, strOjitshcjhn, string, z13, measureTypeModelDraadjrbmk, counterModelNufgyqmvbu, colorsUiModelLqeggnwhkg instanceof ColorsUiModel.Hex ? (ColorsUiModel.Hex) colorsUiModelLqeggnwhkg : null, availabilityUiModelWkgbmnqykc, iOxmwwwfdhm, country, strPpxfxbqfkf, listGtknphoqwx, strDxjokdxxww, vivinoRatingUiModelZdlpuopuiu, zYggfygwlhe, null, zIwizpuwonk, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    public static final wkgbmnqykc ppxfxbqfkf(ProductUiModel productUiModel) {
        String string;
        zdlpuopuiu.btonecajqb(productUiModel, "<this>");
        String id2 = productUiModel.getId();
        String article = productUiModel.getArticle();
        String name = productUiModel.getName();
        String photoUrl = productUiModel.getPhotoUrl();
        Double rating = productUiModel.getRating();
        if (rating == null) {
            string = null;
        } else {
            if (!productUiModel.getIsRatingFeatureEnabled()) {
                rating = null;
            }
            if (rating != null) {
                string = rating.toString();
            } else {
                string = null;
            }
        }
        boolean z13 = productUiModel.getCounterModel().nufgyqmvbu() && productUiModel.getMeasureTypeModel().nufgyqmvbu() && !productUiModel.getIsProductWithZeroPrice();
        MeasureTypeModel measureTypeModel = productUiModel.getMeasureTypeModel();
        CounterModel counterModel = productUiModel.getCounterModel();
        AvailabilityUiModel availabilityModel = productUiModel.getAvailabilityModel();
        int reviewsCount = productUiModel.getReviewsCount();
        String country = productUiModel.getCountry();
        String strPpxfxbqfkf = productUiModel.ppxfxbqfkf();
        List hints = productUiModel.getHints();
        String discountString = productUiModel.getHasDiscount() ? productUiModel.getDiscountString() : null;
        VivinoRatingUiModel vivino = productUiModel.getVivino();
        boolean isFavorite = productUiModel.getIsFavorite();
        Boolean isSelected = productUiModel.getIsSelected();
        boolean isPurchaseListsFeatureEnabled = productUiModel.getIsPurchaseListsFeatureEnabled();
        ColorsUiModel colorsUiModel = productUiModel.getColorsUiModel();
        return new wkgbmnqykc(id2, article, name, photoUrl, string, z13, measureTypeModel, counterModel, colorsUiModel instanceof ColorsUiModel.Hex ? (ColorsUiModel.Hex) colorsUiModel : null, availabilityModel, reviewsCount, country, strPpxfxbqfkf, hints, discountString, vivino, isFavorite, isSelected, isPurchaseListsFeatureEnabled, productUiModel.getAdv(), null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    public static final wkgbmnqykc zoijcleaow(CartProductUiModel cartProductUiModel) {
        String string;
        zdlpuopuiu.btonecajqb(cartProductUiModel, "<this>");
        String id2 = cartProductUiModel.getId();
        String article = cartProductUiModel.getArticle();
        String name = cartProductUiModel.getName();
        String photoUrl = cartProductUiModel.getPhotoUrl();
        Double rating = cartProductUiModel.getRating();
        if (rating == null) {
            string = null;
        } else {
            if (!cartProductUiModel.getIsRatingFeatureEnabled()) {
                rating = null;
            }
            if (rating != null) {
                string = rating.toString();
            } else {
                string = null;
            }
        }
        boolean z13 = cartProductUiModel.getCounterModel().nufgyqmvbu() && cartProductUiModel.getMeasureTypeModel().nufgyqmvbu() && !cartProductUiModel.getIsProductWithZeroPrice();
        MeasureTypeModel measureTypeModel = cartProductUiModel.getMeasureTypeModel();
        CounterModel counterModel = cartProductUiModel.getCounterModel();
        AvailabilityUiModel availabilityModel = cartProductUiModel.getAvailabilityModel();
        int reviewsCount = cartProductUiModel.getReviewsCount();
        String country = cartProductUiModel.getCountry();
        String strPpxfxbqfkf = cartProductUiModel.ppxfxbqfkf();
        List hints = cartProductUiModel.getHints();
        String strOxmwwwfdhm = cartProductUiModel.getHasDiscount() ? cartProductUiModel.oxmwwwfdhm() : null;
        VivinoRatingUiModel vivino = cartProductUiModel.getVivino();
        boolean isFavorite = cartProductUiModel.getIsFavorite();
        boolean isPurchaseListsFeatureEnabled = cartProductUiModel.getIsPurchaseListsFeatureEnabled();
        ColorsUiModel colorsUiModel = cartProductUiModel.getColorsUiModel();
        return new wkgbmnqykc(id2, article, name, photoUrl, string, z13, measureTypeModel, counterModel, colorsUiModel instanceof ColorsUiModel.Hex ? (ColorsUiModel.Hex) colorsUiModel : null, availabilityModel, reviewsCount, country, strPpxfxbqfkf, hints, strOxmwwwfdhm, vivino, isFavorite, null, isPurchaseListsFeatureEnabled, null, cartProductUiModel.getUnavailableReason());
    }
}
