package ru.myspar.proloyalty.options.impl.themeswitch.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.options.impl.themeswitch.domain.store.State;
import tf1.eablkybsjg;
import tf1.nufgyqmvbu;
import tg.draadjrbmk;
import vf1.gxszxtbevo;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f98620btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f98621gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(nufgyqmvbu store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f98620btonecajqb = new draadjrbmk() { // from class: vf1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.options.impl.themeswitch.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f98621gtknphoqwx = new draadjrbmk() { // from class: vf1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.options.impl.themeswitch.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.options.impl.themeswitch.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eablkybsjg ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return new eablkybsjg.iobyxmoadg(((zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new gxszxtbevo(state.getDarkModeState());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f98620btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f98621gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(tf1.gxszxtbevo gxszxtbevoVar, lg.gxszxtbevo gxszxtbevoVar2) {
        if (!zdlpuopuiu.eablkybsjg(gxszxtbevoVar, tf1.gxszxtbevo.iobyxmoadg.f110449iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f98622iobyxmoadg, gxszxtbevoVar2);
        return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
    }
}
