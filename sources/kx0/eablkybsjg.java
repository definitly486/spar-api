package kx0;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.cart.CartProduct;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import tg.rgvfuqvkyq;
import tx0.CartProductDto;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg implements rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final jx0.nufgyqmvbu f60794yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final jx0.lqeggnwhkg f60795zdlpuopuiu;

    public eablkybsjg(jx0.lqeggnwhkg measureTypeModelMapper, jx0.nufgyqmvbu productLimitMapper) {
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        zdlpuopuiu.btonecajqb(productLimitMapper, "productLimitMapper");
        this.f60795zdlpuopuiu = measureTypeModelMapper;
        this.f60794yggfygwlhe = productLimitMapper;
    }

    @Override // tg.rgvfuqvkyq
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public CartProduct invoke(CartProductDto dto, List list) {
        List listWflxmlrfwp;
        zdlpuopuiu.btonecajqb(dto, "dto");
        MeasureTypeModel measureTypeModelPpxfxbqfkf = this.f60795zdlpuopuiu.ppxfxbqfkf(dto.getUnits(), dto.getMeasure());
        String id2 = dto.getId();
        String article = dto.getArticle();
        String pic = dto.getPic();
        String name = dto.getName();
        double price = dto.getPrice();
        Double oldPrice = dto.getOldPrice();
        double quantity = dto.getQuantity();
        Double avgWeight = dto.getAvgWeight();
        Integer percent = dto.getPercent();
        int iIntValue = percent != null ? percent.intValue() : 0;
        if (list != null) {
            List hints = dto.getHints();
            if (hints == null) {
                hints = jyumaefscl.wflxmlrfwp();
            }
            listWflxmlrfwp = yo0.iobyxmoadg.eablkybsjg(list, hints);
        } else {
            listWflxmlrfwp = null;
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        List list2 = listWflxmlrfwp;
        double weight = dto.getWeight();
        Double rating = dto.getRating();
        Integer reviews = dto.getReviews();
        int iIntValue2 = reviews != null ? reviews.intValue() : 0;
        String country = dto.getCountry();
        String str = country == null ? "" : country;
        String region = dto.getRegion();
        String str2 = region == null ? "" : region;
        String countryFlagEmoji = dto.getCountryFlagEmoji();
        Boolean isFavorite = dto.getIsFavorite();
        boolean zBooleanValue = isFavorite != null ? isFavorite.booleanValue() : false;
        boolean isDispPer100 = dto.getIsDispPer100();
        boolean isDailyLimit = dto.getIsDailyLimit();
        List listInvoke = this.f60794yggfygwlhe.invoke(dto.getLimits(), measureTypeModelPpxfxbqfkf);
        boolean isAvailable = dto.getIsAvailable();
        String unavailableReason = dto.getUnavailableReason();
        return new CartProduct(id2, article, name, price, oldPrice, iIntValue, list2, weight, avgWeight, pic, quantity, rating, iIntValue2, str, str2, countryFlagEmoji, zBooleanValue, isDispPer100, isDailyLimit, measureTypeModelPpxfxbqfkf, listInvoke, isAvailable, unavailableReason == null ? "" : unavailableReason);
    }
}
