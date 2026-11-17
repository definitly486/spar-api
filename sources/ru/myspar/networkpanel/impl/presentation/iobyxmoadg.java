package ru.myspar.networkpanel.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import gi0.lqeggnwhkg;
import gi0.wkgbmnqykc;
import hg.jyumaefscl;
import ii0.gxszxtbevo;
import java.util.List;
import ki0.btonecajqb;
import ki0.dxjokdxxww;
import ki0.eablkybsjg;
import ki0.wflxmlrfwp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.networkpanel.impl.domain.model.PayloadHolder;
import ru.myspar.networkpanel.impl.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f90888btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f90889gtknphoqwx;

    /* JADX INFO: renamed from: ru.myspar.networkpanel.impl.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C2108iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f90890iobyxmoadg;

        static {
            int[] iArr = new int[btonecajqb.zoijcleaow.iobyxmoadg.values().length];
            try {
                iArr[btonecajqb.zoijcleaow.iobyxmoadg.HEADERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[btonecajqb.zoijcleaow.iobyxmoadg.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f90890iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f90888btonecajqb = new draadjrbmk() { // from class: ii0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.networkpanel.impl.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f90889gtknphoqwx = new draadjrbmk() { // from class: ii0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.networkpanel.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.networkpanel.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return new wkgbmnqykc.iobyxmoadg(ki0.lqeggnwhkg.iobyxmoadg(((zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg()));
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f90900iobyxmoadg)) {
            return wkgbmnqykc.lqeggnwhkg.f37533iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.dxjokdxxww.f90893iobyxmoadg)) {
            return wkgbmnqykc.eablkybsjg.f37530iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.gxszxtbevo) {
            return new wkgbmnqykc.btonecajqb(((zoijcleaow.gxszxtbevo) zoijcleaowVar).iobyxmoadg());
        }
        if (zoijcleaowVar instanceof zoijcleaow.lqeggnwhkg) {
            return new wkgbmnqykc.dxjokdxxww(((zoijcleaow.lqeggnwhkg) zoijcleaowVar).iobyxmoadg(), ei0.zoijcleaow.REQUEST);
        }
        if (zoijcleaowVar instanceof zoijcleaow.C2109zoijcleaow) {
            return new wkgbmnqykc.zoijcleaow(dxjokdxxww.iobyxmoadg(((zoijcleaow.C2109zoijcleaow) zoijcleaowVar).iobyxmoadg()));
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.eablkybsjg.f90894iobyxmoadg)) {
            return wkgbmnqykc.gxszxtbevo.f37531iobyxmoadg;
        }
        if (!(zoijcleaowVar instanceof zoijcleaow.nufgyqmvbu)) {
            if (zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf) {
                return wkgbmnqykc.nufgyqmvbu.f37534iobyxmoadg;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i13 = C2108iobyxmoadg.f90890iobyxmoadg[((zoijcleaow.nufgyqmvbu) zoijcleaowVar).iobyxmoadg().ordinal()];
        if (i13 == 1) {
            return wkgbmnqykc.C0849wkgbmnqykc.f37536iobyxmoadg;
        }
        if (i13 == 2) {
            return wkgbmnqykc.ppxfxbqfkf.f37535iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        List items = state.getItems();
        List listPpxfxbqfkf = items != null ? eablkybsjg.ppxfxbqfkf(items, state.getType(), state.getSelectedGroupItems()) : null;
        if (listPpxfxbqfkf == null) {
            listPpxfxbqfkf = jyumaefscl.wflxmlrfwp();
        }
        ki0.gxszxtbevo gxszxtbevoVarZoijcleaow = ki0.lqeggnwhkg.zoijcleaow(state.getType());
        PayloadHolder networkPayload = state.getNetworkPayload();
        return new gxszxtbevo(listPpxfxbqfkf, gxszxtbevoVarZoijcleaow, networkPayload != null ? wflxmlrfwp.iobyxmoadg(networkPayload) : null);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f90888btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f90889gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(gi0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, gi0.eablkybsjg.iobyxmoadg.f37498iobyxmoadg)) {
            Object objCllcsxoeiz = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f90891iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof gi0.eablkybsjg.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((gi0.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
