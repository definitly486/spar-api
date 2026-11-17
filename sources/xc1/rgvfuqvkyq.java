package xc1;

import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.ui.layout.kcexrzcfyt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.tbqsvytpvh;
import gg.wwaezpbzkn;
import h.bfopjjpdmp;
import h.oipsdeybqn;
import igdgnonuha.crxdokpmqz;
import igdgnonuha.jlmebxxoox;
import igdgnonuha.k2;
import igdgnonuha.ulzqkzuiru;
import igdgnonuha.w6;
import igdgnonuha.z;
import j0.n;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.vdvldrhtss;
import vipkmwdibw.fmlbqenlif;
import vipkmwdibw.lmojexxdyd;
import x.istkbnxepw;
import x.pmvmpeiblj;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final fmlbqenlif f122118iobyxmoadg = new fmlbqenlif(300, 0, lmojexxdyd.ppxfxbqfkf(), 2, null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final float f122121zoijcleaow = w0.nufgyqmvbu.lqeggnwhkg(56);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final float f122119ppxfxbqfkf = w0.nufgyqmvbu.lqeggnwhkg(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final float f122120wkgbmnqykc = w0.nufgyqmvbu.lqeggnwhkg(12);

    static final class iobyxmoadg implements zynmafqrjb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f122122iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ float f122123zoijcleaow;

        iobyxmoadg(tg.rgvfuqvkyq rgvfuqvkyqVar, float f13) {
            this.f122122iobyxmoadg = rgvfuqvkyqVar;
            this.f122123zoijcleaow = f13;
        }

        @Override // x.zynmafqrjb
        public final istkbnxepw lqeggnwhkg(androidx.compose.ui.layout.draadjrbmk Layout, List measurables, long j13) {
            kcexrzcfyt kcexrzcfytVarSflfametgt;
            zdlpuopuiu.btonecajqb(Layout, "$this$Layout");
            zdlpuopuiu.btonecajqb(measurables, "measurables");
            int size = measurables.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                pmvmpeiblj pmvmpeibljVar = (pmvmpeiblj) measurables.get(i14);
                if (zdlpuopuiu.eablkybsjg(androidx.compose.ui.layout.nufgyqmvbu.iobyxmoadg(pmvmpeibljVar), "icon")) {
                    kcexrzcfyt kcexrzcfytVarSflfametgt2 = pmvmpeibljVar.sflfametgt(j13);
                    if (this.f122122iobyxmoadg != null) {
                        int size2 = measurables.size();
                        while (true) {
                            if (i13 >= size2) {
                                y0.ppxfxbqfkf.gxszxtbevo("Collection contains no element matching the predicate.");
                                throw new KotlinNothingValueException();
                            }
                            pmvmpeiblj pmvmpeibljVar2 = (pmvmpeiblj) measurables.get(i13);
                            if (zdlpuopuiu.eablkybsjg(androidx.compose.ui.layout.nufgyqmvbu.iobyxmoadg(pmvmpeibljVar2), "label")) {
                                kcexrzcfytVarSflfametgt = pmvmpeibljVar2.sflfametgt(w0.zoijcleaow.wkgbmnqykc(j13, 0, 0, 0, 0, 11, null));
                                break;
                            }
                            i13++;
                        }
                    } else {
                        kcexrzcfytVarSflfametgt = null;
                    }
                    if (this.f122122iobyxmoadg == null) {
                        return rgvfuqvkyq.vdvldrhtss(Layout, kcexrzcfytVarSflfametgt2, j13);
                    }
                    zdlpuopuiu.lqeggnwhkg(kcexrzcfytVarSflfametgt);
                    return rgvfuqvkyq.kcexrzcfyt(Layout, kcexrzcfytVarSflfametgt, kcexrzcfytVarSflfametgt2, j13, this.f122123zoijcleaow);
                }
            }
            y0.ppxfxbqfkf.gxszxtbevo("Collection contains no element matching the predicate.");
            throw new KotlinNothingValueException();
        }
    }

    static final class ppxfxbqfkf implements vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f122124jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f122125yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ boolean f122126zdlpuopuiu;

        ppxfxbqfkf(boolean z13, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.rgvfuqvkyq rgvfuqvkyqVar2) {
            this.f122126zdlpuopuiu = z13;
            this.f122125yggfygwlhe = rgvfuqvkyqVar;
            this.f122124jyumaefscl = rgvfuqvkyqVar2;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg(((Number) obj).floatValue(), (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(float f13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 6) == 0) {
                i13 |= draadjrbmkVar.zoijcleaow(f13) ? 4 : 2;
            }
            if ((i13 & 19) == 18 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-928001012, i13, -1, "ru.myspar.proloyalty.main_activity.impl.compose.bottom_bar.CustomBottomNavigationItem.<anonymous>.<anonymous> (CustomBottomNavigationItem.kt:119)");
            }
            if (this.f122126zdlpuopuiu) {
                f13 = 1.0f;
            }
            rgvfuqvkyq.gxszxtbevo(this.f122125yggfygwlhe, this.f122124jyumaefscl, f13, draadjrbmkVar, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class wkgbmnqykc implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f122127zdlpuopuiu;

        wkgbmnqykc(tg.rgvfuqvkyq rgvfuqvkyqVar) {
            this.f122127zdlpuopuiu = rgvfuqvkyqVar;
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
                jyumaefscl.ntlheqmsrt(1041602428, i13, -1, "ru.myspar.proloyalty.main_activity.impl.compose.bottom_bar.CustomBottomNavigationItem.<anonymous>.<anonymous> (CustomBottomNavigationItem.kt:94)");
            }
            n nVarWkgbmnqykc = z.f44180iobyxmoadg.ppxfxbqfkf(draadjrbmkVar, z.f44181zoijcleaow).wkgbmnqykc();
            w6.nufgyqmvbu(nVarWkgbmnqykc.zoijcleaow((16777183 & 1) != 0 ? nVarWkgbmnqykc.f50294iobyxmoadg.lqeggnwhkg() : 0L, (16777183 & 2) != 0 ? nVarWkgbmnqykc.f50294iobyxmoadg.gtknphoqwx() : 0L, (16777183 & 4) != 0 ? nVarWkgbmnqykc.f50294iobyxmoadg.agtfadlqog() : null, (16777183 & 8) != 0 ? nVarWkgbmnqykc.f50294iobyxmoadg.draadjrbmk() : null, (16777183 & 16) != 0 ? nVarWkgbmnqykc.f50294iobyxmoadg.wflxmlrfwp() : null, (16777183 & 32) != 0 ? nVarWkgbmnqykc.f50294iobyxmoadg.dxjokdxxww() : null, (16777183 & 64) != 0 ? nVarWkgbmnqykc.f50294iobyxmoadg.btonecajqb() : null, (16777183 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nVarWkgbmnqykc.f50294iobyxmoadg.ojitshcjhn() : 0L, (16777183 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? nVarWkgbmnqykc.f50294iobyxmoadg.eablkybsjg() : null, (16777183 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? nVarWkgbmnqykc.f50294iobyxmoadg.yggfygwlhe() : null, (16777183 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? nVarWkgbmnqykc.f50294iobyxmoadg.rgvfuqvkyq() : null, (16777183 & 2048) != 0 ? nVarWkgbmnqykc.f50294iobyxmoadg.wkgbmnqykc() : 0L, (16777183 & 4096) != 0 ? nVarWkgbmnqykc.f50294iobyxmoadg.kcexrzcfyt() : null, (16777183 & 8192) != 0 ? nVarWkgbmnqykc.f50294iobyxmoadg.oxmwwwfdhm() : null, (16777183 & 16384) != 0 ? nVarWkgbmnqykc.f50294iobyxmoadg.nufgyqmvbu() : null, (16777183 & 32768) != 0 ? nVarWkgbmnqykc.f50296zoijcleaow.nufgyqmvbu() : v0.btonecajqb.f114934zoijcleaow.iobyxmoadg(), (16777183 & 65536) != 0 ? nVarWkgbmnqykc.f50296zoijcleaow.dxjokdxxww() : 0, (16777183 & 131072) != 0 ? nVarWkgbmnqykc.f50296zoijcleaow.eablkybsjg() : 0L, (16777183 & 262144) != 0 ? nVarWkgbmnqykc.f50296zoijcleaow.btonecajqb() : null, (16777183 & 524288) != 0 ? nVarWkgbmnqykc.f50295ppxfxbqfkf : null, (16777183 & 1048576) != 0 ? nVarWkgbmnqykc.f50296zoijcleaow.gxszxtbevo() : null, (16777183 & 2097152) != 0 ? nVarWkgbmnqykc.f50296zoijcleaow.wkgbmnqykc() : 0, (16777183 & 4194304) != 0 ? nVarWkgbmnqykc.f50296zoijcleaow.ppxfxbqfkf() : 0, (16777183 & 8388608) != 0 ? nVarWkgbmnqykc.f50296zoijcleaow.gtknphoqwx() : null), this.f122127zdlpuopuiu, draadjrbmkVar, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class zoijcleaow implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ i1 f122128yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ vdvldrhtss f122129zdlpuopuiu;

        zoijcleaow(vdvldrhtss vdvldrhtssVar, i1 i1Var) {
            this.f122129zdlpuopuiu = vdvldrhtssVar;
            this.f122128yggfygwlhe = i1Var;
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
                jyumaefscl.ntlheqmsrt(961022235, i13, -1, "ru.myspar.proloyalty.main_activity.impl.compose.bottom_bar.BottomNavigationTransition.<anonymous> (CustomBottomNavigationItem.kt:160)");
            }
            this.f122129zdlpuopuiu.invoke(Float.valueOf(rgvfuqvkyq.dxjokdxxww(this.f122128yggfygwlhe)), draadjrbmkVar, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(long j13, long j14, boolean z13, vdvldrhtss vdvldrhtssVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        nufgyqmvbu(j13, j14, z13, vdvldrhtssVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(tbqsvytpvh tbqsvytpvhVar, boolean z13, tg.iobyxmoadg iobyxmoadgVar, tg.rgvfuqvkyq rgvfuqvkyqVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z14, tg.rgvfuqvkyq rgvfuqvkyqVar2, boolean z15, metgxyhuhe.draadjrbmk draadjrbmkVar, long j13, long j14, int i13, int i14, int i15, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i16) {
        gtknphoqwx(tbqsvytpvhVar, z13, iobyxmoadgVar, rgvfuqvkyqVar, wkgbmnqykcVar, z14, rgvfuqvkyqVar2, z15, draadjrbmkVar, j13, j14, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), f.iobyxmoadg(i14), i15);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float dxjokdxxww(i1 i1Var) {
        return ((Number) i1Var.getValue()).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x013b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0141  */
    /* JADX WARN: Code duplicated, block: B:115:0x0157  */
    /* JADX WARN: Code duplicated, block: B:124:0x017f  */
    /* JADX WARN: Code duplicated, block: B:126:0x018c  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01af  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:153:0x01da  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:157:0x0206  */
    /* JADX WARN: Code duplicated, block: B:160:0x0212  */
    /* JADX WARN: Code duplicated, block: B:163:0x0222  */
    /* JADX WARN: Code duplicated, block: B:165:0x0227  */
    /* JADX WARN: Code duplicated, block: B:168:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:171:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:172:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:175:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:180:0x0331  */
    /* JADX WARN: Code duplicated, block: B:184:0x0343  */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0105  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0110  */
    /* JADX WARN: Code duplicated, block: B:91:0x0116  */
    /* JADX WARN: Code duplicated, block: B:92:0x0119  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    public static final void gtknphoqwx(final tbqsvytpvh CustomBottomNavigationItem, final boolean z13, final tg.iobyxmoadg onClick, final tg.rgvfuqvkyq icon, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z14, tg.rgvfuqvkyq rgvfuqvkyqVar, boolean z15, metgxyhuhe.draadjrbmk draadjrbmkVar, long j13, long j14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13, final int i14, final int i15) {
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i17;
        boolean z16;
        int i18;
        int i19;
        tg.rgvfuqvkyq rgvfuqvkyqVar2;
        int i23;
        int i24;
        final boolean z17;
        int i25;
        int i26;
        int i27;
        int i28;
        ezmngbhpjk.zoijcleaow zoijcleaowVarEablkybsjg;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        metgxyhuhe.draadjrbmk draadjrbmkVar3;
        long jIwizpuwonk;
        long jWflxmlrfwp;
        int i29;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        final tg.rgvfuqvkyq rgvfuqvkyqVar3;
        long j15;
        final metgxyhuhe.draadjrbmk draadjrbmkVar4;
        final boolean z18;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(CustomBottomNavigationItem, "$this$CustomBottomNavigationItem");
        zdlpuopuiu.btonecajqb(onClick, "onClick");
        zdlpuopuiu.btonecajqb(icon, "icon");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-944882480);
        if ((Integer.MIN_VALUE & i15) != 0) {
            i16 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i16 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(CustomBottomNavigationItem) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i15 & 1) != 0) {
            i16 |= 48;
        } else if ((i13 & 48) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 32 : 16;
        }
        if ((i15 & 2) != 0) {
            i16 |= 384;
        } else if ((i13 & 384) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : 128;
        }
        if ((i15 & 4) != 0) {
            i16 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.lmojexxdyd(icon) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i33 = i15 & 8;
        if (i33 == 0) {
            if ((i13 & 24576) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i16 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 16384 : 8192;
            }
            i17 = 16 & i15;
            if (i17 != 0) {
                i16 |= 196608;
                z16 = z14;
            } else {
                z16 = z14;
                if ((i13 & 196608) == 0) {
                    if (draadjrbmkVarBtonecajqb.iobyxmoadg(z16)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i16 |= i18;
                }
            }
            i19 = 32 & i15;
            if (i19 != 0) {
                i16 |= 1572864;
                rgvfuqvkyqVar2 = rgvfuqvkyqVar;
            } else {
                rgvfuqvkyqVar2 = rgvfuqvkyqVar;
                if ((i13 & 1572864) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar2)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i16 |= i23;
                }
            }
            i24 = i15 & 64;
            if (i24 != 0) {
                i16 |= 12582912;
                z17 = z15;
            } else {
                z17 = z15;
                if ((i13 & 12582912) == 0) {
                    if (draadjrbmkVarBtonecajqb.iobyxmoadg(z17)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i16 |= i25;
                }
            }
            i26 = 128 & i15;
            if (i26 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (draadjrbmkVarBtonecajqb.ulzqkzuiru(draadjrbmkVar)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i16 |= i27;
            }
            if ((i13 & 805306368) != 0) {
                i16 |= ((i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 || !draadjrbmkVarBtonecajqb.wkgbmnqykc(j13)) ? 268435456 : 536870912;
            }
            if ((i14 & 6) == 0) {
                i28 = i14 | (((i15 & UserVerificationMethods.USER_VERIFY_NONE) == 0 || !draadjrbmkVarBtonecajqb.wkgbmnqykc(j14)) ? 2 : 4);
            } else {
                i28 = i14;
            }
            if ((i16 & 306783379) != 306783378 && (i28 & 3) == 2 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVar4 = draadjrbmkVar;
                jWflxmlrfwp = j14;
                z18 = z16;
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
                rgvfuqvkyqVar3 = rgvfuqvkyqVar2;
                j15 = j13;
            } else {
                draadjrbmkVarBtonecajqb.wwaezpbzkn();
                zoijcleaowVarEablkybsjg = null;
                if ((i13 & 1) != 0 || draadjrbmkVarBtonecajqb.dsvhmnatus()) {
                    if (i33 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i17 != 0) {
                        z16 = true;
                    }
                    if (i19 != 0) {
                        rgvfuqvkyqVar2 = null;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if (i26 != 0) {
                        draadjrbmkVar3 = null;
                    } else {
                        draadjrbmkVar3 = draadjrbmkVar;
                    }
                    if ((256 & i15) != 0) {
                        jIwizpuwonk = ((oipsdeybqn) draadjrbmkVarBtonecajqb.ojitshcjhn(jlmebxxoox.iobyxmoadg())).iwizpuwonk();
                        i16 &= -1879048193;
                    } else {
                        jIwizpuwonk = j13;
                    }
                    if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        jWflxmlrfwp = oipsdeybqn.wflxmlrfwp(jIwizpuwonk, ulzqkzuiru.f43940iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, ulzqkzuiru.f43941zoijcleaow), 0.0f, 0.0f, 0.0f, 14, null);
                        i28 &= -15;
                    } else {
                        jWflxmlrfwp = j14;
                    }
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    if ((256 & i15) != 0) {
                        i16 &= -1879048193;
                    }
                    if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        i28 &= -15;
                    }
                    draadjrbmkVar3 = draadjrbmkVar;
                    jIwizpuwonk = j13;
                    jWflxmlrfwp = j14;
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                i29 = i28;
                draadjrbmkVarBtonecajqb.esjtqupxsv();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-944882480, i16, i29, "ru.myspar.proloyalty.main_activity.impl.compose.bottom_bar.CustomBottomNavigationItem (CustomBottomNavigationItem.kt:91)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1881729719);
                if (rgvfuqvkyqVar2 != null) {
                    zoijcleaowVarEablkybsjg = ezmngbhpjk.nufgyqmvbu.eablkybsjg(1041602428, true, new wkgbmnqykc(rgvfuqvkyqVar2), draadjrbmkVarBtonecajqb, 54);
                }
                ezmngbhpjk.zoijcleaow zoijcleaowVar = zoijcleaowVarEablkybsjg;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow = tbqsvytpvh.zoijcleaow(CustomBottomNavigationItem, androidx.compose.foundation.selection.iobyxmoadg.iobyxmoadg(wkgbmnqykcVar3, z13, draadjrbmkVar3, k2.lqeggnwhkg(false, w0.nufgyqmvbu.f118267yggfygwlhe.ppxfxbqfkf(), jIwizpuwonk), z16, g0.nufgyqmvbu.btonecajqb(g0.nufgyqmvbu.f35737zoijcleaow.nufgyqmvbu()), onClick), 1.0f, false, 2, null);
                zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarZoijcleaow);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = z.lqeggnwhkg.f127047oxmwwwfdhm;
                metgxyhuhe.draadjrbmk draadjrbmkVar5 = draadjrbmkVar3;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                boolean z19 = z16;
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                nufgyqmvbu(jIwizpuwonk, jWflxmlrfwp, z13, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-928001012, true, new ppxfxbqfkf(z17, icon, zoijcleaowVar), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i29 << 3) & 112) | ((i16 >> 27) & 14) | 3072 | ((i16 << 3) & 896));
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                rgvfuqvkyqVar3 = rgvfuqvkyqVar2;
                j15 = jIwizpuwonk;
                draadjrbmkVar4 = draadjrbmkVar5;
                z18 = z19;
                wkgbmnqykcVar4 = wkgbmnqykcVar5;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final long j16 = j15;
                final long j17 = jWflxmlrfwp;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: xc1.gtknphoqwx
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return rgvfuqvkyq.draadjrbmk(CustomBottomNavigationItem, z13, onClick, icon, wkgbmnqykcVar4, z18, rgvfuqvkyqVar3, z17, draadjrbmkVar4, j16, j17, i13, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i16 |= 24576;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i17 = 16 & i15;
        if (i17 != 0) {
            i16 |= 196608;
            z16 = z14;
        } else {
            z16 = z14;
            if ((i13 & 196608) == 0) {
                if (draadjrbmkVarBtonecajqb.iobyxmoadg(z16)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i16 |= i18;
            }
        }
        i19 = 32 & i15;
        if (i19 != 0) {
            i16 |= 1572864;
            rgvfuqvkyqVar2 = rgvfuqvkyqVar;
        } else {
            rgvfuqvkyqVar2 = rgvfuqvkyqVar;
            if ((i13 & 1572864) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar2)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i16 |= i23;
            }
        }
        i24 = i15 & 64;
        if (i24 != 0) {
            i16 |= 12582912;
            z17 = z15;
        } else {
            z17 = z15;
            if ((i13 & 12582912) == 0) {
                if (draadjrbmkVarBtonecajqb.iobyxmoadg(z17)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i16 |= i25;
            }
        }
        i26 = 128 & i15;
        if (i26 != 0) {
            i16 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (draadjrbmkVarBtonecajqb.ulzqkzuiru(draadjrbmkVar)) {
                i27 = 67108864;
            } else {
                i27 = 33554432;
            }
            i16 |= i27;
        }
        if ((i13 & 805306368) != 0) {
            i16 |= ((i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 || !draadjrbmkVarBtonecajqb.wkgbmnqykc(j13)) ? 268435456 : 536870912;
        }
        if ((i14 & 6) == 0) {
            i28 = i14 | (((i15 & UserVerificationMethods.USER_VERIFY_NONE) == 0 || !draadjrbmkVarBtonecajqb.wkgbmnqykc(j14)) ? 2 : 4);
        } else {
            i28 = i14;
        }
        if ((i16 & 306783379) != 306783378) {
            draadjrbmkVarBtonecajqb.wwaezpbzkn();
            zoijcleaowVarEablkybsjg = null;
            if ((i13 & 1) != 0) {
                if (i33 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i17 != 0) {
                    z16 = true;
                }
                if (i19 != 0) {
                    rgvfuqvkyqVar2 = null;
                }
                if (i24 != 0) {
                    z17 = true;
                }
                if (i26 != 0) {
                    draadjrbmkVar3 = null;
                } else {
                    draadjrbmkVar3 = draadjrbmkVar;
                }
                if ((256 & i15) != 0) {
                    jIwizpuwonk = ((oipsdeybqn) draadjrbmkVarBtonecajqb.ojitshcjhn(jlmebxxoox.iobyxmoadg())).iwizpuwonk();
                    i16 &= -1879048193;
                } else {
                    jIwizpuwonk = j13;
                }
                if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    jWflxmlrfwp = oipsdeybqn.wflxmlrfwp(jIwizpuwonk, ulzqkzuiru.f43940iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, ulzqkzuiru.f43941zoijcleaow), 0.0f, 0.0f, 0.0f, 14, null);
                    i28 &= -15;
                } else {
                    jWflxmlrfwp = j14;
                }
            } else {
                if (i33 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i17 != 0) {
                    z16 = true;
                }
                if (i19 != 0) {
                    rgvfuqvkyqVar2 = null;
                }
                if (i24 != 0) {
                    z17 = true;
                }
                if (i26 != 0) {
                    draadjrbmkVar3 = null;
                } else {
                    draadjrbmkVar3 = draadjrbmkVar;
                }
                if ((256 & i15) != 0) {
                    jIwizpuwonk = ((oipsdeybqn) draadjrbmkVarBtonecajqb.ojitshcjhn(jlmebxxoox.iobyxmoadg())).iwizpuwonk();
                    i16 &= -1879048193;
                } else {
                    jIwizpuwonk = j13;
                }
                if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    jWflxmlrfwp = oipsdeybqn.wflxmlrfwp(jIwizpuwonk, ulzqkzuiru.f43940iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, ulzqkzuiru.f43941zoijcleaow), 0.0f, 0.0f, 0.0f, 14, null);
                    i28 &= -15;
                } else {
                    jWflxmlrfwp = j14;
                }
            }
            i29 = i28;
            draadjrbmkVarBtonecajqb.esjtqupxsv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-944882480, i16, i29, "ru.myspar.proloyalty.main_activity.impl.compose.bottom_bar.CustomBottomNavigationItem (CustomBottomNavigationItem.kt:91)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1881729719);
            if (rgvfuqvkyqVar2 != null) {
                zoijcleaowVarEablkybsjg = ezmngbhpjk.nufgyqmvbu.eablkybsjg(1041602428, true, new wkgbmnqykc(rgvfuqvkyqVar2), draadjrbmkVarBtonecajqb, 54);
            }
            ezmngbhpjk.zoijcleaow zoijcleaowVar2 = zoijcleaowVarEablkybsjg;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow2 = tbqsvytpvh.zoijcleaow(CustomBottomNavigationItem, androidx.compose.foundation.selection.iobyxmoadg.iobyxmoadg(wkgbmnqykcVar3, z13, draadjrbmkVar3, k2.lqeggnwhkg(false, w0.nufgyqmvbu.f118267yggfygwlhe.ppxfxbqfkf(), jIwizpuwonk), z16, g0.nufgyqmvbu.btonecajqb(g0.nufgyqmvbu.f35737zoijcleaow.nufgyqmvbu()), onClick), 1.0f, false, 2, null);
            zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar3;
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarZoijcleaow2);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            metgxyhuhe.draadjrbmk draadjrbmkVar6 = draadjrbmkVar3;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            boolean z110 = z16;
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar2.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar2 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            nufgyqmvbu(jIwizpuwonk, jWflxmlrfwp, z13, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-928001012, true, new ppxfxbqfkf(z17, icon, zoijcleaowVar2), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i29 << 3) & 112) | ((i16 >> 27) & 14) | 3072 | ((i16 << 3) & 896));
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            rgvfuqvkyqVar3 = rgvfuqvkyqVar2;
            j15 = jIwizpuwonk;
            draadjrbmkVar4 = draadjrbmkVar6;
            z18 = z110;
            wkgbmnqykcVar4 = wkgbmnqykcVar6;
        } else {
            draadjrbmkVarBtonecajqb.wwaezpbzkn();
            zoijcleaowVarEablkybsjg = null;
            if ((i13 & 1) != 0) {
                if (i33 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i17 != 0) {
                    z16 = true;
                }
                if (i19 != 0) {
                    rgvfuqvkyqVar2 = null;
                }
                if (i24 != 0) {
                    z17 = true;
                }
                if (i26 != 0) {
                    draadjrbmkVar3 = null;
                } else {
                    draadjrbmkVar3 = draadjrbmkVar;
                }
                if ((256 & i15) != 0) {
                    jIwizpuwonk = ((oipsdeybqn) draadjrbmkVarBtonecajqb.ojitshcjhn(jlmebxxoox.iobyxmoadg())).iwizpuwonk();
                    i16 &= -1879048193;
                } else {
                    jIwizpuwonk = j13;
                }
                if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    jWflxmlrfwp = oipsdeybqn.wflxmlrfwp(jIwizpuwonk, ulzqkzuiru.f43940iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, ulzqkzuiru.f43941zoijcleaow), 0.0f, 0.0f, 0.0f, 14, null);
                    i28 &= -15;
                } else {
                    jWflxmlrfwp = j14;
                }
            } else {
                if (i33 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i17 != 0) {
                    z16 = true;
                }
                if (i19 != 0) {
                    rgvfuqvkyqVar2 = null;
                }
                if (i24 != 0) {
                    z17 = true;
                }
                if (i26 != 0) {
                    draadjrbmkVar3 = null;
                } else {
                    draadjrbmkVar3 = draadjrbmkVar;
                }
                if ((256 & i15) != 0) {
                    jIwizpuwonk = ((oipsdeybqn) draadjrbmkVarBtonecajqb.ojitshcjhn(jlmebxxoox.iobyxmoadg())).iwizpuwonk();
                    i16 &= -1879048193;
                } else {
                    jIwizpuwonk = j13;
                }
                if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    jWflxmlrfwp = oipsdeybqn.wflxmlrfwp(jIwizpuwonk, ulzqkzuiru.f43940iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, ulzqkzuiru.f43941zoijcleaow), 0.0f, 0.0f, 0.0f, 14, null);
                    i28 &= -15;
                } else {
                    jWflxmlrfwp = j14;
                }
            }
            i29 = i28;
            draadjrbmkVarBtonecajqb.esjtqupxsv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-944882480, i16, i29, "ru.myspar.proloyalty.main_activity.impl.compose.bottom_bar.CustomBottomNavigationItem (CustomBottomNavigationItem.kt:91)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1881729719);
            if (rgvfuqvkyqVar2 != null) {
                zoijcleaowVarEablkybsjg = ezmngbhpjk.nufgyqmvbu.eablkybsjg(1041602428, true, new wkgbmnqykc(rgvfuqvkyqVar2), draadjrbmkVarBtonecajqb, 54);
            }
            ezmngbhpjk.zoijcleaow zoijcleaowVar3 = zoijcleaowVarEablkybsjg;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow3 = tbqsvytpvh.zoijcleaow(CustomBottomNavigationItem, androidx.compose.foundation.selection.iobyxmoadg.iobyxmoadg(wkgbmnqykcVar3, z13, draadjrbmkVar3, k2.lqeggnwhkg(false, w0.nufgyqmvbu.f118267yggfygwlhe.ppxfxbqfkf(), jIwizpuwonk), z16, g0.nufgyqmvbu.btonecajqb(g0.nufgyqmvbu.f35737zoijcleaow.nufgyqmvbu()), onClick), 1.0f, false, 2, null);
            zynmafqrjb zynmafqrjbVarDxjokdxxww3 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar3;
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarZoijcleaow3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            metgxyhuhe.draadjrbmk draadjrbmkVar7 = draadjrbmkVar3;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            boolean z111 = z16;
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar3.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar3.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar3 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            nufgyqmvbu(jIwizpuwonk, jWflxmlrfwp, z13, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-928001012, true, new ppxfxbqfkf(z17, icon, zoijcleaowVar3), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i29 << 3) & 112) | ((i16 >> 27) & 14) | 3072 | ((i16 << 3) & 896));
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            rgvfuqvkyqVar3 = rgvfuqvkyqVar2;
            j15 = jIwizpuwonk;
            draadjrbmkVar4 = draadjrbmkVar7;
            z18 = z111;
            wkgbmnqykcVar4 = wkgbmnqykcVar7;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final long j18 = j15;
            final long j19 = jWflxmlrfwp;
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: xc1.gtknphoqwx
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return rgvfuqvkyq.draadjrbmk(CustomBottomNavigationItem, z13, onClick, icon, wkgbmnqykcVar4, z18, rgvfuqvkyqVar3, z17, draadjrbmkVar4, j18, j19, i13, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gxszxtbevo(final tg.rgvfuqvkyq rgvfuqvkyqVar, final tg.rgvfuqvkyq rgvfuqvkyqVar2, final float f13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(190429642);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.zoijcleaow(f13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(190429642, i14, -1, "ru.myspar.proloyalty.main_activity.impl.compose.bottom_bar.BottomNavigationItemBaselineLayout (CustomBottomNavigationItem.kt:180)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(958559601);
            boolean z13 = ((i14 & 112) == 32) | ((i14 & 896) == 256);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(rgvfuqvkyqVar2, f13);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            zynmafqrjb zynmafqrjbVar = (zynmafqrjb) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, iobyxmoadgVar);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVar, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow = androidx.compose.ui.layout.nufgyqmvbu.zoijcleaow(iobyxmoadgVar, "icon");
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar3 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar3.ojitshcjhn(), false);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarZoijcleaow);
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar2.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar2.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar2.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            rgvfuqvkyqVar.invoke(draadjrbmkVarBtonecajqb, Integer.valueOf(i14 & 14));
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            draadjrbmkVarBtonecajqb.sopmlzcsov(2060764378);
            if (rgvfuqvkyqVar2 != null) {
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = esjtqupxsv.rgvfuqvkyq(e.iobyxmoadg.iobyxmoadg(androidx.compose.ui.layout.nufgyqmvbu.zoijcleaow(iobyxmoadgVar, "label"), f13), f122119ppxfxbqfkf, 0.0f, 2, null);
                zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar3.ojitshcjhn(), false);
                int iHashCode3 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarRgvfuqvkyq);
                tg.iobyxmoadg iobyxmoadgVarIobyxmoadg3 = iobyxmoadgVar2.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg3);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg3 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar2.eablkybsjg());
                tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow3 = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg3.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg3.yadqdtsiqt(), Integer.valueOf(iHashCode3))) {
                    draadjrbmkVarIobyxmoadg3.jyumaefscl(Integer.valueOf(iHashCode3));
                    draadjrbmkVarIobyxmoadg3.zdlpuopuiu(Integer.valueOf(iHashCode3), rgvfuqvkyqVarZoijcleaow3);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar2.wkgbmnqykc());
                rgvfuqvkyqVar2.invoke(draadjrbmkVarBtonecajqb, Integer.valueOf((i14 >> 3) & 14));
                draadjrbmkVarBtonecajqb.cqumvgiudr();
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: xc1.draadjrbmk
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return rgvfuqvkyq.lqeggnwhkg(rgvfuqvkyqVar, rgvfuqvkyqVar2, f13, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final istkbnxepw kcexrzcfyt(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, final kcexrzcfyt kcexrzcfytVar, final kcexrzcfyt kcexrzcfytVar2, long j13, final float f13) {
        int iHszhottldk = draadjrbmkVar.hszhottldk(f122120wkgbmnqykc) - kcexrzcfytVar.cllcsxoeiz(x.zoijcleaow.iobyxmoadg());
        int iIpoelvxyzq = kcexrzcfytVar2.ipoelvxyzq() + kcexrzcfytVar.ipoelvxyzq() + iHszhottldk;
        int iGxszxtbevo = w0.ppxfxbqfkf.gxszxtbevo(j13, Math.max(iIpoelvxyzq, draadjrbmkVar.hszhottldk(f122121zoijcleaow)));
        final int iGxszxtbevo2 = zg.gtknphoqwx.gxszxtbevo((iGxszxtbevo - iIpoelvxyzq) / 2, 0);
        int iIpoelvxyzq2 = (iGxszxtbevo - kcexrzcfytVar2.ipoelvxyzq()) / 2;
        final int iIpoelvxyzq3 = kcexrzcfytVar2.ipoelvxyzq() + iGxszxtbevo2 + iHszhottldk;
        int iMax = Math.max(kcexrzcfytVar.eslsurpljm(), kcexrzcfytVar2.eslsurpljm());
        final int iEslsurpljm = (iMax - kcexrzcfytVar.eslsurpljm()) / 2;
        final int iEslsurpljm2 = (iMax - kcexrzcfytVar2.eslsurpljm()) / 2;
        final int iWkgbmnqykc = vg.iobyxmoadg.wkgbmnqykc((iIpoelvxyzq2 - iGxszxtbevo2) * (1 - f13));
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, iMax, iGxszxtbevo, null, new tg.draadjrbmk() { // from class: xc1.ojitshcjhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return rgvfuqvkyq.zdlpuopuiu(f13, kcexrzcfytVar, iEslsurpljm, iIpoelvxyzq3, iWkgbmnqykc, kcexrzcfytVar2, iEslsurpljm2, iGxszxtbevo2, (kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(tg.rgvfuqvkyq rgvfuqvkyqVar, tg.rgvfuqvkyq rgvfuqvkyqVar2, float f13, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        gxszxtbevo(rgvfuqvkyqVar, rgvfuqvkyqVar2, f13, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void nufgyqmvbu(final long j13, final long j14, final boolean z13, final vdvldrhtss vdvldrhtssVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1994650715);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.wkgbmnqykc(j13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.wkgbmnqykc(j14) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i14 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1994650715, i14, -1, "ru.myspar.proloyalty.main_activity.impl.compose.bottom_bar.BottomNavigationTransition (CustomBottomNavigationItem.kt:148)");
            }
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            i1 i1VarEablkybsjg = vipkmwdibw.eablkybsjg.eablkybsjg(z13 ? 1.0f : 0.0f, f122118iobyxmoadg, 0.0f, null, null, draadjrbmkVarBtonecajqb, 48, 28);
            long jGxszxtbevo = bfopjjpdmp.gxszxtbevo(j14, j13, dxjokdxxww(i1VarEablkybsjg));
            androidx.compose.runtime.lmojexxdyd.wkgbmnqykc(new b[]{jlmebxxoox.iobyxmoadg().wkgbmnqykc(oipsdeybqn.dxjokdxxww(oipsdeybqn.wflxmlrfwp(jGxszxtbevo, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), crxdokpmqz.ppxfxbqfkf().wkgbmnqykc(Float.valueOf(oipsdeybqn.rgvfuqvkyq(jGxszxtbevo)))}, ezmngbhpjk.nufgyqmvbu.eablkybsjg(961022235, true, new zoijcleaow(vdvldrhtssVar, i1VarEablkybsjg), draadjrbmkVar2, 54), draadjrbmkVar2, b.f5523dxjokdxxww | 48);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: xc1.wflxmlrfwp
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return rgvfuqvkyq.btonecajqb(j13, j14, z13, vdvldrhtssVar, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oxmwwwfdhm(kcexrzcfyt kcexrzcfytVar, int i13, kcexrzcfyt.iobyxmoadg layout) {
        zdlpuopuiu.btonecajqb(layout, "$this$layout");
        kcexrzcfyt.iobyxmoadg.cllcsxoeiz(layout, kcexrzcfytVar, 0, i13, 0.0f, 4, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final istkbnxepw vdvldrhtss(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, final kcexrzcfyt kcexrzcfytVar, long j13) {
        int iGxszxtbevo = w0.ppxfxbqfkf.gxszxtbevo(j13, draadjrbmkVar.hszhottldk(f122121zoijcleaow));
        final int iIpoelvxyzq = (iGxszxtbevo - kcexrzcfytVar.ipoelvxyzq()) / 2;
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, kcexrzcfytVar.eslsurpljm(), iGxszxtbevo, null, new tg.draadjrbmk() { // from class: xc1.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return rgvfuqvkyq.oxmwwwfdhm(kcexrzcfytVar, iIpoelvxyzq, (kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zdlpuopuiu(float f13, kcexrzcfyt kcexrzcfytVar, int i13, int i14, int i15, kcexrzcfyt kcexrzcfytVar2, int i16, int i17, kcexrzcfyt.iobyxmoadg layout) {
        zdlpuopuiu.btonecajqb(layout, "$this$layout");
        if (f13 != 0.0f) {
            kcexrzcfyt.iobyxmoadg.cllcsxoeiz(layout, kcexrzcfytVar, i13, i14 + i15, 0.0f, 4, null);
        }
        kcexrzcfyt.iobyxmoadg.cllcsxoeiz(layout, kcexrzcfytVar2, i16, i17 + i15, 0.0f, 4, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
