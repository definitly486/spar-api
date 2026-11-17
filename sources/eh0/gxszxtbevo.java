package eh0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import iu.hcddaimhww;
import iu.kegysxyocb;
import java.util.List;
import ju.lmojexxdyd;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import tg.rgvfuqvkyq;
import yh0.esjtqupxsv;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(esjtqupxsv esjtqupxsvVar, qu.iobyxmoadg iobyxmoadgVar) {
        esjtqupxsvVar.eablkybsjg().invoke(iobyxmoadgVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(esjtqupxsv esjtqupxsvVar, qu.iobyxmoadg iobyxmoadgVar) {
        esjtqupxsvVar.wkgbmnqykc().invoke(iobyxmoadgVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(yh0.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar, esjtqupxsv esjtqupxsvVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        gxszxtbevo(ppxfxbqfkfVar, esjtqupxsvVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void gxszxtbevo(final yh0.iobyxmoadg.ppxfxbqfkf item, final esjtqupxsv sectionsCallbacks, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1258582065);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(item) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(sectionsCallbacks) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1258582065, i14, -1, "ru.myspar.myspar.impl.presentation.compose.combo.ComboSection (ComboSection.kt:14)");
            }
            if (item instanceof yh0.iobyxmoadg.ppxfxbqfkf.zoijcleaow) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1819646595);
                List listLqeggnwhkg = ((yh0.iobyxmoadg.ppxfxbqfkf.zoijcleaow) item).lqeggnwhkg();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1859810237);
                boolean z13 = (i14 & 112) == 32;
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13 || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: eh0.iobyxmoadg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return gxszxtbevo.lqeggnwhkg(sectionsCallbacks, (ComboSetProduct) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                hcddaimhww.eablkybsjg(null, listLqeggnwhkg, (tg.draadjrbmk) objYadqdtsiqt, sectionsCallbacks.wkgbmnqykc(), sectionsCallbacks.eablkybsjg(), draadjrbmkVarBtonecajqb, 0, 1);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else if (item instanceof yh0.iobyxmoadg.ppxfxbqfkf.C3186ppxfxbqfkf) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1819116309);
                final qu.iobyxmoadg iobyxmoadgVarLqeggnwhkg = ((yh0.iobyxmoadg.ppxfxbqfkf.C3186ppxfxbqfkf) item).lqeggnwhkg();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1859792285);
                int i15 = i14 & 112;
                boolean z14 = i15 == 32;
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14 || objYadqdtsiqt2 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: eh0.zoijcleaow
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return gxszxtbevo.nufgyqmvbu(sectionsCallbacks, (ComboSetProduct) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                tg.draadjrbmk draadjrbmkVar2 = (tg.draadjrbmk) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1859785223);
                boolean zUlzqkzuiru = (i15 == 32) | draadjrbmkVarBtonecajqb.ulzqkzuiru(iobyxmoadgVarLqeggnwhkg);
                Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: eh0.ppxfxbqfkf
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return gxszxtbevo.dxjokdxxww(sectionsCallbacks, iobyxmoadgVarLqeggnwhkg);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1859782409);
                boolean zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(iobyxmoadgVarLqeggnwhkg) | (i15 == 32);
                Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru2 || objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: eh0.wkgbmnqykc
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return gxszxtbevo.btonecajqb(sectionsCallbacks, iobyxmoadgVarLqeggnwhkg);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                kegysxyocb.lqeggnwhkg(null, iobyxmoadgVarLqeggnwhkg, draadjrbmkVar2, iobyxmoadgVar, (tg.iobyxmoadg) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0, 1);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (!(item instanceof yh0.iobyxmoadg.ppxfxbqfkf.wkgbmnqykc)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1859814822);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1818559487);
                lmojexxdyd.ojitshcjhn(true, null, draadjrbmkVarBtonecajqb, 6, 2);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: eh0.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gxszxtbevo.gtknphoqwx(item, sectionsCallbacks, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(esjtqupxsv esjtqupxsvVar, ComboSetProduct it) {
        zdlpuopuiu.btonecajqb(it, "it");
        esjtqupxsvVar.gxszxtbevo().invoke(it, new mo.zoijcleaow(it.getId(), it.getName()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(esjtqupxsv esjtqupxsvVar, ComboSetProduct it) {
        zdlpuopuiu.btonecajqb(it, "it");
        esjtqupxsvVar.gxszxtbevo().invoke(it, new mo.zoijcleaow(it.getId(), it.getName()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
