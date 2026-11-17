package ws0;

import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.ydmasvzmpa;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.payment.cards.model.PaymentList;
import ru.myspar.proloyalty.common.view.payment.cards.model.PaymentMethodUiModel;
import tg.draadjrbmk;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import yfnezrywwk.jpowsppfya;

/* JADX INFO: loaded from: classes5.dex */
public abstract class nufgyqmvbu {

    public static final class eablkybsjg implements oxmwwwfdhm {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f120596yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f120597zdlpuopuiu;

        public eablkybsjg(List list, draadjrbmk draadjrbmkVar) {
            this.f120597zdlpuopuiu = list;
            this.f120596yggfygwlhe = draadjrbmkVar;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            iobyxmoadg((yfnezrywwk.eablkybsjg) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.draadjrbmk) obj3, ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(yfnezrywwk.eablkybsjg eablkybsjgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (draadjrbmkVar.ulzqkzuiru(eablkybsjgVar) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= draadjrbmkVar.ppxfxbqfkf(i13) ? 32 : 16;
            }
            if (!draadjrbmkVar.vdvldrhtss((i15 & 147) != 146, i15 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(802480018, i15, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            PaymentMethodUiModel paymentMethodUiModel = (PaymentMethodUiModel) this.f120597zdlpuopuiu.get(i13);
            draadjrbmkVar.sopmlzcsov(-2144230598);
            draadjrbmkVar.sopmlzcsov(-2147376618);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f120596yggfygwlhe) | draadjrbmkVar.ulzqkzuiru(paymentMethodUiModel);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(this.f120596yggfygwlhe, paymentMethodUiModel);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            ws0.wkgbmnqykc.zoijcleaow(paymentMethodUiModel, (tg.iobyxmoadg) objYadqdtsiqt, null, draadjrbmkVar, 0, 4);
            draadjrbmkVar.stevsuqkhv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class iobyxmoadg implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ PaymentMethodUiModel f120598yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f120599zdlpuopuiu;

        iobyxmoadg(draadjrbmk draadjrbmkVar, PaymentMethodUiModel paymentMethodUiModel) {
            this.f120599zdlpuopuiu = draadjrbmkVar;
            this.f120598yggfygwlhe = paymentMethodUiModel;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f120599zdlpuopuiu.invoke(this.f120598yggfygwlhe.getId());
        }
    }

    public static final class ppxfxbqfkf implements draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f120600yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f120601zdlpuopuiu;

        public ppxfxbqfkf(draadjrbmk draadjrbmkVar, List list) {
            this.f120601zdlpuopuiu = draadjrbmkVar;
            this.f120600yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f120601zdlpuopuiu.invoke(this.f120600yggfygwlhe.get(i13));
        }
    }

    public static final class wkgbmnqykc implements draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f120602yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f120603zdlpuopuiu;

        public wkgbmnqykc(draadjrbmk draadjrbmkVar, List list) {
            this.f120603zdlpuopuiu = draadjrbmkVar;
            this.f120602yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f120603zdlpuopuiu.invoke(this.f120602yggfygwlhe.get(i13));
        }
    }

    public static final class zoijcleaow implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f120604zdlpuopuiu = new zoijcleaow();

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(PaymentList paymentList, draadjrbmk draadjrbmkVar, jpowsppfya LazyRow) {
        zdlpuopuiu.btonecajqb(LazyRow, "$this$LazyRow");
        List items = paymentList.getItems();
        LazyRow.nufgyqmvbu(items.size(), new ppxfxbqfkf(new draadjrbmk() { // from class: ws0.lqeggnwhkg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return nufgyqmvbu.gxszxtbevo((PaymentMethodUiModel) obj);
            }
        }, items), new wkgbmnqykc(zoijcleaow.f120604zdlpuopuiu, items), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(802480018, true, new eablkybsjg(items, draadjrbmkVar)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object gxszxtbevo(PaymentMethodUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(PaymentList paymentList, draadjrbmk draadjrbmkVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, ydmasvzmpa ydmasvzmpaVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        wkgbmnqykc(paymentList, draadjrbmkVar, wkgbmnqykcVar, ydmasvzmpaVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00db  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x011d  */
    /* JADX WARN: Code duplicated, block: B:79:0x012a  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void wkgbmnqykc(final PaymentList paymentList, final draadjrbmk onPaymentClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, ydmasvzmpa ydmasvzmpaVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        ydmasvzmpa ydmasvzmpaVar2;
        int i17;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        ydmasvzmpa ydmasvzmpaVarEablkybsjg;
        boolean z13;
        boolean z14;
        Object objYadqdtsiqt;
        final ydmasvzmpa ydmasvzmpaVar3;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(paymentList, "paymentList");
        zdlpuopuiu.btonecajqb(onPaymentClick, "onPaymentClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-167604536);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(paymentList) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onPaymentClick) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    ydmasvzmpaVar2 = ydmasvzmpaVar;
                    if (draadjrbmkVarBtonecajqb.ulzqkzuiru(ydmasvzmpaVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                    if (i18 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i16 != 0) {
                        ydmasvzmpaVarEablkybsjg = esjtqupxsv.eablkybsjg(w0.nufgyqmvbu.lqeggnwhkg(0));
                    } else {
                        ydmasvzmpaVarEablkybsjg = ydmasvzmpaVar2;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(-167604536, i15, -1, "ru.myspar.proloyalty.common.view.payment.cards.compose.PaymentCards (PaymentsPanel.kt:24)");
                    }
                    czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(4));
                    a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = a.eablkybsjg.f20iobyxmoadg.dxjokdxxww();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1003997818);
                    if ((i15 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | ((i15 & 112) == 32);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z14 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new draadjrbmk() { // from class: ws0.eablkybsjg
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return nufgyqmvbu.eablkybsjg(paymentList, onPaymentClick, (jpowsppfya) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar3, null, ydmasvzmpaVarEablkybsjg, false, gxszxtbevoVarRgvfuqvkyq, ppxfxbqfkfVarDxjokdxxww, null, false, null, (draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, ((i15 >> 6) & 14) | 221184 | ((i15 >> 3) & 896), 458);
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar2 = wkgbmnqykcVar3;
                    ydmasvzmpaVar3 = ydmasvzmpaVarEablkybsjg;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    ydmasvzmpaVar3 = ydmasvzmpaVar2;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar2;
                    a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ws0.gxszxtbevo
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return nufgyqmvbu.lqeggnwhkg(paymentList, onPaymentClick, wkgbmnqykcVar4, ydmasvzmpaVar3, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 3072;
            ydmasvzmpaVar2 = ydmasvzmpaVar;
            if ((i15 & 1171) == 1170) {
                if (i18 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i16 != 0) {
                    ydmasvzmpaVarEablkybsjg = esjtqupxsv.eablkybsjg(w0.nufgyqmvbu.lqeggnwhkg(0));
                } else {
                    ydmasvzmpaVarEablkybsjg = ydmasvzmpaVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-167604536, i15, -1, "ru.myspar.proloyalty.common.view.payment.cards.compose.PaymentCards (PaymentsPanel.kt:24)");
                }
                czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq2 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(4));
                a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww2 = a.eablkybsjg.f20iobyxmoadg.dxjokdxxww();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1003997818);
                if ((i15 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i15 & 112) == 32);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14) {
                    objYadqdtsiqt = new draadjrbmk() { // from class: ws0.eablkybsjg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return nufgyqmvbu.eablkybsjg(paymentList, onPaymentClick, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new draadjrbmk() { // from class: ws0.eablkybsjg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return nufgyqmvbu.eablkybsjg(paymentList, onPaymentClick, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar3, null, ydmasvzmpaVarEablkybsjg, false, gxszxtbevoVarRgvfuqvkyq2, ppxfxbqfkfVarDxjokdxxww2, null, false, null, (draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, ((i15 >> 6) & 14) | 221184 | ((i15 >> 3) & 896), 458);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
                ydmasvzmpaVar3 = ydmasvzmpaVarEablkybsjg;
            } else {
                if (i18 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i16 != 0) {
                    ydmasvzmpaVarEablkybsjg = esjtqupxsv.eablkybsjg(w0.nufgyqmvbu.lqeggnwhkg(0));
                } else {
                    ydmasvzmpaVarEablkybsjg = ydmasvzmpaVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-167604536, i15, -1, "ru.myspar.proloyalty.common.view.payment.cards.compose.PaymentCards (PaymentsPanel.kt:24)");
                }
                czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq3 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(4));
                a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww3 = a.eablkybsjg.f20iobyxmoadg.dxjokdxxww();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1003997818);
                if ((i15 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i15 & 112) == 32);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14) {
                    objYadqdtsiqt = new draadjrbmk() { // from class: ws0.eablkybsjg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return nufgyqmvbu.eablkybsjg(paymentList, onPaymentClick, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new draadjrbmk() { // from class: ws0.eablkybsjg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return nufgyqmvbu.eablkybsjg(paymentList, onPaymentClick, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar3, null, ydmasvzmpaVarEablkybsjg, false, gxszxtbevoVarRgvfuqvkyq3, ppxfxbqfkfVarDxjokdxxww3, null, false, null, (draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, ((i15 >> 6) & 14) | 221184 | ((i15 >> 3) & 896), 458);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
                ydmasvzmpaVar3 = ydmasvzmpaVarEablkybsjg;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar2;
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ws0.gxszxtbevo
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return nufgyqmvbu.lqeggnwhkg(paymentList, onPaymentClick, wkgbmnqykcVar5, ydmasvzmpaVar3, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                ydmasvzmpaVar2 = ydmasvzmpaVar;
                if (draadjrbmkVarBtonecajqb.ulzqkzuiru(ydmasvzmpaVar2)) {
                    i17 = 2048;
                } else {
                    i17 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) == 1170) {
                if (i18 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i16 != 0) {
                    ydmasvzmpaVarEablkybsjg = esjtqupxsv.eablkybsjg(w0.nufgyqmvbu.lqeggnwhkg(0));
                } else {
                    ydmasvzmpaVarEablkybsjg = ydmasvzmpaVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-167604536, i15, -1, "ru.myspar.proloyalty.common.view.payment.cards.compose.PaymentCards (PaymentsPanel.kt:24)");
                }
                czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq4 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(4));
                a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww4 = a.eablkybsjg.f20iobyxmoadg.dxjokdxxww();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1003997818);
                if ((i15 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i15 & 112) == 32);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14) {
                    objYadqdtsiqt = new draadjrbmk() { // from class: ws0.eablkybsjg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return nufgyqmvbu.eablkybsjg(paymentList, onPaymentClick, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new draadjrbmk() { // from class: ws0.eablkybsjg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return nufgyqmvbu.eablkybsjg(paymentList, onPaymentClick, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar3, null, ydmasvzmpaVarEablkybsjg, false, gxszxtbevoVarRgvfuqvkyq4, ppxfxbqfkfVarDxjokdxxww4, null, false, null, (draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, ((i15 >> 6) & 14) | 221184 | ((i15 >> 3) & 896), 458);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
                ydmasvzmpaVar3 = ydmasvzmpaVarEablkybsjg;
            } else {
                if (i18 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i16 != 0) {
                    ydmasvzmpaVarEablkybsjg = esjtqupxsv.eablkybsjg(w0.nufgyqmvbu.lqeggnwhkg(0));
                } else {
                    ydmasvzmpaVarEablkybsjg = ydmasvzmpaVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-167604536, i15, -1, "ru.myspar.proloyalty.common.view.payment.cards.compose.PaymentCards (PaymentsPanel.kt:24)");
                }
                czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq5 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(4));
                a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww5 = a.eablkybsjg.f20iobyxmoadg.dxjokdxxww();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1003997818);
                if ((i15 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i15 & 112) == 32);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14) {
                    objYadqdtsiqt = new draadjrbmk() { // from class: ws0.eablkybsjg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return nufgyqmvbu.eablkybsjg(paymentList, onPaymentClick, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new draadjrbmk() { // from class: ws0.eablkybsjg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return nufgyqmvbu.eablkybsjg(paymentList, onPaymentClick, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar3, null, ydmasvzmpaVarEablkybsjg, false, gxszxtbevoVarRgvfuqvkyq5, ppxfxbqfkfVarDxjokdxxww5, null, false, null, (draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, ((i15 >> 6) & 14) | 221184 | ((i15 >> 3) & 896), 458);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
                ydmasvzmpaVar3 = ydmasvzmpaVarEablkybsjg;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar2;
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ws0.gxszxtbevo
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return nufgyqmvbu.lqeggnwhkg(paymentList, onPaymentClick, wkgbmnqykcVar6, ydmasvzmpaVar3, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        ydmasvzmpaVar2 = ydmasvzmpaVar;
        if ((i15 & 1171) == 1170) {
            if (i18 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i16 != 0) {
                ydmasvzmpaVarEablkybsjg = esjtqupxsv.eablkybsjg(w0.nufgyqmvbu.lqeggnwhkg(0));
            } else {
                ydmasvzmpaVarEablkybsjg = ydmasvzmpaVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-167604536, i15, -1, "ru.myspar.proloyalty.common.view.payment.cards.compose.PaymentCards (PaymentsPanel.kt:24)");
            }
            czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq6 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(4));
            a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww6 = a.eablkybsjg.f20iobyxmoadg.dxjokdxxww();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1003997818);
            if ((i15 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | ((i15 & 112) == 32);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                objYadqdtsiqt = new draadjrbmk() { // from class: ws0.eablkybsjg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return nufgyqmvbu.eablkybsjg(paymentList, onPaymentClick, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new draadjrbmk() { // from class: ws0.eablkybsjg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return nufgyqmvbu.eablkybsjg(paymentList, onPaymentClick, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar3, null, ydmasvzmpaVarEablkybsjg, false, gxszxtbevoVarRgvfuqvkyq6, ppxfxbqfkfVarDxjokdxxww6, null, false, null, (draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, ((i15 >> 6) & 14) | 221184 | ((i15 >> 3) & 896), 458);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
            ydmasvzmpaVar3 = ydmasvzmpaVarEablkybsjg;
        } else {
            if (i18 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i16 != 0) {
                ydmasvzmpaVarEablkybsjg = esjtqupxsv.eablkybsjg(w0.nufgyqmvbu.lqeggnwhkg(0));
            } else {
                ydmasvzmpaVarEablkybsjg = ydmasvzmpaVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-167604536, i15, -1, "ru.myspar.proloyalty.common.view.payment.cards.compose.PaymentCards (PaymentsPanel.kt:24)");
            }
            czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq7 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(4));
            a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww7 = a.eablkybsjg.f20iobyxmoadg.dxjokdxxww();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1003997818);
            if ((i15 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | ((i15 & 112) == 32);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                objYadqdtsiqt = new draadjrbmk() { // from class: ws0.eablkybsjg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return nufgyqmvbu.eablkybsjg(paymentList, onPaymentClick, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new draadjrbmk() { // from class: ws0.eablkybsjg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return nufgyqmvbu.eablkybsjg(paymentList, onPaymentClick, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar3, null, ydmasvzmpaVarEablkybsjg, false, gxszxtbevoVarRgvfuqvkyq7, ppxfxbqfkfVarDxjokdxxww7, null, false, null, (draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, ((i15 >> 6) & 14) | 221184 | ((i15 >> 3) & 896), 458);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
            ydmasvzmpaVar3 = ydmasvzmpaVarEablkybsjg;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar2;
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ws0.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return nufgyqmvbu.lqeggnwhkg(paymentList, onPaymentClick, wkgbmnqykcVar7, ydmasvzmpaVar3, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
