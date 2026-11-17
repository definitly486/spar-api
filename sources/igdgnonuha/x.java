package igdgnonuha;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AtomicReference f44093iobyxmoadg = new AtomicReference(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yj.iobyxmoadg f44094zoijcleaow = yj.lqeggnwhkg.zoijcleaow(false, 1, null);

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ikoacuggdj.ribwqtqdhb f44095iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final pj.auzgnhcxok f44096zoijcleaow;

        public iobyxmoadg(ikoacuggdj.ribwqtqdhb ribwqtqdhbVar, pj.auzgnhcxok auzgnhcxokVar) {
            this.f44095iobyxmoadg = ribwqtqdhbVar;
            this.f44096zoijcleaow = auzgnhcxokVar;
        }

        public final boolean iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
            return this.f44095iobyxmoadg.compareTo(iobyxmoadgVar.f44095iobyxmoadg) >= 0;
        }

        public final void zoijcleaow() {
            pj.auzgnhcxok.iobyxmoadg.iobyxmoadg(this.f44096zoijcleaow, null, 1, null);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private /* synthetic */ Object f44097cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ ikoacuggdj.ribwqtqdhb f44098esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f44099iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f44100jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ x f44101lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f44102pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f44103yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f44104zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(ikoacuggdj.ribwqtqdhb ribwqtqdhbVar, x xVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f44098esjtqupxsv = ribwqtqdhbVar;
            this.f44101lereixgezr = xVar;
            this.f44102pmvmpeiblj = draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f44098esjtqupxsv, this.f44101lereixgezr, this.f44102pmvmpeiblj, gxszxtbevoVar);
            zoijcleaowVar.f44097cqumvgiudr = obj;
            return zoijcleaowVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, yj.iobyxmoadg] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            yj.iobyxmoadg iobyxmoadgVar;
            tg.draadjrbmk draadjrbmkVar;
            iobyxmoadg iobyxmoadgVar2;
            x xVar;
            iobyxmoadg iobyxmoadgVar3;
            Throwable th2;
            x xVar2;
            yj.iobyxmoadg iobyxmoadgVar4;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            ?? r13 = this.f44099iwizpuwonk;
            try {
                try {
                    if (r13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f44097cqumvgiudr;
                        ikoacuggdj.ribwqtqdhb ribwqtqdhbVar = this.f44098esjtqupxsv;
                        lg.btonecajqb.zoijcleaow zoijcleaowVar = cllcsxoeizVar.getCoroutineContext().get(pj.auzgnhcxok.f76671gtknphoqwx);
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVar);
                        iobyxmoadg iobyxmoadgVar5 = new iobyxmoadg(ribwqtqdhbVar, (pj.auzgnhcxok) zoijcleaowVar);
                        this.f44101lereixgezr.gxszxtbevo(iobyxmoadgVar5);
                        iobyxmoadgVar = this.f44101lereixgezr.f44094zoijcleaow;
                        tg.draadjrbmk draadjrbmkVar2 = this.f44102pmvmpeiblj;
                        x xVar3 = this.f44101lereixgezr;
                        this.f44097cqumvgiudr = iobyxmoadgVar5;
                        this.f44104zdlpuopuiu = iobyxmoadgVar;
                        this.f44103yggfygwlhe = draadjrbmkVar2;
                        this.f44100jyumaefscl = xVar3;
                        this.f44099iwizpuwonk = 1;
                        if (iobyxmoadgVar.iobyxmoadg(null, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        draadjrbmkVar = draadjrbmkVar2;
                        iobyxmoadgVar2 = iobyxmoadgVar5;
                        xVar = xVar3;
                    } else {
                        if (r13 != 1) {
                            if (r13 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            xVar2 = (x) this.f44103yggfygwlhe;
                            iobyxmoadgVar4 = (yj.iobyxmoadg) this.f44104zdlpuopuiu;
                            iobyxmoadgVar3 = (iobyxmoadg) this.f44097cqumvgiudr;
                            try {
                                gg.zdlpuopuiu.zoijcleaow(obj);
                                mbcevpiqjq.wkgbmnqykc.iobyxmoadg(xVar2.f44093iobyxmoadg, iobyxmoadgVar3, null);
                                iobyxmoadgVar4.eablkybsjg(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                mbcevpiqjq.wkgbmnqykc.iobyxmoadg(xVar2.f44093iobyxmoadg, iobyxmoadgVar3, null);
                                throw th2;
                            }
                        }
                        xVar = (x) this.f44100jyumaefscl;
                        draadjrbmkVar = (tg.draadjrbmk) this.f44103yggfygwlhe;
                        yj.iobyxmoadg iobyxmoadgVar6 = (yj.iobyxmoadg) this.f44104zdlpuopuiu;
                        iobyxmoadgVar2 = (iobyxmoadg) this.f44097cqumvgiudr;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        iobyxmoadgVar = iobyxmoadgVar6;
                    }
                    this.f44097cqumvgiudr = iobyxmoadgVar2;
                    this.f44104zdlpuopuiu = iobyxmoadgVar;
                    this.f44103yggfygwlhe = xVar;
                    this.f44100jyumaefscl = null;
                    this.f44099iwizpuwonk = 2;
                    Object objInvoke = draadjrbmkVar.invoke(this);
                    if (objInvoke == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    xVar2 = xVar;
                    iobyxmoadgVar4 = iobyxmoadgVar;
                    obj = objInvoke;
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                    mbcevpiqjq.wkgbmnqykc.iobyxmoadg(xVar2.f44093iobyxmoadg, iobyxmoadgVar3, null);
                    iobyxmoadgVar4.eablkybsjg(null);
                    return obj;
                } catch (Throwable th4) {
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                    th2 = th4;
                    xVar2 = xVar;
                    mbcevpiqjq.wkgbmnqykc.iobyxmoadg(xVar2.f44093iobyxmoadg, iobyxmoadgVar3, null);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void gxszxtbevo(iobyxmoadg iobyxmoadgVar) {
        iobyxmoadg iobyxmoadgVar2;
        do {
            iobyxmoadgVar2 = (iobyxmoadg) this.f44093iobyxmoadg.get();
            if (iobyxmoadgVar2 != null && !iobyxmoadgVar.iobyxmoadg(iobyxmoadgVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f44093iobyxmoadg, iobyxmoadgVar2, iobyxmoadgVar));
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.zoijcleaow();
        }
    }

    public final boolean eablkybsjg(tg.iobyxmoadg iobyxmoadgVar) {
        boolean zZoijcleaow = yj.iobyxmoadg.C3196iobyxmoadg.zoijcleaow(this.f44094zoijcleaow, null, 1, null);
        if (zZoijcleaow) {
            try {
                iobyxmoadgVar.invoke();
            } finally {
                yj.iobyxmoadg.C3196iobyxmoadg.ppxfxbqfkf(this.f44094zoijcleaow, null, 1, null);
            }
        }
        return zZoijcleaow;
    }

    public final Object wkgbmnqykc(ikoacuggdj.ribwqtqdhb ribwqtqdhbVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        return pj.dsvhmnatus.gxszxtbevo(new zoijcleaow(ribwqtqdhbVar, this, draadjrbmkVar, null), gxszxtbevoVar);
    }
}
