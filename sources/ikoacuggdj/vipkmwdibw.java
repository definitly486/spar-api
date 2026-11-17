package ikoacuggdj;

import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AtomicReference f44921iobyxmoadg = new AtomicReference(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yj.iobyxmoadg f44922zoijcleaow = yj.lqeggnwhkg.zoijcleaow(false, 1, null);

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ribwqtqdhb f44923iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final pj.auzgnhcxok f44924zoijcleaow;

        public iobyxmoadg(ribwqtqdhb ribwqtqdhbVar, pj.auzgnhcxok auzgnhcxokVar) {
            this.f44923iobyxmoadg = ribwqtqdhbVar;
            this.f44924zoijcleaow = auzgnhcxokVar;
        }

        public final boolean iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
            return this.f44923iobyxmoadg.compareTo(iobyxmoadgVar.f44923iobyxmoadg) >= 0;
        }

        public final void zoijcleaow() {
            this.f44924zoijcleaow.nufgyqmvbu(new MutationInterruptedException());
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f44925cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private /* synthetic */ Object f44926esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        final /* synthetic */ Object f44927istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f44928iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f44929jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ ribwqtqdhb f44930lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ vipkmwdibw f44931pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f44932yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f44933zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f44934zynmafqrjb;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(ribwqtqdhb ribwqtqdhbVar, vipkmwdibw vipkmwdibwVar, tg.rgvfuqvkyq rgvfuqvkyqVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f44930lereixgezr = ribwqtqdhbVar;
            this.f44931pmvmpeiblj = vipkmwdibwVar;
            this.f44934zynmafqrjb = rgvfuqvkyqVar;
            this.f44927istkbnxepw = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f44930lereixgezr, this.f44931pmvmpeiblj, this.f44934zynmafqrjb, this.f44927istkbnxepw, gxszxtbevoVar);
            ppxfxbqfkfVar.f44926esjtqupxsv = obj;
            return ppxfxbqfkfVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, yj.iobyxmoadg] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            yj.iobyxmoadg iobyxmoadgVar;
            tg.rgvfuqvkyq rgvfuqvkyqVar;
            Object obj2;
            iobyxmoadg iobyxmoadgVar2;
            vipkmwdibw vipkmwdibwVar;
            iobyxmoadg iobyxmoadgVar3;
            Throwable th2;
            vipkmwdibw vipkmwdibwVar2;
            yj.iobyxmoadg iobyxmoadgVar4;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            ?? r13 = this.f44925cqumvgiudr;
            try {
                try {
                    if (r13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f44926esjtqupxsv;
                        ribwqtqdhb ribwqtqdhbVar = this.f44930lereixgezr;
                        lg.btonecajqb.zoijcleaow zoijcleaowVar = cllcsxoeizVar.getCoroutineContext().get(pj.auzgnhcxok.f76671gtknphoqwx);
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVar);
                        iobyxmoadg iobyxmoadgVar5 = new iobyxmoadg(ribwqtqdhbVar, (pj.auzgnhcxok) zoijcleaowVar);
                        this.f44931pmvmpeiblj.lqeggnwhkg(iobyxmoadgVar5);
                        iobyxmoadgVar = this.f44931pmvmpeiblj.f44922zoijcleaow;
                        rgvfuqvkyqVar = this.f44934zynmafqrjb;
                        Object obj3 = this.f44927istkbnxepw;
                        vipkmwdibw vipkmwdibwVar3 = this.f44931pmvmpeiblj;
                        this.f44926esjtqupxsv = iobyxmoadgVar5;
                        this.f44933zdlpuopuiu = iobyxmoadgVar;
                        this.f44932yggfygwlhe = rgvfuqvkyqVar;
                        this.f44929jyumaefscl = obj3;
                        this.f44928iwizpuwonk = vipkmwdibwVar3;
                        this.f44925cqumvgiudr = 1;
                        if (iobyxmoadgVar.iobyxmoadg(null, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        obj2 = obj3;
                        iobyxmoadgVar2 = iobyxmoadgVar5;
                        vipkmwdibwVar = vipkmwdibwVar3;
                    } else {
                        if (r13 != 1) {
                            if (r13 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            vipkmwdibwVar2 = (vipkmwdibw) this.f44932yggfygwlhe;
                            iobyxmoadgVar4 = (yj.iobyxmoadg) this.f44933zdlpuopuiu;
                            iobyxmoadgVar3 = (iobyxmoadg) this.f44926esjtqupxsv;
                            try {
                                gg.zdlpuopuiu.zoijcleaow(obj);
                                mbcevpiqjq.wkgbmnqykc.iobyxmoadg(vipkmwdibwVar2.f44921iobyxmoadg, iobyxmoadgVar3, null);
                                iobyxmoadgVar4.eablkybsjg(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                mbcevpiqjq.wkgbmnqykc.iobyxmoadg(vipkmwdibwVar2.f44921iobyxmoadg, iobyxmoadgVar3, null);
                                throw th2;
                            }
                        }
                        vipkmwdibwVar = (vipkmwdibw) this.f44928iwizpuwonk;
                        obj2 = this.f44929jyumaefscl;
                        rgvfuqvkyqVar = (tg.rgvfuqvkyq) this.f44932yggfygwlhe;
                        yj.iobyxmoadg iobyxmoadgVar6 = (yj.iobyxmoadg) this.f44933zdlpuopuiu;
                        iobyxmoadgVar2 = (iobyxmoadg) this.f44926esjtqupxsv;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        iobyxmoadgVar = iobyxmoadgVar6;
                    }
                    this.f44926esjtqupxsv = iobyxmoadgVar2;
                    this.f44933zdlpuopuiu = iobyxmoadgVar;
                    this.f44932yggfygwlhe = vipkmwdibwVar;
                    this.f44929jyumaefscl = null;
                    this.f44928iwizpuwonk = null;
                    this.f44925cqumvgiudr = 2;
                    Object objInvoke = rgvfuqvkyqVar.invoke(obj2, this);
                    if (objInvoke == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    vipkmwdibwVar2 = vipkmwdibwVar;
                    iobyxmoadgVar4 = iobyxmoadgVar;
                    obj = objInvoke;
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                    mbcevpiqjq.wkgbmnqykc.iobyxmoadg(vipkmwdibwVar2.f44921iobyxmoadg, iobyxmoadgVar3, null);
                    iobyxmoadgVar4.eablkybsjg(null);
                    return obj;
                } catch (Throwable th4) {
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                    th2 = th4;
                    vipkmwdibwVar2 = vipkmwdibwVar;
                    mbcevpiqjq.wkgbmnqykc.iobyxmoadg(vipkmwdibwVar2.f44921iobyxmoadg, iobyxmoadgVar3, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r13.eablkybsjg(null);
                throw th5;
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private /* synthetic */ Object f44935cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ ribwqtqdhb f44936esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f44937iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f44938jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ vipkmwdibw f44939lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f44940pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f44941yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f44942zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(ribwqtqdhb ribwqtqdhbVar, vipkmwdibw vipkmwdibwVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f44936esjtqupxsv = ribwqtqdhbVar;
            this.f44939lereixgezr = vipkmwdibwVar;
            this.f44940pmvmpeiblj = draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f44936esjtqupxsv, this.f44939lereixgezr, this.f44940pmvmpeiblj, gxszxtbevoVar);
            zoijcleaowVar.f44935cqumvgiudr = obj;
            return zoijcleaowVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, yj.iobyxmoadg] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            yj.iobyxmoadg iobyxmoadgVar;
            tg.draadjrbmk draadjrbmkVar;
            iobyxmoadg iobyxmoadgVar2;
            vipkmwdibw vipkmwdibwVar;
            iobyxmoadg iobyxmoadgVar3;
            Throwable th2;
            vipkmwdibw vipkmwdibwVar2;
            yj.iobyxmoadg iobyxmoadgVar4;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            ?? r13 = this.f44937iwizpuwonk;
            try {
                try {
                    if (r13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f44935cqumvgiudr;
                        ribwqtqdhb ribwqtqdhbVar = this.f44936esjtqupxsv;
                        lg.btonecajqb.zoijcleaow zoijcleaowVar = cllcsxoeizVar.getCoroutineContext().get(pj.auzgnhcxok.f76671gtknphoqwx);
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVar);
                        iobyxmoadg iobyxmoadgVar5 = new iobyxmoadg(ribwqtqdhbVar, (pj.auzgnhcxok) zoijcleaowVar);
                        this.f44939lereixgezr.lqeggnwhkg(iobyxmoadgVar5);
                        iobyxmoadgVar = this.f44939lereixgezr.f44922zoijcleaow;
                        tg.draadjrbmk draadjrbmkVar2 = this.f44940pmvmpeiblj;
                        vipkmwdibw vipkmwdibwVar3 = this.f44939lereixgezr;
                        this.f44935cqumvgiudr = iobyxmoadgVar5;
                        this.f44942zdlpuopuiu = iobyxmoadgVar;
                        this.f44941yggfygwlhe = draadjrbmkVar2;
                        this.f44938jyumaefscl = vipkmwdibwVar3;
                        this.f44937iwizpuwonk = 1;
                        if (iobyxmoadgVar.iobyxmoadg(null, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        draadjrbmkVar = draadjrbmkVar2;
                        iobyxmoadgVar2 = iobyxmoadgVar5;
                        vipkmwdibwVar = vipkmwdibwVar3;
                    } else {
                        if (r13 != 1) {
                            if (r13 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            vipkmwdibwVar2 = (vipkmwdibw) this.f44941yggfygwlhe;
                            iobyxmoadgVar4 = (yj.iobyxmoadg) this.f44942zdlpuopuiu;
                            iobyxmoadgVar3 = (iobyxmoadg) this.f44935cqumvgiudr;
                            try {
                                gg.zdlpuopuiu.zoijcleaow(obj);
                                mbcevpiqjq.wkgbmnqykc.iobyxmoadg(vipkmwdibwVar2.f44921iobyxmoadg, iobyxmoadgVar3, null);
                                iobyxmoadgVar4.eablkybsjg(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                mbcevpiqjq.wkgbmnqykc.iobyxmoadg(vipkmwdibwVar2.f44921iobyxmoadg, iobyxmoadgVar3, null);
                                throw th2;
                            }
                        }
                        vipkmwdibwVar = (vipkmwdibw) this.f44938jyumaefscl;
                        draadjrbmkVar = (tg.draadjrbmk) this.f44941yggfygwlhe;
                        yj.iobyxmoadg iobyxmoadgVar6 = (yj.iobyxmoadg) this.f44942zdlpuopuiu;
                        iobyxmoadgVar2 = (iobyxmoadg) this.f44935cqumvgiudr;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        iobyxmoadgVar = iobyxmoadgVar6;
                    }
                    this.f44935cqumvgiudr = iobyxmoadgVar2;
                    this.f44942zdlpuopuiu = iobyxmoadgVar;
                    this.f44941yggfygwlhe = vipkmwdibwVar;
                    this.f44938jyumaefscl = null;
                    this.f44937iwizpuwonk = 2;
                    Object objInvoke = draadjrbmkVar.invoke(this);
                    if (objInvoke == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    vipkmwdibwVar2 = vipkmwdibwVar;
                    iobyxmoadgVar4 = iobyxmoadgVar;
                    obj = objInvoke;
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                    mbcevpiqjq.wkgbmnqykc.iobyxmoadg(vipkmwdibwVar2.f44921iobyxmoadg, iobyxmoadgVar3, null);
                    iobyxmoadgVar4.eablkybsjg(null);
                    return obj;
                } catch (Throwable th4) {
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                    th2 = th4;
                    vipkmwdibwVar2 = vipkmwdibwVar;
                    mbcevpiqjq.wkgbmnqykc.iobyxmoadg(vipkmwdibwVar2.f44921iobyxmoadg, iobyxmoadgVar3, null);
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

    public static /* synthetic */ Object eablkybsjg(vipkmwdibw vipkmwdibwVar, ribwqtqdhb ribwqtqdhbVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            ribwqtqdhbVar = ribwqtqdhb.Default;
        }
        return vipkmwdibwVar.wkgbmnqykc(ribwqtqdhbVar, draadjrbmkVar, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lqeggnwhkg(iobyxmoadg iobyxmoadgVar) {
        iobyxmoadg iobyxmoadgVar2;
        do {
            iobyxmoadgVar2 = (iobyxmoadg) this.f44921iobyxmoadg.get();
            if (iobyxmoadgVar2 != null && !iobyxmoadgVar.iobyxmoadg(iobyxmoadgVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f44921iobyxmoadg, iobyxmoadgVar2, iobyxmoadgVar));
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.zoijcleaow();
        }
    }

    public final Object gxszxtbevo(Object obj, ribwqtqdhb ribwqtqdhbVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        return pj.dsvhmnatus.gxszxtbevo(new ppxfxbqfkf(ribwqtqdhbVar, this, rgvfuqvkyqVar, obj, null), gxszxtbevoVar);
    }

    public final Object wkgbmnqykc(ribwqtqdhb ribwqtqdhbVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        return pj.dsvhmnatus.gxszxtbevo(new zoijcleaow(ribwqtqdhbVar, this, draadjrbmkVar, null), gxszxtbevoVar);
    }
}
