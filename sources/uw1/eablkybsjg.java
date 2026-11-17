package uw1;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s;
import e31.jyumaefscl;
import ezmngbhpjk.nufgyqmvbu;
import gg.wwaezpbzkn;
import igdgnonuha.i;
import igdgnonuha.n;
import igdgnonuha.z;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f114566yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.wkgbmnqykc f114567zdlpuopuiu;

        iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.iobyxmoadg iobyxmoadgVar) {
            this.f114567zdlpuopuiu = wkgbmnqykcVar;
            this.f114566yggfygwlhe = iobyxmoadgVar;
        }

        private static final jyumaefscl zoijcleaow(i1 i1Var) {
            return (jyumaefscl) i1Var.getValue();
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(652998130, i13, -1, "ru.myspar.proloyalty.videoplayer.impl.presentation.compose.drawVideoPlayerCloseButton.<anonymous> (VideoPlayerCloseButton.kt:51)");
            }
            eablkybsjg.wkgbmnqykc(esjtqupxsv.oxmwwwfdhm(this.f114567zdlpuopuiu, 0.0f, zoijcleaow(e31.eablkybsjg.rgvfuqvkyq(draadjrbmkVar, 0)).zoijcleaow(), 0.0f, 0.0f, 13, null), this.f114566yggfygwlhe, draadjrbmkVar, 0, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static /* synthetic */ void dxjokdxxww(ComposeView composeView, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.iobyxmoadg iobyxmoadgVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            iobyxmoadgVar = new tg.iobyxmoadg() { // from class: uw1.zoijcleaow
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return eablkybsjg.btonecajqb();
                }
            };
        }
        nufgyqmvbu(composeView, wkgbmnqykcVar, iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.iobyxmoadg iobyxmoadgVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        wkgbmnqykc(wkgbmnqykcVar, iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void nufgyqmvbu(ComposeView composeView, androidx.compose.ui.wkgbmnqykc modifier, tg.iobyxmoadg onClick) {
        zdlpuopuiu.btonecajqb(composeView, "<this>");
        zdlpuopuiu.btonecajqb(modifier, "modifier");
        zdlpuopuiu.btonecajqb(onClick, "onClick");
        try {
            composeView.setViewCompositionStrategy(s.zoijcleaow.f7058zoijcleaow);
            composeView.setContent(nufgyqmvbu.ppxfxbqfkf(652998130, true, new iobyxmoadg(modifier, onClick)));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:49:0x011b  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void wkgbmnqykc(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        final tg.iobyxmoadg iobyxmoadgVar2;
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        tg.iobyxmoadg iobyxmoadgVar3;
        Object objYadqdtsiqt;
        a0 a0VarWflxmlrfwp;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(847866535);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i13;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                iobyxmoadgVar2 = iobyxmoadgVar;
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar2) ? 32 : 16;
            }
            i16 = i15;
            if ((i16 & 19) == 18 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1002067568);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.iobyxmoadg() { // from class: uw1.ppxfxbqfkf
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return eablkybsjg.eablkybsjg();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt;
                } else {
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(847866535, i16, -1, "ru.myspar.proloyalty.videoplayer.impl.presentation.compose.VideoPlayerCloseButton (VideoPlayerCloseButton.kt:26)");
                }
                float f13 = 24;
                float f14 = 0;
                n.ppxfxbqfkf(iobyxmoadgVar3, cdpycssgdh.vdvldrhtss(esjtqupxsv.oxmwwwfdhm(wkgbmnqykcVar3, 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f13), w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 9, null), w0.nufgyqmvbu.lqeggnwhkg(32)), null, null, l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).yadqdtsiqt(), 0L, i.f43035iobyxmoadg.iobyxmoadg(w0.nufgyqmvbu.lqeggnwhkg(f14), w0.nufgyqmvbu.lqeggnwhkg(f14), 0.0f, 0.0f, draadjrbmkVarBtonecajqb, (i.f43036zoijcleaow << 12) | 54, 12), uw1.iobyxmoadg.f114568iobyxmoadg.iobyxmoadg(), draadjrbmkVarBtonecajqb, ((i16 >> 3) & 14) | 12582912, 44);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
                iobyxmoadgVar2 = iobyxmoadgVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: uw1.wkgbmnqykc
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return eablkybsjg.gxszxtbevo(wkgbmnqykcVar2, iobyxmoadgVar2, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        iobyxmoadgVar2 = iobyxmoadgVar;
        i16 = i15;
        if ((i16 & 19) == 18) {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i18 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1002067568);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: uw1.ppxfxbqfkf
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return eablkybsjg.eablkybsjg();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt;
            } else {
                iobyxmoadgVar3 = iobyxmoadgVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(847866535, i16, -1, "ru.myspar.proloyalty.videoplayer.impl.presentation.compose.VideoPlayerCloseButton (VideoPlayerCloseButton.kt:26)");
            }
            float f15 = 24;
            float f16 = 0;
            n.ppxfxbqfkf(iobyxmoadgVar3, cdpycssgdh.vdvldrhtss(esjtqupxsv.oxmwwwfdhm(wkgbmnqykcVar3, 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f15), w0.nufgyqmvbu.lqeggnwhkg(f15), 0.0f, 9, null), w0.nufgyqmvbu.lqeggnwhkg(32)), null, null, l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).yadqdtsiqt(), 0L, i.f43035iobyxmoadg.iobyxmoadg(w0.nufgyqmvbu.lqeggnwhkg(f16), w0.nufgyqmvbu.lqeggnwhkg(f16), 0.0f, 0.0f, draadjrbmkVarBtonecajqb, (i.f43036zoijcleaow << 12) | 54, 12), uw1.iobyxmoadg.f114568iobyxmoadg.iobyxmoadg(), draadjrbmkVarBtonecajqb, ((i16 >> 3) & 14) | 12582912, 44);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
            iobyxmoadgVar2 = iobyxmoadgVar3;
        } else {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i18 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1002067568);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: uw1.ppxfxbqfkf
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return eablkybsjg.eablkybsjg();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt;
            } else {
                iobyxmoadgVar3 = iobyxmoadgVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(847866535, i16, -1, "ru.myspar.proloyalty.videoplayer.impl.presentation.compose.VideoPlayerCloseButton (VideoPlayerCloseButton.kt:26)");
            }
            float f17 = 24;
            float f18 = 0;
            n.ppxfxbqfkf(iobyxmoadgVar3, cdpycssgdh.vdvldrhtss(esjtqupxsv.oxmwwwfdhm(wkgbmnqykcVar3, 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f17), w0.nufgyqmvbu.lqeggnwhkg(f17), 0.0f, 9, null), w0.nufgyqmvbu.lqeggnwhkg(32)), null, null, l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).yadqdtsiqt(), 0L, i.f43035iobyxmoadg.iobyxmoadg(w0.nufgyqmvbu.lqeggnwhkg(f18), w0.nufgyqmvbu.lqeggnwhkg(f18), 0.0f, 0.0f, draadjrbmkVarBtonecajqb, (i.f43036zoijcleaow << 12) | 54, 12), uw1.iobyxmoadg.f114568iobyxmoadg.iobyxmoadg(), draadjrbmkVarBtonecajqb, ((i16 >> 3) & 14) | 12582912, 44);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
            iobyxmoadgVar2 = iobyxmoadgVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: uw1.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return eablkybsjg.gxszxtbevo(wkgbmnqykcVar2, iobyxmoadgVar2, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
