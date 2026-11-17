package ex0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr0.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import kx0.nufgyqmvbu;
import ky0.OrderEditPropertiesDto;
import tg.kcexrzcfyt;
import uz0.eablkybsjg;
import vx0.OrderEditProductsDto;
import vx0.OrderEditRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements kcexrzcfyt {
    private final List iobyxmoadg(List list, List list2, boolean z13) {
        Object next;
        List listP = jyumaefscl.p(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            OrderEditProductsDto orderEditProductsDto = (OrderEditProductsDto) it.next();
            Iterator it2 = listP.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!zdlpuopuiu.eablkybsjg(((OrderEditProductsDto) next).getId(), orderEditProductsDto.getId()));
            OrderEditProductsDto orderEditProductsDto2 = (OrderEditProductsDto) next;
            if (orderEditProductsDto2 == null) {
                listP.add(orderEditProductsDto);
            } else {
                listP.remove(orderEditProductsDto2);
                if (z13) {
                    listP.add(zoijcleaow(orderEditProductsDto2, orderEditProductsDto));
                } else {
                    listP.add(orderEditProductsDto);
                }
            }
        }
        return listP;
    }

    private final OrderEditProductsDto zoijcleaow(OrderEditProductsDto orderEditProductsDto, OrderEditProductsDto orderEditProductsDto2) {
        return OrderEditProductsDto.zoijcleaow(orderEditProductsDto2, null, null, wkgbmnqykc.nufgyqmvbu(orderEditProductsDto.getQuantity(), orderEditProductsDto2.getQuantity(), null, 2, null), 3, null);
    }

    @Override // tg.kcexrzcfyt
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return ppxfxbqfkf((String) obj, (uz0.iobyxmoadg) obj2, (List) obj3, (uz0.zoijcleaow) obj4, ((Boolean) obj5).booleanValue());
    }

    public OrderEditRequest ppxfxbqfkf(String orderEditId, uz0.iobyxmoadg orderEdit, List additionalProducts, uz0.zoijcleaow action, boolean z13) {
        zdlpuopuiu.btonecajqb(orderEditId, "orderEditId");
        zdlpuopuiu.btonecajqb(orderEdit, "orderEdit");
        zdlpuopuiu.btonecajqb(additionalProducts, "additionalProducts");
        zdlpuopuiu.btonecajqb(action, "action");
        List listPpxfxbqfkf = orderEdit.ppxfxbqfkf();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
        Iterator it = listPpxfxbqfkf.iterator();
        while (it.hasNext()) {
            arrayList.add(lx0.zoijcleaow.iobyxmoadg((eablkybsjg) it.next()));
        }
        List listIobyxmoadg = iobyxmoadg(arrayList, additionalProducts, z13);
        String strWkgbmnqykc = action.wkgbmnqykc();
        String serverValue = orderEdit.gtknphoqwx().getServerValue();
        String strPpxfxbqfkf = orderEdit.wflxmlrfwp().ppxfxbqfkf();
        if (mj.kcexrzcfyt.zfvoamnweg(strPpxfxbqfkf)) {
            strPpxfxbqfkf = null;
        }
        OrderEditPropertiesDto orderEditPropertiesDtoIobyxmoadg = lx0.iobyxmoadg.iobyxmoadg(orderEdit.agtfadlqog());
        List listEablkybsjg = orderEdit.agtfadlqog().eablkybsjg();
        return new OrderEditRequest(orderEditId, strWkgbmnqykc, listIobyxmoadg, serverValue, strPpxfxbqfkf, orderEditPropertiesDtoIobyxmoadg, listEablkybsjg != null ? nufgyqmvbu.wkgbmnqykc(listEablkybsjg) : null);
    }
}
