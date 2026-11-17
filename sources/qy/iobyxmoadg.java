package qy;

import cz.OrderEditProductsDto;
import cz.OrderEditRequest;
import e10.lqeggnwhkg;
import e10.nufgyqmvbu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.payment.api.models.PaymentCode;
import sz.OrderEditPropertiesDto;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final OrderEditPropertiesDto iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        return new OrderEditPropertiesDto(nufgyqmvbuVar.ppxfxbqfkf(), nufgyqmvbuVar.gxszxtbevo(), nufgyqmvbuVar.lqeggnwhkg(), nufgyqmvbuVar.dxjokdxxww(), nufgyqmvbuVar.btonecajqb(), nufgyqmvbuVar.gtknphoqwx(), nufgyqmvbuVar.nufgyqmvbu(), nufgyqmvbuVar.wkgbmnqykc());
    }

    public static final OrderEditRequest zoijcleaow(e10.iobyxmoadg iobyxmoadgVar, String orderEditId, OrderEditProductsDto orderEditProductsDto, e10.zoijcleaow action) {
        nufgyqmvbu nufgyqmvbuVarAgtfadlqog;
        List listEablkybsjg;
        List listWkgbmnqykc;
        nufgyqmvbu nufgyqmvbuVarAgtfadlqog2;
        lqeggnwhkg lqeggnwhkgVarWflxmlrfwp;
        PaymentCode paymentCodeGtknphoqwx;
        zdlpuopuiu.btonecajqb(orderEditId, "orderEditId");
        zdlpuopuiu.btonecajqb(action, "action");
        List listPpxfxbqfkf = iobyxmoadgVar != null ? iobyxmoadgVar.ppxfxbqfkf() : null;
        if (listPpxfxbqfkf == null) {
            listPpxfxbqfkf = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
        Iterator it = listPpxfxbqfkf.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow.iobyxmoadg((e10.eablkybsjg) it.next()));
        }
        List listP = jyumaefscl.p(arrayList);
        if (orderEditProductsDto != null) {
            listP.add(orderEditProductsDto);
        }
        return new OrderEditRequest(orderEditId, action.wkgbmnqykc(), listP, (iobyxmoadgVar == null || (paymentCodeGtknphoqwx = iobyxmoadgVar.gtknphoqwx()) == null) ? null : paymentCodeGtknphoqwx.getServerValue(), oy.iobyxmoadg.iobyxmoadg((iobyxmoadgVar == null || (lqeggnwhkgVarWflxmlrfwp = iobyxmoadgVar.wflxmlrfwp()) == null) ? null : lqeggnwhkgVarWflxmlrfwp.ppxfxbqfkf()), (iobyxmoadgVar == null || (nufgyqmvbuVarAgtfadlqog2 = iobyxmoadgVar.agtfadlqog()) == null) ? null : iobyxmoadg(nufgyqmvbuVarAgtfadlqog2), (iobyxmoadgVar == null || (nufgyqmvbuVarAgtfadlqog = iobyxmoadgVar.agtfadlqog()) == null || (listEablkybsjg = nufgyqmvbuVarAgtfadlqog.eablkybsjg()) == null || (listWkgbmnqykc = py.nufgyqmvbu.wkgbmnqykc(listEablkybsjg)) == null || listWkgbmnqykc.isEmpty()) ? null : listWkgbmnqykc);
    }
}
