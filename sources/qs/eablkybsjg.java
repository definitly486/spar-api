package qs;

import gg.vdvldrhtss;
import hg.jyumaefscl;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {
    public static final BigDecimal agtfadlqog(double d13) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d13);
        zdlpuopuiu.dxjokdxxww(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    public static final double btonecajqb(double d13, Integer num, RoundingMode roundingMode) {
        zdlpuopuiu.btonecajqb(roundingMode, "roundingMode");
        return draadjrbmk(agtfadlqog(d13), num, roundingMode).doubleValue();
    }

    public static final BigDecimal draadjrbmk(BigDecimal bigDecimal, Integer num, RoundingMode roundingMode) {
        zdlpuopuiu.btonecajqb(bigDecimal, "<this>");
        zdlpuopuiu.btonecajqb(roundingMode, "roundingMode");
        if (num == null) {
            return bigDecimal;
        }
        BigDecimal scale = bigDecimal.setScale(num.intValue(), roundingMode);
        zdlpuopuiu.dxjokdxxww(scale, "setScale(...)");
        return scale;
    }

    public static final List dxjokdxxww(Iterable iterable, Object obj, Object obj2) {
        zdlpuopuiu.btonecajqb(iterable, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(iterable, 10));
        for (Object obj3 : iterable) {
            if (zdlpuopuiu.eablkybsjg(obj3, obj)) {
                obj3 = obj2;
            }
            arrayList.add(obj3);
        }
        return arrayList;
    }

    public static final double eablkybsjg(double d13, double d14, Integer num) {
        BigDecimal bigDecimalMultiply = agtfadlqog(d13).multiply(agtfadlqog(d14));
        zdlpuopuiu.dxjokdxxww(bigDecimalMultiply, "multiply(...)");
        return wflxmlrfwp(bigDecimalMultiply, num, null, 2, null).doubleValue();
    }

    public static /* synthetic */ double gtknphoqwx(double d13, Integer num, RoundingMode roundingMode, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return btonecajqb(d13, num, roundingMode);
    }

    public static /* synthetic */ double gxszxtbevo(double d13, double d14, Integer num, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            num = null;
        }
        return eablkybsjg(d13, d14, num);
    }

    public static final double lqeggnwhkg(double d13, double d14, Integer num) {
        BigDecimal bigDecimalAdd = agtfadlqog(d13).add(agtfadlqog(d14));
        zdlpuopuiu.dxjokdxxww(bigDecimalAdd, "add(...)");
        return wflxmlrfwp(bigDecimalAdd, num, null, 2, null).doubleValue();
    }

    public static /* synthetic */ double nufgyqmvbu(double d13, double d14, Integer num, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            num = null;
        }
        return lqeggnwhkg(d13, d14, num);
    }

    public static final List ojitshcjhn(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        return jyumaefscl.jztzpxfvev(list, 2, new draadjrbmk() { // from class: qs.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.rgvfuqvkyq((List) obj);
            }
        });
    }

    public static /* synthetic */ double ppxfxbqfkf(double d13, double d14, Integer num, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            num = null;
        }
        return zoijcleaow(d13, d14, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vdvldrhtss rgvfuqvkyq(List chunk) {
        zdlpuopuiu.btonecajqb(chunk, "chunk");
        return new vdvldrhtss(chunk.get(0), jyumaefscl.lrnfpwlwnk(chunk, 1));
    }

    public static /* synthetic */ BigDecimal wflxmlrfwp(BigDecimal bigDecimal, Integer num, RoundingMode roundingMode, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return draadjrbmk(bigDecimal, num, roundingMode);
    }

    public static final double wkgbmnqykc(double d13, double d14, Integer num) {
        BigDecimal bigDecimalSubtract = agtfadlqog(d13).subtract(agtfadlqog(d14));
        zdlpuopuiu.dxjokdxxww(bigDecimalSubtract, "subtract(...)");
        return wflxmlrfwp(bigDecimalSubtract, num, null, 2, null).doubleValue();
    }

    public static final double zoijcleaow(double d13, double d14, Integer num) {
        BigDecimal bigDecimalDivide = agtfadlqog(d13).divide(agtfadlqog(d14), RoundingMode.HALF_EVEN);
        zdlpuopuiu.dxjokdxxww(bigDecimalDivide, "divide(...)");
        return wflxmlrfwp(bigDecimalDivide, num, null, 2, null).doubleValue();
    }
}
