package ly;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lz.ProductDetailsDto;
import ru.myspar.core.domain.models.ColorsModel;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.domain.models.product.ProductListData;
import ru.myspar.core.domain.models.product.Products;
import ru.myspar.core.domain.models.product.PromoProduct;
import ru.myspar.core.domain.models.product.Section;
import ru.myspar.core.models.paging.Paging;
import tz.FavoriteFilterSectionDto;
import tz.FilterSectionDto;
import tz.ProductDto;
import tz.ProductsDto;
import tz.ProductsReferencesDto;
import tz.ProductsWithSelectionDto;
import tz.PromoProductDto;
import tz.SearchCategoryDto;
import tz.SearchFeatureDto;
import tz.SectionDto;
import tz.SelectionDto;
import tz.iwizpuwonk;
import tz.kcexrzcfyt;
import tz.vdvldrhtss;
import tz.yggfygwlhe;
import uy.StickerDto;
import y30.PagingDto;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f64367iobyxmoadg;

    public gxszxtbevo(wkgbmnqykc productDtoToDomainMapper) {
        zdlpuopuiu.btonecajqb(productDtoToDomainMapper, "productDtoToDomainMapper");
        this.f64367iobyxmoadg = productDtoToDomainMapper;
    }

    private final Products agtfadlqog(ProductsDto productsDto) {
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
                ProductDto productDtoZoijcleaow = productDto.zoijcleaow(((-536870913) & 1) != 0 ? productDto.id : null, ((-536870913) & 2) != 0 ? productDto.article : null, ((-536870913) & 4) != 0 ? productDto.name : null, ((-536870913) & 8) != 0 ? productDto.price : null, ((-536870913) & 16) != 0 ? productDto.oldPrice : null, ((-536870913) & 32) != 0 ? productDto.discount : null, ((-536870913) & 64) != 0 ? productDto.isDispPer100 : false, ((-536870913) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productDto.units : null, ((-536870913) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productDto.avgWeight : null, ((-536870913) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productDto.isFavorite : false, ((-536870913) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productDto.isAvailable : false, ((-536870913) & 2048) != 0 ? productDto.availableOnlyForPickup : false, ((-536870913) & 4096) != 0 ? productDto.onlyInShop : false, ((-536870913) & 8192) != 0 ? productDto.productPropertyNames : null, ((-536870913) & 16384) != 0 ? productDto.photoUrl : null, ((-536870913) & 32768) != 0 ? productDto.photoUrls : null, ((-536870913) & 65536) != 0 ? productDto.energy : null, ((-536870913) & 131072) != 0 ? productDto.fats : null, ((-536870913) & 262144) != 0 ? productDto.carbs : null, ((-536870913) & 524288) != 0 ? productDto.protein : null, ((-536870913) & 1048576) != 0 ? productDto.params : null, ((-536870913) & 2097152) != 0 ? productDto.description : null, ((-536870913) & 4194304) != 0 ? productDto.chemical : null, ((-536870913) & 8388608) != 0 ? productDto.hint : null, ((-536870913) & 16777216) != 0 ? productDto.hidePrice : null, ((-536870913) & 33554432) != 0 ? productDto.rating : null, ((-536870913) & 67108864) != 0 ? productDto.reviews : null, ((-536870913) & 134217728) != 0 ? productDto.isPmProduct : null, ((-536870913) & 268435456) != 0 ? productDto.video : null, ((-536870913) & 536870912) != 0 ? productDto.productProperties : arrayList2 == null ? jyumaefscl.wflxmlrfwp() : arrayList2, ((-536870913) & 1073741824) != 0 ? productDto.country : null, ((-536870913) & Integer.MIN_VALUE) != 0 ? productDto.region : null, (16383 & 1) != 0 ? productDto.countryFlagIcon : null, (16383 & 2) != 0 ? productDto.countryFlagEmoji : null, (16383 & 4) != 0 ? productDto.type : null, (16383 & 8) != 0 ? productDto.kind : null, (16383 & 16) != 0 ? productDto.grape : null, (16383 & 32) != 0 ? productDto.standart : null, (16383 & 64) != 0 ? productDto.countryMapIcon : null, (16383 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productDto.tasting : null, (16383 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productDto.styling : null, (16383 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productDto.button : null, (16383 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productDto.limits : null, (16383 & 2048) != 0 ? productDto.vivino : null, (16383 & 4096) != 0 ? productDto.productVariants : null, (16383 & 8192) != 0 ? productDto.quantity : null);
                wkgbmnqykc wkgbmnqykcVar = this.f64367iobyxmoadg;
                ProductsReferencesDto references2 = productsDto.getReferences();
                SectionDto section = productsDto.getSection();
                arrayList.add(wkgbmnqykcVar.ppxfxbqfkf(productDtoZoijcleaow, references2, section != null ? section.getColorThemeType() : null));
            }
        } else {
            arrayList = null;
        }
        List listEablkybsjg = eablkybsjg(productsDto.getFavoriteSections());
        PagingDto paging = productsDto.getPaging();
        Paging pagingIobyxmoadg = paging != null ? y30.zoijcleaow.iobyxmoadg(paging) : null;
        Boolean isAgeCheckNeeded = productsDto.getIsAgeCheckNeeded();
        return new Products(arrayList, pagingIobyxmoadg, listEablkybsjg, isAgeCheckNeeded != null ? isAgeCheckNeeded.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    private final k10.iobyxmoadg btonecajqb(ProductDetailsDto productDetailsDto) {
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
        if (product2 != null && (productDtoZoijcleaow = product2.zoijcleaow(((-536870913) & 1) != 0 ? product2.id : null, ((-536870913) & 2) != 0 ? product2.article : null, ((-536870913) & 4) != 0 ? product2.name : null, ((-536870913) & 8) != 0 ? product2.price : null, ((-536870913) & 16) != 0 ? product2.oldPrice : null, ((-536870913) & 32) != 0 ? product2.discount : null, ((-536870913) & 64) != 0 ? product2.isDispPer100 : false, ((-536870913) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product2.units : null, ((-536870913) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product2.avgWeight : null, ((-536870913) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product2.isFavorite : false, ((-536870913) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product2.isAvailable : false, ((-536870913) & 2048) != 0 ? product2.availableOnlyForPickup : false, ((-536870913) & 4096) != 0 ? product2.onlyInShop : false, ((-536870913) & 8192) != 0 ? product2.productPropertyNames : null, ((-536870913) & 16384) != 0 ? product2.photoUrl : null, ((-536870913) & 32768) != 0 ? product2.photoUrls : null, ((-536870913) & 65536) != 0 ? product2.energy : null, ((-536870913) & 131072) != 0 ? product2.fats : null, ((-536870913) & 262144) != 0 ? product2.carbs : null, ((-536870913) & 524288) != 0 ? product2.protein : null, ((-536870913) & 1048576) != 0 ? product2.params : null, ((-536870913) & 2097152) != 0 ? product2.description : null, ((-536870913) & 4194304) != 0 ? product2.chemical : null, ((-536870913) & 8388608) != 0 ? product2.hint : null, ((-536870913) & 16777216) != 0 ? product2.hidePrice : null, ((-536870913) & 33554432) != 0 ? product2.rating : null, ((-536870913) & 67108864) != 0 ? product2.reviews : null, ((-536870913) & 134217728) != 0 ? product2.isPmProduct : null, ((-536870913) & 268435456) != 0 ? product2.video : null, ((-536870913) & 536870912) != 0 ? product2.productProperties : list, ((-536870913) & 1073741824) != 0 ? product2.country : null, ((-536870913) & Integer.MIN_VALUE) != 0 ? product2.region : null, (16383 & 1) != 0 ? product2.countryFlagIcon : null, (16383 & 2) != 0 ? product2.countryFlagEmoji : null, (16383 & 4) != 0 ? product2.type : null, (16383 & 8) != 0 ? product2.kind : null, (16383 & 16) != 0 ? product2.grape : null, (16383 & 32) != 0 ? product2.standart : null, (16383 & 64) != 0 ? product2.countryMapIcon : null, (16383 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product2.tasting : null, (16383 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product2.styling : null, (16383 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product2.button : null, (16383 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product2.limits : null, (16383 & 2048) != 0 ? product2.vivino : null, (16383 & 4096) != 0 ? product2.productVariants : null, (16383 & 8192) != 0 ? product2.quantity : null)) != null) {
            productPpxfxbqfkf = this.f64367iobyxmoadg.ppxfxbqfkf(productDtoZoijcleaow, productDetailsDto.getReferences(), productDetailsDto.getColorThemeType());
        }
        List sections = productDetailsDto.getSections();
        return new k10.iobyxmoadg(productPpxfxbqfkf, !(sections == null || sections.isEmpty()));
    }

    private final PromoProduct draadjrbmk(PromoProductDto ojitshcjhnVar, ProductsReferencesDto productsReferencesDto, nz.ppxfxbqfkf ppxfxbqfkfVar) {
        return new PromoProduct(this.f64367iobyxmoadg.ppxfxbqfkf(ojitshcjhnVar.getProduct(), productsReferencesDto, ppxfxbqfkfVar), ojitshcjhnVar.getBacklightColor(), ojitshcjhnVar.getArticle(), ojitshcjhnVar.getAdv());
    }

    private final List eablkybsjg(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tz.ppxfxbqfkf.iobyxmoadg((FavoriteFilterSectionDto) it.next()));
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
            arrayList.add(tz.eablkybsjg.iobyxmoadg((FilterSectionDto) it.next()));
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
            arrayList.add(vdvldrhtss.iobyxmoadg((SearchCategoryDto) it.next()));
        }
        return arrayList;
    }

    private final ProductListData wflxmlrfwp(ProductsDto productsDto) {
        ArrayList arrayList;
        Section sectionIobyxmoadg;
        PromoProduct promoProductDraadjrbmk;
        ArrayList arrayList2;
        List stickers;
        List<ProductDto> productList = productsDto.getProductList();
        ArrayList arrayList3 = null;
        if (productList != null) {
            ArrayList arrayList4 = new ArrayList(jyumaefscl.cqumvgiudr(productList, 10));
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
                ProductDto productDtoZoijcleaow = productDto.zoijcleaow(((-536870913) & 1) != 0 ? productDto.id : null, ((-536870913) & 2) != 0 ? productDto.article : null, ((-536870913) & 4) != 0 ? productDto.name : null, ((-536870913) & 8) != 0 ? productDto.price : null, ((-536870913) & 16) != 0 ? productDto.oldPrice : null, ((-536870913) & 32) != 0 ? productDto.discount : null, ((-536870913) & 64) != 0 ? productDto.isDispPer100 : false, ((-536870913) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productDto.units : null, ((-536870913) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productDto.avgWeight : null, ((-536870913) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productDto.isFavorite : false, ((-536870913) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productDto.isAvailable : false, ((-536870913) & 2048) != 0 ? productDto.availableOnlyForPickup : false, ((-536870913) & 4096) != 0 ? productDto.onlyInShop : false, ((-536870913) & 8192) != 0 ? productDto.productPropertyNames : null, ((-536870913) & 16384) != 0 ? productDto.photoUrl : null, ((-536870913) & 32768) != 0 ? productDto.photoUrls : null, ((-536870913) & 65536) != 0 ? productDto.energy : null, ((-536870913) & 131072) != 0 ? productDto.fats : null, ((-536870913) & 262144) != 0 ? productDto.carbs : null, ((-536870913) & 524288) != 0 ? productDto.protein : null, ((-536870913) & 1048576) != 0 ? productDto.params : null, ((-536870913) & 2097152) != 0 ? productDto.description : null, ((-536870913) & 4194304) != 0 ? productDto.chemical : null, ((-536870913) & 8388608) != 0 ? productDto.hint : null, ((-536870913) & 16777216) != 0 ? productDto.hidePrice : null, ((-536870913) & 33554432) != 0 ? productDto.rating : null, ((-536870913) & 67108864) != 0 ? productDto.reviews : null, ((-536870913) & 134217728) != 0 ? productDto.isPmProduct : null, ((-536870913) & 268435456) != 0 ? productDto.video : null, ((-536870913) & 536870912) != 0 ? productDto.productProperties : arrayList2 == null ? jyumaefscl.wflxmlrfwp() : arrayList2, ((-536870913) & 1073741824) != 0 ? productDto.country : null, ((-536870913) & Integer.MIN_VALUE) != 0 ? productDto.region : null, (16383 & 1) != 0 ? productDto.countryFlagIcon : null, (16383 & 2) != 0 ? productDto.countryFlagEmoji : null, (16383 & 4) != 0 ? productDto.type : null, (16383 & 8) != 0 ? productDto.kind : null, (16383 & 16) != 0 ? productDto.grape : null, (16383 & 32) != 0 ? productDto.standart : null, (16383 & 64) != 0 ? productDto.countryMapIcon : null, (16383 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productDto.tasting : null, (16383 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productDto.styling : null, (16383 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productDto.button : null, (16383 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productDto.limits : null, (16383 & 2048) != 0 ? productDto.vivino : null, (16383 & 4096) != 0 ? productDto.productVariants : null, (16383 & 8192) != 0 ? productDto.quantity : null);
                wkgbmnqykc wkgbmnqykcVar = this.f64367iobyxmoadg;
                ProductsReferencesDto references2 = productsDto.getReferences();
                SectionDto section = productsDto.getSection();
                arrayList4.add(wkgbmnqykcVar.ppxfxbqfkf(productDtoZoijcleaow, references2, section != null ? section.getColorThemeType() : null));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        List listLqeggnwhkg = lqeggnwhkg(productsDto.getSearchCategories());
        List listGxszxtbevo = gxszxtbevo(productsDto.getFilterSections());
        List searchSuggestions = productsDto.getSearchSuggestions();
        PagingDto paging = productsDto.getPaging();
        Paging pagingIobyxmoadg = paging != null ? y30.zoijcleaow.iobyxmoadg(paging) : null;
        SectionDto section2 = productsDto.getSection();
        if (section2 != null) {
            ProductsReferencesDto references3 = productsDto.getReferences();
            sectionIobyxmoadg = yggfygwlhe.iobyxmoadg(section2, references3 != null ? references3.getColors() : null);
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
        nz.ppxfxbqfkf colorThemeType = section4 != null ? section4.getColorThemeType() : null;
        ProductsReferencesDto references4 = productsDto.getReferences();
        ColorsModel colorsModelZoijcleaow = oy.zoijcleaow.zoijcleaow(colorThemeType, references4 != null ? references4.getColors() : null);
        PromoProductDto promoProduct = productsDto.getPromoProduct();
        if (promoProduct != null) {
            ProductsReferencesDto references5 = productsDto.getReferences();
            SectionDto section5 = productsDto.getSection();
            promoProductDraadjrbmk = draadjrbmk(promoProduct, references5, section5 != null ? section5.getColorThemeType() : null);
        } else {
            promoProductDraadjrbmk = null;
        }
        List features = productsDto.getFeatures();
        if (features != null) {
            arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(features, 10));
            Iterator it = features.iterator();
            while (it.hasNext()) {
                arrayList3.add(kcexrzcfyt.iobyxmoadg((SearchFeatureDto) it.next()));
            }
        }
        ArrayList arrayList5 = arrayList3;
        k10.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = k10.ppxfxbqfkf.f53452yggfygwlhe;
        String otherBlocksType = productsDto.getOtherBlocksType();
        if (otherBlocksType == null) {
            otherBlocksType = "";
        }
        return new ProductListData(searchSuggestions, listLqeggnwhkg, arrayList, pagingIobyxmoadg, listGxszxtbevo, titleImage, null, textModal, headerModal, buttonModal, textBefore, zBooleanValue, sectionIobyxmoadg, colorsModelZoijcleaow, promoProductDraadjrbmk, arrayList5, iobyxmoadgVar.iobyxmoadg(otherBlocksType), 64, null);
    }

    public final Products dxjokdxxww(ProductsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return agtfadlqog(dto);
    }

    public final ProductListData gtknphoqwx(ProductsWithSelectionDto productsWithSelectionDto) {
        ArrayList arrayList;
        zdlpuopuiu.btonecajqb(productsWithSelectionDto, "<this>");
        List productList = productsWithSelectionDto.getProductList();
        if (productList != null) {
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(productList, 10));
            Iterator it = productList.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.f64367iobyxmoadg.ppxfxbqfkf((ProductDto) it.next(), productsWithSelectionDto.getReferences(), nz.ppxfxbqfkf.SPAR_WINE));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        PagingDto paging = productsWithSelectionDto.getPaging();
        Paging pagingIobyxmoadg = paging != null ? y30.zoijcleaow.iobyxmoadg(paging) : null;
        String currentSelectionId = productsWithSelectionDto.getCurrentSelectionId();
        String currentSelectionName = productsWithSelectionDto.getCurrentSelectionName();
        List selections = productsWithSelectionDto.getSelections();
        ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(selections, 10));
        Iterator it2 = selections.iterator();
        while (it2.hasNext()) {
            arrayList3.add(iwizpuwonk.iobyxmoadg((SelectionDto) it2.next()));
        }
        ProductListData.SelectionsData selectionsData = new ProductListData.SelectionsData(currentSelectionId, currentSelectionName, arrayList3);
        String titleImage = productsWithSelectionDto.getTitleImage();
        List listGxszxtbevo = gxszxtbevo(productsWithSelectionDto.getFilterSections());
        nz.ppxfxbqfkf ppxfxbqfkfVar = nz.ppxfxbqfkf.SPAR_WINE;
        ProductsReferencesDto references = productsWithSelectionDto.getReferences();
        return new ProductListData(null, null, arrayList, pagingIobyxmoadg, listGxszxtbevo, titleImage, selectionsData, null, null, null, null, false, null, oy.zoijcleaow.zoijcleaow(ppxfxbqfkfVar, references != null ? references.getColors() : null), null, null, null, 24451, null);
    }

    public final k10.iobyxmoadg iobyxmoadg(ProductDetailsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return btonecajqb(dto);
    }

    public final ProductListData nufgyqmvbu(ProductsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return wflxmlrfwp(dto);
    }

    public final Product ppxfxbqfkf(ProductDto productDto, ProductsReferencesDto productsReferencesDto, nz.ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(productDto, "productDto");
        return this.f64367iobyxmoadg.ppxfxbqfkf(productDto, productsReferencesDto, ppxfxbqfkfVar);
    }

    public final ProductListData wkgbmnqykc(ProductsWithSelectionDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return gtknphoqwx(dto);
    }

    public final Product zoijcleaow(ProductDto productDto, List hint, ColorsModel colorsModel) {
        zdlpuopuiu.btonecajqb(productDto, "productDto");
        zdlpuopuiu.btonecajqb(hint, "hint");
        return this.f64367iobyxmoadg.zoijcleaow(productDto, hint, colorsModel);
    }
}
