package jb0;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import ru.myspar.domain.feature.update.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class draadjrbmk extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final tg.draadjrbmk f51025btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final tg.draadjrbmk f51026gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(n80.nufgyqmvbu store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f51025btonecajqb = new tg.draadjrbmk() { // from class: jb0.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.sopmlzcsov((State) obj);
            }
        };
        this.f51026gtknphoqwx = new tg.draadjrbmk() { // from class: jb0.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.ntlheqmsrt((oxmwwwfdhm) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n80.eablkybsjg ntlheqmsrt(oxmwwwfdhm oxmwwwfdhmVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(oxmwwwfdhmVar, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(oxmwwwfdhmVar, oxmwwwfdhm.iobyxmoadg.f51045iobyxmoadg)) {
            return n80.eablkybsjg.iobyxmoadg.f69351iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kcexrzcfyt sopmlzcsov(State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        return new kcexrzcfyt(state.getTitle(), state.getMessage(), false, false, state.getCardNumber(), 12, null);
    }

    @Override // ws.zoijcleaow
    protected tg.draadjrbmk esjtqupxsv() {
        return this.f51025btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected tg.draadjrbmk iwizpuwonk() {
        return this.f51026gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(n80.gxszxtbevo gxszxtbevoVar, lg.gxszxtbevo gxszxtbevoVar2) {
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar, n80.gxszxtbevo.iobyxmoadg.f69352iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(h40.dxjokdxxww.f39382iobyxmoadg.kcexrzcfyt());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
