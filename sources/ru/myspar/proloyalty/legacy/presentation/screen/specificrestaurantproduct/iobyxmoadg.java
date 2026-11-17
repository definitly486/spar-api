package ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurantproduct;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import tg.draadjrbmk;
import v61.eablkybsjg;
import v61.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final an0.iobyxmoadg f97536btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f97537draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f97538gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, yb1.iobyxmoadg stateToUiModelMapper, an0.iobyxmoadg authFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(stateToUiModelMapper, "stateToUiModelMapper");
        zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        this.f97536btonecajqb = authFeatureApi;
        this.f97538gtknphoqwx = stateToUiModelMapper;
        this.f97537draadjrbmk = new draadjrbmk() { // from class: xb1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurantproduct.iobyxmoadg.mbcevpiqjq((ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurantproduct.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v61.wkgbmnqykc mbcevpiqjq(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2306zoijcleaow.f97547iobyxmoadg)) {
            return v61.wkgbmnqykc.zoijcleaow.f116240iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f97546iobyxmoadg)) {
            return v61.wkgbmnqykc.ppxfxbqfkf.f116238iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return new v61.wkgbmnqykc.iobyxmoadg(((zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f97538gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f97537draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f116197iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else {
            if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f116200iobyxmoadg)) {
                if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.wkgbmnqykc.f116199iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.zoijcleaow.f97540iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f97536btonecajqb.eablkybsjg());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
