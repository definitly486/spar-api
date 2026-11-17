package ly;

import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import oy.nufgyqmvbu;
import ru.myspar.core.domain.models.ColorsModel;
import ru.myspar.core.domain.models.Sticker;
import ru.myspar.core.domain.models.VideoProduct;
import ru.myspar.core.domain.models.product.Button;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.domain.models.product.ProductVariant;
import ru.myspar.core.domain.models.product.ProductVariants;
import ru.myspar.core.domain.models.product.VivinoRating;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import tz.ProductDto;
import tz.ProductVariantDto;
import tz.ProductVariantsDto;
import tz.ProductsReferencesDto;
import tz.VideoProductDto;
import tz.VivinoRatingDto;
import uy.StickerDto;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j00.gxszxtbevo f64370iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final nufgyqmvbu f64371ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final oy.lqeggnwhkg f64372zoijcleaow;

    public wkgbmnqykc(j00.gxszxtbevo productInteractor, oy.lqeggnwhkg measureTypeModelMapper, nufgyqmvbu productLimitMapper) {
        zdlpuopuiu.btonecajqb(productInteractor, "productInteractor");
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        zdlpuopuiu.btonecajqb(productLimitMapper, "productLimitMapper");
        this.f64370iobyxmoadg = productInteractor;
        this.f64372zoijcleaow = measureTypeModelMapper;
        this.f64371ppxfxbqfkf = productLimitMapper;
    }

    private final ProductVariant btonecajqb(ProductVariantDto btonecajqbVar) {
        return new ProductVariant(btonecajqbVar.getId(), btonecajqbVar.getArticle(), btonecajqbVar.getTitle(), btonecajqbVar.getUrl(), btonecajqbVar.getIsFavorite());
    }

    private final VivinoRating draadjrbmk(VivinoRatingDto esjtqupxsvVar) {
        double dPpxfxbqfkf = esjtqupxsvVar.getRating();
        String strZoijcleaow = esjtqupxsvVar.getHeader();
        if (strZoijcleaow == null) {
            strZoijcleaow = "";
        }
        String strIobyxmoadg = esjtqupxsvVar.getDescription();
        return new VivinoRating(dPpxfxbqfkf, strZoijcleaow, strIobyxmoadg != null ? strIobyxmoadg : "");
    }

    private final Product dxjokdxxww(ProductDto productDto, List list, ColorsModel colorsModel) {
        boolean z13;
        ProductVariants productVariants;
        VideoProduct videoProduct;
        VideoProduct videoProductLqeggnwhkg;
        MeasureTypeModel measureTypeModelPpxfxbqfkf = this.f64372zoijcleaow.ppxfxbqfkf(productDto.getUnits(), null);
        List listEablkybsjg = eablkybsjg(productDto.getProductProperties());
        if (listEablkybsjg == null) {
            listEablkybsjg = jyumaefscl.wflxmlrfwp();
        }
        List list2 = listEablkybsjg;
        Integer discount = productDto.getDiscount();
        if (discount != null) {
            z13 = discount.intValue() > 0;
        } else {
            z13 = false;
        }
        List listZoijcleaow = this.f64371ppxfxbqfkf.invoke(productDto.getLimits(), measureTypeModelPpxfxbqfkf);
        String id2 = productDto.getId();
        String article = productDto.getArticle();
        String name = productDto.getName();
        Double price = productDto.getPrice();
        double dDoubleValue = price != null ? price.doubleValue() : 0.0d;
        Double oldPrice = productDto.getOldPrice();
        Integer discount2 = productDto.getDiscount();
        boolean isDispPer100 = productDto.getIsDispPer100();
        Double avgWeight = productDto.getAvgWeight();
        boolean isFavorite = productDto.getIsFavorite();
        boolean isAvailable = productDto.getIsAvailable();
        boolean availableOnlyForPickup = productDto.getAvailableOnlyForPickup();
        boolean onlyInShop = productDto.getOnlyInShop();
        boolean zWkgbmnqykc = this.f64370iobyxmoadg.wkgbmnqykc(productDto.getIsAvailable(), productDto.getOnlyInShop(), productDto.getPrice());
        List productPropertyNames = productDto.getProductPropertyNames();
        String photoUrl = productDto.getPhotoUrl();
        List photoUrls = productDto.getPhotoUrls();
        if (photoUrls == null) {
            photoUrls = jyumaefscl.wflxmlrfwp();
        }
        List list3 = photoUrls;
        Double energy = productDto.getEnergy();
        Double fats = productDto.getFats();
        Double carbs = productDto.getCarbs();
        Double protein = productDto.getProtein();
        Map params = productDto.getParams();
        if (params == null) {
            params = tzroggbefp.dxjokdxxww();
        }
        Map map = params;
        String description = productDto.getDescription();
        String chemical = productDto.getChemical();
        Boolean hidePrice = productDto.getHidePrice();
        boolean zBooleanValue = hidePrice != null ? hidePrice.booleanValue() : false;
        Double rating = productDto.getRating();
        Integer reviews = productDto.getReviews();
        int iIntValue = reviews != null ? reviews.intValue() : 0;
        Boolean isPmProduct = productDto.getIsPmProduct();
        boolean zBooleanValue2 = isPmProduct != null ? isPmProduct.booleanValue() : false;
        VideoProductDto video = productDto.getVideo();
        if (video == null || (videoProductLqeggnwhkg = lqeggnwhkg(video)) == null) {
            productVariants = null;
            videoProduct = new VideoProduct(null, null, 3, null);
        } else {
            videoProduct = videoProductLqeggnwhkg;
            productVariants = null;
        }
        String country = productDto.getCountry();
        String str = country == null ? "" : country;
        String region = productDto.getRegion();
        String str2 = region == null ? "" : region;
        String countryFlagEmoji = productDto.getCountryFlagEmoji();
        String str3 = countryFlagEmoji == null ? "" : countryFlagEmoji;
        String type = productDto.getType();
        String str4 = type == null ? "" : type;
        String kind = productDto.getKind();
        String str5 = kind == null ? "" : kind;
        String grape = productDto.getGrape();
        String str6 = grape == null ? "" : grape;
        String standart = productDto.getStandart();
        String str7 = standart == null ? "" : standart;
        String countryMapIcon = productDto.getCountryMapIcon();
        String str8 = countryMapIcon == null ? "" : countryMapIcon;
        String tasting = productDto.getTasting();
        String str9 = tasting == null ? "" : tasting;
        String styling = productDto.getStyling();
        String str10 = styling == null ? "" : styling;
        Button buttonIobyxmoadg = iobyxmoadg(productDto.getButton());
        VivinoRatingDto vivino = productDto.getVivino();
        VivinoRating vivinoRatingDraadjrbmk = vivino != null ? draadjrbmk(vivino) : productVariants;
        ProductVariantsDto productVariants2 = productDto.getProductVariants();
        return new Product(id2, name, article, dDoubleValue, oldPrice, discount2, isDispPer100, measureTypeModelPpxfxbqfkf, avgWeight, isFavorite, isAvailable, availableOnlyForPickup, onlyInShop, zWkgbmnqykc, productPropertyNames, list2, photoUrl, list3, energy, fats, carbs, protein, map, description, chemical, z13, list, zBooleanValue, rating, iIntValue, zBooleanValue2, videoProduct, colorsModel, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, buttonIobyxmoadg, listZoijcleaow, vivinoRatingDraadjrbmk, productVariants2 != null ? gtknphoqwx(productVariants2) : productVariants, 0.0d, 0, 32768, null);
    }

    private final List eablkybsjg(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(gxszxtbevo((StickerDto) it.next()));
        }
        return arrayList;
    }

    private final ProductVariants gtknphoqwx(ProductVariantsDto gtknphoqwxVar) {
        List listWflxmlrfwp;
        String strPpxfxbqfkf = gtknphoqwxVar.getTitle();
        if (strPpxfxbqfkf == null) {
            strPpxfxbqfkf = "";
        }
        k10.zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc(gtknphoqwxVar.getType());
        List listZoijcleaow = gtknphoqwxVar.getItems();
        if (listZoijcleaow != null) {
            listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
            Iterator it = listZoijcleaow.iterator();
            while (it.hasNext()) {
                listWflxmlrfwp.add(btonecajqb((ProductVariantDto) it.next()));
            }
        } else {
            listWflxmlrfwp = null;
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        return new ProductVariants(strPpxfxbqfkf, zoijcleaowVarWkgbmnqykc, listWflxmlrfwp);
    }

    private final Sticker gxszxtbevo(StickerDto stickerDto) {
        return new Sticker(stickerDto.getName(), stickerDto.getIconUrl());
    }

    private final Button iobyxmoadg(tz.iobyxmoadg iobyxmoadgVar) {
        String strPpxfxbqfkf = iobyxmoadgVar != null ? iobyxmoadgVar.getTitle() : null;
        if (strPpxfxbqfkf == null) {
            strPpxfxbqfkf = "";
        }
        f40.zoijcleaow zoijcleaowVarIobyxmoadg = f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(iobyxmoadgVar != null ? iobyxmoadgVar.getNavLink() : null);
        String strZoijcleaow = iobyxmoadgVar != null ? iobyxmoadgVar.getReference() : null;
        return new Button(strPpxfxbqfkf, zoijcleaowVarIobyxmoadg, strZoijcleaow != null ? strZoijcleaow : "");
    }

    private final VideoProduct lqeggnwhkg(VideoProductDto cqumvgiudrVar) {
        String strZoijcleaow = cqumvgiudrVar.getPreview();
        if (strZoijcleaow == null) {
            strZoijcleaow = "";
        }
        String strIobyxmoadg = cqumvgiudrVar.getFile();
        return new VideoProduct(strZoijcleaow, strIobyxmoadg != null ? strIobyxmoadg : "");
    }

    private final Product nufgyqmvbu(ProductDto productDto, List list, List list2, nz.ppxfxbqfkf ppxfxbqfkfVar) {
        return dxjokdxxww(productDto, list, oy.zoijcleaow.zoijcleaow(ppxfxbqfkfVar, list2));
    }

    private final k10.zoijcleaow wkgbmnqykc(String str) {
        Object obj;
        Object[] array = k10.zoijcleaow.wkgbmnqykc().toArray(new k10.zoijcleaow[0]);
        int length = array.length - 1;
        if (length < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i13 = length - 1;
            obj = array[length];
            if (zdlpuopuiu.eablkybsjg(((k10.zoijcleaow) obj).lqeggnwhkg(), str)) {
                break;
            }
            if (i13 < 0) {
                obj = null;
                break;
            }
            length = i13;
        }
        k10.zoijcleaow zoijcleaowVar = (k10.zoijcleaow) obj;
        return zoijcleaowVar == null ? k10.zoijcleaow.TEXT : zoijcleaowVar;
    }

    public final Product ppxfxbqfkf(ProductDto productDto, ProductsReferencesDto wflxmlrfwpVar, nz.ppxfxbqfkf ppxfxbqfkfVar) {
        List listWflxmlrfwp;
        List listPpxfxbqfkf;
        zdlpuopuiu.btonecajqb(productDto, "productDto");
        if (wflxmlrfwpVar == null || (listPpxfxbqfkf = wflxmlrfwpVar.getHints()) == null) {
            listWflxmlrfwp = null;
        } else {
            List hint = productDto.getHint();
            if (hint == null) {
                hint = jyumaefscl.wflxmlrfwp();
            }
            listWflxmlrfwp = mq.iobyxmoadg.eablkybsjg(listPpxfxbqfkf, hint);
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        return nufgyqmvbu(productDto, listWflxmlrfwp, wflxmlrfwpVar != null ? wflxmlrfwpVar.getColors() : null, ppxfxbqfkfVar);
    }

    public final Product zoijcleaow(ProductDto productDto, List hints, ColorsModel colorsModel) {
        zdlpuopuiu.btonecajqb(productDto, "productDto");
        zdlpuopuiu.btonecajqb(hints, "hints");
        return dxjokdxxww(productDto, hints, colorsModel);
    }
}
