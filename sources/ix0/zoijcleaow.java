package ix0;

import bx0.ProductLimitEntity;
import cx0.OrderEditProductEntity;
import cx0.OrderEditUnitEntity;
import cx0.OrderTotalInfoItemEntity;
import cx0.eablkybsjg;
import cx0.gxszxtbevo;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jx0.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import px0.MeasureParamsDto;
import ru.myspar.proloyalty.components.payment.api.models.PaymentCode;
import ru.myspar.proloyalty.core.domain.models.order.OrderStatus;
import ru.myspar.proloyalty.core.domain.models.order.OrderTotalInfoItem;
import ru.myspar.proloyalty.core.domain.models.order.edit.OrderEditBonuses;
import ru.myspar.proloyalty.core.domain.models.product.ProductLimit;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import tg.draadjrbmk;
import uz0.nufgyqmvbu;
import uz0.wkgbmnqykc;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final lqeggnwhkg f49967yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ppxfxbqfkf f49968zdlpuopuiu;

    public zoijcleaow(ppxfxbqfkf orderEditEntityToDomainMapper, lqeggnwhkg measureTypeModelMapper) {
        zdlpuopuiu.btonecajqb(orderEditEntityToDomainMapper, "orderEditEntityToDomainMapper");
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        this.f49968zdlpuopuiu = orderEditEntityToDomainMapper;
        this.f49967yggfygwlhe = measureTypeModelMapper;
    }

    private final nufgyqmvbu btonecajqb(gxszxtbevo gxszxtbevoVar) {
        return new nufgyqmvbu(gxszxtbevoVar.iobyxmoadg(), gxszxtbevoVar.lqeggnwhkg(), gxszxtbevoVar.nufgyqmvbu(), gxszxtbevoVar.dxjokdxxww(), gxszxtbevoVar.gxszxtbevo(), gxszxtbevoVar.ppxfxbqfkf(), gxszxtbevoVar.wkgbmnqykc(), gxszxtbevoVar.zoijcleaow(), kx0.nufgyqmvbu.zoijcleaow(gxszxtbevoVar.eablkybsjg()));
    }

    private final uz0.ppxfxbqfkf eablkybsjg(cx0.lqeggnwhkg lqeggnwhkgVar) {
        return new uz0.ppxfxbqfkf(lqeggnwhkgVar.iobyxmoadg(), lqeggnwhkgVar.eablkybsjg(), lqeggnwhkgVar.ppxfxbqfkf(), lqeggnwhkgVar.lqeggnwhkg(), lqeggnwhkgVar.dxjokdxxww(), lqeggnwhkgVar.nufgyqmvbu(), lqeggnwhkgVar.zoijcleaow(), lqeggnwhkgVar.gxszxtbevo(), lqeggnwhkgVar.wkgbmnqykc());
    }

    private final OrderTotalInfoItem gtknphoqwx(OrderTotalInfoItemEntity orderTotalInfoItemEntity) {
        return new OrderTotalInfoItem(orderTotalInfoItemEntity.getTitle(), orderTotalInfoItemEntity.getValue(), orderTotalInfoItemEntity.getTooltip());
    }

    private final wkgbmnqykc gxszxtbevo(cx0.ppxfxbqfkf ppxfxbqfkfVar) {
        return new wkgbmnqykc(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.iobyxmoadg());
    }

    private final uz0.lqeggnwhkg lqeggnwhkg(eablkybsjg eablkybsjgVar) {
        return new uz0.lqeggnwhkg(eablkybsjgVar.zoijcleaow(), eablkybsjgVar.ppxfxbqfkf());
    }

    private final OrderEditBonuses ppxfxbqfkf(cx0.iobyxmoadg iobyxmoadgVar) {
        return new OrderEditBonuses(iobyxmoadgVar.iobyxmoadg());
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
    public uz0.iobyxmoadg invoke(cx0.zoijcleaow entity) {
        ArrayList arrayList;
        zdlpuopuiu.btonecajqb(entity, "entity");
        String strValueOf = String.valueOf(entity.gxszxtbevo());
        wkgbmnqykc wkgbmnqykcVarGxszxtbevo = gxszxtbevo(entity.lqeggnwhkg());
        OrderStatus orderStatusNufgyqmvbu = entity.nufgyqmvbu();
        String strWflxmlrfwp = entity.wflxmlrfwp();
        DeliveryCode deliveryCodeIobyxmoadg = DeliveryCode.INSTANCE.iobyxmoadg(entity.ppxfxbqfkf());
        String strWkgbmnqykc = entity.wkgbmnqykc();
        uz0.lqeggnwhkg lqeggnwhkgVarLqeggnwhkg = lqeggnwhkg(entity.gtknphoqwx());
        PaymentCode paymentCodeIobyxmoadg = PaymentCode.INSTANCE.iobyxmoadg(entity.dxjokdxxww());
        nufgyqmvbu nufgyqmvbuVarBtonecajqb = btonecajqb(entity.draadjrbmk());
        List listIobyxmoadg = entity.iobyxmoadg();
        ppxfxbqfkf ppxfxbqfkfVar = this.f49968zdlpuopuiu;
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        Iterator it = listIobyxmoadg.iterator();
        while (it.hasNext()) {
            arrayList2.add(ppxfxbqfkfVar.invoke(it.next()));
        }
        uz0.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = eablkybsjg(entity.agtfadlqog());
        cx0.iobyxmoadg iobyxmoadgVarZoijcleaow = entity.zoijcleaow();
        OrderEditBonuses orderEditBonusesPpxfxbqfkf = iobyxmoadgVarZoijcleaow != null ? ppxfxbqfkf(iobyxmoadgVarZoijcleaow) : null;
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
        List listZoijcleaow = listBtonecajqb != null ? xu0.iobyxmoadg.zoijcleaow(listBtonecajqb) : null;
        return new uz0.iobyxmoadg(strValueOf, null, orderStatusNufgyqmvbu, strWflxmlrfwp, strWkgbmnqykc, paymentCodeIobyxmoadg, nufgyqmvbuVarBtonecajqb, ppxfxbqfkfVarEablkybsjg, deliveryCodeIobyxmoadg, lqeggnwhkgVarLqeggnwhkg, wkgbmnqykcVarGxszxtbevo, arrayList2, null, orderEditBonusesPpxfxbqfkf, strEablkybsjg, listWflxmlrfwp, listZoijcleaow == null ? jyumaefscl.wflxmlrfwp() : listZoijcleaow, 4098, null);
    }

    public final List zoijcleaow(cx0.zoijcleaow zoijcleaowVar) {
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
            MeasureType currentMeasure = this.f49967yggfygwlhe.ppxfxbqfkf(wflxmlrfwp(orderEditProductEntity.getUnits()), orderEditProductEntity.getMeasure()).getCurrentMeasure();
            List<ProductLimitEntity> limits = orderEditProductEntity.getLimits();
            if (limits != null) {
                arrayList = new ArrayList(jyumaefscl.cqumvgiudr(limits, 10));
                for (ProductLimitEntity productLimitEntity : limits) {
                    arrayList.add(new ProductLimit(productLimitEntity.getMeasureType(), productLimitEntity.getQuantity()));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new lz0.iobyxmoadg(id2, article, quantity, currentMeasure, arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList));
        }
        return arrayList2;
    }
}
