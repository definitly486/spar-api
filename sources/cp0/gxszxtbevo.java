package cp0;

import a8.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.impl.choosesort.domain.ChooseSortDialogArgs;
import ru.myspar.proloyalty.catalog.impl.choosesort.domain.State;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f25469ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f25470wkgbmnqykc;

    public gxszxtbevo(lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f25469ppxfxbqfkf = storeFactory;
        this.f25470wkgbmnqykc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State agtfadlqog(State create, State result) {
        zdlpuopuiu.btonecajqb(create, "$this$create");
        zdlpuopuiu.btonecajqb(result, "result");
        return result;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(((ChooseSortDialogArgs) gxszxtbevo()).getSelected(), ((ChooseSortDialogArgs) gxszxtbevo()).getSupportedTypes(), ((ChooseSortDialogArgs) gxszxtbevo()).getColorsUiModel());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f25469ppxfxbqfkf, state, new a8.wkgbmnqykc(zoijcleaow.iobyxmoadg.f25473iobyxmoadg), this.f25470wkgbmnqykc, new a8.ppxfxbqfkf() { // from class: cp0.eablkybsjg
            @Override // a8.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj, Object obj2) {
                return gxszxtbevo.agtfadlqog((State) obj, (State) obj2);
            }
        });
    }
}
