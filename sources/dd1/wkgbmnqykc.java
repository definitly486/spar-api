package dd1;

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
import ru.myspar.proloyalty.core.navigation.containers.TabContainerFragment;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import sflfametgt.ikoacuggdj;
import sflfametgt.metgxyhuhe;
import sflfametgt.stevsuqkhv;
import sflfametgt.zynmafqrjb;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import xc1.dxjokdxxww;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ MainTab f27881jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ikoacuggdj f27882yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f27883zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(ikoacuggdj ikoacuggdjVar, MainTab mainTab, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f27882yggfygwlhe = ikoacuggdjVar;
            this.f27881jyumaefscl = mainTab;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f27882yggfygwlhe, this.f27881jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f27883zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ikoacuggdj ikoacuggdjVar = this.f27882yggfygwlhe;
                int iOrdinal = this.f27881jyumaefscl.ordinal();
                this.f27883zdlpuopuiu = 1;
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
        final /* synthetic */ MainTab f27884jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f27885yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ikoacuggdj f27886zdlpuopuiu;

        static final class iobyxmoadg implements oxmwwwfdhm {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ MainTab f27887yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ tg.draadjrbmk f27888zdlpuopuiu;

            iobyxmoadg(tg.draadjrbmk draadjrbmkVar, MainTab mainTab) {
                this.f27888zdlpuopuiu = draadjrbmkVar;
                this.f27887yggfygwlhe = mainTab;
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
                    jyumaefscl.ntlheqmsrt(1687021025, i14, -1, "ru.myspar.proloyalty.main_activity.impl.compose.tab_container.TabContainer.<anonymous>.<anonymous> (TabContainer.kt:66)");
                }
                boolean z13 = true;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = cdpycssgdh.gxszxtbevo(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
                Bundle bundle = new Bundle();
                bundle.putParcelable("tab_name", (Parcelable) MainTab.nufgyqmvbu().get(i13));
                draadjrbmkVar.sopmlzcsov(-18445373);
                boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f27888zdlpuopuiu);
                if ((((i14 & 112) ^ 48) <= 32 || !draadjrbmkVar.ppxfxbqfkf(i13)) && (i14 & 48) != 32) {
                    z13 = false;
                }
                boolean zUlzqkzuiru2 = zUlzqkzuiru | z13 | draadjrbmkVar.ulzqkzuiru(this.f27887yggfygwlhe);
                final tg.draadjrbmk draadjrbmkVar2 = this.f27888zdlpuopuiu;
                final MainTab mainTab = this.f27887yggfygwlhe;
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru2 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: dd1.gxszxtbevo
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wkgbmnqykc.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(draadjrbmkVar2, i13, mainTab, (TabContainerFragment) obj);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(-299695478);
                e31.rgvfuqvkyq.lqeggnwhkg(TabContainerFragment.class, wkgbmnqykcVarGxszxtbevo, e31.rgvfuqvkyq.agtfadlqog(draadjrbmkVar, 0), bundle, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVar, 48, 0);
                draadjrbmkVar.stevsuqkhv();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
        }

        ppxfxbqfkf(ikoacuggdj ikoacuggdjVar, tg.draadjrbmk draadjrbmkVar, MainTab mainTab) {
            this.f27886zdlpuopuiu = ikoacuggdjVar;
            this.f27885yggfygwlhe = draadjrbmkVar;
            this.f27884jyumaefscl = mainTab;
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
                jyumaefscl.ntlheqmsrt(-710687776, i14, -1, "ru.myspar.proloyalty.main_activity.impl.compose.tab_container.TabContainer.<anonymous> (TabContainer.kt:54)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = cdpycssgdh.gxszxtbevo(ipoelvxyzq.iobyxmoadg(ipoelvxyzq.zoijcleaow(esjtqupxsv.draadjrbmk(fyldjkxazc.ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, innerPadding), innerPadding))), 0.0f, 1, null);
            int size = MainTab.nufgyqmvbu().size();
            ikoacuggdj ikoacuggdjVar = this.f27886zdlpuopuiu;
            draadjrbmkVar.sopmlzcsov(-2014552147);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: dd1.eablkybsjg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return wkgbmnqykc.ppxfxbqfkf.ppxfxbqfkf(((Integer) obj).intValue());
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            zynmafqrjb.lqeggnwhkg(ikoacuggdjVar, wkgbmnqykcVarGxszxtbevo, null, null, size, 0.0f, null, null, false, false, (tg.draadjrbmk) objYadqdtsiqt, null, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1687021025, true, new iobyxmoadg(this.f27885yggfygwlhe, this.f27884jyumaefscl), draadjrbmkVar, 54), draadjrbmkVar, 100663296, 24582, 15084);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class zoijcleaow implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ int f27889cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f27890esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ int f27891iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ int f27892jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ MainTab f27893yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ boolean f27894zdlpuopuiu;

        zoijcleaow(boolean z13, MainTab mainTab, int i13, int i14, int i15, tg.draadjrbmk draadjrbmkVar) {
            this.f27894zdlpuopuiu = z13;
            this.f27893yggfygwlhe = mainTab;
            this.f27892jyumaefscl = i13;
            this.f27891iwizpuwonk = i14;
            this.f27889cqumvgiudr = i15;
            this.f27890esjtqupxsv = draadjrbmkVar;
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
                jyumaefscl.ntlheqmsrt(1674623976, i13, -1, "ru.myspar.proloyalty.main_activity.impl.compose.tab_container.TabContainer.<anonymous> (TabContainer.kt:44)");
            }
            dxjokdxxww.ppxfxbqfkf(ojitshcjhn.iobyxmoadg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, this.f27894zdlpuopuiu ? 0.0f : 1.0f), this.f27893yggfygwlhe, this.f27892jyumaefscl, this.f27891iwizpuwonk, this.f27889cqumvgiudr, this.f27890esjtqupxsv, draadjrbmkVar, 0, 0);
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
    public static final wwaezpbzkn lqeggnwhkg(MainTab mainTab, int i13, int i14, int i15, tg.draadjrbmk draadjrbmkVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, tg.draadjrbmk draadjrbmkVar2, int i16, int i17, androidx.compose.runtime.draadjrbmk draadjrbmkVar3, int i18) {
        wkgbmnqykc(mainTab, i13, i14, i15, draadjrbmkVar, wkgbmnqykcVar, z13, draadjrbmkVar2, draadjrbmkVar3, f.iobyxmoadg(i16 | 1), i17);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0130  */
    /* JADX WARN: Code duplicated, block: B:103:0x0140  */
    /* JADX WARN: Code duplicated, block: B:106:0x0148  */
    /* JADX WARN: Code duplicated, block: B:109:0x0163  */
    /* JADX WARN: Code duplicated, block: B:112:0x018f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0197  */
    /* JADX WARN: Code duplicated, block: B:117:0x019d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0212  */
    /* JADX WARN: Code duplicated, block: B:124:0x021d  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0117  */
    /* JADX WARN: Code duplicated, block: B:97:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    public static final void wkgbmnqykc(final MainTab selectedTab, final int i13, final int i14, final int i15, final tg.draadjrbmk getScreen, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i16, final int i17) {
        int i18;
        int i19;
        boolean z14;
        int i23;
        int i24;
        tg.draadjrbmk draadjrbmkVar3;
        int i25;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        boolean z15;
        tg.draadjrbmk draadjrbmkVar4;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar;
        ikoacuggdj ikoacuggdjVarAgtfadlqog;
        boolean zUlzqkzuiru;
        Object objYadqdtsiqt2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar5;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        Object objYadqdtsiqt3;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(selectedTab, "selectedTab");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getScreen, "getScreen");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-1426115038);
        if ((i17 & 1) != 0) {
            i18 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            i18 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(selectedTab) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i17 & 2) != 0) {
            i18 |= 48;
        } else if ((i16 & 48) == 0) {
            i18 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 32 : 16;
        }
        if ((i17 & 4) != 0) {
            i18 |= 384;
        } else if ((i16 & 384) == 0) {
            i18 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i14) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i17 & 8) != 0) {
            i18 |= 3072;
        } else if ((i16 & 3072) == 0) {
            i18 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i15) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i17 & 16) != 0) {
            i18 |= 24576;
        } else if ((i16 & 24576) == 0) {
            i18 |= draadjrbmkVarBtonecajqb.lmojexxdyd(getScreen) ? 16384 : 8192;
        }
        int i26 = i17 & 32;
        if (i26 == 0) {
            if ((196608 & i16) == 0) {
                i18 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 131072 : 65536;
            }
            i19 = i17 & 64;
            if (i19 != 0) {
                if ((1572864 & i16) == 0) {
                    z14 = z13;
                    if (draadjrbmkVarBtonecajqb.iobyxmoadg(z14)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i18 |= i23;
                }
                i24 = i17 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i24 != 0) {
                    i18 |= 12582912;
                    draadjrbmkVar3 = draadjrbmkVar;
                } else {
                    draadjrbmkVar3 = draadjrbmkVar;
                    if ((i16 & 12582912) == 0) {
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i18 |= i25;
                    }
                }
                if ((i18 & 4793491) == 4793490 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                    if (i26 != 0) {
                        wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar2 = wkgbmnqykcVar;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    } else {
                        z15 = z14;
                    }
                    if (i24 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1670767402);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: dd1.iobyxmoadg
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
                        jyumaefscl.ntlheqmsrt(-1426115038, i18, -1, "ru.myspar.proloyalty.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:34)");
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1670769344);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.iobyxmoadg() { // from class: dd1.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    int i27 = i18;
                    ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1670771268);
                    int i28 = i27 & 14;
                    zUlzqkzuiru = (i28 == 4) | draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt2 = new iobyxmoadg(ikoacuggdjVarAgtfadlqog, selectedTab, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.eablkybsjg(selectedTab, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, i28);
                    draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                    s2.nufgyqmvbu(wkgbmnqykcVar2, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1674623976, true, new zoijcleaow(z15, selectedTab, i13, i14, i15, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-710687776, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i27 >> 15) & 14) | 3072, 12582912, 131062);
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    wkgbmnqykcVar3 = wkgbmnqykcVar;
                    z15 = z14;
                    draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    final boolean z16 = z15;
                    final tg.draadjrbmk draadjrbmkVar6 = draadjrbmkVar4;
                    a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: dd1.ppxfxbqfkf
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return wkgbmnqykc.lqeggnwhkg(selectedTab, i13, i14, i15, getScreen, wkgbmnqykcVar3, z16, draadjrbmkVar6, i16, i17, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 1572864;
            z14 = z13;
            i24 = i17 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i24 != 0) {
                i18 |= 12582912;
                draadjrbmkVar3 = draadjrbmkVar;
            } else {
                draadjrbmkVar3 = draadjrbmkVar;
                if ((i16 & 12582912) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i18 |= i25;
                }
            }
            if ((i18 & 4793491) == 4793490) {
                if (i26 != 0) {
                    wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar2 = wkgbmnqykcVar;
                }
                if (i19 != 0) {
                    z15 = false;
                } else {
                    z15 = z14;
                }
                if (i24 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1670767402);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: dd1.iobyxmoadg
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
                    jyumaefscl.ntlheqmsrt(-1426115038, i18, -1, "ru.myspar.proloyalty.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:34)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1670769344);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: dd1.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                int i29 = i18;
                ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1670771268);
                int i210 = i29 & 14;
                zUlzqkzuiru = (i210 == 4) | draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog);
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
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                s2.nufgyqmvbu(wkgbmnqykcVar2, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1674623976, true, new zoijcleaow(z15, selectedTab, i13, i14, i15, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-710687776, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i29 >> 15) & 14) | 3072, 12582912, 131062);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            } else {
                if (i26 != 0) {
                    wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar2 = wkgbmnqykcVar;
                }
                if (i19 != 0) {
                    z15 = false;
                } else {
                    z15 = z14;
                }
                if (i24 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1670767402);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: dd1.iobyxmoadg
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
                    jyumaefscl.ntlheqmsrt(-1426115038, i18, -1, "ru.myspar.proloyalty.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:34)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1670769344);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: dd1.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                int i211 = i18;
                ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1670771268);
                int i212 = i211 & 14;
                zUlzqkzuiru = (i212 == 4) | draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog);
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
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                s2.nufgyqmvbu(wkgbmnqykcVar2, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1674623976, true, new zoijcleaow(z15, selectedTab, i13, i14, i15, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-710687776, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i211 >> 15) & 14) | 3072, 12582912, 131062);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final boolean z17 = z15;
                final tg.draadjrbmk draadjrbmkVar7 = draadjrbmkVar4;
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: dd1.ppxfxbqfkf
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return wkgbmnqykc.lqeggnwhkg(selectedTab, i13, i14, i15, getScreen, wkgbmnqykcVar3, z17, draadjrbmkVar7, i16, i17, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 196608;
        i19 = i17 & 64;
        if (i19 != 0) {
            if ((1572864 & i16) == 0) {
                z14 = z13;
                if (draadjrbmkVarBtonecajqb.iobyxmoadg(z14)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i18 |= i23;
            }
            i24 = i17 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i24 != 0) {
                i18 |= 12582912;
                draadjrbmkVar3 = draadjrbmkVar;
            } else {
                draadjrbmkVar3 = draadjrbmkVar;
                if ((i16 & 12582912) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i18 |= i25;
                }
            }
            if ((i18 & 4793491) == 4793490) {
                if (i26 != 0) {
                    wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar2 = wkgbmnqykcVar;
                }
                if (i19 != 0) {
                    z15 = false;
                } else {
                    z15 = z14;
                }
                if (i24 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1670767402);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: dd1.iobyxmoadg
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
                    jyumaefscl.ntlheqmsrt(-1426115038, i18, -1, "ru.myspar.proloyalty.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:34)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1670769344);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: dd1.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                int i213 = i18;
                ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1670771268);
                int i214 = i213 & 14;
                zUlzqkzuiru = (i214 == 4) | draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog);
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
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                s2.nufgyqmvbu(wkgbmnqykcVar2, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1674623976, true, new zoijcleaow(z15, selectedTab, i13, i14, i15, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-710687776, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i213 >> 15) & 14) | 3072, 12582912, 131062);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            } else {
                if (i26 != 0) {
                    wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar2 = wkgbmnqykcVar;
                }
                if (i19 != 0) {
                    z15 = false;
                } else {
                    z15 = z14;
                }
                if (i24 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1670767402);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: dd1.iobyxmoadg
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
                    jyumaefscl.ntlheqmsrt(-1426115038, i18, -1, "ru.myspar.proloyalty.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:34)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1670769344);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: dd1.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                int i215 = i18;
                ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1670771268);
                int i216 = i215 & 14;
                zUlzqkzuiru = (i216 == 4) | draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog);
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
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                s2.nufgyqmvbu(wkgbmnqykcVar2, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1674623976, true, new zoijcleaow(z15, selectedTab, i13, i14, i15, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-710687776, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i215 >> 15) & 14) | 3072, 12582912, 131062);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final boolean z18 = z15;
                final tg.draadjrbmk draadjrbmkVar8 = draadjrbmkVar4;
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: dd1.ppxfxbqfkf
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return wkgbmnqykc.lqeggnwhkg(selectedTab, i13, i14, i15, getScreen, wkgbmnqykcVar3, z18, draadjrbmkVar8, i16, i17, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 1572864;
        z14 = z13;
        i24 = i17 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i24 != 0) {
            i18 |= 12582912;
            draadjrbmkVar3 = draadjrbmkVar;
        } else {
            draadjrbmkVar3 = draadjrbmkVar;
            if ((i16 & 12582912) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i18 |= i25;
            }
        }
        if ((i18 & 4793491) == 4793490) {
            if (i26 != 0) {
                wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
            }
            if (i19 != 0) {
                z15 = false;
            } else {
                z15 = z14;
            }
            if (i24 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1670767402);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: dd1.iobyxmoadg
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
                jyumaefscl.ntlheqmsrt(-1426115038, i18, -1, "ru.myspar.proloyalty.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:34)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1670769344);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: dd1.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            int i217 = i18;
            ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1670771268);
            int i218 = i217 & 14;
            zUlzqkzuiru = (i218 == 4) | draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog);
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
            draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            s2.nufgyqmvbu(wkgbmnqykcVar2, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1674623976, true, new zoijcleaow(z15, selectedTab, i13, i14, i15, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-710687776, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i217 >> 15) & 14) | 3072, 12582912, 131062);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
        } else {
            if (i26 != 0) {
                wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
            }
            if (i19 != 0) {
                z15 = false;
            } else {
                z15 = z14;
            }
            if (i24 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1670767402);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: dd1.iobyxmoadg
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
                jyumaefscl.ntlheqmsrt(-1426115038, i18, -1, "ru.myspar.proloyalty.main_activity.impl.compose.tab_container.TabContainer (TabContainer.kt:34)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1670769344);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: dd1.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Integer.valueOf(wkgbmnqykc.gxszxtbevo());
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            int i219 = i18;
            ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1670771268);
            int i2110 = i219 & 14;
            zUlzqkzuiru = (i2110 == 4) | draadjrbmkVarBtonecajqb.ulzqkzuiru(ikoacuggdjVarAgtfadlqog);
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
            draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            s2.nufgyqmvbu(wkgbmnqykcVar2, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1674623976, true, new zoijcleaow(z15, selectedTab, i13, i14, i15, draadjrbmkVar4), draadjrbmkVarBtonecajqb, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-710687776, true, new ppxfxbqfkf(ikoacuggdjVarAgtfadlqog, getScreen, selectedTab), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar5, ((i219 >> 15) & 14) | 3072, 12582912, 131062);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
        }
        a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final boolean z19 = z15;
            final tg.draadjrbmk draadjrbmkVar9 = draadjrbmkVar4;
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: dd1.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return wkgbmnqykc.lqeggnwhkg(selectedTab, i13, i14, i15, getScreen, wkgbmnqykcVar3, z19, draadjrbmkVar9, i16, i17, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
