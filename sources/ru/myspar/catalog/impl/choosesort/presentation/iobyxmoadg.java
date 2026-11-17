package ru.myspar.catalog.impl.choosesort.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import qq.gxszxtbevo;
import qq.wkgbmnqykc;
import rq.lqeggnwhkg;
import ru.myspar.catalog.impl.choosesort.domain.State;
import ru.myspar.core.domain.models.ColorsModel;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f85158btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f85159gtknphoqwx;

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.choosesort.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1937iobyxmoadg implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(rq.ppxfxbqfkf.zoijcleaow((v00.ppxfxbqfkf) obj)), Integer.valueOf(rq.ppxfxbqfkf.zoijcleaow((v00.ppxfxbqfkf) obj2)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(gxszxtbevo store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f85158btonecajqb = new draadjrbmk() { // from class: rq.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.catalog.impl.choosesort.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f85159gtknphoqwx = new draadjrbmk() { // from class: rq.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.catalog.impl.choosesort.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.catalog.impl.choosesort.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qq.ppxfxbqfkf ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return new qq.ppxfxbqfkf.iobyxmoadg(((zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lqeggnwhkg sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        v00.ppxfxbqfkf selected = state.getSelected();
        List listD = jyumaefscl.d(state.getSupportedTypes(), new C1937iobyxmoadg());
        ColorsModel colorsModel = state.getColorsModel();
        return new lqeggnwhkg(selected, listD, colorsModel != null ? ob0.zoijcleaow.iobyxmoadg(colorsModel) : null);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f85158btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f85159gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (!(wkgbmnqykcVar instanceof wkgbmnqykc.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar).iobyxmoadg()), gxszxtbevoVar);
        return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
    }
}
