package v40;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.ntlheqmsrt;
import androidx.compose.runtime.ulzqkzuiru;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.jpowsppfya;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;

/* JADX INFO: loaded from: classes4.dex */
public abstract class oxmwwwfdhm {

    public static final class iobyxmoadg implements ntlheqmsrt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ FragmentManager f116029iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ zdlpuopuiu f116030ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ Fragment f116031zoijcleaow;

        public iobyxmoadg(FragmentManager fragmentManager, Fragment fragment, zdlpuopuiu zdlpuopuiuVar) {
            this.f116029iobyxmoadg = fragmentManager;
            this.f116031zoijcleaow = fragment;
            this.f116030ppxfxbqfkf = zdlpuopuiuVar;
        }

        @Override // androidx.compose.runtime.ntlheqmsrt
        public void iobyxmoadg() {
            this.f116030ppxfxbqfkf.iobyxmoadg().setValue(this.f116029iobyxmoadg.N(this.f116031zoijcleaow));
            jpowsppfya jpowsppfyaVarKcexrzcfyt = this.f116029iobyxmoadg.kcexrzcfyt();
            jpowsppfyaVarKcexrzcfyt.rgvfuqvkyq(this.f116031zoijcleaow);
            jpowsppfyaVarKcexrzcfyt.draadjrbmk();
        }
    }

    public static final zdlpuopuiu agtfadlqog(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        draadjrbmkVar.sopmlzcsov(-1999556505);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1999556505, i13, -1, "ru.myspar.core.ui.compose.components.rememberFragmentState (CustomAndroidFragment.kt:104)");
        }
        Object[] objArr = new Object[0];
        rhgxfdycjh.jyumaefscl jyumaefsclVarGtknphoqwx = gtknphoqwx();
        draadjrbmkVar.sopmlzcsov(-1827081941);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new tg.iobyxmoadg() { // from class: v40.draadjrbmk
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return oxmwwwfdhm.ojitshcjhn();
                }
            };
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        draadjrbmkVar.stevsuqkhv();
        zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) rhgxfdycjh.wkgbmnqykc.eablkybsjg(objArr, jyumaefsclVarGtknphoqwx, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, 384);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return zdlpuopuiuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ntlheqmsrt btonecajqb(FragmentManager fragmentManager, kcexrzcfyt kcexrzcfytVar, Context context, Class cls, i1 i1Var, zdlpuopuiu zdlpuopuiuVar, Bundle bundle, int i13, ulzqkzuiru DisposableEffect) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(DisposableEffect, "$this$DisposableEffect");
        Fragment fragmentZfvoamnweg = fragmentManager.zfvoamnweg(kcexrzcfytVar.iobyxmoadg().getId());
        if (fragmentZfvoamnweg == null) {
            fragmentZfvoamnweg = fragmentManager.dvvnrvtcbc().iobyxmoadg(context.getClassLoader(), cls.getName());
            fragmentZfvoamnweg.setInitialSavedState((Fragment.SavedState) zdlpuopuiuVar.iobyxmoadg().getValue());
            fragmentZfvoamnweg.setArguments(bundle);
            fragmentManager.kcexrzcfyt().iwizpuwonk(true).wkgbmnqykc(kcexrzcfytVar.iobyxmoadg(), fragmentZfvoamnweg, String.valueOf(i13)).draadjrbmk();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(fragmentZfvoamnweg, "apply(...)");
        }
        fragmentManager.p(kcexrzcfytVar.iobyxmoadg());
        ((tg.draadjrbmk) i1Var.getValue()).invoke(fragmentZfvoamnweg);
        return new iobyxmoadg(fragmentManager, fragmentZfvoamnweg, zdlpuopuiuVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iwxlajgraz draadjrbmk(rhgxfdycjh.lereixgezr Saver, zdlpuopuiu it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(Saver, "$this$Saver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return it.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(Fragment it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final rhgxfdycjh.jyumaefscl gtknphoqwx() {
        return rhgxfdycjh.esjtqupxsv.eablkybsjg(new tg.rgvfuqvkyq() { // from class: v40.rgvfuqvkyq
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return oxmwwwfdhm.draadjrbmk((rhgxfdycjh.lereixgezr) obj, (zdlpuopuiu) obj2);
            }
        }, new tg.draadjrbmk() { // from class: v40.vdvldrhtss
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return oxmwwwfdhm.wflxmlrfwp((iwxlajgraz) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:116:0x0220  */
    /* JADX WARN: Code duplicated, block: B:120:0x022e  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x0108  */
    /* JADX WARN: Code duplicated, block: B:90:0x0116  */
    /* JADX WARN: Code duplicated, block: B:93:0x0142  */
    /* JADX WARN: Code duplicated, block: B:95:0x014a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0177  */
    public static final void lqeggnwhkg(final Class clazz, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, zdlpuopuiu zdlpuopuiuVar, Bundle bundle, tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        zdlpuopuiu zdlpuopuiuVar2;
        int i16;
        Bundle bundle2;
        int i17;
        int i18;
        tg.draadjrbmk draadjrbmkVar3;
        int i19;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        zdlpuopuiu zdlpuopuiuVarAgtfadlqog;
        Bundle bundle3;
        int i23;
        zdlpuopuiu zdlpuopuiuVar3;
        Bundle bundle4;
        tg.draadjrbmk draadjrbmkVar4;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        Object objYadqdtsiqt;
        final i1 i1VarAgtfadlqog;
        final int iIobyxmoadg;
        View view;
        boolean zUlzqkzuiru;
        Object objYadqdtsiqt2;
        final FragmentManager fragmentManager;
        final Context context;
        Object objYadqdtsiqt3;
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar;
        final kcexrzcfyt kcexrzcfytVar;
        Object[] objArr;
        boolean zLmojexxdyd;
        Object objYadqdtsiqt4;
        Object[] objArr2;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5;
        final zdlpuopuiu zdlpuopuiuVar4;
        final Bundle bundle5;
        final tg.draadjrbmk draadjrbmkVar5;
        a0 a0VarWflxmlrfwp;
        int i24;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clazz, "clazz");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-1434364569);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if ((i14 & 4) == 0) {
                    zdlpuopuiuVar2 = zdlpuopuiuVar;
                    if (draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar2)) {
                        i24 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    }
                    i15 |= i24;
                } else {
                    zdlpuopuiuVar2 = zdlpuopuiuVar;
                }
                i24 = UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 |= i24;
            } else {
                zdlpuopuiuVar2 = zdlpuopuiuVar;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    bundle2 = bundle;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(bundle2)) {
                        i17 = 2048;
                    } else {
                        i17 = UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        draadjrbmkVar3 = draadjrbmkVar;
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 9363) == 9362 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                        draadjrbmkVarBtonecajqb.wwaezpbzkn();
                        if ((i13 & 1) != 0 || draadjrbmkVarBtonecajqb.dsvhmnatus()) {
                            if (i25 != 0) {
                                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                            } else {
                                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                            }
                            if ((i14 & 4) != 0) {
                                zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                                i15 &= -897;
                            } else {
                                zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                            }
                            if (i16 != 0) {
                                bundle3 = Bundle.EMPTY;
                            } else {
                                bundle3 = bundle2;
                            }
                            if (i18 != 0) {
                                draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                        @Override // tg.draadjrbmk
                                        public final Object invoke(Object obj) {
                                            return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                        }
                                    };
                                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                                }
                                draadjrbmkVarBtonecajqb.stevsuqkhv();
                                i23 = i15;
                                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                                zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                                bundle4 = bundle3;
                                draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                            } else {
                                i23 = i15;
                                zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                                bundle4 = bundle3;
                                draadjrbmkVar4 = draadjrbmkVar3;
                                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                            }
                        } else {
                            draadjrbmkVarBtonecajqb.hkdspvbjdz();
                            if ((i14 & 4) != 0) {
                                i15 &= -897;
                            }
                            zdlpuopuiuVar3 = zdlpuopuiuVar2;
                            bundle4 = bundle2;
                            draadjrbmkVar4 = draadjrbmkVar3;
                            i23 = i15;
                            wkgbmnqykcVar4 = wkgbmnqykcVar2;
                        }
                        draadjrbmkVarBtonecajqb.esjtqupxsv();
                        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1434364569, i23, -1, "ru.myspar.core.ui.compose.components.CustomAndroidFragment (CustomAndroidFragment.kt:48)");
                        }
                        i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i23 >> 12) & 14);
                        iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                        view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-322333746);
                        zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view);
                        objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (zUlzqkzuiru || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                        }
                        fragmentManager = (FragmentManager) objYadqdtsiqt2;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fragmentManager);
                        context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-322329320);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                        if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                            objYadqdtsiqt3 = new kcexrzcfyt(iIobyxmoadg);
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        kcexrzcfytVar = (kcexrzcfyt) objYadqdtsiqt3;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        tg.draadjrbmk draadjrbmkVar6 = draadjrbmkVar4;
                        int i26 = i23;
                        androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(kcexrzcfytVar, wkgbmnqykcVar4, null, draadjrbmkVarBtonecajqb, i23 & 112, 4);
                        objArr = new Object[]{fragmentManager, kcexrzcfytVar, clazz, zdlpuopuiuVar3};
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-322322428);
                        zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(fragmentManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(kcexrzcfytVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(context) | draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) | ((((i26 & 896) ^ 384) <= 256 && draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar3)) || (i26 & 384) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(bundle4) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIobyxmoadg) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                        objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (!zLmojexxdyd || objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
                            final zdlpuopuiu zdlpuopuiuVar5 = zdlpuopuiuVar3;
                            objArr2 = objArr;
                            final Bundle bundle6 = bundle4;
                            tg.draadjrbmk draadjrbmkVar7 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar5, bundle6, iIobyxmoadg, (ulzqkzuiru) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar7);
                            objYadqdtsiqt4 = draadjrbmkVar7;
                        } else {
                            objArr2 = objArr;
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        jlmebxxoox.ppxfxbqfkf(objArr2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
                        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                        }
                        wkgbmnqykcVar5 = wkgbmnqykcVar4;
                        zdlpuopuiuVar4 = zdlpuopuiuVar3;
                        bundle5 = bundle4;
                        draadjrbmkVar5 = draadjrbmkVar6;
                    } else {
                        draadjrbmkVarBtonecajqb.hkdspvbjdz();
                        wkgbmnqykcVar5 = wkgbmnqykcVar2;
                        zdlpuopuiuVar4 = zdlpuopuiuVar2;
                        bundle5 = bundle2;
                        draadjrbmkVar5 = draadjrbmkVar3;
                    }
                    a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                    if (a0VarWflxmlrfwp != null) {
                        a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: v40.ojitshcjhn
                            @Override // tg.rgvfuqvkyq
                            public final Object invoke(Object obj, Object obj2) {
                                return oxmwwwfdhm.nufgyqmvbu(clazz, wkgbmnqykcVar5, zdlpuopuiuVar4, bundle5, draadjrbmkVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 24576;
                draadjrbmkVar3 = draadjrbmkVar;
                if ((i15 & 9363) == 9362) {
                    draadjrbmkVarBtonecajqb.wwaezpbzkn();
                    if ((i13 & 1) != 0) {
                        if (i25 != 0) {
                            wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                            i15 &= -897;
                        } else {
                            zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                        }
                        if (i16 != 0) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        if (i18 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                    @Override // tg.draadjrbmk
                                    public final Object invoke(Object obj) {
                                        return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            i23 = i15;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                        } else {
                            i23 = i15;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = draadjrbmkVar3;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        }
                    } else {
                        if (i25 != 0) {
                            wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                            i15 &= -897;
                        } else {
                            zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                        }
                        if (i16 != 0) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        if (i18 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                    @Override // tg.draadjrbmk
                                    public final Object invoke(Object obj) {
                                        return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            i23 = i15;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                        } else {
                            i23 = i15;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = draadjrbmkVar3;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        }
                    }
                    draadjrbmkVarBtonecajqb.esjtqupxsv();
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1434364569, i23, -1, "ru.myspar.core.ui.compose.components.CustomAndroidFragment (CustomAndroidFragment.kt:48)");
                    }
                    i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i23 >> 12) & 14);
                    iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                    view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322333746);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    fragmentManager = (FragmentManager) objYadqdtsiqt2;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fragmentManager);
                    context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322329320);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt3 = new kcexrzcfyt(iIobyxmoadg);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    kcexrzcfytVar = (kcexrzcfyt) objYadqdtsiqt3;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    tg.draadjrbmk draadjrbmkVar8 = draadjrbmkVar4;
                    int i27 = i23;
                    androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(kcexrzcfytVar, wkgbmnqykcVar4, null, draadjrbmkVarBtonecajqb, i23 & 112, 4);
                    objArr = new Object[]{fragmentManager, kcexrzcfytVar, clazz, zdlpuopuiuVar3};
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322322428);
                    zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(fragmentManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(kcexrzcfytVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(context) | draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) | ((((i27 & 896) ^ 384) <= 256 && draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar3)) || (i27 & 384) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(bundle4) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIobyxmoadg) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zLmojexxdyd) {
                        final zdlpuopuiu zdlpuopuiuVar6 = zdlpuopuiuVar3;
                        objArr2 = objArr;
                        final Bundle bundle7 = bundle4;
                        tg.draadjrbmk draadjrbmkVar9 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar6, bundle7, iIobyxmoadg, (ulzqkzuiru) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar9);
                        objYadqdtsiqt4 = draadjrbmkVar9;
                    } else {
                        final zdlpuopuiu zdlpuopuiuVar7 = zdlpuopuiuVar3;
                        objArr2 = objArr;
                        final Bundle bundle8 = bundle4;
                        tg.draadjrbmk draadjrbmkVar10 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar7, bundle8, iIobyxmoadg, (ulzqkzuiru) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar10);
                        objYadqdtsiqt4 = draadjrbmkVar10;
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.ppxfxbqfkf(objArr2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar5 = wkgbmnqykcVar4;
                    zdlpuopuiuVar4 = zdlpuopuiuVar3;
                    bundle5 = bundle4;
                    draadjrbmkVar5 = draadjrbmkVar8;
                } else {
                    draadjrbmkVarBtonecajqb.wwaezpbzkn();
                    if ((i13 & 1) != 0) {
                        if (i25 != 0) {
                            wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                            i15 &= -897;
                        } else {
                            zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                        }
                        if (i16 != 0) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        if (i18 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                    @Override // tg.draadjrbmk
                                    public final Object invoke(Object obj) {
                                        return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            i23 = i15;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                        } else {
                            i23 = i15;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = draadjrbmkVar3;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        }
                    } else {
                        if (i25 != 0) {
                            wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                            i15 &= -897;
                        } else {
                            zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                        }
                        if (i16 != 0) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        if (i18 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                    @Override // tg.draadjrbmk
                                    public final Object invoke(Object obj) {
                                        return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            i23 = i15;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                        } else {
                            i23 = i15;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = draadjrbmkVar3;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        }
                    }
                    draadjrbmkVarBtonecajqb.esjtqupxsv();
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1434364569, i23, -1, "ru.myspar.core.ui.compose.components.CustomAndroidFragment (CustomAndroidFragment.kt:48)");
                    }
                    i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i23 >> 12) & 14);
                    iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                    view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322333746);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    fragmentManager = (FragmentManager) objYadqdtsiqt2;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fragmentManager);
                    context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322329320);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt3 = new kcexrzcfyt(iIobyxmoadg);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    kcexrzcfytVar = (kcexrzcfyt) objYadqdtsiqt3;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    tg.draadjrbmk draadjrbmkVar11 = draadjrbmkVar4;
                    int i28 = i23;
                    androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(kcexrzcfytVar, wkgbmnqykcVar4, null, draadjrbmkVarBtonecajqb, i23 & 112, 4);
                    objArr = new Object[]{fragmentManager, kcexrzcfytVar, clazz, zdlpuopuiuVar3};
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322322428);
                    zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(fragmentManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(kcexrzcfytVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(context) | draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) | ((((i28 & 896) ^ 384) <= 256 && draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar3)) || (i28 & 384) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(bundle4) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIobyxmoadg) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zLmojexxdyd) {
                        final zdlpuopuiu zdlpuopuiuVar8 = zdlpuopuiuVar3;
                        objArr2 = objArr;
                        final Bundle bundle9 = bundle4;
                        tg.draadjrbmk draadjrbmkVar12 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar8, bundle9, iIobyxmoadg, (ulzqkzuiru) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar12);
                        objYadqdtsiqt4 = draadjrbmkVar12;
                    } else {
                        final zdlpuopuiu zdlpuopuiuVar9 = zdlpuopuiuVar3;
                        objArr2 = objArr;
                        final Bundle bundle10 = bundle4;
                        tg.draadjrbmk draadjrbmkVar13 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar9, bundle10, iIobyxmoadg, (ulzqkzuiru) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar13);
                        objYadqdtsiqt4 = draadjrbmkVar13;
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.ppxfxbqfkf(objArr2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar5 = wkgbmnqykcVar4;
                    zdlpuopuiuVar4 = zdlpuopuiuVar3;
                    bundle5 = bundle4;
                    draadjrbmkVar5 = draadjrbmkVar11;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: v40.ojitshcjhn
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return oxmwwwfdhm.nufgyqmvbu(clazz, wkgbmnqykcVar5, zdlpuopuiuVar4, bundle5, draadjrbmkVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 3072;
            bundle2 = bundle;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    draadjrbmkVar3 = draadjrbmkVar;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) == 9362) {
                    draadjrbmkVarBtonecajqb.wwaezpbzkn();
                    if ((i13 & 1) != 0) {
                        if (i25 != 0) {
                            wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                            i15 &= -897;
                        } else {
                            zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                        }
                        if (i16 != 0) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        if (i18 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                    @Override // tg.draadjrbmk
                                    public final Object invoke(Object obj) {
                                        return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            i23 = i15;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                        } else {
                            i23 = i15;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = draadjrbmkVar3;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        }
                    } else {
                        if (i25 != 0) {
                            wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                            i15 &= -897;
                        } else {
                            zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                        }
                        if (i16 != 0) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        if (i18 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                    @Override // tg.draadjrbmk
                                    public final Object invoke(Object obj) {
                                        return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            i23 = i15;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                        } else {
                            i23 = i15;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = draadjrbmkVar3;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        }
                    }
                    draadjrbmkVarBtonecajqb.esjtqupxsv();
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1434364569, i23, -1, "ru.myspar.core.ui.compose.components.CustomAndroidFragment (CustomAndroidFragment.kt:48)");
                    }
                    i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i23 >> 12) & 14);
                    iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                    view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322333746);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    fragmentManager = (FragmentManager) objYadqdtsiqt2;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fragmentManager);
                    context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322329320);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt3 = new kcexrzcfyt(iIobyxmoadg);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    kcexrzcfytVar = (kcexrzcfyt) objYadqdtsiqt3;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    tg.draadjrbmk draadjrbmkVar14 = draadjrbmkVar4;
                    int i29 = i23;
                    androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(kcexrzcfytVar, wkgbmnqykcVar4, null, draadjrbmkVarBtonecajqb, i23 & 112, 4);
                    objArr = new Object[]{fragmentManager, kcexrzcfytVar, clazz, zdlpuopuiuVar3};
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322322428);
                    zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(fragmentManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(kcexrzcfytVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(context) | draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) | ((((i29 & 896) ^ 384) <= 256 && draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar3)) || (i29 & 384) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(bundle4) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIobyxmoadg) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zLmojexxdyd) {
                        final zdlpuopuiu zdlpuopuiuVar10 = zdlpuopuiuVar3;
                        objArr2 = objArr;
                        final Bundle bundle11 = bundle4;
                        tg.draadjrbmk draadjrbmkVar15 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar10, bundle11, iIobyxmoadg, (ulzqkzuiru) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar15);
                        objYadqdtsiqt4 = draadjrbmkVar15;
                    } else {
                        final zdlpuopuiu zdlpuopuiuVar11 = zdlpuopuiuVar3;
                        objArr2 = objArr;
                        final Bundle bundle12 = bundle4;
                        tg.draadjrbmk draadjrbmkVar16 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar11, bundle12, iIobyxmoadg, (ulzqkzuiru) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar16);
                        objYadqdtsiqt4 = draadjrbmkVar16;
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.ppxfxbqfkf(objArr2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar5 = wkgbmnqykcVar4;
                    zdlpuopuiuVar4 = zdlpuopuiuVar3;
                    bundle5 = bundle4;
                    draadjrbmkVar5 = draadjrbmkVar14;
                } else {
                    draadjrbmkVarBtonecajqb.wwaezpbzkn();
                    if ((i13 & 1) != 0) {
                        if (i25 != 0) {
                            wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                            i15 &= -897;
                        } else {
                            zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                        }
                        if (i16 != 0) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        if (i18 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                    @Override // tg.draadjrbmk
                                    public final Object invoke(Object obj) {
                                        return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            i23 = i15;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                        } else {
                            i23 = i15;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = draadjrbmkVar3;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        }
                    } else {
                        if (i25 != 0) {
                            wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                            i15 &= -897;
                        } else {
                            zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                        }
                        if (i16 != 0) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        if (i18 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                    @Override // tg.draadjrbmk
                                    public final Object invoke(Object obj) {
                                        return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            i23 = i15;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                        } else {
                            i23 = i15;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = draadjrbmkVar3;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        }
                    }
                    draadjrbmkVarBtonecajqb.esjtqupxsv();
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1434364569, i23, -1, "ru.myspar.core.ui.compose.components.CustomAndroidFragment (CustomAndroidFragment.kt:48)");
                    }
                    i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i23 >> 12) & 14);
                    iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                    view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322333746);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    fragmentManager = (FragmentManager) objYadqdtsiqt2;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fragmentManager);
                    context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322329320);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt3 = new kcexrzcfyt(iIobyxmoadg);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    kcexrzcfytVar = (kcexrzcfyt) objYadqdtsiqt3;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    tg.draadjrbmk draadjrbmkVar17 = draadjrbmkVar4;
                    int i210 = i23;
                    androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(kcexrzcfytVar, wkgbmnqykcVar4, null, draadjrbmkVarBtonecajqb, i23 & 112, 4);
                    objArr = new Object[]{fragmentManager, kcexrzcfytVar, clazz, zdlpuopuiuVar3};
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322322428);
                    zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(fragmentManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(kcexrzcfytVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(context) | draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) | ((((i210 & 896) ^ 384) <= 256 && draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar3)) || (i210 & 384) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(bundle4) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIobyxmoadg) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zLmojexxdyd) {
                        final zdlpuopuiu zdlpuopuiuVar12 = zdlpuopuiuVar3;
                        objArr2 = objArr;
                        final Bundle bundle13 = bundle4;
                        tg.draadjrbmk draadjrbmkVar18 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar12, bundle13, iIobyxmoadg, (ulzqkzuiru) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar18);
                        objYadqdtsiqt4 = draadjrbmkVar18;
                    } else {
                        final zdlpuopuiu zdlpuopuiuVar13 = zdlpuopuiuVar3;
                        objArr2 = objArr;
                        final Bundle bundle14 = bundle4;
                        tg.draadjrbmk draadjrbmkVar19 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar13, bundle14, iIobyxmoadg, (ulzqkzuiru) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar19);
                        objYadqdtsiqt4 = draadjrbmkVar19;
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.ppxfxbqfkf(objArr2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar5 = wkgbmnqykcVar4;
                    zdlpuopuiuVar4 = zdlpuopuiuVar3;
                    bundle5 = bundle4;
                    draadjrbmkVar5 = draadjrbmkVar17;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: v40.ojitshcjhn
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return oxmwwwfdhm.nufgyqmvbu(clazz, wkgbmnqykcVar5, zdlpuopuiuVar4, bundle5, draadjrbmkVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 24576;
            draadjrbmkVar3 = draadjrbmkVar;
            if ((i15 & 9363) == 9362) {
                draadjrbmkVarBtonecajqb.wwaezpbzkn();
                if ((i13 & 1) != 0) {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                        i15 &= -897;
                    } else {
                        zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                    }
                    if (i16 != 0) {
                        bundle3 = Bundle.EMPTY;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        i23 = i15;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        i23 = i15;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = draadjrbmkVar3;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    }
                } else {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                        i15 &= -897;
                    } else {
                        zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                    }
                    if (i16 != 0) {
                        bundle3 = Bundle.EMPTY;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        i23 = i15;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        i23 = i15;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = draadjrbmkVar3;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    }
                }
                draadjrbmkVarBtonecajqb.esjtqupxsv();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1434364569, i23, -1, "ru.myspar.core.ui.compose.components.CustomAndroidFragment (CustomAndroidFragment.kt:48)");
                }
                i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i23 >> 12) & 14);
                iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322333746);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                fragmentManager = (FragmentManager) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fragmentManager);
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322329320);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt3 = new kcexrzcfyt(iIobyxmoadg);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                kcexrzcfytVar = (kcexrzcfyt) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.draadjrbmk draadjrbmkVar110 = draadjrbmkVar4;
                int i211 = i23;
                androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(kcexrzcfytVar, wkgbmnqykcVar4, null, draadjrbmkVarBtonecajqb, i23 & 112, 4);
                objArr = new Object[]{fragmentManager, kcexrzcfytVar, clazz, zdlpuopuiuVar3};
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322322428);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(fragmentManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(kcexrzcfytVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(context) | draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) | ((((i211 & 896) ^ 384) <= 256 && draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar3)) || (i211 & 384) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(bundle4) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIobyxmoadg) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd) {
                    final zdlpuopuiu zdlpuopuiuVar14 = zdlpuopuiuVar3;
                    objArr2 = objArr;
                    final Bundle bundle15 = bundle4;
                    tg.draadjrbmk draadjrbmkVar111 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar14, bundle15, iIobyxmoadg, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar111);
                    objYadqdtsiqt4 = draadjrbmkVar111;
                } else {
                    final zdlpuopuiu zdlpuopuiuVar15 = zdlpuopuiuVar3;
                    objArr2 = objArr;
                    final Bundle bundle16 = bundle4;
                    tg.draadjrbmk draadjrbmkVar112 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar15, bundle16, iIobyxmoadg, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar112);
                    objYadqdtsiqt4 = draadjrbmkVar112;
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.ppxfxbqfkf(objArr2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar5 = wkgbmnqykcVar4;
                zdlpuopuiuVar4 = zdlpuopuiuVar3;
                bundle5 = bundle4;
                draadjrbmkVar5 = draadjrbmkVar110;
            } else {
                draadjrbmkVarBtonecajqb.wwaezpbzkn();
                if ((i13 & 1) != 0) {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                        i15 &= -897;
                    } else {
                        zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                    }
                    if (i16 != 0) {
                        bundle3 = Bundle.EMPTY;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        i23 = i15;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        i23 = i15;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = draadjrbmkVar3;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    }
                } else {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                        i15 &= -897;
                    } else {
                        zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                    }
                    if (i16 != 0) {
                        bundle3 = Bundle.EMPTY;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        i23 = i15;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        i23 = i15;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = draadjrbmkVar3;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    }
                }
                draadjrbmkVarBtonecajqb.esjtqupxsv();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1434364569, i23, -1, "ru.myspar.core.ui.compose.components.CustomAndroidFragment (CustomAndroidFragment.kt:48)");
                }
                i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i23 >> 12) & 14);
                iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322333746);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                fragmentManager = (FragmentManager) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fragmentManager);
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322329320);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt3 = new kcexrzcfyt(iIobyxmoadg);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                kcexrzcfytVar = (kcexrzcfyt) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.draadjrbmk draadjrbmkVar113 = draadjrbmkVar4;
                int i212 = i23;
                androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(kcexrzcfytVar, wkgbmnqykcVar4, null, draadjrbmkVarBtonecajqb, i23 & 112, 4);
                objArr = new Object[]{fragmentManager, kcexrzcfytVar, clazz, zdlpuopuiuVar3};
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322322428);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(fragmentManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(kcexrzcfytVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(context) | draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) | ((((i212 & 896) ^ 384) <= 256 && draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar3)) || (i212 & 384) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(bundle4) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIobyxmoadg) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd) {
                    final zdlpuopuiu zdlpuopuiuVar16 = zdlpuopuiuVar3;
                    objArr2 = objArr;
                    final Bundle bundle17 = bundle4;
                    tg.draadjrbmk draadjrbmkVar114 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar16, bundle17, iIobyxmoadg, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar114);
                    objYadqdtsiqt4 = draadjrbmkVar114;
                } else {
                    final zdlpuopuiu zdlpuopuiuVar17 = zdlpuopuiuVar3;
                    objArr2 = objArr;
                    final Bundle bundle18 = bundle4;
                    tg.draadjrbmk draadjrbmkVar115 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar17, bundle18, iIobyxmoadg, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar115);
                    objYadqdtsiqt4 = draadjrbmkVar115;
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.ppxfxbqfkf(objArr2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar5 = wkgbmnqykcVar4;
                zdlpuopuiuVar4 = zdlpuopuiuVar3;
                bundle5 = bundle4;
                draadjrbmkVar5 = draadjrbmkVar113;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: v40.ojitshcjhn
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return oxmwwwfdhm.nufgyqmvbu(clazz, wkgbmnqykcVar5, zdlpuopuiuVar4, bundle5, draadjrbmkVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                zdlpuopuiuVar2 = zdlpuopuiuVar;
                if (draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar2)) {
                    i24 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                }
                i15 |= i24;
            } else {
                zdlpuopuiuVar2 = zdlpuopuiuVar;
            }
            i24 = UserVerificationMethods.USER_VERIFY_PATTERN;
            i15 |= i24;
        } else {
            zdlpuopuiuVar2 = zdlpuopuiuVar;
        }
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                bundle2 = bundle;
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(bundle2)) {
                    i17 = 2048;
                } else {
                    i17 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    draadjrbmkVar3 = draadjrbmkVar;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) == 9362) {
                    draadjrbmkVarBtonecajqb.wwaezpbzkn();
                    if ((i13 & 1) != 0) {
                        if (i25 != 0) {
                            wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                            i15 &= -897;
                        } else {
                            zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                        }
                        if (i16 != 0) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        if (i18 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                    @Override // tg.draadjrbmk
                                    public final Object invoke(Object obj) {
                                        return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            i23 = i15;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                        } else {
                            i23 = i15;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = draadjrbmkVar3;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        }
                    } else {
                        if (i25 != 0) {
                            wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                            i15 &= -897;
                        } else {
                            zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                        }
                        if (i16 != 0) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        if (i18 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                    @Override // tg.draadjrbmk
                                    public final Object invoke(Object obj) {
                                        return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            i23 = i15;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                        } else {
                            i23 = i15;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = draadjrbmkVar3;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        }
                    }
                    draadjrbmkVarBtonecajqb.esjtqupxsv();
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1434364569, i23, -1, "ru.myspar.core.ui.compose.components.CustomAndroidFragment (CustomAndroidFragment.kt:48)");
                    }
                    i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i23 >> 12) & 14);
                    iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                    view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322333746);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    fragmentManager = (FragmentManager) objYadqdtsiqt2;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fragmentManager);
                    context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322329320);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt3 = new kcexrzcfyt(iIobyxmoadg);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    kcexrzcfytVar = (kcexrzcfyt) objYadqdtsiqt3;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    tg.draadjrbmk draadjrbmkVar116 = draadjrbmkVar4;
                    int i213 = i23;
                    androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(kcexrzcfytVar, wkgbmnqykcVar4, null, draadjrbmkVarBtonecajqb, i23 & 112, 4);
                    objArr = new Object[]{fragmentManager, kcexrzcfytVar, clazz, zdlpuopuiuVar3};
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322322428);
                    zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(fragmentManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(kcexrzcfytVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(context) | draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) | ((((i213 & 896) ^ 384) <= 256 && draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar3)) || (i213 & 384) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(bundle4) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIobyxmoadg) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zLmojexxdyd) {
                        final zdlpuopuiu zdlpuopuiuVar18 = zdlpuopuiuVar3;
                        objArr2 = objArr;
                        final Bundle bundle19 = bundle4;
                        tg.draadjrbmk draadjrbmkVar117 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar18, bundle19, iIobyxmoadg, (ulzqkzuiru) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar117);
                        objYadqdtsiqt4 = draadjrbmkVar117;
                    } else {
                        final zdlpuopuiu zdlpuopuiuVar19 = zdlpuopuiuVar3;
                        objArr2 = objArr;
                        final Bundle bundle110 = bundle4;
                        tg.draadjrbmk draadjrbmkVar118 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar19, bundle110, iIobyxmoadg, (ulzqkzuiru) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar118);
                        objYadqdtsiqt4 = draadjrbmkVar118;
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.ppxfxbqfkf(objArr2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar5 = wkgbmnqykcVar4;
                    zdlpuopuiuVar4 = zdlpuopuiuVar3;
                    bundle5 = bundle4;
                    draadjrbmkVar5 = draadjrbmkVar116;
                } else {
                    draadjrbmkVarBtonecajqb.wwaezpbzkn();
                    if ((i13 & 1) != 0) {
                        if (i25 != 0) {
                            wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                            i15 &= -897;
                        } else {
                            zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                        }
                        if (i16 != 0) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        if (i18 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                    @Override // tg.draadjrbmk
                                    public final Object invoke(Object obj) {
                                        return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            i23 = i15;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                        } else {
                            i23 = i15;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = draadjrbmkVar3;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        }
                    } else {
                        if (i25 != 0) {
                            wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                            i15 &= -897;
                        } else {
                            zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                        }
                        if (i16 != 0) {
                            bundle3 = Bundle.EMPTY;
                        } else {
                            bundle3 = bundle2;
                        }
                        if (i18 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                    @Override // tg.draadjrbmk
                                    public final Object invoke(Object obj) {
                                        return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            i23 = i15;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                        } else {
                            i23 = i15;
                            zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                            bundle4 = bundle3;
                            draadjrbmkVar4 = draadjrbmkVar3;
                            wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        }
                    }
                    draadjrbmkVarBtonecajqb.esjtqupxsv();
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1434364569, i23, -1, "ru.myspar.core.ui.compose.components.CustomAndroidFragment (CustomAndroidFragment.kt:48)");
                    }
                    i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i23 >> 12) & 14);
                    iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                    view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322333746);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    fragmentManager = (FragmentManager) objYadqdtsiqt2;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fragmentManager);
                    context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322329320);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt3 = new kcexrzcfyt(iIobyxmoadg);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    kcexrzcfytVar = (kcexrzcfyt) objYadqdtsiqt3;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    tg.draadjrbmk draadjrbmkVar119 = draadjrbmkVar4;
                    int i214 = i23;
                    androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(kcexrzcfytVar, wkgbmnqykcVar4, null, draadjrbmkVarBtonecajqb, i23 & 112, 4);
                    objArr = new Object[]{fragmentManager, kcexrzcfytVar, clazz, zdlpuopuiuVar3};
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322322428);
                    zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(fragmentManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(kcexrzcfytVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(context) | draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) | ((((i214 & 896) ^ 384) <= 256 && draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar3)) || (i214 & 384) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(bundle4) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIobyxmoadg) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zLmojexxdyd) {
                        final zdlpuopuiu zdlpuopuiuVar110 = zdlpuopuiuVar3;
                        objArr2 = objArr;
                        final Bundle bundle111 = bundle4;
                        tg.draadjrbmk draadjrbmkVar1110 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar110, bundle111, iIobyxmoadg, (ulzqkzuiru) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar1110);
                        objYadqdtsiqt4 = draadjrbmkVar1110;
                    } else {
                        final zdlpuopuiu zdlpuopuiuVar111 = zdlpuopuiuVar3;
                        objArr2 = objArr;
                        final Bundle bundle112 = bundle4;
                        tg.draadjrbmk draadjrbmkVar1111 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar111, bundle112, iIobyxmoadg, (ulzqkzuiru) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar1111);
                        objYadqdtsiqt4 = draadjrbmkVar1111;
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.ppxfxbqfkf(objArr2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar5 = wkgbmnqykcVar4;
                    zdlpuopuiuVar4 = zdlpuopuiuVar3;
                    bundle5 = bundle4;
                    draadjrbmkVar5 = draadjrbmkVar119;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: v40.ojitshcjhn
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return oxmwwwfdhm.nufgyqmvbu(clazz, wkgbmnqykcVar5, zdlpuopuiuVar4, bundle5, draadjrbmkVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 24576;
            draadjrbmkVar3 = draadjrbmkVar;
            if ((i15 & 9363) == 9362) {
                draadjrbmkVarBtonecajqb.wwaezpbzkn();
                if ((i13 & 1) != 0) {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                        i15 &= -897;
                    } else {
                        zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                    }
                    if (i16 != 0) {
                        bundle3 = Bundle.EMPTY;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        i23 = i15;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        i23 = i15;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = draadjrbmkVar3;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    }
                } else {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                        i15 &= -897;
                    } else {
                        zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                    }
                    if (i16 != 0) {
                        bundle3 = Bundle.EMPTY;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        i23 = i15;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        i23 = i15;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = draadjrbmkVar3;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    }
                }
                draadjrbmkVarBtonecajqb.esjtqupxsv();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1434364569, i23, -1, "ru.myspar.core.ui.compose.components.CustomAndroidFragment (CustomAndroidFragment.kt:48)");
                }
                i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i23 >> 12) & 14);
                iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322333746);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                fragmentManager = (FragmentManager) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fragmentManager);
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322329320);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt3 = new kcexrzcfyt(iIobyxmoadg);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                kcexrzcfytVar = (kcexrzcfyt) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.draadjrbmk draadjrbmkVar1112 = draadjrbmkVar4;
                int i215 = i23;
                androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(kcexrzcfytVar, wkgbmnqykcVar4, null, draadjrbmkVarBtonecajqb, i23 & 112, 4);
                objArr = new Object[]{fragmentManager, kcexrzcfytVar, clazz, zdlpuopuiuVar3};
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322322428);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(fragmentManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(kcexrzcfytVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(context) | draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) | ((((i215 & 896) ^ 384) <= 256 && draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar3)) || (i215 & 384) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(bundle4) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIobyxmoadg) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd) {
                    final zdlpuopuiu zdlpuopuiuVar112 = zdlpuopuiuVar3;
                    objArr2 = objArr;
                    final Bundle bundle113 = bundle4;
                    tg.draadjrbmk draadjrbmkVar1113 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar112, bundle113, iIobyxmoadg, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar1113);
                    objYadqdtsiqt4 = draadjrbmkVar1113;
                } else {
                    final zdlpuopuiu zdlpuopuiuVar113 = zdlpuopuiuVar3;
                    objArr2 = objArr;
                    final Bundle bundle114 = bundle4;
                    tg.draadjrbmk draadjrbmkVar1114 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar113, bundle114, iIobyxmoadg, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar1114);
                    objYadqdtsiqt4 = draadjrbmkVar1114;
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.ppxfxbqfkf(objArr2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar5 = wkgbmnqykcVar4;
                zdlpuopuiuVar4 = zdlpuopuiuVar3;
                bundle5 = bundle4;
                draadjrbmkVar5 = draadjrbmkVar1112;
            } else {
                draadjrbmkVarBtonecajqb.wwaezpbzkn();
                if ((i13 & 1) != 0) {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                        i15 &= -897;
                    } else {
                        zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                    }
                    if (i16 != 0) {
                        bundle3 = Bundle.EMPTY;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        i23 = i15;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        i23 = i15;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = draadjrbmkVar3;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    }
                } else {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                        i15 &= -897;
                    } else {
                        zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                    }
                    if (i16 != 0) {
                        bundle3 = Bundle.EMPTY;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        i23 = i15;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        i23 = i15;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = draadjrbmkVar3;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    }
                }
                draadjrbmkVarBtonecajqb.esjtqupxsv();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1434364569, i23, -1, "ru.myspar.core.ui.compose.components.CustomAndroidFragment (CustomAndroidFragment.kt:48)");
                }
                i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i23 >> 12) & 14);
                iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322333746);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                fragmentManager = (FragmentManager) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fragmentManager);
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322329320);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt3 = new kcexrzcfyt(iIobyxmoadg);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                kcexrzcfytVar = (kcexrzcfyt) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.draadjrbmk draadjrbmkVar1115 = draadjrbmkVar4;
                int i216 = i23;
                androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(kcexrzcfytVar, wkgbmnqykcVar4, null, draadjrbmkVarBtonecajqb, i23 & 112, 4);
                objArr = new Object[]{fragmentManager, kcexrzcfytVar, clazz, zdlpuopuiuVar3};
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322322428);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(fragmentManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(kcexrzcfytVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(context) | draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) | ((((i216 & 896) ^ 384) <= 256 && draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar3)) || (i216 & 384) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(bundle4) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIobyxmoadg) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd) {
                    final zdlpuopuiu zdlpuopuiuVar114 = zdlpuopuiuVar3;
                    objArr2 = objArr;
                    final Bundle bundle115 = bundle4;
                    tg.draadjrbmk draadjrbmkVar1116 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar114, bundle115, iIobyxmoadg, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar1116);
                    objYadqdtsiqt4 = draadjrbmkVar1116;
                } else {
                    final zdlpuopuiu zdlpuopuiuVar115 = zdlpuopuiuVar3;
                    objArr2 = objArr;
                    final Bundle bundle116 = bundle4;
                    tg.draadjrbmk draadjrbmkVar1117 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar115, bundle116, iIobyxmoadg, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar1117);
                    objYadqdtsiqt4 = draadjrbmkVar1117;
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.ppxfxbqfkf(objArr2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar5 = wkgbmnqykcVar4;
                zdlpuopuiuVar4 = zdlpuopuiuVar3;
                bundle5 = bundle4;
                draadjrbmkVar5 = draadjrbmkVar1115;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: v40.ojitshcjhn
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return oxmwwwfdhm.nufgyqmvbu(clazz, wkgbmnqykcVar5, zdlpuopuiuVar4, bundle5, draadjrbmkVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        bundle2 = bundle;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                draadjrbmkVar3 = draadjrbmkVar;
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) == 9362) {
                draadjrbmkVarBtonecajqb.wwaezpbzkn();
                if ((i13 & 1) != 0) {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                        i15 &= -897;
                    } else {
                        zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                    }
                    if (i16 != 0) {
                        bundle3 = Bundle.EMPTY;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        i23 = i15;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        i23 = i15;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = draadjrbmkVar3;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    }
                } else {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                        i15 &= -897;
                    } else {
                        zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                    }
                    if (i16 != 0) {
                        bundle3 = Bundle.EMPTY;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        i23 = i15;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        i23 = i15;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = draadjrbmkVar3;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    }
                }
                draadjrbmkVarBtonecajqb.esjtqupxsv();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1434364569, i23, -1, "ru.myspar.core.ui.compose.components.CustomAndroidFragment (CustomAndroidFragment.kt:48)");
                }
                i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i23 >> 12) & 14);
                iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322333746);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                fragmentManager = (FragmentManager) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fragmentManager);
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322329320);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt3 = new kcexrzcfyt(iIobyxmoadg);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                kcexrzcfytVar = (kcexrzcfyt) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.draadjrbmk draadjrbmkVar1118 = draadjrbmkVar4;
                int i217 = i23;
                androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(kcexrzcfytVar, wkgbmnqykcVar4, null, draadjrbmkVarBtonecajqb, i23 & 112, 4);
                objArr = new Object[]{fragmentManager, kcexrzcfytVar, clazz, zdlpuopuiuVar3};
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322322428);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(fragmentManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(kcexrzcfytVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(context) | draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) | ((((i217 & 896) ^ 384) <= 256 && draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar3)) || (i217 & 384) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(bundle4) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIobyxmoadg) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd) {
                    final zdlpuopuiu zdlpuopuiuVar116 = zdlpuopuiuVar3;
                    objArr2 = objArr;
                    final Bundle bundle117 = bundle4;
                    tg.draadjrbmk draadjrbmkVar1119 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar116, bundle117, iIobyxmoadg, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar1119);
                    objYadqdtsiqt4 = draadjrbmkVar1119;
                } else {
                    final zdlpuopuiu zdlpuopuiuVar117 = zdlpuopuiuVar3;
                    objArr2 = objArr;
                    final Bundle bundle118 = bundle4;
                    tg.draadjrbmk draadjrbmkVar11110 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar117, bundle118, iIobyxmoadg, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar11110);
                    objYadqdtsiqt4 = draadjrbmkVar11110;
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.ppxfxbqfkf(objArr2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar5 = wkgbmnqykcVar4;
                zdlpuopuiuVar4 = zdlpuopuiuVar3;
                bundle5 = bundle4;
                draadjrbmkVar5 = draadjrbmkVar1118;
            } else {
                draadjrbmkVarBtonecajqb.wwaezpbzkn();
                if ((i13 & 1) != 0) {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                        i15 &= -897;
                    } else {
                        zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                    }
                    if (i16 != 0) {
                        bundle3 = Bundle.EMPTY;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        i23 = i15;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        i23 = i15;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = draadjrbmkVar3;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    }
                } else {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                        i15 &= -897;
                    } else {
                        zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                    }
                    if (i16 != 0) {
                        bundle3 = Bundle.EMPTY;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        i23 = i15;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        i23 = i15;
                        zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                        bundle4 = bundle3;
                        draadjrbmkVar4 = draadjrbmkVar3;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    }
                }
                draadjrbmkVarBtonecajqb.esjtqupxsv();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1434364569, i23, -1, "ru.myspar.core.ui.compose.components.CustomAndroidFragment (CustomAndroidFragment.kt:48)");
                }
                i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i23 >> 12) & 14);
                iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322333746);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                fragmentManager = (FragmentManager) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fragmentManager);
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322329320);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt3 = new kcexrzcfyt(iIobyxmoadg);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                kcexrzcfytVar = (kcexrzcfyt) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.draadjrbmk draadjrbmkVar11111 = draadjrbmkVar4;
                int i218 = i23;
                androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(kcexrzcfytVar, wkgbmnqykcVar4, null, draadjrbmkVarBtonecajqb, i23 & 112, 4);
                objArr = new Object[]{fragmentManager, kcexrzcfytVar, clazz, zdlpuopuiuVar3};
                draadjrbmkVarBtonecajqb.sopmlzcsov(-322322428);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(fragmentManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(kcexrzcfytVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(context) | draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) | ((((i218 & 896) ^ 384) <= 256 && draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar3)) || (i218 & 384) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(bundle4) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIobyxmoadg) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd) {
                    final zdlpuopuiu zdlpuopuiuVar118 = zdlpuopuiuVar3;
                    objArr2 = objArr;
                    final Bundle bundle119 = bundle4;
                    tg.draadjrbmk draadjrbmkVar11112 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar118, bundle119, iIobyxmoadg, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar11112);
                    objYadqdtsiqt4 = draadjrbmkVar11112;
                } else {
                    final zdlpuopuiu zdlpuopuiuVar119 = zdlpuopuiuVar3;
                    objArr2 = objArr;
                    final Bundle bundle1110 = bundle4;
                    tg.draadjrbmk draadjrbmkVar11113 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar119, bundle1110, iIobyxmoadg, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar11113);
                    objYadqdtsiqt4 = draadjrbmkVar11113;
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.ppxfxbqfkf(objArr2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar5 = wkgbmnqykcVar4;
                zdlpuopuiuVar4 = zdlpuopuiuVar3;
                bundle5 = bundle4;
                draadjrbmkVar5 = draadjrbmkVar11111;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: v40.ojitshcjhn
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return oxmwwwfdhm.nufgyqmvbu(clazz, wkgbmnqykcVar5, zdlpuopuiuVar4, bundle5, draadjrbmkVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 24576;
        draadjrbmkVar3 = draadjrbmkVar;
        if ((i15 & 9363) == 9362) {
            draadjrbmkVarBtonecajqb.wwaezpbzkn();
            if ((i13 & 1) != 0) {
                if (i25 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if ((i14 & 4) != 0) {
                    zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                    i15 &= -897;
                } else {
                    zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                }
                if (i16 != 0) {
                    bundle3 = Bundle.EMPTY;
                } else {
                    bundle3 = bundle2;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    i23 = i15;
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                    bundle4 = bundle3;
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                } else {
                    i23 = i15;
                    zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                    bundle4 = bundle3;
                    draadjrbmkVar4 = draadjrbmkVar3;
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                }
            } else {
                if (i25 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if ((i14 & 4) != 0) {
                    zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                    i15 &= -897;
                } else {
                    zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                }
                if (i16 != 0) {
                    bundle3 = Bundle.EMPTY;
                } else {
                    bundle3 = bundle2;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    i23 = i15;
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                    bundle4 = bundle3;
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                } else {
                    i23 = i15;
                    zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                    bundle4 = bundle3;
                    draadjrbmkVar4 = draadjrbmkVar3;
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                }
            }
            draadjrbmkVarBtonecajqb.esjtqupxsv();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1434364569, i23, -1, "ru.myspar.core.ui.compose.components.CustomAndroidFragment (CustomAndroidFragment.kt:48)");
            }
            i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i23 >> 12) & 14);
            iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
            view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
            draadjrbmkVarBtonecajqb.sopmlzcsov(-322333746);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            fragmentManager = (FragmentManager) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fragmentManager);
            context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            draadjrbmkVarBtonecajqb.sopmlzcsov(-322329320);
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new kcexrzcfyt(iIobyxmoadg);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            kcexrzcfytVar = (kcexrzcfyt) objYadqdtsiqt3;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tg.draadjrbmk draadjrbmkVar11114 = draadjrbmkVar4;
            int i219 = i23;
            androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(kcexrzcfytVar, wkgbmnqykcVar4, null, draadjrbmkVarBtonecajqb, i23 & 112, 4);
            objArr = new Object[]{fragmentManager, kcexrzcfytVar, clazz, zdlpuopuiuVar3};
            draadjrbmkVarBtonecajqb.sopmlzcsov(-322322428);
            zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(fragmentManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(kcexrzcfytVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(context) | draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) | ((((i219 & 896) ^ 384) <= 256 && draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar3)) || (i219 & 384) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(bundle4) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIobyxmoadg) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
            objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                final zdlpuopuiu zdlpuopuiuVar1110 = zdlpuopuiuVar3;
                objArr2 = objArr;
                final Bundle bundle1111 = bundle4;
                tg.draadjrbmk draadjrbmkVar11115 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar1110, bundle1111, iIobyxmoadg, (ulzqkzuiru) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar11115);
                objYadqdtsiqt4 = draadjrbmkVar11115;
            } else {
                final zdlpuopuiu zdlpuopuiuVar1111 = zdlpuopuiuVar3;
                objArr2 = objArr;
                final Bundle bundle1112 = bundle4;
                tg.draadjrbmk draadjrbmkVar11116 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar1111, bundle1112, iIobyxmoadg, (ulzqkzuiru) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar11116);
                objYadqdtsiqt4 = draadjrbmkVar11116;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.ppxfxbqfkf(objArr2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar5 = wkgbmnqykcVar4;
            zdlpuopuiuVar4 = zdlpuopuiuVar3;
            bundle5 = bundle4;
            draadjrbmkVar5 = draadjrbmkVar11114;
        } else {
            draadjrbmkVarBtonecajqb.wwaezpbzkn();
            if ((i13 & 1) != 0) {
                if (i25 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if ((i14 & 4) != 0) {
                    zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                    i15 &= -897;
                } else {
                    zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                }
                if (i16 != 0) {
                    bundle3 = Bundle.EMPTY;
                } else {
                    bundle3 = bundle2;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    i23 = i15;
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                    bundle4 = bundle3;
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                } else {
                    i23 = i15;
                    zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                    bundle4 = bundle3;
                    draadjrbmkVar4 = draadjrbmkVar3;
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                }
            } else {
                if (i25 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if ((i14 & 4) != 0) {
                    zdlpuopuiuVarAgtfadlqog = agtfadlqog(draadjrbmkVarBtonecajqb, 0);
                    i15 &= -897;
                } else {
                    zdlpuopuiuVarAgtfadlqog = zdlpuopuiuVar2;
                }
                if (i16 != 0) {
                    bundle3 = Bundle.EMPTY;
                } else {
                    bundle3 = bundle2;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-322339095);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: v40.wflxmlrfwp
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return oxmwwwfdhm.dxjokdxxww((Fragment) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    i23 = i15;
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                    bundle4 = bundle3;
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                } else {
                    i23 = i15;
                    zdlpuopuiuVar3 = zdlpuopuiuVarAgtfadlqog;
                    bundle4 = bundle3;
                    draadjrbmkVar4 = draadjrbmkVar3;
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                }
            }
            draadjrbmkVarBtonecajqb.esjtqupxsv();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1434364569, i23, -1, "ru.myspar.core.ui.compose.components.CustomAndroidFragment (CustomAndroidFragment.kt:48)");
            }
            i1VarAgtfadlqog = v0.agtfadlqog(draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i23 >> 12) & 14);
            iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
            view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
            draadjrbmkVarBtonecajqb.sopmlzcsov(-322333746);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = FragmentManager.opjhrmiecq(view);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            fragmentManager = (FragmentManager) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fragmentManager);
            context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            draadjrbmkVarBtonecajqb.sopmlzcsov(-322329320);
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new kcexrzcfyt(iIobyxmoadg);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            kcexrzcfytVar = (kcexrzcfyt) objYadqdtsiqt3;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tg.draadjrbmk draadjrbmkVar11117 = draadjrbmkVar4;
            int i2110 = i23;
            androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(kcexrzcfytVar, wkgbmnqykcVar4, null, draadjrbmkVarBtonecajqb, i23 & 112, 4);
            objArr = new Object[]{fragmentManager, kcexrzcfytVar, clazz, zdlpuopuiuVar3};
            draadjrbmkVarBtonecajqb.sopmlzcsov(-322322428);
            zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(fragmentManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(kcexrzcfytVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(context) | draadjrbmkVarBtonecajqb.lmojexxdyd(clazz) | ((((i2110 & 896) ^ 384) <= 256 && draadjrbmkVarBtonecajqb.ulzqkzuiru(zdlpuopuiuVar3)) || (i2110 & 384) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(bundle4) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIobyxmoadg) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
            objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                final zdlpuopuiu zdlpuopuiuVar1112 = zdlpuopuiuVar3;
                objArr2 = objArr;
                final Bundle bundle1113 = bundle4;
                tg.draadjrbmk draadjrbmkVar11118 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar1112, bundle1113, iIobyxmoadg, (ulzqkzuiru) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar11118);
                objYadqdtsiqt4 = draadjrbmkVar11118;
            } else {
                final zdlpuopuiu zdlpuopuiuVar1113 = zdlpuopuiuVar3;
                objArr2 = objArr;
                final Bundle bundle1114 = bundle4;
                tg.draadjrbmk draadjrbmkVar11119 = new tg.draadjrbmk() { // from class: v40.agtfadlqog
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return oxmwwwfdhm.btonecajqb(fragmentManager, kcexrzcfytVar, context, clazz, i1VarAgtfadlqog, zdlpuopuiuVar1113, bundle1114, iIobyxmoadg, (ulzqkzuiru) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar11119);
                objYadqdtsiqt4 = draadjrbmkVar11119;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.ppxfxbqfkf(objArr2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar5 = wkgbmnqykcVar4;
            zdlpuopuiuVar4 = zdlpuopuiuVar3;
            bundle5 = bundle4;
            draadjrbmkVar5 = draadjrbmkVar11117;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: v40.ojitshcjhn
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return oxmwwwfdhm.nufgyqmvbu(clazz, wkgbmnqykcVar5, zdlpuopuiuVar4, bundle5, draadjrbmkVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(Class cls, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, zdlpuopuiu zdlpuopuiuVar, Bundle bundle, tg.draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        lqeggnwhkg(cls, wkgbmnqykcVar, zdlpuopuiuVar, bundle, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zdlpuopuiu ojitshcjhn() {
        return new zdlpuopuiu(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zdlpuopuiu wflxmlrfwp(iwxlajgraz it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return new zdlpuopuiu(it);
    }
}
