package lx0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ky0.OrderEditPropertiesDto;
import ru.myspar.proloyalty.components.payment.api.models.PaymentCode;
import vx0.OrderEditProductsDto;
import vx0.OrderEditRequest;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final OrderEditPropertiesDto iobyxmoadg(uz0.nufgyqmvbu nufgyqmvbuVar) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        return new OrderEditPropertiesDto(nufgyqmvbuVar.ppxfxbqfkf(), nufgyqmvbuVar.gxszxtbevo(), nufgyqmvbuVar.lqeggnwhkg(), nufgyqmvbuVar.dxjokdxxww(), nufgyqmvbuVar.btonecajqb(), nufgyqmvbuVar.gtknphoqwx(), nufgyqmvbuVar.nufgyqmvbu(), nufgyqmvbuVar.wkgbmnqykc());
    }

    public static final OrderEditRequest zoijcleaow(uz0.iobyxmoadg iobyxmoadgVar, String orderEditId, OrderEditProductsDto orderEditProductsDto, uz0.zoijcleaow action) {
        uz0.nufgyqmvbu nufgyqmvbuVarAgtfadlqog;
        List listEablkybsjg;
        List listWkgbmnqykc;
        uz0.nufgyqmvbu nufgyqmvbuVarAgtfadlqog2;
        uz0.lqeggnwhkg lqeggnwhkgVarWflxmlrfwp;
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
            arrayList.add(zoijcleaow.iobyxmoadg((uz0.eablkybsjg) it.next()));
        }
        List listP = jyumaefscl.p(arrayList);
        if (orderEditProductsDto != null) {
            listP.add(orderEditProductsDto);
        }
        return new OrderEditRequest(orderEditId, action.wkgbmnqykc(), listP, (iobyxmoadgVar == null || (paymentCodeGtknphoqwx = iobyxmoadgVar.gtknphoqwx()) == null) ? null : paymentCodeGtknphoqwx.getServerValue(), jx0.iobyxmoadg.iobyxmoadg((iobyxmoadgVar == null || (lqeggnwhkgVarWflxmlrfwp = iobyxmoadgVar.wflxmlrfwp()) == null) ? null : lqeggnwhkgVarWflxmlrfwp.ppxfxbqfkf()), (iobyxmoadgVar == null || (nufgyqmvbuVarAgtfadlqog2 = iobyxmoadgVar.agtfadlqog()) == null) ? null : iobyxmoadg(nufgyqmvbuVarAgtfadlqog2), (iobyxmoadgVar == null || (nufgyqmvbuVarAgtfadlqog = iobyxmoadgVar.agtfadlqog()) == null || (listEablkybsjg = nufgyqmvbuVarAgtfadlqog.eablkybsjg()) == null || (listWkgbmnqykc = kx0.nufgyqmvbu.wkgbmnqykc(listEablkybsjg)) == null || listWkgbmnqykc.isEmpty()) ? null : listWkgbmnqykc);
    }
}
