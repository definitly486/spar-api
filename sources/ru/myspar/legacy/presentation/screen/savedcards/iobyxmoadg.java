package ru.myspar.legacy.presentation.screen.savedcards;

import androidx.lifecycle.pkzmftpjix;
import c80.lqeggnwhkg;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f89613btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f89614gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, kd0.iobyxmoadg stateToUiModelMapper, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(stateToUiModelMapper, "stateToUiModelMapper");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f89613btonecajqb = stateToUiModelMapper;
        this.f89614gtknphoqwx = new draadjrbmk() { // from class: id0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.savedcards.iobyxmoadg.mbcevpiqjq((ru.myspar.legacy.presentation.screen.savedcards.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c80.wkgbmnqykc mbcevpiqjq(ppxfxbqfkf ppxfxbqfkfVar) {
        c80.wkgbmnqykc zoijcleaowVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f89615iobyxmoadg)) {
            return c80.wkgbmnqykc.iobyxmoadg.f19205iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            zoijcleaowVar = new c80.wkgbmnqykc.C0350wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2053ppxfxbqfkf) {
            zoijcleaowVar = new c80.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C2053ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg().getItemId());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            zoijcleaowVar = new c80.wkgbmnqykc.zoijcleaow(((ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg());
        }
        return zoijcleaowVar;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f89613btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f89614gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(c80.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof c80.eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.ppxfxbqfkf(((c80.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, c80.eablkybsjg.iobyxmoadg.f19179iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof c80.eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz2 = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((c80.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, c80.eablkybsjg.wkgbmnqykc.f19181iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz3 = cllcsxoeiz(wkgbmnqykc.zoijcleaow.f89621iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
