package gx0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d21.PagingDto;
import dy0.ProductDetailsDto;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;
import ly0.FavoriteFilterSectionDto;
import ly0.FilterSectionDto;
import ly0.ProductDto;
import ly0.ProductsDto;
import ly0.ProductsPromoBannerDto;
import ly0.ProductsReferencesDto;
import ly0.ProductsWithSelectionDto;
import ly0.PromoProductDto;
import ly0.SearchCategoryDto;
import ly0.SearchFeatureDto;
import ly0.SectionDto;
import ly0.SelectionDto;
import ly0.esjtqupxsv;
import ly0.iwizpuwonk;
import ly0.kcexrzcfyt;
import ly0.yggfygwlhe;
import px0.StickerDto;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.product.ProductListData;
import ru.myspar.proloyalty.core.domain.models.product.Products;
import ru.myspar.proloyalty.core.domain.models.product.ProductsPromoBanner;
import ru.myspar.proloyalty.core.domain.models.product.PromoProduct;
import ru.myspar.proloyalty.core.domain.models.product.Section;
import ru.myspar.proloyalty.core.models.paging.Paging;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f38647iobyxmoadg;

    public gxszxtbevo(wkgbmnqykc productDtoToDomainMapper) {
        zdlpuopuiu.btonecajqb(productDtoToDomainMapper, "productDtoToDomainMapper");
        this.f38647iobyxmoadg = productDtoToDomainMapper;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01f1 A[EDGE_INSN: B:88:0x01f1->B:89:0x01f2 BREAK  A[LOOP:4: B:83:0x01e0->B:109:?]] */
    private final ProductListData agtfadlqog(ProductsDto productsDto) {
        ArrayList arrayList;
        Section sectionIobyxmoadg;
        PromoProduct promoProductWflxmlrfwp;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        List stickers;
        List<ProductDto> productList = productsDto.getProductList();
        if (productList != null) {
            ArrayList arrayList5 = new ArrayList(jyumaefscl.cqumvgiudr(productList, 10));
            for (ProductDto productDto : productList) {
                ProductsReferencesDto references = productsDto.getReferences();
                if (references == null || (stickers = references.getStickers()) == null) {
                    arrayList4 = null;
                } else {
                    arrayList4 = new ArrayList();
                    for (Object obj : stickers) {
                        if (productDto.getProductPropertyNames().contains(((StickerDto) obj).getName())) {
                            arrayList4.add(obj);
                        }
                    }
                }
                ProductDto productDtoZoijcleaow = productDto.zoijcleaow(((-134217729) & 1) != 0 ? productDto.id : null, ((-134217729) & 2) != 0 ? productDto.article : null, ((-134217729) & 4) != 0 ? productDto.name : null, ((-134217729) & 8) != 0 ? productDto.price : null, ((-134217729) & 16) != 0 ? productDto.oldPrice : null, ((-134217729) & 32) != 0 ? productDto.discount : null, ((-134217729) & 64) != 0 ? productDto.isDispPer100 : false, ((-134217729) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productDto.units : null, ((-134217729) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productDto.avgWeight : null, ((-134217729) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productDto.isFavorite : false, ((-134217729) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productDto.isAvailable : false, ((-134217729) & 2048) != 0 ? productDto.productPropertyNames : null, ((-134217729) & 4096) != 0 ? productDto.photoUrl : null, ((-134217729) & 8192) != 0 ? productDto.photoUrls : null, ((-134217729) & 16384) != 0 ? productDto.energy : null, ((-134217729) & 32768) != 0 ? productDto.fats : null, ((-134217729) & 65536) != 0 ? productDto.carbs : null, ((-134217729) & 131072) != 0 ? productDto.protein : null, ((-134217729) & 262144) != 0 ? productDto.params : null, ((-134217729) & 524288) != 0 ? productDto.description : null, ((-134217729) & 1048576) != 0 ? productDto.chemical : null, ((-134217729) & 2097152) != 0 ? productDto.hint : null, ((-134217729) & 4194304) != 0 ? productDto.hidePrice : null, ((-134217729) & 8388608) != 0 ? productDto.rating : null, ((-134217729) & 16777216) != 0 ? productDto.reviews : null, ((-134217729) & 33554432) != 0 ? productDto.isPmProduct : null, ((-134217729) & 67108864) != 0 ? productDto.video : null, ((-134217729) & 134217728) != 0 ? productDto.productProperties : arrayList4 == null ? jyumaefscl.wflxmlrfwp() : arrayList4, ((-134217729) & 268435456) != 0 ? productDto.country : null, ((-134217729) & 536870912) != 0 ? productDto.region : null, ((-134217729) & 1073741824) != 0 ? productDto.countryFlagIcon : null, ((-134217729) & Integer.MIN_VALUE) != 0 ? productDto.countryFlagEmoji : null, (8191 & 1) != 0 ? productDto.type : null, (8191 & 2) != 0 ? productDto.kind : null, (8191 & 4) != 0 ? productDto.grape : null, (8191 & 8) != 0 ? productDto.standart : null, (8191 & 16) != 0 ? productDto.countryMapIcon : null, (8191 & 32) != 0 ? productDto.tasting : null, (8191 & 64) != 0 ? productDto.styling : null, (8191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productDto.button : null, (8191 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productDto.limits : null, (8191 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productDto.vivino : null, (8191 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productDto.productVariants : null, (8191 & 2048) != 0 ? productDto.quantity : null, (8191 & 4096) != 0 ? productDto.declarations : null);
                wkgbmnqykc wkgbmnqykcVar = this.f38647iobyxmoadg;
                ProductsReferencesDto references2 = productsDto.getReferences();
                SectionDto section = productsDto.getSection();
                arrayList5.add(wkgbmnqykcVar.ppxfxbqfkf(productDtoZoijcleaow, references2, section != null ? section.getColorThemeType() : null));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        List listLqeggnwhkg = lqeggnwhkg(productsDto.getSearchCategories());
        List listGxszxtbevo = gxszxtbevo(productsDto.getFilterSections());
        List searchSuggestions = productsDto.getSearchSuggestions();
        PagingDto paging = productsDto.getPaging();
        Paging pagingIobyxmoadg = paging != null ? d21.zoijcleaow.iobyxmoadg(paging) : null;
        SectionDto section2 = productsDto.getSection();
        if (section2 != null) {
            ProductsReferencesDto references3 = productsDto.getReferences();
            sectionIobyxmoadg = iwizpuwonk.iobyxmoadg(section2, references3 != null ? references3.getColors() : null);
        } else {
            sectionIobyxmoadg = null;
        }
        String textModal = productsDto.getTextModal();
        String headerModal = productsDto.getHeaderModal();
        String buttonModal = productsDto.getButtonModal();
        String textBefore = productsDto.getTextBefore();
        Boolean isAgeCheckNeeded = productsDto.getIsAgeCheckNeeded();
        boolean zBooleanValue = isAgeCheckNeeded != null ? isAgeCheckNeeded.booleanValue() : false;
        SectionDto section3 = productsDto.getSection();
        String titleImage = section3 != null ? section3.getTitleImage() : null;
        SectionDto section4 = productsDto.getSection();
        fy0.ppxfxbqfkf colorThemeType = section4 != null ? section4.getColorThemeType() : null;
        ProductsReferencesDto references4 = productsDto.getReferences();
        ColorsModel colorsModelZoijcleaow = jx0.zoijcleaow.zoijcleaow(colorThemeType, references4 != null ? references4.getColors() : null);
        PromoProductDto promoProduct = productsDto.getPromoProduct();
        if (promoProduct != null) {
            ProductsReferencesDto references5 = productsDto.getReferences();
            SectionDto section5 = productsDto.getSection();
            promoProductWflxmlrfwp = wflxmlrfwp(promoProduct, references5, section5 != null ? section5.getColorThemeType() : null);
        } else {
            promoProductWflxmlrfwp = null;
        }
        List features = productsDto.getFeatures();
        if (features != null) {
            ArrayList arrayList6 = new ArrayList(jyumaefscl.cqumvgiudr(features, 10));
            Iterator it = features.iterator();
            while (it.hasNext()) {
                arrayList6.add(yggfygwlhe.iobyxmoadg((SearchFeatureDto) it.next()));
            }
            arrayList2 = arrayList6;
        } else {
            arrayList2 = null;
        }
        List additionalBlocks = productsDto.getAdditionalBlocks();
        if (additionalBlocks == null) {
            arrayList3 = null;
            break;
        }
        arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(additionalBlocks, 10));
        Iterator it2 = additionalBlocks.iterator();
        while (it2.hasNext()) {
            arrayList3.add(a01.ppxfxbqfkf.f113yggfygwlhe.iobyxmoadg((String) it2.next()));
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
            break;
        }
        Iterator it3 = arrayList3.iterator();
        do {
            if (!it3.hasNext()) {
                arrayList3 = null;
                break;
            }
        } while (((a01.ppxfxbqfkf) it3.next()) == a01.ppxfxbqfkf.NONE);
        List listWflxmlrfwp = arrayList3 == null ? jyumaefscl.wflxmlrfwp() : arrayList3;
        ProductsPromoBannerDto promoBanner = productsDto.getPromoBanner();
        return new ProductListData(searchSuggestions, listLqeggnwhkg, arrayList, pagingIobyxmoadg, listGxszxtbevo, titleImage, null, textModal, headerModal, buttonModal, textBefore, zBooleanValue, sectionIobyxmoadg, colorsModelZoijcleaow, promoProductWflxmlrfwp, arrayList2, listWflxmlrfwp, promoBanner != null ? draadjrbmk(promoBanner) : null, 64, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    private final a01.iobyxmoadg btonecajqb(ProductDetailsDto productDetailsDto) {
        List listWflxmlrfwp;
        ProductDto productDtoZoijcleaow;
        List<String> productPropertyNames;
        StickerDto stickerDto;
        List stickers;
        Object next;
        ProductDto product = productDetailsDto.getProduct();
        Product productPpxfxbqfkf = null;
        if (product == null || (productPropertyNames = product.getProductPropertyNames()) == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str : productPropertyNames) {
                ProductsReferencesDto references = productDetailsDto.getReferences();
                if (references == null || (stickers = references.getStickers()) == null) {
                    stickerDto = null;
                } else {
                    Iterator it = stickers.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!zdlpuopuiu.eablkybsjg(((StickerDto) next).getName(), str));
                    stickerDto = (StickerDto) next;
                }
                if (stickerDto != null) {
                    arrayList.add(stickerDto);
                }
            }
            listWflxmlrfwp = jyumaefscl.m(arrayList);
            if (listWflxmlrfwp == null) {
                listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
            }
        }
        List list = listWflxmlrfwp;
        ProductDto product2 = productDetailsDto.getProduct();
        if (product2 != null && (productDtoZoijcleaow = product2.zoijcleaow(((-134217729) & 1) != 0 ? product2.id : null, ((-134217729) & 2) != 0 ? product2.article : null, ((-134217729) & 4) != 0 ? product2.name : null, ((-134217729) & 8) != 0 ? product2.price : null, ((-134217729) & 16) != 0 ? product2.oldPrice : null, ((-134217729) & 32) != 0 ? product2.discount : null, ((-134217729) & 64) != 0 ? product2.isDispPer100 : false, ((-134217729) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product2.units : null, ((-134217729) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product2.avgWeight : null, ((-134217729) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product2.isFavorite : false, ((-134217729) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product2.isAvailable : false, ((-134217729) & 2048) != 0 ? product2.productPropertyNames : null, ((-134217729) & 4096) != 0 ? product2.photoUrl : null, ((-134217729) & 8192) != 0 ? product2.photoUrls : null, ((-134217729) & 16384) != 0 ? product2.energy : null, ((-134217729) & 32768) != 0 ? product2.fats : null, ((-134217729) & 65536) != 0 ? product2.carbs : null, ((-134217729) & 131072) != 0 ? product2.protein : null, ((-134217729) & 262144) != 0 ? product2.params : null, ((-134217729) & 524288) != 0 ? product2.description : null, ((-134217729) & 1048576) != 0 ? product2.chemical : null, ((-134217729) & 2097152) != 0 ? product2.hint : null, ((-134217729) & 4194304) != 0 ? product2.hidePrice : null, ((-134217729) & 8388608) != 0 ? product2.rating : null, ((-134217729) & 16777216) != 0 ? product2.reviews : null, ((-134217729) & 33554432) != 0 ? product2.isPmProduct : null, ((-134217729) & 67108864) != 0 ? product2.video : null, ((-134217729) & 134217728) != 0 ? product2.productProperties : list, ((-134217729) & 268435456) != 0 ? product2.country : null, ((-134217729) & 536870912) != 0 ? product2.region : null, ((-134217729) & 1073741824) != 0 ? product2.countryFlagIcon : null, ((-134217729) & Integer.MIN_VALUE) != 0 ? product2.countryFlagEmoji : null, (8191 & 1) != 0 ? product2.type : null, (8191 & 2) != 0 ? product2.kind : null, (8191 & 4) != 0 ? product2.grape : null, (8191 & 8) != 0 ? product2.standart : null, (8191 & 16) != 0 ? product2.countryMapIcon : null, (8191 & 32) != 0 ? product2.tasting : null, (8191 & 64) != 0 ? product2.styling : null, (8191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product2.button : null, (8191 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product2.limits : null, (8191 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product2.vivino : null, (8191 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product2.productVariants : null, (8191 & 2048) != 0 ? product2.quantity : null, (8191 & 4096) != 0 ? product2.declarations : null)) != null) {
            productPpxfxbqfkf = this.f38647iobyxmoadg.ppxfxbqfkf(productDtoZoijcleaow, productDetailsDto.getReferences(), productDetailsDto.getColorThemeType());
        }
        List sections = productDetailsDto.getSections();
        return new a01.iobyxmoadg(productPpxfxbqfkf, !(sections == null || sections.isEmpty()));
    }

    private final ProductsPromoBanner draadjrbmk(ProductsPromoBannerDto productsPromoBannerDto) {
        String id2 = productsPromoBannerDto.getId();
        String imageUrl = productsPromoBannerDto.getImageUrl();
        String str = imageUrl == null ? "" : imageUrl;
        ojitshcjhn ojitshcjhnVarIobyxmoadg = ojitshcjhn.f53516yggfygwlhe.iobyxmoadg(productsPromoBannerDto.getNavLink());
        String reference = productsPromoBannerDto.getReference();
        String adv = productsPromoBannerDto.getAdv();
        if (adv == null) {
            adv = "";
        }
        return new ProductsPromoBanner(id2, str, ojitshcjhnVarIobyxmoadg, reference, adv);
    }

    private final List eablkybsjg(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ly0.ppxfxbqfkf.iobyxmoadg((FavoriteFilterSectionDto) it.next()));
        }
        return arrayList;
    }

    private final List gxszxtbevo(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ly0.eablkybsjg.iobyxmoadg((FilterSectionDto) it.next()));
        }
        return arrayList;
    }

    private final List lqeggnwhkg(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(kcexrzcfyt.iobyxmoadg((SearchCategoryDto) it.next()));
        }
        return arrayList;
    }

    private final Products ojitshcjhn(ProductsDto productsDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List stickers;
        List<ProductDto> productList = productsDto.getProductList();
        if (productList != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(productList, 10));
            for (ProductDto productDto : productList) {
                ProductsReferencesDto references = productsDto.getReferences();
                if (references == null || (stickers = references.getStickers()) == null) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList();
                    for (Object obj : stickers) {
                        if (productDto.getProductPropertyNames().contains(((StickerDto) obj).getName())) {
                            arrayList2.add(obj);
                        }
                    }
                }
                ProductDto productDtoZoijcleaow = productDto.zoijcleaow(((-134217729) & 1) != 0 ? productDto.id : null, ((-134217729) & 2) != 0 ? productDto.article : null, ((-134217729) & 4) != 0 ? productDto.name : null, ((-134217729) & 8) != 0 ? productDto.price : null, ((-134217729) & 16) != 0 ? productDto.oldPrice : null, ((-134217729) & 32) != 0 ? productDto.discount : null, ((-134217729) & 64) != 0 ? productDto.isDispPer100 : false, ((-134217729) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productDto.units : null, ((-134217729) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productDto.avgWeight : null, ((-134217729) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productDto.isFavorite : false, ((-134217729) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productDto.isAvailable : false, ((-134217729) & 2048) != 0 ? productDto.productPropertyNames : null, ((-134217729) & 4096) != 0 ? productDto.photoUrl : null, ((-134217729) & 8192) != 0 ? productDto.photoUrls : null, ((-134217729) & 16384) != 0 ? productDto.energy : null, ((-134217729) & 32768) != 0 ? productDto.fats : null, ((-134217729) & 65536) != 0 ? productDto.carbs : null, ((-134217729) & 131072) != 0 ? productDto.protein : null, ((-134217729) & 262144) != 0 ? productDto.params : null, ((-134217729) & 524288) != 0 ? productDto.description : null, ((-134217729) & 1048576) != 0 ? productDto.chemical : null, ((-134217729) & 2097152) != 0 ? productDto.hint : null, ((-134217729) & 4194304) != 0 ? productDto.hidePrice : null, ((-134217729) & 8388608) != 0 ? productDto.rating : null, ((-134217729) & 16777216) != 0 ? productDto.reviews : null, ((-134217729) & 33554432) != 0 ? productDto.isPmProduct : null, ((-134217729) & 67108864) != 0 ? productDto.video : null, ((-134217729) & 134217728) != 0 ? productDto.productProperties : arrayList2 == null ? jyumaefscl.wflxmlrfwp() : arrayList2, ((-134217729) & 268435456) != 0 ? productDto.country : null, ((-134217729) & 536870912) != 0 ? productDto.region : null, ((-134217729) & 1073741824) != 0 ? productDto.countryFlagIcon : null, ((-134217729) & Integer.MIN_VALUE) != 0 ? productDto.countryFlagEmoji : null, (8191 & 1) != 0 ? productDto.type : null, (8191 & 2) != 0 ? productDto.kind : null, (8191 & 4) != 0 ? productDto.grape : null, (8191 & 8) != 0 ? productDto.standart : null, (8191 & 16) != 0 ? productDto.countryMapIcon : null, (8191 & 32) != 0 ? productDto.tasting : null, (8191 & 64) != 0 ? productDto.styling : null, (8191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productDto.button : null, (8191 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productDto.limits : null, (8191 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productDto.vivino : null, (8191 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productDto.productVariants : null, (8191 & 2048) != 0 ? productDto.quantity : null, (8191 & 4096) != 0 ? productDto.declarations : null);
                wkgbmnqykc wkgbmnqykcVar = this.f38647iobyxmoadg;
                ProductsReferencesDto references2 = productsDto.getReferences();
                SectionDto section = productsDto.getSection();
                arrayList.add(wkgbmnqykcVar.ppxfxbqfkf(productDtoZoijcleaow, references2, section != null ? section.getColorThemeType() : null));
            }
        } else {
            arrayList = null;
        }
        List listEablkybsjg = eablkybsjg(productsDto.getFavoriteSections());
        PagingDto paging = productsDto.getPaging();
        Paging pagingIobyxmoadg = paging != null ? d21.zoijcleaow.iobyxmoadg(paging) : null;
        Boolean isAgeCheckNeeded = productsDto.getIsAgeCheckNeeded();
        return new Products(arrayList, pagingIobyxmoadg, listEablkybsjg, isAgeCheckNeeded != null ? isAgeCheckNeeded.booleanValue() : false);
    }

    private final PromoProduct wflxmlrfwp(PromoProductDto vdvldrhtssVar, ProductsReferencesDto productsReferencesDto, fy0.ppxfxbqfkf ppxfxbqfkfVar) {
        return new PromoProduct(this.f38647iobyxmoadg.ppxfxbqfkf(vdvldrhtssVar.getProduct(), productsReferencesDto, ppxfxbqfkfVar), vdvldrhtssVar.getBacklightColor(), vdvldrhtssVar.getArticle(), vdvldrhtssVar.getAdv());
    }

    public final Products dxjokdxxww(ProductsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return ojitshcjhn(dto);
    }

    public final ProductListData gtknphoqwx(ProductsWithSelectionDto productsWithSelectionDto) {
        ArrayList arrayList;
        zdlpuopuiu.btonecajqb(productsWithSelectionDto, "<this>");
        List productList = productsWithSelectionDto.getProductList();
        if (productList != null) {
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(productList, 10));
            Iterator it = productList.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.f38647iobyxmoadg.ppxfxbqfkf((ProductDto) it.next(), productsWithSelectionDto.getReferences(), fy0.ppxfxbqfkf.SPAR_WINE));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        PagingDto paging = productsWithSelectionDto.getPaging();
        Paging pagingIobyxmoadg = paging != null ? d21.zoijcleaow.iobyxmoadg(paging) : null;
        String currentSelectionId = productsWithSelectionDto.getCurrentSelectionId();
        String currentSelectionName = productsWithSelectionDto.getCurrentSelectionName();
        List selections = productsWithSelectionDto.getSelections();
        ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(selections, 10));
        Iterator it2 = selections.iterator();
        while (it2.hasNext()) {
            arrayList3.add(esjtqupxsv.iobyxmoadg((SelectionDto) it2.next()));
        }
        ProductListData.SelectionsData selectionsData = new ProductListData.SelectionsData(currentSelectionId, currentSelectionName, arrayList3);
        String titleImage = productsWithSelectionDto.getTitleImage();
        List listGxszxtbevo = gxszxtbevo(productsWithSelectionDto.getFilterSections());
        fy0.ppxfxbqfkf ppxfxbqfkfVar = fy0.ppxfxbqfkf.SPAR_WINE;
        ProductsReferencesDto references = productsWithSelectionDto.getReferences();
        return new ProductListData(null, null, arrayList, pagingIobyxmoadg, listGxszxtbevo, titleImage, selectionsData, null, null, null, null, false, null, jx0.zoijcleaow.zoijcleaow(ppxfxbqfkfVar, references != null ? references.getColors() : null), null, null, jyumaefscl.wflxmlrfwp(), null, 24451, null);
    }

    public final a01.iobyxmoadg iobyxmoadg(ProductDetailsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return btonecajqb(dto);
    }

    public final ProductListData nufgyqmvbu(ProductsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return agtfadlqog(dto);
    }

    public final Product ppxfxbqfkf(ProductDto productDto, ProductsReferencesDto productsReferencesDto, fy0.ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(productDto, "productDto");
        return this.f38647iobyxmoadg.ppxfxbqfkf(productDto, productsReferencesDto, ppxfxbqfkfVar);
    }

    public final ProductListData wkgbmnqykc(ProductsWithSelectionDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return gtknphoqwx(dto);
    }

    public final Product zoijcleaow(ProductDto productDto, List hint, ColorsModel colorsModel) {
        zdlpuopuiu.btonecajqb(productDto, "productDto");
        zdlpuopuiu.btonecajqb(hint, "hint");
        return this.f38647iobyxmoadg.zoijcleaow(productDto, hint, colorsModel);
    }
}
