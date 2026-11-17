package dm;

import cm.rgvfuqvkyq;
import gm.btonecajqb;
import gm.dxjokdxxww;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg implements Comparable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final Method f29129iwizpuwonk;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final btonecajqb f29132zdlpuopuiu = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final ConcurrentHashMap f29131yggfygwlhe = new ConcurrentHashMap();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final ConcurrentHashMap f29130jyumaefscl = new ConcurrentHashMap();

    class iobyxmoadg implements btonecajqb {
        iobyxmoadg() {
        }

        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public eablkybsjg iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            return eablkybsjg.lqeggnwhkg(eablkybsjgVar);
        }
    }

    static {
        Method method;
        try {
            method = Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
            method = null;
        }
        f29129iwizpuwonk = method;
    }

    protected eablkybsjg() {
    }

    public static eablkybsjg lqeggnwhkg(gm.eablkybsjg eablkybsjgVar) {
        fm.ppxfxbqfkf.dxjokdxxww(eablkybsjgVar, "temporal");
        eablkybsjg eablkybsjgVar2 = (eablkybsjg) eablkybsjgVar.btonecajqb(dxjokdxxww.iobyxmoadg());
        return eablkybsjgVar2 != null ? eablkybsjgVar2 : gxszxtbevo.f29133cqumvgiudr;
    }

    public abstract wkgbmnqykc dxjokdxxww(cm.wkgbmnqykc wkgbmnqykcVar, rgvfuqvkyq rgvfuqvkyqVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eablkybsjg) && compareTo((eablkybsjg) obj) == 0;
    }

    public int hashCode() {
        return getClass().hashCode() ^ nufgyqmvbu().hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public int compareTo(eablkybsjg eablkybsjgVar) {
        return nufgyqmvbu().compareTo(eablkybsjgVar.nufgyqmvbu());
    }

    public abstract String nufgyqmvbu();

    public String toString() {
        return nufgyqmvbu();
    }

    public abstract dm.iobyxmoadg wkgbmnqykc(gm.eablkybsjg eablkybsjgVar);
}
