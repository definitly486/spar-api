package lv1;

import hg.jyumaefscl;
import hg.tzroggbefp;
import j0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.PaymentMethod;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.TipValue;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.TipsOrderParams;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rgvfuqvkyq {
    public static final TipsOrderParams iobyxmoadg(TipsOrderParamsDto tipsOrderParamsDto) {
        zdlpuopuiu.btonecajqb(tipsOrderParamsDto, "<this>");
        List tips = tipsOrderParamsDto.getTips();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(tips, 10));
        Iterator it = tips.iterator();
        while (it.hasNext()) {
            arrayList.add(wflxmlrfwp.iobyxmoadg((TipOptionDto) it.next()));
        }
        List payments = tipsOrderParamsDto.getPayments();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(payments, 10));
        Iterator it2 = payments.iterator();
        while (it2.hasNext()) {
            arrayList2.add(eablkybsjg.iobyxmoadg((PaymentMethodDto) it2.next()));
        }
        String strValueOf = String.valueOf(tipsOrderParamsDto.getDefaultTipsValue());
        List purposes = tipsOrderParamsDto.getPurposes();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(jyumaefscl.cqumvgiudr(purposes, 10)), 16));
        for (Object obj : purposes) {
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            linkedHashMap2.put(obj, new TipValue(((PurposeTypeDto) obj).getName(), arrayList, new p0.tzroggbefp(strValueOf, 0L, (l) null, 6, (kotlin.jvm.internal.gtknphoqwx) null), tipsOrderParamsDto.getMaxSum(), tipsOrderParamsDto.getMinSum()));
            linkedHashMap = linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(tzroggbefp.eablkybsjg(linkedHashMap3.size()));
        for (Map.Entry entry : linkedHashMap3.entrySet()) {
            linkedHashMap4.put(((PurposeTypeDto) entry.getKey()).getCode(), entry.getValue());
        }
        return new TipsOrderParams(linkedHashMap4, jyumaefscl.r(arrayList2), ((PaymentMethod) jyumaefscl.opjhrmiecq(arrayList2)).getId());
    }
}
