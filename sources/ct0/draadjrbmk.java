package ct0;

import android.content.Context;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes5.dex */
public abstract class draadjrbmk {

    static final class iobyxmoadg implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f25715cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f25716esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f25717iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ czzsidtyhn.ydmasvzmpa f25718jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f25719yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ComposeView f25720zdlpuopuiu;

        /* JADX INFO: renamed from: ct0.draadjrbmk$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0452iobyxmoadg implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ tg.rgvfuqvkyq f25721cqumvgiudr;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ tg.draadjrbmk f25722iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ tg.draadjrbmk f25723jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ czzsidtyhn.ydmasvzmpa f25724yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ List f25725zdlpuopuiu;

            C0452iobyxmoadg(List list, czzsidtyhn.ydmasvzmpa ydmasvzmpaVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, tg.rgvfuqvkyq rgvfuqvkyqVar) {
                this.f25725zdlpuopuiu = list;
                this.f25724yggfygwlhe = ydmasvzmpaVar;
                this.f25723jyumaefscl = draadjrbmkVar;
                this.f25722iwizpuwonk = draadjrbmkVar2;
                this.f25721cqumvgiudr = rgvfuqvkyqVar;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                    draadjrbmkVar.hkdspvbjdz();
                    return;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(607967573, i13, -1, "ru.myspar.proloyalty.common.view.product.compose.list.vertical.drawComboSetBlock.<anonymous>.<anonymous> (ProductComboSetBlock.kt:53)");
                }
                draadjrbmk.lqeggnwhkg(this.f25725zdlpuopuiu, this.f25724yggfygwlhe, this.f25723jyumaefscl, this.f25722iwizpuwonk, this.f25721cqumvgiudr, draadjrbmkVar, 0);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            }
        }

        iobyxmoadg(ComposeView composeView, List list, czzsidtyhn.ydmasvzmpa ydmasvzmpaVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, tg.rgvfuqvkyq rgvfuqvkyqVar) {
            this.f25720zdlpuopuiu = composeView;
            this.f25719yggfygwlhe = list;
            this.f25718jyumaefscl = ydmasvzmpaVar;
            this.f25717iwizpuwonk = draadjrbmkVar;
            this.f25715cqumvgiudr = draadjrbmkVar2;
            this.f25716esjtqupxsv = rgvfuqvkyqVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(738365306, i13, -1, "ru.myspar.proloyalty.common.view.product.compose.list.vertical.drawComboSetBlock.<anonymous> (ProductComboSetBlock.kt:52)");
            }
            Context context = this.f25720zdlpuopuiu.getContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            l41.zoijcleaow.zoijcleaow(p41.ppxfxbqfkf.eablkybsjg(context) ? l41.nufgyqmvbu.Dark : l41.nufgyqmvbu.Light, ezmngbhpjk.nufgyqmvbu.eablkybsjg(607967573, true, new C0452iobyxmoadg(this.f25719yggfygwlhe, this.f25718jyumaefscl, this.f25717iwizpuwonk, this.f25715cqumvgiudr, this.f25716esjtqupxsv), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final void agtfadlqog(ComposeView composeView, List comboSetList, czzsidtyhn.ydmasvzmpa contentPadding, tg.draadjrbmk onClickShowAll, tg.draadjrbmk onAddToBasket, tg.rgvfuqvkyq onClickProduct) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(composeView, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetList, "comboSetList");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(contentPadding, "contentPadding");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClickShowAll, "onClickShowAll");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onAddToBasket, "onAddToBasket");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClickProduct, "onClickProduct");
        try {
            composeView.setViewCompositionStrategy(s.zoijcleaow.f7058zoijcleaow);
            composeView.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(738365306, true, new iobyxmoadg(composeView, comboSetList, contentPadding, onClickShowAll, onAddToBasket, onClickProduct)));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn btonecajqb(tg.draadjrbmk draadjrbmkVar, kt0.iobyxmoadg iobyxmoadgVar) {
        draadjrbmkVar.invoke(iobyxmoadgVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn draadjrbmk(tg.draadjrbmk draadjrbmkVar, kt0.iobyxmoadg combo) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(combo, "combo");
        draadjrbmkVar.invoke(combo);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn dxjokdxxww(List list, czzsidtyhn.ydmasvzmpa ydmasvzmpaVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar3, int i14) {
        lqeggnwhkg(list, ydmasvzmpaVar, draadjrbmkVar, draadjrbmkVar2, rgvfuqvkyqVar, draadjrbmkVar3, f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(tg.draadjrbmk draadjrbmkVar, kt0.iobyxmoadg iobyxmoadgVar) {
        draadjrbmkVar.invoke(iobyxmoadgVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void lqeggnwhkg(final List comboSetList, final czzsidtyhn.ydmasvzmpa contentPadding, final tg.draadjrbmk onClickShowAll, final tg.draadjrbmk onAddToBasket, final tg.rgvfuqvkyq onClickProduct, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetList, "comboSetList");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(contentPadding, "contentPadding");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClickShowAll, "onClickShowAll");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onAddToBasket, "onAddToBasket");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClickProduct, "onClickProduct");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-995250606);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(comboSetList) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(contentPadding) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClickShowAll) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onAddToBasket) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 24576) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClickProduct) ? 16384 : 8192;
        }
        if ((i14 & 9363) == 9362 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-995250606, i14, -1, "ru.myspar.proloyalty.common.view.product.compose.list.vertical.ProductComboSetBlock (ProductComboSetBlock.kt:21)");
            }
            if (comboSetList.size() == 1) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1817462062);
                final kt0.iobyxmoadg iobyxmoadgVar = (kt0.iobyxmoadg) hg.jyumaefscl.opjhrmiecq(comboSetList);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarDraadjrbmk = androidx.compose.foundation.layout.esjtqupxsv.draadjrbmk(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, contentPadding);
                draadjrbmkVarBtonecajqb.sopmlzcsov(495567557);
                boolean zUlzqkzuiru = ((57344 & i14) == 16384) | draadjrbmkVarBtonecajqb.ulzqkzuiru(iobyxmoadgVar);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ct0.gxszxtbevo
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return draadjrbmk.nufgyqmvbu(onClickProduct, iobyxmoadgVar, (ComboSetProduct) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tg.draadjrbmk draadjrbmkVar2 = (tg.draadjrbmk) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(495569722);
                boolean zUlzqkzuiru2 = ((i14 & 7168) == 2048) | draadjrbmkVarBtonecajqb.ulzqkzuiru(iobyxmoadgVar);
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ct0.lqeggnwhkg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return draadjrbmk.btonecajqb(onAddToBasket, iobyxmoadgVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                tg.iobyxmoadg iobyxmoadgVar2 = (tg.iobyxmoadg) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(495571579);
                boolean zUlzqkzuiru3 = draadjrbmkVarBtonecajqb.ulzqkzuiru(iobyxmoadgVar) | ((i14 & 896) == 256);
                Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru3 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: ct0.nufgyqmvbu
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return draadjrbmk.gtknphoqwx(onClickShowAll, iobyxmoadgVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                czzsidtyhn.lqeggnwhkg(wkgbmnqykcVarDraadjrbmk, iobyxmoadgVar, draadjrbmkVar2, iobyxmoadgVar2, (tg.iobyxmoadg) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, 0, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1817092387);
                draadjrbmkVarBtonecajqb.sopmlzcsov(495579328);
                boolean z13 = (i14 & 7168) == 2048;
                Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: ct0.dxjokdxxww
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return draadjrbmk.draadjrbmk(onAddToBasket, (kt0.iobyxmoadg) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                tg.draadjrbmk draadjrbmkVar3 = (tg.draadjrbmk) objYadqdtsiqt4;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(495581365);
                boolean z14 = (i14 & 896) == 256;
                Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14 || objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.draadjrbmk() { // from class: ct0.btonecajqb
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return draadjrbmk.wflxmlrfwp(onClickShowAll, (kt0.iobyxmoadg) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jhduphickx.agtfadlqog(null, comboSetList, contentPadding, onClickProduct, draadjrbmkVar3, (tg.draadjrbmk) objYadqdtsiqt5, draadjrbmkVarBtonecajqb, ((i14 << 3) & 1008) | ((i14 >> 3) & 7168), 1);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ct0.gtknphoqwx
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return draadjrbmk.dxjokdxxww(comboSetList, contentPadding, onClickShowAll, onAddToBasket, onClickProduct, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn nufgyqmvbu(tg.rgvfuqvkyq rgvfuqvkyqVar, kt0.iobyxmoadg iobyxmoadgVar, ComboSetProduct it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        rgvfuqvkyqVar.invoke(iobyxmoadgVar.vdvldrhtss(), it);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wflxmlrfwp(tg.draadjrbmk draadjrbmkVar, kt0.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.invoke(it);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
