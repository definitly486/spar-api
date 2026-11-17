package ws0;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.foundation.layout.wflxmlrfwp;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import h.oipsdeybqn;
import igdgnonuha.w6;
import igdgnonuha.z;
import ikoacuggdj.dsvhmnatus;
import j0.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.payment.cards.model.PaymentMethodUiModel;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f120611iobyxmoadg;

        static {
            int[] iArr = new int[xs0.iobyxmoadg.values().length];
            try {
                iArr[xs0.iobyxmoadg.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xs0.iobyxmoadg.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f120611iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(PaymentMethodUiModel paymentMethodUiModel, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(paymentMethodUiModel, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x0175  */
    /* JADX WARN: Code duplicated, block: B:52:0x0178  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x0244  */
    /* JADX WARN: Code duplicated, block: B:61:0x0276  */
    /* JADX WARN: Code duplicated, block: B:65:0x0281  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void zoijcleaow(final PaymentMethodUiModel payment, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        a.eablkybsjg.iobyxmoadg iobyxmoadgVar;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        draadjrbmk draadjrbmkVarIobyxmoadg;
        rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        wflxmlrfwp wflxmlrfwpVar;
        androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2;
        float f13;
        int i16;
        draadjrbmk draadjrbmkVar2;
        vdvldrhtss vdvldrhtssVarIobyxmoadg;
        draadjrbmk draadjrbmkVar3;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(payment, "payment");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(451672360);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(payment) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 32 : 16;
            }
            if ((i15 & 19) == 18 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(451672360, i15, -1, "ru.myspar.proloyalty.common.view.payment.cards.compose.CardContent (CardContent.kt:42)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = esjtqupxsv.ojitshcjhn(cdpycssgdh.gxszxtbevo(wkgbmnqykcVar3, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(12), w0.nufgyqmvbu.lqeggnwhkg(10));
                iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar.ojitshcjhn(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOjitshcjhn);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
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
                draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar3.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
                wflxmlrfwpVar = wflxmlrfwp.f4892iobyxmoadg;
                String iconUrl = payment.getIconUrl();
                com.bumptech.glide.integration.compose.eablkybsjg eablkybsjgVarWkgbmnqykc = p41.lqeggnwhkg.wkgbmnqykc();
                com.bumptech.glide.integration.compose.eablkybsjg eablkybsjgVarWkgbmnqykc2 = p41.lqeggnwhkg.wkgbmnqykc();
                iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                f13 = 24;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = e.eablkybsjg.iobyxmoadg(cdpycssgdh.dxjokdxxww(wflxmlrfwpVar.wkgbmnqykc(iobyxmoadgVar2, iobyxmoadgVar.ojitshcjhn()), w0.nufgyqmvbu.lqeggnwhkg(f13)), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(4)));
                int i18 = com.bumptech.glide.integration.compose.eablkybsjg.f20637iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
                com.bumptech.glide.integration.compose.zoijcleaow.iobyxmoadg(iconUrl, null, wkgbmnqykcVarIobyxmoadg, null, null, 0.0f, null, eablkybsjgVarWkgbmnqykc, eablkybsjgVarWkgbmnqykc2, null, null, draadjrbmkVarBtonecajqb, (i18 << 21) | 48 | (i18 << 24), 0, 1656);
                i16 = iobyxmoadg.f120611iobyxmoadg[payment.getTextStyle().ordinal()];
                if (i16 == 1) {
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    draadjrbmkVar2.sopmlzcsov(1233615555);
                    z zVar = z.f44180iobyxmoadg;
                    int i19 = z.f44181zoijcleaow;
                    vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(h41.zoijcleaow.eablkybsjg(l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVar2, i19).iobyxmoadg()), oipsdeybqn.dxjokdxxww(l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar2, i19).iwizpuwonk()));
                    draadjrbmkVar2.stevsuqkhv();
                } else {
                    if (i16 != 2) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1009623280);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        throw new NoWhenBranchMatchedException();
                    }
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    draadjrbmkVar2.sopmlzcsov(1233780940);
                    z zVar2 = z.f44180iobyxmoadg;
                    int i23 = z.f44181zoijcleaow;
                    vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(l41.ppxfxbqfkf.zoijcleaow(zVar2, draadjrbmkVar2, i23).zoijcleaow().ppxfxbqfkf(), oipsdeybqn.dxjokdxxww(l41.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVar2, i23).eablkybsjg()));
                    draadjrbmkVar2.stevsuqkhv();
                }
                draadjrbmk draadjrbmkVar4 = draadjrbmkVar2;
                w6.btonecajqb(payment.getName(), cdpycssgdh.iwizpuwonk(wflxmlrfwpVar.wkgbmnqykc(iobyxmoadgVar2, iobyxmoadgVar.wkgbmnqykc()), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(92), 1, null), ((oipsdeybqn) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (n) vdvldrhtssVarIobyxmoadg.iobyxmoadg(), draadjrbmkVar4, 0, 0, 65528);
                draadjrbmkVar3 = draadjrbmkVar4;
                draadjrbmkVar3.sopmlzcsov(1009643047);
                if (payment.getIsSelected()) {
                    dsvhmnatus.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(b31.gxszxtbevo.ic_card_checkbox, draadjrbmkVar3, 0), null, wflxmlrfwpVar.wkgbmnqykc(cdpycssgdh.vdvldrhtss(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(f13)), iobyxmoadgVar.ppxfxbqfkf()), null, null, 0.0f, null, draadjrbmkVar3, 48, 120);
                }
                draadjrbmkVar3.stevsuqkhv();
                draadjrbmkVar3.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar4;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar3.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ws0.iobyxmoadg
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return zoijcleaow.ppxfxbqfkf(payment, wkgbmnqykcVar2, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i15 & 19) == 18) {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(451672360, i15, -1, "ru.myspar.proloyalty.common.view.payment.cards.compose.CardContent (CardContent.kt:42)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn2 = esjtqupxsv.ojitshcjhn(cdpycssgdh.gxszxtbevo(wkgbmnqykcVar3, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(12), w0.nufgyqmvbu.lqeggnwhkg(10));
            iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar.ojitshcjhn(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOjitshcjhn2);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar4 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar4.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar4.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar4.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar4.wkgbmnqykc());
            wflxmlrfwpVar = wflxmlrfwp.f4892iobyxmoadg;
            String iconUrl2 = payment.getIconUrl();
            com.bumptech.glide.integration.compose.eablkybsjg eablkybsjgVarWkgbmnqykc3 = p41.lqeggnwhkg.wkgbmnqykc();
            com.bumptech.glide.integration.compose.eablkybsjg eablkybsjgVarWkgbmnqykc4 = p41.lqeggnwhkg.wkgbmnqykc();
            iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            f13 = 24;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg2 = e.eablkybsjg.iobyxmoadg(cdpycssgdh.dxjokdxxww(wflxmlrfwpVar.wkgbmnqykc(iobyxmoadgVar2, iobyxmoadgVar.ojitshcjhn()), w0.nufgyqmvbu.lqeggnwhkg(f13)), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(4)));
            int i110 = com.bumptech.glide.integration.compose.eablkybsjg.f20637iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
            com.bumptech.glide.integration.compose.zoijcleaow.iobyxmoadg(iconUrl2, null, wkgbmnqykcVarIobyxmoadg2, null, null, 0.0f, null, eablkybsjgVarWkgbmnqykc3, eablkybsjgVarWkgbmnqykc4, null, null, draadjrbmkVarBtonecajqb, (i110 << 21) | 48 | (i110 << 24), 0, 1656);
            i16 = iobyxmoadg.f120611iobyxmoadg[payment.getTextStyle().ordinal()];
            if (i16 == 1) {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                draadjrbmkVar2.sopmlzcsov(1233615555);
                z zVar3 = z.f44180iobyxmoadg;
                int i111 = z.f44181zoijcleaow;
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(h41.zoijcleaow.eablkybsjg(l41.ppxfxbqfkf.zoijcleaow(zVar3, draadjrbmkVar2, i111).iobyxmoadg()), oipsdeybqn.dxjokdxxww(l41.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVar2, i111).iwizpuwonk()));
                draadjrbmkVar2.stevsuqkhv();
            } else {
                if (i16 != 2) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1009623280);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                draadjrbmkVar2.sopmlzcsov(1233780940);
                z zVar4 = z.f44180iobyxmoadg;
                int i24 = z.f44181zoijcleaow;
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(l41.ppxfxbqfkf.zoijcleaow(zVar4, draadjrbmkVar2, i24).zoijcleaow().ppxfxbqfkf(), oipsdeybqn.dxjokdxxww(l41.ppxfxbqfkf.iobyxmoadg(zVar4, draadjrbmkVar2, i24).eablkybsjg()));
                draadjrbmkVar2.stevsuqkhv();
            }
            draadjrbmk draadjrbmkVar5 = draadjrbmkVar2;
            w6.btonecajqb(payment.getName(), cdpycssgdh.iwizpuwonk(wflxmlrfwpVar.wkgbmnqykc(iobyxmoadgVar2, iobyxmoadgVar.wkgbmnqykc()), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(92), 1, null), ((oipsdeybqn) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (n) vdvldrhtssVarIobyxmoadg.iobyxmoadg(), draadjrbmkVar5, 0, 0, 65528);
            draadjrbmkVar3 = draadjrbmkVar5;
            draadjrbmkVar3.sopmlzcsov(1009643047);
            if (payment.getIsSelected()) {
                dsvhmnatus.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(b31.gxszxtbevo.ic_card_checkbox, draadjrbmkVar3, 0), null, wflxmlrfwpVar.wkgbmnqykc(cdpycssgdh.vdvldrhtss(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(f13)), iobyxmoadgVar.ppxfxbqfkf()), null, null, 0.0f, null, draadjrbmkVar3, 48, 120);
            }
            draadjrbmkVar3.stevsuqkhv();
            draadjrbmkVar3.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar5;
        } else {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(451672360, i15, -1, "ru.myspar.proloyalty.common.view.payment.cards.compose.CardContent (CardContent.kt:42)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn3 = esjtqupxsv.ojitshcjhn(cdpycssgdh.gxszxtbevo(wkgbmnqykcVar3, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(12), w0.nufgyqmvbu.lqeggnwhkg(10));
            iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww3 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar.ojitshcjhn(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOjitshcjhn3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar5 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar5.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar5.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar5.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar5.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar5.wkgbmnqykc());
            wflxmlrfwpVar = wflxmlrfwp.f4892iobyxmoadg;
            String iconUrl3 = payment.getIconUrl();
            com.bumptech.glide.integration.compose.eablkybsjg eablkybsjgVarWkgbmnqykc5 = p41.lqeggnwhkg.wkgbmnqykc();
            com.bumptech.glide.integration.compose.eablkybsjg eablkybsjgVarWkgbmnqykc6 = p41.lqeggnwhkg.wkgbmnqykc();
            iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            f13 = 24;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg3 = e.eablkybsjg.iobyxmoadg(cdpycssgdh.dxjokdxxww(wflxmlrfwpVar.wkgbmnqykc(iobyxmoadgVar2, iobyxmoadgVar.ojitshcjhn()), w0.nufgyqmvbu.lqeggnwhkg(f13)), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(4)));
            int i112 = com.bumptech.glide.integration.compose.eablkybsjg.f20637iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar3;
            com.bumptech.glide.integration.compose.zoijcleaow.iobyxmoadg(iconUrl3, null, wkgbmnqykcVarIobyxmoadg3, null, null, 0.0f, null, eablkybsjgVarWkgbmnqykc5, eablkybsjgVarWkgbmnqykc6, null, null, draadjrbmkVarBtonecajqb, (i112 << 21) | 48 | (i112 << 24), 0, 1656);
            i16 = iobyxmoadg.f120611iobyxmoadg[payment.getTextStyle().ordinal()];
            if (i16 == 1) {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                draadjrbmkVar2.sopmlzcsov(1233615555);
                z zVar5 = z.f44180iobyxmoadg;
                int i113 = z.f44181zoijcleaow;
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(h41.zoijcleaow.eablkybsjg(l41.ppxfxbqfkf.zoijcleaow(zVar5, draadjrbmkVar2, i113).iobyxmoadg()), oipsdeybqn.dxjokdxxww(l41.ppxfxbqfkf.iobyxmoadg(zVar5, draadjrbmkVar2, i113).iwizpuwonk()));
                draadjrbmkVar2.stevsuqkhv();
            } else {
                if (i16 != 2) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1009623280);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                draadjrbmkVar2.sopmlzcsov(1233780940);
                z zVar6 = z.f44180iobyxmoadg;
                int i25 = z.f44181zoijcleaow;
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(l41.ppxfxbqfkf.zoijcleaow(zVar6, draadjrbmkVar2, i25).zoijcleaow().ppxfxbqfkf(), oipsdeybqn.dxjokdxxww(l41.ppxfxbqfkf.iobyxmoadg(zVar6, draadjrbmkVar2, i25).eablkybsjg()));
                draadjrbmkVar2.stevsuqkhv();
            }
            draadjrbmk draadjrbmkVar6 = draadjrbmkVar2;
            w6.btonecajqb(payment.getName(), cdpycssgdh.iwizpuwonk(wflxmlrfwpVar.wkgbmnqykc(iobyxmoadgVar2, iobyxmoadgVar.wkgbmnqykc()), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(92), 1, null), ((oipsdeybqn) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (n) vdvldrhtssVarIobyxmoadg.iobyxmoadg(), draadjrbmkVar6, 0, 0, 65528);
            draadjrbmkVar3 = draadjrbmkVar6;
            draadjrbmkVar3.sopmlzcsov(1009643047);
            if (payment.getIsSelected()) {
                dsvhmnatus.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(b31.gxszxtbevo.ic_card_checkbox, draadjrbmkVar3, 0), null, wflxmlrfwpVar.wkgbmnqykc(cdpycssgdh.vdvldrhtss(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(f13)), iobyxmoadgVar.ppxfxbqfkf()), null, null, 0.0f, null, draadjrbmkVar3, 48, 120);
            }
            draadjrbmkVar3.stevsuqkhv();
            draadjrbmkVar3.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar6;
        }
        a0VarWflxmlrfwp = draadjrbmkVar3.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ws0.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return zoijcleaow.ppxfxbqfkf(payment, wkgbmnqykcVar2, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
