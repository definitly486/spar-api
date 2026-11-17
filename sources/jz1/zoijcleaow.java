package jz1;

import ez1.PurchaseListDetailsDto;
import ez1.PurchaseListDto;
import ez1.PurchaseListsDto;
import ez1.PurchaseProductDto;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import oy.lqeggnwhkg;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import ru.myspar.purchases_list.api.models.PurchaseList;
import ru.myspar.purchases_list.api.models.PurchaseListDetails;
import ru.myspar.purchases_list.api.models.PurchaseProduct;
import tz.ProductsReferencesDto;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lqeggnwhkg f52583iobyxmoadg;

    public zoijcleaow(lqeggnwhkg measureTypeModelMapper) {
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        this.f52583iobyxmoadg = measureTypeModelMapper;
    }

    private final PurchaseList eablkybsjg(PurchaseListDto purchaseListDto) {
        return new PurchaseList(purchaseListDto.getId(), purchaseListDto.getName(), purchaseListDto.getProducts());
    }

    private final PurchaseListDetails gxszxtbevo(PurchaseListDetailsDto purchaseListDetailsDto) {
        List productsBought = purchaseListDetailsDto.getProductsBought();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(productsBought, 10));
        Iterator it = productsBought.iterator();
        while (true) {
            List hints = null;
            if (!it.hasNext()) {
                break;
            }
            PurchaseProductDto purchaseProductDto = (PurchaseProductDto) it.next();
            ProductsReferencesDto references = purchaseListDetailsDto.getReferences();
            if (references != null) {
                hints = references.getHints();
            }
            arrayList.add(lqeggnwhkg(purchaseProductDto, hints));
        }
        List<PurchaseProductDto> productsBuy = purchaseListDetailsDto.getProductsBuy();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(productsBuy, 10));
        for (PurchaseProductDto purchaseProductDto2 : productsBuy) {
            ProductsReferencesDto references2 = purchaseListDetailsDto.getReferences();
            arrayList2.add(lqeggnwhkg(purchaseProductDto2, references2 != null ? references2.getHints() : null));
        }
        return new PurchaseListDetails(purchaseListDetailsDto.getId(), purchaseListDetailsDto.getName(), purchaseListDetailsDto.getCount(), purchaseListDetailsDto.getSum(), purchaseListDetailsDto.getUrl(), arrayList, arrayList2);
    }

    private final PurchaseProduct lqeggnwhkg(PurchaseProductDto purchaseProductDto, List list) {
        List listWflxmlrfwp;
        boolean z13 = purchaseProductDto.getPrice() == 0.0d;
        MeasureTypeModel measureTypeModelPpxfxbqfkf = this.f52583iobyxmoadg.ppxfxbqfkf(purchaseProductDto.getUnits(), purchaseProductDto.getMeasure());
        String id2 = purchaseProductDto.getId();
        String article = purchaseProductDto.getArticle();
        String pic = purchaseProductDto.getPic();
        String name = purchaseProductDto.getName();
        double price = purchaseProductDto.getPrice();
        Double oldPrice = purchaseProductDto.getOldPrice();
        double quantity = purchaseProductDto.getQuantity();
        String country = purchaseProductDto.getCountry();
        String str = country == null ? "" : country;
        String region = purchaseProductDto.getRegion();
        String str2 = region == null ? "" : region;
        String countryFlagEmoji = purchaseProductDto.getCountryFlagEmoji();
        Double avgWeight = purchaseProductDto.getAvgWeight();
        Integer percent = purchaseProductDto.getPercent();
        if (list != null) {
            List hints = purchaseProductDto.getHints();
            if (hints == null) {
                hints = jyumaefscl.wflxmlrfwp();
            }
            listWflxmlrfwp = mq.iobyxmoadg.eablkybsjg(list, hints);
        } else {
            listWflxmlrfwp = null;
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        List list2 = listWflxmlrfwp;
        boolean isFavorite = purchaseProductDto.getIsFavorite();
        boolean available = purchaseProductDto.getAvailable();
        boolean availableOnlyForPickup = purchaseProductDto.getAvailableOnlyForPickup();
        boolean onlyInShop = purchaseProductDto.getOnlyInShop();
        boolean isDispPer100 = purchaseProductDto.getIsDispPer100();
        Double rating = purchaseProductDto.getRating();
        Integer reviews = purchaseProductDto.getReviews();
        int iIntValue = reviews != null ? reviews.intValue() : 0;
        Boolean hidePrice = purchaseProductDto.getHidePrice();
        return new PurchaseProduct(id2, article, name, price, oldPrice, percent, list2, hidePrice != null ? hidePrice.booleanValue() : false, isDispPer100, measureTypeModelPpxfxbqfkf, avgWeight, z13, pic, quantity, str, str2, countryFlagEmoji, isFavorite, available, availableOnlyForPickup, onlyInShop, rating, iIntValue, purchaseProductDto.getIsInPiece());
    }

    private final List ppxfxbqfkf(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(eablkybsjg((PurchaseListDto) it.next()));
        }
        return arrayList;
    }

    private final List wkgbmnqykc(PurchaseListsDto purchaseListsDto) {
        List listPpxfxbqfkf = ppxfxbqfkf(purchaseListsDto.getItems());
        return listPpxfxbqfkf == null ? jyumaefscl.wflxmlrfwp() : listPpxfxbqfkf;
    }

    public final List iobyxmoadg(PurchaseListsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return wkgbmnqykc(dto);
    }

    public final PurchaseListDetails zoijcleaow(PurchaseListDetailsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return gxszxtbevo(dto);
    }
}
