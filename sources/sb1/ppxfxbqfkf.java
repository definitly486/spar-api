package sb1;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.sparclub.store.SparClubStore$State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f105960btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f105961gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(s61.gxszxtbevo store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f105960btonecajqb = new draadjrbmk() { // from class: sb1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.sopmlzcsov((SparClubStore$State) obj);
            }
        };
        this.f105961gtknphoqwx = new draadjrbmk() { // from class: sb1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.ntlheqmsrt((lqeggnwhkg) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s61.ppxfxbqfkf ntlheqmsrt(lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.iobyxmoadg.f105957iobyxmoadg)) {
            return s61.ppxfxbqfkf.iobyxmoadg.f105608iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.zoijcleaow.f105958iobyxmoadg)) {
            return s61.ppxfxbqfkf.zoijcleaow.f105609iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(SparClubStore$State sparClubStore$State) {
        zdlpuopuiu.btonecajqb(sparClubStore$State, "<this>");
        return nufgyqmvbu.f105959iobyxmoadg;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f105960btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f105961gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(s61.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (wkgbmnqykcVar instanceof s61.wkgbmnqykc.zoijcleaow) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(m21.dxjokdxxww.f64969iobyxmoadg.jyumaefscl(((s61.wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg()));
        } else {
            if (!zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, s61.wkgbmnqykc.iobyxmoadg.f105610iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
