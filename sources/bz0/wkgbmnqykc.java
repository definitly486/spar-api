package bz0;

import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.product.ProductLimit;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wkgbmnqykc f17724iobyxmoadg = new wkgbmnqykc();

    private wkgbmnqykc() {
    }

    public final double eablkybsjg(double d13, double d14) {
        double dZoijcleaow = jr0.wkgbmnqykc.zoijcleaow(d13, d14, 2);
        if (dZoijcleaow < 1.0d) {
            return 1.0d;
        }
        return vg.iobyxmoadg.ppxfxbqfkf(dZoijcleaow);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    public final double iobyxmoadg(List limits, MeasureType currentMeasure, double d13, Double d14) {
        Object next;
        double dEablkybsjg;
        zdlpuopuiu.btonecajqb(limits, "limits");
        zdlpuopuiu.btonecajqb(currentMeasure, "currentMeasure");
        if (limits.isEmpty()) {
            return d13;
        }
        Iterator it = limits.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!zdlpuopuiu.eablkybsjg(((ProductLimit) next).getMeasureType().getValue(), currentMeasure.getValue()));
        ProductLimit productLimit = (ProductLimit) next;
        if (productLimit == null) {
            productLimit = (ProductLimit) jyumaefscl.opjhrmiecq(limits);
        }
        if (zdlpuopuiu.eablkybsjg(productLimit.getMeasureType().getValue(), currentMeasure.getValue())) {
            dEablkybsjg = productLimit.getQuantity();
        } else if (d14 == null || d14.doubleValue() <= 0.0d) {
            dEablkybsjg = d13;
        } else if (currentMeasure instanceof MeasureType.WEIGHT) {
            dEablkybsjg = wkgbmnqykc(productLimit.getQuantity(), d14.doubleValue(), ((MeasureType.WEIGHT) currentMeasure).getMinAvailable());
        } else if (currentMeasure instanceof MeasureType.AMOUNT) {
            dEablkybsjg = eablkybsjg(productLimit.getQuantity(), d14.doubleValue());
        } else {
            dEablkybsjg = d13;
        }
        return Math.min(d13, dEablkybsjg);
    }

    public final double ppxfxbqfkf(double d13, double d14) {
        return jr0.wkgbmnqykc.lqeggnwhkg(d13, d14, 2);
    }

    public final double wkgbmnqykc(double d13, double d14, double d15) {
        double dEablkybsjg = jr0.wkgbmnqykc.eablkybsjg(d13, d14, 2);
        return dEablkybsjg < d15 ? d15 : dEablkybsjg;
    }

    public final double zoijcleaow(double d13, double d14) {
        return jr0.wkgbmnqykc.wkgbmnqykc(d13, d14, 2);
    }
}
