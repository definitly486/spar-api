package e6;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg implements e6.lqeggnwhkg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Set f30590ppxfxbqfkf = new HashSet();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f30591iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f30592zoijcleaow;

    public static class dxjokdxxww extends iobyxmoadg {
        dxjokdxxww(String str, String str2) {
            super(str, str2);
        }

        @Override // e6.iobyxmoadg
        public final boolean ppxfxbqfkf() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public static class eablkybsjg extends iobyxmoadg {
        eablkybsjg(String str, String str2) {
            super(str, str2);
        }

        @Override // e6.iobyxmoadg
        public final boolean ppxfxbqfkf() {
            return true;
        }
    }

    public static class gxszxtbevo extends iobyxmoadg {
        gxszxtbevo(String str, String str2) {
            super(str, str2);
        }

        @Override // e6.iobyxmoadg
        public final boolean ppxfxbqfkf() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* JADX INFO: renamed from: e6.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static class C0637iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final Set f30593iobyxmoadg = new HashSet(Arrays.asList(draadjrbmk.wkgbmnqykc().iobyxmoadg()));
    }

    public static class lqeggnwhkg extends iobyxmoadg {
        lqeggnwhkg(String str, String str2) {
            super(str, str2);
        }

        @Override // e6.iobyxmoadg
        public final boolean ppxfxbqfkf() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class nufgyqmvbu extends iobyxmoadg {
        nufgyqmvbu(String str, String str2) {
            super(str, str2);
        }

        @Override // e6.iobyxmoadg
        public final boolean ppxfxbqfkf() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class ppxfxbqfkf extends iobyxmoadg {
        ppxfxbqfkf(String str, String str2) {
            super(str, str2);
        }

        @Override // e6.iobyxmoadg
        public final boolean ppxfxbqfkf() {
            return true;
        }
    }

    public static class wkgbmnqykc extends iobyxmoadg {
        wkgbmnqykc(String str, String str2) {
            super(str, str2);
        }

        @Override // e6.iobyxmoadg
        public final boolean ppxfxbqfkf() {
            return false;
        }
    }

    public static class zoijcleaow extends iobyxmoadg {
        zoijcleaow(String str, String str2) {
            super(str, str2);
        }

        @Override // e6.iobyxmoadg
        public final boolean ppxfxbqfkf() {
            return true;
        }
    }

    iobyxmoadg(String str, String str2) {
        this.f30591iobyxmoadg = str;
        this.f30592zoijcleaow = str2;
        f30590ppxfxbqfkf.add(this);
    }

    public static Set eablkybsjg() {
        return Collections.unmodifiableSet(f30590ppxfxbqfkf);
    }

    @Override // e6.lqeggnwhkg
    public boolean iobyxmoadg() {
        return ppxfxbqfkf() || wkgbmnqykc();
    }

    public abstract boolean ppxfxbqfkf();

    public boolean wkgbmnqykc() {
        return dl.iobyxmoadg.zoijcleaow(C0637iobyxmoadg.f30593iobyxmoadg, this.f30592zoijcleaow);
    }

    @Override // e6.lqeggnwhkg
    public String zoijcleaow() {
        return this.f30591iobyxmoadg;
    }
}
