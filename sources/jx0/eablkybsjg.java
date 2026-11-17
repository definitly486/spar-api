package jx0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ly0.ProductDto;
import ly0.ProductsReferencesDto;
import px0.StickerDto;
import ru.myspar.proloyalty.core.domain.models.searchquery.HistoryItemModel;
import ru.myspar.proloyalty.core.domain.models.searchquery.SearchHistoryModel;
import ry0.HistoryListDto;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gx0.wkgbmnqykc f52481iobyxmoadg;

    public eablkybsjg(gx0.wkgbmnqykc productDtoToDomainMapper) {
        zdlpuopuiu.btonecajqb(productDtoToDomainMapper, "productDtoToDomainMapper");
        this.f52481iobyxmoadg = productDtoToDomainMapper;
    }

    public final SearchHistoryModel iobyxmoadg(HistoryListDto dto) {
        ArrayList arrayList;
        List stickers;
        zdlpuopuiu.btonecajqb(dto, "dto");
        List items = dto.getItems();
        if (items == null) {
            items = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList2.add(new HistoryItemModel((String) it.next()));
        }
        List<ProductDto> recommendations = dto.getRecommendations();
        List listWflxmlrfwp = null;
        if (recommendations != null) {
            ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(recommendations, 10));
            for (ProductDto productDto : recommendations) {
                ProductsReferencesDto references = dto.getReferences();
                if (references == null || (stickers = references.getStickers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (Object obj : stickers) {
                        if (productDto.getProductPropertyNames().contains(((StickerDto) obj).getName())) {
                            arrayList.add(obj);
                        }
                    }
                }
                arrayList3.add(this.f52481iobyxmoadg.ppxfxbqfkf(productDto.zoijcleaow(((-134217729) & 1) != 0 ? productDto.id : null, ((-134217729) & 2) != 0 ? productDto.article : null, ((-134217729) & 4) != 0 ? productDto.name : null, ((-134217729) & 8) != 0 ? productDto.price : null, ((-134217729) & 16) != 0 ? productDto.oldPrice : null, ((-134217729) & 32) != 0 ? productDto.discount : null, ((-134217729) & 64) != 0 ? productDto.isDispPer100 : false, ((-134217729) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productDto.units : null, ((-134217729) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productDto.avgWeight : null, ((-134217729) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productDto.isFavorite : false, ((-134217729) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productDto.isAvailable : false, ((-134217729) & 2048) != 0 ? productDto.productPropertyNames : null, ((-134217729) & 4096) != 0 ? productDto.photoUrl : null, ((-134217729) & 8192) != 0 ? productDto.photoUrls : null, ((-134217729) & 16384) != 0 ? productDto.energy : null, ((-134217729) & 32768) != 0 ? productDto.fats : null, ((-134217729) & 65536) != 0 ? productDto.carbs : null, ((-134217729) & 131072) != 0 ? productDto.protein : null, ((-134217729) & 262144) != 0 ? productDto.params : null, ((-134217729) & 524288) != 0 ? productDto.description : null, ((-134217729) & 1048576) != 0 ? productDto.chemical : null, ((-134217729) & 2097152) != 0 ? productDto.hint : null, ((-134217729) & 4194304) != 0 ? productDto.hidePrice : null, ((-134217729) & 8388608) != 0 ? productDto.rating : null, ((-134217729) & 16777216) != 0 ? productDto.reviews : null, ((-134217729) & 33554432) != 0 ? productDto.isPmProduct : null, ((-134217729) & 67108864) != 0 ? productDto.video : null, ((-134217729) & 134217728) != 0 ? productDto.productProperties : arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList, ((-134217729) & 268435456) != 0 ? productDto.country : null, ((-134217729) & 536870912) != 0 ? productDto.region : null, ((-134217729) & 1073741824) != 0 ? productDto.countryFlagIcon : null, ((-134217729) & Integer.MIN_VALUE) != 0 ? productDto.countryFlagEmoji : null, (8191 & 1) != 0 ? productDto.type : null, (8191 & 2) != 0 ? productDto.kind : null, (8191 & 4) != 0 ? productDto.grape : null, (8191 & 8) != 0 ? productDto.standart : null, (8191 & 16) != 0 ? productDto.countryMapIcon : null, (8191 & 32) != 0 ? productDto.tasting : null, (8191 & 64) != 0 ? productDto.styling : null, (8191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productDto.button : null, (8191 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productDto.limits : null, (8191 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productDto.vivino : null, (8191 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productDto.productVariants : null, (8191 & 2048) != 0 ? productDto.quantity : null, (8191 & 4096) != 0 ? productDto.declarations : null), dto.getReferences(), null));
            }
            listWflxmlrfwp = arrayList3;
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        return new SearchHistoryModel(arrayList2, listWflxmlrfwp);
    }
}
