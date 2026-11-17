package ix0;

import bx0.ProductLimitEntity;
import cx0.OrderEditProductEntity;
import cx0.OrderEditUnitEntity;
import cx0.OrderTotalInfoItemEntity;
import cx0.eablkybsjg;
import cx0.gxszxtbevo;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.order.OrderStatus;
import ru.myspar.proloyalty.core.domain.models.order.OrderTotalInfoItem;
import ru.myspar.proloyalty.core.domain.models.order.edit.OrderEditBonuses;
import ru.myspar.proloyalty.core.domain.models.product.ProductLimit;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import uz0.lqeggnwhkg;
import uz0.nufgyqmvbu;
import uz0.wkgbmnqykc;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    private static final OrderTotalInfoItemEntity dxjokdxxww(OrderTotalInfoItem orderTotalInfoItem) {
        return new OrderTotalInfoItemEntity(orderTotalInfoItem.getTitle(), orderTotalInfoItem.getValue(), orderTotalInfoItem.getTooltip());
    }

    private static final cx0.ppxfxbqfkf eablkybsjg(wkgbmnqykc wkgbmnqykcVar) {
        return new cx0.ppxfxbqfkf(wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.iobyxmoadg());
    }

    private static final eablkybsjg gxszxtbevo(lqeggnwhkg lqeggnwhkgVar) {
        return new eablkybsjg(lqeggnwhkgVar.ppxfxbqfkf(), 0.0d, lqeggnwhkgVar.wkgbmnqykc(), 2, null);
    }

    private static final List iobyxmoadg(List list) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uz0.eablkybsjg eablkybsjgVar = (uz0.eablkybsjg) it.next();
            List<MeasureType> units = eablkybsjgVar.btonecajqb().getUnits();
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(units, 10));
            for (MeasureType measureType : units) {
                arrayList2.add(new OrderEditUnitEntity(measureType.getValue(), measureType.getMinAvailable(), measureType.getRatio(), measureType.getBasketDefault()));
            }
            arrayList.add(new OrderEditProductEntity(eablkybsjgVar.nufgyqmvbu(), eablkybsjgVar.ppxfxbqfkf(), eablkybsjgVar.yggfygwlhe(), eablkybsjgVar.gtknphoqwx(), eablkybsjgVar.ojitshcjhn(), eablkybsjgVar.draadjrbmk(), eablkybsjgVar.wflxmlrfwp(), eablkybsjgVar.vdvldrhtss(), eablkybsjgVar.kcexrzcfyt(), eablkybsjgVar.eablkybsjg(), eablkybsjgVar.oxmwwwfdhm(), eablkybsjgVar.gxszxtbevo(), eablkybsjgVar.btonecajqb().getCurrentMeasure().getValue(), eablkybsjgVar.zdlpuopuiu(), eablkybsjgVar.jyumaefscl(), arrayList2, eablkybsjgVar.wkgbmnqykc(), eablkybsjgVar.agtfadlqog(), eablkybsjgVar.rgvfuqvkyq(), eablkybsjgVar.iwizpuwonk(), eablkybsjgVar.dxjokdxxww().isEmpty() ? null : zoijcleaow(eablkybsjgVar.dxjokdxxww()), yo0.iobyxmoadg.btonecajqb(eablkybsjgVar.lqeggnwhkg())));
        }
        return arrayList;
    }

    private static final gxszxtbevo lqeggnwhkg(nufgyqmvbu nufgyqmvbuVar) {
        return new gxszxtbevo(nufgyqmvbuVar.ppxfxbqfkf(), nufgyqmvbuVar.dxjokdxxww(), nufgyqmvbuVar.btonecajqb(), nufgyqmvbuVar.gtknphoqwx(), nufgyqmvbuVar.nufgyqmvbu(), nufgyqmvbuVar.gxszxtbevo(), nufgyqmvbuVar.lqeggnwhkg(), nufgyqmvbuVar.wkgbmnqykc(), kx0.nufgyqmvbu.ppxfxbqfkf(nufgyqmvbuVar.eablkybsjg()));
    }

    private static final cx0.lqeggnwhkg nufgyqmvbu(uz0.ppxfxbqfkf ppxfxbqfkfVar) {
        return new cx0.lqeggnwhkg(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.eablkybsjg(), ppxfxbqfkfVar.ppxfxbqfkf(), ppxfxbqfkfVar.lqeggnwhkg(), ppxfxbqfkfVar.dxjokdxxww(), ppxfxbqfkfVar.nufgyqmvbu(), ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.gxszxtbevo(), ppxfxbqfkfVar.wkgbmnqykc());
    }

    private static final cx0.iobyxmoadg ppxfxbqfkf(OrderEditBonuses orderEditBonuses) {
        return new cx0.iobyxmoadg(orderEditBonuses.getApplied());
    }

    public static final cx0.zoijcleaow wkgbmnqykc(uz0.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        long j13 = Long.parseLong(iobyxmoadgVar.nufgyqmvbu());
        cx0.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = eablkybsjg(iobyxmoadgVar.dxjokdxxww());
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
        cx0.lqeggnwhkg lqeggnwhkgVarNufgyqmvbu = nufgyqmvbu(iobyxmoadgVar.rgvfuqvkyq());
        OrderEditBonuses orderEditBonusesWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        cx0.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = orderEditBonusesWkgbmnqykc != null ? ppxfxbqfkf(orderEditBonusesWkgbmnqykc) : null;
        String strLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg();
        List listVdvldrhtss = iobyxmoadgVar.vdvldrhtss();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listVdvldrhtss, 10));
        Iterator it = listVdvldrhtss.iterator();
        while (it.hasNext()) {
            arrayList.add(dxjokdxxww((OrderTotalInfoItem) it.next()));
        }
        return new cx0.zoijcleaow(j13, orderStatusBtonecajqb, strOjitshcjhn, serverCode, strGxszxtbevo, serverValue, eablkybsjgVarGxszxtbevo, ppxfxbqfkfVarEablkybsjg, gxszxtbevoVarLqeggnwhkg, listIobyxmoadg, lqeggnwhkgVarNufgyqmvbu, iobyxmoadgVarPpxfxbqfkf, strLqeggnwhkg, arrayList, xu0.iobyxmoadg.lqeggnwhkg(iobyxmoadgVar.draadjrbmk()));
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
