package py;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import kz.AddProductListToCartResponseDto;
import kz.AddToBasketInfoDto;
import kz.BasketOrderDto;
import kz.ChangeBasketInfoDto;
import kz.ChangeBasketLimitDto;
import ru.myspar.core.models.Warning;
import zy.CartProductDto;
import zy.CartReferencesDto;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg f77462iobyxmoadg;

    public zoijcleaow(eablkybsjg cartProductDtoToDomainModelMapper) {
        zdlpuopuiu.btonecajqb(cartProductDtoToDomainModelMapper, "cartProductDtoToDomainModelMapper");
        this.f77462iobyxmoadg = cartProductDtoToDomainModelMapper;
    }

    public final t00.iobyxmoadg iobyxmoadg(AddProductListToCartResponseDto addProductListToCartResponseDto, Warning warning) {
        zdlpuopuiu.btonecajqb(addProductListToCartResponseDto, "addProductListToCartResponseDto");
        zdlpuopuiu.btonecajqb(warning, "warning");
        CartReferencesDto refs = addProductListToCartResponseDto.getRefs();
        List items = addProductListToCartResponseDto.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f77462iobyxmoadg.invoke((CartProductDto) it.next(), refs != null ? refs.getHints() : null));
        }
        return new t00.iobyxmoadg(arrayList, warning);
    }

    public final t00.wkgbmnqykc ppxfxbqfkf(BasketOrderDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        String id2 = dto.getId();
        if (id2 == null) {
            id2 = "";
        }
        Boolean isNeedPassport = dto.getIsNeedPassport();
        return new t00.wkgbmnqykc(id2, isNeedPassport != null ? isNeedPassport.booleanValue() : false, dto.getIsWalletPayNeedVerify(), dto.getInfoText());
    }

    public final t00.gxszxtbevo wkgbmnqykc(ChangeBasketInfoDto changeBasketInfoDto, List warningList) {
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
            eablkybsjg eablkybsjgVar = this.f77462iobyxmoadg;
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
        return new t00.gxszxtbevo(arrayList2, sum, warningList, arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList);
    }

    public final t00.ppxfxbqfkf zoijcleaow(AddToBasketInfoDto addToBasketInfoDto, Warning warning) {
        zdlpuopuiu.btonecajqb(addToBasketInfoDto, "addToBasketInfoDto");
        zdlpuopuiu.btonecajqb(warning, "warning");
        CartReferencesDto refs = addToBasketInfoDto.getRefs();
        return new t00.ppxfxbqfkf(this.f77462iobyxmoadg.invoke(addToBasketInfoDto.getItem(), refs != null ? refs.getHints() : null), addToBasketInfoDto.getSum().getSum(), warning instanceof Warning.DailyLimit ? (Warning.DailyLimit) warning : null);
    }
}
