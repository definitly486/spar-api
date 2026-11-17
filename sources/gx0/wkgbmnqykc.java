package gx0;

import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jx0.nufgyqmvbu;
import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;
import ly0.ProductDeclarationsDto;
import ly0.ProductDto;
import ly0.ProductVariantDto;
import ly0.ProductVariantsDto;
import ly0.ProductsReferencesDto;
import ly0.VideoProductDto;
import ly0.VivinoRatingDto;
import px0.StickerDto;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.domain.models.Sticker;
import ru.myspar.proloyalty.core.domain.models.VideoProduct;
import ru.myspar.proloyalty.core.domain.models.product.Button;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.product.ProductDeclarations;
import ru.myspar.proloyalty.core.domain.models.product.ProductDeclarationsItem;
import ru.myspar.proloyalty.core.domain.models.product.ProductVariant;
import ru.myspar.proloyalty.core.domain.models.product.ProductVariants;
import ru.myspar.proloyalty.core.domain.models.product.VivinoRating;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final bz0.eablkybsjg f38650iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final nufgyqmvbu f38651ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jx0.lqeggnwhkg f38652zoijcleaow;

    public wkgbmnqykc(bz0.eablkybsjg productInteractor, jx0.lqeggnwhkg measureTypeModelMapper, nufgyqmvbu productLimitMapper) {
        zdlpuopuiu.btonecajqb(productInteractor, "productInteractor");
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        zdlpuopuiu.btonecajqb(productLimitMapper, "productLimitMapper");
        this.f38650iobyxmoadg = productInteractor;
        this.f38652zoijcleaow = measureTypeModelMapper;
        this.f38651ppxfxbqfkf = productLimitMapper;
    }

    private final ProductDeclarations btonecajqb(ProductDeclarationsDto nufgyqmvbuVar) {
        String strPpxfxbqfkf = nufgyqmvbuVar.getValue();
        if (strPpxfxbqfkf == null) {
            strPpxfxbqfkf = "";
        }
        List<ProductDeclarationsDto.DeclarationItemDto> listZoijcleaow = nufgyqmvbuVar.getItems();
        if (listZoijcleaow == null) {
            listZoijcleaow = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
        for (ProductDeclarationsDto.DeclarationItemDto ppxfxbqfkfVar : listZoijcleaow) {
            String strZoijcleaow = ppxfxbqfkfVar.getName();
            if (strZoijcleaow == null) {
                strZoijcleaow = "";
            }
            String strIobyxmoadg = ppxfxbqfkfVar.getLink();
            if (strIobyxmoadg == null) {
                strIobyxmoadg = "";
            }
            arrayList.add(new ProductDeclarationsItem(strZoijcleaow, strIobyxmoadg));
        }
        return new ProductDeclarations(strPpxfxbqfkf, arrayList);
    }

    private final ProductVariants draadjrbmk(ProductVariantsDto draadjrbmkVar) {
        List listWflxmlrfwp;
        String strPpxfxbqfkf = draadjrbmkVar.getTitle();
        if (strPpxfxbqfkf == null) {
            strPpxfxbqfkf = "";
        }
        a01.zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc(draadjrbmkVar.getType());
        List listZoijcleaow = draadjrbmkVar.getItems();
        if (listZoijcleaow != null) {
            listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
            Iterator it = listZoijcleaow.iterator();
            while (it.hasNext()) {
                listWflxmlrfwp.add(gtknphoqwx((ProductVariantDto) it.next()));
            }
        } else {
            listWflxmlrfwp = null;
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        return new ProductVariants(strPpxfxbqfkf, zoijcleaowVarWkgbmnqykc, listWflxmlrfwp);
    }

    private final Product dxjokdxxww(ProductDto productDto, List list, ColorsModel colorsModel) {
        boolean z13;
        VideoProduct videoProductLqeggnwhkg;
        MeasureTypeModel measureTypeModelPpxfxbqfkf = this.f38652zoijcleaow.ppxfxbqfkf(productDto.getUnits(), null);
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
        List listZoijcleaow = this.f38651ppxfxbqfkf.invoke(productDto.getLimits(), measureTypeModelPpxfxbqfkf);
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
        boolean zWkgbmnqykc = this.f38650iobyxmoadg.wkgbmnqykc(productDto.getIsAvailable(), productDto.getPrice());
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
        VideoProduct videoProduct = (video == null || (videoProductLqeggnwhkg = lqeggnwhkg(video)) == null) ? new VideoProduct(null, null, null, 7, null) : videoProductLqeggnwhkg;
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
        VivinoRating vivinoRatingWflxmlrfwp = vivino != null ? wflxmlrfwp(vivino) : null;
        ProductVariantsDto productVariants = productDto.getProductVariants();
        ProductVariants productVariantsDraadjrbmk = productVariants != null ? draadjrbmk(productVariants) : null;
        ProductDeclarationsDto declarations = productDto.getDeclarations();
        return new Product(id2, name, article, dDoubleValue, oldPrice, discount2, isDispPer100, measureTypeModelPpxfxbqfkf, avgWeight, isFavorite, isAvailable, zWkgbmnqykc, productPropertyNames, list2, photoUrl, list3, energy, fats, carbs, protein, map, description, chemical, z13, list, zBooleanValue, rating, iIntValue, zBooleanValue2, videoProduct, colorsModel, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, buttonIobyxmoadg, listZoijcleaow, vivinoRatingWflxmlrfwp, productVariantsDraadjrbmk, 0.0d, declarations != null ? btonecajqb(declarations) : null, 0, 8192, null);
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

    private final ProductVariant gtknphoqwx(ProductVariantDto gtknphoqwxVar) {
        return new ProductVariant(gtknphoqwxVar.getId(), gtknphoqwxVar.getArticle(), gtknphoqwxVar.getTitle(), gtknphoqwxVar.getUrl(), gtknphoqwxVar.getIsFavorite());
    }

    private final Sticker gxszxtbevo(StickerDto stickerDto) {
        return new Sticker(stickerDto.getName(), stickerDto.getIconUrl());
    }

    private final Button iobyxmoadg(ly0.iobyxmoadg iobyxmoadgVar) {
        String strPpxfxbqfkf = iobyxmoadgVar != null ? iobyxmoadgVar.getTitle() : null;
        if (strPpxfxbqfkf == null) {
            strPpxfxbqfkf = "";
        }
        ojitshcjhn ojitshcjhnVarIobyxmoadg = ojitshcjhn.f53516yggfygwlhe.iobyxmoadg(iobyxmoadgVar != null ? iobyxmoadgVar.getNavLink() : null);
        String strZoijcleaow = iobyxmoadgVar != null ? iobyxmoadgVar.getReference() : null;
        return new Button(strPpxfxbqfkf, ojitshcjhnVarIobyxmoadg, strZoijcleaow != null ? strZoijcleaow : "");
    }

    private final VideoProduct lqeggnwhkg(VideoProductDto lereixgezrVar) {
        String strPpxfxbqfkf = lereixgezrVar.getPreview();
        if (strPpxfxbqfkf == null) {
            strPpxfxbqfkf = "";
        }
        String strZoijcleaow = lereixgezrVar.getFile();
        if (strZoijcleaow == null) {
            strZoijcleaow = "";
        }
        String strIobyxmoadg = lereixgezrVar.getAdv();
        return new VideoProduct(strPpxfxbqfkf, strZoijcleaow, strIobyxmoadg != null ? strIobyxmoadg : "");
    }

    private final Product nufgyqmvbu(ProductDto productDto, List list, List list2, fy0.ppxfxbqfkf ppxfxbqfkfVar) {
        return dxjokdxxww(productDto, list, jx0.zoijcleaow.zoijcleaow(ppxfxbqfkfVar, list2));
    }

    private final VivinoRating wflxmlrfwp(VivinoRatingDto pmvmpeibljVar) {
        double dPpxfxbqfkf = pmvmpeibljVar.getRating();
        String strZoijcleaow = pmvmpeibljVar.getHeader();
        if (strZoijcleaow == null) {
            strZoijcleaow = "";
        }
        String strIobyxmoadg = pmvmpeibljVar.getDescription();
        return new VivinoRating(dPpxfxbqfkf, strZoijcleaow, strIobyxmoadg != null ? strIobyxmoadg : "");
    }

    private final a01.zoijcleaow wkgbmnqykc(String str) {
        Object obj;
        Object[] array = a01.zoijcleaow.wkgbmnqykc().toArray(new a01.zoijcleaow[0]);
        int length = array.length - 1;
        if (length < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i13 = length - 1;
            obj = array[length];
            if (zdlpuopuiu.eablkybsjg(((a01.zoijcleaow) obj).lqeggnwhkg(), str)) {
                break;
            }
            if (i13 < 0) {
                obj = null;
                break;
            }
            length = i13;
        }
        a01.zoijcleaow zoijcleaowVar = (a01.zoijcleaow) obj;
        return zoijcleaowVar == null ? a01.zoijcleaow.TEXT : zoijcleaowVar;
    }

    public final Product ppxfxbqfkf(ProductDto productDto, ProductsReferencesDto ojitshcjhnVar, fy0.ppxfxbqfkf ppxfxbqfkfVar) {
        List listWflxmlrfwp;
        List listPpxfxbqfkf;
        zdlpuopuiu.btonecajqb(productDto, "productDto");
        if (ojitshcjhnVar == null || (listPpxfxbqfkf = ojitshcjhnVar.getHints()) == null) {
            listWflxmlrfwp = null;
        } else {
            List hint = productDto.getHint();
            if (hint == null) {
                hint = jyumaefscl.wflxmlrfwp();
            }
            listWflxmlrfwp = yo0.iobyxmoadg.eablkybsjg(listPpxfxbqfkf, hint);
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        return nufgyqmvbu(productDto, listWflxmlrfwp, ojitshcjhnVar != null ? ojitshcjhnVar.getColors() : null, ppxfxbqfkfVar);
    }

    public final Product zoijcleaow(ProductDto productDto, List hints, ColorsModel colorsModel) {
        zdlpuopuiu.btonecajqb(productDto, "productDto");
        zdlpuopuiu.btonecajqb(hints, "hints");
        return dxjokdxxww(productDto, hints, colorsModel);
    }
}
