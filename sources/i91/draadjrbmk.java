package i91;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import ru.myspar.proloyalty.domain.feature.update.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class draadjrbmk extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final tg.draadjrbmk f42146btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final tg.draadjrbmk f42147gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(w61.lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f42146btonecajqb = new tg.draadjrbmk() { // from class: i91.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.sopmlzcsov((State) obj);
            }
        };
        this.f42147gtknphoqwx = new tg.draadjrbmk() { // from class: i91.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.ntlheqmsrt((oxmwwwfdhm) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w61.wkgbmnqykc ntlheqmsrt(oxmwwwfdhm oxmwwwfdhmVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(oxmwwwfdhmVar, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(oxmwwwfdhmVar, oxmwwwfdhm.iobyxmoadg.f42164iobyxmoadg)) {
            return w61.wkgbmnqykc.iobyxmoadg.f118896iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kcexrzcfyt sopmlzcsov(State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        return new kcexrzcfyt(state.getTitle(), state.getMessage(), false, false, state.getCardNumber(), 12, null);
    }

    @Override // pr0.zoijcleaow
    protected tg.draadjrbmk esjtqupxsv() {
        return this.f42146btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected tg.draadjrbmk iwizpuwonk() {
        return this.f42147gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(w61.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, w61.eablkybsjg.iobyxmoadg.f118878iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(m21.dxjokdxxww.f64969iobyxmoadg.kcexrzcfyt());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
