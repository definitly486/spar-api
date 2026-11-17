package db0;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.iqos.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ya2.iobyxmoadg f27393btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f27394draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f27395gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(t70.lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ya2.iobyxmoadg webViewScreenFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(webViewScreenFeatureApi, "webViewScreenFeatureApi");
        this.f27393btonecajqb = webViewScreenFeatureApi;
        this.f27395gtknphoqwx = new draadjrbmk() { // from class: db0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.sopmlzcsov((State) obj);
            }
        };
        this.f27394draadjrbmk = new draadjrbmk() { // from class: db0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.ntlheqmsrt((lqeggnwhkg) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t70.wkgbmnqykc ntlheqmsrt(lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.zoijcleaow.f27391iobyxmoadg)) {
            return t70.wkgbmnqykc.zoijcleaow.f110027iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.iobyxmoadg.f27389iobyxmoadg)) {
            return t70.wkgbmnqykc.iobyxmoadg.f110025iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.ppxfxbqfkf.f27390iobyxmoadg)) {
            return t70.wkgbmnqykc.ppxfxbqfkf.f110026iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new nufgyqmvbu(state.getWarningMessage());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f27395gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f27394draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(t70.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, t70.eablkybsjg.iobyxmoadg.f110006iobyxmoadg) || zdlpuopuiu.eablkybsjg(eablkybsjgVar, t70.eablkybsjg.zoijcleaow.f110008iobyxmoadg)) {
            Object objCllcsxoeiz = cllcsxoeiz(dxjokdxxww.iobyxmoadg.f27387iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, t70.eablkybsjg.ppxfxbqfkf.f110007iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f27393btonecajqb.zoijcleaow());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
