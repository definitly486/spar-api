package ji0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class agtfadlqog {

    public static final class eablkybsjg implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f51408yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51409zdlpuopuiu;

        public eablkybsjg(tg.draadjrbmk draadjrbmkVar, List list) {
            this.f51409zdlpuopuiu = draadjrbmkVar;
            this.f51408yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f51409zdlpuopuiu.invoke(this.f51408yggfygwlhe.get(i13));
        }
    }

    public static final class gxszxtbevo implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f51410yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51411zdlpuopuiu;

        public gxszxtbevo(tg.draadjrbmk draadjrbmkVar, List list) {
            this.f51411zdlpuopuiu = draadjrbmkVar;
            this.f51410yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f51411zdlpuopuiu.invoke(this.f51410yggfygwlhe.get(i13));
        }
    }

    static final class iobyxmoadg implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ki0.wkgbmnqykc f51412yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51413zdlpuopuiu;

        iobyxmoadg(tg.draadjrbmk draadjrbmkVar, ki0.wkgbmnqykc wkgbmnqykcVar) {
            this.f51413zdlpuopuiu = draadjrbmkVar;
            this.f51412yggfygwlhe = wkgbmnqykcVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f51413zdlpuopuiu.invoke(((ki0.zoijcleaow) this.f51412yggfygwlhe).getItemId());
        }
    }

    public static final class lqeggnwhkg implements tg.oxmwwwfdhm {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51414iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.wkgbmnqykc f51415jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51416yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f51417zdlpuopuiu;

        public lqeggnwhkg(List list, tg.draadjrbmk draadjrbmkVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar2) {
            this.f51417zdlpuopuiu = list;
            this.f51416yggfygwlhe = draadjrbmkVar;
            this.f51415jyumaefscl = wkgbmnqykcVar;
            this.f51414iwizpuwonk = draadjrbmkVar2;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            iobyxmoadg((yfnezrywwk.eablkybsjg) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.draadjrbmk) obj3, ((Number) obj4).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
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
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(802480018, i15, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            ki0.wkgbmnqykc wkgbmnqykcVar = (ki0.wkgbmnqykc) this.f51417zdlpuopuiu.get(i13);
            draadjrbmkVar.sopmlzcsov(1692163766);
            if (wkgbmnqykcVar instanceof ki0.zoijcleaow) {
                draadjrbmkVar.sopmlzcsov(1692206111);
                ki0.zoijcleaow zoijcleaowVar = (ki0.zoijcleaow) wkgbmnqykcVar;
                String strWkgbmnqykc = e0.gxszxtbevo.wkgbmnqykc(ai0.zoijcleaow.count, new Object[]{Integer.valueOf(zoijcleaowVar.iobyxmoadg())}, draadjrbmkVar, 0);
                String strWkgbmnqykc2 = e0.gxszxtbevo.wkgbmnqykc(ai0.zoijcleaow.time, new Object[]{String.valueOf(zoijcleaowVar.zoijcleaow())}, draadjrbmkVar, 0);
                boolean zPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
                draadjrbmkVar.sopmlzcsov(1301521155);
                boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f51416yggfygwlhe) | draadjrbmkVar.lmojexxdyd(wkgbmnqykcVar);
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new iobyxmoadg(this.f51416yggfygwlhe, wkgbmnqykcVar);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar.stevsuqkhv();
                btonecajqb.zoijcleaow((tg.iobyxmoadg) objYadqdtsiqt, strWkgbmnqykc, strWkgbmnqykc2, zPpxfxbqfkf, this.f51415jyumaefscl, draadjrbmkVar, 24576, 0);
                draadjrbmkVar.stevsuqkhv();
            } else if (wkgbmnqykcVar instanceof ki0.ppxfxbqfkf) {
                draadjrbmkVar.sopmlzcsov(1692602291);
                ki0.ppxfxbqfkf ppxfxbqfkfVar = (ki0.ppxfxbqfkf) wkgbmnqykcVar;
                String strZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
                String strWkgbmnqykc3 = e0.gxszxtbevo.wkgbmnqykc(ai0.zoijcleaow.count, new Object[]{Integer.valueOf(ppxfxbqfkfVar.iobyxmoadg())}, draadjrbmkVar, 0);
                boolean zPpxfxbqfkf2 = ppxfxbqfkfVar.ppxfxbqfkf();
                draadjrbmkVar.sopmlzcsov(1301532323);
                boolean zUlzqkzuiru2 = draadjrbmkVar.ulzqkzuiru(this.f51416yggfygwlhe) | draadjrbmkVar.lmojexxdyd(wkgbmnqykcVar);
                Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new zoijcleaow(this.f51416yggfygwlhe, wkgbmnqykcVar);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVar.stevsuqkhv();
                btonecajqb.zoijcleaow((tg.iobyxmoadg) objYadqdtsiqt2, strZoijcleaow, strWkgbmnqykc3, zPpxfxbqfkf2, this.f51415jyumaefscl, draadjrbmkVar, 24576, 0);
                draadjrbmkVar.stevsuqkhv();
            } else {
                if (!(wkgbmnqykcVar instanceof ki0.wkgbmnqykc.iobyxmoadg)) {
                    draadjrbmkVar.sopmlzcsov(1301511917);
                    draadjrbmkVar.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVar.sopmlzcsov(1692944624);
                ki0.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = (ki0.wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar;
                String strZoijcleaow2 = iobyxmoadgVar.zoijcleaow();
                String strWkgbmnqykc4 = e0.gxszxtbevo.wkgbmnqykc(ai0.zoijcleaow.time, new Object[]{String.valueOf(iobyxmoadgVar.iobyxmoadg())}, draadjrbmkVar, 0);
                draadjrbmkVar.sopmlzcsov(1301542498);
                boolean zUlzqkzuiru3 = draadjrbmkVar.ulzqkzuiru(this.f51414iwizpuwonk) | draadjrbmkVar.lmojexxdyd(wkgbmnqykcVar);
                Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru3 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new ppxfxbqfkf(this.f51414iwizpuwonk, wkgbmnqykcVar);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVar.stevsuqkhv();
                hcddaimhww.zoijcleaow((tg.iobyxmoadg) objYadqdtsiqt3, strZoijcleaow2, strWkgbmnqykc4, this.f51415jyumaefscl, draadjrbmkVar, 3072, 0);
                draadjrbmkVar.stevsuqkhv();
            }
            draadjrbmkVar.stevsuqkhv();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class ppxfxbqfkf implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ki0.wkgbmnqykc f51418yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51419zdlpuopuiu;

        ppxfxbqfkf(tg.draadjrbmk draadjrbmkVar, ki0.wkgbmnqykc wkgbmnqykcVar) {
            this.f51419zdlpuopuiu = draadjrbmkVar;
            this.f51418yggfygwlhe = wkgbmnqykcVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f51419zdlpuopuiu.invoke(((ki0.wkgbmnqykc.iobyxmoadg) this.f51418yggfygwlhe).getItemId());
        }
    }

    public static final class wkgbmnqykc implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final wkgbmnqykc f51420zdlpuopuiu = new wkgbmnqykc();

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    static final class zoijcleaow implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ki0.wkgbmnqykc f51421yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51422zdlpuopuiu;

        zoijcleaow(tg.draadjrbmk draadjrbmkVar, ki0.wkgbmnqykc wkgbmnqykcVar) {
            this.f51422zdlpuopuiu = draadjrbmkVar;
            this.f51421yggfygwlhe = wkgbmnqykcVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f51422zdlpuopuiu.invoke(((ki0.ppxfxbqfkf) this.f51421yggfygwlhe).getItemId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eablkybsjg(List list, tg.draadjrbmk draadjrbmkVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar2, yfnezrywwk.jpowsppfya LazyColumn) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(LazyColumn, "$this$LazyColumn");
        LazyColumn.nufgyqmvbu(list.size(), new eablkybsjg(new tg.draadjrbmk() { // from class: ji0.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.gxszxtbevo((ki0.wkgbmnqykc) obj);
            }
        }, list), new gxszxtbevo(wkgbmnqykc.f51420zdlpuopuiu, list), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(802480018, true, new lqeggnwhkg(list, draadjrbmkVar, wkgbmnqykcVar, draadjrbmkVar2)));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object gxszxtbevo(ki0.wkgbmnqykc it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return it.getItemId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(List list, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar3, int i15) {
        wkgbmnqykc(list, draadjrbmkVar, draadjrbmkVar2, wkgbmnqykcVar, draadjrbmkVar3, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x0103  */
    /* JADX WARN: Code duplicated, block: B:75:0x010e  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void wkgbmnqykc(final List items, final tg.draadjrbmk onGroupClick, final tg.draadjrbmk onItemClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu;
        boolean z13;
        boolean z14;
        Object objYadqdtsiqt;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onGroupClick, "onGroupClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onItemClick, "onItemClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-517831050);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(items) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onGroupClick) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onItemClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i15 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i16 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-517831050, i15, -1, "ru.myspar.networkpanel.impl.presentation.compose.NetworkInfoList (NetworkItemsList.kt:19)");
                }
                wkgbmnqykcVarNufgyqmvbu = androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
                draadjrbmkVarBtonecajqb.sopmlzcsov(931398666);
                boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(items);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zLmojexxdyd | z13 | ((i15 & 896) == 256);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ji0.gtknphoqwx
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return agtfadlqog.eablkybsjg(items, onGroupClick, wkgbmnqykcVarNufgyqmvbu, onItemClick, (yfnezrywwk.jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                yfnezrywwk.wkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVar3, null, null, false, null, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, (i15 >> 9) & 14, 510);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar2;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ji0.draadjrbmk
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return agtfadlqog.lqeggnwhkg(items, onGroupClick, onItemClick, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i15 & 1171) == 1170) {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-517831050, i15, -1, "ru.myspar.networkpanel.impl.presentation.compose.NetworkInfoList (NetworkItemsList.kt:19)");
            }
            wkgbmnqykcVarNufgyqmvbu = androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(931398666);
            boolean zLmojexxdyd2 = draadjrbmkVarBtonecajqb.lmojexxdyd(items);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zLmojexxdyd2 | z13 | ((i15 & 896) == 256);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: ji0.gtknphoqwx
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return agtfadlqog.eablkybsjg(items, onGroupClick, wkgbmnqykcVarNufgyqmvbu, onItemClick, (yfnezrywwk.jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: ji0.gtknphoqwx
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return agtfadlqog.eablkybsjg(items, onGroupClick, wkgbmnqykcVarNufgyqmvbu, onItemClick, (yfnezrywwk.jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            yfnezrywwk.wkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVar3, null, null, false, null, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, (i15 >> 9) & 14, 510);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-517831050, i15, -1, "ru.myspar.networkpanel.impl.presentation.compose.NetworkInfoList (NetworkItemsList.kt:19)");
            }
            wkgbmnqykcVarNufgyqmvbu = androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(931398666);
            boolean zLmojexxdyd3 = draadjrbmkVarBtonecajqb.lmojexxdyd(items);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zLmojexxdyd3 | z13 | ((i15 & 896) == 256);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: ji0.gtknphoqwx
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return agtfadlqog.eablkybsjg(items, onGroupClick, wkgbmnqykcVarNufgyqmvbu, onItemClick, (yfnezrywwk.jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: ji0.gtknphoqwx
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return agtfadlqog.eablkybsjg(items, onGroupClick, wkgbmnqykcVarNufgyqmvbu, onItemClick, (yfnezrywwk.jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            yfnezrywwk.wkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVar3, null, null, false, null, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, (i15 >> 9) & 14, 510);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar2;
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ji0.draadjrbmk
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return agtfadlqog.lqeggnwhkg(items, onGroupClick, onItemClick, wkgbmnqykcVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
