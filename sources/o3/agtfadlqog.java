package o3;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import androidx.media3.exoplayer.hszhottldk;
import androidx.media3.exoplayer.wizcaqwiak;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.collect.pkzmftpjix;
import f3.hcddaimhww;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import v2.iozdgvuglv;
import v2.lmojexxdyd;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public class agtfadlqog extends pmvmpeiblj implements hszhottldk.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final pkzmftpjix f71716btonecajqb = pkzmftpjix.wkgbmnqykc(new Comparator() { // from class: o3.wkgbmnqykc
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return agtfadlqog.ulzqkzuiru((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private v2.ppxfxbqfkf f71717dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Context f71718eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final esjtqupxsv.zoijcleaow f71719gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private eablkybsjg f71720lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private lqeggnwhkg f71721nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Object f71722wkgbmnqykc;

    /* JADX INFO: Access modifiers changed from: private */
    static final class btonecajqb extends dxjokdxxww {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private final int f71723cdpycssgdh;

        /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
        private final boolean f71724cllcsxoeiz;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final boolean f71725cqumvgiudr;

        /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
        private final int f71726dsvhmnatus;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final eablkybsjg f71727esjtqupxsv;

        /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
        private final boolean f71728hcddaimhww;

        /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
        private final boolean f71729hkdspvbjdz;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        private final int f71730iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private final int f71731istkbnxepw;

        /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
        private final int f71732jpowsppfya;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private final boolean f71733lereixgezr;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        private final int f71734lmojexxdyd;

        /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
        private final int f71735pkzmftpjix;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private final boolean f71736pmvmpeiblj;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        private final int f71737wwaezpbzkn;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private final int f71738yadqdtsiqt;

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        private final boolean f71739ylkuphrtab;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private final boolean f71740zynmafqrjb;

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public btonecajqb(int i13, v2.yadqdtsiqt yadqdtsiqtVar, int i14, eablkybsjg eablkybsjgVar, int i15, String str, int i16, boolean z13) {
            boolean z14;
            boolean z15;
            int i17;
            int iWwaezpbzkn;
            androidx.media3.common.iobyxmoadg iobyxmoadgVar;
            int i18;
            int i19;
            int i23;
            androidx.media3.common.iobyxmoadg iobyxmoadgVar2;
            int i24;
            int i25;
            int i26;
            super(i13, yadqdtsiqtVar, i14);
            this.f71727esjtqupxsv = eablkybsjgVar;
            int i27 = eablkybsjgVar.f71771iyctptxqzt ? 24 : 16;
            this.f71728hcddaimhww = eablkybsjgVar.f71775opjhrmiecq && (i16 & i27) != 0;
            if (!z13 || (((i24 = (iobyxmoadgVar2 = this.f71741iwizpuwonk).f9763jyumaefscl) != -1 && i24 > eablkybsjgVar.f115581iobyxmoadg) || ((i25 = iobyxmoadgVar2.f9761iwizpuwonk) != -1 && i25 > eablkybsjgVar.f115600zoijcleaow))) {
                z14 = false;
            } else {
                float f13 = iobyxmoadgVar2.f9748cqumvgiudr;
                if ((f13 == -1.0f || f13 <= eablkybsjgVar.f115592ppxfxbqfkf) && ((i26 = iobyxmoadgVar2.f9745btonecajqb) == -1 || i26 <= eablkybsjgVar.f115596wkgbmnqykc)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            this.f71725cqumvgiudr = z14;
            if (!z13 || (((i18 = (iobyxmoadgVar = this.f71741iwizpuwonk).f9763jyumaefscl) != -1 && i18 < eablkybsjgVar.f115577eablkybsjg) || ((i19 = iobyxmoadgVar.f9761iwizpuwonk) != -1 && i19 < eablkybsjgVar.f115580gxszxtbevo))) {
                z15 = false;
            } else {
                float f14 = iobyxmoadgVar.f9748cqumvgiudr;
                if ((f14 == -1.0f || f14 >= eablkybsjgVar.f115587lqeggnwhkg) && ((i23 = iobyxmoadgVar.f9745btonecajqb) == -1 || i23 >= eablkybsjgVar.f115588nufgyqmvbu)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            this.f71733lereixgezr = z15;
            this.f71736pmvmpeiblj = hszhottldk.ojitshcjhn(i15, false);
            androidx.media3.common.iobyxmoadg iobyxmoadgVar3 = this.f71741iwizpuwonk;
            float f15 = iobyxmoadgVar3.f9748cqumvgiudr;
            this.f71740zynmafqrjb = f15 != -1.0f && f15 >= 10.0f;
            this.f71731istkbnxepw = iobyxmoadgVar3.f9745btonecajqb;
            this.f71723cdpycssgdh = iobyxmoadgVar3.eablkybsjg();
            int i28 = 0;
            while (true) {
                i17 = Integer.MAX_VALUE;
                if (i28 >= eablkybsjgVar.f115571agtfadlqog.size()) {
                    i28 = Integer.MAX_VALUE;
                    iWwaezpbzkn = 0;
                    break;
                } else {
                    iWwaezpbzkn = agtfadlqog.wwaezpbzkn(this.f71741iwizpuwonk, (String) eablkybsjgVar.f115571agtfadlqog.get(i28), false);
                    if (iWwaezpbzkn > 0) {
                        break;
                    } else {
                        i28++;
                    }
                }
            }
            this.f71730iozdgvuglv = i28;
            this.f71734lmojexxdyd = iWwaezpbzkn;
            this.f71737wwaezpbzkn = agtfadlqog.jpowsppfya(this.f71741iwizpuwonk.f9755gxszxtbevo, eablkybsjgVar.f115589ojitshcjhn);
            int i29 = this.f71741iwizpuwonk.f9755gxszxtbevo;
            this.f71739ylkuphrtab = i29 == 0 || (i29 & 1) != 0;
            this.f71735pkzmftpjix = agtfadlqog.wwaezpbzkn(this.f71741iwizpuwonk, str, agtfadlqog.vipkmwdibw(str) == null);
            for (int i33 = 0; i33 < eablkybsjgVar.f115595wflxmlrfwp.size(); i33++) {
                String str2 = this.f71741iwizpuwonk.f9769ojitshcjhn;
                if (str2 != null && str2.equals(eablkybsjgVar.f115595wflxmlrfwp.get(i33))) {
                    i17 = i33;
                    break;
                }
            }
            this.f71738yadqdtsiqt = i17;
            this.f71729hkdspvbjdz = hszhottldk.agtfadlqog(i15) == 128;
            this.f71724cllcsxoeiz = hszhottldk.lmojexxdyd(i15) == 64;
            this.f71726dsvhmnatus = agtfadlqog.hkdspvbjdz(this.f71741iwizpuwonk.f9769ojitshcjhn);
            this.f71732jpowsppfya = dxjokdxxww(i15, i27);
        }

        private int dxjokdxxww(int i13, int i14) {
            if ((this.f71741iwizpuwonk.f9755gxszxtbevo & 16384) != 0 || !hszhottldk.ojitshcjhn(i13, this.f71727esjtqupxsv.f71770iwxlajgraz)) {
                return 0;
            }
            if (!this.f71725cqumvgiudr && !this.f71727esjtqupxsv.f71767bfopjjpdmp) {
                return 0;
            }
            if (hszhottldk.ojitshcjhn(i13, false) && this.f71733lereixgezr && this.f71725cqumvgiudr && this.f71741iwizpuwonk.f9745btonecajqb != -1) {
                eablkybsjg eablkybsjgVar = this.f71727esjtqupxsv;
                if (!eablkybsjgVar.f115582istkbnxepw && !eablkybsjgVar.f115601zynmafqrjb && (i13 & i14) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int eablkybsjg(btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2) {
            com.google.common.collect.wflxmlrfwp wflxmlrfwpVarLqeggnwhkg = com.google.common.collect.wflxmlrfwp.btonecajqb().lqeggnwhkg(btonecajqbVar.f71736pmvmpeiblj, btonecajqbVar2.f71736pmvmpeiblj).gxszxtbevo(Integer.valueOf(btonecajqbVar.f71730iozdgvuglv), Integer.valueOf(btonecajqbVar2.f71730iozdgvuglv), pkzmftpjix.lqeggnwhkg().dxjokdxxww()).wkgbmnqykc(btonecajqbVar.f71734lmojexxdyd, btonecajqbVar2.f71734lmojexxdyd).wkgbmnqykc(btonecajqbVar.f71737wwaezpbzkn, btonecajqbVar2.f71737wwaezpbzkn).lqeggnwhkg(btonecajqbVar.f71739ylkuphrtab, btonecajqbVar2.f71739ylkuphrtab).wkgbmnqykc(btonecajqbVar.f71735pkzmftpjix, btonecajqbVar2.f71735pkzmftpjix).lqeggnwhkg(btonecajqbVar.f71740zynmafqrjb, btonecajqbVar2.f71740zynmafqrjb).lqeggnwhkg(btonecajqbVar.f71725cqumvgiudr, btonecajqbVar2.f71725cqumvgiudr).lqeggnwhkg(btonecajqbVar.f71733lereixgezr, btonecajqbVar2.f71733lereixgezr).gxszxtbevo(Integer.valueOf(btonecajqbVar.f71738yadqdtsiqt), Integer.valueOf(btonecajqbVar2.f71738yadqdtsiqt), pkzmftpjix.lqeggnwhkg().dxjokdxxww()).lqeggnwhkg(btonecajqbVar.f71729hkdspvbjdz, btonecajqbVar2.f71729hkdspvbjdz).lqeggnwhkg(btonecajqbVar.f71724cllcsxoeiz, btonecajqbVar2.f71724cllcsxoeiz);
            if (btonecajqbVar.f71729hkdspvbjdz && btonecajqbVar.f71724cllcsxoeiz) {
                wflxmlrfwpVarLqeggnwhkg = wflxmlrfwpVarLqeggnwhkg.wkgbmnqykc(btonecajqbVar.f71726dsvhmnatus, btonecajqbVar2.f71726dsvhmnatus);
            }
            return wflxmlrfwpVarLqeggnwhkg.dxjokdxxww();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int gxszxtbevo(btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2) {
            pkzmftpjix pkzmftpjixVarDxjokdxxww = (btonecajqbVar.f71725cqumvgiudr && btonecajqbVar.f71736pmvmpeiblj) ? agtfadlqog.f71716btonecajqb : agtfadlqog.f71716btonecajqb.dxjokdxxww();
            com.google.common.collect.wflxmlrfwp wflxmlrfwpVarBtonecajqb = com.google.common.collect.wflxmlrfwp.btonecajqb();
            if (btonecajqbVar.f71727esjtqupxsv.f115601zynmafqrjb) {
                wflxmlrfwpVarBtonecajqb = wflxmlrfwpVarBtonecajqb.gxszxtbevo(Integer.valueOf(btonecajqbVar.f71731istkbnxepw), Integer.valueOf(btonecajqbVar2.f71731istkbnxepw), agtfadlqog.f71716btonecajqb.dxjokdxxww());
            }
            return wflxmlrfwpVarBtonecajqb.gxszxtbevo(Integer.valueOf(btonecajqbVar.f71723cdpycssgdh), Integer.valueOf(btonecajqbVar2.f71723cdpycssgdh), pkzmftpjixVarDxjokdxxww).gxszxtbevo(Integer.valueOf(btonecajqbVar.f71731istkbnxepw), Integer.valueOf(btonecajqbVar2.f71731istkbnxepw), pkzmftpjixVarDxjokdxxww).dxjokdxxww();
        }

        public static int lqeggnwhkg(List list, List list2) {
            return com.google.common.collect.wflxmlrfwp.btonecajqb().gxszxtbevo((btonecajqb) Collections.max(list, new Comparator() { // from class: o3.iwizpuwonk
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return agtfadlqog.btonecajqb.eablkybsjg((agtfadlqog.btonecajqb) obj, (agtfadlqog.btonecajqb) obj2);
                }
            }), (btonecajqb) Collections.max(list2, new Comparator() { // from class: o3.iwizpuwonk
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return agtfadlqog.btonecajqb.eablkybsjg((agtfadlqog.btonecajqb) obj, (agtfadlqog.btonecajqb) obj2);
                }
            }), new Comparator() { // from class: o3.iwizpuwonk
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return agtfadlqog.btonecajqb.eablkybsjg((agtfadlqog.btonecajqb) obj, (agtfadlqog.btonecajqb) obj2);
                }
            }).wkgbmnqykc(list.size(), list2.size()).gxszxtbevo((btonecajqb) Collections.max(list, new Comparator() { // from class: o3.cqumvgiudr
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return agtfadlqog.btonecajqb.gxszxtbevo((agtfadlqog.btonecajqb) obj, (agtfadlqog.btonecajqb) obj2);
                }
            }), (btonecajqb) Collections.max(list2, new Comparator() { // from class: o3.cqumvgiudr
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return agtfadlqog.btonecajqb.gxszxtbevo((agtfadlqog.btonecajqb) obj, (agtfadlqog.btonecajqb) obj2);
                }
            }), new Comparator() { // from class: o3.cqumvgiudr
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return agtfadlqog.btonecajqb.gxszxtbevo((agtfadlqog.btonecajqb) obj, (agtfadlqog.btonecajqb) obj2);
                }
            }).dxjokdxxww();
        }

        public static com.google.common.collect.zdlpuopuiu nufgyqmvbu(int i13, v2.yadqdtsiqt yadqdtsiqtVar, eablkybsjg eablkybsjgVar, int[] iArr, String str, int i14, Point point) {
            int iYlkuphrtab = agtfadlqog.ylkuphrtab(yadqdtsiqtVar, point != null ? point.x : eablkybsjgVar.f115576dxjokdxxww, point != null ? point.y : eablkybsjgVar.f115572btonecajqb, eablkybsjgVar.f115575draadjrbmk);
            com.google.common.collect.zdlpuopuiu.iobyxmoadg iobyxmoadgVarKcexrzcfyt = com.google.common.collect.zdlpuopuiu.kcexrzcfyt();
            for (int i15 = 0; i15 < yadqdtsiqtVar.f115705iobyxmoadg; i15++) {
                int iEablkybsjg = yadqdtsiqtVar.iobyxmoadg(i15).eablkybsjg();
                iobyxmoadgVarKcexrzcfyt.iobyxmoadg(new btonecajqb(i13, yadqdtsiqtVar, i15, eablkybsjgVar, iArr[i15], str, i14, iYlkuphrtab == Integer.MAX_VALUE || (iEablkybsjg != -1 && iEablkybsjg <= iYlkuphrtab)));
            }
            return iobyxmoadgVarKcexrzcfyt.gtknphoqwx();
        }

        @Override // o3.agtfadlqog.dxjokdxxww
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(btonecajqb btonecajqbVar) {
            return (this.f71728hcddaimhww || Objects.equals(this.f71741iwizpuwonk.f9769ojitshcjhn, btonecajqbVar.f71741iwizpuwonk.f9769ojitshcjhn)) && (this.f71727esjtqupxsv.f71780weqkydbzbr || (this.f71729hkdspvbjdz == btonecajqbVar.f71729hkdspvbjdz && this.f71724cllcsxoeiz == btonecajqbVar.f71724cllcsxoeiz));
        }

        @Override // o3.agtfadlqog.dxjokdxxww
        public int iobyxmoadg() {
            return this.f71732jpowsppfya;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class dxjokdxxww {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public final androidx.media3.common.iobyxmoadg f71741iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public final int f71742jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public final v2.yadqdtsiqt f71743yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final int f71744zdlpuopuiu;

        public interface iobyxmoadg {
            List iobyxmoadg(int i13, v2.yadqdtsiqt yadqdtsiqtVar, int[] iArr);
        }

        public dxjokdxxww(int i13, v2.yadqdtsiqt yadqdtsiqtVar, int i14) {
            this.f71744zdlpuopuiu = i13;
            this.f71743yggfygwlhe = yadqdtsiqtVar;
            this.f71742jyumaefscl = i14;
            this.f71741iwizpuwonk = yadqdtsiqtVar.iobyxmoadg(i14);
        }

        public abstract int iobyxmoadg();

        public abstract boolean zoijcleaow(dxjokdxxww dxjokdxxwwVar);
    }

    public static final class eablkybsjg extends lmojexxdyd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f71745a;

        /* JADX INFO: renamed from: ageimvtcrz, reason: collision with root package name */
        private static final String f71746ageimvtcrz;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f71747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f71748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f71749d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f71750e;

        /* JADX INFO: renamed from: eslsurpljm, reason: collision with root package name */
        private static final String f71751eslsurpljm;

        /* JADX INFO: renamed from: ezmngbhpjk, reason: collision with root package name */
        private static final String f71752ezmngbhpjk;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f71753f;

        /* JADX INFO: renamed from: fiwbwshyhd, reason: collision with root package name */
        public static final eablkybsjg f71754fiwbwshyhd;

        /* JADX INFO: renamed from: fmlbqenlif, reason: collision with root package name */
        private static final String f71755fmlbqenlif;

        /* JADX INFO: renamed from: fyldjkxazc, reason: collision with root package name */
        private static final String f71756fyldjkxazc;

        /* JADX INFO: renamed from: grlcpdaxtj, reason: collision with root package name */
        private static final String f71757grlcpdaxtj;

        /* JADX INFO: renamed from: hszhottldk, reason: collision with root package name */
        public static final eablkybsjg f71758hszhottldk;

        /* JADX INFO: renamed from: ipoelvxyzq, reason: collision with root package name */
        private static final String f71759ipoelvxyzq;

        /* JADX INFO: renamed from: ixidwrxhsl, reason: collision with root package name */
        private static final String f71760ixidwrxhsl;

        /* JADX INFO: renamed from: jrbgnlbqoe, reason: collision with root package name */
        private static final String f71761jrbgnlbqoe;

        /* JADX INFO: renamed from: krqnebusok, reason: collision with root package name */
        private static final String f71762krqnebusok;

        /* JADX INFO: renamed from: mhtqkkgtqm, reason: collision with root package name */
        private static final String f71763mhtqkkgtqm;

        /* JADX INFO: renamed from: rhgxfdycjh, reason: collision with root package name */
        private static final String f71764rhgxfdycjh;

        /* JADX INFO: renamed from: yzdjzghtvl, reason: collision with root package name */
        private static final String f71765yzdjzghtvl;

        /* JADX INFO: renamed from: auzgnhcxok, reason: collision with root package name */
        public final boolean f71766auzgnhcxok;

        /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
        public final boolean f71767bfopjjpdmp;

        /* JADX INFO: renamed from: dvvnrvtcbc, reason: collision with root package name */
        public final boolean f71768dvvnrvtcbc;

        /* JADX INFO: renamed from: igdgnonuha, reason: collision with root package name */
        public final boolean f71769igdgnonuha;

        /* JADX INFO: renamed from: iwxlajgraz, reason: collision with root package name */
        public final boolean f71770iwxlajgraz;

        /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
        public final boolean f71771iyctptxqzt;

        /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
        public final boolean f71772lrnfpwlwnk;

        /* JADX INFO: renamed from: lxfrhoxuzk, reason: collision with root package name */
        private final SparseArray f71773lxfrhoxuzk;

        /* JADX INFO: renamed from: nuxfzjnpeb, reason: collision with root package name */
        public final boolean f71774nuxfzjnpeb;

        /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
        public final boolean f71775opjhrmiecq;

        /* JADX INFO: renamed from: roivzttewh, reason: collision with root package name */
        public final boolean f71776roivzttewh;

        /* JADX INFO: renamed from: skhdrjzrfn, reason: collision with root package name */
        public final boolean f71777skhdrjzrfn;

        /* JADX INFO: renamed from: tbqsvytpvh, reason: collision with root package name */
        public final boolean f71778tbqsvytpvh;

        /* JADX INFO: renamed from: uawqvzlxes, reason: collision with root package name */
        public final boolean f71779uawqvzlxes;

        /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
        public final boolean f71780weqkydbzbr;

        /* JADX INFO: renamed from: wizcaqwiak, reason: collision with root package name */
        private final SparseBooleanArray f71781wizcaqwiak;

        /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
        public final boolean f71782zeieaojujs;

        public static final class iobyxmoadg extends lmojexxdyd.ppxfxbqfkf {

            /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
            private boolean f71783cllcsxoeiz;

            /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
            private boolean f71784dsvhmnatus;

            /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
            private boolean f71785hcddaimhww;

            /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
            private boolean f71786hkdspvbjdz;

            /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
            private boolean f71787iozdgvuglv;

            /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
            private boolean f71788jpowsppfya;

            /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
            private boolean f71789kegysxyocb;

            /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
            private boolean f71790lmojexxdyd;

            /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
            private boolean f71791mbcevpiqjq;

            /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
            private final SparseArray f71792ntlheqmsrt;

            /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
            private boolean f71793pkzmftpjix;

            /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
            private boolean f71794stevsuqkhv;

            /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
            private boolean f71795tzroggbefp;

            /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
            private final SparseBooleanArray f71796ulzqkzuiru;

            /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
            private boolean f71797wwaezpbzkn;

            /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
            private boolean f71798wypolnanlu;

            /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
            private boolean f71799ylkuphrtab;

            private static SparseArray uwvvkdfqfp(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    sparseArray2.put(sparseArray.keyAt(i13), new HashMap((Map) sparseArray.valueAt(i13)));
                }
                return sparseArray2;
            }

            private void yfnezrywwk() {
                this.f71787iozdgvuglv = true;
                this.f71790lmojexxdyd = false;
                this.f71797wwaezpbzkn = true;
                this.f71799ylkuphrtab = false;
                this.f71793pkzmftpjix = true;
                this.f71785hcddaimhww = false;
                this.f71788jpowsppfya = false;
                this.f71786hkdspvbjdz = false;
                this.f71783cllcsxoeiz = false;
                this.f71784dsvhmnatus = true;
                this.f71798wypolnanlu = true;
                this.f71794stevsuqkhv = true;
                this.f71789kegysxyocb = false;
                this.f71795tzroggbefp = true;
                this.f71791mbcevpiqjq = false;
            }

            @Override // v2.lmojexxdyd.ppxfxbqfkf
            /* JADX INFO: renamed from: bfopjjpdmp, reason: merged with bridge method [inline-methods] */
            public iobyxmoadg cllcsxoeiz(String... strArr) {
                super.cllcsxoeiz(strArr);
                return this;
            }

            @Override // v2.lmojexxdyd.ppxfxbqfkf
            /* JADX INFO: renamed from: czzsidtyhn, reason: merged with bridge method [inline-methods] */
            public iobyxmoadg lmojexxdyd(int i13) {
                super.lmojexxdyd(i13);
                return this;
            }

            @Override // v2.lmojexxdyd.ppxfxbqfkf
            /* JADX INFO: renamed from: iyctptxqzt, reason: merged with bridge method [inline-methods] */
            public iobyxmoadg wypolnanlu(int i13, boolean z13) {
                super.wypolnanlu(i13, z13);
                return this;
            }

            @Override // v2.lmojexxdyd.ppxfxbqfkf
            /* JADX INFO: renamed from: oipsdeybqn, reason: merged with bridge method [inline-methods] */
            public iobyxmoadg hkdspvbjdz(String str) {
                super.hkdspvbjdz(str);
                return this;
            }

            @Override // v2.lmojexxdyd.ppxfxbqfkf
            /* JADX INFO: renamed from: opjhrmiecq, reason: merged with bridge method [inline-methods] */
            public iobyxmoadg dsvhmnatus(int i13) {
                super.dsvhmnatus(i13);
                return this;
            }

            @Override // v2.lmojexxdyd.ppxfxbqfkf
            /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
            public eablkybsjg iozdgvuglv() {
                return new eablkybsjg(this);
            }

            @Override // v2.lmojexxdyd.ppxfxbqfkf
            /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
            public iobyxmoadg hcddaimhww(int i13) {
                super.hcddaimhww(i13);
                return this;
            }

            protected iobyxmoadg ydmasvzmpa(lmojexxdyd lmojexxdydVar) {
                super.pkzmftpjix(lmojexxdydVar);
                return this;
            }

            @Override // v2.lmojexxdyd.ppxfxbqfkf
            /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
            public iobyxmoadg jpowsppfya(iozdgvuglv iozdgvuglvVar) {
                super.jpowsppfya(iozdgvuglvVar);
                return this;
            }

            public iobyxmoadg() {
                this.f71792ntlheqmsrt = new SparseArray();
                this.f71796ulzqkzuiru = new SparseBooleanArray();
                yfnezrywwk();
            }

            private iobyxmoadg(eablkybsjg eablkybsjgVar) {
                super(eablkybsjgVar);
                this.f71787iozdgvuglv = eablkybsjgVar.f71767bfopjjpdmp;
                this.f71790lmojexxdyd = eablkybsjgVar.f71775opjhrmiecq;
                this.f71797wwaezpbzkn = eablkybsjgVar.f71771iyctptxqzt;
                this.f71799ylkuphrtab = eablkybsjgVar.f71780weqkydbzbr;
                this.f71793pkzmftpjix = eablkybsjgVar.f71772lrnfpwlwnk;
                this.f71785hcddaimhww = eablkybsjgVar.f71782zeieaojujs;
                this.f71788jpowsppfya = eablkybsjgVar.f71774nuxfzjnpeb;
                this.f71786hkdspvbjdz = eablkybsjgVar.f71778tbqsvytpvh;
                this.f71783cllcsxoeiz = eablkybsjgVar.f71776roivzttewh;
                this.f71784dsvhmnatus = eablkybsjgVar.f71779uawqvzlxes;
                this.f71798wypolnanlu = eablkybsjgVar.f71766auzgnhcxok;
                this.f71794stevsuqkhv = eablkybsjgVar.f71770iwxlajgraz;
                this.f71789kegysxyocb = eablkybsjgVar.f71768dvvnrvtcbc;
                this.f71795tzroggbefp = eablkybsjgVar.f71777skhdrjzrfn;
                this.f71791mbcevpiqjq = eablkybsjgVar.f71769igdgnonuha;
                this.f71792ntlheqmsrt = uwvvkdfqfp(eablkybsjgVar.f71773lxfrhoxuzk);
                this.f71796ulzqkzuiru = eablkybsjgVar.f71781wizcaqwiak.clone();
            }
        }

        static {
            eablkybsjg eablkybsjgVarIozdgvuglv = new iobyxmoadg().iozdgvuglv();
            f71758hszhottldk = eablkybsjgVarIozdgvuglv;
            f71754fiwbwshyhd = eablkybsjgVarIozdgvuglv;
            f71746ageimvtcrz = stevsuqkhv.uawqvzlxes(1000);
            f71756fyldjkxazc = stevsuqkhv.uawqvzlxes(1001);
            f71759ipoelvxyzq = stevsuqkhv.uawqvzlxes(1002);
            f71757grlcpdaxtj = stevsuqkhv.uawqvzlxes(1003);
            f71763mhtqkkgtqm = stevsuqkhv.uawqvzlxes(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            f71760ixidwrxhsl = stevsuqkhv.uawqvzlxes(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);
            f71761jrbgnlbqoe = stevsuqkhv.uawqvzlxes(1006);
            f71755fmlbqenlif = stevsuqkhv.uawqvzlxes(1007);
            f71752ezmngbhpjk = stevsuqkhv.uawqvzlxes(1008);
            f71764rhgxfdycjh = stevsuqkhv.uawqvzlxes(1009);
            f71765yzdjzghtvl = stevsuqkhv.uawqvzlxes(1010);
            f71751eslsurpljm = stevsuqkhv.uawqvzlxes(1011);
            f71762krqnebusok = stevsuqkhv.uawqvzlxes(1012);
            f71745a = stevsuqkhv.uawqvzlxes(1013);
            f71747b = stevsuqkhv.uawqvzlxes(1014);
            f71748c = stevsuqkhv.uawqvzlxes(1015);
            f71749d = stevsuqkhv.uawqvzlxes(1016);
            f71750e = stevsuqkhv.uawqvzlxes(1017);
            f71753f = stevsuqkhv.uawqvzlxes(1018);
        }

        private static boolean eablkybsjg(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i13 = 0; i13 < size; i13++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i13));
                if (iIndexOfKey < 0 || !gxszxtbevo((Map) sparseArray.valueAt(i13), (Map) sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean gxszxtbevo(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                m3.iwizpuwonk iwizpuwonkVar = (m3.iwizpuwonk) entry.getKey();
                if (!map2.containsKey(iwizpuwonkVar) || !Objects.equals(entry.getValue(), map2.get(iwizpuwonkVar))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean wkgbmnqykc(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i13 = 0; i13 < size; i13++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i13)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public boolean btonecajqb(int i13, m3.iwizpuwonk iwizpuwonkVar) {
            Map map = (Map) this.f71773lxfrhoxuzk.get(i13);
            return map != null && map.containsKey(iwizpuwonkVar);
        }

        public gxszxtbevo dxjokdxxww(int i13, m3.iwizpuwonk iwizpuwonkVar) {
            Map map = (Map) this.f71773lxfrhoxuzk.get(i13);
            if (map == null) {
                return null;
            }
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(map.get(iwizpuwonkVar));
            return null;
        }

        @Override // v2.lmojexxdyd
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || eablkybsjg.class != obj.getClass()) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return super.equals(eablkybsjgVar) && this.f71767bfopjjpdmp == eablkybsjgVar.f71767bfopjjpdmp && this.f71775opjhrmiecq == eablkybsjgVar.f71775opjhrmiecq && this.f71771iyctptxqzt == eablkybsjgVar.f71771iyctptxqzt && this.f71780weqkydbzbr == eablkybsjgVar.f71780weqkydbzbr && this.f71772lrnfpwlwnk == eablkybsjgVar.f71772lrnfpwlwnk && this.f71782zeieaojujs == eablkybsjgVar.f71782zeieaojujs && this.f71774nuxfzjnpeb == eablkybsjgVar.f71774nuxfzjnpeb && this.f71778tbqsvytpvh == eablkybsjgVar.f71778tbqsvytpvh && this.f71776roivzttewh == eablkybsjgVar.f71776roivzttewh && this.f71779uawqvzlxes == eablkybsjgVar.f71779uawqvzlxes && this.f71766auzgnhcxok == eablkybsjgVar.f71766auzgnhcxok && this.f71770iwxlajgraz == eablkybsjgVar.f71770iwxlajgraz && this.f71768dvvnrvtcbc == eablkybsjgVar.f71768dvvnrvtcbc && this.f71777skhdrjzrfn == eablkybsjgVar.f71777skhdrjzrfn && this.f71769igdgnonuha == eablkybsjgVar.f71769igdgnonuha && wkgbmnqykc(this.f71781wizcaqwiak, eablkybsjgVar.f71781wizcaqwiak) && eablkybsjg(this.f71773lxfrhoxuzk, eablkybsjgVar.f71773lxfrhoxuzk);
        }

        @Override // v2.lmojexxdyd
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f71767bfopjjpdmp ? 1 : 0)) * 31) + (this.f71775opjhrmiecq ? 1 : 0)) * 31) + (this.f71771iyctptxqzt ? 1 : 0)) * 31) + (this.f71780weqkydbzbr ? 1 : 0)) * 31) + (this.f71772lrnfpwlwnk ? 1 : 0)) * 31) + (this.f71782zeieaojujs ? 1 : 0)) * 31) + (this.f71774nuxfzjnpeb ? 1 : 0)) * 31) + (this.f71778tbqsvytpvh ? 1 : 0)) * 31) + (this.f71776roivzttewh ? 1 : 0)) * 31) + (this.f71779uawqvzlxes ? 1 : 0)) * 31) + (this.f71766auzgnhcxok ? 1 : 0)) * 31) + (this.f71770iwxlajgraz ? 1 : 0)) * 31) + (this.f71768dvvnrvtcbc ? 1 : 0)) * 31) + (this.f71777skhdrjzrfn ? 1 : 0)) * 31) + (this.f71769igdgnonuha ? 1 : 0);
        }

        @Override // v2.lmojexxdyd
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg iobyxmoadg() {
            return new iobyxmoadg();
        }

        public boolean nufgyqmvbu(int i13) {
            return this.f71781wizcaqwiak.get(i13);
        }

        private eablkybsjg(iobyxmoadg iobyxmoadgVar) {
            super(iobyxmoadgVar);
            this.f71767bfopjjpdmp = iobyxmoadgVar.f71787iozdgvuglv;
            this.f71775opjhrmiecq = iobyxmoadgVar.f71790lmojexxdyd;
            this.f71771iyctptxqzt = iobyxmoadgVar.f71797wwaezpbzkn;
            this.f71780weqkydbzbr = iobyxmoadgVar.f71799ylkuphrtab;
            this.f71772lrnfpwlwnk = iobyxmoadgVar.f71793pkzmftpjix;
            this.f71782zeieaojujs = iobyxmoadgVar.f71785hcddaimhww;
            this.f71774nuxfzjnpeb = iobyxmoadgVar.f71788jpowsppfya;
            this.f71778tbqsvytpvh = iobyxmoadgVar.f71786hkdspvbjdz;
            this.f71776roivzttewh = iobyxmoadgVar.f71783cllcsxoeiz;
            this.f71779uawqvzlxes = iobyxmoadgVar.f71784dsvhmnatus;
            this.f71766auzgnhcxok = iobyxmoadgVar.f71798wypolnanlu;
            this.f71770iwxlajgraz = iobyxmoadgVar.f71794stevsuqkhv;
            this.f71768dvvnrvtcbc = iobyxmoadgVar.f71789kegysxyocb;
            this.f71777skhdrjzrfn = iobyxmoadgVar.f71795tzroggbefp;
            this.f71769igdgnonuha = iobyxmoadgVar.f71791mbcevpiqjq;
            this.f71773lxfrhoxuzk = iobyxmoadgVar.f71792ntlheqmsrt;
            this.f71781wizcaqwiak = iobyxmoadgVar.f71796ulzqkzuiru;
        }
    }

    public static final class gxszxtbevo {
    }

    private static class lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Spatializer f71800iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Handler f71801ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Spatializer$OnSpatializerStateChangedListener f71802wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f71803zoijcleaow;

        class iobyxmoadg implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ agtfadlqog f71804iobyxmoadg;

            iobyxmoadg(agtfadlqog agtfadlqogVar) {
                this.f71804iobyxmoadg = agtfadlqogVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z13) {
                this.f71804iobyxmoadg.jlmebxxoox();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z13) {
                this.f71804iobyxmoadg.jlmebxxoox();
            }
        }

        public lqeggnwhkg(Context context, agtfadlqog agtfadlqogVar) {
            AudioManager audioManagerPpxfxbqfkf = context == null ? null : w2.eablkybsjg.ppxfxbqfkf(context);
            if (audioManagerPpxfxbqfkf == null || stevsuqkhv.hszhottldk((Context) y2.iobyxmoadg.eablkybsjg(context))) {
                this.f71800iobyxmoadg = null;
                this.f71803zoijcleaow = false;
                this.f71801ppxfxbqfkf = null;
                this.f71802wkgbmnqykc = null;
                return;
            }
            Spatializer spatializer = audioManagerPpxfxbqfkf.getSpatializer();
            this.f71800iobyxmoadg = spatializer;
            this.f71803zoijcleaow = spatializer.getImmersiveAudioLevel() != 0;
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(agtfadlqogVar);
            this.f71802wkgbmnqykc = iobyxmoadgVar;
            Handler handler = new Handler((Looper) y2.iobyxmoadg.dxjokdxxww(Looper.myLooper()));
            this.f71801ppxfxbqfkf = handler;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new h3.iozdgvuglv(handler), iobyxmoadgVar);
        }

        public void eablkybsjg() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
            Spatializer spatializer = this.f71800iobyxmoadg;
            if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.f71802wkgbmnqykc) == null || this.f71801ppxfxbqfkf == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            this.f71801ppxfxbqfkf.removeCallbacksAndMessages(null);
        }

        public boolean iobyxmoadg(v2.ppxfxbqfkf ppxfxbqfkfVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            int i13;
            if (Objects.equals(iobyxmoadgVar.f9769ojitshcjhn, "audio/eac3-joc")) {
                i13 = iobyxmoadgVar.f9779yadqdtsiqt;
                if (i13 == 16) {
                    i13 = 12;
                }
            } else if (Objects.equals(iobyxmoadgVar.f9769ojitshcjhn, "audio/iamf")) {
                i13 = iobyxmoadgVar.f9779yadqdtsiqt;
                if (i13 == -1) {
                    i13 = 6;
                }
            } else if (Objects.equals(iobyxmoadgVar.f9769ojitshcjhn, "audio/ac4")) {
                i13 = iobyxmoadgVar.f9779yadqdtsiqt;
                if (i13 == 18 || i13 == 21) {
                    i13 = 24;
                }
            } else {
                i13 = iobyxmoadgVar.f9779yadqdtsiqt;
            }
            int iJpowsppfya = stevsuqkhv.jpowsppfya(i13);
            if (iJpowsppfya == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iJpowsppfya);
            int i14 = iobyxmoadgVar.f9759iozdgvuglv;
            if (i14 != -1) {
                channelMask.setSampleRate(i14);
            }
            return kcexrzcfyt.iobyxmoadg(y2.iobyxmoadg.eablkybsjg(this.f71800iobyxmoadg)).canBeSpatialized(ppxfxbqfkfVar.iobyxmoadg().f115673iobyxmoadg, channelMask.build());
        }

        public boolean ppxfxbqfkf() {
            return kcexrzcfyt.iobyxmoadg(y2.iobyxmoadg.eablkybsjg(this.f71800iobyxmoadg)).isEnabled();
        }

        public boolean wkgbmnqykc() {
            return this.f71803zoijcleaow;
        }

        public boolean zoijcleaow() {
            return kcexrzcfyt.iobyxmoadg(y2.iobyxmoadg.eablkybsjg(this.f71800iobyxmoadg)).isAvailable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class nufgyqmvbu extends dxjokdxxww implements Comparable {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private final int f71806cdpycssgdh;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final int f71807cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final boolean f71808esjtqupxsv;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        private final boolean f71809iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private final int f71810istkbnxepw;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private final boolean f71811lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private final boolean f71812pmvmpeiblj;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private final int f71813yadqdtsiqt;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private final int f71814zynmafqrjb;

        public nufgyqmvbu(int i13, v2.yadqdtsiqt yadqdtsiqtVar, int i14, eablkybsjg eablkybsjgVar, int i15, String str, String str2) {
            int iWwaezpbzkn;
            super(i13, yadqdtsiqtVar, i14);
            int i16 = 0;
            this.f71808esjtqupxsv = hszhottldk.ojitshcjhn(i15, false);
            int i17 = this.f71741iwizpuwonk.f9752eablkybsjg & (~eablkybsjgVar.f115578esjtqupxsv);
            this.f71811lereixgezr = (i17 & 1) != 0;
            this.f71812pmvmpeiblj = (i17 & 2) != 0;
            com.google.common.collect.zdlpuopuiu zdlpuopuiuVarIstkbnxepw = str2 != null ? com.google.common.collect.zdlpuopuiu.istkbnxepw(str2) : eablkybsjgVar.f115584jyumaefscl.isEmpty() ? com.google.common.collect.zdlpuopuiu.istkbnxepw("") : eablkybsjgVar.f115584jyumaefscl;
            int i18 = 0;
            while (true) {
                if (i18 >= zdlpuopuiuVarIstkbnxepw.size()) {
                    i18 = Integer.MAX_VALUE;
                    iWwaezpbzkn = 0;
                    break;
                } else {
                    iWwaezpbzkn = agtfadlqog.wwaezpbzkn(this.f71741iwizpuwonk, (String) zdlpuopuiuVarIstkbnxepw.get(i18), eablkybsjgVar.f115586lereixgezr);
                    if (iWwaezpbzkn > 0) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            this.f71814zynmafqrjb = i18;
            this.f71810istkbnxepw = iWwaezpbzkn;
            int iJpowsppfya = agtfadlqog.jpowsppfya(this.f71741iwizpuwonk.f9755gxszxtbevo, str2 != null ? 1088 : eablkybsjgVar.f115583iwizpuwonk);
            this.f71806cdpycssgdh = iJpowsppfya;
            this.f71809iozdgvuglv = (1088 & this.f71741iwizpuwonk.f9755gxszxtbevo) != 0;
            int iWwaezpbzkn2 = agtfadlqog.wwaezpbzkn(this.f71741iwizpuwonk, str, agtfadlqog.vipkmwdibw(str) == null);
            this.f71813yadqdtsiqt = iWwaezpbzkn2;
            boolean z13 = iWwaezpbzkn > 0 || (eablkybsjgVar.f115584jyumaefscl.isEmpty() && iJpowsppfya > 0) || this.f71811lereixgezr || (this.f71812pmvmpeiblj && iWwaezpbzkn2 > 0);
            if (hszhottldk.ojitshcjhn(i15, eablkybsjgVar.f71770iwxlajgraz) && z13) {
                i16 = 1;
            }
            this.f71807cqumvgiudr = i16;
        }

        public static com.google.common.collect.zdlpuopuiu eablkybsjg(int i13, v2.yadqdtsiqt yadqdtsiqtVar, eablkybsjg eablkybsjgVar, int[] iArr, String str, String str2) {
            com.google.common.collect.zdlpuopuiu.iobyxmoadg iobyxmoadgVarKcexrzcfyt = com.google.common.collect.zdlpuopuiu.kcexrzcfyt();
            for (int i14 = 0; i14 < yadqdtsiqtVar.f115705iobyxmoadg; i14++) {
                iobyxmoadgVarKcexrzcfyt.iobyxmoadg(new nufgyqmvbu(i13, yadqdtsiqtVar, i14, eablkybsjgVar, iArr[i14], str, str2));
            }
            return iobyxmoadgVarKcexrzcfyt.gtknphoqwx();
        }

        public static int ppxfxbqfkf(List list, List list2) {
            return ((nufgyqmvbu) list.get(0)).compareTo((nufgyqmvbu) list2.get(0));
        }

        @Override // o3.agtfadlqog.dxjokdxxww
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(nufgyqmvbu nufgyqmvbuVar) {
            return false;
        }

        @Override // o3.agtfadlqog.dxjokdxxww
        public int iobyxmoadg() {
            return this.f71807cqumvgiudr;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public int compareTo(nufgyqmvbu nufgyqmvbuVar) {
            com.google.common.collect.wflxmlrfwp wflxmlrfwpVarWkgbmnqykc = com.google.common.collect.wflxmlrfwp.btonecajqb().lqeggnwhkg(this.f71808esjtqupxsv, nufgyqmvbuVar.f71808esjtqupxsv).gxszxtbevo(Integer.valueOf(this.f71814zynmafqrjb), Integer.valueOf(nufgyqmvbuVar.f71814zynmafqrjb), pkzmftpjix.lqeggnwhkg().dxjokdxxww()).wkgbmnqykc(this.f71810istkbnxepw, nufgyqmvbuVar.f71810istkbnxepw).wkgbmnqykc(this.f71806cdpycssgdh, nufgyqmvbuVar.f71806cdpycssgdh).lqeggnwhkg(this.f71811lereixgezr, nufgyqmvbuVar.f71811lereixgezr).gxszxtbevo(Boolean.valueOf(this.f71812pmvmpeiblj), Boolean.valueOf(nufgyqmvbuVar.f71812pmvmpeiblj), this.f71810istkbnxepw == 0 ? pkzmftpjix.lqeggnwhkg() : pkzmftpjix.lqeggnwhkg().dxjokdxxww()).wkgbmnqykc(this.f71813yadqdtsiqt, nufgyqmvbuVar.f71813yadqdtsiqt);
            if (this.f71806cdpycssgdh == 0) {
                wflxmlrfwpVarWkgbmnqykc = wflxmlrfwpVarWkgbmnqykc.nufgyqmvbu(this.f71809iozdgvuglv, nufgyqmvbuVar.f71809iozdgvuglv);
            }
            return wflxmlrfwpVarWkgbmnqykc.dxjokdxxww();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ppxfxbqfkf extends dxjokdxxww implements Comparable {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final int f71815cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final int f71816esjtqupxsv;

        public ppxfxbqfkf(int i13, v2.yadqdtsiqt yadqdtsiqtVar, int i14, eablkybsjg eablkybsjgVar, int i15) {
            super(i13, yadqdtsiqtVar, i14);
            this.f71815cqumvgiudr = hszhottldk.ojitshcjhn(i15, eablkybsjgVar.f71770iwxlajgraz) ? 1 : 0;
            this.f71816esjtqupxsv = this.f71741iwizpuwonk.eablkybsjg();
        }

        public static com.google.common.collect.zdlpuopuiu eablkybsjg(int i13, v2.yadqdtsiqt yadqdtsiqtVar, eablkybsjg eablkybsjgVar, int[] iArr) {
            com.google.common.collect.zdlpuopuiu.iobyxmoadg iobyxmoadgVarKcexrzcfyt = com.google.common.collect.zdlpuopuiu.kcexrzcfyt();
            for (int i14 = 0; i14 < yadqdtsiqtVar.f115705iobyxmoadg; i14++) {
                iobyxmoadgVarKcexrzcfyt.iobyxmoadg(new ppxfxbqfkf(i13, yadqdtsiqtVar, i14, eablkybsjgVar, iArr[i14]));
            }
            return iobyxmoadgVarKcexrzcfyt.gtknphoqwx();
        }

        public static int ppxfxbqfkf(List list, List list2) {
            return ((ppxfxbqfkf) list.get(0)).compareTo((ppxfxbqfkf) list2.get(0));
        }

        @Override // o3.agtfadlqog.dxjokdxxww
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
            return false;
        }

        @Override // o3.agtfadlqog.dxjokdxxww
        public int iobyxmoadg() {
            return this.f71815cqumvgiudr;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public int compareTo(ppxfxbqfkf ppxfxbqfkfVar) {
            return Integer.compare(this.f71816esjtqupxsv, ppxfxbqfkfVar.f71816esjtqupxsv);
        }
    }

    private static final class wkgbmnqykc implements Comparable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final boolean f71817yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final boolean f71818zdlpuopuiu;

        public wkgbmnqykc(androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i13) {
            this.f71818zdlpuopuiu = (iobyxmoadgVar.f9752eablkybsjg & 1) != 0;
            this.f71817yggfygwlhe = hszhottldk.ojitshcjhn(i13, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compareTo(wkgbmnqykc wkgbmnqykcVar) {
            return com.google.common.collect.wflxmlrfwp.btonecajqb().lqeggnwhkg(this.f71817yggfygwlhe, wkgbmnqykcVar.f71817yggfygwlhe).lqeggnwhkg(this.f71818zdlpuopuiu, wkgbmnqykcVar.f71818zdlpuopuiu).dxjokdxxww();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class zoijcleaow extends dxjokdxxww implements Comparable {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private final int f71819cdpycssgdh;

        /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
        private final int f71820cllcsxoeiz;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final int f71821cqumvgiudr;

        /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
        private final boolean f71822dsvhmnatus;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final boolean f71823esjtqupxsv;

        /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
        private final int f71824hcddaimhww;

        /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
        private final int f71825hkdspvbjdz;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        private final boolean f71826iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private final int f71827istkbnxepw;

        /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
        private final int f71828jpowsppfya;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private final String f71829lereixgezr;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        private final boolean f71830lmojexxdyd;

        /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
        private final boolean f71831pkzmftpjix;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private final eablkybsjg f71832pmvmpeiblj;

        /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
        private final boolean f71833stevsuqkhv;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        private final int f71834wwaezpbzkn;

        /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
        private final boolean f71835wypolnanlu;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private final int f71836yadqdtsiqt;

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        private final int f71837ylkuphrtab;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private final boolean f71838zynmafqrjb;

        public zoijcleaow(int i13, v2.yadqdtsiqt yadqdtsiqtVar, int i14, eablkybsjg eablkybsjgVar, int i15, boolean z13, xa.wflxmlrfwp wflxmlrfwpVar, int i16) {
            int i17;
            int iWwaezpbzkn;
            int iWwaezpbzkn2;
            super(i13, yadqdtsiqtVar, i14);
            this.f71832pmvmpeiblj = eablkybsjgVar;
            int i18 = eablkybsjgVar.f71779uawqvzlxes ? 24 : 16;
            this.f71826iozdgvuglv = eablkybsjgVar.f71782zeieaojujs && (i16 & i18) != 0;
            this.f71829lereixgezr = agtfadlqog.vipkmwdibw(this.f71741iwizpuwonk.f9777wkgbmnqykc);
            this.f71838zynmafqrjb = hszhottldk.ojitshcjhn(i15, false);
            int i19 = 0;
            while (true) {
                i17 = Integer.MAX_VALUE;
                if (i19 >= eablkybsjgVar.f115593rgvfuqvkyq.size()) {
                    iWwaezpbzkn = 0;
                    i19 = Integer.MAX_VALUE;
                    break;
                } else {
                    iWwaezpbzkn = agtfadlqog.wwaezpbzkn(this.f71741iwizpuwonk, (String) eablkybsjgVar.f115593rgvfuqvkyq.get(i19), false);
                    if (iWwaezpbzkn > 0) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            this.f71819cdpycssgdh = i19;
            this.f71827istkbnxepw = iWwaezpbzkn;
            this.f71836yadqdtsiqt = agtfadlqog.jpowsppfya(this.f71741iwizpuwonk.f9755gxszxtbevo, eablkybsjgVar.f115594vdvldrhtss);
            androidx.media3.common.iobyxmoadg iobyxmoadgVar = this.f71741iwizpuwonk;
            int i23 = iobyxmoadgVar.f9755gxszxtbevo;
            this.f71830lmojexxdyd = i23 == 0 || (i23 & 1) != 0;
            this.f71831pkzmftpjix = (iobyxmoadgVar.f9752eablkybsjg & 1) != 0;
            this.f71833stevsuqkhv = agtfadlqog.wypolnanlu(iobyxmoadgVar);
            androidx.media3.common.iobyxmoadg iobyxmoadgVar2 = this.f71741iwizpuwonk;
            int i24 = iobyxmoadgVar2.f9779yadqdtsiqt;
            this.f71824hcddaimhww = i24;
            this.f71828jpowsppfya = iobyxmoadgVar2.f9759iozdgvuglv;
            int i25 = iobyxmoadgVar2.f9745btonecajqb;
            this.f71825hkdspvbjdz = i25;
            this.f71823esjtqupxsv = (i25 == -1 || i25 <= eablkybsjgVar.f115585kcexrzcfyt) && (i24 == -1 || i24 <= eablkybsjgVar.f115590oxmwwwfdhm) && wflxmlrfwpVar.apply(iobyxmoadgVar2);
            String[] strArrYdmasvzmpa = stevsuqkhv.ydmasvzmpa();
            int i26 = 0;
            while (true) {
                if (i26 >= strArrYdmasvzmpa.length) {
                    iWwaezpbzkn2 = 0;
                    i26 = Integer.MAX_VALUE;
                    break;
                } else {
                    iWwaezpbzkn2 = agtfadlqog.wwaezpbzkn(this.f71741iwizpuwonk, strArrYdmasvzmpa[i26], false);
                    if (iWwaezpbzkn2 > 0) {
                        break;
                    } else {
                        i26++;
                    }
                }
            }
            this.f71834wwaezpbzkn = i26;
            this.f71837ylkuphrtab = iWwaezpbzkn2;
            for (int i27 = 0; i27 < eablkybsjgVar.f115599zdlpuopuiu.size(); i27++) {
                String str = this.f71741iwizpuwonk.f9769ojitshcjhn;
                if (str != null && str.equals(eablkybsjgVar.f115599zdlpuopuiu.get(i27))) {
                    i17 = i27;
                    break;
                }
            }
            this.f71820cllcsxoeiz = i17;
            this.f71822dsvhmnatus = hszhottldk.agtfadlqog(i15) == 128;
            this.f71835wypolnanlu = hszhottldk.lmojexxdyd(i15) == 64;
            this.f71821cqumvgiudr = gxszxtbevo(i15, z13, i18);
        }

        public static com.google.common.collect.zdlpuopuiu eablkybsjg(int i13, v2.yadqdtsiqt yadqdtsiqtVar, eablkybsjg eablkybsjgVar, int[] iArr, boolean z13, xa.wflxmlrfwp wflxmlrfwpVar, int i14) {
            com.google.common.collect.zdlpuopuiu.iobyxmoadg iobyxmoadgVarKcexrzcfyt = com.google.common.collect.zdlpuopuiu.kcexrzcfyt();
            for (int i15 = 0; i15 < yadqdtsiqtVar.f115705iobyxmoadg; i15++) {
                iobyxmoadgVarKcexrzcfyt.iobyxmoadg(new zoijcleaow(i13, yadqdtsiqtVar, i15, eablkybsjgVar, iArr[i15], z13, wflxmlrfwpVar, i14));
            }
            return iobyxmoadgVarKcexrzcfyt.gtknphoqwx();
        }

        private int gxszxtbevo(int i13, boolean z13, int i14) {
            if (!hszhottldk.ojitshcjhn(i13, this.f71832pmvmpeiblj.f71770iwxlajgraz)) {
                return 0;
            }
            if (!this.f71823esjtqupxsv && !this.f71832pmvmpeiblj.f71772lrnfpwlwnk) {
                return 0;
            }
            eablkybsjg eablkybsjgVar = this.f71832pmvmpeiblj;
            if (eablkybsjgVar.f115598yggfygwlhe.f115637iobyxmoadg == 2 && !agtfadlqog.jhduphickx(eablkybsjgVar, i13, this.f71741iwizpuwonk)) {
                return 0;
            }
            if (hszhottldk.ojitshcjhn(i13, false) && this.f71823esjtqupxsv && this.f71741iwizpuwonk.f9745btonecajqb != -1) {
                eablkybsjg eablkybsjgVar2 = this.f71832pmvmpeiblj;
                if (!eablkybsjgVar2.f115582istkbnxepw && !eablkybsjgVar2.f115601zynmafqrjb && ((eablkybsjgVar2.f71777skhdrjzrfn || !z13) && eablkybsjgVar2.f115598yggfygwlhe.f115637iobyxmoadg != 2 && (i13 & i14) != 0)) {
                    return 2;
                }
            }
            return 1;
        }

        public static int ppxfxbqfkf(List list, List list2) {
            return ((zoijcleaow) Collections.max(list)).compareTo((zoijcleaow) Collections.max(list2));
        }

        @Override // o3.agtfadlqog.dxjokdxxww
        public int iobyxmoadg() {
            return this.f71821cqumvgiudr;
        }

        @Override // o3.agtfadlqog.dxjokdxxww
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(zoijcleaow zoijcleaowVar) {
            int i13;
            String str;
            int i14;
            if ((this.f71832pmvmpeiblj.f71778tbqsvytpvh || ((i14 = this.f71741iwizpuwonk.f9779yadqdtsiqt) != -1 && i14 == zoijcleaowVar.f71741iwizpuwonk.f9779yadqdtsiqt)) && (this.f71826iozdgvuglv || ((str = this.f71741iwizpuwonk.f9769ojitshcjhn) != null && TextUtils.equals(str, zoijcleaowVar.f71741iwizpuwonk.f9769ojitshcjhn)))) {
                eablkybsjg eablkybsjgVar = this.f71832pmvmpeiblj;
                if ((eablkybsjgVar.f71774nuxfzjnpeb || ((i13 = this.f71741iwizpuwonk.f9759iozdgvuglv) != -1 && i13 == zoijcleaowVar.f71741iwizpuwonk.f9759iozdgvuglv)) && (eablkybsjgVar.f71776roivzttewh || (this.f71822dsvhmnatus == zoijcleaowVar.f71822dsvhmnatus && this.f71835wypolnanlu == zoijcleaowVar.f71835wypolnanlu))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public int compareTo(zoijcleaow zoijcleaowVar) {
            pkzmftpjix pkzmftpjixVarDxjokdxxww = (this.f71823esjtqupxsv && this.f71838zynmafqrjb) ? agtfadlqog.f71716btonecajqb : agtfadlqog.f71716btonecajqb.dxjokdxxww();
            com.google.common.collect.wflxmlrfwp wflxmlrfwpVarGxszxtbevo = com.google.common.collect.wflxmlrfwp.btonecajqb().lqeggnwhkg(this.f71838zynmafqrjb, zoijcleaowVar.f71838zynmafqrjb).gxszxtbevo(Integer.valueOf(this.f71819cdpycssgdh), Integer.valueOf(zoijcleaowVar.f71819cdpycssgdh), pkzmftpjix.lqeggnwhkg().dxjokdxxww()).wkgbmnqykc(this.f71827istkbnxepw, zoijcleaowVar.f71827istkbnxepw).wkgbmnqykc(this.f71836yadqdtsiqt, zoijcleaowVar.f71836yadqdtsiqt).lqeggnwhkg(this.f71831pkzmftpjix, zoijcleaowVar.f71831pkzmftpjix).lqeggnwhkg(this.f71830lmojexxdyd, zoijcleaowVar.f71830lmojexxdyd).gxszxtbevo(Integer.valueOf(this.f71834wwaezpbzkn), Integer.valueOf(zoijcleaowVar.f71834wwaezpbzkn), pkzmftpjix.lqeggnwhkg().dxjokdxxww()).wkgbmnqykc(this.f71837ylkuphrtab, zoijcleaowVar.f71837ylkuphrtab).lqeggnwhkg(this.f71823esjtqupxsv, zoijcleaowVar.f71823esjtqupxsv).gxszxtbevo(Integer.valueOf(this.f71820cllcsxoeiz), Integer.valueOf(zoijcleaowVar.f71820cllcsxoeiz), pkzmftpjix.lqeggnwhkg().dxjokdxxww());
            if (this.f71832pmvmpeiblj.f115601zynmafqrjb) {
                wflxmlrfwpVarGxszxtbevo = wflxmlrfwpVarGxszxtbevo.gxszxtbevo(Integer.valueOf(this.f71825hkdspvbjdz), Integer.valueOf(zoijcleaowVar.f71825hkdspvbjdz), agtfadlqog.f71716btonecajqb.dxjokdxxww());
            }
            com.google.common.collect.wflxmlrfwp wflxmlrfwpVarGxszxtbevo2 = wflxmlrfwpVarGxszxtbevo.lqeggnwhkg(this.f71822dsvhmnatus, zoijcleaowVar.f71822dsvhmnatus).lqeggnwhkg(this.f71835wypolnanlu, zoijcleaowVar.f71835wypolnanlu).lqeggnwhkg(this.f71833stevsuqkhv, zoijcleaowVar.f71833stevsuqkhv).gxszxtbevo(Integer.valueOf(this.f71824hcddaimhww), Integer.valueOf(zoijcleaowVar.f71824hcddaimhww), pkzmftpjixVarDxjokdxxww).gxszxtbevo(Integer.valueOf(this.f71828jpowsppfya), Integer.valueOf(zoijcleaowVar.f71828jpowsppfya), pkzmftpjixVarDxjokdxxww);
            if (Objects.equals(this.f71829lereixgezr, zoijcleaowVar.f71829lereixgezr)) {
                wflxmlrfwpVarGxszxtbevo2 = wflxmlrfwpVarGxszxtbevo2.gxszxtbevo(Integer.valueOf(this.f71825hkdspvbjdz), Integer.valueOf(zoijcleaowVar.f71825hkdspvbjdz), pkzmftpjixVarDxjokdxxww);
            }
            return wflxmlrfwpVarGxszxtbevo2.dxjokdxxww();
        }
    }

    public agtfadlqog(Context context) {
        this(context, new o3.iobyxmoadg.zoijcleaow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: cllcsxoeiz, reason: merged with bridge method [inline-methods] */
    public boolean stevsuqkhv(androidx.media3.common.iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar) {
        int i13;
        lqeggnwhkg lqeggnwhkgVar;
        lqeggnwhkg lqeggnwhkgVar2;
        return !eablkybsjgVar.f71766auzgnhcxok || (i13 = iobyxmoadgVar.f9779yadqdtsiqt) == -1 || i13 <= 2 || (dsvhmnatus(iobyxmoadgVar) && (stevsuqkhv.f123602iobyxmoadg < 32 || (lqeggnwhkgVar2 = this.f71721nufgyqmvbu) == null || !lqeggnwhkgVar2.wkgbmnqykc())) || (stevsuqkhv.f123602iobyxmoadg >= 32 && (lqeggnwhkgVar = this.f71721nufgyqmvbu) != null && lqeggnwhkgVar.wkgbmnqykc() && this.f71721nufgyqmvbu.zoijcleaow() && this.f71721nufgyqmvbu.ppxfxbqfkf() && this.f71721nufgyqmvbu.iobyxmoadg(this.f71717dxjokdxxww, iobyxmoadgVar));
    }

    private static void crxdokpmqz(pmvmpeiblj.iobyxmoadg iobyxmoadgVar, int[][][] iArr, hcddaimhww[] hcddaimhwwVarArr, esjtqupxsv[] esjtqupxsvVarArr) {
        boolean z13;
        int i13 = -1;
        int i14 = -1;
        int i15 = 0;
        while (true) {
            if (i15 >= iobyxmoadgVar.wkgbmnqykc()) {
                z13 = true;
                break;
            }
            int iEablkybsjg = iobyxmoadgVar.eablkybsjg(i15);
            esjtqupxsv esjtqupxsvVar = esjtqupxsvVarArr[i15];
            if ((iEablkybsjg == 1 || iEablkybsjg == 2) && esjtqupxsvVar != null && ikoacuggdj(iArr[i15], iobyxmoadgVar.gxszxtbevo(i15), esjtqupxsvVar)) {
                if (iEablkybsjg == 1) {
                    if (i14 != -1) {
                        z13 = false;
                        break;
                    }
                    i14 = i15;
                } else {
                    if (i13 != -1) {
                        z13 = false;
                        break;
                    }
                    i13 = i15;
                }
            }
            i15++;
        }
        if (z13 && ((i14 == -1 || i13 == -1) ? false : true)) {
            hcddaimhww hcddaimhwwVar = new hcddaimhww(0, true);
            hcddaimhwwVarArr[i14] = hcddaimhwwVar;
            hcddaimhwwVarArr[i13] = hcddaimhwwVar;
        }
    }

    private Pair czzsidtyhn(int i13, pmvmpeiblj.iobyxmoadg iobyxmoadgVar, int[][][] iArr, dxjokdxxww.iobyxmoadg iobyxmoadgVar2, Comparator comparator) {
        int i14;
        RandomAccess randomAccessIstkbnxepw;
        ArrayList arrayList = new ArrayList();
        int iWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        int i15 = 0;
        while (i15 < iWkgbmnqykc) {
            if (i13 == iobyxmoadgVar.eablkybsjg(i15)) {
                m3.iwizpuwonk iwizpuwonkVarGxszxtbevo = iobyxmoadgVar.gxszxtbevo(i15);
                for (int i16 = 0; i16 < iwizpuwonkVarGxszxtbevo.f65036iobyxmoadg; i16++) {
                    v2.yadqdtsiqt yadqdtsiqtVarZoijcleaow = iwizpuwonkVarGxszxtbevo.zoijcleaow(i16);
                    List listIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(i15, yadqdtsiqtVarZoijcleaow, iArr[i15][i16]);
                    boolean[] zArr = new boolean[yadqdtsiqtVarZoijcleaow.f115705iobyxmoadg];
                    int i17 = 0;
                    while (i17 < yadqdtsiqtVarZoijcleaow.f115705iobyxmoadg) {
                        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) listIobyxmoadg.get(i17);
                        int iIobyxmoadg = dxjokdxxwwVar.iobyxmoadg();
                        if (zArr[i17] || iIobyxmoadg == 0) {
                            i14 = iWkgbmnqykc;
                        } else {
                            if (iIobyxmoadg == 1) {
                                randomAccessIstkbnxepw = com.google.common.collect.zdlpuopuiu.istkbnxepw(dxjokdxxwwVar);
                                i14 = iWkgbmnqykc;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(dxjokdxxwwVar);
                                int i18 = i17 + 1;
                                while (i18 < yadqdtsiqtVarZoijcleaow.f115705iobyxmoadg) {
                                    dxjokdxxww dxjokdxxwwVar2 = (dxjokdxxww) listIobyxmoadg.get(i18);
                                    int i19 = iWkgbmnqykc;
                                    if (dxjokdxxwwVar2.iobyxmoadg() == 2 && dxjokdxxwwVar.zoijcleaow(dxjokdxxwwVar2)) {
                                        arrayList2.add(dxjokdxxwwVar2);
                                        zArr[i18] = true;
                                    }
                                    i18++;
                                    iWkgbmnqykc = i19;
                                }
                                i14 = iWkgbmnqykc;
                                randomAccessIstkbnxepw = arrayList2;
                            }
                            arrayList.add(randomAccessIstkbnxepw);
                        }
                        i17++;
                        iWkgbmnqykc = i14;
                    }
                }
            }
            i15++;
            iWkgbmnqykc = iWkgbmnqykc;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i23 = 0; i23 < list.size(); i23++) {
            iArr2[i23] = ((dxjokdxxww) list.get(i23)).f71742jyumaefscl;
        }
        dxjokdxxww dxjokdxxwwVar3 = (dxjokdxxww) list.get(0);
        return Pair.create(new esjtqupxsv.iobyxmoadg(dxjokdxxwwVar3.f71743yggfygwlhe, iArr2), Integer.valueOf(dxjokdxxwwVar3.f71744zdlpuopuiu));
    }

    private static boolean dsvhmnatus(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        String str = iobyxmoadgVar.f9769ojitshcjhn;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/ac4":
            case "audio/eac3":
                return true;
            default:
                return false;
        }
    }

    private static String hcddaimhww(Context context) {
        CaptioningManager captioningManager;
        Locale locale;
        if (context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            return null;
        }
        return stevsuqkhv.vipkmwdibw(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int hkdspvbjdz(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "video/dolby-vision":
                return 5;
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    private static boolean ikoacuggdj(int[][] iArr, m3.iwizpuwonk iwizpuwonkVar, esjtqupxsv esjtqupxsvVar) {
        if (esjtqupxsvVar == null) {
            return false;
        }
        int iWkgbmnqykc = iwizpuwonkVar.wkgbmnqykc(esjtqupxsvVar.nufgyqmvbu());
        for (int i13 = 0; i13 < esjtqupxsvVar.length(); i13++) {
            if (hszhottldk.zdlpuopuiu(iArr[iWkgbmnqykc][esjtqupxsvVar.ppxfxbqfkf(i13)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private static void iozdgvuglv(pmvmpeiblj.iobyxmoadg iobyxmoadgVar, lmojexxdyd lmojexxdydVar, esjtqupxsv.iobyxmoadg[] iobyxmoadgVarArr) {
        int iWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        HashMap map = new HashMap();
        for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
            lmojexxdyd(iobyxmoadgVar.gxszxtbevo(i13), lmojexxdydVar, map);
        }
        lmojexxdyd(iobyxmoadgVar.nufgyqmvbu(), lmojexxdydVar, map);
        for (int i14 = 0; i14 < iWkgbmnqykc; i14++) {
            iozdgvuglv iozdgvuglvVar = (iozdgvuglv) map.get(Integer.valueOf(iobyxmoadgVar.eablkybsjg(i14)));
            if (iozdgvuglvVar != null) {
                iobyxmoadgVarArr[i14] = (iozdgvuglvVar.f115369zoijcleaow.isEmpty() || iobyxmoadgVar.gxszxtbevo(i14).wkgbmnqykc(iozdgvuglvVar.f115368iobyxmoadg) == -1) ? null : new esjtqupxsv.iobyxmoadg(iozdgvuglvVar.f115368iobyxmoadg, com.google.common.primitives.gxszxtbevo.draadjrbmk(iozdgvuglvVar.f115369zoijcleaow));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean jhduphickx(eablkybsjg eablkybsjgVar, int i13, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        if (hszhottldk.pmvmpeiblj(i13) == 0) {
            return false;
        }
        if (eablkybsjgVar.f115598yggfygwlhe.f115638ppxfxbqfkf && (hszhottldk.pmvmpeiblj(i13) & 2048) == 0) {
            return false;
        }
        if (eablkybsjgVar.f115598yggfygwlhe.f115639zoijcleaow) {
            return !(iobyxmoadgVar.f9778wwaezpbzkn != 0 || iobyxmoadgVar.f9781ylkuphrtab != 0) || ((hszhottldk.pmvmpeiblj(i13) & UserVerificationMethods.USER_VERIFY_ALL) != 0);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jlmebxxoox() {
        boolean z13;
        lqeggnwhkg lqeggnwhkgVar;
        synchronized (this.f71722wkgbmnqykc) {
            try {
                z13 = this.f71720lqeggnwhkg.f71766auzgnhcxok && stevsuqkhv.f123602iobyxmoadg >= 32 && (lqeggnwhkgVar = this.f71721nufgyqmvbu) != null && lqeggnwhkgVar.wkgbmnqykc();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z13) {
            gxszxtbevo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int jpowsppfya(int i13, int i14) {
        if (i13 == 0 || i13 != i14) {
            return Integer.bitCount(i13 & i14);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List kegysxyocb(final eablkybsjg eablkybsjgVar, boolean z13, int[] iArr, int i13, v2.yadqdtsiqt yadqdtsiqtVar, int[] iArr2) {
        return zoijcleaow.eablkybsjg(i13, yadqdtsiqtVar, eablkybsjgVar, iArr2, z13, new xa.wflxmlrfwp() { // from class: o3.wflxmlrfwp
            @Override // xa.wflxmlrfwp
            public final boolean apply(Object obj) {
                return this.f71900zdlpuopuiu.stevsuqkhv(eablkybsjgVar, (androidx.media3.common.iobyxmoadg) obj);
            }
        }, iArr[i13]);
    }

    private static void lmojexxdyd(m3.iwizpuwonk iwizpuwonkVar, lmojexxdyd lmojexxdydVar, Map map) {
        iozdgvuglv iozdgvuglvVar;
        for (int i13 = 0; i13 < iwizpuwonkVar.f65036iobyxmoadg; i13++) {
            iozdgvuglv iozdgvuglvVar2 = (iozdgvuglv) lmojexxdydVar.f115573cdpycssgdh.get(iwizpuwonkVar.zoijcleaow(i13));
            if (iozdgvuglvVar2 != null && ((iozdgvuglvVar = (iozdgvuglv) map.get(Integer.valueOf(iozdgvuglvVar2.iobyxmoadg()))) == null || (iozdgvuglvVar.f115369zoijcleaow.isEmpty() && !iozdgvuglvVar2.f115369zoijcleaow.isEmpty()))) {
                map.put(Integer.valueOf(iozdgvuglvVar2.iobyxmoadg()), iozdgvuglvVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List mbcevpiqjq(eablkybsjg eablkybsjgVar, String str, String str2, int i13, v2.yadqdtsiqt yadqdtsiqtVar, int[] iArr) {
        return nufgyqmvbu.eablkybsjg(i13, yadqdtsiqtVar, eablkybsjgVar, iArr, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List ntlheqmsrt(eablkybsjg eablkybsjgVar, String str, int[] iArr, Point point, int i13, v2.yadqdtsiqt yadqdtsiqtVar, int[] iArr2) {
        return btonecajqb.nufgyqmvbu(i13, yadqdtsiqtVar, eablkybsjgVar, iArr2, str, iArr[i13], point);
    }

    private void ribwqtqdhb(wizcaqwiak wizcaqwiakVar) {
        boolean z13;
        synchronized (this.f71722wkgbmnqykc) {
            z13 = this.f71720lqeggnwhkg.f71769igdgnonuha;
        }
        if (z13) {
            lqeggnwhkg(wizcaqwiakVar);
        }
    }

    private static void sopmlzcsov(eablkybsjg eablkybsjgVar, pmvmpeiblj.iobyxmoadg iobyxmoadgVar, int[][][] iArr, hcddaimhww[] hcddaimhwwVarArr, esjtqupxsv[] esjtqupxsvVarArr) {
        int i13 = -1;
        boolean z13 = false;
        int i14 = 0;
        for (int i15 = 0; i15 < iobyxmoadgVar.wkgbmnqykc(); i15++) {
            int iEablkybsjg = iobyxmoadgVar.eablkybsjg(i15);
            esjtqupxsv esjtqupxsvVar = esjtqupxsvVarArr[i15];
            if (iEablkybsjg != 1 && esjtqupxsvVar != null) {
                return;
            }
            if (iEablkybsjg == 1 && esjtqupxsvVar != null && esjtqupxsvVar.length() == 1) {
                if (jhduphickx(eablkybsjgVar, iArr[i15][iobyxmoadgVar.gxszxtbevo(i15).wkgbmnqykc(esjtqupxsvVar.nufgyqmvbu())][esjtqupxsvVar.ppxfxbqfkf(0)], esjtqupxsvVar.draadjrbmk())) {
                    i14++;
                    i13 = i15;
                }
            }
        }
        if (i14 == 1) {
            int i16 = eablkybsjgVar.f115598yggfygwlhe.f115639zoijcleaow ? 1 : 2;
            hcddaimhww hcddaimhwwVar = hcddaimhwwVarArr[i13];
            if (hcddaimhwwVar != null && hcddaimhwwVar.f32666zoijcleaow) {
                z13 = true;
            }
            hcddaimhwwVarArr[i13] = new hcddaimhww(i16, z13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List tzroggbefp(eablkybsjg eablkybsjgVar, int i13, v2.yadqdtsiqt yadqdtsiqtVar, int[] iArr) {
        return ppxfxbqfkf.eablkybsjg(i13, yadqdtsiqtVar, eablkybsjgVar, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int ulzqkzuiru(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    protected static String vipkmwdibw(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static int wwaezpbzkn(androidx.media3.common.iobyxmoadg iobyxmoadgVar, String str, boolean z13) {
        if (!TextUtils.isEmpty(str) && str.equals(iobyxmoadgVar.f9777wkgbmnqykc)) {
            return 4;
        }
        String strVipkmwdibw = vipkmwdibw(str);
        String strVipkmwdibw2 = vipkmwdibw(iobyxmoadgVar.f9777wkgbmnqykc);
        if (strVipkmwdibw2 == null || strVipkmwdibw == null) {
            return (z13 && strVipkmwdibw2 == null) ? 1 : 0;
        }
        if (strVipkmwdibw2.startsWith(strVipkmwdibw) || strVipkmwdibw.startsWith(strVipkmwdibw2)) {
            return 3;
        }
        return stevsuqkhv.l(strVipkmwdibw2, "-")[0].equals(stevsuqkhv.l(strVipkmwdibw, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean wypolnanlu(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        String str = iobyxmoadgVar.f9769ojitshcjhn;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac4":
            case "audio/iamf":
                return true;
            default:
                return false;
        }
    }

    private static void yadqdtsiqt(pmvmpeiblj.iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar, esjtqupxsv.iobyxmoadg[] iobyxmoadgVarArr) {
        int iWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
            m3.iwizpuwonk iwizpuwonkVarGxszxtbevo = iobyxmoadgVar.gxszxtbevo(i13);
            if (eablkybsjgVar.btonecajqb(i13, iwizpuwonkVarGxszxtbevo)) {
                eablkybsjgVar.dxjokdxxww(i13, iwizpuwonkVarGxszxtbevo);
                iobyxmoadgVarArr[i13] = null;
            }
        }
    }

    private void yfnezrywwk(eablkybsjg eablkybsjgVar) {
        boolean zEquals;
        y2.iobyxmoadg.eablkybsjg(eablkybsjgVar);
        synchronized (this.f71722wkgbmnqykc) {
            zEquals = this.f71720lqeggnwhkg.equals(eablkybsjgVar);
            this.f71720lqeggnwhkg = eablkybsjgVar;
        }
        if (zEquals) {
            return;
        }
        if (eablkybsjgVar.f71766auzgnhcxok && this.f71718eablkybsjg == null) {
            y2.kcexrzcfyt.nufgyqmvbu("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        gxszxtbevo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ylkuphrtab(v2.yadqdtsiqt yadqdtsiqtVar, int i13, int i14, boolean z13) {
        int i15;
        int i16 = Integer.MAX_VALUE;
        if (i13 != Integer.MAX_VALUE && i14 != Integer.MAX_VALUE) {
            for (int i17 = 0; i17 < yadqdtsiqtVar.f115705iobyxmoadg; i17++) {
                androidx.media3.common.iobyxmoadg iobyxmoadgVarIobyxmoadg = yadqdtsiqtVar.iobyxmoadg(i17);
                int i18 = iobyxmoadgVarIobyxmoadg.f9763jyumaefscl;
                if (i18 > 0 && (i15 = iobyxmoadgVarIobyxmoadg.f9761iwizpuwonk) > 0) {
                    Point pointPpxfxbqfkf = istkbnxepw.ppxfxbqfkf(z13, i13, i14, i18, i15);
                    int i19 = iobyxmoadgVarIobyxmoadg.f9763jyumaefscl;
                    int i23 = iobyxmoadgVarIobyxmoadg.f9761iwizpuwonk;
                    int i24 = i19 * i23;
                    if (i19 >= ((int) (pointPpxfxbqfkf.x * 0.98f)) && i23 >= ((int) (pointPpxfxbqfkf.y * 0.98f)) && i24 < i16) {
                        i16 = i24;
                    }
                }
            }
        }
        return i16;
    }

    @Override // o3.cdpycssgdh
    public void btonecajqb() {
        lqeggnwhkg lqeggnwhkgVar;
        if (stevsuqkhv.f123602iobyxmoadg >= 32 && (lqeggnwhkgVar = this.f71721nufgyqmvbu) != null) {
            lqeggnwhkgVar.eablkybsjg();
        }
        super.btonecajqb();
    }

    @Override // o3.cdpycssgdh
    public void draadjrbmk(v2.ppxfxbqfkf ppxfxbqfkfVar) {
        if (this.f71717dxjokdxxww.equals(ppxfxbqfkfVar)) {
            return;
        }
        this.f71717dxjokdxxww = ppxfxbqfkfVar;
        jlmebxxoox();
    }

    @Override // androidx.media3.exoplayer.hszhottldk.iobyxmoadg
    public void iobyxmoadg(wizcaqwiak wizcaqwiakVar) {
        ribwqtqdhb(wizcaqwiakVar);
    }

    protected Pair jztzpxfvev(pmvmpeiblj.iobyxmoadg iobyxmoadgVar, int[][][] iArr, final int[] iArr2, final eablkybsjg eablkybsjgVar) {
        final boolean z13 = false;
        for (int i13 = 0; i13 < iobyxmoadgVar.wkgbmnqykc(); i13++) {
            if (2 == iobyxmoadgVar.eablkybsjg(i13) && iobyxmoadgVar.gxszxtbevo(i13).f65036iobyxmoadg > 0) {
                z13 = true;
                break;
            }
        }
        return czzsidtyhn(1, iobyxmoadgVar, iArr, new dxjokdxxww.iobyxmoadg() { // from class: o3.dxjokdxxww
            @Override // o3.agtfadlqog.dxjokdxxww.iobyxmoadg
            public final List iobyxmoadg(int i14, v2.yadqdtsiqt yadqdtsiqtVar, int[] iArr3) {
                return this.f71841iobyxmoadg.kegysxyocb(eablkybsjgVar, z13, iArr2, i14, yadqdtsiqtVar, iArr3);
            }
        }, new Comparator() { // from class: o3.btonecajqb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return agtfadlqog.zoijcleaow.ppxfxbqfkf((List) obj, (List) obj2);
            }
        });
    }

    protected esjtqupxsv.iobyxmoadg metgxyhuhe(int i13, m3.iwizpuwonk iwizpuwonkVar, int[][] iArr, eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar.f115598yggfygwlhe.f115637iobyxmoadg == 2) {
            return null;
        }
        int i14 = 0;
        v2.yadqdtsiqt yadqdtsiqtVar = null;
        wkgbmnqykc wkgbmnqykcVar = null;
        for (int i15 = 0; i15 < iwizpuwonkVar.f65036iobyxmoadg; i15++) {
            v2.yadqdtsiqt yadqdtsiqtVarZoijcleaow = iwizpuwonkVar.zoijcleaow(i15);
            int[] iArr2 = iArr[i15];
            for (int i16 = 0; i16 < yadqdtsiqtVarZoijcleaow.f115705iobyxmoadg; i16++) {
                if (hszhottldk.ojitshcjhn(iArr2[i16], eablkybsjgVar.f71770iwxlajgraz)) {
                    wkgbmnqykc wkgbmnqykcVar2 = new wkgbmnqykc(yadqdtsiqtVarZoijcleaow.iobyxmoadg(i16), iArr2[i16]);
                    if (wkgbmnqykcVar == null || wkgbmnqykcVar2.compareTo(wkgbmnqykcVar) > 0) {
                        yadqdtsiqtVar = yadqdtsiqtVarZoijcleaow;
                        i14 = i16;
                        wkgbmnqykcVar = wkgbmnqykcVar2;
                    }
                }
            }
        }
        if (yadqdtsiqtVar == null) {
            return null;
        }
        return new esjtqupxsv.iobyxmoadg(yadqdtsiqtVar, i14);
    }

    @Override // o3.cdpycssgdh
    public boolean nufgyqmvbu() {
        return true;
    }

    protected esjtqupxsv.iobyxmoadg[] okpsazkaxt(pmvmpeiblj.iobyxmoadg iobyxmoadgVar, int[][][] iArr, int[] iArr2, eablkybsjg eablkybsjgVar) {
        String str;
        int iWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        esjtqupxsv.iobyxmoadg[] iobyxmoadgVarArr = new esjtqupxsv.iobyxmoadg[iWkgbmnqykc];
        Pair pairJztzpxfvev = jztzpxfvev(iobyxmoadgVar, iArr, iArr2, eablkybsjgVar);
        if (pairJztzpxfvev != null) {
            iobyxmoadgVarArr[((Integer) pairJztzpxfvev.second).intValue()] = (esjtqupxsv.iobyxmoadg) pairJztzpxfvev.first;
        }
        if (pairJztzpxfvev == null) {
            str = null;
        } else {
            Object obj = pairJztzpxfvev.first;
            str = ((esjtqupxsv.iobyxmoadg) obj).f71846iobyxmoadg.iobyxmoadg(((esjtqupxsv.iobyxmoadg) obj).f71848zoijcleaow[0]).f9777wkgbmnqykc;
        }
        Pair pairUwvvkdfqfp = uwvvkdfqfp(iobyxmoadgVar, iArr, iArr2, eablkybsjgVar, str);
        Pair pairXrmfcynszj = (eablkybsjgVar.f115591pmvmpeiblj || pairUwvvkdfqfp == null) ? xrmfcynszj(iobyxmoadgVar, iArr, eablkybsjgVar) : null;
        if (pairXrmfcynszj != null) {
            iobyxmoadgVarArr[((Integer) pairXrmfcynszj.second).intValue()] = (esjtqupxsv.iobyxmoadg) pairXrmfcynszj.first;
        } else if (pairUwvvkdfqfp != null) {
            iobyxmoadgVarArr[((Integer) pairUwvvkdfqfp.second).intValue()] = (esjtqupxsv.iobyxmoadg) pairUwvvkdfqfp.first;
        }
        Pair pairRlfsiqarku = rlfsiqarku(iobyxmoadgVar, iArr, eablkybsjgVar, str);
        if (pairRlfsiqarku != null) {
            iobyxmoadgVarArr[((Integer) pairRlfsiqarku.second).intValue()] = (esjtqupxsv.iobyxmoadg) pairRlfsiqarku.first;
        }
        for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
            int iEablkybsjg = iobyxmoadgVar.eablkybsjg(i13);
            if (iEablkybsjg != 2 && iEablkybsjg != 1 && iEablkybsjg != 3 && iEablkybsjg != 4) {
                iobyxmoadgVarArr[i13] = metgxyhuhe(iEablkybsjg, iobyxmoadgVar.gxszxtbevo(i13), iArr[i13], eablkybsjgVar);
            }
        }
        return iobyxmoadgVarArr;
    }

    @Override // o3.cdpycssgdh
    /* JADX INFO: renamed from: pkzmftpjix, reason: merged with bridge method [inline-methods] */
    public eablkybsjg ppxfxbqfkf() {
        eablkybsjg eablkybsjgVar;
        synchronized (this.f71722wkgbmnqykc) {
            eablkybsjgVar = this.f71720lqeggnwhkg;
        }
        return eablkybsjgVar;
    }

    protected Pair rlfsiqarku(pmvmpeiblj.iobyxmoadg iobyxmoadgVar, int[][][] iArr, final eablkybsjg eablkybsjgVar, final String str) {
        if (eablkybsjgVar.f115598yggfygwlhe.f115637iobyxmoadg == 2) {
            return null;
        }
        final String strHcddaimhww = eablkybsjgVar.f115574cqumvgiudr ? hcddaimhww(this.f71718eablkybsjg) : null;
        return czzsidtyhn(3, iobyxmoadgVar, iArr, new dxjokdxxww.iobyxmoadg() { // from class: o3.gtknphoqwx
            @Override // o3.agtfadlqog.dxjokdxxww.iobyxmoadg
            public final List iobyxmoadg(int i13, v2.yadqdtsiqt yadqdtsiqtVar, int[] iArr2) {
                return agtfadlqog.mbcevpiqjq(eablkybsjgVar, str, strHcddaimhww, i13, yadqdtsiqtVar, iArr2);
            }
        }, new Comparator() { // from class: o3.draadjrbmk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return agtfadlqog.nufgyqmvbu.ppxfxbqfkf((List) obj, (List) obj2);
            }
        });
    }

    protected Pair uwvvkdfqfp(pmvmpeiblj.iobyxmoadg iobyxmoadgVar, int[][][] iArr, final int[] iArr2, final eablkybsjg eablkybsjgVar, final String str) {
        Context context;
        final Point pointKegysxyocb = null;
        if (eablkybsjgVar.f115598yggfygwlhe.f115637iobyxmoadg == 2) {
            return null;
        }
        if (eablkybsjgVar.f115579gtknphoqwx && (context = this.f71718eablkybsjg) != null) {
            pointKegysxyocb = stevsuqkhv.kegysxyocb(context);
        }
        return czzsidtyhn(2, iobyxmoadgVar, iArr, new dxjokdxxww.iobyxmoadg() { // from class: o3.lqeggnwhkg
            @Override // o3.agtfadlqog.dxjokdxxww.iobyxmoadg
            public final List iobyxmoadg(int i13, v2.yadqdtsiqt yadqdtsiqtVar, int[] iArr3) {
                return agtfadlqog.ntlheqmsrt(eablkybsjgVar, str, iArr2, pointKegysxyocb, i13, yadqdtsiqtVar, iArr3);
            }
        }, new Comparator() { // from class: o3.nufgyqmvbu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return agtfadlqog.btonecajqb.lqeggnwhkg((List) obj, (List) obj2);
            }
        });
    }

    @Override // o3.pmvmpeiblj
    protected final Pair vdvldrhtss(pmvmpeiblj.iobyxmoadg iobyxmoadgVar, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, v2.cdpycssgdh cdpycssgdhVar) {
        eablkybsjg eablkybsjgVar;
        synchronized (this.f71722wkgbmnqykc) {
            eablkybsjgVar = this.f71720lqeggnwhkg;
        }
        if (eablkybsjgVar.f71766auzgnhcxok && stevsuqkhv.f123602iobyxmoadg >= 32 && this.f71721nufgyqmvbu == null) {
            this.f71721nufgyqmvbu = new lqeggnwhkg(this.f71718eablkybsjg, this);
        }
        int iWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        esjtqupxsv.iobyxmoadg[] iobyxmoadgVarArrOkpsazkaxt = okpsazkaxt(iobyxmoadgVar, iArr, iArr2, eablkybsjgVar);
        iozdgvuglv(iobyxmoadgVar, eablkybsjgVar, iobyxmoadgVarArrOkpsazkaxt);
        yadqdtsiqt(iobyxmoadgVar, eablkybsjgVar, iobyxmoadgVarArrOkpsazkaxt);
        for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
            int iEablkybsjg = iobyxmoadgVar.eablkybsjg(i13);
            if (eablkybsjgVar.nufgyqmvbu(i13) || eablkybsjgVar.f115597yadqdtsiqt.contains(Integer.valueOf(iEablkybsjg))) {
                iobyxmoadgVarArrOkpsazkaxt[i13] = null;
            }
        }
        esjtqupxsv[] esjtqupxsvVarArrIobyxmoadg = this.f71719gxszxtbevo.iobyxmoadg(iobyxmoadgVarArrOkpsazkaxt, zoijcleaow(), zoijcleaowVar, cdpycssgdhVar);
        hcddaimhww[] hcddaimhwwVarArr = new hcddaimhww[iWkgbmnqykc];
        for (int i14 = 0; i14 < iWkgbmnqykc; i14++) {
            hcddaimhwwVarArr[i14] = (eablkybsjgVar.nufgyqmvbu(i14) || eablkybsjgVar.f115597yadqdtsiqt.contains(Integer.valueOf(iobyxmoadgVar.eablkybsjg(i14))) || (iobyxmoadgVar.eablkybsjg(i14) != -2 && esjtqupxsvVarArrIobyxmoadg[i14] == null)) ? null : hcddaimhww.f32664ppxfxbqfkf;
        }
        if (eablkybsjgVar.f71768dvvnrvtcbc) {
            crxdokpmqz(iobyxmoadgVar, iArr, hcddaimhwwVarArr, esjtqupxsvVarArrIobyxmoadg);
        }
        if (eablkybsjgVar.f115598yggfygwlhe.f115637iobyxmoadg != 0) {
            sopmlzcsov(eablkybsjgVar, iobyxmoadgVar, iArr, hcddaimhwwVarArr, esjtqupxsvVarArrIobyxmoadg);
        }
        return Pair.create(hcddaimhwwVarArr, esjtqupxsvVarArrIobyxmoadg);
    }

    @Override // o3.cdpycssgdh
    public void wflxmlrfwp(lmojexxdyd lmojexxdydVar) {
        if (lmojexxdydVar instanceof eablkybsjg) {
            yfnezrywwk((eablkybsjg) lmojexxdydVar);
        }
        yfnezrywwk(new eablkybsjg.iobyxmoadg().ydmasvzmpa(lmojexxdydVar).iozdgvuglv());
    }

    @Override // o3.cdpycssgdh
    public hszhottldk.iobyxmoadg wkgbmnqykc() {
        return this;
    }

    protected Pair xrmfcynszj(pmvmpeiblj.iobyxmoadg iobyxmoadgVar, int[][][] iArr, final eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar.f115598yggfygwlhe.f115637iobyxmoadg == 2) {
            return null;
        }
        return czzsidtyhn(4, iobyxmoadgVar, iArr, new dxjokdxxww.iobyxmoadg() { // from class: o3.eablkybsjg
            @Override // o3.agtfadlqog.dxjokdxxww.iobyxmoadg
            public final List iobyxmoadg(int i13, v2.yadqdtsiqt yadqdtsiqtVar, int[] iArr2) {
                return agtfadlqog.tzroggbefp(eablkybsjgVar, i13, yadqdtsiqtVar, iArr2);
            }
        }, new Comparator() { // from class: o3.gxszxtbevo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return agtfadlqog.ppxfxbqfkf.ppxfxbqfkf((List) obj, (List) obj2);
            }
        });
    }

    public agtfadlqog(Context context, esjtqupxsv.zoijcleaow zoijcleaowVar) {
        this(context, eablkybsjg.f71758hszhottldk, zoijcleaowVar);
    }

    public agtfadlqog(Context context, lmojexxdyd lmojexxdydVar, esjtqupxsv.zoijcleaow zoijcleaowVar) {
        this(lmojexxdydVar, zoijcleaowVar, context);
    }

    private agtfadlqog(lmojexxdyd lmojexxdydVar, esjtqupxsv.zoijcleaow zoijcleaowVar, Context context) {
        this.f71722wkgbmnqykc = new Object();
        this.f71718eablkybsjg = context != null ? context.getApplicationContext() : null;
        this.f71719gxszxtbevo = zoijcleaowVar;
        if (lmojexxdydVar instanceof eablkybsjg) {
            this.f71720lqeggnwhkg = (eablkybsjg) lmojexxdydVar;
        } else {
            this.f71720lqeggnwhkg = eablkybsjg.f71758hszhottldk.iobyxmoadg().ydmasvzmpa(lmojexxdydVar).iozdgvuglv();
        }
        this.f71717dxjokdxxww = v2.ppxfxbqfkf.f115660lqeggnwhkg;
        if (this.f71720lqeggnwhkg.f71766auzgnhcxok && context == null) {
            y2.kcexrzcfyt.nufgyqmvbu("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
