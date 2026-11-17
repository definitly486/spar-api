package vipkmwdibw;

import androidx.compose.animation.core.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class jhduphickx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AtomicReference f117145iobyxmoadg = new AtomicReference(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yj.iobyxmoadg f117146zoijcleaow = yj.lqeggnwhkg.zoijcleaow(false, 1, null);

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final vipkmwdibw f117147iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final pj.auzgnhcxok f117148zoijcleaow;

        public iobyxmoadg(vipkmwdibw vipkmwdibwVar, pj.auzgnhcxok auzgnhcxokVar) {
            this.f117147iobyxmoadg = vipkmwdibwVar;
            this.f117148zoijcleaow = auzgnhcxokVar;
        }

        public final boolean iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
            return this.f117147iobyxmoadg.compareTo(iobyxmoadgVar.f117147iobyxmoadg) >= 0;
        }

        public final void zoijcleaow() {
            this.f117148zoijcleaow.nufgyqmvbu(new MutationInterruptedException());
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private /* synthetic */ Object f117149cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ vipkmwdibw f117150esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f117151iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f117152jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ jhduphickx f117153lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f117154pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f117155yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f117156zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(vipkmwdibw vipkmwdibwVar, jhduphickx jhduphickxVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f117150esjtqupxsv = vipkmwdibwVar;
            this.f117153lereixgezr = jhduphickxVar;
            this.f117154pmvmpeiblj = draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f117150esjtqupxsv, this.f117153lereixgezr, this.f117154pmvmpeiblj, gxszxtbevoVar);
            zoijcleaowVar.f117149cqumvgiudr = obj;
            return zoijcleaowVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, yj.iobyxmoadg] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            yj.iobyxmoadg iobyxmoadgVar;
            tg.draadjrbmk draadjrbmkVar;
            iobyxmoadg iobyxmoadgVar2;
            jhduphickx jhduphickxVar;
            iobyxmoadg iobyxmoadgVar3;
            Throwable th2;
            jhduphickx jhduphickxVar2;
            yj.iobyxmoadg iobyxmoadgVar4;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            ?? r13 = this.f117151iwizpuwonk;
            try {
                try {
                    if (r13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f117149cqumvgiudr;
                        vipkmwdibw vipkmwdibwVar = this.f117150esjtqupxsv;
                        lg.btonecajqb.zoijcleaow zoijcleaowVar = cllcsxoeizVar.getCoroutineContext().get(pj.auzgnhcxok.f76671gtknphoqwx);
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVar);
                        iobyxmoadg iobyxmoadgVar5 = new iobyxmoadg(vipkmwdibwVar, (pj.auzgnhcxok) zoijcleaowVar);
                        this.f117153lereixgezr.gxszxtbevo(iobyxmoadgVar5);
                        iobyxmoadgVar = this.f117153lereixgezr.f117146zoijcleaow;
                        tg.draadjrbmk draadjrbmkVar2 = this.f117154pmvmpeiblj;
                        jhduphickx jhduphickxVar3 = this.f117153lereixgezr;
                        this.f117149cqumvgiudr = iobyxmoadgVar5;
                        this.f117156zdlpuopuiu = iobyxmoadgVar;
                        this.f117155yggfygwlhe = draadjrbmkVar2;
                        this.f117152jyumaefscl = jhduphickxVar3;
                        this.f117151iwizpuwonk = 1;
                        if (iobyxmoadgVar.iobyxmoadg(null, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        draadjrbmkVar = draadjrbmkVar2;
                        iobyxmoadgVar2 = iobyxmoadgVar5;
                        jhduphickxVar = jhduphickxVar3;
                    } else {
                        if (r13 != 1) {
                            if (r13 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            jhduphickxVar2 = (jhduphickx) this.f117155yggfygwlhe;
                            iobyxmoadgVar4 = (yj.iobyxmoadg) this.f117156zdlpuopuiu;
                            iobyxmoadgVar3 = (iobyxmoadg) this.f117149cqumvgiudr;
                            try {
                                gg.zdlpuopuiu.zoijcleaow(obj);
                                mbcevpiqjq.wkgbmnqykc.iobyxmoadg(jhduphickxVar2.f117145iobyxmoadg, iobyxmoadgVar3, null);
                                iobyxmoadgVar4.eablkybsjg(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                mbcevpiqjq.wkgbmnqykc.iobyxmoadg(jhduphickxVar2.f117145iobyxmoadg, iobyxmoadgVar3, null);
                                throw th2;
                            }
                        }
                        jhduphickxVar = (jhduphickx) this.f117152jyumaefscl;
                        draadjrbmkVar = (tg.draadjrbmk) this.f117155yggfygwlhe;
                        yj.iobyxmoadg iobyxmoadgVar6 = (yj.iobyxmoadg) this.f117156zdlpuopuiu;
                        iobyxmoadgVar2 = (iobyxmoadg) this.f117149cqumvgiudr;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        iobyxmoadgVar = iobyxmoadgVar6;
                    }
                    this.f117149cqumvgiudr = iobyxmoadgVar2;
                    this.f117156zdlpuopuiu = iobyxmoadgVar;
                    this.f117155yggfygwlhe = jhduphickxVar;
                    this.f117152jyumaefscl = null;
                    this.f117151iwizpuwonk = 2;
                    Object objInvoke = draadjrbmkVar.invoke(this);
                    if (objInvoke == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    jhduphickxVar2 = jhduphickxVar;
                    iobyxmoadgVar4 = iobyxmoadgVar;
                    obj = objInvoke;
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                    mbcevpiqjq.wkgbmnqykc.iobyxmoadg(jhduphickxVar2.f117145iobyxmoadg, iobyxmoadgVar3, null);
                    iobyxmoadgVar4.eablkybsjg(null);
                    return obj;
                } catch (Throwable th4) {
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                    th2 = th4;
                    jhduphickxVar2 = jhduphickxVar;
                    mbcevpiqjq.wkgbmnqykc.iobyxmoadg(jhduphickxVar2.f117145iobyxmoadg, iobyxmoadgVar3, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r13.eablkybsjg(null);
                throw th5;
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static /* synthetic */ Object eablkybsjg(jhduphickx jhduphickxVar, vipkmwdibw vipkmwdibwVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            vipkmwdibwVar = vipkmwdibw.Default;
        }
        return jhduphickxVar.wkgbmnqykc(vipkmwdibwVar, draadjrbmkVar, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gxszxtbevo(iobyxmoadg iobyxmoadgVar) {
        iobyxmoadg iobyxmoadgVar2;
        do {
            iobyxmoadgVar2 = (iobyxmoadg) this.f117145iobyxmoadg.get();
            if (iobyxmoadgVar2 != null && !iobyxmoadgVar.iobyxmoadg(iobyxmoadgVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f117145iobyxmoadg, iobyxmoadgVar2, iobyxmoadgVar));
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.zoijcleaow();
        }
    }

    public final Object wkgbmnqykc(vipkmwdibw vipkmwdibwVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        return pj.dsvhmnatus.gxszxtbevo(new zoijcleaow(vipkmwdibwVar, this, draadjrbmkVar, null), gxszxtbevoVar);
    }
}
