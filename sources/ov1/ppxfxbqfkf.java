package ov1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.PaymentMethod;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.SendTipsParams;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.TipValue;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.TipsOrderParams;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.TipsParamsState;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends zr0.zoijcleaow {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final TipsOrderParams f74806iobyxmoadg;

        public iobyxmoadg(TipsOrderParams tipsParams) {
            zdlpuopuiu.btonecajqb(tipsParams, "tipsParams");
            this.f74806iobyxmoadg = tipsParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f74806iobyxmoadg, ((iobyxmoadg) obj).f74806iobyxmoadg);
        }

        public int hashCode() {
            return this.f74806iobyxmoadg.hashCode();
        }

        public final TipsOrderParams iobyxmoadg() {
            return this.f74806iobyxmoadg;
        }

        public String toString() {
            return "Params(tipsParams=" + this.f74806iobyxmoadg + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.zoijcleaow
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public TipsParamsState iobyxmoadg(iobyxmoadg parameters) {
        Object next;
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        TipsOrderParams tipsOrderParamsIobyxmoadg = parameters.iobyxmoadg();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : tipsOrderParamsIobyxmoadg.getTips().entrySet()) {
            String str = (String) entry.getKey();
            TipValue tipValue = (TipValue) entry.getValue();
            Long value = tipValue.getValue();
            long jLongValue = value != null ? value.longValue() : 0L;
            int min = tipValue.getMin();
            if (jLongValue <= tipValue.getMax() && min <= jLongValue) {
                linkedHashMap.put(str, Long.valueOf(jLongValue));
            } else if (jLongValue != 0) {
                return TipsParamsState.Error.f101896zdlpuopuiu;
            }
        }
        Iterator it = tipsOrderParamsIobyxmoadg.getPayments().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!zdlpuopuiu.eablkybsjg(((PaymentMethod) next).getId(), tipsOrderParamsIobyxmoadg.getCurrentPaymentId()));
        PaymentMethod paymentMethod = (PaymentMethod) next;
        return (linkedHashMap.isEmpty() || paymentMethod == null) ? TipsParamsState.Error.f101896zdlpuopuiu : new TipsParamsState.ReadySend(new SendTipsParams(linkedHashMap, paymentMethod));
    }
}
