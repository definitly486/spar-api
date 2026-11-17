package opjhrmiecq;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j0.eablkybsjg f73539iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private j0.eablkybsjg f73540ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f73542zoijcleaow = androidx.compose.runtime.c1.ppxfxbqfkf(null, null, 2, null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final SnapshotStateList f73541wkgbmnqykc = androidx.compose.runtime.v0.gxszxtbevo();

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ lxfrhoxuzk f73543yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f73544zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(lxfrhoxuzk lxfrhoxuzkVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f73543yggfygwlhe = lxfrhoxuzkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f73543yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f73544zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                lxfrhoxuzk lxfrhoxuzkVar = this.f73543yggfygwlhe;
                this.f73544zdlpuopuiu = 1;
                if (lxfrhoxuzkVar.eablkybsjg(this) == objGxszxtbevo) {
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
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements h.e {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ h.mhtqkkgtqm f73545iobyxmoadg;

        ppxfxbqfkf(h.mhtqkkgtqm mhtqkkgtqmVar) {
            this.f73545iobyxmoadg = mhtqkkgtqmVar;
        }

        @Override // h.e
        public h.ageimvtcrz iobyxmoadg(long j13, w0.zdlpuopuiu zdlpuopuiuVar, w0.wkgbmnqykc wkgbmnqykcVar) {
            return new h.ageimvtcrz.iobyxmoadg(this.f73545iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements androidx.compose.runtime.ntlheqmsrt {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f73547zoijcleaow;

        public zoijcleaow(tg.draadjrbmk draadjrbmkVar) {
            this.f73547zoijcleaow = draadjrbmkVar;
        }

        @Override // androidx.compose.runtime.ntlheqmsrt
        public void iobyxmoadg() {
            e1.this.f73541wkgbmnqykc.remove(this.f73547zoijcleaow);
        }
    }

    public e1(j0.eablkybsjg eablkybsjgVar) {
        this.f73539iobyxmoadg = eablkybsjgVar;
        this.f73540ppxfxbqfkf = eablkybsjgVar.iobyxmoadg(new tg.draadjrbmk() { // from class: opjhrmiecq.r0
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return e1.iwizpuwonk((j0.eablkybsjg.wkgbmnqykc) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w0.agtfadlqog cllcsxoeiz(w0.rgvfuqvkyq rgvfuqvkyqVar) {
        return w0.agtfadlqog.ppxfxbqfkf(rgvfuqvkyqVar.btonecajqb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j1 hcddaimhww(e1 e1Var, j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar, k1 k1Var) {
        j0.f fVarCdpycssgdh = e1Var.cdpycssgdh();
        if (fVarCdpycssgdh == null) {
            return k1Var.iobyxmoadg(0, 0, new tg.iobyxmoadg() { // from class: opjhrmiecq.s0
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return e1.jpowsppfya();
                }
            });
        }
        j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVarLereixgezr = e1Var.lereixgezr(wkgbmnqykcVar, fVarCdpycssgdh);
        if (wkgbmnqykcVarLereixgezr == null) {
            return k1Var.iobyxmoadg(0, 0, new tg.iobyxmoadg() { // from class: opjhrmiecq.t0
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return e1.hkdspvbjdz();
                }
            });
        }
        final w0.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = w0.vdvldrhtss.zoijcleaow(fVarCdpycssgdh.lereixgezr(wkgbmnqykcVarLereixgezr.nufgyqmvbu(), wkgbmnqykcVarLereixgezr.gxszxtbevo()).getBounds());
        return k1Var.iobyxmoadg(rgvfuqvkyqVarZoijcleaow.gtknphoqwx(), rgvfuqvkyqVarZoijcleaow.eablkybsjg(), new tg.iobyxmoadg() { // from class: opjhrmiecq.u0
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return e1.cllcsxoeiz(rgvfuqvkyqVarZoijcleaow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w0.agtfadlqog hkdspvbjdz() {
        return w0.agtfadlqog.ppxfxbqfkf(w0.agtfadlqog.f118237zoijcleaow.zoijcleaow());
    }

    private final j0.jrbgnlbqoe iozdgvuglv(j0.jrbgnlbqoe jrbgnlbqoeVar, j0.jrbgnlbqoe jrbgnlbqoeVar2) {
        j0.jrbgnlbqoe jrbgnlbqoeVarEsjtqupxsv;
        return (jrbgnlbqoeVar == null || (jrbgnlbqoeVarEsjtqupxsv = jrbgnlbqoeVar.esjtqupxsv(jrbgnlbqoeVar2)) == null) ? jrbgnlbqoeVar2 : jrbgnlbqoeVarEsjtqupxsv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List iwizpuwonk(j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar) {
        j0.jrbgnlbqoe jrbgnlbqoeVar;
        if (wkgbmnqykcVar.lqeggnwhkg() instanceof j0.vdvldrhtss) {
            Object objLqeggnwhkg = wkgbmnqykcVar.lqeggnwhkg();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objLqeggnwhkg, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
            if (!f1.zoijcleaow(((j0.vdvldrhtss) objLqeggnwhkg).zoijcleaow())) {
                Object objLqeggnwhkg2 = wkgbmnqykcVar.lqeggnwhkg();
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objLqeggnwhkg2, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                j0.g gVarZoijcleaow = ((j0.vdvldrhtss) objLqeggnwhkg2).zoijcleaow();
                if (gVarZoijcleaow == null || (jrbgnlbqoeVar = gVarZoijcleaow.wkgbmnqykc()) == null) {
                    jrbgnlbqoeVar = new j0.jrbgnlbqoe(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65535, null);
                }
                return hg.jyumaefscl.lqeggnwhkg(wkgbmnqykcVar, new j0.eablkybsjg.wkgbmnqykc(jrbgnlbqoeVar, wkgbmnqykcVar.nufgyqmvbu(), wkgbmnqykcVar.gxszxtbevo()));
            }
        }
        return hg.jyumaefscl.lqeggnwhkg(wkgbmnqykcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w0.agtfadlqog jpowsppfya() {
        return w0.agtfadlqog.ppxfxbqfkf(w0.agtfadlqog.f118237zoijcleaow.zoijcleaow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean jyumaefscl(e1 e1Var) {
        j0.e eVarDraadjrbmk;
        j0.eablkybsjg eablkybsjgVar = e1Var.f73540ppxfxbqfkf;
        j0.f fVarCdpycssgdh = e1Var.cdpycssgdh();
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, (fVarCdpycssgdh == null || (eVarDraadjrbmk = fVarCdpycssgdh.draadjrbmk()) == null) ? null : eVarDraadjrbmk.btonecajqb());
    }

    private final void kcexrzcfyt(final Object[] objArr, final tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13) {
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-2083052099);
        int i14 = (i13 & 48) == 0 ? (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar) ? 32 : 16) | i13 : i13;
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(this) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        draadjrbmkVarBtonecajqb.ylkuphrtab(-358305778, Integer.valueOf(objArr.length));
        int i15 = i14 | (draadjrbmkVarBtonecajqb.ppxfxbqfkf(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(obj) ? 4 : 0;
        }
        draadjrbmkVarBtonecajqb.mbcevpiqjq();
        if ((i15 & 14) == 0) {
            i15 |= 2;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i15 & 147) != 146, i15 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-2083052099, i15, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:315)");
            }
            kotlin.jvm.internal.kegysxyocb kegysxyocbVar = new kotlin.jvm.internal.kegysxyocb(2);
            kegysxyocbVar.iobyxmoadg(draadjrbmkVar);
            kegysxyocbVar.zoijcleaow(objArr);
            Object[] objArrWkgbmnqykc = kegysxyocbVar.wkgbmnqykc(new Object[kegysxyocbVar.ppxfxbqfkf()]);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(this) | ((i15 & 112) == 32);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: opjhrmiecq.b1
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj2) {
                        return e1.zdlpuopuiu(this.f73479zdlpuopuiu, draadjrbmkVar, (androidx.compose.runtime.ulzqkzuiru) obj2);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            androidx.compose.runtime.jlmebxxoox.ppxfxbqfkf(objArrWkgbmnqykc, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        androidx.compose.runtime.a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: opjhrmiecq.c1
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj2, Object obj3) {
                    return e1.yggfygwlhe(this.f73499zdlpuopuiu, objArr, draadjrbmkVar, i13, (androidx.compose.runtime.draadjrbmk) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private final j0.eablkybsjg.wkgbmnqykc lereixgezr(j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar, j0.f fVar) {
        int iRgvfuqvkyq = j0.f.rgvfuqvkyq(fVar, fVar.agtfadlqog() - 1, false, 2, null);
        if (wkgbmnqykcVar.nufgyqmvbu() < iRgvfuqvkyq) {
            return j0.eablkybsjg.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar, null, 0, Math.min(wkgbmnqykcVar.gxszxtbevo(), iRgvfuqvkyq), null, 11, null);
        }
        return null;
    }

    private final h.mhtqkkgtqm lmojexxdyd(j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar) {
        j0.f fVarCdpycssgdh;
        h.mhtqkkgtqm mhtqkkgtqmVarLereixgezr = null;
        if (((Boolean) istkbnxepw().invoke()).booleanValue() && (fVarCdpycssgdh = cdpycssgdh()) != null) {
            j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVarLereixgezr = lereixgezr(wkgbmnqykcVar, fVarCdpycssgdh);
            if (wkgbmnqykcVarLereixgezr == null) {
                return null;
            }
            mhtqkkgtqmVarLereixgezr = fVarCdpycssgdh.lereixgezr(wkgbmnqykcVarLereixgezr.nufgyqmvbu(), wkgbmnqykcVarLereixgezr.gxszxtbevo());
            g.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = fVarCdpycssgdh.wkgbmnqykc(wkgbmnqykcVarLereixgezr.nufgyqmvbu());
            mhtqkkgtqmVarLereixgezr.agtfadlqog(g.eablkybsjg.eablkybsjg(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fVarCdpycssgdh.vdvldrhtss(wkgbmnqykcVarLereixgezr.nufgyqmvbu()) == fVarCdpycssgdh.vdvldrhtss(wkgbmnqykcVarLereixgezr.gxszxtbevo() + (-1)) ? Math.min(fVarCdpycssgdh.wkgbmnqykc(wkgbmnqykcVarLereixgezr.gxszxtbevo() - 1).nufgyqmvbu(), lqeggnwhkgVarWkgbmnqykc.nufgyqmvbu()) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(lqeggnwhkgVarWkgbmnqykc.gtknphoqwx())) & 4294967295L)) ^ (-9223372034707292160L)));
        }
        return mhtqkkgtqmVarLereixgezr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ojitshcjhn(g0.yadqdtsiqt yadqdtsiqtVar) {
        g0.cdpycssgdh cdpycssgdhVarCqumvgiudr = g0.esjtqupxsv.f35662iobyxmoadg.cqumvgiudr();
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        yadqdtsiqtVar.iobyxmoadg(cdpycssgdhVarCqumvgiudr, wwaezpbzknVar);
        return wwaezpbzknVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn oxmwwwfdhm(e1 e1Var, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        e1Var.agtfadlqog(draadjrbmkVar, androidx.compose.runtime.f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final androidx.compose.ui.wkgbmnqykc pkzmftpjix(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar2) {
        return wkgbmnqykcVar.eablkybsjg(new l1(new m1() { // from class: opjhrmiecq.d1
            @Override // opjhrmiecq.m1
            public final j1 iobyxmoadg(k1 k1Var) {
                return e1.hcddaimhww(this.f73523iobyxmoadg, wkgbmnqykcVar2, k1Var);
            }
        }));
    }

    private final androidx.compose.ui.wkgbmnqykc pmvmpeiblj(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar2) {
        return androidx.compose.ui.graphics.gxszxtbevo.iobyxmoadg(wkgbmnqykcVar, new tg.draadjrbmk() { // from class: opjhrmiecq.a1
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return e1.zynmafqrjb(this.f73433zdlpuopuiu, wkgbmnqykcVar2, (androidx.compose.ui.graphics.lqeggnwhkg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn rgvfuqvkyq(e1 e1Var, j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar, androidx.compose.ui.platform.r rVar) {
        e1Var.yadqdtsiqt((j0.vdvldrhtss) wkgbmnqykcVar.lqeggnwhkg(), rVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn vdvldrhtss(e1 e1Var, j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar, lxfrhoxuzk lxfrhoxuzkVar, yzdjzghtvl yzdjzghtvlVar) {
        j0.g gVarZoijcleaow;
        j0.g gVarZoijcleaow2;
        j0.g gVarZoijcleaow3;
        j0.g gVarZoijcleaow4 = ((j0.vdvldrhtss) wkgbmnqykcVar.lqeggnwhkg()).zoijcleaow();
        j0.jrbgnlbqoe jrbgnlbqoeVarPpxfxbqfkf = null;
        j0.jrbgnlbqoe jrbgnlbqoeVarIozdgvuglv = e1Var.iozdgvuglv(e1Var.iozdgvuglv(gVarZoijcleaow4 != null ? gVarZoijcleaow4.wkgbmnqykc() : null, (!lxfrhoxuzkVar.gxszxtbevo() || (gVarZoijcleaow3 = ((j0.vdvldrhtss) wkgbmnqykcVar.lqeggnwhkg()).zoijcleaow()) == null) ? null : gVarZoijcleaow3.iobyxmoadg()), (!lxfrhoxuzkVar.lqeggnwhkg() || (gVarZoijcleaow2 = ((j0.vdvldrhtss) wkgbmnqykcVar.lqeggnwhkg()).zoijcleaow()) == null) ? null : gVarZoijcleaow2.zoijcleaow());
        if (lxfrhoxuzkVar.nufgyqmvbu() && (gVarZoijcleaow = ((j0.vdvldrhtss) wkgbmnqykcVar.lqeggnwhkg()).zoijcleaow()) != null) {
            jrbgnlbqoeVarPpxfxbqfkf = gVarZoijcleaow.ppxfxbqfkf();
        }
        yzdjzghtvlVar.ppxfxbqfkf(wkgbmnqykcVar, e1Var.iozdgvuglv(jrbgnlbqoeVarIozdgvuglv, jrbgnlbqoeVarPpxfxbqfkf));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yadqdtsiqt(j0.vdvldrhtss vdvldrhtssVar, androidx.compose.ui.platform.r rVar) {
        if (vdvldrhtssVar instanceof j0.vdvldrhtss.zoijcleaow) {
            ((j0.vdvldrhtss.zoijcleaow) vdvldrhtssVar).iobyxmoadg();
            try {
                rVar.iobyxmoadg(((j0.vdvldrhtss.zoijcleaow) vdvldrhtssVar).eablkybsjg());
            } catch (IllegalArgumentException unused) {
            }
        } else if (vdvldrhtssVar instanceof j0.vdvldrhtss.iobyxmoadg) {
            ((j0.vdvldrhtss.iobyxmoadg) vdvldrhtssVar).iobyxmoadg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn yggfygwlhe(e1 e1Var, Object[] objArr, tg.draadjrbmk draadjrbmkVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        e1Var.kcexrzcfyt(objArr, draadjrbmkVar, draadjrbmkVar2, androidx.compose.runtime.f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final h.e ylkuphrtab(j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar) {
        h.mhtqkkgtqm mhtqkkgtqmVarLmojexxdyd = lmojexxdyd(wkgbmnqykcVar);
        if (mhtqkkgtqmVarLmojexxdyd != null) {
            return new ppxfxbqfkf(mhtqkkgtqmVarLmojexxdyd);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.ntlheqmsrt zdlpuopuiu(e1 e1Var, tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.ulzqkzuiru ulzqkzuiruVar) {
        e1Var.f73541wkgbmnqykc.add(draadjrbmkVar);
        return e1Var.new zoijcleaow(draadjrbmkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn zynmafqrjb(e1 e1Var, j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar, androidx.compose.ui.graphics.lqeggnwhkg lqeggnwhkgVar) {
        h.e eVarYlkuphrtab = e1Var.ylkuphrtab(wkgbmnqykcVar);
        if (eVarYlkuphrtab != null) {
            lqeggnwhkgVar.weqkydbzbr(eVarYlkuphrtab);
            lqeggnwhkgVar.vdvldrhtss(true);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void agtfadlqog(androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        char c13;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1154651354);
        char c14 = 2;
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i15 = 1;
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i14 & 3) != 2, i14 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1154651354, i14, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:214)");
            }
            final androidx.compose.ui.platform.r rVar = (androidx.compose.ui.platform.r) draadjrbmkVarBtonecajqb.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.oxmwwwfdhm());
            j0.eablkybsjg eablkybsjgVar = this.f73540ppxfxbqfkf;
            List listEablkybsjg = eablkybsjgVar.eablkybsjg(0, eablkybsjgVar.length());
            int size = listEablkybsjg.size();
            int i16 = 0;
            while (i16 < size) {
                final j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (j0.eablkybsjg.wkgbmnqykc) listEablkybsjg.get(i16);
                if (wkgbmnqykcVar.nufgyqmvbu() != wkgbmnqykcVar.gxszxtbevo()) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(725478935);
                    Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    metgxyhuhe.draadjrbmk draadjrbmkVar2 = (metgxyhuhe.draadjrbmk) objYadqdtsiqt;
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj = pmvmpeiblj(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, wkgbmnqykcVar);
                    Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: opjhrmiecq.v0
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return e1.ojitshcjhn((g0.yadqdtsiqt) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow = t.iwizpuwonk.zoijcleaow(androidx.compose.foundation.ojitshcjhn.zoijcleaow(pkzmftpjix(g0.kcexrzcfyt.ppxfxbqfkf(wkgbmnqykcVarPmvmpeiblj, false, (tg.draadjrbmk) objYadqdtsiqt2, i15, null), wkgbmnqykcVar), draadjrbmkVar2, false, 2, null), t.jyumaefscl.f109088iobyxmoadg.zoijcleaow(), false, 2, null);
                    boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(this) | draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(rVar);
                    Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zLmojexxdyd || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: opjhrmiecq.w0
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return e1.rgvfuqvkyq(this.f74035zdlpuopuiu, wkgbmnqykcVar, rVar);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    c13 = 2;
                    androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(androidx.compose.foundation.eablkybsjg.dxjokdxxww(wkgbmnqykcVarZoijcleaow, draadjrbmkVar2, null, (508 & 4) != 0, (508 & 8) != 0 ? null : null, (508 & 16) != 0 ? null : null, (508 & 32) != 0 ? null : null, (508 & 64) != 0 ? null : null, (508 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : null, (508 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0, (tg.iobyxmoadg) objYadqdtsiqt3), draadjrbmkVarBtonecajqb, 0);
                    if (f1.zoijcleaow(((j0.vdvldrhtss) wkgbmnqykcVar.lqeggnwhkg()).zoijcleaow())) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(728331710);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(726303039);
                        Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
                            objYadqdtsiqt4 = new lxfrhoxuzk(draadjrbmkVar2);
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                        }
                        final lxfrhoxuzk lxfrhoxuzkVar = (lxfrhoxuzk) objYadqdtsiqt4;
                        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                        Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt5 == iobyxmoadgVar.iobyxmoadg()) {
                            objYadqdtsiqt5 = new iobyxmoadg(lxfrhoxuzkVar, null);
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                        }
                        androidx.compose.runtime.jlmebxxoox.eablkybsjg(wwaezpbzknVar, (tg.rgvfuqvkyq) objYadqdtsiqt5, draadjrbmkVarBtonecajqb, 6);
                        Boolean boolValueOf = Boolean.valueOf(lxfrhoxuzkVar.lqeggnwhkg());
                        Boolean boolValueOf2 = Boolean.valueOf(lxfrhoxuzkVar.gxszxtbevo());
                        Boolean boolValueOf3 = Boolean.valueOf(lxfrhoxuzkVar.nufgyqmvbu());
                        j0.g gVarZoijcleaow = ((j0.vdvldrhtss) wkgbmnqykcVar.lqeggnwhkg()).zoijcleaow();
                        j0.jrbgnlbqoe jrbgnlbqoeVarWkgbmnqykc = gVarZoijcleaow != null ? gVarZoijcleaow.wkgbmnqykc() : null;
                        j0.g gVarZoijcleaow2 = ((j0.vdvldrhtss) wkgbmnqykcVar.lqeggnwhkg()).zoijcleaow();
                        j0.jrbgnlbqoe jrbgnlbqoeVarIobyxmoadg = gVarZoijcleaow2 != null ? gVarZoijcleaow2.iobyxmoadg() : null;
                        j0.g gVarZoijcleaow3 = ((j0.vdvldrhtss) wkgbmnqykcVar.lqeggnwhkg()).zoijcleaow();
                        j0.jrbgnlbqoe jrbgnlbqoeVarZoijcleaow = gVarZoijcleaow3 != null ? gVarZoijcleaow3.zoijcleaow() : null;
                        j0.g gVarZoijcleaow4 = ((j0.vdvldrhtss) wkgbmnqykcVar.lqeggnwhkg()).zoijcleaow();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, jrbgnlbqoeVarWkgbmnqykc, jrbgnlbqoeVarIobyxmoadg, jrbgnlbqoeVarZoijcleaow, gVarZoijcleaow4 != null ? gVarZoijcleaow4.ppxfxbqfkf() : null};
                        boolean zLmojexxdyd2 = draadjrbmkVarBtonecajqb.lmojexxdyd(this) | draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar);
                        Object objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (zLmojexxdyd2 || objYadqdtsiqt6 == iobyxmoadgVar.iobyxmoadg()) {
                            objYadqdtsiqt6 = new tg.draadjrbmk() { // from class: opjhrmiecq.x0
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return e1.vdvldrhtss(this.f74059zdlpuopuiu, wkgbmnqykcVar, lxfrhoxuzkVar, (yzdjzghtvl) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                        }
                        kcexrzcfyt(objArr, (tg.draadjrbmk) objYadqdtsiqt6, draadjrbmkVarBtonecajqb, (i14 << 6) & 896);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    c13 = c14;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(728345598);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                }
                i16++;
                c14 = c13;
                i15 = 1;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        androidx.compose.runtime.a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: opjhrmiecq.y0
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return e1.oxmwwwfdhm(this.f74062zdlpuopuiu, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final j0.f cdpycssgdh() {
        return (j0.f) this.f73542zoijcleaow.getValue();
    }

    public final j0.eablkybsjg esjtqupxsv() {
        j0.eablkybsjg eablkybsjgVarZoijcleaow;
        if (this.f73541wkgbmnqykc.isEmpty()) {
            eablkybsjgVarZoijcleaow = this.f73540ppxfxbqfkf;
        } else {
            yzdjzghtvl yzdjzghtvlVar = new yzdjzghtvl(this.f73540ppxfxbqfkf);
            SnapshotStateList snapshotStateList = this.f73541wkgbmnqykc;
            int size = snapshotStateList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((tg.draadjrbmk) snapshotStateList.get(i13)).invoke(yzdjzghtvlVar);
            }
            eablkybsjgVarZoijcleaow = yzdjzghtvlVar.zoijcleaow();
        }
        this.f73540ppxfxbqfkf = eablkybsjgVarZoijcleaow;
        return eablkybsjgVarZoijcleaow;
    }

    public final tg.iobyxmoadg istkbnxepw() {
        return new tg.iobyxmoadg() { // from class: opjhrmiecq.z0
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Boolean.valueOf(e1.jyumaefscl(this.f74080zdlpuopuiu));
            }
        };
    }

    public final void wwaezpbzkn(j0.f fVar) {
        this.f73542zoijcleaow.setValue(fVar);
    }
}
