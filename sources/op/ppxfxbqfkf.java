package op;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.impl.domain.deleteaccountfinish.store.State;
import ru.myspar.core.ui.model.MainTab;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final tg.draadjrbmk f73349btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final tg.draadjrbmk f73350gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(cp.lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f73349btonecajqb = new tg.draadjrbmk() { // from class: op.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.sopmlzcsov((State) obj);
            }
        };
        this.f73350gtknphoqwx = new tg.draadjrbmk() { // from class: op.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.ntlheqmsrt((dxjokdxxww) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cp.wkgbmnqykc ntlheqmsrt(dxjokdxxww dxjokdxxwwVar) {
        zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(dxjokdxxwwVar, dxjokdxxww.iobyxmoadg.f73347iobyxmoadg)) {
            return cp.wkgbmnqykc.iobyxmoadg.f25468iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final btonecajqb sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return btonecajqb.f73345iobyxmoadg;
    }

    @Override // ws.zoijcleaow
    protected tg.draadjrbmk esjtqupxsv() {
        return this.f73349btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected tg.draadjrbmk iwizpuwonk() {
        return this.f73350gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(cp.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (!(eablkybsjgVar instanceof cp.eablkybsjg.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
        iobyxmoadgVar.oxmwwwfdhm().eablkybsjg(null);
        iobyxmoadgVar.yadqdtsiqt(MainTab.MY_SPAR, true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
