package ci;

import hg.agtfadlqog;
import hg.jyumaefscl;
import hg.tzroggbefp;
import hi.eablkybsjg;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final byte[] f19864dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String[] f19865eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f19866gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final EnumC0363iobyxmoadg f19867iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f19868lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f19869nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String[] f19870ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String[] f19871wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f19872zoijcleaow;

    /* JADX INFO: renamed from: ci.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public enum EnumC0363iobyxmoadg {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private static final Map f19878jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f19883zdlpuopuiu;

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f19873cdpycssgdh = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public static final C0364iobyxmoadg f19881yggfygwlhe = new C0364iobyxmoadg(null);

        /* JADX INFO: renamed from: ci.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0364iobyxmoadg {
            public /* synthetic */ C0364iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final EnumC0363iobyxmoadg iobyxmoadg(int i13) {
                EnumC0363iobyxmoadg enumC0363iobyxmoadg = (EnumC0363iobyxmoadg) EnumC0363iobyxmoadg.f19878jyumaefscl.get(Integer.valueOf(i13));
                return enumC0363iobyxmoadg == null ? EnumC0363iobyxmoadg.UNKNOWN : enumC0363iobyxmoadg;
            }

            private C0364iobyxmoadg() {
            }
        }

        static {
            EnumC0363iobyxmoadg[] enumC0363iobyxmoadgArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(enumC0363iobyxmoadgArrValues.length), 16));
            for (EnumC0363iobyxmoadg enumC0363iobyxmoadg : enumC0363iobyxmoadgArrValues) {
                linkedHashMap.put(Integer.valueOf(enumC0363iobyxmoadg.f19883zdlpuopuiu), enumC0363iobyxmoadg);
            }
            f19878jyumaefscl = linkedHashMap;
        }

        EnumC0363iobyxmoadg(int i13) {
            this.f19883zdlpuopuiu = i13;
        }

        public static final EnumC0363iobyxmoadg lqeggnwhkg(int i13) {
            return f19881yggfygwlhe.iobyxmoadg(i13);
        }
    }

    public iobyxmoadg(EnumC0363iobyxmoadg kind, eablkybsjg metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i13, String str2, byte[] bArr) {
        zdlpuopuiu.btonecajqb(kind, "kind");
        zdlpuopuiu.btonecajqb(metadataVersion, "metadataVersion");
        this.f19867iobyxmoadg = kind;
        this.f19872zoijcleaow = metadataVersion;
        this.f19870ppxfxbqfkf = strArr;
        this.f19871wkgbmnqykc = strArr2;
        this.f19865eablkybsjg = strArr3;
        this.f19866gxszxtbevo = str;
        this.f19868lqeggnwhkg = i13;
        this.f19869nufgyqmvbu = str2;
        this.f19864dxjokdxxww = bArr;
    }

    private final boolean nufgyqmvbu(int i13, int i14) {
        return (i13 & i14) != 0;
    }

    public final boolean btonecajqb() {
        return nufgyqmvbu(this.f19868lqeggnwhkg, 16) && !nufgyqmvbu(this.f19868lqeggnwhkg, 32);
    }

    public final boolean dxjokdxxww() {
        return nufgyqmvbu(this.f19868lqeggnwhkg, 2);
    }

    public final String eablkybsjg() {
        String str = this.f19866gxszxtbevo;
        if (this.f19867iobyxmoadg == EnumC0363iobyxmoadg.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List gxszxtbevo() {
        String[] strArr = this.f19870ppxfxbqfkf;
        if (this.f19867iobyxmoadg != EnumC0363iobyxmoadg.MULTIFILE_CLASS) {
            strArr = null;
        }
        List listGxszxtbevo = strArr != null ? agtfadlqog.gxszxtbevo(strArr) : null;
        return listGxszxtbevo == null ? jyumaefscl.wflxmlrfwp() : listGxszxtbevo;
    }

    public final String[] iobyxmoadg() {
        return this.f19870ppxfxbqfkf;
    }

    public final String[] lqeggnwhkg() {
        return this.f19865eablkybsjg;
    }

    public final EnumC0363iobyxmoadg ppxfxbqfkf() {
        return this.f19867iobyxmoadg;
    }

    public String toString() {
        return this.f19867iobyxmoadg + " version=" + this.f19872zoijcleaow;
    }

    public final eablkybsjg wkgbmnqykc() {
        return this.f19872zoijcleaow;
    }

    public final String[] zoijcleaow() {
        return this.f19871wkgbmnqykc;
    }
}
