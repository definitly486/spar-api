package j00;

import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.handler.ProductMessageType;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import tg.oxmwwwfdhm;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements oxmwwwfdhm {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f50373yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final i00.zoijcleaow f50374zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f50375iobyxmoadg;

        static {
            int[] iArr = new int[m00.zoijcleaow.values().length];
            try {
                iArr[m00.zoijcleaow.INCREASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m00.zoijcleaow.DECREASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m00.zoijcleaow.CHANGE_MEASURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m00.zoijcleaow.ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m00.zoijcleaow.REMOVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f50375iobyxmoadg = iArr;
        }
    }

    public ppxfxbqfkf(i00.zoijcleaow messageHandler) {
        zdlpuopuiu.btonecajqb(messageHandler, "messageHandler");
        this.f50374zdlpuopuiu = messageHandler;
    }

    private final void btonecajqb(String str) {
        this.f50374zdlpuopuiu.gxszxtbevo(cqumvgiudr.iobyxmoadg(str, ProductMessageType.Limit.f86652yggfygwlhe));
    }

    private final List eablkybsjg(u00.iobyxmoadg iobyxmoadgVar) {
        List listZoijcleaow = iobyxmoadgVar.zoijcleaow();
        if (listZoijcleaow.isEmpty()) {
            return null;
        }
        return listZoijcleaow;
    }

    private final MeasureType gtknphoqwx(MeasureTypeModel measureTypeModel, MeasureType measureType) {
        if (measureTypeModel.getUnits().size() < 2) {
            return measureTypeModel.getCurrentMeasure();
        }
        Iterator it = measureTypeModel.getUnits().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (zdlpuopuiu.eablkybsjg(((MeasureType) it.next()).getValue(), measureType.getValue())) {
                break;
            }
            i13++;
        }
        MeasureType measureType2 = (MeasureType) jyumaefscl.lrnfpwlwnk(measureTypeModel.getUnits(), i13 + 1);
        return measureType2 == null ? (MeasureType) jyumaefscl.opjhrmiecq(measureTypeModel.getUnits()) : measureType2;
    }

    private final m00.iobyxmoadg gxszxtbevo(ChangeProductParams changeProductParams, u00.iobyxmoadg iobyxmoadgVar, double d13, MeasureType measureType, double d14) {
        List limits;
        eablkybsjg eablkybsjgVar = eablkybsjg.f50349iobyxmoadg;
        double dPpxfxbqfkf = eablkybsjgVar.ppxfxbqfkf(d13, d14);
        if (iobyxmoadgVar == null || (limits = eablkybsjg(iobyxmoadgVar)) == null) {
            limits = changeProductParams.getLimits();
        }
        double dIobyxmoadg = eablkybsjgVar.iobyxmoadg(limits, measureType, dPpxfxbqfkf, changeProductParams.getAwgWeight());
        if (d13 == dIobyxmoadg) {
            btonecajqb(changeProductParams.getProductId());
            return null;
        }
        if (dPpxfxbqfkf <= dIobyxmoadg) {
            return changeProductParams.gtknphoqwx(dIobyxmoadg, measureType);
        }
        btonecajqb(changeProductParams.getProductId());
        return changeProductParams.gtknphoqwx(dIobyxmoadg, measureType);
    }

    private final m00.iobyxmoadg iobyxmoadg(ChangeProductParams changeProductParams, u00.iobyxmoadg iobyxmoadgVar, MeasureType measureType) {
        List limits;
        double basketDefault = measureType.L(changeProductParams.getMeasureTypeModel()).getBasketDefault();
        eablkybsjg eablkybsjgVar = eablkybsjg.f50349iobyxmoadg;
        if (iobyxmoadgVar == null || (limits = eablkybsjg(iobyxmoadgVar)) == null) {
            limits = changeProductParams.getLimits();
        }
        double dIobyxmoadg = eablkybsjgVar.iobyxmoadg(limits, measureType, basketDefault, changeProductParams.getAwgWeight());
        if (basketDefault > dIobyxmoadg) {
            btonecajqb(changeProductParams.getProductId());
        }
        return changeProductParams.gtknphoqwx(dIobyxmoadg, measureType);
    }

    private final m00.iobyxmoadg ppxfxbqfkf(ChangeProductParams changeProductParams, MeasureType measureType, double d13, double d14, double d15) {
        double dZoijcleaow = eablkybsjg.f50349iobyxmoadg.zoijcleaow(d13, d14);
        if (dZoijcleaow >= measureType.getMinAvailable()) {
            d15 = dZoijcleaow;
        }
        return changeProductParams.gtknphoqwx(d15, measureType);
    }

    private final vdvldrhtss wflxmlrfwp(double d13, MeasureType measureType, MeasureType measureType2, Double d14) {
        if (d14 == null || d14.doubleValue() <= 0.0d || zdlpuopuiu.eablkybsjg(measureType, measureType2)) {
            return cqumvgiudr.iobyxmoadg(Double.valueOf(Math.max(d13, measureType.getMinAvailable())), measureType);
        }
        if (!(measureType2 instanceof MeasureType.WEIGHT)) {
            return measureType2 instanceof MeasureType.AMOUNT ? cqumvgiudr.iobyxmoadg(Double.valueOf(Math.max(eablkybsjg.f50349iobyxmoadg.eablkybsjg(d13, d14.doubleValue()), ((MeasureType.AMOUNT) measureType2).getMinAvailable())), measureType2) : cqumvgiudr.iobyxmoadg(Double.valueOf(Math.max(d13, measureType.getMinAvailable())), measureType);
        }
        MeasureType.WEIGHT weight = (MeasureType.WEIGHT) measureType2;
        return cqumvgiudr.iobyxmoadg(Double.valueOf(Math.max(eablkybsjg.f50349iobyxmoadg.wkgbmnqykc(d13, d14.doubleValue(), weight.getMinAvailable()), weight.getMinAvailable())), measureType2);
    }

    private final m00.iobyxmoadg zoijcleaow(ChangeProductParams changeProductParams, u00.iobyxmoadg iobyxmoadgVar, MeasureType measureType, double d13) {
        List limits;
        vdvldrhtss vdvldrhtssVarWflxmlrfwp = wflxmlrfwp(d13, measureType, gtknphoqwx(changeProductParams.getMeasureTypeModel(), measureType), changeProductParams.getAwgWeight());
        double dDoubleValue = ((Number) vdvldrhtssVarWflxmlrfwp.iobyxmoadg()).doubleValue();
        MeasureType measureType2 = (MeasureType) vdvldrhtssVarWflxmlrfwp.wkgbmnqykc();
        eablkybsjg eablkybsjgVar = eablkybsjg.f50349iobyxmoadg;
        if (iobyxmoadgVar == null || (limits = eablkybsjg(iobyxmoadgVar)) == null) {
            limits = changeProductParams.getLimits();
        }
        double dIobyxmoadg = eablkybsjgVar.iobyxmoadg(limits, measureType2, dDoubleValue, changeProductParams.getAwgWeight());
        if (dDoubleValue > dIobyxmoadg) {
            btonecajqb(changeProductParams.getProductId());
        }
        return changeProductParams.gtknphoqwx(dIobyxmoadg, measureType2);
    }

    @Override // tg.oxmwwwfdhm
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return lqeggnwhkg((ChangeProductParams) obj, (m00.iobyxmoadg) obj2, (u00.iobyxmoadg) obj3, ((Number) obj4).doubleValue());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    public m00.iobyxmoadg lqeggnwhkg(ChangeProductParams changeProductParams, m00.iobyxmoadg iobyxmoadgVar, u00.iobyxmoadg iobyxmoadgVar2, double d13) {
        double d14;
        double dWkgbmnqykc;
        MeasureType currentMeasure;
        MeasureType measureType;
        double ratio;
        int i13;
        zdlpuopuiu.btonecajqb(changeProductParams, "changeProductParams");
        if (iobyxmoadgVar == null) {
            if (iobyxmoadgVar2 != null) {
                dWkgbmnqykc = iobyxmoadgVar2.wkgbmnqykc();
            } else {
                d14 = d13;
            }
            if (iobyxmoadgVar != null || (currentMeasure = iobyxmoadgVar.lqeggnwhkg()) == null) {
                if (iobyxmoadgVar2 != null) {
                    currentMeasure = iobyxmoadgVar2.ppxfxbqfkf();
                } else {
                    currentMeasure = changeProductParams.getMeasureTypeModel().getCurrentMeasure();
                }
            }
            measureType = currentMeasure;
            ratio = measureType.getRatio();
            i13 = zoijcleaow.f50375iobyxmoadg[changeProductParams.getChangeType().ordinal()];
            if (i13 != 1) {
                return d14 == 0.0d ? iobyxmoadg(changeProductParams, iobyxmoadgVar2, measureType) : gxszxtbevo(changeProductParams, iobyxmoadgVar2, d14, measureType, ratio);
            }
            if (i13 != 2) {
                return ppxfxbqfkf(changeProductParams, measureType, d14, ratio, d13);
            }
            if (i13 != 3) {
                return zoijcleaow(changeProductParams, iobyxmoadgVar2, measureType, d14);
            }
            if (i13 != 4) {
                return iobyxmoadg(changeProductParams, iobyxmoadgVar2, measureType);
            }
            if (i13 == 5) {
                return changeProductParams.gtknphoqwx(0.0d, measureType);
            }
            throw new NoWhenBranchMatchedException();
        }
        dWkgbmnqykc = iobyxmoadgVar.nufgyqmvbu();
        d14 = dWkgbmnqykc;
        if (iobyxmoadgVar != null) {
            if (iobyxmoadgVar2 != null) {
                currentMeasure = iobyxmoadgVar2.ppxfxbqfkf();
            } else {
                currentMeasure = changeProductParams.getMeasureTypeModel().getCurrentMeasure();
            }
        } else if (iobyxmoadgVar2 != null) {
            currentMeasure = iobyxmoadgVar2.ppxfxbqfkf();
        } else {
            currentMeasure = changeProductParams.getMeasureTypeModel().getCurrentMeasure();
        }
        measureType = currentMeasure;
        ratio = measureType.getRatio();
        i13 = zoijcleaow.f50375iobyxmoadg[changeProductParams.getChangeType().ordinal()];
        if (i13 != 1) {
            if (d14 == 0.0d) {
            }
        }
        if (i13 != 2) {
            return ppxfxbqfkf(changeProductParams, measureType, d14, ratio, d13);
        }
        if (i13 != 3) {
            return zoijcleaow(changeProductParams, iobyxmoadgVar2, measureType, d14);
        }
        if (i13 != 4) {
            return iobyxmoadg(changeProductParams, iobyxmoadgVar2, measureType);
        }
        if (i13 == 5) {
            return changeProductParams.gtknphoqwx(0.0d, measureType);
        }
        throw new NoWhenBranchMatchedException();
    }
}
