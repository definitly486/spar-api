package li;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C4007z9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import jh.cdpycssgdh;
import jh.crxdokpmqz;
import jh.istkbnxepw;
import jh.iyctptxqzt;
import jh.lereixgezr;
import jh.sopmlzcsov;
import jh.vipkmwdibw;
import jh.yfnezrywwk;
import mh.hcddaimhww;
import mh.pkzmftpjix;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import zi.jpowsppfya;
import zi.kegysxyocb;
import zi.lrnfpwlwnk;
import zi.ulzqkzuiru;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public class ojitshcjhn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final List f62604eablkybsjg = hg.jyumaefscl.m(ServiceLoader.load(btonecajqb.class, btonecajqb.class.getClassLoader()));

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final ojitshcjhn f62605gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final aj.eablkybsjg.iobyxmoadg f62606lqeggnwhkg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final aj.lqeggnwhkg f62607iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final aj.eablkybsjg.iobyxmoadg f62608ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tg.rgvfuqvkyq f62609wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final aj.gxszxtbevo f62610zoijcleaow;

    public static class dxjokdxxww {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final dxjokdxxww f62611ppxfxbqfkf = new dxjokdxxww(iobyxmoadg.OVERRIDABLE, "SUCCESS");

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final iobyxmoadg f62612iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f62613zoijcleaow;

        public enum iobyxmoadg {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public dxjokdxxww(iobyxmoadg iobyxmoadgVar, String str) {
            if (iobyxmoadgVar == null) {
                iobyxmoadg(3);
            }
            if (str == null) {
                iobyxmoadg(4);
            }
            this.f62612iobyxmoadg = iobyxmoadgVar;
            this.f62613zoijcleaow = str;
        }

        public static dxjokdxxww eablkybsjg() {
            dxjokdxxww dxjokdxxwwVar = f62611ppxfxbqfkf;
            if (dxjokdxxwwVar == null) {
                iobyxmoadg(0);
            }
            return dxjokdxxwwVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0031  */
        private static /* synthetic */ void iobyxmoadg(int i13) {
            String str = (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? 3 : 2];
            if (i13 == 1 || i13 == 2) {
                objArr[0] = "debugMessage";
            } else if (i13 == 3) {
                objArr[0] = "success";
            } else if (i13 != 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            } else {
                objArr[0] = "debugMessage";
            }
            switch (i13) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i13 == 1) {
                objArr[2] = "incompatible";
            } else if (i13 == 2) {
                objArr[2] = "conflict";
            } else if (i13 == 3 || i13 == 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
                throw new IllegalStateException(str2);
            }
            throw new IllegalArgumentException(str2);
        }

        public static dxjokdxxww wkgbmnqykc(String str) {
            if (str == null) {
                iobyxmoadg(1);
            }
            return new dxjokdxxww(iobyxmoadg.INCOMPATIBLE, str);
        }

        public static dxjokdxxww zoijcleaow(String str) {
            if (str == null) {
                iobyxmoadg(2);
            }
            return new dxjokdxxww(iobyxmoadg.CONFLICT, str);
        }

        public iobyxmoadg ppxfxbqfkf() {
            iobyxmoadg iobyxmoadgVar = this.f62612iobyxmoadg;
            if (iobyxmoadgVar == null) {
                iobyxmoadg(5);
            }
            return iobyxmoadgVar;
        }

        public String toString() {
            return this.f62612iobyxmoadg + ": " + this.f62613zoijcleaow;
        }
    }

    static class eablkybsjg implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jh.eablkybsjg f62618zdlpuopuiu;

        eablkybsjg(jh.eablkybsjg eablkybsjgVar) {
            this.f62618zdlpuopuiu = eablkybsjgVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(jh.zoijcleaow zoijcleaowVar) {
            boolean z13 = false;
            if (!jh.zdlpuopuiu.lqeggnwhkg(zoijcleaowVar.getVisibility()) && jh.zdlpuopuiu.nufgyqmvbu(zoijcleaowVar, this.f62618zdlpuopuiu, false)) {
                z13 = true;
            }
            return Boolean.valueOf(z13);
        }
    }

    static class gxszxtbevo implements tg.draadjrbmk {
        gxszxtbevo() {
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public jh.iobyxmoadg invoke(jh.zoijcleaow zoijcleaowVar) {
            return zoijcleaowVar;
        }
    }

    static class iobyxmoadg implements aj.eablkybsjg.iobyxmoadg {
        iobyxmoadg() {
        }

        private static /* synthetic */ void zoijcleaow(int i13) {
            Object[] objArr = new Object[3];
            if (i13 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // aj.eablkybsjg.iobyxmoadg
        public boolean iobyxmoadg(zeieaojujs zeieaojujsVar, zeieaojujs zeieaojujsVar2) {
            if (zeieaojujsVar == null) {
                zoijcleaow(0);
            }
            if (zeieaojujsVar2 == null) {
                zoijcleaow(1);
            }
            return zeieaojujsVar.equals(zeieaojujsVar2);
        }
    }

    static class lqeggnwhkg implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ jh.zoijcleaow f62619yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ agtfadlqog f62620zdlpuopuiu;

        lqeggnwhkg(agtfadlqog agtfadlqogVar, jh.zoijcleaow zoijcleaowVar) {
            this.f62620zdlpuopuiu = agtfadlqogVar;
            this.f62619yggfygwlhe = zoijcleaowVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn invoke(jh.zoijcleaow zoijcleaowVar) {
            this.f62620zdlpuopuiu.zoijcleaow(this.f62619yggfygwlhe, zoijcleaowVar);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static /* synthetic */ class nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f62621iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        static final /* synthetic */ int[] f62622ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f62623zoijcleaow;

        static {
            int[] iArr = new int[cdpycssgdh.values().length];
            f62622ppxfxbqfkf = iArr;
            try {
                iArr[cdpycssgdh.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62622ppxfxbqfkf[cdpycssgdh.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62622ppxfxbqfkf[cdpycssgdh.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62622ppxfxbqfkf[cdpycssgdh.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[dxjokdxxww.iobyxmoadg.values().length];
            f62623zoijcleaow = iArr2;
            try {
                iArr2[dxjokdxxww.iobyxmoadg.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62623zoijcleaow[dxjokdxxww.iobyxmoadg.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62623zoijcleaow[dxjokdxxww.iobyxmoadg.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[btonecajqb.zoijcleaow.values().length];
            f62621iobyxmoadg = iArr3;
            try {
                iArr3[btonecajqb.zoijcleaow.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f62621iobyxmoadg[btonecajqb.zoijcleaow.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f62621iobyxmoadg[btonecajqb.zoijcleaow.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static class ppxfxbqfkf implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jh.wflxmlrfwp f62624zdlpuopuiu;

        ppxfxbqfkf(jh.wflxmlrfwp wflxmlrfwpVar) {
            this.f62624zdlpuopuiu = wflxmlrfwpVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(jh.zoijcleaow zoijcleaowVar) {
            return Boolean.valueOf(zoijcleaowVar.zoijcleaow() == this.f62624zdlpuopuiu);
        }
    }

    static class wkgbmnqykc implements tg.draadjrbmk {
        wkgbmnqykc() {
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public jh.zoijcleaow invoke(jh.zoijcleaow zoijcleaowVar) {
            return zoijcleaowVar;
        }
    }

    static class zoijcleaow implements tg.rgvfuqvkyq {
        zoijcleaow() {
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public gg.vdvldrhtss invoke(jh.iobyxmoadg iobyxmoadgVar, jh.iobyxmoadg iobyxmoadgVar2) {
            return new gg.vdvldrhtss(iobyxmoadgVar, iobyxmoadgVar2);
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        f62606lqeggnwhkg = iobyxmoadgVar;
        f62605gxszxtbevo = new ojitshcjhn(iobyxmoadgVar, aj.lqeggnwhkg.iobyxmoadg.f2067iobyxmoadg, aj.gxszxtbevo.iobyxmoadg.f2058iobyxmoadg, null);
    }

    private ojitshcjhn(aj.eablkybsjg.iobyxmoadg iobyxmoadgVar, aj.lqeggnwhkg lqeggnwhkgVar, aj.gxszxtbevo gxszxtbevoVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        if (iobyxmoadgVar == null) {
            iobyxmoadg(5);
        }
        if (lqeggnwhkgVar == null) {
            iobyxmoadg(6);
        }
        if (gxszxtbevoVar == null) {
            iobyxmoadg(7);
        }
        this.f62608ppxfxbqfkf = iobyxmoadgVar;
        this.f62607iobyxmoadg = lqeggnwhkgVar;
        this.f62610zoijcleaow = gxszxtbevoVar;
        this.f62609wkgbmnqykc = rgvfuqvkyqVar;
    }

    private static cdpycssgdh agtfadlqog(Collection collection, jh.eablkybsjg eablkybsjgVar) {
        if (collection == null) {
            iobyxmoadg(86);
        }
        if (eablkybsjgVar == null) {
            iobyxmoadg(87);
        }
        Iterator it = collection.iterator();
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (it.hasNext()) {
            jh.zoijcleaow zoijcleaowVar = (jh.zoijcleaow) it.next();
            int i13 = nufgyqmvbu.f62622ppxfxbqfkf[zoijcleaowVar.vdvldrhtss().ordinal()];
            if (i13 == 1) {
                cdpycssgdh cdpycssgdhVar = cdpycssgdh.FINAL;
                if (cdpycssgdhVar == null) {
                    iobyxmoadg(88);
                }
                return cdpycssgdhVar;
            }
            if (i13 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + zoijcleaowVar);
            }
            if (i13 == 3) {
                z14 = true;
            } else if (i13 == 4) {
                z15 = true;
            }
        }
        if (eablkybsjgVar.czzsidtyhn() && eablkybsjgVar.vdvldrhtss() != cdpycssgdh.ABSTRACT && eablkybsjgVar.vdvldrhtss() != cdpycssgdh.SEALED) {
            z13 = true;
        }
        if (z14 && !z15) {
            cdpycssgdh cdpycssgdhVar2 = cdpycssgdh.OPEN;
            if (cdpycssgdhVar2 == null) {
                iobyxmoadg(89);
            }
            return cdpycssgdhVar2;
        }
        if (!z14 && z15) {
            cdpycssgdh cdpycssgdhVarVdvldrhtss = z13 ? eablkybsjgVar.vdvldrhtss() : cdpycssgdh.ABSTRACT;
            if (cdpycssgdhVarVdvldrhtss == null) {
                iobyxmoadg(90);
            }
            return cdpycssgdhVarVdvldrhtss;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            hashSet.addAll(lereixgezr((jh.zoijcleaow) it2.next()));
        }
        return esjtqupxsv(oxmwwwfdhm(hashSet), z13, eablkybsjgVar.vdvldrhtss());
    }

    private static void btonecajqb(Collection collection, jh.eablkybsjg eablkybsjgVar, agtfadlqog agtfadlqogVar) {
        if (collection == null) {
            iobyxmoadg(83);
        }
        if (eablkybsjgVar == null) {
            iobyxmoadg(84);
        }
        if (agtfadlqogVar == null) {
            iobyxmoadg(85);
        }
        Collection collectionZdlpuopuiu = zdlpuopuiu(eablkybsjgVar, collection);
        boolean zIsEmpty = collectionZdlpuopuiu.isEmpty();
        if (!zIsEmpty) {
            collection = collectionZdlpuopuiu;
        }
        jh.zoijcleaow zoijcleaowVarCrxdokpmqz = ((jh.zoijcleaow) jpowsppfya(collection, new wkgbmnqykc())).crxdokpmqz(eablkybsjgVar, agtfadlqog(collection, eablkybsjgVar), zIsEmpty ? jh.zdlpuopuiu.f51359nufgyqmvbu : jh.zdlpuopuiu.f51358lqeggnwhkg, jh.zoijcleaow.iobyxmoadg.FAKE_OVERRIDE, false);
        agtfadlqogVar.wkgbmnqykc(zoijcleaowVarCrxdokpmqz, collection);
        agtfadlqogVar.iobyxmoadg(zoijcleaowVarCrxdokpmqz);
    }

    public static dxjokdxxww.iobyxmoadg cqumvgiudr(jh.iobyxmoadg iobyxmoadgVar, jh.iobyxmoadg iobyxmoadgVar2) {
        ojitshcjhn ojitshcjhnVar = f62605gxszxtbevo;
        dxjokdxxww.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ojitshcjhnVar.cdpycssgdh(iobyxmoadgVar2, iobyxmoadgVar, null).ppxfxbqfkf();
        dxjokdxxww.iobyxmoadg iobyxmoadgVarPpxfxbqfkf2 = ojitshcjhnVar.cdpycssgdh(iobyxmoadgVar, iobyxmoadgVar2, null).ppxfxbqfkf();
        dxjokdxxww.iobyxmoadg iobyxmoadgVar3 = dxjokdxxww.iobyxmoadg.OVERRIDABLE;
        if (iobyxmoadgVarPpxfxbqfkf == iobyxmoadgVar3 && iobyxmoadgVarPpxfxbqfkf2 == iobyxmoadgVar3) {
            return iobyxmoadgVar3;
        }
        dxjokdxxww.iobyxmoadg iobyxmoadgVar4 = dxjokdxxww.iobyxmoadg.CONFLICT;
        return (iobyxmoadgVarPpxfxbqfkf == iobyxmoadgVar4 || iobyxmoadgVarPpxfxbqfkf2 == iobyxmoadgVar4) ? iobyxmoadgVar4 : dxjokdxxww.iobyxmoadg.INCOMPATIBLE;
    }

    private lrnfpwlwnk draadjrbmk(List list, List list2) {
        if (list == null) {
            iobyxmoadg(40);
        }
        if (list2 == null) {
            iobyxmoadg(41);
        }
        if (list.isEmpty()) {
            lrnfpwlwnk lrnfpwlwnkVarIpoelvxyzq = new rgvfuqvkyq(null, this.f62608ppxfxbqfkf, this.f62607iobyxmoadg, this.f62610zoijcleaow, this.f62609wkgbmnqykc).ipoelvxyzq(true, true);
            if (lrnfpwlwnkVarIpoelvxyzq == null) {
                iobyxmoadg(42);
            }
            return lrnfpwlwnkVarIpoelvxyzq;
        }
        HashMap map = new HashMap();
        for (int i13 = 0; i13 < list.size(); i13++) {
            map.put(((yfnezrywwk) list.get(i13)).btonecajqb(), ((yfnezrywwk) list2.get(i13)).btonecajqb());
        }
        lrnfpwlwnk lrnfpwlwnkVarIpoelvxyzq2 = new rgvfuqvkyq(map, this.f62608ppxfxbqfkf, this.f62607iobyxmoadg, this.f62610zoijcleaow, this.f62609wkgbmnqykc).ipoelvxyzq(true, true);
        if (lrnfpwlwnkVarIpoelvxyzq2 == null) {
            iobyxmoadg(43);
        }
        return lrnfpwlwnkVarIpoelvxyzq2;
    }

    public static ojitshcjhn dxjokdxxww(aj.lqeggnwhkg lqeggnwhkgVar, aj.eablkybsjg.iobyxmoadg iobyxmoadgVar) {
        if (lqeggnwhkgVar == null) {
            iobyxmoadg(3);
        }
        if (iobyxmoadgVar == null) {
            iobyxmoadg(4);
        }
        return new ojitshcjhn(iobyxmoadgVar, lqeggnwhkgVar, aj.gxszxtbevo.iobyxmoadg.f2058iobyxmoadg, null);
    }

    private static dxjokdxxww eablkybsjg(jh.iobyxmoadg iobyxmoadgVar, jh.iobyxmoadg iobyxmoadgVar2) {
        if ((iobyxmoadgVar.hkdspvbjdz() == null) != (iobyxmoadgVar2.hkdspvbjdz() == null)) {
            return dxjokdxxww.wkgbmnqykc("Receiver presence mismatch");
        }
        if (iobyxmoadgVar.dxjokdxxww().size() != iobyxmoadgVar2.dxjokdxxww().size()) {
            return dxjokdxxww.wkgbmnqykc("Value parameter number mismatch");
        }
        return null;
    }

    private static cdpycssgdh esjtqupxsv(Collection collection, boolean z13, cdpycssgdh cdpycssgdhVar) {
        if (collection == null) {
            iobyxmoadg(91);
        }
        if (cdpycssgdhVar == null) {
            iobyxmoadg(92);
        }
        cdpycssgdh cdpycssgdhVar2 = cdpycssgdh.ABSTRACT;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            jh.zoijcleaow zoijcleaowVar = (jh.zoijcleaow) it.next();
            cdpycssgdh cdpycssgdhVarVdvldrhtss = (z13 && zoijcleaowVar.vdvldrhtss() == cdpycssgdh.ABSTRACT) ? cdpycssgdhVar : zoijcleaowVar.vdvldrhtss();
            if (cdpycssgdhVarVdvldrhtss.compareTo(cdpycssgdhVar2) < 0) {
                cdpycssgdhVar2 = cdpycssgdhVarVdvldrhtss;
            }
        }
        if (cdpycssgdhVar2 == null) {
            iobyxmoadg(93);
        }
        return cdpycssgdhVar2;
    }

    private static void gtknphoqwx(jh.eablkybsjg eablkybsjgVar, Collection collection, agtfadlqog agtfadlqogVar) {
        if (eablkybsjgVar == null) {
            iobyxmoadg(62);
        }
        if (collection == null) {
            iobyxmoadg(63);
        }
        if (agtfadlqogVar == null) {
            iobyxmoadg(64);
        }
        if (zoijcleaow(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                btonecajqb(Collections.singleton((jh.zoijcleaow) it.next()), eablkybsjgVar, agtfadlqogVar);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                btonecajqb(vdvldrhtss(iwizpuwonk.iobyxmoadg(linkedList), linkedList, agtfadlqogVar), eablkybsjgVar, agtfadlqogVar);
            }
        }
    }

    private static void gxszxtbevo(jh.zoijcleaow zoijcleaowVar, Set set) {
        if (zoijcleaowVar == null) {
            iobyxmoadg(17);
        }
        if (set == null) {
            iobyxmoadg(18);
        }
        if (zoijcleaowVar.getKind().iobyxmoadg()) {
            set.add(zoijcleaowVar);
            return;
        }
        if (zoijcleaowVar.eablkybsjg().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + zoijcleaowVar);
        }
        Iterator it = zoijcleaowVar.eablkybsjg().iterator();
        while (it.hasNext()) {
            gxszxtbevo((jh.zoijcleaow) it.next(), set);
        }
    }

    public static void hcddaimhww(jh.zoijcleaow zoijcleaowVar, tg.draadjrbmk draadjrbmkVar) {
        jh.yggfygwlhe yggfygwlheVar;
        if (zoijcleaowVar == null) {
            iobyxmoadg(105);
        }
        for (jh.zoijcleaow zoijcleaowVar2 : zoijcleaowVar.eablkybsjg()) {
            if (zoijcleaowVar2.getVisibility() == jh.zdlpuopuiu.f51358lqeggnwhkg) {
                hcddaimhww(zoijcleaowVar2, draadjrbmkVar);
            }
        }
        if (zoijcleaowVar.getVisibility() != jh.zdlpuopuiu.f51358lqeggnwhkg) {
            return;
        }
        jh.yggfygwlhe yggfygwlheVarNufgyqmvbu = nufgyqmvbu(zoijcleaowVar);
        if (yggfygwlheVarNufgyqmvbu == null) {
            if (draadjrbmkVar != null) {
                draadjrbmkVar.invoke(zoijcleaowVar);
            }
            yggfygwlheVar = jh.zdlpuopuiu.f51354eablkybsjg;
        } else {
            yggfygwlheVar = yggfygwlheVarNufgyqmvbu;
        }
        if (zoijcleaowVar instanceof hcddaimhww) {
            ((hcddaimhww) zoijcleaowVar).f(yggfygwlheVar);
            Iterator it = ((crxdokpmqz) zoijcleaowVar).jyumaefscl().iterator();
            while (it.hasNext()) {
                hcddaimhww((sopmlzcsov) it.next(), yggfygwlheVarNufgyqmvbu == null ? null : draadjrbmkVar);
            }
            return;
        }
        if (zoijcleaowVar instanceof mh.kcexrzcfyt) {
            ((mh.kcexrzcfyt) zoijcleaowVar).m(yggfygwlheVar);
            return;
        }
        pkzmftpjix pkzmftpjixVar = (pkzmftpjix) zoijcleaowVar;
        pkzmftpjixVar.grlcpdaxtj(yggfygwlheVar);
        if (yggfygwlheVar != pkzmftpjixVar.mbcevpiqjq().getVisibility()) {
            pkzmftpjixVar.fyldjkxazc(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str;
        int i14;
        if (i13 != 11 && i13 != 12 && i13 != 16 && i13 != 21 && i13 != 93 && i13 != 96 && i13 != 101 && i13 != 42 && i13 != 43) {
            switch (i13) {
                default:
                    switch (i13) {
                        default:
                            switch (i13) {
                                default:
                                    switch (i13) {
                                        case 88:
                                        case 89:
                                        case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        case 32:
                        case 33:
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        case C4007z9.J /* 35 */:
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case C4007z9.F /* 25 */:
                case C4007z9.G /* 26 */:
                case 27:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i13 != 11 && i13 != 12 && i13 != 16 && i13 != 21 && i13 != 93 && i13 != 96 && i13 != 101 && i13 != 42 && i13 != 43) {
            switch (i13) {
                case 24:
                case C4007z9.F /* 25 */:
                case C4007z9.G /* 26 */:
                case 27:
                    i14 = 2;
                    break;
                default:
                    switch (i13) {
                        case 30:
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        case 32:
                        case 33:
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        case C4007z9.J /* 35 */:
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            i14 = 2;
                            break;
                        default:
                            switch (i13) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    i14 = 2;
                                    break;
                                default:
                                    switch (i13) {
                                        case 88:
                                        case 89:
                                        case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                                            i14 = 2;
                                            break;
                                        default:
                                            i14 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i14 = 2;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.G /* 26 */:
            case 27:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case C4007z9.J /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 28:
            case C4007z9.K /* 38 */:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case C4007z9.I /* 29 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                objArr[0] = "secondParameters";
                break;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                objArr[0] = "typeInSuper";
                break;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i13 == 11 || i13 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i13 == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i13 == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i13 == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i13 == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i13 == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i13 != 42 && i13 != 43) {
            switch (i13) {
                case 24:
                case C4007z9.F /* 25 */:
                case C4007z9.G /* 26 */:
                case 27:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i13) {
                        case 30:
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        case 32:
                        case 33:
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        case C4007z9.J /* 35 */:
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i13) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i13) {
                                        case 88:
                                        case 89:
                                        case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i13) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case C4007z9.F /* 25 */:
            case C4007z9.G /* 26 */:
            case 27:
            case 30:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case C4007z9.J /* 35 */:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
            case 93:
            case 96:
            case 101:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case C4007z9.I /* 29 */:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case C4007z9.K /* 38 */:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                objArr[2] = "createTypeCheckerState";
                break;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 11 && i13 != 12 && i13 != 16 && i13 != 21 && i13 != 93 && i13 != 96 && i13 != 101 && i13 != 42 && i13 != 43) {
            switch (i13) {
                case 24:
                case C4007z9.F /* 25 */:
                case C4007z9.G /* 26 */:
                case 27:
                    break;
                default:
                    switch (i13) {
                        case 30:
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        case 32:
                        case 33:
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        case C4007z9.J /* 35 */:
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            break;
                        default:
                            switch (i13) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i13) {
                                        case 88:
                                        case 89:
                                        case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    private static boolean istkbnxepw(jh.iobyxmoadg iobyxmoadgVar, Collection collection) {
        if (iobyxmoadgVar == null) {
            iobyxmoadg(69);
        }
        if (collection == null) {
            iobyxmoadg(70);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!zynmafqrjb(iobyxmoadgVar, (jh.iobyxmoadg) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static dxjokdxxww iwizpuwonk(jh.iobyxmoadg iobyxmoadgVar, jh.iobyxmoadg iobyxmoadgVar2) {
        boolean z13;
        if (iobyxmoadgVar == null) {
            iobyxmoadg(38);
        }
        if (iobyxmoadgVar2 == null) {
            iobyxmoadg(39);
        }
        boolean z14 = iobyxmoadgVar instanceof lereixgezr;
        if ((z14 && !(iobyxmoadgVar2 instanceof lereixgezr)) || (((z13 = iobyxmoadgVar instanceof crxdokpmqz)) && !(iobyxmoadgVar2 instanceof crxdokpmqz))) {
            return dxjokdxxww.wkgbmnqykc("Member kind mismatch");
        }
        if (!z14 && !z13) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + iobyxmoadgVar);
        }
        if (!iobyxmoadgVar.getName().equals(iobyxmoadgVar2.getName())) {
            return dxjokdxxww.wkgbmnqykc("Name mismatch");
        }
        dxjokdxxww dxjokdxxwwVarEablkybsjg = eablkybsjg(iobyxmoadgVar, iobyxmoadgVar2);
        if (dxjokdxxwwVarEablkybsjg != null) {
            return dxjokdxxwwVarEablkybsjg;
        }
        return null;
    }

    public static Object jpowsppfya(Collection collection, tg.draadjrbmk draadjrbmkVar) {
        Object next;
        if (collection == null) {
            iobyxmoadg(76);
        }
        if (draadjrbmkVar == null) {
            iobyxmoadg(77);
        }
        if (collection.size() == 1) {
            Object objBfopjjpdmp = hg.jyumaefscl.bfopjjpdmp(collection);
            if (objBfopjjpdmp == null) {
                iobyxmoadg(78);
            }
            return objBfopjjpdmp;
        }
        ArrayList arrayList = new ArrayList(2);
        List listWizcaqwiak = hg.jyumaefscl.wizcaqwiak(collection, draadjrbmkVar);
        Object objBfopjjpdmp2 = hg.jyumaefscl.bfopjjpdmp(collection);
        jh.iobyxmoadg iobyxmoadgVar = (jh.iobyxmoadg) draadjrbmkVar.invoke(objBfopjjpdmp2);
        for (Object obj : collection) {
            jh.iobyxmoadg iobyxmoadgVar2 = (jh.iobyxmoadg) draadjrbmkVar.invoke(obj);
            if (istkbnxepw(iobyxmoadgVar2, listWizcaqwiak)) {
                arrayList.add(obj);
            }
            if (zynmafqrjb(iobyxmoadgVar2, iobyxmoadgVar) && !zynmafqrjb(iobyxmoadgVar, iobyxmoadgVar2)) {
                objBfopjjpdmp2 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objBfopjjpdmp2 == null) {
                iobyxmoadg(79);
            }
            return objBfopjjpdmp2;
        }
        if (arrayList.size() == 1) {
            Object objBfopjjpdmp3 = hg.jyumaefscl.bfopjjpdmp(arrayList);
            if (objBfopjjpdmp3 == null) {
                iobyxmoadg(80);
            }
            return objBfopjjpdmp3;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (jpowsppfya.zoijcleaow(((jh.iobyxmoadg) draadjrbmkVar.invoke(next)).getReturnType()));
        if (next != null) {
            return next;
        }
        Object objBfopjjpdmp4 = hg.jyumaefscl.bfopjjpdmp(arrayList);
        if (objBfopjjpdmp4 == null) {
            iobyxmoadg(82);
        }
        return objBfopjjpdmp4;
    }

    public static Set kcexrzcfyt(Set set, boolean z13, tg.iobyxmoadg iobyxmoadgVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        if (set == null) {
            iobyxmoadg(9);
        }
        if (rgvfuqvkyqVar == null) {
            iobyxmoadg(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) rgvfuqvkyqVar.invoke(obj, it.next());
                jh.iobyxmoadg iobyxmoadgVar2 = (jh.iobyxmoadg) vdvldrhtssVar.iobyxmoadg();
                jh.iobyxmoadg iobyxmoadgVar3 = (jh.iobyxmoadg) vdvldrhtssVar.wkgbmnqykc();
                if (!pkzmftpjix(iobyxmoadgVar2, iobyxmoadgVar3, z13, true)) {
                    if (pkzmftpjix(iobyxmoadgVar3, iobyxmoadgVar2, z13, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static Set lereixgezr(jh.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar == null) {
            iobyxmoadg(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        gxszxtbevo(zoijcleaowVar, linkedHashSet);
        return linkedHashSet;
    }

    private static boolean lmojexxdyd(jh.iobyxmoadg iobyxmoadgVar, kegysxyocb kegysxyocbVar, jh.iobyxmoadg iobyxmoadgVar2, kegysxyocb kegysxyocbVar2, lrnfpwlwnk lrnfpwlwnkVar) {
        if (iobyxmoadgVar == null) {
            iobyxmoadg(71);
        }
        if (kegysxyocbVar == null) {
            iobyxmoadg(72);
        }
        if (iobyxmoadgVar2 == null) {
            iobyxmoadg(73);
        }
        if (kegysxyocbVar2 == null) {
            iobyxmoadg(74);
        }
        if (lrnfpwlwnkVar == null) {
            iobyxmoadg(75);
        }
        return zi.lqeggnwhkg.f130055iobyxmoadg.zdlpuopuiu(lrnfpwlwnkVar, kegysxyocbVar.jrbgnlbqoe(), kegysxyocbVar2.jrbgnlbqoe());
    }

    private static List lqeggnwhkg(jh.iobyxmoadg iobyxmoadgVar) {
        vipkmwdibw vipkmwdibwVarHkdspvbjdz = iobyxmoadgVar.hkdspvbjdz();
        ArrayList arrayList = new ArrayList();
        if (vipkmwdibwVarHkdspvbjdz != null) {
            arrayList.add(vipkmwdibwVarHkdspvbjdz.getType());
        }
        Iterator it = iobyxmoadgVar.dxjokdxxww().iterator();
        while (it.hasNext()) {
            arrayList.add(((iyctptxqzt) it.next()).getType());
        }
        return arrayList;
    }

    private static jh.yggfygwlhe nufgyqmvbu(jh.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar == null) {
            iobyxmoadg(106);
        }
        Collection<jh.zoijcleaow> collectionEablkybsjg = zoijcleaowVar.eablkybsjg();
        jh.yggfygwlhe yggfygwlheVarYggfygwlhe = yggfygwlhe(collectionEablkybsjg);
        if (yggfygwlheVarYggfygwlhe == null) {
            return null;
        }
        if (zoijcleaowVar.getKind() != jh.zoijcleaow.iobyxmoadg.FAKE_OVERRIDE) {
            return yggfygwlheVarYggfygwlhe.gxszxtbevo();
        }
        for (jh.zoijcleaow zoijcleaowVar2 : collectionEablkybsjg) {
            if (zoijcleaowVar2.vdvldrhtss() != cdpycssgdh.ABSTRACT && !zoijcleaowVar2.getVisibility().equals(yggfygwlheVarYggfygwlhe)) {
                return null;
            }
        }
        return yggfygwlheVarYggfygwlhe;
    }

    private Collection ojitshcjhn(jh.zoijcleaow zoijcleaowVar, Collection collection, jh.eablkybsjg eablkybsjgVar, agtfadlqog agtfadlqogVar) {
        if (zoijcleaowVar == null) {
            iobyxmoadg(57);
        }
        if (collection == null) {
            iobyxmoadg(58);
        }
        if (eablkybsjgVar == null) {
            iobyxmoadg(59);
        }
        if (agtfadlqogVar == null) {
            iobyxmoadg(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        jj.draadjrbmk draadjrbmkVarWkgbmnqykc = jj.draadjrbmk.wkgbmnqykc();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            jh.zoijcleaow zoijcleaowVar2 = (jh.zoijcleaow) it.next();
            dxjokdxxww.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = cdpycssgdh(zoijcleaowVar2, zoijcleaowVar, eablkybsjgVar).ppxfxbqfkf();
            boolean zYlkuphrtab = ylkuphrtab(zoijcleaowVar, zoijcleaowVar2, false);
            int i13 = nufgyqmvbu.f62623zoijcleaow[iobyxmoadgVarPpxfxbqfkf.ordinal()];
            if (i13 == 1) {
                if (zYlkuphrtab) {
                    draadjrbmkVarWkgbmnqykc.add(zoijcleaowVar2);
                }
                arrayList.add(zoijcleaowVar2);
            } else if (i13 == 2) {
                if (zYlkuphrtab) {
                    agtfadlqogVar.ppxfxbqfkf(zoijcleaowVar2, zoijcleaowVar);
                }
                arrayList.add(zoijcleaowVar2);
            }
        }
        agtfadlqogVar.wkgbmnqykc(zoijcleaowVar, draadjrbmkVarWkgbmnqykc);
        return arrayList;
    }

    public static Set oxmwwwfdhm(Set set) {
        if (set == null) {
            iobyxmoadg(8);
        }
        return kcexrzcfyt(set, !set.isEmpty() && pi.eablkybsjg.esjtqupxsv(pi.eablkybsjg.kcexrzcfyt((jh.wflxmlrfwp) set.iterator().next())), null, new zoijcleaow());
    }

    public static boolean pkzmftpjix(jh.iobyxmoadg iobyxmoadgVar, jh.iobyxmoadg iobyxmoadgVar2, boolean z13, boolean z14) {
        if (iobyxmoadgVar == null) {
            iobyxmoadg(13);
        }
        if (iobyxmoadgVar2 == null) {
            iobyxmoadg(14);
        }
        if (!iobyxmoadgVar.equals(iobyxmoadgVar2) && li.lqeggnwhkg.f62603iobyxmoadg.gtknphoqwx(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar2.iobyxmoadg(), z13, z14)) {
            return true;
        }
        jh.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
        Iterator it = li.dxjokdxxww.wkgbmnqykc(iobyxmoadgVar).iterator();
        while (it.hasNext()) {
            if (li.lqeggnwhkg.f62603iobyxmoadg.gtknphoqwx(iobyxmoadgVarIobyxmoadg, (jh.iobyxmoadg) it.next(), z13, z14)) {
                return true;
            }
        }
        return false;
    }

    private static boolean pmvmpeiblj(sopmlzcsov sopmlzcsovVar, sopmlzcsov sopmlzcsovVar2) {
        if (sopmlzcsovVar == null || sopmlzcsovVar2 == null) {
            return true;
        }
        return wwaezpbzkn(sopmlzcsovVar, sopmlzcsovVar2);
    }

    private static boolean ppxfxbqfkf(yfnezrywwk yfnezrywwkVar, yfnezrywwk yfnezrywwkVar2, lrnfpwlwnk lrnfpwlwnkVar) {
        if (yfnezrywwkVar == null) {
            iobyxmoadg(47);
        }
        if (yfnezrywwkVar2 == null) {
            iobyxmoadg(48);
        }
        if (lrnfpwlwnkVar == null) {
            iobyxmoadg(49);
        }
        List<kegysxyocb> upperBounds = yfnezrywwkVar.getUpperBounds();
        ArrayList arrayList = new ArrayList(yfnezrywwkVar2.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (kegysxyocb kegysxyocbVar : upperBounds) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (wkgbmnqykc(kegysxyocbVar, (kegysxyocb) listIterator.next(), lrnfpwlwnkVar)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    public static Collection rgvfuqvkyq(Object obj, Collection collection, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
        if (obj == null) {
            iobyxmoadg(97);
        }
        if (collection == null) {
            iobyxmoadg(98);
        }
        if (draadjrbmkVar == null) {
            iobyxmoadg(99);
        }
        if (draadjrbmkVar2 == null) {
            iobyxmoadg(100);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        jh.iobyxmoadg iobyxmoadgVar = (jh.iobyxmoadg) draadjrbmkVar.invoke(obj);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            jh.iobyxmoadg iobyxmoadgVar2 = (jh.iobyxmoadg) draadjrbmkVar.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                dxjokdxxww.iobyxmoadg iobyxmoadgVarCqumvgiudr = cqumvgiudr(iobyxmoadgVar, iobyxmoadgVar2);
                if (iobyxmoadgVarCqumvgiudr == dxjokdxxww.iobyxmoadg.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (iobyxmoadgVarCqumvgiudr == dxjokdxxww.iobyxmoadg.CONFLICT) {
                    draadjrbmkVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    private static Collection vdvldrhtss(jh.zoijcleaow zoijcleaowVar, Queue queue, agtfadlqog agtfadlqogVar) {
        if (zoijcleaowVar == null) {
            iobyxmoadg(102);
        }
        if (queue == null) {
            iobyxmoadg(103);
        }
        if (agtfadlqogVar == null) {
            iobyxmoadg(104);
        }
        return rgvfuqvkyq(zoijcleaowVar, queue, new gxszxtbevo(), new lqeggnwhkg(agtfadlqogVar, zoijcleaowVar));
    }

    public static ojitshcjhn wflxmlrfwp(aj.lqeggnwhkg lqeggnwhkgVar) {
        if (lqeggnwhkgVar == null) {
            iobyxmoadg(0);
        }
        return new ojitshcjhn(f62606lqeggnwhkg, lqeggnwhkgVar, aj.gxszxtbevo.iobyxmoadg.f2058iobyxmoadg, null);
    }

    private static boolean wkgbmnqykc(kegysxyocb kegysxyocbVar, kegysxyocb kegysxyocbVar2, lrnfpwlwnk lrnfpwlwnkVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(44);
        }
        if (kegysxyocbVar2 == null) {
            iobyxmoadg(45);
        }
        if (lrnfpwlwnkVar == null) {
            iobyxmoadg(46);
        }
        if (ulzqkzuiru.iobyxmoadg(kegysxyocbVar) && ulzqkzuiru.iobyxmoadg(kegysxyocbVar2)) {
            return true;
        }
        return zi.lqeggnwhkg.f130055iobyxmoadg.wflxmlrfwp(lrnfpwlwnkVar, kegysxyocbVar.jrbgnlbqoe(), kegysxyocbVar2.jrbgnlbqoe());
    }

    private static boolean wwaezpbzkn(jh.vdvldrhtss vdvldrhtssVar, jh.vdvldrhtss vdvldrhtssVar2) {
        if (vdvldrhtssVar == null) {
            iobyxmoadg(67);
        }
        if (vdvldrhtssVar2 == null) {
            iobyxmoadg(68);
        }
        Integer numWkgbmnqykc = jh.zdlpuopuiu.wkgbmnqykc(vdvldrhtssVar.getVisibility(), vdvldrhtssVar2.getVisibility());
        return numWkgbmnqykc == null || numWkgbmnqykc.intValue() >= 0;
    }

    public static jh.yggfygwlhe yggfygwlhe(Collection collection) {
        jh.yggfygwlhe yggfygwlheVar;
        if (collection == null) {
            iobyxmoadg(107);
        }
        if (collection.isEmpty()) {
            return jh.zdlpuopuiu.f51352draadjrbmk;
        }
        Iterator it = collection.iterator();
        loop0: while (true) {
            yggfygwlheVar = null;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                jh.yggfygwlhe visibility = ((jh.zoijcleaow) it.next()).getVisibility();
                if (yggfygwlheVar != null) {
                    Integer numWkgbmnqykc = jh.zdlpuopuiu.wkgbmnqykc(visibility, yggfygwlheVar);
                    if (numWkgbmnqykc == null) {
                        break;
                    }
                    if (numWkgbmnqykc.intValue() > 0) {
                    }
                }
                yggfygwlheVar = visibility;
            }
        }
        if (yggfygwlheVar == null) {
            return null;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numWkgbmnqykc2 = jh.zdlpuopuiu.wkgbmnqykc(yggfygwlheVar, ((jh.zoijcleaow) it2.next()).getVisibility());
            if (numWkgbmnqykc2 == null || numWkgbmnqykc2.intValue() < 0) {
                return null;
            }
        }
        return yggfygwlheVar;
    }

    public static boolean ylkuphrtab(istkbnxepw istkbnxepwVar, istkbnxepw istkbnxepwVar2, boolean z13) {
        if (istkbnxepwVar == null) {
            iobyxmoadg(55);
        }
        if (istkbnxepwVar2 == null) {
            iobyxmoadg(56);
        }
        return !jh.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar2.getVisibility()) && jh.zdlpuopuiu.nufgyqmvbu(istkbnxepwVar2, istkbnxepwVar, z13);
    }

    public static Collection zdlpuopuiu(jh.eablkybsjg eablkybsjgVar, Collection collection) {
        if (eablkybsjgVar == null) {
            iobyxmoadg(94);
        }
        if (collection == null) {
            iobyxmoadg(95);
        }
        List listSflfametgt = hg.jyumaefscl.sflfametgt(collection, new eablkybsjg(eablkybsjgVar));
        if (listSflfametgt == null) {
            iobyxmoadg(96);
        }
        return listSflfametgt;
    }

    private static boolean zoijcleaow(Collection collection) {
        if (collection == null) {
            iobyxmoadg(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        return hg.jyumaefscl.jhduphickx(collection, new ppxfxbqfkf(((jh.zoijcleaow) collection.iterator().next()).zoijcleaow()));
    }

    public static boolean zynmafqrjb(jh.iobyxmoadg iobyxmoadgVar, jh.iobyxmoadg iobyxmoadgVar2) {
        if (iobyxmoadgVar == null) {
            iobyxmoadg(65);
        }
        if (iobyxmoadgVar2 == null) {
            iobyxmoadg(66);
        }
        kegysxyocb returnType = iobyxmoadgVar.getReturnType();
        kegysxyocb returnType2 = iobyxmoadgVar2.getReturnType();
        if (!wwaezpbzkn(iobyxmoadgVar, iobyxmoadgVar2)) {
            return false;
        }
        lrnfpwlwnk lrnfpwlwnkVarDraadjrbmk = f62605gxszxtbevo.draadjrbmk(iobyxmoadgVar.getTypeParameters(), iobyxmoadgVar2.getTypeParameters());
        if (iobyxmoadgVar instanceof lereixgezr) {
            return lmojexxdyd(iobyxmoadgVar, returnType, iobyxmoadgVar2, returnType2, lrnfpwlwnkVarDraadjrbmk);
        }
        if (!(iobyxmoadgVar instanceof crxdokpmqz)) {
            throw new IllegalArgumentException("Unexpected callable: " + iobyxmoadgVar.getClass());
        }
        crxdokpmqz crxdokpmqzVar = (crxdokpmqz) iobyxmoadgVar;
        crxdokpmqz crxdokpmqzVar2 = (crxdokpmqz) iobyxmoadgVar2;
        if (!pmvmpeiblj(crxdokpmqzVar.nufgyqmvbu(), crxdokpmqzVar2.nufgyqmvbu())) {
            return false;
        }
        if (crxdokpmqzVar.jpowsppfya() && crxdokpmqzVar2.jpowsppfya()) {
            return zi.lqeggnwhkg.f130055iobyxmoadg.wflxmlrfwp(lrnfpwlwnkVarDraadjrbmk, returnType.jrbgnlbqoe(), returnType2.jrbgnlbqoe());
        }
        return (crxdokpmqzVar.jpowsppfya() || !crxdokpmqzVar2.jpowsppfya()) && lmojexxdyd(iobyxmoadgVar, returnType, iobyxmoadgVar2, returnType2, lrnfpwlwnkVarDraadjrbmk);
    }

    public dxjokdxxww cdpycssgdh(jh.iobyxmoadg iobyxmoadgVar, jh.iobyxmoadg iobyxmoadgVar2, jh.eablkybsjg eablkybsjgVar) {
        if (iobyxmoadgVar == null) {
            iobyxmoadg(19);
        }
        if (iobyxmoadgVar2 == null) {
            iobyxmoadg(20);
        }
        dxjokdxxww dxjokdxxwwVarYadqdtsiqt = yadqdtsiqt(iobyxmoadgVar, iobyxmoadgVar2, eablkybsjgVar, false);
        if (dxjokdxxwwVarYadqdtsiqt == null) {
            iobyxmoadg(21);
        }
        return dxjokdxxwwVarYadqdtsiqt;
    }

    public dxjokdxxww iozdgvuglv(jh.iobyxmoadg iobyxmoadgVar, jh.iobyxmoadg iobyxmoadgVar2, boolean z13) {
        if (iobyxmoadgVar == null) {
            iobyxmoadg(28);
        }
        if (iobyxmoadgVar2 == null) {
            iobyxmoadg(29);
        }
        dxjokdxxww dxjokdxxwwVarIwizpuwonk = iwizpuwonk(iobyxmoadgVar, iobyxmoadgVar2);
        if (dxjokdxxwwVarIwizpuwonk != null) {
            return dxjokdxxwwVarIwizpuwonk;
        }
        List listLqeggnwhkg = lqeggnwhkg(iobyxmoadgVar);
        List listLqeggnwhkg2 = lqeggnwhkg(iobyxmoadgVar2);
        List typeParameters = iobyxmoadgVar.getTypeParameters();
        List typeParameters2 = iobyxmoadgVar2.getTypeParameters();
        int i13 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i13 < listLqeggnwhkg.size()) {
                if (!aj.eablkybsjg.f2055iobyxmoadg.ppxfxbqfkf((kegysxyocb) listLqeggnwhkg.get(i13), (kegysxyocb) listLqeggnwhkg2.get(i13))) {
                    dxjokdxxww dxjokdxxwwVarWkgbmnqykc = dxjokdxxww.wkgbmnqykc("Type parameter number mismatch");
                    if (dxjokdxxwwVarWkgbmnqykc == null) {
                        iobyxmoadg(31);
                    }
                    return dxjokdxxwwVarWkgbmnqykc;
                }
                i13++;
            }
            dxjokdxxww dxjokdxxwwVarZoijcleaow = dxjokdxxww.zoijcleaow("Type parameter number mismatch");
            if (dxjokdxxwwVarZoijcleaow == null) {
                iobyxmoadg(32);
            }
            return dxjokdxxwwVarZoijcleaow;
        }
        lrnfpwlwnk lrnfpwlwnkVarDraadjrbmk = draadjrbmk(typeParameters, typeParameters2);
        for (int i14 = 0; i14 < typeParameters.size(); i14++) {
            if (!ppxfxbqfkf((yfnezrywwk) typeParameters.get(i14), (yfnezrywwk) typeParameters2.get(i14), lrnfpwlwnkVarDraadjrbmk)) {
                dxjokdxxww dxjokdxxwwVarWkgbmnqykc2 = dxjokdxxww.wkgbmnqykc("Type parameter bounds mismatch");
                if (dxjokdxxwwVarWkgbmnqykc2 == null) {
                    iobyxmoadg(33);
                }
                return dxjokdxxwwVarWkgbmnqykc2;
            }
        }
        while (i13 < listLqeggnwhkg.size()) {
            if (!wkgbmnqykc((kegysxyocb) listLqeggnwhkg.get(i13), (kegysxyocb) listLqeggnwhkg2.get(i13), lrnfpwlwnkVarDraadjrbmk)) {
                dxjokdxxww dxjokdxxwwVarWkgbmnqykc3 = dxjokdxxww.wkgbmnqykc("Value parameter type mismatch");
                if (dxjokdxxwwVarWkgbmnqykc3 == null) {
                    iobyxmoadg(34);
                }
                return dxjokdxxwwVarWkgbmnqykc3;
            }
            i13++;
        }
        if ((iobyxmoadgVar instanceof lereixgezr) && (iobyxmoadgVar2 instanceof lereixgezr) && ((lereixgezr) iobyxmoadgVar).isSuspend() != ((lereixgezr) iobyxmoadgVar2).isSuspend()) {
            dxjokdxxww dxjokdxxwwVarZoijcleaow2 = dxjokdxxww.zoijcleaow("Incompatible suspendability");
            if (dxjokdxxwwVarZoijcleaow2 == null) {
                iobyxmoadg(35);
            }
            return dxjokdxxwwVarZoijcleaow2;
        }
        if (z13) {
            kegysxyocb returnType = iobyxmoadgVar.getReturnType();
            kegysxyocb returnType2 = iobyxmoadgVar2.getReturnType();
            if (returnType != null && returnType2 != null && ((!ulzqkzuiru.iobyxmoadg(returnType2) || !ulzqkzuiru.iobyxmoadg(returnType)) && !zi.lqeggnwhkg.f130055iobyxmoadg.zdlpuopuiu(lrnfpwlwnkVarDraadjrbmk, returnType2.jrbgnlbqoe(), returnType.jrbgnlbqoe()))) {
                dxjokdxxww dxjokdxxwwVarZoijcleaow3 = dxjokdxxww.zoijcleaow("Return type mismatch");
                if (dxjokdxxwwVarZoijcleaow3 == null) {
                    iobyxmoadg(36);
                }
                return dxjokdxxwwVarZoijcleaow3;
            }
        }
        dxjokdxxww dxjokdxxwwVarEablkybsjg = dxjokdxxww.eablkybsjg();
        if (dxjokdxxwwVarEablkybsjg == null) {
            iobyxmoadg(37);
        }
        return dxjokdxxwwVarEablkybsjg;
    }

    public void jyumaefscl(ii.gxszxtbevo gxszxtbevoVar, Collection collection, Collection collection2, jh.eablkybsjg eablkybsjgVar, agtfadlqog agtfadlqogVar) {
        if (gxszxtbevoVar == null) {
            iobyxmoadg(50);
        }
        if (collection == null) {
            iobyxmoadg(51);
        }
        if (collection2 == null) {
            iobyxmoadg(52);
        }
        if (eablkybsjgVar == null) {
            iobyxmoadg(53);
        }
        if (agtfadlqogVar == null) {
            iobyxmoadg(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(ojitshcjhn((jh.zoijcleaow) it.next(), collection, eablkybsjgVar, agtfadlqogVar));
        }
        gtknphoqwx(eablkybsjgVar, linkedHashSet, agtfadlqogVar);
    }

    public dxjokdxxww yadqdtsiqt(jh.iobyxmoadg iobyxmoadgVar, jh.iobyxmoadg iobyxmoadgVar2, jh.eablkybsjg eablkybsjgVar, boolean z13) {
        if (iobyxmoadgVar == null) {
            iobyxmoadg(22);
        }
        if (iobyxmoadgVar2 == null) {
            iobyxmoadg(23);
        }
        dxjokdxxww dxjokdxxwwVarIozdgvuglv = iozdgvuglv(iobyxmoadgVar, iobyxmoadgVar2, z13);
        boolean z14 = dxjokdxxwwVarIozdgvuglv.ppxfxbqfkf() == dxjokdxxww.iobyxmoadg.OVERRIDABLE;
        for (btonecajqb btonecajqbVar : f62604eablkybsjg) {
            if (btonecajqbVar.zoijcleaow() != btonecajqb.iobyxmoadg.CONFLICTS_ONLY && (!z14 || btonecajqbVar.zoijcleaow() != btonecajqb.iobyxmoadg.SUCCESS_ONLY)) {
                int i13 = nufgyqmvbu.f62621iobyxmoadg[btonecajqbVar.iobyxmoadg(iobyxmoadgVar, iobyxmoadgVar2, eablkybsjgVar).ordinal()];
                if (i13 == 1) {
                    z14 = true;
                } else if (i13 == 2) {
                    dxjokdxxww dxjokdxxwwVarWkgbmnqykc = dxjokdxxww.wkgbmnqykc("External condition");
                    if (dxjokdxxwwVarWkgbmnqykc == null) {
                        iobyxmoadg(24);
                    }
                    return dxjokdxxwwVarWkgbmnqykc;
                }
            }
        }
        if (!z14) {
            return dxjokdxxwwVarIozdgvuglv;
        }
        for (btonecajqb btonecajqbVar2 : f62604eablkybsjg) {
            if (btonecajqbVar2.zoijcleaow() == btonecajqb.iobyxmoadg.CONFLICTS_ONLY) {
                int i14 = nufgyqmvbu.f62621iobyxmoadg[btonecajqbVar2.iobyxmoadg(iobyxmoadgVar, iobyxmoadgVar2, eablkybsjgVar).ordinal()];
                if (i14 == 1) {
                    throw new IllegalStateException("Contract violation in " + btonecajqbVar2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i14 == 2) {
                    dxjokdxxww dxjokdxxwwVarWkgbmnqykc2 = dxjokdxxww.wkgbmnqykc("External condition");
                    if (dxjokdxxwwVarWkgbmnqykc2 == null) {
                        iobyxmoadg(26);
                    }
                    return dxjokdxxwwVarWkgbmnqykc2;
                }
            }
        }
        dxjokdxxww dxjokdxxwwVarEablkybsjg = dxjokdxxww.eablkybsjg();
        if (dxjokdxxwwVarEablkybsjg == null) {
            iobyxmoadg(27);
        }
        return dxjokdxxwwVarEablkybsjg;
    }
}
