package lx0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jx0.draadjrbmk;
import jx0.vdvldrhtss;
import ky0.OrderReasonDto;
import ky0.OrderReferencesDto;
import ky0.StatusIdDto;
import zx0.ReferenceDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg {
    public static final sz0.ppxfxbqfkf iobyxmoadg(OrderReferencesDto orderReferencesDto) {
        if (orderReferencesDto == null) {
            return new sz0.ppxfxbqfkf(null, null, null, null, null, null, 63, null);
        }
        List statusIds = orderReferencesDto.getStatusIds();
        if (statusIds == null) {
            statusIds = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(statusIds, 10));
        Iterator it = statusIds.iterator();
        while (it.hasNext()) {
            arrayList.add(vdvldrhtss.iobyxmoadg((StatusIdDto) it.next()));
        }
        List evaluationPositive = orderReferencesDto.getEvaluationPositive();
        if (evaluationPositive == null) {
            evaluationPositive = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(evaluationPositive, 10));
        Iterator it2 = evaluationPositive.iterator();
        while (it2.hasNext()) {
            arrayList2.add(gxszxtbevo.iobyxmoadg((OrderReasonDto) it2.next()));
        }
        List evaluationNegative = orderReferencesDto.getEvaluationNegative();
        if (evaluationNegative == null) {
            evaluationNegative = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(evaluationNegative, 10));
        Iterator it3 = evaluationNegative.iterator();
        while (it3.hasNext()) {
            arrayList3.add(gxszxtbevo.iobyxmoadg((OrderReasonDto) it3.next()));
        }
        List orderReason = orderReferencesDto.getOrderReason();
        if (orderReason == null) {
            orderReason = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList4 = new ArrayList(jyumaefscl.cqumvgiudr(orderReason, 10));
        Iterator it4 = orderReason.iterator();
        while (it4.hasNext()) {
            arrayList4.add(gxszxtbevo.iobyxmoadg((OrderReasonDto) it4.next()));
        }
        List additional = orderReferencesDto.getAdditional();
        if (additional == null) {
            additional = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList5 = new ArrayList(jyumaefscl.cqumvgiudr(additional, 10));
        Iterator it5 = additional.iterator();
        while (it5.hasNext()) {
            arrayList5.add(draadjrbmk.zoijcleaow((ReferenceDto) it5.next()));
        }
        List forStockPacker = orderReferencesDto.getForStockPacker();
        if (forStockPacker == null) {
            forStockPacker = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList6 = new ArrayList(jyumaefscl.cqumvgiudr(forStockPacker, 10));
        Iterator it6 = forStockPacker.iterator();
        while (it6.hasNext()) {
            arrayList6.add(draadjrbmk.zoijcleaow((ReferenceDto) it6.next()));
        }
        return new sz0.ppxfxbqfkf(arrayList, arrayList3, arrayList2, arrayList4, arrayList5, arrayList6);
    }
}
