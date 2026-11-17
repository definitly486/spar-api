package opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    static final class iobyxmoadg implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ p0.ylkuphrtab f73532iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ p0.tzroggbefp f73533jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ igdgnonuha f73534yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ h.jztzpxfvev f73535zdlpuopuiu;

        /* JADX INFO: renamed from: opjhrmiecq.e$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1606iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iwxlajgraz.yadqdtsiqt f73536yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f73537zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1606iobyxmoadg(iwxlajgraz.yadqdtsiqt yadqdtsiqtVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f73536yggfygwlhe = yadqdtsiqtVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new C1606iobyxmoadg(this.f73536yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f73537zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iwxlajgraz.yadqdtsiqt yadqdtsiqtVar = this.f73536yggfygwlhe;
                    this.f73537zdlpuopuiu = 1;
                    if (yadqdtsiqtVar.gxszxtbevo(this) == objGxszxtbevo) {
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
                return ((C1606iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        iobyxmoadg(h.jztzpxfvev jztzpxfvevVar, igdgnonuha igdgnonuhaVar, p0.tzroggbefp tzroggbefpVar, p0.ylkuphrtab ylkuphrtabVar) {
            this.f73535zdlpuopuiu = jztzpxfvevVar;
            this.f73534yggfygwlhe = igdgnonuhaVar;
            this.f73533jyumaefscl = tzroggbefpVar;
            this.f73532iwizpuwonk = ylkuphrtabVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn ppxfxbqfkf(iwxlajgraz.yadqdtsiqt yadqdtsiqtVar, p0.ylkuphrtab ylkuphrtabVar, p0.tzroggbefp tzroggbefpVar, igdgnonuha igdgnonuhaVar, h.jztzpxfvev jztzpxfvevVar, j.ppxfxbqfkf ppxfxbqfkfVar) {
            g.lqeggnwhkg lqeggnwhkgVar;
            j0.f fVarGxszxtbevo;
            ppxfxbqfkfVar.b0();
            float fWkgbmnqykc = yadqdtsiqtVar.wkgbmnqykc();
            if (fWkgbmnqykc != 0.0f) {
                int iZoijcleaow = ylkuphrtabVar.zoijcleaow(j0.l.agtfadlqog(tzroggbefpVar.gtknphoqwx()));
                p0 p0VarAgtfadlqog = igdgnonuhaVar.agtfadlqog();
                if (p0VarAgtfadlqog == null || (fVarGxszxtbevo = p0VarAgtfadlqog.gxszxtbevo()) == null || (lqeggnwhkgVar = fVarGxszxtbevo.eablkybsjg(iZoijcleaow)) == null) {
                    lqeggnwhkgVar = new g.lqeggnwhkg(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float fEablkybsjg = zg.gtknphoqwx.eablkybsjg((float) Math.floor(ppxfxbqfkfVar.I(f.iobyxmoadg())), 1.0f);
                float f13 = fEablkybsjg / 2;
                float fEablkybsjg2 = zg.gtknphoqwx.eablkybsjg(zg.gtknphoqwx.dxjokdxxww(lqeggnwhkgVar.nufgyqmvbu() + f13, Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow() >> 32)) - f13), f13);
                float fFloor = ((int) fEablkybsjg) % 2 == 1 ? ((float) Math.floor(fEablkybsjg2)) + 0.5f : (float) Math.rint(fEablkybsjg2);
                j.gxszxtbevo.q(ppxfxbqfkfVar, jztzpxfvevVar, g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(lqeggnwhkgVar.gtknphoqwx())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloor)) << 32)), g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(lqeggnwhkgVar.eablkybsjg())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloor)) << 32)), fEablkybsjg, 0, null, fWkgbmnqykc, null, 0, 432, null);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return zoijcleaow((androidx.compose.ui.wkgbmnqykc) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
        }

        public final androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc;
            draadjrbmkVar.sopmlzcsov(-84507373);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-84507373, i13, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)");
            }
            boolean zBooleanValue = ((Boolean) draadjrbmkVar.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.eablkybsjg())).booleanValue();
            boolean zIobyxmoadg = draadjrbmkVar.iobyxmoadg(zBooleanValue);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zIobyxmoadg || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iwxlajgraz.yadqdtsiqt(zBooleanValue);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            final iwxlajgraz.yadqdtsiqt yadqdtsiqtVar = (iwxlajgraz.yadqdtsiqt) objYadqdtsiqt;
            h.jztzpxfvev jztzpxfvevVar = this.f73535zdlpuopuiu;
            boolean z13 = ((jztzpxfvevVar instanceof h.f) && ((h.f) jztzpxfvevVar).zoijcleaow() == 16) ? false : true;
            if (((androidx.compose.ui.platform.b0) draadjrbmkVar.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.zdlpuopuiu())).iobyxmoadg() && this.f73534yggfygwlhe.nufgyqmvbu() && j0.l.nufgyqmvbu(this.f73533jyumaefscl.gtknphoqwx()) && z13) {
                draadjrbmkVar.sopmlzcsov(-707487962);
                j0.eablkybsjg eablkybsjgVarDxjokdxxww = this.f73533jyumaefscl.dxjokdxxww();
                j0.l lVarZoijcleaow = j0.l.zoijcleaow(this.f73533jyumaefscl.gtknphoqwx());
                boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(yadqdtsiqtVar);
                Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new C1606iobyxmoadg(yadqdtsiqtVar, null);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                }
                androidx.compose.runtime.jlmebxxoox.wkgbmnqykc(eablkybsjgVarDxjokdxxww, lVarZoijcleaow, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, 0);
                boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(yadqdtsiqtVar) | draadjrbmkVar.lmojexxdyd(this.f73532iwizpuwonk) | draadjrbmkVar.ulzqkzuiru(this.f73533jyumaefscl) | draadjrbmkVar.lmojexxdyd(this.f73534yggfygwlhe) | draadjrbmkVar.ulzqkzuiru(this.f73535zdlpuopuiu);
                final p0.ylkuphrtab ylkuphrtabVar = this.f73532iwizpuwonk;
                final p0.tzroggbefp tzroggbefpVar = this.f73533jyumaefscl;
                final igdgnonuha igdgnonuhaVar = this.f73534yggfygwlhe;
                final h.jztzpxfvev jztzpxfvevVar2 = this.f73535zdlpuopuiu;
                Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: opjhrmiecq.d
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return e.iobyxmoadg.ppxfxbqfkf(yadqdtsiqtVar, ylkuphrtabVar, tzroggbefpVar, igdgnonuhaVar, jztzpxfvevVar2, (j.ppxfxbqfkf) obj);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
                }
                wkgbmnqykcVarWkgbmnqykc = androidx.compose.ui.draw.zoijcleaow.wkgbmnqykc(wkgbmnqykcVar, (tg.draadjrbmk) objYadqdtsiqt3);
                draadjrbmkVar.stevsuqkhv();
            } else {
                draadjrbmkVar.sopmlzcsov(-705473241);
                draadjrbmkVar.stevsuqkhv();
                wkgbmnqykcVarWkgbmnqykc = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar.stevsuqkhv();
            return wkgbmnqykcVarWkgbmnqykc;
        }
    }

    public static final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, igdgnonuha igdgnonuhaVar, p0.tzroggbefp tzroggbefpVar, p0.ylkuphrtab ylkuphrtabVar, h.jztzpxfvev jztzpxfvevVar, boolean z13) {
        return z13 ? androidx.compose.ui.ppxfxbqfkf.ppxfxbqfkf(wkgbmnqykcVar, null, new iobyxmoadg(jztzpxfvevVar, igdgnonuhaVar, tzroggbefpVar, ylkuphrtabVar), 1, null) : wkgbmnqykcVar;
    }
}
