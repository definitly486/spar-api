package h6;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kegysxyocb {

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ g6.dsvhmnatus f39576jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f39577yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ dsvhmnatus f39578zdlpuopuiu;

        /* JADX INFO: renamed from: h6.kegysxyocb$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0908iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ String f39579jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ dsvhmnatus f39580yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ g6.dsvhmnatus f39581zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0908iobyxmoadg(g6.dsvhmnatus dsvhmnatusVar, dsvhmnatus dsvhmnatusVar2, String str) {
                super(0);
                this.f39581zdlpuopuiu = dsvhmnatusVar;
                this.f39580yggfygwlhe = dsvhmnatusVar2;
                this.f39579jyumaefscl = str;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                q6.gxszxtbevo.zoijcleaow(new iozdgvuglv(this.f39580yggfygwlhe, this.f39579jyumaefscl, g6.dxjokdxxww.KEEP, hg.jyumaefscl.eablkybsjg(this.f39581zdlpuopuiu)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(dsvhmnatus dsvhmnatusVar, String str, g6.dsvhmnatus dsvhmnatusVar2) {
            super(0);
            this.f39578zdlpuopuiu = dsvhmnatusVar;
            this.f39577yggfygwlhe = str;
            this.f39576jyumaefscl = dsvhmnatusVar2;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            C0908iobyxmoadg c0908iobyxmoadg = new C0908iobyxmoadg(this.f39576jyumaefscl, this.f39578zdlpuopuiu, this.f39577yggfygwlhe);
            p6.jyumaefscl jyumaefsclVarUlzqkzuiru = this.f39578zdlpuopuiu.yggfygwlhe().ulzqkzuiru();
            List listRgvfuqvkyq = jyumaefsclVarUlzqkzuiru.rgvfuqvkyq(this.f39577yggfygwlhe);
            if (listRgvfuqvkyq.size() > 1) {
                throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
            }
            p6.yggfygwlhe.zoijcleaow zoijcleaowVar = (p6.yggfygwlhe.zoijcleaow) hg.jyumaefscl.weqkydbzbr(listRgvfuqvkyq);
            if (zoijcleaowVar == null) {
                c0908iobyxmoadg.invoke();
                return;
            }
            p6.yggfygwlhe yggfygwlheVarDxjokdxxww = jyumaefsclVarUlzqkzuiru.dxjokdxxww(zoijcleaowVar.f75829iobyxmoadg);
            if (yggfygwlheVarDxjokdxxww == null) {
                throw new IllegalStateException("WorkSpec with " + zoijcleaowVar.f75829iobyxmoadg + ", that matches a name \"" + this.f39577yggfygwlhe + "\", wasn't found");
            }
            if (!yggfygwlheVarDxjokdxxww.agtfadlqog()) {
                throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            }
            if (zoijcleaowVar.f75830zoijcleaow == g6.hkdspvbjdz.ppxfxbqfkf.CANCELLED) {
                jyumaefsclVarUlzqkzuiru.iobyxmoadg(zoijcleaowVar.f75829iobyxmoadg);
                c0908iobyxmoadg.invoke();
                return;
            }
            p6.yggfygwlhe yggfygwlheVarEablkybsjg = p6.yggfygwlhe.eablkybsjg(this.f39576jyumaefscl.wkgbmnqykc(), zoijcleaowVar.f75829iobyxmoadg, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777214, null);
            zdlpuopuiu processor = this.f39578zdlpuopuiu.oxmwwwfdhm();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(processor, "processor");
            WorkDatabase workDatabase = this.f39578zdlpuopuiu.yggfygwlhe();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(workDatabase, "workDatabase");
            androidx.work.iobyxmoadg configuration = this.f39578zdlpuopuiu.agtfadlqog();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(configuration, "configuration");
            List schedulers = this.f39578zdlpuopuiu.kcexrzcfyt();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(schedulers, "schedulers");
            kegysxyocb.wkgbmnqykc(processor, workDatabase, configuration, schedulers, yggfygwlheVarEablkybsjg, this.f39576jyumaefscl.ppxfxbqfkf());
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f39582zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final String invoke(p6.yggfygwlhe spec) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(spec, "spec");
            return spec.agtfadlqog() ? "Periodic" : "OneTime";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(WorkDatabase workDatabase, p6.yggfygwlhe yggfygwlheVar, p6.yggfygwlhe yggfygwlheVar2, List list, String str, Set set, boolean z13) {
        p6.jyumaefscl jyumaefsclVarUlzqkzuiru = workDatabase.ulzqkzuiru();
        p6.zynmafqrjb zynmafqrjbVarSopmlzcsov = workDatabase.sopmlzcsov();
        p6.yggfygwlhe yggfygwlheVarEablkybsjg = p6.yggfygwlhe.eablkybsjg(yggfygwlheVar2, null, yggfygwlheVar.f75811zoijcleaow, null, null, null, null, 0L, 0L, 0L, null, yggfygwlheVar.f75794gtknphoqwx, null, 0L, yggfygwlheVar.f75788agtfadlqog, 0L, 0L, false, null, yggfygwlheVar.dxjokdxxww(), yggfygwlheVar.gxszxtbevo() + 1, yggfygwlheVar.lqeggnwhkg(), yggfygwlheVar.nufgyqmvbu(), 0, null, 12835837, null);
        if (yggfygwlheVar2.nufgyqmvbu() == 1) {
            yggfygwlheVarEablkybsjg.ojitshcjhn(yggfygwlheVar2.lqeggnwhkg());
            yggfygwlheVarEablkybsjg.rgvfuqvkyq(yggfygwlheVarEablkybsjg.nufgyqmvbu() + 1);
        }
        jyumaefsclVarUlzqkzuiru.pmvmpeiblj(q6.lqeggnwhkg.ppxfxbqfkf(list, yggfygwlheVarEablkybsjg));
        zynmafqrjbVarSopmlzcsov.ppxfxbqfkf(str);
        zynmafqrjbVarSopmlzcsov.wkgbmnqykc(str, set);
        if (z13) {
            return;
        }
        jyumaefsclVarUlzqkzuiru.ojitshcjhn(str, -1L);
        workDatabase.ntlheqmsrt().iobyxmoadg(str);
    }

    public static final g6.esjtqupxsv ppxfxbqfkf(dsvhmnatus dsvhmnatusVar, String name, g6.dsvhmnatus workRequest) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dsvhmnatusVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workRequest, "workRequest");
        g6.pkzmftpjix pkzmftpjixVarAgtfadlqog = dsvhmnatusVar.agtfadlqog().agtfadlqog();
        String str = "enqueueUniquePeriodic_" + name;
        r6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = dsvhmnatusVar.jyumaefscl().ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "workTaskExecutor.serialTaskExecutor");
        return g6.istkbnxepw.ppxfxbqfkf(pkzmftpjixVarAgtfadlqog, str, iobyxmoadgVarPpxfxbqfkf, new iobyxmoadg(dsvhmnatusVar, name, workRequest));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g6.cllcsxoeiz.zoijcleaow wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar, final WorkDatabase workDatabase, androidx.work.iobyxmoadg iobyxmoadgVar, final List list, final p6.yggfygwlhe yggfygwlheVar, final Set set) {
        final String str = yggfygwlheVar.f75796iobyxmoadg;
        final p6.yggfygwlhe yggfygwlheVarDxjokdxxww = workDatabase.ulzqkzuiru().dxjokdxxww(str);
        if (yggfygwlheVarDxjokdxxww == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (yggfygwlheVarDxjokdxxww.f75811zoijcleaow.wkgbmnqykc()) {
            return g6.cllcsxoeiz.zoijcleaow.NOT_APPLIED;
        }
        if (yggfygwlheVarDxjokdxxww.agtfadlqog() ^ yggfygwlheVar.agtfadlqog()) {
            zoijcleaow zoijcleaowVar = zoijcleaow.f39582zdlpuopuiu;
            throw new UnsupportedOperationException("Can't update " + ((String) zoijcleaowVar.invoke(yggfygwlheVarDxjokdxxww)) + " Worker to " + ((String) zoijcleaowVar.invoke(yggfygwlheVar)) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean zGtknphoqwx = zdlpuopuiuVar.gtknphoqwx(str);
        if (!zGtknphoqwx) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((jyumaefscl) it.next()).iobyxmoadg(str);
            }
        }
        workDatabase.cllcsxoeiz(new Runnable() { // from class: h6.stevsuqkhv
            @Override // java.lang.Runnable
            public final void run() {
                kegysxyocb.eablkybsjg(workDatabase, yggfygwlheVarDxjokdxxww, yggfygwlheVar, list, str, set, zGtknphoqwx);
            }
        });
        if (!zGtknphoqwx) {
            androidx.work.impl.iobyxmoadg.nufgyqmvbu(iobyxmoadgVar, workDatabase, list);
        }
        return zGtknphoqwx ? g6.cllcsxoeiz.zoijcleaow.APPLIED_FOR_NEXT_RUN : g6.cllcsxoeiz.zoijcleaow.APPLIED_IMMEDIATELY;
    }
}
