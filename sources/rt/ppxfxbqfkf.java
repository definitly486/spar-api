package rt;

import hg.jyumaefscl;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.common.view.counter.model.Price;
import ru.myspar.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ppxfxbqfkf f83717iobyxmoadg = new ppxfxbqfkf();

    private ppxfxbqfkf() {
    }

    private final double eablkybsjg(double d13, boolean z13, int i13) {
        return z13 ? d13 * ((double) i13) : d13;
    }

    public static /* synthetic */ Price wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, double d13, int i13, boolean z13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = -1;
        }
        if ((i14 & 4) != 0) {
            z13 = false;
        }
        return ppxfxbqfkfVar.ppxfxbqfkf(d13, i13, z13);
    }

    public final double iobyxmoadg(double d13, MeasureType measureType, Double d14, Double d15, boolean z13) {
        double dDoubleValue;
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        if (d14 == null) {
            return 0.0d;
        }
        if (measureType instanceof MeasureType.WEIGHT) {
            dDoubleValue = d14.doubleValue();
        } else {
            if (!(measureType instanceof MeasureType.AMOUNT)) {
                throw new NoWhenBranchMatchedException();
            }
            d13 *= d14.doubleValue();
            dDoubleValue = d15 != null ? d15.doubleValue() : 1.0d;
        }
        double d16 = 100;
        return Math.rint(eablkybsjg(d13 * dDoubleValue, z13, 10) * d16) / d16;
    }

    public final Price ppxfxbqfkf(double d13, int i13, boolean z13) {
        List listIxidwrxhsl = kcexrzcfyt.ixidwrxhsl(n30.iobyxmoadg.f68492iobyxmoadg.lqeggnwhkg(Double.valueOf(d13)), new String[]{StringUtils.COMMA}, false, 0, 6, null);
        String str = (String) jyumaefscl.lrnfpwlwnk(listIxidwrxhsl, 0);
        if (str == null) {
            str = "";
        }
        String strY = (String) jyumaefscl.lrnfpwlwnk(listIxidwrxhsl, 1);
        if (strY == null) {
            strY = null;
        } else if (zdlpuopuiu.eablkybsjg(strY, "00") && z13) {
            strY = "";
        } else if (i13 != -1 && strY.length() > 0) {
            strY = kcexrzcfyt.y(strY, i13);
        }
        return new Price(str, strY != null ? strY : "", d13);
    }

    public final double zoijcleaow(MeasureType measureType, Double d13, Double d14, Boolean bool) {
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        if (measureType instanceof MeasureType.WEIGHT) {
            if (d13 != null) {
                return d13.doubleValue();
            }
            return 0.0d;
        }
        if (!(measureType instanceof MeasureType.AMOUNT)) {
            throw new NoWhenBranchMatchedException();
        }
        double dDoubleValue = d13 != null ? d13.doubleValue() : 0.0d;
        double dDoubleValue2 = d14 != null ? d14.doubleValue() : 1.0d;
        if (zdlpuopuiu.eablkybsjg(bool, Boolean.TRUE)) {
            dDoubleValue *= (double) 10;
        }
        return dDoubleValue * dDoubleValue2;
    }
}
