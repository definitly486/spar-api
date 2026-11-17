package i91;

import kotlin.NoWhenBranchMatchedException;
import ru.myspar.proloyalty.core.domain.models.payload.UpdateApplicationPayload;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww extends sw0.eablkybsjg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(UpdateApplicationPayload payload) {
        Object value;
        super(new lqeggnwhkg(null, null, false, 7, null));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, ((lqeggnwhkg) value).iobyxmoadg(payload.getTitleText(), payload.getMessageText(), payload.getForceUpdate())));
    }

    private final void cqumvgiudr() {
        yggfygwlhe(nufgyqmvbu.iobyxmoadg.f42161iobyxmoadg);
    }

    private final void iwizpuwonk() {
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(m21.dxjokdxxww.f64969iobyxmoadg.kcexrzcfyt());
    }

    public final void esjtqupxsv(ru.myspar.proloyalty.legacy.presentation.dialogs.update.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof ru.myspar.proloyalty.legacy.presentation.dialogs.update.iobyxmoadg.zoijcleaow) {
            cqumvgiudr();
        } else {
            if (!(event instanceof ru.myspar.proloyalty.legacy.presentation.dialogs.update.iobyxmoadg.C2282iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            iwizpuwonk();
        }
    }
}
