package ky1;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.purchases.impl.list_shared_with_you.domain.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yy1.iobyxmoadg f61084ppxfxbqfkf;

    /* JADX INFO: renamed from: ky1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1226iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61086zdlpuopuiu;

        C1226iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C1226iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f61086zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(gxszxtbevo.zoijcleaow.f61083iobyxmoadg);
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    yy1.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f61084ppxfxbqfkf;
                    String purchaseListId = iobyxmoadg.okpsazkaxt(iobyxmoadgVar).getPurchaseListId();
                    this.f61086zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.wkgbmnqykc(purchaseListId, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((String) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.crxdokpmqz(new eablkybsjg.zoijcleaow((String) objWkgbmnqykc));
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.metgxyhuhe(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(gxszxtbevo.iobyxmoadg.f61082iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C1226iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, yy1.iobyxmoadg purchasesListComponentApi) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        this.f61084ppxfxbqfkf = purchasesListComponentApi;
    }

    private final void jztzpxfvev() {
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1226iobyxmoadg(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void metgxyhuhe(Throwable th2) {
        crxdokpmqz(new eablkybsjg.ppxfxbqfkf(th2));
    }

    public static final /* synthetic */ State okpsazkaxt(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f61090iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f61079iobyxmoadg);
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f61091iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            jztzpxfvev();
        }
    }
}
