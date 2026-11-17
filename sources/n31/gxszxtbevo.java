package n31;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import com.airbnb.lottie.btonecajqb;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import m7.gtknphoqwx;
import m7.ojitshcjhn;
import m7.wflxmlrfwp;
import pj.cllcsxoeiz;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f68505jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ m7.zoijcleaow f68506yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f68507zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(m7.zoijcleaow zoijcleaowVar, gtknphoqwx gtknphoqwxVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f68506yggfygwlhe = zoijcleaowVar;
            this.f68505jyumaefscl = gtknphoqwxVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f68506yggfygwlhe, this.f68505jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f68507zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                m7.zoijcleaow zoijcleaowVar = this.f68506yggfygwlhe;
                btonecajqb btonecajqbVarEablkybsjg = gxszxtbevo.eablkybsjg(this.f68505jyumaefscl);
                this.f68507zdlpuopuiu = 1;
                if (m7.zoijcleaow.iobyxmoadg.iobyxmoadg(zoijcleaowVar, btonecajqbVarEablkybsjg, 1, 0, false, 0.0f, null, 0.0f, false, null, false, false, this, 2044, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final btonecajqb eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        return (btonecajqb) gtknphoqwxVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, cllcsxoeiz cllcsxoeizVar, m7.zoijcleaow zoijcleaowVar, gtknphoqwx gtknphoqwxVar) {
        iobyxmoadgVar.invoke();
        pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new iobyxmoadg(zoijcleaowVar, gtknphoqwxVar, null), 3, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float lqeggnwhkg(m7.zoijcleaow zoijcleaowVar) {
        return zoijcleaowVar.hcddaimhww();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(tg.iobyxmoadg iobyxmoadgVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        wkgbmnqykc(iobyxmoadgVar, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:55:0x013e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0149  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public static final void wkgbmnqykc(final tg.iobyxmoadg onCopyClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        final m7.zoijcleaow zoijcleaowVarWkgbmnqykc;
        final gtknphoqwx gtknphoqwxVarOxmwwwfdhm;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar;
        final cllcsxoeiz cllcsxoeizVar;
        boolean zLmojexxdyd;
        Object objYadqdtsiqt2;
        boolean zUlzqkzuiru;
        Object objYadqdtsiqt3;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onCopyClick, "onCopyClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-955762353);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(onCopyClick) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 32 : 16;
            }
            i16 = i15;
            if ((i16 & 19) == 18 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-955762353, i16, -1, "ru.myspar.proloyalty.core.ui.compose.components.icon.CopyClickableIcon (CopyClickableIcon.kt:20)");
                }
                zoijcleaowVarWkgbmnqykc = m7.wkgbmnqykc.wkgbmnqykc(draadjrbmkVarBtonecajqb, 0);
                gtknphoqwxVarOxmwwwfdhm = ojitshcjhn.oxmwwwfdhm(wflxmlrfwp.zoijcleaow.iobyxmoadg(wflxmlrfwp.zoijcleaow.zoijcleaow(b31.draadjrbmk.copy_to_check_mark)), null, null, null, null, null, draadjrbmkVarBtonecajqb, 0, 62);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                cllcsxoeizVar = (cllcsxoeiz) objYadqdtsiqt;
                boolean z13 = !zoijcleaowVarWkgbmnqykc.nufgyqmvbu();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1649906597);
                zLmojexxdyd = ((i16 & 14) == 4) | draadjrbmkVarBtonecajqb.lmojexxdyd(cllcsxoeizVar) | draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVarWkgbmnqykc) | draadjrbmkVarBtonecajqb.ulzqkzuiru(gtknphoqwxVarOxmwwwfdhm);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: n31.ppxfxbqfkf
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return gxszxtbevo.gxszxtbevo(onCopyClick, cllcsxoeizVar, zoijcleaowVarWkgbmnqykc, gtknphoqwxVarOxmwwwfdhm);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = androidx.compose.foundation.eablkybsjg.nufgyqmvbu(wkgbmnqykcVar3, z13, null, null, null, (tg.iobyxmoadg) objYadqdtsiqt2, 14, null);
                btonecajqb btonecajqbVarEablkybsjg = eablkybsjg(gtknphoqwxVarOxmwwwfdhm);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1649900665);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVarWkgbmnqykc);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: n31.wkgbmnqykc
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(gxszxtbevo.lqeggnwhkg(zoijcleaowVarWkgbmnqykc));
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                m7.eablkybsjg.iobyxmoadg(btonecajqbVarEablkybsjg, (tg.iobyxmoadg) objYadqdtsiqt3, wkgbmnqykcVarNufgyqmvbu, false, false, false, null, false, null, null, null, false, false, null, null, false, draadjrbmkVar2, 0, 0, 65528);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: n31.eablkybsjg
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return gxszxtbevo.nufgyqmvbu(onCopyClick, wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i16 = i15;
        if ((i16 & 19) == 18) {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-955762353, i16, -1, "ru.myspar.proloyalty.core.ui.compose.components.icon.CopyClickableIcon (CopyClickableIcon.kt:20)");
            }
            zoijcleaowVarWkgbmnqykc = m7.wkgbmnqykc.wkgbmnqykc(draadjrbmkVarBtonecajqb, 0);
            gtknphoqwxVarOxmwwwfdhm = ojitshcjhn.oxmwwwfdhm(wflxmlrfwp.zoijcleaow.iobyxmoadg(wflxmlrfwp.zoijcleaow.zoijcleaow(b31.draadjrbmk.copy_to_check_mark)), null, null, null, null, null, draadjrbmkVarBtonecajqb, 0, 62);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            cllcsxoeizVar = (cllcsxoeiz) objYadqdtsiqt;
            boolean z14 = !zoijcleaowVarWkgbmnqykc.nufgyqmvbu();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1649906597);
            zLmojexxdyd = ((i16 & 14) == 4) | draadjrbmkVarBtonecajqb.lmojexxdyd(cllcsxoeizVar) | draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVarWkgbmnqykc) | draadjrbmkVarBtonecajqb.ulzqkzuiru(gtknphoqwxVarOxmwwwfdhm);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: n31.ppxfxbqfkf
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return gxszxtbevo.gxszxtbevo(onCopyClick, cllcsxoeizVar, zoijcleaowVarWkgbmnqykc, gtknphoqwxVarOxmwwwfdhm);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: n31.ppxfxbqfkf
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return gxszxtbevo.gxszxtbevo(onCopyClick, cllcsxoeizVar, zoijcleaowVarWkgbmnqykc, gtknphoqwxVarOxmwwwfdhm);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu2 = androidx.compose.foundation.eablkybsjg.nufgyqmvbu(wkgbmnqykcVar3, z14, null, null, null, (tg.iobyxmoadg) objYadqdtsiqt2, 14, null);
            btonecajqb btonecajqbVarEablkybsjg2 = eablkybsjg(gtknphoqwxVarOxmwwwfdhm);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1649900665);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVarWkgbmnqykc);
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: n31.wkgbmnqykc
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Float.valueOf(gxszxtbevo.lqeggnwhkg(zoijcleaowVarWkgbmnqykc));
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            } else {
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: n31.wkgbmnqykc
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Float.valueOf(gxszxtbevo.lqeggnwhkg(zoijcleaowVarWkgbmnqykc));
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            m7.eablkybsjg.iobyxmoadg(btonecajqbVarEablkybsjg2, (tg.iobyxmoadg) objYadqdtsiqt3, wkgbmnqykcVarNufgyqmvbu2, false, false, false, null, false, null, null, null, false, false, null, null, false, draadjrbmkVar2, 0, 0, 65528);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        } else {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-955762353, i16, -1, "ru.myspar.proloyalty.core.ui.compose.components.icon.CopyClickableIcon (CopyClickableIcon.kt:20)");
            }
            zoijcleaowVarWkgbmnqykc = m7.wkgbmnqykc.wkgbmnqykc(draadjrbmkVarBtonecajqb, 0);
            gtknphoqwxVarOxmwwwfdhm = ojitshcjhn.oxmwwwfdhm(wflxmlrfwp.zoijcleaow.iobyxmoadg(wflxmlrfwp.zoijcleaow.zoijcleaow(b31.draadjrbmk.copy_to_check_mark)), null, null, null, null, null, draadjrbmkVarBtonecajqb, 0, 62);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            cllcsxoeizVar = (cllcsxoeiz) objYadqdtsiqt;
            boolean z15 = !zoijcleaowVarWkgbmnqykc.nufgyqmvbu();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1649906597);
            zLmojexxdyd = ((i16 & 14) == 4) | draadjrbmkVarBtonecajqb.lmojexxdyd(cllcsxoeizVar) | draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVarWkgbmnqykc) | draadjrbmkVarBtonecajqb.ulzqkzuiru(gtknphoqwxVarOxmwwwfdhm);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: n31.ppxfxbqfkf
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return gxszxtbevo.gxszxtbevo(onCopyClick, cllcsxoeizVar, zoijcleaowVarWkgbmnqykc, gtknphoqwxVarOxmwwwfdhm);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: n31.ppxfxbqfkf
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return gxszxtbevo.gxszxtbevo(onCopyClick, cllcsxoeizVar, zoijcleaowVarWkgbmnqykc, gtknphoqwxVarOxmwwwfdhm);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu3 = androidx.compose.foundation.eablkybsjg.nufgyqmvbu(wkgbmnqykcVar3, z15, null, null, null, (tg.iobyxmoadg) objYadqdtsiqt2, 14, null);
            btonecajqb btonecajqbVarEablkybsjg3 = eablkybsjg(gtknphoqwxVarOxmwwwfdhm);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1649900665);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVarWkgbmnqykc);
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: n31.wkgbmnqykc
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Float.valueOf(gxszxtbevo.lqeggnwhkg(zoijcleaowVarWkgbmnqykc));
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            } else {
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: n31.wkgbmnqykc
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Float.valueOf(gxszxtbevo.lqeggnwhkg(zoijcleaowVarWkgbmnqykc));
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            m7.eablkybsjg.iobyxmoadg(btonecajqbVarEablkybsjg3, (tg.iobyxmoadg) objYadqdtsiqt3, wkgbmnqykcVarNufgyqmvbu3, false, false, false, null, false, null, null, null, false, false, null, null, false, draadjrbmkVar2, 0, 0, 65528);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: n31.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gxszxtbevo.nufgyqmvbu(onCopyClick, wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
