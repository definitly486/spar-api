package ru.myspar.proloyalty.catalog.impl.choosesort.presentation;

import androidx.lifecycle.pkzmftpjix;
import cp0.gxszxtbevo;
import cp0.wkgbmnqykc;
import dp0.lqeggnwhkg;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.impl.choosesort.domain.State;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f93082btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f93083gtknphoqwx;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.choosesort.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2179iobyxmoadg implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(dp0.ppxfxbqfkf.zoijcleaow((mz0.ppxfxbqfkf) obj)), Integer.valueOf(dp0.ppxfxbqfkf.zoijcleaow((mz0.ppxfxbqfkf) obj2)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(gxszxtbevo store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f93082btonecajqb = new draadjrbmk() { // from class: dp0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.catalog.impl.choosesort.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f93083gtknphoqwx = new draadjrbmk() { // from class: dp0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.catalog.impl.choosesort.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.catalog.impl.choosesort.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cp0.ppxfxbqfkf ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return new cp0.ppxfxbqfkf.iobyxmoadg(((zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lqeggnwhkg sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        mz0.ppxfxbqfkf selected = state.getSelected();
        List listD = jyumaefscl.d(state.getSupportedTypes(), new C2179iobyxmoadg());
        ColorsModel colorsModel = state.getColorsModel();
        return new lqeggnwhkg(selected, listD, colorsModel != null ? n91.zoijcleaow.iobyxmoadg(colorsModel) : null);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f93082btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f93083gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (!(wkgbmnqykcVar instanceof wkgbmnqykc.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar).iobyxmoadg()), gxszxtbevoVar);
        return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
    }
}
