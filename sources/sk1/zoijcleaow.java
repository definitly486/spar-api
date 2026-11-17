package sk1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.qr.domain.model.QrStatusAction;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f107321iobyxmoadg;

        static {
            int[] iArr = new int[xk1.iobyxmoadg.values().length];
            try {
                iArr[xk1.iobyxmoadg.ACTIVATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xk1.iobyxmoadg.ARCHIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f107321iobyxmoadg = iArr;
        }
    }

    public static final QrStatusActionDto iobyxmoadg(QrStatusAction qrStatusAction) {
        QrStatusActionDto.ppxfxbqfkf ppxfxbqfkfVar;
        zdlpuopuiu.btonecajqb(qrStatusAction, "<this>");
        String qrcodeId = qrStatusAction.getQrcodeId();
        int i13 = iobyxmoadg.f107321iobyxmoadg[qrStatusAction.getStatus().ordinal()];
        if (i13 == 1) {
            ppxfxbqfkfVar = QrStatusActionDto.ppxfxbqfkf.ACTIVATED;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkfVar = QrStatusActionDto.ppxfxbqfkf.ARCHIVED;
        }
        return new QrStatusActionDto(qrcodeId, ppxfxbqfkfVar);
    }
}
