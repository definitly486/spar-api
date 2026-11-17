package tk1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.qr.domain.model.QrModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f111022iobyxmoadg;

        static {
            int[] iArr = new int[tk1.iobyxmoadg.zoijcleaow.values().length];
            try {
                iArr[tk1.iobyxmoadg.zoijcleaow.STATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tk1.iobyxmoadg.zoijcleaow.DYNAMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f111022iobyxmoadg = iArr;
        }
    }

    public static final QrModel iobyxmoadg(tk1.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        int i13 = iobyxmoadg.f111022iobyxmoadg[iobyxmoadgVar.lqeggnwhkg().ordinal()];
        if (i13 == 1) {
            return new QrModel.Static(iobyxmoadgVar.ppxfxbqfkf());
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        String strWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        Integer numEablkybsjg = iobyxmoadgVar.eablkybsjg();
        int iIntValue = numEablkybsjg != null ? numEablkybsjg.intValue() : 0;
        eablkybsjg eablkybsjgVarGxszxtbevo = iobyxmoadgVar.gxszxtbevo();
        return new QrModel.Dynamic(strPpxfxbqfkf, strWkgbmnqykc, iIntValue, eablkybsjgVarGxszxtbevo != null ? gxszxtbevo.iobyxmoadg(eablkybsjgVarGxszxtbevo) : null);
    }

    public static final tk1.iobyxmoadg zoijcleaow(QrModel qrModel) {
        zdlpuopuiu.btonecajqb(qrModel, "<this>");
        if (!(qrModel instanceof QrModel.Dynamic)) {
            if (qrModel instanceof QrModel.Static) {
                return new tk1.iobyxmoadg("STATIC", ((QrModel.Static) qrModel).getValue(), null, tk1.iobyxmoadg.zoijcleaow.STATIC, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        QrModel.Dynamic dynamic = (QrModel.Dynamic) qrModel;
        String id2 = dynamic.getId();
        String value = dynamic.getValue();
        tk1.iobyxmoadg.zoijcleaow zoijcleaowVar = tk1.iobyxmoadg.zoijcleaow.DYNAMIC;
        xk1.iobyxmoadg status = dynamic.getStatus();
        return new tk1.iobyxmoadg(id2, value, status != null ? gxszxtbevo.zoijcleaow(status) : null, zoijcleaowVar, Integer.valueOf(dynamic.getLifeTimeInSec()));
    }
}
