package ou;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pu.wkgbmnqykc;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.AvailabilityUiModel;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.core.domain.models.VivinoRatingUiModel;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    public static final wkgbmnqykc iobyxmoadg(ru.iobyxmoadg iobyxmoadgVar) {
        String string;
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        String id2 = iobyxmoadgVar.getId();
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        String strOjitshcjhn = iobyxmoadgVar.ojitshcjhn();
        String strRgvfuqvkyq = iobyxmoadgVar.rgvfuqvkyq();
        Double dVdvldrhtss = iobyxmoadgVar.vdvldrhtss();
        if (dVdvldrhtss == null) {
            string = null;
        } else {
            if (!iobyxmoadgVar.esjtqupxsv()) {
                dVdvldrhtss = null;
            }
            if (dVdvldrhtss != null) {
                string = dVdvldrhtss.toString();
            } else {
                string = null;
            }
        }
        boolean z13 = iobyxmoadgVar.nufgyqmvbu().nufgyqmvbu() && iobyxmoadgVar.wflxmlrfwp().nufgyqmvbu() && !iobyxmoadgVar.iwizpuwonk();
        MeasureTypeModel measureTypeModelWflxmlrfwp = iobyxmoadgVar.wflxmlrfwp();
        CounterModel counterModelNufgyqmvbu = iobyxmoadgVar.nufgyqmvbu();
        AvailabilityUiModel availabilityUiModelWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        int iKcexrzcfyt = iobyxmoadgVar.kcexrzcfyt();
        String country = iobyxmoadgVar.getCountry();
        String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        List listDraadjrbmk = iobyxmoadgVar.draadjrbmk();
        String strBtonecajqb = iobyxmoadgVar.btonecajqb();
        if (!iobyxmoadgVar.gtknphoqwx()) {
            strBtonecajqb = null;
        }
        VivinoRatingUiModel vivinoRatingUiModelYggfygwlhe = iobyxmoadgVar.yggfygwlhe();
        boolean zJyumaefscl = iobyxmoadgVar.jyumaefscl();
        boolean z14 = iobyxmoadgVar.dxjokdxxww() == DeliveryCode.PICKUP;
        boolean zCqumvgiudr = iobyxmoadgVar.cqumvgiudr();
        ColorsUiModel colorsUiModelLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg();
        return new wkgbmnqykc(id2, strIobyxmoadg, strOjitshcjhn, strRgvfuqvkyq, string, z13, measureTypeModelWflxmlrfwp, counterModelNufgyqmvbu, colorsUiModelLqeggnwhkg instanceof ColorsUiModel.Hex ? (ColorsUiModel.Hex) colorsUiModelLqeggnwhkg : null, availabilityUiModelWkgbmnqykc, iKcexrzcfyt, country, strPpxfxbqfkf, listDraadjrbmk, strBtonecajqb, vivinoRatingUiModelYggfygwlhe, zJyumaefscl, null, z14, zCqumvgiudr, null);
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
        String discountString = productUiModel.getDiscountString();
        if (!productUiModel.getHasDiscount()) {
            discountString = null;
        }
        VivinoRatingUiModel vivino = productUiModel.getVivino();
        boolean isFavorite = productUiModel.getIsFavorite();
        Boolean isSelected = productUiModel.getIsSelected();
        boolean z14 = productUiModel.getDeliveryCode() == DeliveryCode.PICKUP;
        boolean isPurchaseListsFeatureEnabled = productUiModel.getIsPurchaseListsFeatureEnabled();
        ColorsUiModel colorsUiModel = productUiModel.getColorsUiModel();
        return new wkgbmnqykc(id2, article, name, photoUrl, string, z13, measureTypeModel, counterModel, colorsUiModel instanceof ColorsUiModel.Hex ? (ColorsUiModel.Hex) colorsUiModel : null, availabilityModel, reviewsCount, country, strPpxfxbqfkf, hints, discountString, vivino, isFavorite, isSelected, z14, isPurchaseListsFeatureEnabled, productUiModel.getAdv());
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
        String strEsjtqupxsv = cartProductUiModel.esjtqupxsv();
        if (!cartProductUiModel.getHasDiscount()) {
            strEsjtqupxsv = null;
        }
        VivinoRatingUiModel vivino = cartProductUiModel.getVivino();
        boolean isFavorite = cartProductUiModel.getIsFavorite();
        boolean z14 = cartProductUiModel.getDeliveryCode() == DeliveryCode.PICKUP;
        boolean isPurchaseListsFeatureEnabled = cartProductUiModel.getIsPurchaseListsFeatureEnabled();
        ColorsUiModel colorsUiModel = cartProductUiModel.getColorsUiModel();
        return new wkgbmnqykc(id2, article, name, photoUrl, string, z13, measureTypeModel, counterModel, colorsUiModel instanceof ColorsUiModel.Hex ? (ColorsUiModel.Hex) colorsUiModel : null, availabilityModel, reviewsCount, country, strPpxfxbqfkf, hints, strEsjtqupxsv, vivino, isFavorite, null, z14, isPurchaseListsFeatureEnabled, null);
    }
}
