package qy;

import gz.ReferenceDto;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oy.draadjrbmk;
import oy.vdvldrhtss;
import sz.OrderReasonDto;
import sz.OrderReferencesDto;
import sz.StatusIdDto;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {
    public static final c10.wkgbmnqykc iobyxmoadg(OrderReferencesDto orderReferencesDto) {
        if (orderReferencesDto == null) {
            return new c10.wkgbmnqykc(null, null, null, null, null, null, 63, null);
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
            arrayList2.add(wkgbmnqykc.iobyxmoadg((OrderReasonDto) it2.next()));
        }
        List evaluationNegative = orderReferencesDto.getEvaluationNegative();
        if (evaluationNegative == null) {
            evaluationNegative = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(evaluationNegative, 10));
        Iterator it3 = evaluationNegative.iterator();
        while (it3.hasNext()) {
            arrayList3.add(wkgbmnqykc.iobyxmoadg((OrderReasonDto) it3.next()));
        }
        List orderReason = orderReferencesDto.getOrderReason();
        if (orderReason == null) {
            orderReason = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList4 = new ArrayList(jyumaefscl.cqumvgiudr(orderReason, 10));
        Iterator it4 = orderReason.iterator();
        while (it4.hasNext()) {
            arrayList4.add(wkgbmnqykc.iobyxmoadg((OrderReasonDto) it4.next()));
        }
        List additional = orderReferencesDto.getAdditional();
        if (additional == null) {
            additional = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList5 = new ArrayList(jyumaefscl.cqumvgiudr(additional, 10));
        Iterator it5 = additional.iterator();
        while (it5.hasNext()) {
            arrayList5.add(draadjrbmk.iobyxmoadg((ReferenceDto) it5.next()));
        }
        List forStockPacker = orderReferencesDto.getForStockPacker();
        if (forStockPacker == null) {
            forStockPacker = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList6 = new ArrayList(jyumaefscl.cqumvgiudr(forStockPacker, 10));
        Iterator it6 = forStockPacker.iterator();
        while (it6.hasNext()) {
            arrayList6.add(draadjrbmk.iobyxmoadg((ReferenceDto) it6.next()));
        }
        return new c10.wkgbmnqykc(arrayList, arrayList3, arrayList2, arrayList4, arrayList5, arrayList6);
    }
}
