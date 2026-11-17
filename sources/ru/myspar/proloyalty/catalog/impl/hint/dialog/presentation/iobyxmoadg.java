package ru.myspar.proloyalty.catalog.impl.hint.dialog.presentation;

import androidx.lifecycle.pkzmftpjix;
import fp0.eablkybsjg;
import fp0.lqeggnwhkg;
import gg.wwaezpbzkn;
import gp0.nufgyqmvbu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.catalog.impl.hint.dialog.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f93109btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f93110gtknphoqwx;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.hint.dialog.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2180iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f93111iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f93113yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f93114zdlpuopuiu;

        C2180iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f93113yggfygwlhe = obj;
            this.f93111iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lereixgezr(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f93109btonecajqb = new draadjrbmk() { // from class: gp0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.catalog.impl.hint.dialog.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f93110gtknphoqwx = new draadjrbmk() { // from class: gp0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.catalog.impl.hint.dialog.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.catalog.impl.hint.dialog.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fp0.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f93117iobyxmoadg)) {
            return fp0.wkgbmnqykc.iobyxmoadg.f34505iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new nufgyqmvbu(state.getHintUiModel());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f93109btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f93110gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        C2180iobyxmoadg c2180iobyxmoadg;
        if (gxszxtbevoVar instanceof C2180iobyxmoadg) {
            c2180iobyxmoadg = (C2180iobyxmoadg) gxszxtbevoVar;
            int i13 = c2180iobyxmoadg.f93111iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2180iobyxmoadg.f93111iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2180iobyxmoadg = new C2180iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2180iobyxmoadg = new C2180iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2180iobyxmoadg.f93113yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2180iobyxmoadg.f93111iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) c2180iobyxmoadg.f93114zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = ppxfxbqfkf.iobyxmoadg.f93115iobyxmoadg;
                c2180iobyxmoadg.f93114zdlpuopuiu = null;
                c2180iobyxmoadg.f93111iwizpuwonk = 2;
                if (iobyxmoadgVar.cllcsxoeiz(iobyxmoadgVar2, c2180iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else if (i14 == 2) {
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        if (!(eablkybsjgVar instanceof eablkybsjg.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object obj2 = ppxfxbqfkf.zoijcleaow.f93116iobyxmoadg;
        c2180iobyxmoadg.f93111iwizpuwonk = 3;
        if (cllcsxoeiz(obj2, c2180iobyxmoadg) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
