package igdgnonuha;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final float f43943iobyxmoadg = w0.nufgyqmvbu.lqeggnwhkg(56);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final float f43945zoijcleaow = w0.nufgyqmvbu.lqeggnwhkg(125);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final float f43944ppxfxbqfkf = w0.nufgyqmvbu.lqeggnwhkg(640);

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ b1 f43946yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f43947zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(b1 b1Var, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f43946yggfygwlhe = b1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f43946yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f43947zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                b1 b1Var = this.f43946yggfygwlhe;
                this.f43947zdlpuopuiu = 1;
                if (b1Var.draadjrbmk(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f43948zdlpuopuiu;

        gxszxtbevo(tg.vdvldrhtss vdvldrhtssVar) {
            this.f43948zdlpuopuiu = vdvldrhtssVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if (!draadjrbmkVar.vdvldrhtss((i13 & 3) != 2, i13 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1557535116, i13, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:438)");
            }
            tg.vdvldrhtss vdvldrhtssVar = this.f43948zdlpuopuiu;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVar, 0);
            int iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVar, 0);
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, iobyxmoadgVar);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            if (draadjrbmkVar.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar.pkzmftpjix();
            if (draadjrbmkVar.lqeggnwhkg()) {
                draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVar.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = androidx.compose.runtime.m1.iobyxmoadg(draadjrbmkVar);
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar2.ppxfxbqfkf());
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iIobyxmoadg))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iIobyxmoadg));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iIobyxmoadg), rgvfuqvkyqVarZoijcleaow);
            }
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            vdvldrhtssVar.invoke(czzsidtyhn.vdvldrhtss.f26487iobyxmoadg, draadjrbmkVar, 6);
            draadjrbmkVar.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class iobyxmoadg implements s.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ jztzpxfvev.jlmebxxoox f43949yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ igdgnonuha.lqeggnwhkg f43950zdlpuopuiu;

        /* JADX INFO: renamed from: igdgnonuha.v0$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1025iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            int f43951iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f43953yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            long f43954zdlpuopuiu;

            C1025iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f43953yggfygwlhe = obj;
                this.f43951iwizpuwonk |= Integer.MIN_VALUE;
                return iobyxmoadg.this.wypolnanlu(0L, 0L, this);
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            int f43955iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f43957yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            long f43958zdlpuopuiu;

            zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f43957yggfygwlhe = obj;
                this.f43955iwizpuwonk |= Integer.MIN_VALUE;
                return iobyxmoadg.this.wizcaqwiak(0L, this);
            }
        }

        iobyxmoadg(igdgnonuha.lqeggnwhkg lqeggnwhkgVar, jztzpxfvev.jlmebxxoox jlmebxxooxVar) {
            this.f43950zdlpuopuiu = lqeggnwhkgVar;
            this.f43949yggfygwlhe = jlmebxxooxVar;
        }

        private final float iobyxmoadg(long j13) {
            return Float.intBitsToFloat((int) (this.f43949yggfygwlhe == jztzpxfvev.jlmebxxoox.Horizontal ? j13 >> 32 : j13 & 4294967295L));
        }

        private final float ppxfxbqfkf(long j13) {
            return this.f43949yggfygwlhe == jztzpxfvev.jlmebxxoox.Horizontal ? w0.esjtqupxsv.nufgyqmvbu(j13) : w0.esjtqupxsv.dxjokdxxww(j13);
        }

        private final long zoijcleaow(float f13) {
            jztzpxfvev.jlmebxxoox jlmebxxooxVar = this.f43949yggfygwlhe;
            float f14 = jlmebxxooxVar == jztzpxfvev.jlmebxxoox.Horizontal ? f13 : 0.0f;
            if (jlmebxxooxVar != jztzpxfvev.jlmebxxoox.Vertical) {
                f13 = 0.0f;
            }
            return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L));
        }

        @Override // s.iobyxmoadg
        public long E(long j13, int i13) {
            float fIobyxmoadg = iobyxmoadg(j13);
            return (fIobyxmoadg >= 0.0f || !s.eablkybsjg.wkgbmnqykc(i13, s.eablkybsjg.f105077iobyxmoadg.zoijcleaow())) ? g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf() : zoijcleaow(this.f43950zdlpuopuiu.vdvldrhtss(fIobyxmoadg));
        }

        @Override // s.iobyxmoadg
        public long grlcpdaxtj(long j13, long j14, int i13) {
            return s.eablkybsjg.wkgbmnqykc(i13, s.eablkybsjg.f105077iobyxmoadg.zoijcleaow()) ? zoijcleaow(this.f43950zdlpuopuiu.vdvldrhtss(iobyxmoadg(j14))) : g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // s.iobyxmoadg
        public Object wizcaqwiak(long j13, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar;
            if (gxszxtbevoVar instanceof zoijcleaow) {
                zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
                int i13 = zoijcleaowVar.f43955iwizpuwonk;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    zoijcleaowVar.f43955iwizpuwonk = i13 - Integer.MIN_VALUE;
                } else {
                    zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
                }
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
            Object obj = zoijcleaowVar.f43957yggfygwlhe;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = zoijcleaowVar.f43955iwizpuwonk;
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                float fPpxfxbqfkf = ppxfxbqfkf(j13);
                float fYadqdtsiqt = this.f43950zdlpuopuiu.yadqdtsiqt();
                if (fPpxfxbqfkf >= 0.0f || fYadqdtsiqt <= this.f43950zdlpuopuiu.oxmwwwfdhm().wkgbmnqykc()) {
                    j13 = w0.esjtqupxsv.f118251zoijcleaow.iobyxmoadg();
                } else {
                    igdgnonuha.lqeggnwhkg lqeggnwhkgVar = this.f43950zdlpuopuiu;
                    zoijcleaowVar.f43958zdlpuopuiu = j13;
                    zoijcleaowVar.f43955iwizpuwonk = 1;
                    if (lqeggnwhkgVar.hcddaimhww(fPpxfxbqfkf, zoijcleaowVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j13 = zoijcleaowVar.f43958zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return w0.esjtqupxsv.zoijcleaow(j13);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // s.iobyxmoadg
        public Object wypolnanlu(long j13, long j14, lg.gxszxtbevo gxszxtbevoVar) {
            C1025iobyxmoadg c1025iobyxmoadg;
            if (gxszxtbevoVar instanceof C1025iobyxmoadg) {
                c1025iobyxmoadg = (C1025iobyxmoadg) gxszxtbevoVar;
                int i13 = c1025iobyxmoadg.f43951iwizpuwonk;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    c1025iobyxmoadg.f43951iwizpuwonk = i13 - Integer.MIN_VALUE;
                } else {
                    c1025iobyxmoadg = new C1025iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                c1025iobyxmoadg = new C1025iobyxmoadg(gxszxtbevoVar);
            }
            Object obj = c1025iobyxmoadg.f43953yggfygwlhe;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = c1025iobyxmoadg.f43951iwizpuwonk;
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                igdgnonuha.lqeggnwhkg lqeggnwhkgVar = this.f43950zdlpuopuiu;
                float fPpxfxbqfkf = ppxfxbqfkf(j14);
                c1025iobyxmoadg.f43954zdlpuopuiu = j14;
                c1025iobyxmoadg.f43951iwizpuwonk = 1;
                if (lqeggnwhkgVar.hcddaimhww(fPpxfxbqfkf, c1025iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j14 = c1025iobyxmoadg.f43954zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return w0.esjtqupxsv.zoijcleaow(j14);
        }
    }

    static final class lqeggnwhkg implements PointerInputEventHandler {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f43959iobyxmoadg;

        lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar) {
            this.f43959iobyxmoadg = iobyxmoadgVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn zoijcleaow(tg.iobyxmoadg iobyxmoadgVar, g.eablkybsjg eablkybsjgVar) {
            iobyxmoadgVar.invoke();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(t.ylkuphrtab ylkuphrtabVar, lg.gxszxtbevo gxszxtbevoVar) {
            final tg.iobyxmoadg iobyxmoadgVar = this.f43959iobyxmoadg;
            Object objGtknphoqwx = jztzpxfvev.nuxfzjnpeb.gtknphoqwx(ylkuphrtabVar, null, null, null, new tg.draadjrbmk() { // from class: igdgnonuha.w0
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return v0.lqeggnwhkg.zoijcleaow(iobyxmoadgVar, (g.eablkybsjg) obj);
                }
            }, gxszxtbevoVar, 7, null);
            return objGtknphoqwx == mg.zoijcleaow.gxszxtbevo() ? objGtknphoqwx : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public /* synthetic */ class nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f43960iobyxmoadg;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c1.HalfExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c1.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43960iobyxmoadg = iArr;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ b1 f43961yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f43962zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(b1 b1Var, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f43961yggfygwlhe = b1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f43961yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f43962zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                b1 b1Var = this.f43961yggfygwlhe;
                this.f43962zdlpuopuiu = 1;
                if (b1Var.wflxmlrfwp(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ b1 f43963yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f43964zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(b1 b1Var, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f43963yggfygwlhe = b1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f43963yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f43964zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                b1 b1Var = this.f43963yggfygwlhe;
                this.f43964zdlpuopuiu = 1;
                if (b1Var.lqeggnwhkg(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ b1 f43965yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f43966zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(b1 b1Var, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f43965yggfygwlhe = b1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f43965yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f43966zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                b1 b1Var = this.f43965yggfygwlhe;
                this.f43966zdlpuopuiu = 1;
                if (b1Var.wflxmlrfwp(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private static final float cqumvgiudr(androidx.compose.runtime.i1 i1Var) {
        return ((Number) i1Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn esjtqupxsv(String str, final tg.iobyxmoadg iobyxmoadgVar, g0.yadqdtsiqt yadqdtsiqtVar) {
        g0.zynmafqrjb.jhduphickx(yadqdtsiqtVar, str);
        g0.zynmafqrjb.lereixgezr(yadqdtsiqtVar, null, new tg.iobyxmoadg() { // from class: igdgnonuha.k0
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Boolean.valueOf(v0.lereixgezr(iobyxmoadgVar));
            }
        }, 1, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.vdvldrhtss iozdgvuglv(final b1 b1Var, final w0.oxmwwwfdhm oxmwwwfdhmVar, w0.zoijcleaow zoijcleaowVar) {
        final float fGtknphoqwx = w0.zoijcleaow.gtknphoqwx(zoijcleaowVar.vdvldrhtss());
        lrnfpwlwnk lrnfpwlwnkVarIobyxmoadg = androidx.compose.material.iobyxmoadg.iobyxmoadg(new tg.draadjrbmk() { // from class: igdgnonuha.l0
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return v0.lmojexxdyd(fGtknphoqwx, b1Var, oxmwwwfdhmVar, (zeieaojujs) obj);
            }
        });
        boolean z13 = b1Var.nufgyqmvbu().oxmwwwfdhm().getSize() > 0;
        c1 c1VarDxjokdxxww = b1Var.dxjokdxxww();
        if (z13 || !lrnfpwlwnkVarIobyxmoadg.ppxfxbqfkf(c1VarDxjokdxxww)) {
            int i13 = nufgyqmvbu.f43960iobyxmoadg[b1Var.gtknphoqwx().ordinal()];
            if (i13 == 1) {
                c1VarDxjokdxxww = c1.Hidden;
            } else {
                if (i13 != 2 && i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c1 c1Var = c1.HalfExpanded;
                if (!lrnfpwlwnkVarIobyxmoadg.ppxfxbqfkf(c1Var)) {
                    c1Var = c1.Expanded;
                    if (!lrnfpwlwnkVarIobyxmoadg.ppxfxbqfkf(c1Var)) {
                        c1Var = c1.Hidden;
                    }
                }
                c1VarDxjokdxxww = c1Var;
            }
        }
        return gg.cqumvgiudr.iobyxmoadg(lrnfpwlwnkVarIobyxmoadg, c1VarDxjokdxxww);
    }

    private static final void iwizpuwonk(final long j13, final tg.iobyxmoadg iobyxmoadgVar, final boolean z13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-526532668);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.wkgbmnqykc(j13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i15 = i14;
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i15 & 147) != 146, i15 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-526532668, i15, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:489)");
            }
            if (j13 != 16) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-714009568);
                final androidx.compose.runtime.i1 i1VarEablkybsjg = vipkmwdibw.eablkybsjg.eablkybsjg(z13 ? 1.0f : 0.0f, new vipkmwdibw.fmlbqenlif(0, 0, null, 7, null), 0.0f, null, null, draadjrbmkVarBtonecajqb, 48, 28);
                final String strIobyxmoadg = w3.iobyxmoadg(v3.f43979iobyxmoadg.zoijcleaow(), draadjrbmkVarBtonecajqb, 6);
                if (z13) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-713791669);
                    androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    int i16 = i15 & 112;
                    boolean z14 = i16 == 32;
                    Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z14 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new lqeggnwhkg(iobyxmoadgVar);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = t.tzroggbefp.ppxfxbqfkf(iobyxmoadgVar2, iobyxmoadgVar, (PointerInputEventHandler) objYadqdtsiqt);
                    boolean zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(strIobyxmoadg) | (i16 == 32);
                    Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: igdgnonuha.q0
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return v0.esjtqupxsv(strIobyxmoadg, iobyxmoadgVar, (g0.yadqdtsiqt) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    wkgbmnqykcVarZoijcleaow = g0.kcexrzcfyt.zoijcleaow(wkgbmnqykcVarPpxfxbqfkf, true, (tg.draadjrbmk) objYadqdtsiqt2);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-713427946);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wkgbmnqykcVarZoijcleaow = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null).eablkybsjg(wkgbmnqykcVarZoijcleaow);
                boolean zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarEablkybsjg) | ((i15 & 14) == 4);
                Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru2 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: igdgnonuha.r0
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return v0.pmvmpeiblj(j13, i1VarEablkybsjg, (j.gxszxtbevo) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                ikoacuggdj.zdlpuopuiu.zoijcleaow(wkgbmnqykcVarEablkybsjg, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-713242690);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        androidx.compose.runtime.a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.s0
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return v0.zynmafqrjb(j13, iobyxmoadgVar, z13, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn jyumaefscl(tg.vdvldrhtss vdvldrhtssVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, b1 b1Var, boolean z13, h.e eVar, float f13, long j13, long j14, long j15, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        rgvfuqvkyq(vdvldrhtssVar, wkgbmnqykcVar, b1Var, z13, eVar, f13, j13, j14, j15, rgvfuqvkyqVar, draadjrbmkVar, androidx.compose.runtime.f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean kcexrzcfyt(b1 b1Var, pj.cllcsxoeiz cllcsxoeizVar) {
        if (!((Boolean) b1Var.nufgyqmvbu().yggfygwlhe().invoke(c1.Hidden)).booleanValue()) {
            return true;
        }
        pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new ppxfxbqfkf(b1Var, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lereixgezr(tg.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lmojexxdyd(float f13, b1 b1Var, w0.oxmwwwfdhm oxmwwwfdhmVar, zeieaojujs zeieaojujsVar) {
        zeieaojujsVar.iobyxmoadg(c1.Hidden, f13);
        float f14 = f13 / 2.0f;
        if (!b1Var.agtfadlqog() && ((int) (oxmwwwfdhmVar.btonecajqb() & 4294967295L)) > f14) {
            zeieaojujsVar.iobyxmoadg(c1.HalfExpanded, f14);
        }
        if (((int) (oxmwwwfdhmVar.btonecajqb() & 4294967295L)) != 0) {
            zeieaojujsVar.iobyxmoadg(c1.Expanded, Math.max(0.0f, f13 - ((int) (oxmwwwfdhmVar.btonecajqb() & 4294967295L))));
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final s.iobyxmoadg ojitshcjhn(igdgnonuha.lqeggnwhkg lqeggnwhkgVar, jztzpxfvev.jlmebxxoox jlmebxxooxVar) {
        return new iobyxmoadg(lqeggnwhkgVar, jlmebxxooxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean oxmwwwfdhm(b1 b1Var, pj.cllcsxoeiz cllcsxoeizVar) {
        if (!((Boolean) b1Var.nufgyqmvbu().yggfygwlhe().invoke(c1.HalfExpanded)).booleanValue()) {
            return true;
        }
        pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new eablkybsjg(b1Var, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b1 pkzmftpjix(c1 c1Var, w0.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, vipkmwdibw.gtknphoqwx gtknphoqwxVar, boolean z13) {
        return new b1(c1Var, wkgbmnqykcVar, draadjrbmkVar, gtknphoqwxVar, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn pmvmpeiblj(long j13, androidx.compose.runtime.i1 i1Var, j.gxszxtbevo gxszxtbevoVar) {
        j.gxszxtbevo.ribwqtqdhb(gxszxtbevoVar, j13, 0L, 0L, zg.gtknphoqwx.wflxmlrfwp(cqumvgiudr(i1Var), 0.0f, 1.0f), null, null, 0, 118, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x010d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0113  */
    /* JADX WARN: Code duplicated, block: B:104:0x0116  */
    /* JADX WARN: Code duplicated, block: B:108:0x0123  */
    /* JADX WARN: Code duplicated, block: B:109:0x0125  */
    /* JADX WARN: Code duplicated, block: B:112:0x012e  */
    /* JADX WARN: Code duplicated, block: B:136:0x017c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x017e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0181  */
    /* JADX WARN: Code duplicated, block: B:141:0x0186  */
    /* JADX WARN: Code duplicated, block: B:142:0x019c  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:147:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01db  */
    /* JADX WARN: Code duplicated, block: B:162:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:163:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:166:0x0207  */
    /* JADX WARN: Code duplicated, block: B:167:0x0213  */
    /* JADX WARN: Code duplicated, block: B:170:0x0221  */
    /* JADX WARN: Code duplicated, block: B:173:0x0257  */
    /* JADX WARN: Code duplicated, block: B:176:0x0263  */
    /* JADX WARN: Code duplicated, block: B:177:0x0267  */
    /* JADX WARN: Code duplicated, block: B:182:0x0296  */
    /* JADX WARN: Code duplicated, block: B:185:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:188:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:189:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:194:0x0316  */
    /* JADX WARN: Code duplicated, block: B:199:0x034b  */
    /* JADX WARN: Code duplicated, block: B:202:0x0362  */
    /* JADX WARN: Code duplicated, block: B:203:0x0364  */
    /* JADX WARN: Code duplicated, block: B:206:0x0390  */
    /* JADX WARN: Code duplicated, block: B:212:0x03af  */
    /* JADX WARN: Code duplicated, block: B:214:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:220:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:223:0x0403  */
    /* JADX WARN: Code duplicated, block: B:227:0x041e  */
    /* JADX WARN: Code duplicated, block: B:229:0x0433  */
    /* JADX WARN: Code duplicated, block: B:232:0x0480  */
    /* JADX WARN: Code duplicated, block: B:234:0x0493  */
    /* JADX WARN: Code duplicated, block: B:237:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:97:0x0105  */
    /* JADX WARN: Code duplicated, block: B:99:0x0109  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void rgvfuqvkyq(final tg.vdvldrhtss vdvldrhtssVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, b1 b1Var, boolean z13, h.e eVar, float f13, long j13, long j14, long j15, final tg.rgvfuqvkyq rgvfuqvkyqVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        b1 b1Var2;
        int i16;
        boolean z14;
        int i17;
        long jWkgbmnqykc;
        long j16;
        int i18;
        int i19;
        boolean z15;
        final float f14;
        long j17;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        final b1 b1Var3;
        long j18;
        final boolean z16;
        final h.e eVar2;
        long j19;
        androidx.compose.runtime.a0 a0VarWflxmlrfwp;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        final b1 b1VarWwaezpbzkn;
        h.e eVarIobyxmoadg;
        float fZoijcleaow;
        long jAgtfadlqog;
        int i23;
        long jPpxfxbqfkf;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar;
        final pj.cllcsxoeiz cllcsxoeizVar;
        jztzpxfvev.jlmebxxoox jlmebxxooxVar;
        int iIobyxmoadg;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf;
        int iIobyxmoadg2;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg2;
        boolean z17;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2;
        boolean zLmojexxdyd;
        Object objYadqdtsiqt2;
        Object objPmvmpeiblj;
        c1 c1Var;
        boolean z18;
        jztzpxfvev.jlmebxxoox jlmebxxooxVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow;
        boolean z19;
        boolean zLmojexxdyd2;
        Object objYadqdtsiqt3;
        boolean zUlzqkzuiru;
        Object objOjitshcjhn;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-336264970);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i33 = i14 & 2;
        if (i33 == 0) {
            if ((i13 & 48) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if ((i14 & 4) == 0) {
                    b1Var2 = b1Var;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(b1Var2)) {
                        i29 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    }
                    i15 |= i29;
                } else {
                    b1Var2 = b1Var;
                }
                i29 = UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 |= i29;
            } else {
                b1Var2 = b1Var;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                i15 |= 3072;
                z14 = z13;
            } else {
                z14 = z13;
                if ((i13 & 3072) == 0) {
                    if (draadjrbmkVarBtonecajqb.iobyxmoadg(z14)) {
                        i17 = 2048;
                    } else {
                        i17 = UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    i15 |= i17;
                }
            }
            if ((i13 & 24576) != 0) {
                if ((i14 & 16) == 0 || !draadjrbmkVarBtonecajqb.ulzqkzuiru(eVar)) {
                    i28 = 8192;
                } else {
                    i28 = 16384;
                }
                i15 |= i28;
            }
            if ((196608 & i13) != 0) {
                if ((i14 & 32) == 0 || !draadjrbmkVarBtonecajqb.zoijcleaow(f13)) {
                    i27 = 65536;
                } else {
                    i27 = 131072;
                }
                i15 |= i27;
            }
            if ((i13 & 1572864) != 0) {
                if ((i14 & 64) == 0 || !draadjrbmkVarBtonecajqb.wkgbmnqykc(j13)) {
                    i26 = 524288;
                } else {
                    i26 = 1048576;
                }
                i15 |= i26;
            }
            if ((12582912 & i13) == 0) {
                jWkgbmnqykc = j14;
                if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 || !draadjrbmkVarBtonecajqb.wkgbmnqykc(jWkgbmnqykc)) {
                    i25 = 4194304;
                } else {
                    i25 = 8388608;
                }
                i15 |= i25;
            } else {
                jWkgbmnqykc = j14;
            }
            if ((100663296 & i13) == 0) {
                j16 = j15;
                if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 || !draadjrbmkVarBtonecajqb.wkgbmnqykc(j16)) {
                    i24 = 33554432;
                } else {
                    i24 = 67108864;
                }
                i15 |= i24;
            } else {
                j16 = j15;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                i15 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i15 |= i18;
            }
            i19 = i15;
            if ((306783379 & i19) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (draadjrbmkVarBtonecajqb.vdvldrhtss(z15, i19 & 1)) {
                draadjrbmkVarBtonecajqb.wwaezpbzkn();
                if ((i13 & 1) != 0 || draadjrbmkVarBtonecajqb.dsvhmnatus()) {
                    if (i33 != 0) {
                        wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar4 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        b1VarWwaezpbzkn = wwaezpbzkn(c1.Hidden, null, null, false, draadjrbmkVarBtonecajqb, 6, 14);
                        i19 &= -897;
                    } else {
                        b1VarWwaezpbzkn = b1Var2;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if ((i14 & 16) != 0) {
                        eVarIobyxmoadg = z.f44180iobyxmoadg.zoijcleaow(draadjrbmkVarBtonecajqb, 6).iobyxmoadg();
                        i19 &= -57345;
                    } else {
                        eVarIobyxmoadg = eVar;
                    }
                    if ((i14 & 32) != 0) {
                        fZoijcleaow = g0.f42958iobyxmoadg.zoijcleaow();
                        i19 &= -458753;
                    } else {
                        fZoijcleaow = f13;
                    }
                    if ((i14 & 64) != 0) {
                        jAgtfadlqog = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6).agtfadlqog();
                        i19 &= -3670017;
                    } else {
                        jAgtfadlqog = j13;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jAgtfadlqog, draadjrbmkVarBtonecajqb, (i19 >> 18) & 14);
                        i19 = (-29360129) & i19;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                        i23 = i19 & (-234881025);
                        jPpxfxbqfkf = g0.f42958iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 0);
                    } else {
                        i23 = i19;
                        jPpxfxbqfkf = j15;
                    }
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    if ((i14 & 4) != 0) {
                        i19 &= -897;
                    }
                    if ((i14 & 16) != 0) {
                        i19 &= -57345;
                    }
                    if ((i14 & 32) != 0) {
                        i19 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        i19 &= -3670017;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        i19 &= -29360129;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                        i19 &= -234881025;
                    }
                    eVarIobyxmoadg = eVar;
                    wkgbmnqykcVar4 = wkgbmnqykcVar2;
                    b1VarWwaezpbzkn = b1Var2;
                    i23 = i19;
                    jPpxfxbqfkf = j16;
                    fZoijcleaow = f13;
                    jAgtfadlqog = j13;
                }
                draadjrbmkVarBtonecajqb.esjtqupxsv();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-336264970, i23, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:352)");
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                cllcsxoeizVar = (pj.cllcsxoeiz) objYadqdtsiqt;
                jlmebxxooxVar = jztzpxfvev.jlmebxxoox.Vertical;
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
                long j23 = jWkgbmnqykc;
                x.zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar2.ojitshcjhn(), false);
                iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                long j24 = jAgtfadlqog;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar4);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar4;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg = androidx.compose.runtime.m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                h.e eVar3 = eVarIobyxmoadg;
                androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar3.ppxfxbqfkf());
                androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iIobyxmoadg))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iIobyxmoadg));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iIobyxmoadg), rgvfuqvkyqVarZoijcleaow);
                }
                androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                wkgbmnqykcVarPpxfxbqfkf = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(wkgbmnqykcVarPpxfxbqfkf, 0.0f, 1, null);
                x.zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar2.ojitshcjhn(), false);
                iIobyxmoadg2 = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo);
                iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar3.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg2 = androidx.compose.runtime.m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                z17 = z14;
                androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar3.ppxfxbqfkf());
                androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar3.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar3.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iIobyxmoadg2))) {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iIobyxmoadg2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iIobyxmoadg2), rgvfuqvkyqVarZoijcleaow2);
                }
                androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar3.wkgbmnqykc());
                rgvfuqvkyqVar.invoke(draadjrbmkVarBtonecajqb, Integer.valueOf((i23 >> 27) & 14));
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(b1VarWwaezpbzkn) | draadjrbmkVarBtonecajqb.lmojexxdyd(cllcsxoeizVar);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: igdgnonuha.n0
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return v0.yggfygwlhe(b1VarWwaezpbzkn, cllcsxoeizVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                tg.iobyxmoadg iobyxmoadgVar4 = (tg.iobyxmoadg) objYadqdtsiqt2;
                objPmvmpeiblj = b1VarWwaezpbzkn.nufgyqmvbu().pmvmpeiblj();
                c1Var = c1.Hidden;
                if (objPmvmpeiblj != c1Var) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                iwizpuwonk(jPpxfxbqfkf, iobyxmoadgVar4, z18, draadjrbmkVarBtonecajqb, (i23 >> 24) & 14);
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.foundation.layout.cdpycssgdh.iwizpuwonk(wflxmlrfwpVar.wkgbmnqykc(wkgbmnqykcVarPpxfxbqfkf, iobyxmoadgVar2.wflxmlrfwp()), 0.0f, f43944ppxfxbqfkf, 1, null), 0.0f, 1, null);
                if (z17) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(351375666);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(b1VarWwaezpbzkn.nufgyqmvbu());
                    Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (!zUlzqkzuiru || objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
                        jlmebxxooxVar2 = jlmebxxooxVar;
                        objOjitshcjhn = ojitshcjhn(b1VarWwaezpbzkn.nufgyqmvbu(), jlmebxxooxVar2);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objOjitshcjhn);
                    } else {
                        objOjitshcjhn = objYadqdtsiqt4;
                        jlmebxxooxVar2 = jlmebxxooxVar;
                    }
                    wkgbmnqykcVarZoijcleaow = androidx.compose.ui.input.nestedscroll.iobyxmoadg.zoijcleaow(wkgbmnqykcVarPpxfxbqfkf, (s.iobyxmoadg) objOjitshcjhn, null, 2, null);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    jlmebxxooxVar2 = jlmebxxooxVar;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1258275768);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wkgbmnqykcVarZoijcleaow = wkgbmnqykcVarPpxfxbqfkf;
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarYadqdtsiqt = yadqdtsiqt(wkgbmnqykcVarNufgyqmvbu.eablkybsjg(wkgbmnqykcVarZoijcleaow), b1VarWwaezpbzkn);
                igdgnonuha.lqeggnwhkg lqeggnwhkgVarNufgyqmvbu = b1VarWwaezpbzkn.nufgyqmvbu();
                if (z17 || b1VarWwaezpbzkn.nufgyqmvbu().jyumaefscl() == c1Var) {
                    z19 = false;
                } else {
                    z19 = true;
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.material.iobyxmoadg.eablkybsjg(wkgbmnqykcVarYadqdtsiqt, lqeggnwhkgVarNufgyqmvbu, jlmebxxooxVar2, z19, false, null, false, 56, null);
                if (z17) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(352377090);
                    zLmojexxdyd2 = draadjrbmkVarBtonecajqb.lmojexxdyd(b1VarWwaezpbzkn) | draadjrbmkVarBtonecajqb.lmojexxdyd(cllcsxoeizVar);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zLmojexxdyd2 || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: igdgnonuha.o0
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return v0.vdvldrhtss(b1VarWwaezpbzkn, cllcsxoeizVar, (g0.yadqdtsiqt) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    wkgbmnqykcVarPpxfxbqfkf = g0.kcexrzcfyt.ppxfxbqfkf(wkgbmnqykcVarPpxfxbqfkf, false, (tg.draadjrbmk) objYadqdtsiqt3, 1, null);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1258354200);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                }
                int i34 = i23 >> 12;
                a4.ppxfxbqfkf(wkgbmnqykcVarEablkybsjg3.eablkybsjg(wkgbmnqykcVarPpxfxbqfkf), eVar3, j24, j23, null, fZoijcleaow, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1557535116, true, new gxszxtbevo(vdvldrhtssVar), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i23 >> 9) & 112) | 1572864 | (i34 & 896) | (i34 & 7168) | (i23 & 458752), 16);
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                j18 = j23;
                j19 = j24;
                b1Var3 = b1VarWwaezpbzkn;
                j17 = jPpxfxbqfkf;
                wkgbmnqykcVar3 = wkgbmnqykcVar5;
                eVar2 = eVar3;
                z16 = z17;
                f14 = fZoijcleaow;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                f14 = f13;
                j17 = j15;
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                b1Var3 = b1Var2;
                j18 = jWkgbmnqykc;
                z16 = z14;
                eVar2 = eVar;
                j19 = j13;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final long j25 = j19;
                final long j26 = j18;
                final long j27 = j17;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.p0
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return v0.jyumaefscl(vdvldrhtssVar, wkgbmnqykcVar3, b1Var3, z16, eVar2, f14, j25, j26, j27, rgvfuqvkyqVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                b1Var2 = b1Var;
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(b1Var2)) {
                    i29 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                }
                i15 |= i29;
            } else {
                b1Var2 = b1Var;
            }
            i29 = UserVerificationMethods.USER_VERIFY_PATTERN;
            i15 |= i29;
        } else {
            b1Var2 = b1Var;
        }
        i16 = i14 & 8;
        if (i16 != 0) {
            i15 |= 3072;
            z14 = z13;
        } else {
            z14 = z13;
            if ((i13 & 3072) == 0) {
                if (draadjrbmkVarBtonecajqb.iobyxmoadg(z14)) {
                    i17 = 2048;
                } else {
                    i17 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i15 |= i17;
            }
        }
        if ((i13 & 24576) != 0) {
            if ((i14 & 16) == 0) {
                i28 = 8192;
            } else {
                i28 = 8192;
            }
            i15 |= i28;
        }
        if ((196608 & i13) != 0) {
            if ((i14 & 32) == 0) {
                i27 = 65536;
            } else {
                i27 = 65536;
            }
            i15 |= i27;
        }
        if ((i13 & 1572864) != 0) {
            if ((i14 & 64) == 0) {
                i26 = 524288;
            } else {
                i26 = 524288;
            }
            i15 |= i26;
        }
        if ((12582912 & i13) == 0) {
            jWkgbmnqykc = j14;
            if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                i25 = 4194304;
            } else {
                i25 = 4194304;
            }
            i15 |= i25;
        } else {
            jWkgbmnqykc = j14;
        }
        if ((100663296 & i13) == 0) {
            j16 = j15;
            if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
                i24 = 33554432;
            } else {
                i24 = 33554432;
            }
            i15 |= i24;
        } else {
            j16 = j15;
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            i15 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i15 |= i18;
        }
        i19 = i15;
        if ((306783379 & i19) != 306783378) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss(z15, i19 & 1)) {
            draadjrbmkVarBtonecajqb.wwaezpbzkn();
            if ((i13 & 1) != 0) {
                if (i33 != 0) {
                    wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar4 = wkgbmnqykcVar2;
                }
                if ((i14 & 4) != 0) {
                    b1VarWwaezpbzkn = wwaezpbzkn(c1.Hidden, null, null, false, draadjrbmkVarBtonecajqb, 6, 14);
                    i19 &= -897;
                } else {
                    b1VarWwaezpbzkn = b1Var2;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if ((i14 & 16) != 0) {
                    eVarIobyxmoadg = z.f44180iobyxmoadg.zoijcleaow(draadjrbmkVarBtonecajqb, 6).iobyxmoadg();
                    i19 &= -57345;
                } else {
                    eVarIobyxmoadg = eVar;
                }
                if ((i14 & 32) != 0) {
                    fZoijcleaow = g0.f42958iobyxmoadg.zoijcleaow();
                    i19 &= -458753;
                } else {
                    fZoijcleaow = f13;
                }
                if ((i14 & 64) != 0) {
                    jAgtfadlqog = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6).agtfadlqog();
                    i19 &= -3670017;
                } else {
                    jAgtfadlqog = j13;
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jAgtfadlqog, draadjrbmkVarBtonecajqb, (i19 >> 18) & 14);
                    i19 = (-29360129) & i19;
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                    i23 = i19 & (-234881025);
                    jPpxfxbqfkf = g0.f42958iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 0);
                } else {
                    i23 = i19;
                    jPpxfxbqfkf = j15;
                }
            } else {
                if (i33 != 0) {
                    wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar4 = wkgbmnqykcVar2;
                }
                if ((i14 & 4) != 0) {
                    b1VarWwaezpbzkn = wwaezpbzkn(c1.Hidden, null, null, false, draadjrbmkVarBtonecajqb, 6, 14);
                    i19 &= -897;
                } else {
                    b1VarWwaezpbzkn = b1Var2;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if ((i14 & 16) != 0) {
                    eVarIobyxmoadg = z.f44180iobyxmoadg.zoijcleaow(draadjrbmkVarBtonecajqb, 6).iobyxmoadg();
                    i19 &= -57345;
                } else {
                    eVarIobyxmoadg = eVar;
                }
                if ((i14 & 32) != 0) {
                    fZoijcleaow = g0.f42958iobyxmoadg.zoijcleaow();
                    i19 &= -458753;
                } else {
                    fZoijcleaow = f13;
                }
                if ((i14 & 64) != 0) {
                    jAgtfadlqog = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6).agtfadlqog();
                    i19 &= -3670017;
                } else {
                    jAgtfadlqog = j13;
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jAgtfadlqog, draadjrbmkVarBtonecajqb, (i19 >> 18) & 14);
                    i19 = (-29360129) & i19;
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                    i23 = i19 & (-234881025);
                    jPpxfxbqfkf = g0.f42958iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 0);
                } else {
                    i23 = i19;
                    jPpxfxbqfkf = j15;
                }
            }
            draadjrbmkVarBtonecajqb.esjtqupxsv();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-336264970, i23, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:352)");
            }
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            cllcsxoeizVar = (pj.cllcsxoeiz) objYadqdtsiqt;
            jlmebxxooxVar = jztzpxfvev.jlmebxxoox.Vertical;
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar5 = a.eablkybsjg.f20iobyxmoadg;
            long j28 = jWkgbmnqykc;
            x.zynmafqrjb zynmafqrjbVarDxjokdxxww3 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar5.ojitshcjhn(), false);
            iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            long j29 = jAgtfadlqog;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg4 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar4);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar6 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar4;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar6.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = androidx.compose.runtime.m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            h.e eVar4 = eVarIobyxmoadg;
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar6.ppxfxbqfkf());
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar6.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar6.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iIobyxmoadg));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iIobyxmoadg), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iIobyxmoadg));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iIobyxmoadg), rgvfuqvkyqVarZoijcleaow);
            }
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg4, iobyxmoadgVar6.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar2 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            wkgbmnqykcVarPpxfxbqfkf = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(wkgbmnqykcVarPpxfxbqfkf, 0.0f, 1, null);
            x.zynmafqrjb zynmafqrjbVarDxjokdxxww4 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar5.ojitshcjhn(), false);
            iIobyxmoadg2 = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt4 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg5 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo2);
            iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar6.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg2 = androidx.compose.runtime.m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            z17 = z14;
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarDxjokdxxww4, iobyxmoadgVar6.ppxfxbqfkf());
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt4, iobyxmoadgVar6.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar6.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iIobyxmoadg2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iIobyxmoadg2), rgvfuqvkyqVarZoijcleaow2);
            } else {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iIobyxmoadg2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iIobyxmoadg2), rgvfuqvkyqVarZoijcleaow2);
            }
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg5, iobyxmoadgVar6.wkgbmnqykc());
            rgvfuqvkyqVar.invoke(draadjrbmkVarBtonecajqb, Integer.valueOf((i23 >> 27) & 14));
            zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(b1VarWwaezpbzkn) | draadjrbmkVarBtonecajqb.lmojexxdyd(cllcsxoeizVar);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: igdgnonuha.n0
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return v0.yggfygwlhe(b1VarWwaezpbzkn, cllcsxoeizVar);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: igdgnonuha.n0
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return v0.yggfygwlhe(b1VarWwaezpbzkn, cllcsxoeizVar);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            tg.iobyxmoadg iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt2;
            objPmvmpeiblj = b1VarWwaezpbzkn.nufgyqmvbu().pmvmpeiblj();
            c1Var = c1.Hidden;
            if (objPmvmpeiblj != c1Var) {
                z18 = true;
            } else {
                z18 = false;
            }
            iwizpuwonk(jPpxfxbqfkf, iobyxmoadgVar7, z18, draadjrbmkVarBtonecajqb, (i23 >> 24) & 14);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu2 = androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.foundation.layout.cdpycssgdh.iwizpuwonk(wflxmlrfwpVar2.wkgbmnqykc(wkgbmnqykcVarPpxfxbqfkf, iobyxmoadgVar5.wflxmlrfwp()), 0.0f, f43944ppxfxbqfkf, 1, null), 0.0f, 1, null);
            if (z17) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(351375666);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(b1VarWwaezpbzkn.nufgyqmvbu());
                Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    jlmebxxooxVar2 = jlmebxxooxVar;
                    objOjitshcjhn = ojitshcjhn(b1VarWwaezpbzkn.nufgyqmvbu(), jlmebxxooxVar2);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objOjitshcjhn);
                } else {
                    jlmebxxooxVar2 = jlmebxxooxVar;
                    objOjitshcjhn = ojitshcjhn(b1VarWwaezpbzkn.nufgyqmvbu(), jlmebxxooxVar2);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objOjitshcjhn);
                }
                wkgbmnqykcVarZoijcleaow = androidx.compose.ui.input.nestedscroll.iobyxmoadg.zoijcleaow(wkgbmnqykcVarPpxfxbqfkf, (s.iobyxmoadg) objOjitshcjhn, null, 2, null);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                jlmebxxooxVar2 = jlmebxxooxVar;
                draadjrbmkVarBtonecajqb.sopmlzcsov(1258275768);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                wkgbmnqykcVarZoijcleaow = wkgbmnqykcVarPpxfxbqfkf;
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarYadqdtsiqt2 = yadqdtsiqt(wkgbmnqykcVarNufgyqmvbu2.eablkybsjg(wkgbmnqykcVarZoijcleaow), b1VarWwaezpbzkn);
            igdgnonuha.lqeggnwhkg lqeggnwhkgVarNufgyqmvbu2 = b1VarWwaezpbzkn.nufgyqmvbu();
            if (z17) {
                z19 = false;
            } else {
                z19 = false;
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg6 = androidx.compose.material.iobyxmoadg.eablkybsjg(wkgbmnqykcVarYadqdtsiqt2, lqeggnwhkgVarNufgyqmvbu2, jlmebxxooxVar2, z19, false, null, false, 56, null);
            if (z17) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(352377090);
                zLmojexxdyd2 = draadjrbmkVarBtonecajqb.lmojexxdyd(b1VarWwaezpbzkn) | draadjrbmkVarBtonecajqb.lmojexxdyd(cllcsxoeizVar);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd2) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: igdgnonuha.o0
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return v0.vdvldrhtss(b1VarWwaezpbzkn, cllcsxoeizVar, (g0.yadqdtsiqt) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                } else {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: igdgnonuha.o0
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return v0.vdvldrhtss(b1VarWwaezpbzkn, cllcsxoeizVar, (g0.yadqdtsiqt) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                wkgbmnqykcVarPpxfxbqfkf = g0.kcexrzcfyt.ppxfxbqfkf(wkgbmnqykcVarPpxfxbqfkf, false, (tg.draadjrbmk) objYadqdtsiqt3, 1, null);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1258354200);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            int i35 = i23 >> 12;
            a4.ppxfxbqfkf(wkgbmnqykcVarEablkybsjg6.eablkybsjg(wkgbmnqykcVarPpxfxbqfkf), eVar4, j29, j28, null, fZoijcleaow, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1557535116, true, new gxszxtbevo(vdvldrhtssVar), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i23 >> 9) & 112) | 1572864 | (i35 & 896) | (i35 & 7168) | (i23 & 458752), 16);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            j18 = j28;
            j19 = j29;
            b1Var3 = b1VarWwaezpbzkn;
            j17 = jPpxfxbqfkf;
            wkgbmnqykcVar3 = wkgbmnqykcVar6;
            eVar2 = eVar4;
            z16 = z17;
            f14 = fZoijcleaow;
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            f14 = f13;
            j17 = j15;
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            b1Var3 = b1Var2;
            j18 = jWkgbmnqykc;
            z16 = z14;
            eVar2 = eVar;
            j19 = j13;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final long j210 = j19;
            final long j211 = j18;
            final long j212 = j17;
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.p0
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return v0.jyumaefscl(vdvldrhtssVar, wkgbmnqykcVar3, b1Var3, z16, eVar2, f14, j210, j211, j212, rgvfuqvkyqVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn vdvldrhtss(final b1 b1Var, final pj.cllcsxoeiz cllcsxoeizVar, g0.yadqdtsiqt yadqdtsiqtVar) {
        if (b1Var.ojitshcjhn()) {
            g0.zynmafqrjb.draadjrbmk(yadqdtsiqtVar, null, new tg.iobyxmoadg() { // from class: igdgnonuha.u0
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return Boolean.valueOf(v0.kcexrzcfyt(b1Var, cllcsxoeizVar));
                }
            }, 1, null);
            if (b1Var.nufgyqmvbu().jyumaefscl() == c1.HalfExpanded) {
                g0.zynmafqrjb.ojitshcjhn(yadqdtsiqtVar, null, new tg.iobyxmoadg() { // from class: igdgnonuha.i0
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Boolean.valueOf(v0.zdlpuopuiu(b1Var, cllcsxoeizVar));
                    }
                }, 1, null);
            } else if (b1Var.btonecajqb()) {
                g0.zynmafqrjb.wkgbmnqykc(yadqdtsiqtVar, null, new tg.iobyxmoadg() { // from class: igdgnonuha.j0
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Boolean.valueOf(v0.oxmwwwfdhm(b1Var, cllcsxoeizVar));
                    }
                }, 1, null);
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final b1 wwaezpbzkn(final c1 c1Var, vipkmwdibw.gtknphoqwx gtknphoqwxVar, tg.draadjrbmk draadjrbmkVar, boolean z13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i13, int i14) {
        if ((i14 & 2) != 0) {
            gtknphoqwxVar = g0.f42958iobyxmoadg.iobyxmoadg();
        }
        final vipkmwdibw.gtknphoqwx gtknphoqwxVar2 = gtknphoqwxVar;
        if ((i14 & 4) != 0) {
            Object objYadqdtsiqt = draadjrbmkVar2.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: igdgnonuha.h0
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(v0.ylkuphrtab((c1) obj));
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar = (tg.draadjrbmk) objYadqdtsiqt;
        }
        final tg.draadjrbmk draadjrbmkVar3 = draadjrbmkVar;
        final boolean z14 = (i14 & 8) != 0 ? false : z13;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-126412120, i13, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:277)");
        }
        final w0.wkgbmnqykc wkgbmnqykcVar = (w0.wkgbmnqykc) draadjrbmkVar2.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.gxszxtbevo());
        draadjrbmkVar2.ylkuphrtab(-1222943993, c1Var);
        Object[] objArr = {c1Var, gtknphoqwxVar2, Boolean.valueOf(z14), draadjrbmkVar3, wkgbmnqykcVar};
        rhgxfdycjh.jyumaefscl jyumaefsclVarPpxfxbqfkf = b1.f42625wkgbmnqykc.ppxfxbqfkf(gtknphoqwxVar2, draadjrbmkVar3, z14, wkgbmnqykcVar);
        boolean z15 = true;
        boolean zUlzqkzuiru = ((((i13 & 14) ^ 6) > 4 && draadjrbmkVar2.ppxfxbqfkf(c1Var.ordinal())) || (i13 & 6) == 4) | draadjrbmkVar2.ulzqkzuiru(wkgbmnqykcVar) | ((((i13 & 896) ^ 384) > 256 && draadjrbmkVar2.ulzqkzuiru(draadjrbmkVar3)) || (i13 & 384) == 256) | draadjrbmkVar2.lmojexxdyd(gtknphoqwxVar2);
        if ((((i13 & 7168) ^ 3072) <= 2048 || !draadjrbmkVar2.iobyxmoadg(z14)) && (i13 & 3072) != 2048) {
            z15 = false;
        }
        boolean z16 = zUlzqkzuiru | z15;
        Object objYadqdtsiqt2 = draadjrbmkVar2.yadqdtsiqt();
        if (z16 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: igdgnonuha.m0
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return v0.pkzmftpjix(c1Var, wkgbmnqykcVar, draadjrbmkVar3, gtknphoqwxVar2, z14);
                }
            };
            draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
        }
        b1 b1Var = (b1) rhgxfdycjh.wkgbmnqykc.eablkybsjg(objArr, jyumaefsclVarPpxfxbqfkf, (tg.iobyxmoadg) objYadqdtsiqt2, draadjrbmkVar2, 0);
        draadjrbmkVar2.mbcevpiqjq();
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return b1Var;
    }

    private static final androidx.compose.ui.wkgbmnqykc yadqdtsiqt(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final b1 b1Var) {
        return androidx.compose.material.iobyxmoadg.nufgyqmvbu(wkgbmnqykcVar, b1Var.nufgyqmvbu(), jztzpxfvev.jlmebxxoox.Vertical, new tg.rgvfuqvkyq() { // from class: igdgnonuha.t0
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return v0.iozdgvuglv(b1Var, (w0.oxmwwwfdhm) obj, (w0.zoijcleaow) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn yggfygwlhe(b1 b1Var, pj.cllcsxoeiz cllcsxoeizVar) {
        if (((Boolean) b1Var.nufgyqmvbu().yggfygwlhe().invoke(c1.Hidden)).booleanValue()) {
            pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new zoijcleaow(b1Var, null), 3, null);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ylkuphrtab(c1 c1Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zdlpuopuiu(b1 b1Var, pj.cllcsxoeiz cllcsxoeizVar) {
        if (!((Boolean) b1Var.nufgyqmvbu().yggfygwlhe().invoke(c1.Expanded)).booleanValue()) {
            return true;
        }
        pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new wkgbmnqykc(b1Var, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn zynmafqrjb(long j13, tg.iobyxmoadg iobyxmoadgVar, boolean z13, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        iwizpuwonk(j13, iobyxmoadgVar, z13, draadjrbmkVar, androidx.compose.runtime.f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
