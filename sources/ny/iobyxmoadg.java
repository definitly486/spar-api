package ny;

import e10.lqeggnwhkg;
import e10.nufgyqmvbu;
import e10.wkgbmnqykc;
import gy.ProductLimitEntity;
import hg.jyumaefscl;
import hy.OrderEditProductEntity;
import hy.OrderEditUnitEntity;
import hy.OrderTotalInfoItemEntity;
import hy.eablkybsjg;
import hy.gxszxtbevo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.order.OrderStatus;
import ru.myspar.core.domain.models.order.OrderTotalInfoItem;
import ru.myspar.core.domain.models.order.edit.OrderEditBonuses;
import ru.myspar.core.domain.models.product.ProductLimit;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    private static final OrderTotalInfoItemEntity dxjokdxxww(OrderTotalInfoItem orderTotalInfoItem) {
        return new OrderTotalInfoItemEntity(orderTotalInfoItem.getTitle(), orderTotalInfoItem.getValue(), orderTotalInfoItem.getTooltip());
    }

    private static final hy.ppxfxbqfkf eablkybsjg(wkgbmnqykc wkgbmnqykcVar) {
        return new hy.ppxfxbqfkf(wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.iobyxmoadg());
    }

    private static final eablkybsjg gxszxtbevo(lqeggnwhkg lqeggnwhkgVar) {
        return new eablkybsjg(lqeggnwhkgVar.ppxfxbqfkf(), 0.0d, lqeggnwhkgVar.wkgbmnqykc(), 2, null);
    }

    private static final List iobyxmoadg(List list) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e10.eablkybsjg eablkybsjgVar = (e10.eablkybsjg) it.next();
            List<MeasureType> units = eablkybsjgVar.btonecajqb().getUnits();
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(units, 10));
            for (MeasureType measureType : units) {
                arrayList2.add(new OrderEditUnitEntity(measureType.getValue(), measureType.getMinAvailable(), measureType.getRatio(), measureType.getBasketDefault()));
            }
            arrayList.add(new OrderEditProductEntity(eablkybsjgVar.nufgyqmvbu(), eablkybsjgVar.ppxfxbqfkf(), eablkybsjgVar.yggfygwlhe(), eablkybsjgVar.gtknphoqwx(), eablkybsjgVar.ojitshcjhn(), eablkybsjgVar.draadjrbmk(), eablkybsjgVar.wflxmlrfwp(), eablkybsjgVar.vdvldrhtss(), eablkybsjgVar.kcexrzcfyt(), eablkybsjgVar.eablkybsjg(), eablkybsjgVar.oxmwwwfdhm(), eablkybsjgVar.gxszxtbevo(), eablkybsjgVar.btonecajqb().getCurrentMeasure().getValue(), eablkybsjgVar.zdlpuopuiu(), eablkybsjgVar.jyumaefscl(), arrayList2, eablkybsjgVar.wkgbmnqykc(), eablkybsjgVar.agtfadlqog(), eablkybsjgVar.rgvfuqvkyq(), eablkybsjgVar.iwizpuwonk(), eablkybsjgVar.dxjokdxxww().isEmpty() ? null : zoijcleaow(eablkybsjgVar.dxjokdxxww()), mq.iobyxmoadg.btonecajqb(eablkybsjgVar.lqeggnwhkg())));
        }
        return arrayList;
    }

    private static final gxszxtbevo lqeggnwhkg(nufgyqmvbu nufgyqmvbuVar) {
        return new gxszxtbevo(nufgyqmvbuVar.ppxfxbqfkf(), nufgyqmvbuVar.dxjokdxxww(), nufgyqmvbuVar.btonecajqb(), nufgyqmvbuVar.gtknphoqwx(), nufgyqmvbuVar.nufgyqmvbu(), nufgyqmvbuVar.gxszxtbevo(), nufgyqmvbuVar.lqeggnwhkg(), nufgyqmvbuVar.wkgbmnqykc(), py.nufgyqmvbu.ppxfxbqfkf(nufgyqmvbuVar.eablkybsjg()));
    }

    private static final hy.lqeggnwhkg nufgyqmvbu(e10.ppxfxbqfkf ppxfxbqfkfVar) {
        return new hy.lqeggnwhkg(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.eablkybsjg(), ppxfxbqfkfVar.ppxfxbqfkf(), ppxfxbqfkfVar.lqeggnwhkg(), ppxfxbqfkfVar.dxjokdxxww(), ppxfxbqfkfVar.nufgyqmvbu(), ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.gxszxtbevo(), ppxfxbqfkfVar.wkgbmnqykc());
    }

    private static final hy.iobyxmoadg ppxfxbqfkf(OrderEditBonuses orderEditBonuses) {
        return new hy.iobyxmoadg(orderEditBonuses.getApplied());
    }

    public static final hy.zoijcleaow wkgbmnqykc(e10.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        long j13 = Long.parseLong(iobyxmoadgVar.nufgyqmvbu());
        hy.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = eablkybsjg(iobyxmoadgVar.dxjokdxxww());
        OrderStatus orderStatusBtonecajqb = iobyxmoadgVar.btonecajqb();
        String strOjitshcjhn = iobyxmoadgVar.ojitshcjhn();
        if (strOjitshcjhn == null) {
            strOjitshcjhn = "";
        }
        DeliveryCode deliveryCodeEablkybsjg = iobyxmoadgVar.eablkybsjg();
        String serverCode = deliveryCodeEablkybsjg != null ? deliveryCodeEablkybsjg.getServerCode() : null;
        String strGxszxtbevo = iobyxmoadgVar.gxszxtbevo();
        if (strGxszxtbevo == null) {
            strGxszxtbevo = "";
        }
        eablkybsjg eablkybsjgVarGxszxtbevo = gxszxtbevo(iobyxmoadgVar.wflxmlrfwp());
        String serverValue = iobyxmoadgVar.gtknphoqwx().getServerValue();
        gxszxtbevo gxszxtbevoVarLqeggnwhkg = lqeggnwhkg(iobyxmoadgVar.agtfadlqog());
        List listIobyxmoadg = iobyxmoadg(iobyxmoadgVar.ppxfxbqfkf());
        hy.lqeggnwhkg lqeggnwhkgVarNufgyqmvbu = nufgyqmvbu(iobyxmoadgVar.rgvfuqvkyq());
        OrderEditBonuses orderEditBonusesWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        hy.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = orderEditBonusesWkgbmnqykc != null ? ppxfxbqfkf(orderEditBonusesWkgbmnqykc) : null;
        String strLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg();
        List listVdvldrhtss = iobyxmoadgVar.vdvldrhtss();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listVdvldrhtss, 10));
        Iterator it = listVdvldrhtss.iterator();
        while (it.hasNext()) {
            arrayList.add(dxjokdxxww((OrderTotalInfoItem) it.next()));
        }
        return new hy.zoijcleaow(j13, orderStatusBtonecajqb, strOjitshcjhn, serverCode, strGxszxtbevo, serverValue, eablkybsjgVarGxszxtbevo, ppxfxbqfkfVarEablkybsjg, gxszxtbevoVarLqeggnwhkg, listIobyxmoadg, lqeggnwhkgVarNufgyqmvbu, iobyxmoadgVarPpxfxbqfkf, strLqeggnwhkg, arrayList, dw.iobyxmoadg.lqeggnwhkg(iobyxmoadgVar.draadjrbmk()));
    }

    private static final List zoijcleaow(List list) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductLimit productLimit = (ProductLimit) it.next();
            arrayList.add(new ProductLimitEntity(productLimit.getMeasureType(), productLimit.getQuantity()));
        }
        return arrayList;
    }
}
