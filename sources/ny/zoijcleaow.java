package ny;

import e10.nufgyqmvbu;
import e10.wkgbmnqykc;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gy.ProductLimitEntity;
import hg.jyumaefscl;
import hg.tzroggbefp;
import hy.OrderEditProductEntity;
import hy.OrderEditUnitEntity;
import hy.OrderTotalInfoItemEntity;
import hy.eablkybsjg;
import hy.gxszxtbevo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import oy.lqeggnwhkg;
import ru.myspar.components.payment.api.models.PaymentCode;
import ru.myspar.core.domain.models.order.OrderStatus;
import ru.myspar.core.domain.models.order.OrderTotalInfoItem;
import ru.myspar.core.domain.models.order.edit.OrderEditBonuses;
import ru.myspar.core.domain.models.product.ProductLimit;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import tg.draadjrbmk;
import uy.MeasureParamsDto;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final lqeggnwhkg f71421yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ppxfxbqfkf f71422zdlpuopuiu;

    public zoijcleaow(ppxfxbqfkf orderEditEntityToDomainMapper, lqeggnwhkg measureTypeModelMapper) {
        zdlpuopuiu.btonecajqb(orderEditEntityToDomainMapper, "orderEditEntityToDomainMapper");
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        this.f71422zdlpuopuiu = orderEditEntityToDomainMapper;
        this.f71421yggfygwlhe = measureTypeModelMapper;
    }

    private final OrderEditBonuses btonecajqb(hy.iobyxmoadg iobyxmoadgVar) {
        return new OrderEditBonuses(iobyxmoadgVar.iobyxmoadg());
    }

    private final wkgbmnqykc eablkybsjg(hy.ppxfxbqfkf ppxfxbqfkfVar) {
        return new wkgbmnqykc(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.iobyxmoadg());
    }

    private final OrderTotalInfoItem gtknphoqwx(OrderTotalInfoItemEntity orderTotalInfoItemEntity) {
        return new OrderTotalInfoItem(orderTotalInfoItemEntity.getTitle(), orderTotalInfoItemEntity.getValue(), orderTotalInfoItemEntity.getTooltip());
    }

    private final e10.lqeggnwhkg gxszxtbevo(eablkybsjg eablkybsjgVar) {
        return new e10.lqeggnwhkg(eablkybsjgVar.zoijcleaow(), eablkybsjgVar.ppxfxbqfkf());
    }

    private final nufgyqmvbu lqeggnwhkg(gxszxtbevo gxszxtbevoVar) {
        return new nufgyqmvbu(gxszxtbevoVar.iobyxmoadg(), gxszxtbevoVar.lqeggnwhkg(), gxszxtbevoVar.nufgyqmvbu(), gxszxtbevoVar.dxjokdxxww(), gxszxtbevoVar.gxszxtbevo(), gxszxtbevoVar.ppxfxbqfkf(), gxszxtbevoVar.wkgbmnqykc(), gxszxtbevoVar.zoijcleaow(), py.nufgyqmvbu.zoijcleaow(gxszxtbevoVar.eablkybsjg()));
    }

    private final e10.ppxfxbqfkf ppxfxbqfkf(hy.lqeggnwhkg lqeggnwhkgVar) {
        return new e10.ppxfxbqfkf(lqeggnwhkgVar.iobyxmoadg(), lqeggnwhkgVar.eablkybsjg(), lqeggnwhkgVar.ppxfxbqfkf(), lqeggnwhkgVar.lqeggnwhkg(), lqeggnwhkgVar.dxjokdxxww(), lqeggnwhkgVar.nufgyqmvbu(), lqeggnwhkgVar.zoijcleaow(), lqeggnwhkgVar.gxszxtbevo(), lqeggnwhkgVar.wkgbmnqykc());
    }

    private final Map wflxmlrfwp(List list) {
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
    public e10.iobyxmoadg invoke(hy.zoijcleaow entity) {
        ArrayList arrayList;
        zdlpuopuiu.btonecajqb(entity, "entity");
        String strValueOf = String.valueOf(entity.gxszxtbevo());
        wkgbmnqykc wkgbmnqykcVarEablkybsjg = eablkybsjg(entity.lqeggnwhkg());
        OrderStatus orderStatusNufgyqmvbu = entity.nufgyqmvbu();
        String strWflxmlrfwp = entity.wflxmlrfwp();
        DeliveryCode deliveryCodeIobyxmoadg = DeliveryCode.INSTANCE.iobyxmoadg(entity.ppxfxbqfkf());
        String strWkgbmnqykc = entity.wkgbmnqykc();
        e10.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = gxszxtbevo(entity.gtknphoqwx());
        PaymentCode paymentCodeIobyxmoadg = PaymentCode.INSTANCE.iobyxmoadg(entity.dxjokdxxww());
        nufgyqmvbu nufgyqmvbuVarLqeggnwhkg = lqeggnwhkg(entity.draadjrbmk());
        List listIobyxmoadg = entity.iobyxmoadg();
        ppxfxbqfkf ppxfxbqfkfVar = this.f71422zdlpuopuiu;
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        Iterator it = listIobyxmoadg.iterator();
        while (it.hasNext()) {
            arrayList2.add(ppxfxbqfkfVar.invoke(it.next()));
        }
        e10.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = ppxfxbqfkf(entity.agtfadlqog());
        hy.iobyxmoadg iobyxmoadgVarZoijcleaow = entity.zoijcleaow();
        OrderEditBonuses orderEditBonusesBtonecajqb = iobyxmoadgVarZoijcleaow != null ? btonecajqb(iobyxmoadgVarZoijcleaow) : null;
        String strEablkybsjg = entity.eablkybsjg();
        List listOjitshcjhn = entity.ojitshcjhn();
        if (listOjitshcjhn != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listOjitshcjhn, 10));
            Iterator it2 = listOjitshcjhn.iterator();
            while (it2.hasNext()) {
                arrayList.add(gtknphoqwx((OrderTotalInfoItemEntity) it2.next()));
            }
        } else {
            arrayList = null;
        }
        List listWflxmlrfwp = arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList;
        List listBtonecajqb = entity.btonecajqb();
        List listZoijcleaow = listBtonecajqb != null ? dw.iobyxmoadg.zoijcleaow(listBtonecajqb) : null;
        return new e10.iobyxmoadg(strValueOf, null, orderStatusNufgyqmvbu, strWflxmlrfwp, strWkgbmnqykc, paymentCodeIobyxmoadg, nufgyqmvbuVarLqeggnwhkg, ppxfxbqfkfVarPpxfxbqfkf, deliveryCodeIobyxmoadg, lqeggnwhkgVarGxszxtbevo, wkgbmnqykcVarEablkybsjg, arrayList2, null, orderEditBonusesBtonecajqb, strEablkybsjg, listWflxmlrfwp, listZoijcleaow == null ? jyumaefscl.wflxmlrfwp() : listZoijcleaow, 4098, null);
    }

    public final List zoijcleaow(hy.zoijcleaow zoijcleaowVar) {
        List<OrderEditProductEntity> listIobyxmoadg;
        ArrayList arrayList;
        if (zoijcleaowVar == null || (listIobyxmoadg = zoijcleaowVar.iobyxmoadg()) == null) {
            return jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        for (OrderEditProductEntity orderEditProductEntity : listIobyxmoadg) {
            String id2 = orderEditProductEntity.getId();
            String article = orderEditProductEntity.getArticle();
            double quantity = orderEditProductEntity.getQuantity();
            MeasureType currentMeasure = this.f71421yggfygwlhe.ppxfxbqfkf(wflxmlrfwp(orderEditProductEntity.getUnits()), orderEditProductEntity.getMeasure()).getCurrentMeasure();
            List<ProductLimitEntity> limits = orderEditProductEntity.getLimits();
            if (limits != null) {
                arrayList = new ArrayList(jyumaefscl.cqumvgiudr(limits, 10));
                for (ProductLimitEntity productLimitEntity : limits) {
                    arrayList.add(new ProductLimit(productLimitEntity.getMeasureType(), productLimitEntity.getQuantity()));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new u00.iobyxmoadg(id2, article, quantity, currentMeasure, arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList));
        }
        return arrayList2;
    }
}
