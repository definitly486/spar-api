package opjhrmiecq;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public abstract class hcddaimhww {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ skhdrjzrfn.skhdrjzrfn f73579iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.iwxlajgraz f73580jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f73581yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f73582zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(androidx.compose.runtime.iwxlajgraz iwxlajgrazVar, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f73580jyumaefscl = iwxlajgrazVar;
            this.f73579iwizpuwonk = skhdrjzrfnVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f73580jyumaefscl, this.f73579iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            androidx.compose.runtime.iwxlajgraz iwxlajgrazVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f73581yggfygwlhe;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.compose.runtime.iwxlajgraz iwxlajgrazVar2 = this.f73580jyumaefscl;
                skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar = this.f73579iwizpuwonk;
                this.f73582zdlpuopuiu = iwxlajgrazVar2;
                this.f73581yggfygwlhe = 1;
                Object objNufgyqmvbu = hcddaimhww.nufgyqmvbu(skhdrjzrfnVar, this);
                if (objNufgyqmvbu == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iwxlajgrazVar = iwxlajgrazVar2;
                obj = objNufgyqmvbu;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iwxlajgrazVar = (androidx.compose.runtime.iwxlajgraz) this.f73582zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            iwxlajgrazVar.setValue(obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f73583jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f73584yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f73585zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f73584yggfygwlhe = obj;
            this.f73583jyumaefscl |= Integer.MIN_VALUE;
            return hcddaimhww.nufgyqmvbu(null, this);
        }
    }

    public static final void dxjokdxxww(weqkydbzbr.iobyxmoadg iobyxmoadgVar, Resources resources, krqnebusok krqnebusokVar, boolean z13, tg.draadjrbmk draadjrbmkVar) {
        if (z13) {
            weqkydbzbr.ppxfxbqfkf.iobyxmoadg(iobyxmoadgVar, krqnebusokVar.lqeggnwhkg(), krqnebusokVar.nufgyqmvbu(resources), krqnebusokVar.wkgbmnqykc(), draadjrbmkVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eablkybsjg(okpsazkaxt.vdvldrhtss vdvldrhtssVar) {
        okpsazkaxt.oxmwwwfdhm.iobyxmoadg(vdvldrhtssVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(pj.cllcsxoeiz cllcsxoeizVar, androidx.compose.runtime.iwxlajgraz iwxlajgrazVar, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar) {
        pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, pj.wypolnanlu.UNDISPATCHED, new iobyxmoadg(iwxlajgrazVar, skhdrjzrfnVar, null), 1, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        wkgbmnqykc(skhdrjzrfnVar, rgvfuqvkyqVar, draadjrbmkVar, androidx.compose.runtime.f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object nufgyqmvbu(skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f73583jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f73583jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f73584yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f73583jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            zoijcleaowVar.f73585zdlpuopuiu = skhdrjzrfnVar;
            zoijcleaowVar.f73583jyumaefscl = 1;
            if (skhdrjzrfnVar.yzdjzghtvl(zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            skhdrjzrfnVar = (skhdrjzrfn.skhdrjzrfn) zoijcleaowVar.f73585zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return ixidwrxhsl.zoijcleaow(ixidwrxhsl.wkgbmnqykc(skhdrjzrfnVar.jyumaefscl(), skhdrjzrfnVar.cqumvgiudr(), skhdrjzrfnVar.iwizpuwonk(), skhdrjzrfnVar.esjtqupxsv(), skhdrjzrfnVar.yggfygwlhe()));
    }

    public static final void wkgbmnqykc(final skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar, final tg.rgvfuqvkyq rgvfuqvkyqVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(2080741862);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(skhdrjzrfnVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar) ? 32 : 16;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i14 & 19) != 18, i14 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(2080741862, i14, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:52)");
            }
            if (ikoacuggdj.esjtqupxsv.f44797wkgbmnqykc) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1881943916);
                nuxfzjnpeb.pkzmftpjix.dxjokdxxww(skhdrjzrfnVar.cllcsxoeiz(), rgvfuqvkyqVar, draadjrbmkVarBtonecajqb, i14 & 112, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1881814801);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new okpsazkaxt.vdvldrhtss(null, 1, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                final okpsazkaxt.vdvldrhtss vdvldrhtssVar = (okpsazkaxt.vdvldrhtss) objYadqdtsiqt;
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt2 = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                final pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) objYadqdtsiqt2;
                Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt3 = androidx.compose.runtime.c1.ppxfxbqfkf(ixidwrxhsl.zoijcleaow(ixidwrxhsl.f73636zoijcleaow.iobyxmoadg()), null, 2, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                final androidx.compose.runtime.iwxlajgraz iwxlajgrazVar = (androidx.compose.runtime.iwxlajgraz) objYadqdtsiqt3;
                Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: opjhrmiecq.wwaezpbzkn
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return hcddaimhww.eablkybsjg(vdvldrhtssVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                tg.iobyxmoadg iobyxmoadgVar2 = (tg.iobyxmoadg) objYadqdtsiqt4;
                tg.draadjrbmk draadjrbmkVarEsjtqupxsv = skhdrjzrfn.c.esjtqupxsv(skhdrjzrfnVar, vdvldrhtssVar, iwxlajgrazVar);
                boolean zMbcevpiqjq = skhdrjzrfnVar.mbcevpiqjq();
                boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(cllcsxoeizVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(skhdrjzrfnVar);
                Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt5 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: opjhrmiecq.ylkuphrtab
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return hcddaimhww.gxszxtbevo(cllcsxoeizVar, iwxlajgrazVar, skhdrjzrfnVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                }
                okpsazkaxt.lqeggnwhkg.dxjokdxxww(vdvldrhtssVar, iobyxmoadgVar2, draadjrbmkVarEsjtqupxsv, null, zMbcevpiqjq, (tg.iobyxmoadg) objYadqdtsiqt5, rgvfuqvkyqVar, draadjrbmkVarBtonecajqb, ((i14 << 15) & 3670016) | 54, 8);
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
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: opjhrmiecq.pkzmftpjix
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return hcddaimhww.lqeggnwhkg(skhdrjzrfnVar, rgvfuqvkyqVar, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
