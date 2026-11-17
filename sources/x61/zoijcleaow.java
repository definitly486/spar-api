package x61;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.updateapplicationtwo.store.State;
import ru.myspar.proloyalty.domain.feature.updateapplicationtwo.store.UpdateApplicationTwoDialogArgs;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    private final State zoijcleaow(State state, UpdateApplicationTwoDialogArgs updateApplicationTwoDialogArgs) {
        return state.zoijcleaow(updateApplicationTwoDialogArgs.getTitle(), updateApplicationTwoDialogArgs.getSubtitle(), updateApplicationTwoDialogArgs.getText(), updateApplicationTwoDialogArgs.getButtonText(), updateApplicationTwoDialogArgs.getImage());
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return zoijcleaow(state, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }
}
