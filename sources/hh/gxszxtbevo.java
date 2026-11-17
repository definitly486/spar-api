package hh;

import gh.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ii.ppxfxbqfkf f40294iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f40295ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ii.zoijcleaow f40296wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f40297zoijcleaow;

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final iobyxmoadg f40298eablkybsjg = new iobyxmoadg();

        private iobyxmoadg() {
            super(ojitshcjhn.f37261pmvmpeiblj, "Function", false, null);
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final ppxfxbqfkf f40299eablkybsjg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(ojitshcjhn.f37242cqumvgiudr, "KSuspendFunction", true, null);
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final wkgbmnqykc f40300eablkybsjg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(ojitshcjhn.f37254kcexrzcfyt, "SuspendFunction", false, null);
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final zoijcleaow f40301eablkybsjg = new zoijcleaow();

        private zoijcleaow() {
            super(ojitshcjhn.f37242cqumvgiudr, "KFunction", true, null);
        }
    }

    public gxszxtbevo(ii.ppxfxbqfkf packageFqName, String classNamePrefix, boolean z13, ii.zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(packageFqName, "packageFqName");
        zdlpuopuiu.btonecajqb(classNamePrefix, "classNamePrefix");
        this.f40294iobyxmoadg = packageFqName;
        this.f40297zoijcleaow = classNamePrefix;
        this.f40295ppxfxbqfkf = z13;
        this.f40296wkgbmnqykc = zoijcleaowVar;
    }

    public final String iobyxmoadg() {
        return this.f40297zoijcleaow;
    }

    public final ii.gxszxtbevo ppxfxbqfkf(int i13) {
        ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(this.f40297zoijcleaow + i13);
        zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
        return gxszxtbevoVarGxszxtbevo;
    }

    public String toString() {
        return this.f40294iobyxmoadg + '.' + this.f40297zoijcleaow + 'N';
    }

    public final ii.ppxfxbqfkf zoijcleaow() {
        return this.f40294iobyxmoadg;
    }
}
