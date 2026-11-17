package jztzpxfvev;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class yadqdtsiqt extends z.wflxmlrfwp implements z.tbqsvytpvh {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private metgxyhuhe.draadjrbmk f53038cllcsxoeiz;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private jlmebxxoox f53040hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private boolean f53041hkdspvbjdz;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private tg.draadjrbmk f53042jpowsppfya;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private boolean f53043kegysxyocb;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private t.ntlheqmsrt f53044mbcevpiqjq;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private metgxyhuhe.zoijcleaow f53045stevsuqkhv;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private rj.lqeggnwhkg f53047wypolnanlu;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final tg.draadjrbmk f53039dsvhmnatus = new tg.draadjrbmk() { // from class: jztzpxfvev.esjtqupxsv
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return Boolean.valueOf(yadqdtsiqt.O0(this.f52670zdlpuopuiu, (t.pmvmpeiblj) obj));
        }
    };

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private long f53046tzroggbefp = g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private /* synthetic */ Object f53049iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f53050jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f53051yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f53052zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ yadqdtsiqt f53053cqumvgiudr;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f53054iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f53055jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f53056yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f53057zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, yadqdtsiqt yadqdtsiqtVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f53054iwizpuwonk = hkdspvbjdzVar;
                this.f53053cqumvgiudr = yadqdtsiqtVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f53054iwizpuwonk, this.f53053cqumvgiudr, gxszxtbevoVar);
                iobyxmoadgVar.f53055jyumaefscl = obj;
                return iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0049 -> B:25:0x005b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0055 -> B:24:0x0058). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                tg.draadjrbmk draadjrbmkVar;
                Object obj2;
                ojitshcjhn ojitshcjhnVar;
                kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f53056yggfygwlhe;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    draadjrbmkVar = (tg.draadjrbmk) this.f53055jyumaefscl;
                    obj2 = this.f53054iwizpuwonk.f60015zdlpuopuiu;
                    if (!(obj2 instanceof ojitshcjhn.wkgbmnqykc) || (obj2 instanceof ojitshcjhn.iobyxmoadg)) {
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                    ojitshcjhnVar = null;
                    ojitshcjhn.zoijcleaow zoijcleaowVar = obj2 instanceof ojitshcjhn.zoijcleaow ? (ojitshcjhn.zoijcleaow) obj2 : null;
                    if (zoijcleaowVar != null) {
                        draadjrbmkVar.invoke(zoijcleaowVar);
                    }
                    hkdspvbjdzVar = this.f53054iwizpuwonk;
                    rj.lqeggnwhkg lqeggnwhkgVar = this.f53053cqumvgiudr.f53047wypolnanlu;
                    if (lqeggnwhkgVar != null) {
                        this.f53055jyumaefscl = draadjrbmkVar;
                        this.f53057zdlpuopuiu = hkdspvbjdzVar;
                        this.f53056yggfygwlhe = 1;
                        obj = lqeggnwhkgVar.ppxfxbqfkf(this);
                        if (obj == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    hkdspvbjdzVar.f60015zdlpuopuiu = ojitshcjhnVar;
                    obj2 = this.f53054iwizpuwonk.f60015zdlpuopuiu;
                    if (obj2 instanceof ojitshcjhn.wkgbmnqykc) {
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hkdspvbjdzVar = (kotlin.jvm.internal.hkdspvbjdz) this.f53057zdlpuopuiu;
                draadjrbmkVar = (tg.draadjrbmk) this.f53055jyumaefscl;
                gg.zdlpuopuiu.zoijcleaow(obj);
                ojitshcjhnVar = (ojitshcjhn) obj;
                hkdspvbjdzVar.f60015zdlpuopuiu = ojitshcjhnVar;
                obj2 = this.f53054iwizpuwonk.f60015zdlpuopuiu;
                if (obj2 instanceof ojitshcjhn.wkgbmnqykc) {
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(draadjrbmkVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = yadqdtsiqt.this.new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f53049iwizpuwonk = obj;
            return eablkybsjgVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x005e A[PHI: r4
          0x005e: PHI (r4v7 pj.cllcsxoeiz) = 
          (r4v0 pj.cllcsxoeiz)
          (r4v3 pj.cllcsxoeiz)
          (r4v3 pj.cllcsxoeiz)
          (r4v3 pj.cllcsxoeiz)
          (r4v5 pj.cllcsxoeiz)
          (r4v8 pj.cllcsxoeiz)
         binds: [B:18:0x0056, B:45:0x00db, B:47:0x00ea, B:41:0x00d4, B:30:0x008d, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:21:0x0064  */
        /* JADX WARN: Code duplicated, block: B:23:0x0071  */
        /* JADX WARN: Code duplicated, block: B:25:0x0080 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x0081  */
        /* JADX WARN: Code duplicated, block: B:28:0x0085  */
        /* JADX WARN: Code duplicated, block: B:31:0x008f  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:37:0x00b9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:40:0x00c0 A[Catch: CancellationException -> 0x00d7, TryCatch #1 {CancellationException -> 0x00d7, blocks: (B:38:0x00ba, B:40:0x00c0, B:44:0x00d9, B:46:0x00dd), top: B:57:0x00ba }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:44:0x00d9 A[Catch: CancellationException -> 0x00d7, TryCatch #1 {CancellationException -> 0x00d7, blocks: (B:38:0x00ba, B:40:0x00c0, B:44:0x00d9, B:46:0x00dd), top: B:57:0x00ba }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00dd A[Catch: CancellationException -> 0x00d7, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x00d7, blocks: (B:38:0x00ba, B:40:0x00c0, B:44:0x00d9, B:46:0x00dd), top: B:57:0x00ba }] */
        /* JADX WARN: Code duplicated, block: B:48:0x00ec A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:52:0x00fd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008d -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d4 -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00db -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00ea -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00fa -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:34:0x00a3
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jztzpxfvev.yadqdtsiqt.eablkybsjg.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class iobyxmoadg implements PointerInputEventHandler {

        /* JADX INFO: renamed from: jztzpxfvev.yadqdtsiqt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1137iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ tg.vdvldrhtss f53059cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            final /* synthetic */ tg.draadjrbmk f53060esjtqupxsv;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ yadqdtsiqt f53061iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ t.ylkuphrtab f53062jyumaefscl;

            /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
            final /* synthetic */ tg.iobyxmoadg f53063lereixgezr;

            /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
            final /* synthetic */ tg.iobyxmoadg f53064pmvmpeiblj;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f53065yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f53066zdlpuopuiu;

            /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
            final /* synthetic */ tg.rgvfuqvkyq f53067zynmafqrjb;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1137iobyxmoadg(t.ylkuphrtab ylkuphrtabVar, yadqdtsiqt yadqdtsiqtVar, tg.vdvldrhtss vdvldrhtssVar, tg.draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f53062jyumaefscl = ylkuphrtabVar;
                this.f53061iwizpuwonk = yadqdtsiqtVar;
                this.f53059cqumvgiudr = vdvldrhtssVar;
                this.f53060esjtqupxsv = draadjrbmkVar;
                this.f53063lereixgezr = iobyxmoadgVar;
                this.f53064pmvmpeiblj = iobyxmoadgVar2;
                this.f53067zynmafqrjb = rgvfuqvkyqVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1137iobyxmoadg c1137iobyxmoadg = new C1137iobyxmoadg(this.f53062jyumaefscl, this.f53061iwizpuwonk, this.f53059cqumvgiudr, this.f53060esjtqupxsv, this.f53063lereixgezr, this.f53064pmvmpeiblj, this.f53067zynmafqrjb, gxszxtbevoVar);
                c1137iobyxmoadg.f53065yggfygwlhe = obj;
                return c1137iobyxmoadg;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x004e  */
            /* JADX WARN: Code duplicated, block: B:25:0x0060  */
            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                pj.cllcsxoeiz cllcsxoeizVar;
                CancellationException e13;
                rj.lqeggnwhkg lqeggnwhkgVar;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f53066zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    pj.cllcsxoeiz cllcsxoeizVar2 = (pj.cllcsxoeiz) this.f53065yggfygwlhe;
                    try {
                        t.ylkuphrtab ylkuphrtabVar = this.f53062jyumaefscl;
                        jlmebxxoox jlmebxxooxVar = this.f53061iwizpuwonk.f53040hcddaimhww;
                        tg.vdvldrhtss vdvldrhtssVar = this.f53059cqumvgiudr;
                        tg.draadjrbmk draadjrbmkVar = this.f53060esjtqupxsv;
                        tg.iobyxmoadg iobyxmoadgVar = this.f53063lereixgezr;
                        tg.iobyxmoadg iobyxmoadgVar2 = this.f53064pmvmpeiblj;
                        tg.rgvfuqvkyq rgvfuqvkyqVar = this.f53067zynmafqrjb;
                        this.f53065yggfygwlhe = cllcsxoeizVar2;
                        this.f53066zdlpuopuiu = 1;
                        if (jyumaefscl.gtknphoqwx(ylkuphrtabVar, jlmebxxooxVar, vdvldrhtssVar, draadjrbmkVar, iobyxmoadgVar, iobyxmoadgVar2, rgvfuqvkyqVar, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } catch (CancellationException e14) {
                        cllcsxoeizVar = cllcsxoeizVar2;
                        e13 = e14;
                        lqeggnwhkgVar = this.f53061iwizpuwonk.f53047wypolnanlu;
                        if (lqeggnwhkgVar != null) {
                            rj.gtknphoqwx.zoijcleaow(lqeggnwhkgVar.eablkybsjg(ojitshcjhn.iobyxmoadg.f52936iobyxmoadg));
                        }
                        if (!pj.dsvhmnatus.nufgyqmvbu(cllcsxoeizVar)) {
                            throw e13;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cllcsxoeizVar = (pj.cllcsxoeiz) this.f53065yggfygwlhe;
                    try {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } catch (CancellationException e15) {
                        e13 = e15;
                        lqeggnwhkgVar = this.f53061iwizpuwonk.f53047wypolnanlu;
                        if (lqeggnwhkgVar != null) {
                            rj.gtknphoqwx.zoijcleaow(lqeggnwhkgVar.eablkybsjg(ojitshcjhn.iobyxmoadg.f52936iobyxmoadg));
                        }
                        if (!pj.dsvhmnatus.nufgyqmvbu(cllcsxoeizVar)) {
                            throw e13;
                        }
                    }
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C1137iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn btonecajqb(yadqdtsiqt yadqdtsiqtVar, kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, u.wkgbmnqykc wkgbmnqykcVar, t.pmvmpeiblj pmvmpeibljVar, g.eablkybsjg eablkybsjgVar) {
            if (ikoacuggdj.esjtqupxsv.f44786btonecajqb) {
                long jLqeggnwhkg = x.vdvldrhtss.lqeggnwhkg(z.gtknphoqwx.agtfadlqog(yadqdtsiqtVar));
                if (!g.eablkybsjg.btonecajqb(jLqeggnwhkg, jpowsppfyaVar.f60024zdlpuopuiu)) {
                    yadqdtsiqtVar.f53046tzroggbefp = g.eablkybsjg.vdvldrhtss(yadqdtsiqtVar.f53046tzroggbefp, g.eablkybsjg.rgvfuqvkyq(jLqeggnwhkg, jpowsppfyaVar.f60024zdlpuopuiu));
                }
                jpowsppfyaVar.f60024zdlpuopuiu = jLqeggnwhkg;
            }
            u.eablkybsjg.wkgbmnqykc(wkgbmnqykcVar, pmvmpeibljVar, yadqdtsiqtVar.f53046tzroggbefp);
            rj.lqeggnwhkg lqeggnwhkgVar = yadqdtsiqtVar.f53047wypolnanlu;
            if (lqeggnwhkgVar != null) {
                rj.gtknphoqwx.zoijcleaow(lqeggnwhkgVar.eablkybsjg(new ojitshcjhn.zoijcleaow(eablkybsjgVar.zdlpuopuiu(), null)));
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean dxjokdxxww(yadqdtsiqt yadqdtsiqtVar) {
            return !yadqdtsiqtVar.j1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn gxszxtbevo(yadqdtsiqt yadqdtsiqtVar, u.wkgbmnqykc wkgbmnqykcVar, t.pmvmpeiblj pmvmpeibljVar, t.pmvmpeiblj pmvmpeibljVar2, g.eablkybsjg eablkybsjgVar) {
            yadqdtsiqtVar.f53046tzroggbefp = g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
            if (((Boolean) yadqdtsiqtVar.b1().invoke(pmvmpeibljVar)).booleanValue()) {
                if (!yadqdtsiqtVar.f53043kegysxyocb) {
                    if (yadqdtsiqtVar.f53047wypolnanlu == null) {
                        yadqdtsiqtVar.f53047wypolnanlu = rj.btonecajqb.zoijcleaow(Integer.MAX_VALUE, null, null, 6, null);
                    }
                    yadqdtsiqtVar.k1();
                }
                u.eablkybsjg.ppxfxbqfkf(wkgbmnqykcVar, pmvmpeibljVar);
                long jRgvfuqvkyq = g.eablkybsjg.rgvfuqvkyq(pmvmpeibljVar2.nufgyqmvbu(), eablkybsjgVar.zdlpuopuiu());
                rj.lqeggnwhkg lqeggnwhkgVar = yadqdtsiqtVar.f53047wypolnanlu;
                if (lqeggnwhkgVar != null) {
                    rj.gtknphoqwx.zoijcleaow(lqeggnwhkgVar.eablkybsjg(new ojitshcjhn.ppxfxbqfkf(jRgvfuqvkyq, null)));
                }
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn lqeggnwhkg(u.wkgbmnqykc wkgbmnqykcVar, t.ylkuphrtab ylkuphrtabVar, yadqdtsiqt yadqdtsiqtVar, t.pmvmpeiblj pmvmpeibljVar) {
            u.eablkybsjg.ppxfxbqfkf(wkgbmnqykcVar, pmvmpeibljVar);
            float fLqeggnwhkg = ylkuphrtabVar.getViewConfiguration().lqeggnwhkg();
            long jZoijcleaow = wkgbmnqykcVar.zoijcleaow(w0.lereixgezr.iobyxmoadg(fLqeggnwhkg, fLqeggnwhkg));
            wkgbmnqykcVar.eablkybsjg();
            rj.lqeggnwhkg lqeggnwhkgVar = yadqdtsiqtVar.f53047wypolnanlu;
            if (lqeggnwhkgVar != null) {
                rj.gtknphoqwx.zoijcleaow(lqeggnwhkgVar.eablkybsjg(new ojitshcjhn.wkgbmnqykc(ylkuphrtab.agtfadlqog(jZoijcleaow), null)));
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn nufgyqmvbu(yadqdtsiqt yadqdtsiqtVar) {
            rj.lqeggnwhkg lqeggnwhkgVar = yadqdtsiqtVar.f53047wypolnanlu;
            if (lqeggnwhkgVar != null) {
                rj.gtknphoqwx.zoijcleaow(lqeggnwhkgVar.eablkybsjg(ojitshcjhn.iobyxmoadg.f52936iobyxmoadg));
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(final t.ylkuphrtab ylkuphrtabVar, lg.gxszxtbevo gxszxtbevoVar) {
            final u.wkgbmnqykc wkgbmnqykcVar = new u.wkgbmnqykc();
            final kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = new kotlin.jvm.internal.jpowsppfya();
            jpowsppfyaVar.f60024zdlpuopuiu = ikoacuggdj.esjtqupxsv.f44786btonecajqb ? x.vdvldrhtss.lqeggnwhkg(z.gtknphoqwx.agtfadlqog(yadqdtsiqt.this)) : g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
            final yadqdtsiqt yadqdtsiqtVar = yadqdtsiqt.this;
            tg.vdvldrhtss vdvldrhtssVar = new tg.vdvldrhtss() { // from class: jztzpxfvev.lereixgezr
                @Override // tg.vdvldrhtss
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return yadqdtsiqt.iobyxmoadg.gxszxtbevo(yadqdtsiqtVar, wkgbmnqykcVar, (t.pmvmpeiblj) obj, (t.pmvmpeiblj) obj2, (g.eablkybsjg) obj3);
                }
            };
            final yadqdtsiqt yadqdtsiqtVar2 = yadqdtsiqt.this;
            tg.draadjrbmk draadjrbmkVar = new tg.draadjrbmk() { // from class: jztzpxfvev.pmvmpeiblj
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return yadqdtsiqt.iobyxmoadg.lqeggnwhkg(wkgbmnqykcVar, ylkuphrtabVar, yadqdtsiqtVar2, (t.pmvmpeiblj) obj);
                }
            };
            final yadqdtsiqt yadqdtsiqtVar3 = yadqdtsiqt.this;
            tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: jztzpxfvev.zynmafqrjb
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return yadqdtsiqt.iobyxmoadg.nufgyqmvbu(yadqdtsiqtVar3);
                }
            };
            final yadqdtsiqt yadqdtsiqtVar4 = yadqdtsiqt.this;
            tg.iobyxmoadg iobyxmoadgVar2 = new tg.iobyxmoadg() { // from class: jztzpxfvev.istkbnxepw
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return Boolean.valueOf(yadqdtsiqt.iobyxmoadg.dxjokdxxww(yadqdtsiqtVar4));
                }
            };
            final yadqdtsiqt yadqdtsiqtVar5 = yadqdtsiqt.this;
            Object objGxszxtbevo = pj.dsvhmnatus.gxszxtbevo(new C1137iobyxmoadg(ylkuphrtabVar, yadqdtsiqt.this, vdvldrhtssVar, draadjrbmkVar, iobyxmoadgVar, iobyxmoadgVar2, new tg.rgvfuqvkyq() { // from class: jztzpxfvev.cdpycssgdh
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return yadqdtsiqt.iobyxmoadg.btonecajqb(yadqdtsiqtVar5, jpowsppfyaVar, wkgbmnqykcVar, (t.pmvmpeiblj) obj, (g.eablkybsjg) obj2);
                }
            }, null), gxszxtbevoVar);
            return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f53068cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f53070jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f53071yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f53072zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53070jyumaefscl = obj;
            this.f53068cqumvgiudr |= Integer.MIN_VALUE;
            return yadqdtsiqt.this.h1(null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f53073iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f53075yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f53076zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53075yggfygwlhe = obj;
            this.f53073iwizpuwonk |= Integer.MIN_VALUE;
            return yadqdtsiqt.this.i1(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f53077jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f53079zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53079zdlpuopuiu = obj;
            this.f53077jyumaefscl |= Integer.MIN_VALUE;
            return yadqdtsiqt.this.g1(this);
        }
    }

    public yadqdtsiqt(tg.draadjrbmk draadjrbmkVar, boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar2, jlmebxxoox jlmebxxooxVar) {
        this.f53040hcddaimhww = jlmebxxooxVar;
        this.f53042jpowsppfya = draadjrbmkVar;
        this.f53041hkdspvbjdz = z13;
        this.f53038cllcsxoeiz = draadjrbmkVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O0(yadqdtsiqt yadqdtsiqtVar, t.pmvmpeiblj pmvmpeibljVar) {
        return ((Boolean) yadqdtsiqtVar.f53042jpowsppfya.invoke(pmvmpeibljVar)).booleanValue();
    }

    private final t.ntlheqmsrt d1() {
        return t.tzroggbefp.iobyxmoadg(new iobyxmoadg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g1(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f53077jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f53077jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f53079zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f53077jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            metgxyhuhe.zoijcleaow zoijcleaowVar2 = this.f53045stevsuqkhv;
            if (zoijcleaowVar2 != null) {
                metgxyhuhe.draadjrbmk draadjrbmkVar = this.f53038cllcsxoeiz;
                if (draadjrbmkVar != null) {
                    metgxyhuhe.iobyxmoadg iobyxmoadgVar = new metgxyhuhe.iobyxmoadg(zoijcleaowVar2);
                    zoijcleaowVar.f53077jyumaefscl = 1;
                    if (draadjrbmkVar.zoijcleaow(iobyxmoadgVar, zoijcleaowVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            }
            f1(w0.esjtqupxsv.f118251zoijcleaow.iobyxmoadg());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        this.f53045stevsuqkhv = null;
        f1(w0.esjtqupxsv.f118251zoijcleaow.iobyxmoadg());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h1(ojitshcjhn.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar2;
        metgxyhuhe.draadjrbmk draadjrbmkVar;
        metgxyhuhe.zoijcleaow zoijcleaowVar;
        ojitshcjhn.ppxfxbqfkf ppxfxbqfkfVar3;
        metgxyhuhe.zoijcleaow zoijcleaowVar2;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar2 = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar2.f53068cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar2.f53068cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar2 = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar2 = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar2.f53070jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar2.f53068cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                ppxfxbqfkfVar = (ojitshcjhn.ppxfxbqfkf) ppxfxbqfkfVar2.f53072zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zoijcleaowVar2 = (metgxyhuhe.zoijcleaow) ppxfxbqfkfVar2.f53071yggfygwlhe;
                ppxfxbqfkfVar3 = (ojitshcjhn.ppxfxbqfkf) ppxfxbqfkfVar2.f53072zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            zoijcleaowVar = zoijcleaowVar2;
            ppxfxbqfkfVar = ppxfxbqfkfVar3;
            this.f53045stevsuqkhv = zoijcleaowVar;
            e1(ppxfxbqfkfVar.iobyxmoadg());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        metgxyhuhe.zoijcleaow zoijcleaowVar3 = this.f53045stevsuqkhv;
        if (zoijcleaowVar3 != null && (draadjrbmkVar = this.f53038cllcsxoeiz) != null) {
            metgxyhuhe.iobyxmoadg iobyxmoadgVar = new metgxyhuhe.iobyxmoadg(zoijcleaowVar3);
            ppxfxbqfkfVar2.f53072zdlpuopuiu = ppxfxbqfkfVar;
            ppxfxbqfkfVar2.f53068cqumvgiudr = 1;
            if (draadjrbmkVar.zoijcleaow(iobyxmoadgVar, ppxfxbqfkfVar2) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        zoijcleaowVar = new metgxyhuhe.zoijcleaow();
        metgxyhuhe.draadjrbmk draadjrbmkVar2 = this.f53038cllcsxoeiz;
        if (draadjrbmkVar2 != null) {
            ppxfxbqfkfVar2.f53072zdlpuopuiu = ppxfxbqfkfVar;
            ppxfxbqfkfVar2.f53071yggfygwlhe = zoijcleaowVar;
            ppxfxbqfkfVar2.f53068cqumvgiudr = 2;
            if (draadjrbmkVar2.zoijcleaow(zoijcleaowVar, ppxfxbqfkfVar2) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar3 = ppxfxbqfkfVar;
            zoijcleaowVar2 = zoijcleaowVar;
            zoijcleaowVar = zoijcleaowVar2;
            ppxfxbqfkfVar = ppxfxbqfkfVar3;
        }
        this.f53045stevsuqkhv = zoijcleaowVar;
        e1(ppxfxbqfkfVar.iobyxmoadg());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i1(ojitshcjhn.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar2;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar2 = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar2.f53073iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar2.f53073iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar2 = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar2 = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar2.f53075yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar2.f53073iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            metgxyhuhe.zoijcleaow zoijcleaowVar = this.f53045stevsuqkhv;
            if (zoijcleaowVar != null) {
                metgxyhuhe.draadjrbmk draadjrbmkVar = this.f53038cllcsxoeiz;
                if (draadjrbmkVar != null) {
                    metgxyhuhe.ppxfxbqfkf ppxfxbqfkfVar = new metgxyhuhe.ppxfxbqfkf(zoijcleaowVar);
                    wkgbmnqykcVar2.f53076zdlpuopuiu = wkgbmnqykcVar;
                    wkgbmnqykcVar2.f53073iwizpuwonk = 1;
                    if (draadjrbmkVar.zoijcleaow(ppxfxbqfkfVar, wkgbmnqykcVar2) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            }
            f1(wkgbmnqykcVar.iobyxmoadg());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wkgbmnqykcVar = (ojitshcjhn.wkgbmnqykc) wkgbmnqykcVar2.f53076zdlpuopuiu;
        gg.zdlpuopuiu.zoijcleaow(obj);
        this.f53045stevsuqkhv = null;
        f1(wkgbmnqykcVar.iobyxmoadg());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k1() {
        this.f53043kegysxyocb = true;
        pj.gtknphoqwx.wkgbmnqykc(g0(), null, null, new eablkybsjg(null), 3, null);
    }

    public final void Z0() {
        metgxyhuhe.zoijcleaow zoijcleaowVar = this.f53045stevsuqkhv;
        if (zoijcleaowVar != null) {
            metgxyhuhe.draadjrbmk draadjrbmkVar = this.f53038cllcsxoeiz;
            if (draadjrbmkVar != null) {
                draadjrbmkVar.iobyxmoadg(new metgxyhuhe.iobyxmoadg(zoijcleaowVar));
            }
            this.f53045stevsuqkhv = null;
        }
    }

    public abstract Object a1(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar);

    protected final tg.draadjrbmk b1() {
        return this.f53042jpowsppfya;
    }

    protected final boolean c1() {
        return this.f53041hkdspvbjdz;
    }

    public abstract void e1(long j13);

    public abstract void f1(long j13);

    public abstract boolean j1();

    public final void l1(tg.draadjrbmk draadjrbmkVar, boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar2, jlmebxxoox jlmebxxooxVar, boolean z14) {
        t.ntlheqmsrt ntlheqmsrtVar;
        this.f53042jpowsppfya = draadjrbmkVar;
        boolean z15 = true;
        if (this.f53041hkdspvbjdz != z13) {
            this.f53041hkdspvbjdz = z13;
            if (!z13) {
                Z0();
                t.ntlheqmsrt ntlheqmsrtVar2 = this.f53044mbcevpiqjq;
                if (ntlheqmsrtVar2 != null) {
                    K0(ntlheqmsrtVar2);
                }
                this.f53044mbcevpiqjq = null;
            }
            z14 = true;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f53038cllcsxoeiz, draadjrbmkVar2)) {
            Z0();
            this.f53038cllcsxoeiz = draadjrbmkVar2;
        }
        if (this.f53040hcddaimhww != jlmebxxooxVar) {
            this.f53040hcddaimhww = jlmebxxooxVar;
        } else {
            z15 = z14;
        }
        if (!z15 || (ntlheqmsrtVar = this.f53044mbcevpiqjq) == null) {
            return;
        }
        ntlheqmsrtVar.ezmngbhpjk();
    }

    public void metgxyhuhe(t.rgvfuqvkyq rgvfuqvkyqVar, t.oxmwwwfdhm oxmwwwfdhmVar, long j13) {
        if (this.f53041hkdspvbjdz && this.f53044mbcevpiqjq == null) {
            this.f53044mbcevpiqjq = (t.ntlheqmsrt) H0(d1());
        }
        t.ntlheqmsrt ntlheqmsrtVar = this.f53044mbcevpiqjq;
        if (ntlheqmsrtVar != null) {
            ntlheqmsrtVar.metgxyhuhe(rgvfuqvkyqVar, oxmwwwfdhmVar, j13);
        }
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void r0() {
        this.f53043kegysxyocb = false;
        Z0();
        this.f53046tzroggbefp = g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
    }

    @Override // z.tbqsvytpvh
    public void s() {
        t.ntlheqmsrt ntlheqmsrtVar = this.f53044mbcevpiqjq;
        if (ntlheqmsrtVar != null) {
            ntlheqmsrtVar.s();
        }
    }
}
