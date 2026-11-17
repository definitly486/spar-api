package ny;

import e10.eablkybsjg;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gy.ProductLimitEntity;
import hg.jyumaefscl;
import hg.tzroggbefp;
import hy.OrderEditProductEntity;
import hy.OrderEditUnitEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import oy.lqeggnwhkg;
import ru.myspar.core.domain.models.product.ProductLimit;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import tg.draadjrbmk;
import uy.MeasureParamsDto;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lqeggnwhkg f71420zdlpuopuiu;

    public ppxfxbqfkf(lqeggnwhkg measureTypeModelMapper) {
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        this.f71420zdlpuopuiu = measureTypeModelMapper;
    }

    private final Map zoijcleaow(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(jyumaefscl.cqumvgiudr(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OrderEditUnitEntity orderEditUnitEntity = (OrderEditUnitEntity) it.next();
            vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(orderEditUnitEntity.getKey(), new MeasureParamsDto(Double.valueOf(orderEditUnitEntity.getBasketDefault()), Double.valueOf(orderEditUnitEntity.getMinAvailable()), Double.valueOf(orderEditUnitEntity.getRatio())));
            linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }
        return linkedHashMap;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public eablkybsjg invoke(OrderEditProductEntity entity) {
        int i13;
        String str;
        String str2;
        ArrayList arrayList;
        zdlpuopuiu.btonecajqb(entity, "entity");
        String id2 = entity.getId();
        String article = entity.getArticle();
        boolean isAvailable = entity.getIsAvailable();
        String name = entity.getName();
        double price = entity.getPrice();
        Double oldPrice = entity.getOldPrice();
        int percent = entity.getPercent();
        List listNufgyqmvbu = mq.iobyxmoadg.nufgyqmvbu(entity.getHints());
        Double rating = entity.getRating();
        int reviewsCount = entity.getReviewsCount();
        String country = entity.getCountry();
        String region = entity.getRegion();
        String countryFlagEmoji = entity.getCountryFlagEmoji();
        double weight = entity.getWeight();
        boolean isDispPer100 = entity.getIsDispPer100();
        Double avgWeight = entity.getAvgWeight();
        String pic = entity.getPic();
        double quantity = entity.getQuantity();
        boolean isFavorite = entity.getIsFavorite();
        MeasureTypeModel measureTypeModelPpxfxbqfkf = this.f71420zdlpuopuiu.ppxfxbqfkf(zoijcleaow(entity.getUnits()), entity.getMeasure());
        List limits = entity.getLimits();
        if (limits != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(limits, 10));
            Iterator it = limits.iterator();
            while (it.hasNext()) {
                ProductLimitEntity productLimitEntity = (ProductLimitEntity) it.next();
                arrayList.add(new ProductLimit(productLimitEntity.getMeasureType(), productLimitEntity.getQuantity()));
                it = it;
                region = region;
                reviewsCount = reviewsCount;
                country = country;
            }
            i13 = reviewsCount;
            str = country;
            str2 = region;
        } else {
            i13 = reviewsCount;
            str = country;
            str2 = region;
            arrayList = null;
        }
        return new eablkybsjg(id2, article, isAvailable, name, price, oldPrice, percent, listNufgyqmvbu, rating, i13, str, str2, countryFlagEmoji, weight, isDispPer100, measureTypeModelPpxfxbqfkf, avgWeight, pic, quantity, isFavorite, arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList);
    }
}
