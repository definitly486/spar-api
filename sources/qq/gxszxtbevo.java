package qq;

import a8.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.catalog.impl.choosesort.domain.ChooseSortDialogArgs;
import ru.myspar.catalog.impl.choosesort.domain.State;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f80492ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f80493zoijcleaow;

    public gxszxtbevo(lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f80493zoijcleaow = storeFactory;
        this.f80492ppxfxbqfkf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State wflxmlrfwp(State create, State result) {
        zdlpuopuiu.btonecajqb(create, "$this$create");
        zdlpuopuiu.btonecajqb(result, "result");
        return result;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((ChooseSortDialogArgs) gxszxtbevo()).getSelected(), ((ChooseSortDialogArgs) gxszxtbevo()).getSupportedTypes(), ((ChooseSortDialogArgs) gxszxtbevo()).getColorsUiModel());
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f80493zoijcleaow, state, new a8.wkgbmnqykc(zoijcleaow.iobyxmoadg.f80496iobyxmoadg), this.f80492ppxfxbqfkf, new a8.ppxfxbqfkf() { // from class: qq.eablkybsjg
            @Override // a8.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj, Object obj2) {
                return gxszxtbevo.wflxmlrfwp((State) obj, (State) obj2);
            }
        });
    }
}
