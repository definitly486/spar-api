package kx0;

import cy0.AddProductListToCartResponseDto;
import cy0.AddToBasketInfoDto;
import cy0.BasketOrderDto;
import cy0.ChangeBasketInfoDto;
import cy0.ChangeBasketLimitDto;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.Warning;
import tx0.CartProductDto;
import tx0.CartReferencesDto;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg f60797iobyxmoadg;

    public zoijcleaow(eablkybsjg cartProductDtoToDomainModelMapper) {
        zdlpuopuiu.btonecajqb(cartProductDtoToDomainModelMapper, "cartProductDtoToDomainModelMapper");
        this.f60797iobyxmoadg = cartProductDtoToDomainModelMapper;
    }

    public final kz0.iobyxmoadg iobyxmoadg(AddProductListToCartResponseDto addProductListToCartResponseDto, Warning warning) {
        zdlpuopuiu.btonecajqb(addProductListToCartResponseDto, "addProductListToCartResponseDto");
        zdlpuopuiu.btonecajqb(warning, "warning");
        CartReferencesDto refs = addProductListToCartResponseDto.getRefs();
        List items = addProductListToCartResponseDto.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f60797iobyxmoadg.invoke((CartProductDto) it.next(), refs != null ? refs.getHints() : null));
        }
        return new kz0.iobyxmoadg(arrayList, warning);
    }

    public final kz0.wkgbmnqykc ppxfxbqfkf(BasketOrderDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        String id2 = dto.getId();
        if (id2 == null) {
            id2 = "";
        }
        Boolean isNeedPassport = dto.getIsNeedPassport();
        return new kz0.wkgbmnqykc(id2, isNeedPassport != null ? isNeedPassport.booleanValue() : false, dto.getIsWalletPayNeedVerify(), dto.getInfoText());
    }

    public final kz0.gxszxtbevo wkgbmnqykc(ChangeBasketInfoDto changeBasketInfoDto, List warningList) {
        List arrayList;
        zdlpuopuiu.btonecajqb(changeBasketInfoDto, "changeBasketInfoDto");
        zdlpuopuiu.btonecajqb(warningList, "warningList");
        CartReferencesDto refs = changeBasketInfoDto.getRefs();
        List items = changeBasketInfoDto.getItems();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (true) {
            arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            CartProductDto cartProductDto = (CartProductDto) it.next();
            eablkybsjg eablkybsjgVar = this.f60797iobyxmoadg;
            if (refs != null) {
                arrayList = refs.getHints();
            }
            arrayList2.add(eablkybsjgVar.invoke(cartProductDto, arrayList));
        }
        double sum = changeBasketInfoDto.getSum().getSum();
        List limitProducts = changeBasketInfoDto.getLimitProducts();
        if (limitProducts != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(limitProducts, 10));
            Iterator it2 = limitProducts.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ChangeBasketLimitDto) it2.next()).getId());
            }
        }
        return new kz0.gxszxtbevo(arrayList2, sum, warningList, arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList);
    }

    public final kz0.ppxfxbqfkf zoijcleaow(AddToBasketInfoDto addToBasketInfoDto, Warning warning) {
        zdlpuopuiu.btonecajqb(addToBasketInfoDto, "addToBasketInfoDto");
        zdlpuopuiu.btonecajqb(warning, "warning");
        CartReferencesDto refs = addToBasketInfoDto.getRefs();
        return new kz0.ppxfxbqfkf(this.f60797iobyxmoadg.invoke(addToBasketInfoDto.getItem(), refs != null ? refs.getHints() : null), addToBasketInfoDto.getSum().getSum(), warning instanceof Warning.DailyLimit ? (Warning.DailyLimit) warning : null);
    }
}
