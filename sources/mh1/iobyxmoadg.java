package mh1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.popups.impl.domain.State;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (!zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f67204iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        State state = (State) jlmebxxoox();
        crxdokpmqz(new eablkybsjg.iobyxmoadg(state.getPopupId(), state.getPage(), state.getNavLink(), state.getAction()));
    }
}
