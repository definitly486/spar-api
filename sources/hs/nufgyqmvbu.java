package hs;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.ui.platform.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.tbqsvytpvh;
import czzsidtyhn.ydmasvzmpa;
import gg.wwaezpbzkn;
import igdgnonuha.lereixgezr;
import igdgnonuha.w6;
import igdgnonuha.z;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.geo.api.models.City;
import x.zynmafqrjb;
import yfnezrywwk.jpowsppfya;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nufgyqmvbu {

    public static final class eablkybsjg implements tg.oxmwwwfdhm {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f41005yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f41006zdlpuopuiu;

        public eablkybsjg(List list, tg.draadjrbmk draadjrbmkVar) {
            this.f41006zdlpuopuiu = list;
            this.f41005yggfygwlhe = draadjrbmkVar;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            iobyxmoadg((yfnezrywwk.eablkybsjg) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.draadjrbmk) obj3, ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(yfnezrywwk.eablkybsjg eablkybsjgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (draadjrbmkVar.ulzqkzuiru(eablkybsjgVar) ? 4 : 2);
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
                jyumaefscl.ntlheqmsrt(2039820996, i15, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            City city = (City) this.f41006zdlpuopuiu.get(i13);
            draadjrbmkVar.sopmlzcsov(-404203149);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj = l50.draadjrbmk.pmvmpeiblj(yfnezrywwk.eablkybsjg.iobyxmoadg(eablkybsjgVar, androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, null, null, null, 7, null), "cityItem", Integer.valueOf(i13), null, false, 12, null);
            float f13 = 0;
            float fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(f13);
            igdgnonuha.jyumaefscl jyumaefsclVar = igdgnonuha.jyumaefscl.f43186iobyxmoadg;
            ydmasvzmpa ydmasvzmpaVarNufgyqmvbu = esjtqupxsv.nufgyqmvbu(fLqeggnwhkg, jyumaefsclVar.ppxfxbqfkf().wkgbmnqykc(), w0.nufgyqmvbu.lqeggnwhkg(f13), jyumaefsclVar.ppxfxbqfkf().iobyxmoadg());
            draadjrbmkVar.sopmlzcsov(-705759907);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f41005yggfygwlhe) | draadjrbmkVar.lmojexxdyd(city);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(this.f41005yggfygwlhe, city);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            lereixgezr.nufgyqmvbu((tg.iobyxmoadg) objYadqdtsiqt, wkgbmnqykcVarPmvmpeiblj, false, null, null, null, null, null, ydmasvzmpaVarNufgyqmvbu, ezmngbhpjk.nufgyqmvbu.eablkybsjg(339073382, true, new zoijcleaow(city), draadjrbmkVar, 54), draadjrbmkVar, 805306368, 252);
            draadjrbmkVar.stevsuqkhv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class iobyxmoadg implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ City f41007yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f41008zdlpuopuiu;

        iobyxmoadg(tg.draadjrbmk draadjrbmkVar, City city) {
            this.f41008zdlpuopuiu = draadjrbmkVar;
            this.f41007yggfygwlhe = city;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f41008zdlpuopuiu.invoke(this.f41007yggfygwlhe);
        }
    }

    public static final class ppxfxbqfkf implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f41009yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f41010zdlpuopuiu;

        public ppxfxbqfkf(tg.rgvfuqvkyq rgvfuqvkyqVar, List list) {
            this.f41010zdlpuopuiu = rgvfuqvkyqVar;
            this.f41009yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f41010zdlpuopuiu.invoke(Integer.valueOf(i13), this.f41009yggfygwlhe.get(i13));
        }
    }

    public static final class wkgbmnqykc implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f41011zdlpuopuiu;

        public wkgbmnqykc(List list) {
            this.f41011zdlpuopuiu = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            this.f41011zdlpuopuiu.get(i13);
            return null;
        }
    }

    static final class zoijcleaow implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ City f41012zdlpuopuiu;

        zoijcleaow(City city) {
            this.f41012zdlpuopuiu = city;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((tbqsvytpvh) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(tbqsvytpvh TextButton, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            zdlpuopuiu.btonecajqb(TextButton, "$this$TextButton");
            if ((i13 & 17) == 16 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(339073382, i13, -1, "ru.myspar.cities.impl.check_city.presentation.compose.CheckCityDialogCityList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckCityDialogCityList.kt:59)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null);
            City city = this.f41012zdlpuopuiu;
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar2.ojitshcjhn(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, wkgbmnqykcVarNufgyqmvbu);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVar.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar.pkzmftpjix();
            if (draadjrbmkVar.lqeggnwhkg()) {
                draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVar.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVar);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj = l50.draadjrbmk.pmvmpeiblj(androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg.wkgbmnqykc(iobyxmoadgVar, iobyxmoadgVar2.nufgyqmvbu()), "tvName", null, null, false, 14, null);
            String name = city.getName();
            z zVar = z.f44180iobyxmoadg;
            int i14 = z.f44181zoijcleaow;
            w6.btonecajqb(name, wkgbmnqykcVarPmvmpeiblj, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar, i14).cqumvgiudr(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVar, i14).zoijcleaow().ojitshcjhn(), draadjrbmkVar, 0, 0, 65528);
            draadjrbmkVar.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(czzsidtyhn.rgvfuqvkyq rgvfuqvkyqVar, List list, tg.draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        eablkybsjg(rgvfuqvkyqVar, list, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x010f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0119  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void eablkybsjg(final czzsidtyhn.rgvfuqvkyq rgvfuqvkyqVar, final List cities, tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13, final int i14) {
        int i15;
        tg.draadjrbmk draadjrbmkVar3;
        int i16;
        final tg.draadjrbmk draadjrbmkVar4;
        boolean zLmojexxdyd;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar5;
        final tg.draadjrbmk draadjrbmkVar6;
        Object objYadqdtsiqt2;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(rgvfuqvkyqVar, "<this>");
        zdlpuopuiu.btonecajqb(cities, "cities");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(432298653);
        if ((i14 & Integer.MIN_VALUE) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(rgvfuqvkyqVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 1) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(cities) ? 32 : 16;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                draadjrbmkVar3 = draadjrbmkVar;
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i16 = i15;
            if ((i16 & 147) == 146 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-763323024);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: hs.wkgbmnqykc
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return nufgyqmvbu.gxszxtbevo((City) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt2;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(432298653, i16, -1, "ru.myspar.cities.impl.check_city.presentation.compose.CheckCityDialogCityList (CheckCityDialogCityList.kt:34)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(rgvfuqvkyqVar, androidx.compose.ui.input.nestedscroll.iobyxmoadg.zoijcleaow(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, b.nufgyqmvbu(null, draadjrbmkVarBtonecajqb, 0, 1), null, 2, null), 1.0f, false, 2, null);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-763316984);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(cities) | ((i16 & 896) == 256);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: hs.eablkybsjg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return nufgyqmvbu.lqeggnwhkg(cities, draadjrbmkVar4, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.draadjrbmk draadjrbmkVar7 = draadjrbmkVar4;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                yfnezrywwk.wkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVarPpxfxbqfkf, null, null, false, null, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVar5, 0, 510);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                draadjrbmkVar6 = draadjrbmkVar7;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVar6 = draadjrbmkVar3;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: hs.gxszxtbevo
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return nufgyqmvbu.dxjokdxxww(rgvfuqvkyqVar, cities, draadjrbmkVar6, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        draadjrbmkVar3 = draadjrbmkVar;
        i16 = i15;
        if ((i16 & 147) == 146) {
            if (i17 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-763323024);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: hs.wkgbmnqykc
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return nufgyqmvbu.gxszxtbevo((City) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt2;
            } else {
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(432298653, i16, -1, "ru.myspar.cities.impl.check_city.presentation.compose.CheckCityDialogCityList (CheckCityDialogCityList.kt:34)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf2 = czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(rgvfuqvkyqVar, androidx.compose.ui.input.nestedscroll.iobyxmoadg.zoijcleaow(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, b.nufgyqmvbu(null, draadjrbmkVarBtonecajqb, 0, 1), null, 2, null), 1.0f, false, 2, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-763316984);
            zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(cities) | ((i16 & 896) == 256);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: hs.eablkybsjg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return nufgyqmvbu.lqeggnwhkg(cities, draadjrbmkVar4, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: hs.eablkybsjg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return nufgyqmvbu.lqeggnwhkg(cities, draadjrbmkVar4, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tg.draadjrbmk draadjrbmkVar8 = draadjrbmkVar4;
            draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            yfnezrywwk.wkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVarPpxfxbqfkf2, null, null, false, null, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVar5, 0, 510);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar6 = draadjrbmkVar8;
        } else {
            if (i17 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-763323024);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: hs.wkgbmnqykc
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return nufgyqmvbu.gxszxtbevo((City) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt2;
            } else {
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(432298653, i16, -1, "ru.myspar.cities.impl.check_city.presentation.compose.CheckCityDialogCityList (CheckCityDialogCityList.kt:34)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf3 = czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(rgvfuqvkyqVar, androidx.compose.ui.input.nestedscroll.iobyxmoadg.zoijcleaow(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, b.nufgyqmvbu(null, draadjrbmkVarBtonecajqb, 0, 1), null, 2, null), 1.0f, false, 2, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-763316984);
            zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(cities) | ((i16 & 896) == 256);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: hs.eablkybsjg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return nufgyqmvbu.lqeggnwhkg(cities, draadjrbmkVar4, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: hs.eablkybsjg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return nufgyqmvbu.lqeggnwhkg(cities, draadjrbmkVar4, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tg.draadjrbmk draadjrbmkVar9 = draadjrbmkVar4;
            draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            yfnezrywwk.wkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVarPpxfxbqfkf3, null, null, false, null, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVar5, 0, 510);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar6 = draadjrbmkVar9;
        }
        a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: hs.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return nufgyqmvbu.dxjokdxxww(rgvfuqvkyqVar, cities, draadjrbmkVar6, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(City it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(List list, tg.draadjrbmk draadjrbmkVar, jpowsppfya LazyColumn) {
        zdlpuopuiu.btonecajqb(LazyColumn, "$this$LazyColumn");
        LazyColumn.nufgyqmvbu(list.size(), new ppxfxbqfkf(new tg.rgvfuqvkyq() { // from class: hs.lqeggnwhkg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return nufgyqmvbu.nufgyqmvbu(((Integer) obj).intValue(), (City) obj2);
            }
        }, list), new wkgbmnqykc(list), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(2039820996, true, new eablkybsjg(list, draadjrbmkVar)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object nufgyqmvbu(int i13, City item) {
        zdlpuopuiu.btonecajqb(item, "item");
        return item.getId();
    }
}
