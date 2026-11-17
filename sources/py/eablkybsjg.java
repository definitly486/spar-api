package py;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.cart.AvailableInterval;
import ru.myspar.core.domain.models.cart.CartProduct;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import tg.rgvfuqvkyq;
import uy.AvailableIntervalDto;
import zy.CartProductDto;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg implements rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final oy.nufgyqmvbu f77459yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final oy.lqeggnwhkg f77460zdlpuopuiu;

    public eablkybsjg(oy.lqeggnwhkg measureTypeModelMapper, oy.nufgyqmvbu productLimitMapper) {
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        zdlpuopuiu.btonecajqb(productLimitMapper, "productLimitMapper");
        this.f77460zdlpuopuiu = measureTypeModelMapper;
        this.f77459yggfygwlhe = productLimitMapper;
    }

    private final AvailableInterval ppxfxbqfkf(AvailableIntervalDto availableIntervalDto) {
        return new AvailableInterval(availableIntervalDto.getFrom(), availableIntervalDto.getTo());
    }

    private final t00.nufgyqmvbu zoijcleaow(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -733902135) {
                if (iHashCode != -665462704) {
                    if (iHashCode == 190847958 && str.equals("interval_unavailable")) {
                        return t00.nufgyqmvbu.INTERVAL_UNAVAILABLE;
                    }
                } else if (str.equals("unavailable")) {
                    return t00.nufgyqmvbu.UNAVAILABLE;
                }
            } else if (str.equals("available")) {
                return t00.nufgyqmvbu.AVAILABLE;
            }
        }
        return t00.nufgyqmvbu.UNKNOWN;
    }

    @Override // tg.rgvfuqvkyq
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public CartProduct invoke(CartProductDto dto, List list) {
        List listWflxmlrfwp;
        zdlpuopuiu.btonecajqb(dto, "dto");
        MeasureTypeModel measureTypeModelPpxfxbqfkf = this.f77460zdlpuopuiu.ppxfxbqfkf(dto.getUnits(), dto.getMeasure());
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
            listWflxmlrfwp = mq.iobyxmoadg.eablkybsjg(list, hints);
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
        t00.nufgyqmvbu nufgyqmvbuVarZoijcleaow = zoijcleaow(dto.getAvailability());
        boolean isDispPer100 = dto.getIsDispPer100();
        boolean isDailyLimit = dto.getIsDailyLimit();
        AvailableIntervalDto availableInterval = dto.getAvailableInterval();
        return new CartProduct(id2, article, nufgyqmvbuVarZoijcleaow, name, price, oldPrice, iIntValue, list2, weight, avgWeight, pic, quantity, rating, iIntValue2, str, str2, countryFlagEmoji, zBooleanValue, isDispPer100, isDailyLimit, availableInterval != null ? ppxfxbqfkf(availableInterval) : null, measureTypeModelPpxfxbqfkf, this.f77459yggfygwlhe.invoke(dto.getLimits(), measureTypeModelPpxfxbqfkf));
    }
}
