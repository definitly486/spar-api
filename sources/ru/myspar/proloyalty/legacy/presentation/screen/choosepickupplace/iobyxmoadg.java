package ru.myspar.proloyalty.legacy.presentation.screen.choosepickupplace;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import r91.lqeggnwhkg;
import ru.myspar.proloyalty.domain.feature.choosepickupplace.store.ChoosePickupPlaceStore$State;
import tg.draadjrbmk;
import y51.gxszxtbevo;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f96651btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f96652gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(gxszxtbevo store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f96651btonecajqb = new draadjrbmk() { // from class: r91.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.choosepickupplace.iobyxmoadg.sopmlzcsov((ChoosePickupPlaceStore$State) obj);
            }
        };
        this.f96652gtknphoqwx = new draadjrbmk() { // from class: r91.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.choosepickupplace.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.legacy.presentation.screen.choosepickupplace.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y51.ppxfxbqfkf ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f96655iobyxmoadg)) {
            return y51.ppxfxbqfkf.iobyxmoadg.f123936iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2283zoijcleaow.f96656iobyxmoadg)) {
            return y51.ppxfxbqfkf.zoijcleaow.f123937iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lqeggnwhkg sopmlzcsov(ChoosePickupPlaceStore$State choosePickupPlaceStore$State) {
        zdlpuopuiu.btonecajqb(choosePickupPlaceStore$State, "<this>");
        return lqeggnwhkg.f82214iobyxmoadg;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f96651btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f96652gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(y51.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, y51.wkgbmnqykc.iobyxmoadg.f123938iobyxmoadg)) {
            Object objCllcsxoeiz = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f96653iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, y51.wkgbmnqykc.zoijcleaow.f123939iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.zoijcleaow.f96654iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
