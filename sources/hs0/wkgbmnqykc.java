package hs0;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import gg.iwizpuwonk;
import gg.wwaezpbzkn;
import igdgnonuha.t;
import igdgnonuha.w6;
import igdgnonuha.z;
import j0.n;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f41051iobyxmoadg;

        static {
            int[] iArr = new int[js0.zoijcleaow.values().length];
            try {
                iArr[js0.zoijcleaow.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[js0.zoijcleaow.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f41051iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(CounterModel counterModel, js0.zoijcleaow zoijcleaowVar, Price price, iwizpuwonk iwizpuwonkVar, n nVar, n nVar2, boolean z13, int i13, draadjrbmk draadjrbmkVar, int i14) {
        dxjokdxxww(counterModel, zoijcleaowVar, price, iwizpuwonkVar, nVar, nVar2, z13, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final iwizpuwonk draadjrbmk(String str) {
        int length = str.length();
        if (length < 5) {
            return null;
        }
        if (length == 5) {
            return new iwizpuwonk(18, 14, Float.valueOf(19.0f));
        }
        if (length == 6) {
            return new iwizpuwonk(15, 11, Float.valueOf(17.0f));
        }
        if (length == 7) {
            return new iwizpuwonk(13, 9, Float.valueOf(16.5f));
        }
        return null;
    }

    private static final void dxjokdxxww(final CounterModel counterModel, final js0.zoijcleaow zoijcleaowVar, final Price price, final iwizpuwonk iwizpuwonkVar, final n nVar, final n nVar2, final boolean z13, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(2045754050);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(counterModel) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(price) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(iwizpuwonkVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 24576) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(nVar) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(nVar2) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 1048576 : 524288;
        }
        if ((599187 & i14) == 599186 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(2045754050, i14, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.price.PriceContent (ItemPrice.kt:95)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg interfaceC0470eablkybsjgNufgyqmvbu = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu();
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(interfaceC0470eablkybsjgNufgyqmvbu, iobyxmoadgVar2.draadjrbmk(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, iobyxmoadgVar);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
            roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar, "COUNTER_PRICE", null, null, false, 14, null);
            long jDxjokdxxww = w0.iwizpuwonk.dxjokdxxww(((Number) iwizpuwonkVar.nufgyqmvbu()).intValue());
            z zVar = z.f44180iobyxmoadg;
            int i15 = z.f44181zoijcleaow;
            w6.btonecajqb(price.getPrice(), wkgbmnqykcVarOjitshcjhn, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).iwizpuwonk(), jDxjokdxxww, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, nVar, draadjrbmkVarBtonecajqb, 0, (i14 << 6) & 3670016, 65520);
            a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = zoijcleaowVar == js0.zoijcleaow.HALF ? iobyxmoadgVar2.dxjokdxxww() : iobyxmoadgVar2.draadjrbmk();
            draadjrbmkVarBtonecajqb.sopmlzcsov(850340720);
            if (z13) {
                t31.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(2), draadjrbmkVarBtonecajqb, 6);
                w6.btonecajqb(price.getPriceFractional(), w31.nufgyqmvbu.ojitshcjhn(roivzttewhVar.ppxfxbqfkf(iobyxmoadgVar, ppxfxbqfkfVarDxjokdxxww), "COUNTER_PRICE_FRACTIONAL", null, null, false, 14, null), l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).iwizpuwonk(), w0.iwizpuwonk.dxjokdxxww(((Number) iwizpuwonkVar.dxjokdxxww()).intValue()), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, nVar2, draadjrbmkVarBtonecajqb, 0, (i14 << 3) & 3670016, 65520);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            int iZoijcleaow = ks0.zoijcleaow.zoijcleaow(counterModel.getMeasureType(), counterModel.getIsDispPer100(), zoijcleaowVar);
            t31.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(4), draadjrbmkVarBtonecajqb, 6);
            t.wkgbmnqykc(e0.lqeggnwhkg.zoijcleaow(m.wkgbmnqykc.f64773gtknphoqwx, iZoijcleaow, draadjrbmkVarBtonecajqb, 6), null, roivzttewhVar.ppxfxbqfkf(cdpycssgdh.vdvldrhtss(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(((Number) iwizpuwonkVar.btonecajqb()).floatValue())), ppxfxbqfkfVarDxjokdxxww), l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).iwizpuwonk(), draadjrbmkVarBtonecajqb, 48, 0);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: hs0.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return wkgbmnqykc.btonecajqb(counterModel, zoijcleaowVar, price, iwizpuwonkVar, nVar, nVar2, z13, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final iwizpuwonk eablkybsjg(int i13) {
        return new iwizpuwonk(Integer.valueOf(i13), 16, Float.valueOf(20.0f));
    }

    private static final iwizpuwonk gtknphoqwx(Price price) {
        boolean zZfvoamnweg = kcexrzcfyt.zfvoamnweg(price.getPriceFractional());
        int length = price.getPrice().length();
        if (length < 6) {
            return null;
        }
        if (zZfvoamnweg && length == 7) {
            return new iwizpuwonk(19, 15, Float.valueOf(19.5f));
        }
        if (zZfvoamnweg) {
            return null;
        }
        if (length == 6) {
            return new iwizpuwonk(18, 14, Float.valueOf(19.0f));
        }
        if (length == 7) {
            return new iwizpuwonk(16, 12, Float.valueOf(18.0f));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Price gxszxtbevo(CounterModel counterModel) {
        return ks0.iobyxmoadg.lqeggnwhkg(counterModel);
    }

    private static final Price lqeggnwhkg(i1 i1Var) {
        return (Price) i1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(CounterModel counterModel, js0.zoijcleaow zoijcleaowVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        wkgbmnqykc(counterModel, zoijcleaowVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void wkgbmnqykc(final CounterModel model, final js0.zoijcleaow counterStyle, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        n nVarDraadjrbmk;
        iwizpuwonk iwizpuwonkVarGtknphoqwx;
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(counterStyle, "counterStyle");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1937331843);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(counterStyle) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1937331843, i14, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.price.ItemPrice (ItemPrice.kt:46)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-864926544);
            boolean zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(model);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: hs0.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return wkgbmnqykc.gxszxtbevo(model);
                    }
                });
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            i1 i1Var = (i1) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-864923984);
            boolean z13 = (i14 & 112) == 32;
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt2 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = Integer.valueOf(counterStyle != js0.zoijcleaow.HALF ? 20 : 32);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            int iIntValue = ((Number) objYadqdtsiqt2).intValue();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            if (counterStyle == js0.zoijcleaow.HALF) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1042596686);
                nVarDraadjrbmk = l41.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().dxjokdxxww();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1042536174);
                nVarDraadjrbmk = l41.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().draadjrbmk();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            n nVar = nVarDraadjrbmk;
            n nVarNufgyqmvbu = z.f44180iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).nufgyqmvbu();
            boolean z14 = (kcexrzcfyt.zfvoamnweg(lqeggnwhkg(i1Var).getPriceFractional()) || counterStyle == js0.zoijcleaow.SMALL) ? false : true;
            int i15 = iobyxmoadg.f41051iobyxmoadg[counterStyle.ordinal()];
            if (i15 != 1) {
                iwizpuwonkVarGtknphoqwx = i15 != 2 ? null : draadjrbmk(lqeggnwhkg(i1Var).getPrice());
            } else {
                iwizpuwonkVarGtknphoqwx = gtknphoqwx(lqeggnwhkg(i1Var));
            }
            dxjokdxxww(model, counterStyle, lqeggnwhkg(i1Var), iwizpuwonkVarGtknphoqwx == null ? eablkybsjg(iIntValue) : iwizpuwonkVarGtknphoqwx, nVar, nVarNufgyqmvbu, z14, draadjrbmkVarBtonecajqb, i14 & 126);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: hs0.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return wkgbmnqykc.nufgyqmvbu(model, counterStyle, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
