package ws0;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import h.oipsdeybqn;
import igdgnonuha.pmvmpeiblj;
import igdgnonuha.z;
import ikoacuggdj.oxmwwwfdhm;
import ikoacuggdj.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.payment.cards.model.PaymentMethodUiModel;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ PaymentMethodUiModel f120610zdlpuopuiu;

        iobyxmoadg(PaymentMethodUiModel paymentMethodUiModel) {
            this.f120610zdlpuopuiu = paymentMethodUiModel;
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
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1719538026, i13, -1, "ru.myspar.proloyalty.common.view.payment.cards.compose.CardItem.<anonymous> (CardItem.kt:53)");
            }
            zoijcleaow.zoijcleaow(this.f120610zdlpuopuiu, null, draadjrbmkVar, 0, 2);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(PaymentMethodUiModel paymentMethodUiModel, tg.iobyxmoadg iobyxmoadgVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(paymentMethodUiModel, iobyxmoadgVar, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x011f  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void zoijcleaow(final PaymentMethodUiModel payment, final tg.iobyxmoadg onClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        vdvldrhtss vdvldrhtssVarIobyxmoadg;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(payment, "payment");
        zdlpuopuiu.btonecajqb(onClick, "onClick");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(839812528);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(payment) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClick) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i15 & 147) == 146 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i16 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(839812528, i15, -1, "ru.myspar.proloyalty.common.view.payment.cards.compose.CardItem (CardItem.kt:33)");
                }
                bfopjjpdmp.gxszxtbevo gxszxtbevoVarPpxfxbqfkf = bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(16));
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarKcexrzcfyt = cdpycssgdh.kcexrzcfyt(e.draadjrbmk.zoijcleaow(wkgbmnqykcVar3, w0.nufgyqmvbu.lqeggnwhkg(10), gxszxtbevoVarPpxfxbqfkf, false, 0L, oipsdeybqn.f38945zoijcleaow.gxszxtbevo(), 12, null), w0.nufgyqmvbu.lqeggnwhkg(136), w0.nufgyqmvbu.lqeggnwhkg(113));
                vdvldrhtssVarIobyxmoadg = oxmwwwfdhm.iobyxmoadg(w0.nufgyqmvbu.lqeggnwhkg(2), l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).eablkybsjg());
                if (!payment.getIsSelected()) {
                    vdvldrhtssVarIobyxmoadg = null;
                }
                pmvmpeiblj.zoijcleaow(onClick, wkgbmnqykcVarKcexrzcfyt, false, gxszxtbevoVarPpxfxbqfkf, 0L, 0L, vdvldrhtssVarIobyxmoadg, 0.0f, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1719538026, true, new iobyxmoadg(payment), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 805306368, 436);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ws0.ppxfxbqfkf
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return wkgbmnqykc.ppxfxbqfkf(payment, onClick, wkgbmnqykcVar4, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i15 & 147) == 146) {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(839812528, i15, -1, "ru.myspar.proloyalty.common.view.payment.cards.compose.CardItem (CardItem.kt:33)");
            }
            bfopjjpdmp.gxszxtbevo gxszxtbevoVarPpxfxbqfkf2 = bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(16));
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarKcexrzcfyt2 = cdpycssgdh.kcexrzcfyt(e.draadjrbmk.zoijcleaow(wkgbmnqykcVar3, w0.nufgyqmvbu.lqeggnwhkg(10), gxszxtbevoVarPpxfxbqfkf2, false, 0L, oipsdeybqn.f38945zoijcleaow.gxszxtbevo(), 12, null), w0.nufgyqmvbu.lqeggnwhkg(136), w0.nufgyqmvbu.lqeggnwhkg(113));
            vdvldrhtssVarIobyxmoadg = oxmwwwfdhm.iobyxmoadg(w0.nufgyqmvbu.lqeggnwhkg(2), l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).eablkybsjg());
            if (!payment.getIsSelected()) {
                vdvldrhtssVarIobyxmoadg = null;
            }
            pmvmpeiblj.zoijcleaow(onClick, wkgbmnqykcVarKcexrzcfyt2, false, gxszxtbevoVarPpxfxbqfkf2, 0L, 0L, vdvldrhtssVarIobyxmoadg, 0.0f, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1719538026, true, new iobyxmoadg(payment), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 805306368, 436);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(839812528, i15, -1, "ru.myspar.proloyalty.common.view.payment.cards.compose.CardItem (CardItem.kt:33)");
            }
            bfopjjpdmp.gxszxtbevo gxszxtbevoVarPpxfxbqfkf3 = bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(16));
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarKcexrzcfyt3 = cdpycssgdh.kcexrzcfyt(e.draadjrbmk.zoijcleaow(wkgbmnqykcVar3, w0.nufgyqmvbu.lqeggnwhkg(10), gxszxtbevoVarPpxfxbqfkf3, false, 0L, oipsdeybqn.f38945zoijcleaow.gxszxtbevo(), 12, null), w0.nufgyqmvbu.lqeggnwhkg(136), w0.nufgyqmvbu.lqeggnwhkg(113));
            vdvldrhtssVarIobyxmoadg = oxmwwwfdhm.iobyxmoadg(w0.nufgyqmvbu.lqeggnwhkg(2), l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).eablkybsjg());
            if (!payment.getIsSelected()) {
                vdvldrhtssVarIobyxmoadg = null;
            }
            pmvmpeiblj.zoijcleaow(onClick, wkgbmnqykcVarKcexrzcfyt3, false, gxszxtbevoVarPpxfxbqfkf3, 0L, 0L, vdvldrhtssVarIobyxmoadg, 0.0f, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1719538026, true, new iobyxmoadg(payment), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 805306368, 436);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ws0.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return wkgbmnqykc.ppxfxbqfkf(payment, onClick, wkgbmnqykcVar4, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
