package yp;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.cart.impl.domain.store.CartStore$CartDialogType;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(CartStore$CartDialogType cartStore$CartDialogType, tg.draadjrbmk draadjrbmkVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        eablkybsjg(cartStore$CartDialogType, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void eablkybsjg(final CartStore$CartDialogType cartStore$CartDialogType, final tg.draadjrbmk dispatch, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        boolean z13;
        zdlpuopuiu.btonecajqb(dispatch, "dispatch");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1630858502);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? draadjrbmkVarBtonecajqb.ulzqkzuiru(cartStore$CartDialogType) : draadjrbmkVarBtonecajqb.lmojexxdyd(cartStore$CartDialogType) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(dispatch) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1630858502, i14, -1, "ru.myspar.cart.impl.presentation.compose.cartscreenstates.CartDialogState (CartDialogState.kt:20)");
            }
            if (cartStore$CartDialogType != null) {
                if (cartStore$CartDialogType instanceof CartStore$CartDialogType.DeliveryIntervalErrorDialog) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1351484006);
                    String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(up.ppxfxbqfkf.error, draadjrbmkVarBtonecajqb, 0);
                    String message = ((CartStore$CartDialogType.DeliveryIntervalErrorDialog) cartStore$CartDialogType).getMessage();
                    String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(up.ppxfxbqfkf.f114077ok, draadjrbmkVarBtonecajqb, 0);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1844703858);
                    z13 = (i14 & 112) == 32;
                    Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.iobyxmoadg() { // from class: yp.iobyxmoadg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return eablkybsjg.gxszxtbevo(dispatch);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    c50.wkgbmnqykc.ppxfxbqfkf(strPpxfxbqfkf, message, strPpxfxbqfkf2, null, (tg.iobyxmoadg) objYadqdtsiqt, null, null, null, draadjrbmkVarBtonecajqb, 0, 232);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    if (!(cartStore$CartDialogType instanceof CartStore$CartDialogType.ClearCart)) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-1844713434);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        throw new NoWhenBranchMatchedException();
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1351124840);
                    String strPpxfxbqfkf3 = e0.gxszxtbevo.ppxfxbqfkf(up.ppxfxbqfkf.delete_cart, draadjrbmkVarBtonecajqb, 0);
                    String strPpxfxbqfkf4 = e0.gxszxtbevo.ppxfxbqfkf(up.ppxfxbqfkf.action_yes, draadjrbmkVarBtonecajqb, 0);
                    String strPpxfxbqfkf5 = e0.gxszxtbevo.ppxfxbqfkf(up.ppxfxbqfkf.action_no, draadjrbmkVarBtonecajqb, 0);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1844689931);
                    int i15 = i14 & 112;
                    boolean z14 = i15 == 32;
                    Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z14 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: yp.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return eablkybsjg.lqeggnwhkg(dispatch);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) objYadqdtsiqt2;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1844687250);
                    z13 = i15 == 32;
                    Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z13 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: yp.ppxfxbqfkf
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return eablkybsjg.nufgyqmvbu(dispatch);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    c50.wkgbmnqykc.ppxfxbqfkf(null, strPpxfxbqfkf3, strPpxfxbqfkf4, strPpxfxbqfkf5, iobyxmoadgVar, (tg.iobyxmoadg) objYadqdtsiqt3, null, null, draadjrbmkVarBtonecajqb, 6, 192);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                }
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: yp.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return eablkybsjg.dxjokdxxww(cartStore$CartDialogType, dispatch, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(ru.myspar.cart.impl.presentation.zoijcleaow.iobyxmoadg.f85069iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(ru.myspar.cart.impl.presentation.zoijcleaow.btonecajqb.f85062iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(ru.myspar.cart.impl.presentation.zoijcleaow.iobyxmoadg.f85069iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
