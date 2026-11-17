package bg1;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jlmebxxoox;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import igdgnonuha.weqkydbzbr;
import igdgnonuha.z;
import java.util.List;
import pj.cllcsxoeiz;
import yfnezrywwk.jpowsppfya;
import yfnezrywwk.mbcevpiqjq;
import yfnezrywwk.sopmlzcsov;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lqeggnwhkg {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ mbcevpiqjq f16158jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ag1.lqeggnwhkg f16159yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f16160zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(ag1.lqeggnwhkg lqeggnwhkgVar, mbcevpiqjq mbcevpiqjqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f16159yggfygwlhe = lqeggnwhkgVar;
            this.f16158jyumaefscl = mbcevpiqjqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f16159yggfygwlhe, this.f16158jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f16160zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (this.f16159yggfygwlhe.iobyxmoadg() == 1 && !this.f16159yggfygwlhe.zoijcleaow().isEmpty()) {
                    mbcevpiqjq mbcevpiqjqVar = this.f16158jyumaefscl;
                    this.f16160zdlpuopuiu = 1;
                    if (mbcevpiqjq.kegysxyocb(mbcevpiqjqVar, 0, 0, this, 2, null) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f16161zdlpuopuiu;

        public ppxfxbqfkf(List list) {
            this.f16161zdlpuopuiu = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            this.f16161zdlpuopuiu.get(i13);
            return null;
        }
    }

    public static final class wkgbmnqykc implements tg.oxmwwwfdhm {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f16162cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ ag1.lqeggnwhkg f16163esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f16164iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f16165jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f16166yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f16167zdlpuopuiu;

        public wkgbmnqykc(List list, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, tg.draadjrbmk draadjrbmkVar3, tg.draadjrbmk draadjrbmkVar4, ag1.lqeggnwhkg lqeggnwhkgVar) {
            this.f16167zdlpuopuiu = list;
            this.f16166yggfygwlhe = draadjrbmkVar;
            this.f16165jyumaefscl = draadjrbmkVar2;
            this.f16164iwizpuwonk = draadjrbmkVar3;
            this.f16162cqumvgiudr = draadjrbmkVar4;
            this.f16163esjtqupxsv = lqeggnwhkgVar;
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
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(2039820996, i15, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            dg1.wkgbmnqykc wkgbmnqykcVar = (dg1.wkgbmnqykc) this.f16167zdlpuopuiu.get(i13);
            draadjrbmkVar.sopmlzcsov(-1221609825);
            agtfadlqog.lqeggnwhkg(wkgbmnqykcVar, this.f16166yggfygwlhe, this.f16165jyumaefscl, this.f16164iwizpuwonk, this.f16162cqumvgiudr, null, draadjrbmkVar, 0, 32);
            draadjrbmkVar.sopmlzcsov(653338386);
            if (i13 < hg.jyumaefscl.ojitshcjhn(this.f16163esjtqupxsv.zoijcleaow())) {
                weqkydbzbr.zoijcleaow(null, l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVar, z.f44181zoijcleaow).rgvfuqvkyq(), w0.nufgyqmvbu.lqeggnwhkg(1), 0.0f, draadjrbmkVar, 384, 9);
            }
            draadjrbmkVar.stevsuqkhv();
            draadjrbmkVar.stevsuqkhv();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class zoijcleaow implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f16168yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f16169zdlpuopuiu;

        public zoijcleaow(tg.rgvfuqvkyq rgvfuqvkyqVar, List list) {
            this.f16169zdlpuopuiu = rgvfuqvkyqVar;
            this.f16168yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f16169zdlpuopuiu.invoke(Integer.valueOf(i13), this.f16168yggfygwlhe.get(i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(ag1.lqeggnwhkg lqeggnwhkgVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, tg.draadjrbmk draadjrbmkVar3, tg.draadjrbmk draadjrbmkVar4, jpowsppfya PaginationLazyColumn) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(PaginationLazyColumn, "$this$PaginationLazyColumn");
        List listZoijcleaow = lqeggnwhkgVar.zoijcleaow();
        PaginationLazyColumn.nufgyqmvbu(listZoijcleaow.size(), new zoijcleaow(new tg.rgvfuqvkyq() { // from class: bg1.gxszxtbevo
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return lqeggnwhkg.gxszxtbevo(((Integer) obj).intValue(), (dg1.wkgbmnqykc) obj2);
            }
        }, listZoijcleaow), new ppxfxbqfkf(listZoijcleaow), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(2039820996, true, new wkgbmnqykc(listZoijcleaow, draadjrbmkVar, draadjrbmkVar2, draadjrbmkVar3, draadjrbmkVar4, lqeggnwhkgVar)));
        if (lqeggnwhkgVar.ppxfxbqfkf()) {
            jpowsppfya.iobyxmoadg(PaginationLazyColumn, null, null, bg1.iobyxmoadg.f16146iobyxmoadg.iobyxmoadg(), 3, null);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object gxszxtbevo(int i13, dg1.wkgbmnqykc item) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        return item.zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(ag1.lqeggnwhkg lqeggnwhkgVar, tg.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, tg.draadjrbmk draadjrbmkVar3, tg.draadjrbmk draadjrbmkVar4, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar5, int i14) {
        wkgbmnqykc(lqeggnwhkgVar, iobyxmoadgVar, draadjrbmkVar, draadjrbmkVar2, draadjrbmkVar3, draadjrbmkVar4, draadjrbmkVar5, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void wkgbmnqykc(final ag1.lqeggnwhkg orderItems, final tg.iobyxmoadg onNextPage, final tg.draadjrbmk onOrderClick, final tg.draadjrbmk onCallClick, final tg.draadjrbmk onOrderNumberCopyClicked, final tg.draadjrbmk onRateOrderClick, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderItems, "orderItems");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onNextPage, "onNextPage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onOrderClick, "onOrderClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onCallClick, "onCallClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onOrderNumberCopyClicked, "onOrderNumberCopyClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onRateOrderClick, "onRateOrderClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1927001717);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(orderItems) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onNextPage) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onOrderClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onCallClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 24576) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onOrderNumberCopyClicked) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onRateOrderClick) ? 131072 : 65536;
        }
        int i15 = i14;
        if ((74899 & i15) == 74898 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1927001717, i15, -1, "ru.myspar.proloyalty.orders.impl.screens.orders.presentation.compose.OrdersContent (OrdersContent.kt:28)");
            }
            mbcevpiqjq mbcevpiqjqVarPpxfxbqfkf = sopmlzcsov.ppxfxbqfkf(0, 0, draadjrbmkVarBtonecajqb, 0, 3);
            Integer numValueOf = Integer.valueOf(orderItems.iobyxmoadg());
            draadjrbmkVarBtonecajqb.sopmlzcsov(-883700263);
            int i16 = i15 & 14;
            boolean zUlzqkzuiru = (i16 == 4) | draadjrbmkVarBtonecajqb.ulzqkzuiru(mbcevpiqjqVarPpxfxbqfkf);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(orderItems, mbcevpiqjqVarPpxfxbqfkf, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(numValueOf, (tg.rgvfuqvkyq) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 0);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, w0.nufgyqmvbu.lqeggnwhkg(8), 1, null);
            boolean zPpxfxbqfkf = orderItems.ppxfxbqfkf();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-883689398);
            boolean z13 = (i16 == 4) | ((i15 & 896) == 256) | ((i15 & 7168) == 2048) | ((57344 & i15) == 16384) | ((458752 & i15) == 131072);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                tg.draadjrbmk draadjrbmkVar3 = new tg.draadjrbmk() { // from class: bg1.wkgbmnqykc
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return lqeggnwhkg.eablkybsjg(orderItems, onOrderClick, onCallClick, onOrderNumberCopyClicked, onRateOrderClick, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar3);
                objYadqdtsiqt2 = draadjrbmkVar3;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            m41.wkgbmnqykc.wkgbmnqykc(wkgbmnqykcVarRgvfuqvkyq, zPpxfxbqfkf, 0, onNextPage, null, null, false, null, null, null, false, (tg.draadjrbmk) objYadqdtsiqt2, draadjrbmkVar2, ((i15 << 6) & 7168) | 6, 0, 2036);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: bg1.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lqeggnwhkg.lqeggnwhkg(orderItems, onNextPage, onOrderClick, onCallClick, onOrderNumberCopyClicked, onRateOrderClick, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
