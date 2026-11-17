package zf0;

import a.ojitshcjhn;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.fyldjkxazc;
import czzsidtyhn.ipoelvxyzq;
import czzsidtyhn.ydmasvzmpa;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import igdgnonuha.s2;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import ru.myspar.core.navigation.containers.TabContainerFragment;
import ru.myspar.core.ui.model.MainTab;
import sflfametgt.ikoacuggdj;
import sflfametgt.metgxyhuhe;
import sflfametgt.stevsuqkhv;
import sflfametgt.zynmafqrjb;
import tf0.dxjokdxxww;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ MainTab f129846jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ikoacuggdj f129847yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f129848zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(ikoacuggdj ikoacuggdjVar, MainTab mainTab, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f129847yggfygwlhe = ikoacuggdjVar;
            this.f129846jyumaefscl = mainTab;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f129847yggfygwlhe, this.f129846jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f129848zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ikoacuggdj ikoacuggdjVar = this.f129847yggfygwlhe;
                int iOrdinal = this.f129846jyumaefscl.ordinal();
                this.f129848zdlpuopuiu = 1;
                if (ikoacuggdj.rlfsiqarku(ikoacuggdjVar, iOrdinal, 0.0f, this, 2, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf implements vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ MainTab f129849jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f129850yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ikoacuggdj f129851zdlpuopuiu;

        static final class iobyxmoadg implements oxmwwwfdhm {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ MainTab f129852yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ tg.draadjrbmk f129853zdlpuopuiu;

            iobyxmoadg(tg.draadjrbmk draadjrbmkVar, MainTab mainTab) {
                this.f129853zdlpuopuiu = draadjrbmkVar;
                this.f129852yggfygwlhe = mainTab;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn ppxfxbqfkf(tg.draadjrbmk draadjrbmkVar, int i13, MainTab mainTab, TabContainerFragment it) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
                it.kegysxyocb((m9.wkgbmnqykc) draadjrbmkVar.invoke(MainTab.nufgyqmvbu().get(i13)), i13 == mainTab.ordinal());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.oxmwwwfdhm
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                zoijcleaow((stevsuqkhv) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.draadjrbmk) obj3, ((Number) obj4).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void zoijcleaow(stevsuqkhv HorizontalPager, final int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(HorizontalPager, "$this$HorizontalPager");
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-1341313043, i14, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer.<anonymous>.<anonymous> (TabContainer.kt:64)");
                }
                boolean z13 = true;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = cdpycssgdh.gxszxtbevo(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
                Bundle bundle = new Bundle();
                bundle.putParcelable("tab_name", (Parcelable) MainTab.nufgyqmvbu().get(i13));
                draadjrbmkVar.sopmlzcsov(-401413722);
                boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f129853zdlpuopuiu);
                if ((((i14 & 112) ^ 48) <= 32 || !draadjrbmkVar.ppxfxbqfkf(i13)) && (i14 & 48) != 32) {
                    z13 = false;
                }
                boolean zUlzqkzuiru2 = zUlzqkzuiru | z13 | draadjrbmkVar.ulzqkzuiru(this.f129852yggfygwlhe);
                final tg.draadjrbmk draadjrbmkVar2 = this.f129853zdlpuopuiu;
                final MainTab mainTab = this.f129852yggfygwlhe;
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru2 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: zf0.gxszxtbevo
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wkgbmnqykc.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(draadjrbmkVar2, i13, mainTab, (TabContainerFragment) obj);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(1939055035);
                v40.oxmwwwfdhm.lqeggnwhkg(TabContainerFragment.class, wkgbmnqykcVarGxszxtbevo, v40.oxmwwwfdhm.agtfadlqog(draadjrbmkVar, 0), bundle, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVar, 48, 0);
                draadjrbmkVar.stevsuqkhv();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
        }

        ppxfxbqfkf(ikoacuggdj ikoacuggdjVar, tg.draadjrbmk draadjrbmkVar, MainTab mainTab) {
            this.f129851zdlpuopuiu = ikoacuggdjVar;
            this.f129850yggfygwlhe = draadjrbmkVar;
            this.f129849jyumaefscl = mainTab;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object ppxfxbqfkf(int i13) {
            return Integer.valueOf(i13);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            zoijcleaow((ydmasvzmpa) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(ydmasvzmpa innerPadding, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            int i14;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(innerPadding, "innerPadding");
            if ((i13 & 6) == 0) {
                i14 = i13 | (draadjrbmkVar.ulzqkzuiru(innerPadding) ? 4 : 2);
            } else {
                i14 = i13;
            }
            if ((i14 & 19) == 18 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1984754638, i14, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer.<anonymous> (TabContainer.kt:52)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = cdpycssgdh.gxszxtbevo(ipoelvxyzq.iobyxmoadg(ipoelvxyzq.zoijcleaow(esjtqupxsv.draadjrbmk(fyldjkxazc.ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, innerPadding), innerPadding))), 0.0f, 1, null);
            int size = MainTab.nufgyqmvbu().size();
            ikoacuggdj ikoacuggdjVar = this.f129851zdlpuopuiu;
            draadjrbmkVar.sopmlzcsov(1279699472);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: zf0.eablkybsjg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return wkgbmnqykc.ppxfxbqfkf.ppxfxbqfkf(((Integer) obj).intValue());
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            zynmafqrjb.lqeggnwhkg(ikoacuggdjVar, wkgbmnqykcVarGxszxtbevo, null, null, size, 0.0f, null, null, false, false, (tg.draadjrbmk) objYadqdtsiqt, null, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1341313043, true, new iobyxmoadg(this.f129850yggfygwlhe, this.f129849jyumaefscl), draadjrbmkVar, 54), draadjrbmkVar, 100663296, 24582, 15084);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class zoijcleaow implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f129854cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ int f129855iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ int f129856jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ MainTab f129857yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ boolean f129858zdlpuopuiu;

        zoijcleaow(boolean z13, MainTab mainTab, int i13, int i14, tg.draadjrbmk draadjrbmkVar) {
            this.f129858zdlpuopuiu = z13;
            this.f129857yggfygwlhe = mainTab;
            this.f129856jyumaefscl = i13;
            this.f129855iwizpuwonk = i14;
            this.f129854cqumvgiudr = draadjrbmkVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-568333114, i13, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer.<anonymous> (TabContainer.kt:43)");
            }
            dxjokdxxww.ppxfxbqfkf(ojitshcjhn.iobyxmoadg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, this.f129858zdlpuopuiu ? 0.0f : 1.0f), this.f129857yggfygwlhe, this.f129856jyumaefscl, this.f129855iwizpuwonk, this.f129854cqumvgiudr, draadjrbmkVar, 0, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(MainTab it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int gxszxtbevo() {
        return MainTab.nufgyqmvbu().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(MainTab mainTab, int i13, int i14, tg.draadjrbmk draadjrbmkVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, tg.draadjrbmk draadjrbmkVar2, int i15, int i16, androidx.compose.runtime.draadjrbmk draadjrbmkVar3, int i17) {
        wkgbmnqykc(mainTab, i13, i14, draadjrbmkVar, wkgbmnqykcVar, z13, draadjrbmkVar2, draadjrbmkVar3, f.iobyxmoadg(i15 | 1), i16);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0164  */
    /* JADX WARN: Code duplicated, block: B:106:0x016c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0172  */
    /* JADX WARN: Code duplicated, block: B:111:0x01de  */
    /* JADX WARN: Code duplicated, block: B:115:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x011c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0124  */
    public static final void wkgbmnqykc(final MainTab selectedTab, final int i13, final int i14, final tg.draadjrbmk getScreen, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i15, final int i16) {
        int i17;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i18;
        boolean z14;
        int i19;
        int i23;
        tg.draadjrbmk draadjrbmkVar3;
        int i24;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        boolean z15;
        tg.draadjrbmk draadjrbmkVar4;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar;
        ikoacuggdj ikoacuggdjVarAgtfadlqog;
        boolean zUlzqkzuiru;
        Object objYadqdtsiqt2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar5;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        Object objYadqdtsiqt3;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(selectedTab, "selectedTab");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getScreen, "getScreen");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-518552116);
        if ((i16 & 1) != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(selectedTab) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i16 & 2) != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 32 : 16;
        }
        if ((i16 & 4) != 0) {
            i17 |= 384;
        } else if ((i15 & 384) == 0) {
            i17 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i14) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i16 & 8) != 0) {
            i17 |= 3072;
        } else if ((i15 & 3072) == 0) {
            i17 |= draadjrbmkVarBtonecajqb.lmojexxdyd(getScreen) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i25 = i16 & 16;
        if (i25 == 0) {
            if ((i15 & 24576) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i17 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 16384 : 8192;
            }
            i18 = i16 & 32;
            if (i18 != 0) {
                if ((196608 & i15) == 0) {
                    z14 = z13;
                    if (draadjrbmkVarBtonecajqb.iobyxmoadg(z14)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i17 |= i19;
                }
                i23 = i16 & 64;
                if (i23 != 0) {
                    if ((1572864 & i15) == 0) {
                        draadjrbmkVar3 = draadjrbmkVar;
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i17 |= i24;
                    }
                    if ((599187 & i17) == 599186 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                        if (i25 != 0) {
                            wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        }
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z14;
                        }
                        if (i23 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(1262280429);
                            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zf0.iobyxmoadg
                                    @Override // tg.draadjrbmk
                                    public final Object invoke(Object obj) {
                                        return wkgbmnqykc.eablkybsjg((MainTab) obj);
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                        } else {
                            draadjrbmkVar4 = draadjrbmkVar3;
                        }
                        if (jyumaefscl.jpowsppfya()) {
                            jyumaefscl.ntlheqmsrt(-518552116, i17, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:33)");
                        }
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1262282371);
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                        if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zf0.zoijcleaow
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1262284295);
                        int i26 = i17 & 14;
                        zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | (i26 == 4);
                        objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (zUlzqkzuiru || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                            objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i26);
                        int i27 = i17;
                        draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                        s2.nufgyqmvbu(wkgbmnqykcVar3, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-568333114, true, new zoijcleaow(z15, selectedTab, i13, i14, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1984754638, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i27 >> 12) & 14) | 3072, 12582912, 131062);
                        if (jyumaefscl.jpowsppfya()) {
                            jyumaefscl.mbcevpiqjq();
                        }
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        z14 = z15;
                    } else {
                        draadjrbmkVarBtonecajqb.hkdspvbjdz();
                        wkgbmnqykcVar4 = wkgbmnqykcVar2;
                        draadjrbmkVar4 = draadjrbmkVar3;
                        draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                    }
                    a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
                    if (a0VarWflxmlrfwp != null) {
                        final boolean z16 = z14;
                        final tg.draadjrbmk draadjrbmkVar6 = draadjrbmkVar4;
                        a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: zf0.ppxfxbqfkf
                            @Override // tg.rgvfuqvkyq
                            public final Object invoke(Object obj, Object obj2) {
                                return wkgbmnqykc.lqeggnwhkg(selectedTab, i13, i14, getScreen, wkgbmnqykcVar4, z16, draadjrbmkVar6, i15, i16, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                draadjrbmkVar3 = draadjrbmkVar;
                if ((599187 & i17) == 599186) {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z14;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1262280429);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zf0.iobyxmoadg
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return wkgbmnqykc.eablkybsjg((MainTab) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                    } else {
                        draadjrbmkVar4 = draadjrbmkVar3;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(-518552116, i17, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:33)");
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262282371);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zf0.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262284295);
                    int i28 = i17 & 14;
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | (i28 == 4);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i28);
                    int i29 = i17;
                    draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                    s2.nufgyqmvbu(wkgbmnqykcVar3, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-568333114, true, new zoijcleaow(z15, selectedTab, i13, i14, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1984754638, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i29 >> 12) & 14) | 3072, 12582912, 131062);
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    z14 = z15;
                } else {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z14;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1262280429);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zf0.iobyxmoadg
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return wkgbmnqykc.eablkybsjg((MainTab) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                    } else {
                        draadjrbmkVar4 = draadjrbmkVar3;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(-518552116, i17, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:33)");
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262282371);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zf0.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262284295);
                    int i210 = i17 & 14;
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | (i210 == 4);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i210);
                    int i211 = i17;
                    draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                    s2.nufgyqmvbu(wkgbmnqykcVar3, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-568333114, true, new zoijcleaow(z15, selectedTab, i13, i14, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1984754638, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i211 >> 12) & 14) | 3072, 12582912, 131062);
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    z14 = z15;
                }
                a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    final boolean z17 = z14;
                    final tg.draadjrbmk draadjrbmkVar7 = draadjrbmkVar4;
                    a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: zf0.ppxfxbqfkf
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return wkgbmnqykc.lqeggnwhkg(selectedTab, i13, i14, getScreen, wkgbmnqykcVar4, z17, draadjrbmkVar7, i15, i16, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            z14 = z13;
            i23 = i16 & 64;
            if (i23 != 0) {
                if ((1572864 & i15) == 0) {
                    draadjrbmkVar3 = draadjrbmkVar;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i17 |= i24;
                }
                if ((599187 & i17) == 599186) {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z14;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1262280429);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zf0.iobyxmoadg
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return wkgbmnqykc.eablkybsjg((MainTab) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                    } else {
                        draadjrbmkVar4 = draadjrbmkVar3;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(-518552116, i17, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:33)");
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262282371);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zf0.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262284295);
                    int i212 = i17 & 14;
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | (i212 == 4);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i212);
                    int i213 = i17;
                    draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                    s2.nufgyqmvbu(wkgbmnqykcVar3, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-568333114, true, new zoijcleaow(z15, selectedTab, i13, i14, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1984754638, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i213 >> 12) & 14) | 3072, 12582912, 131062);
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    z14 = z15;
                } else {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z14;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1262280429);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zf0.iobyxmoadg
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return wkgbmnqykc.eablkybsjg((MainTab) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                    } else {
                        draadjrbmkVar4 = draadjrbmkVar3;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(-518552116, i17, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:33)");
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262282371);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zf0.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262284295);
                    int i214 = i17 & 14;
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | (i214 == 4);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i214);
                    int i215 = i17;
                    draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                    s2.nufgyqmvbu(wkgbmnqykcVar3, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-568333114, true, new zoijcleaow(z15, selectedTab, i13, i14, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1984754638, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i215 >> 12) & 14) | 3072, 12582912, 131062);
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    z14 = z15;
                }
                a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    final boolean z18 = z14;
                    final tg.draadjrbmk draadjrbmkVar8 = draadjrbmkVar4;
                    a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: zf0.ppxfxbqfkf
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return wkgbmnqykc.lqeggnwhkg(selectedTab, i13, i14, getScreen, wkgbmnqykcVar4, z18, draadjrbmkVar8, i15, i16, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            draadjrbmkVar3 = draadjrbmkVar;
            if ((599187 & i17) == 599186) {
                if (i25 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i18 != 0) {
                    z15 = false;
                } else {
                    z15 = z14;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262280429);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zf0.iobyxmoadg
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return wkgbmnqykc.eablkybsjg((MainTab) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-518552116, i17, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:33)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1262282371);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zf0.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1262284295);
                int i216 = i17 & 14;
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | (i216 == 4);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i216);
                int i217 = i17;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                s2.nufgyqmvbu(wkgbmnqykcVar3, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-568333114, true, new zoijcleaow(z15, selectedTab, i13, i14, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1984754638, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i217 >> 12) & 14) | 3072, 12582912, 131062);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                z14 = z15;
            } else {
                if (i25 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i18 != 0) {
                    z15 = false;
                } else {
                    z15 = z14;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262280429);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zf0.iobyxmoadg
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return wkgbmnqykc.eablkybsjg((MainTab) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-518552116, i17, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:33)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1262282371);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zf0.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1262284295);
                int i218 = i17 & 14;
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | (i218 == 4);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i218);
                int i219 = i17;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                s2.nufgyqmvbu(wkgbmnqykcVar3, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-568333114, true, new zoijcleaow(z15, selectedTab, i13, i14, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1984754638, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i219 >> 12) & 14) | 3072, 12582912, 131062);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                z14 = z15;
            }
            a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final boolean z19 = z14;
                final tg.draadjrbmk draadjrbmkVar9 = draadjrbmkVar4;
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: zf0.ppxfxbqfkf
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return wkgbmnqykc.lqeggnwhkg(selectedTab, i13, i14, getScreen, wkgbmnqykcVar4, z19, draadjrbmkVar9, i15, i16, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i18 = i16 & 32;
        if (i18 != 0) {
            if ((196608 & i15) == 0) {
                z14 = z13;
                if (draadjrbmkVarBtonecajqb.iobyxmoadg(z14)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i17 |= i19;
            }
            i23 = i16 & 64;
            if (i23 != 0) {
                if ((1572864 & i15) == 0) {
                    draadjrbmkVar3 = draadjrbmkVar;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i17 |= i24;
                }
                if ((599187 & i17) == 599186) {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z14;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1262280429);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zf0.iobyxmoadg
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return wkgbmnqykc.eablkybsjg((MainTab) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                    } else {
                        draadjrbmkVar4 = draadjrbmkVar3;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(-518552116, i17, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:33)");
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262282371);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zf0.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262284295);
                    int i2110 = i17 & 14;
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | (i2110 == 4);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i2110);
                    int i2111 = i17;
                    draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                    s2.nufgyqmvbu(wkgbmnqykcVar3, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-568333114, true, new zoijcleaow(z15, selectedTab, i13, i14, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1984754638, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i2111 >> 12) & 14) | 3072, 12582912, 131062);
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    z14 = z15;
                } else {
                    if (i25 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z14;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1262280429);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zf0.iobyxmoadg
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return wkgbmnqykc.eablkybsjg((MainTab) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                    } else {
                        draadjrbmkVar4 = draadjrbmkVar3;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(-518552116, i17, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:33)");
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262282371);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zf0.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262284295);
                    int i2112 = i17 & 14;
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | (i2112 == 4);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i2112);
                    int i2113 = i17;
                    draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                    s2.nufgyqmvbu(wkgbmnqykcVar3, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-568333114, true, new zoijcleaow(z15, selectedTab, i13, i14, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1984754638, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i2113 >> 12) & 14) | 3072, 12582912, 131062);
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    z14 = z15;
                }
                a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    final boolean z110 = z14;
                    final tg.draadjrbmk draadjrbmkVar10 = draadjrbmkVar4;
                    a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: zf0.ppxfxbqfkf
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return wkgbmnqykc.lqeggnwhkg(selectedTab, i13, i14, getScreen, wkgbmnqykcVar4, z110, draadjrbmkVar10, i15, i16, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            draadjrbmkVar3 = draadjrbmkVar;
            if ((599187 & i17) == 599186) {
                if (i25 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i18 != 0) {
                    z15 = false;
                } else {
                    z15 = z14;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262280429);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zf0.iobyxmoadg
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return wkgbmnqykc.eablkybsjg((MainTab) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-518552116, i17, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:33)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1262282371);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zf0.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1262284295);
                int i2114 = i17 & 14;
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | (i2114 == 4);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i2114);
                int i2115 = i17;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                s2.nufgyqmvbu(wkgbmnqykcVar3, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-568333114, true, new zoijcleaow(z15, selectedTab, i13, i14, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1984754638, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i2115 >> 12) & 14) | 3072, 12582912, 131062);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                z14 = z15;
            } else {
                if (i25 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i18 != 0) {
                    z15 = false;
                } else {
                    z15 = z14;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262280429);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zf0.iobyxmoadg
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return wkgbmnqykc.eablkybsjg((MainTab) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-518552116, i17, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:33)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1262282371);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zf0.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1262284295);
                int i2116 = i17 & 14;
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | (i2116 == 4);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i2116);
                int i2117 = i17;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                s2.nufgyqmvbu(wkgbmnqykcVar3, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-568333114, true, new zoijcleaow(z15, selectedTab, i13, i14, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1984754638, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i2117 >> 12) & 14) | 3072, 12582912, 131062);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                z14 = z15;
            }
            a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final boolean z111 = z14;
                final tg.draadjrbmk draadjrbmkVar11 = draadjrbmkVar4;
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: zf0.ppxfxbqfkf
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return wkgbmnqykc.lqeggnwhkg(selectedTab, i13, i14, getScreen, wkgbmnqykcVar4, z111, draadjrbmkVar11, i15, i16, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        z14 = z13;
        i23 = i16 & 64;
        if (i23 != 0) {
            if ((1572864 & i15) == 0) {
                draadjrbmkVar3 = draadjrbmkVar;
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i17 |= i24;
            }
            if ((599187 & i17) == 599186) {
                if (i25 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i18 != 0) {
                    z15 = false;
                } else {
                    z15 = z14;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262280429);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zf0.iobyxmoadg
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return wkgbmnqykc.eablkybsjg((MainTab) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-518552116, i17, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:33)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1262282371);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zf0.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1262284295);
                int i2118 = i17 & 14;
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | (i2118 == 4);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i2118);
                int i2119 = i17;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                s2.nufgyqmvbu(wkgbmnqykcVar3, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-568333114, true, new zoijcleaow(z15, selectedTab, i13, i14, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1984754638, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i2119 >> 12) & 14) | 3072, 12582912, 131062);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                z14 = z15;
            } else {
                if (i25 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i18 != 0) {
                    z15 = false;
                } else {
                    z15 = z14;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1262280429);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zf0.iobyxmoadg
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return wkgbmnqykc.eablkybsjg((MainTab) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-518552116, i17, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:33)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1262282371);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zf0.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1262284295);
                int i21110 = i17 & 14;
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | (i21110 == 4);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i21110);
                int i21111 = i17;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                s2.nufgyqmvbu(wkgbmnqykcVar3, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-568333114, true, new zoijcleaow(z15, selectedTab, i13, i14, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1984754638, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i21111 >> 12) & 14) | 3072, 12582912, 131062);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                z14 = z15;
            }
            a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final boolean z112 = z14;
                final tg.draadjrbmk draadjrbmkVar12 = draadjrbmkVar4;
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: zf0.ppxfxbqfkf
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return wkgbmnqykc.lqeggnwhkg(selectedTab, i13, i14, getScreen, wkgbmnqykcVar4, z112, draadjrbmkVar12, i15, i16, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 1572864;
        draadjrbmkVar3 = draadjrbmkVar;
        if ((599187 & i17) == 599186) {
            if (i25 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i18 != 0) {
                z15 = false;
            } else {
                z15 = z14;
            }
            if (i23 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1262280429);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zf0.iobyxmoadg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wkgbmnqykc.eablkybsjg((MainTab) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
            } else {
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-518552116, i17, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:33)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1262282371);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zf0.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1262284295);
            int i21112 = i17 & 14;
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | (i21112 == 4);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i21112);
            int i21113 = i17;
            draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            s2.nufgyqmvbu(wkgbmnqykcVar3, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-568333114, true, new zoijcleaow(z15, selectedTab, i13, i14, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1984754638, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i21113 >> 12) & 14) | 3072, 12582912, 131062);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
            z14 = z15;
        } else {
            if (i25 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i18 != 0) {
                z15 = false;
            } else {
                z15 = z14;
            }
            if (i23 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1262280429);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zf0.iobyxmoadg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wkgbmnqykc.eablkybsjg((MainTab) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
            } else {
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-518552116, i17, -1, "ru.myspar.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:33)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1262282371);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zf0.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1262284295);
            int i21114 = i17 & 14;
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | (i21114 == 4);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i21114);
            int i21115 = i17;
            draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            s2.nufgyqmvbu(wkgbmnqykcVar3, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-568333114, true, new zoijcleaow(z15, selectedTab, i13, i14, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1984754638, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i21115 >> 12) & 14) | 3072, 12582912, 131062);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
            z14 = z15;
        }
        a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final boolean z113 = z14;
            final tg.draadjrbmk draadjrbmkVar13 = draadjrbmkVar4;
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: zf0.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return wkgbmnqykc.lqeggnwhkg(selectedTab, i13, i14, getScreen, wkgbmnqykcVar4, z113, draadjrbmkVar13, i15, i16, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
