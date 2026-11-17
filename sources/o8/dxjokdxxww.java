package o8;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class dxjokdxxww implements o8.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f72292eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f72293gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lqeggnwhkg f72294iobyxmoadg = new lqeggnwhkg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f72297zoijcleaow = new zoijcleaow();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f72295ppxfxbqfkf = new HashMap();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f72296wkgbmnqykc = new HashMap();

    private static final class iobyxmoadg implements draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final zoijcleaow f72298iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Class f72299ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f72300zoijcleaow;

        iobyxmoadg(zoijcleaow zoijcleaowVar) {
            this.f72298iobyxmoadg = zoijcleaowVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f72300zoijcleaow == iobyxmoadgVar.f72300zoijcleaow && this.f72299ppxfxbqfkf == iobyxmoadgVar.f72299ppxfxbqfkf;
        }

        public int hashCode() {
            int i13 = this.f72300zoijcleaow * 31;
            Class cls = this.f72299ppxfxbqfkf;
            return i13 + (cls != null ? cls.hashCode() : 0);
        }

        @Override // o8.draadjrbmk
        public void iobyxmoadg() {
            this.f72298iobyxmoadg.ppxfxbqfkf(this);
        }

        public String toString() {
            return "Key{size=" + this.f72300zoijcleaow + "array=" + this.f72299ppxfxbqfkf + '}';
        }

        void zoijcleaow(int i13, Class cls) {
            this.f72300zoijcleaow = i13;
            this.f72299ppxfxbqfkf = cls;
        }
    }

    private static final class zoijcleaow extends ppxfxbqfkf {
        zoijcleaow() {
        }

        iobyxmoadg eablkybsjg(int i13, Class cls) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) zoijcleaow();
            iobyxmoadgVar.zoijcleaow(i13, cls);
            return iobyxmoadgVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o8.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg iobyxmoadg() {
            return new iobyxmoadg(this);
        }
    }

    public dxjokdxxww(int i13) {
        this.f72292eablkybsjg = i13;
    }

    private boolean agtfadlqog() {
        int i13 = this.f72293gxszxtbevo;
        return i13 == 0 || this.f72292eablkybsjg / i13 >= 2;
    }

    private o8.iobyxmoadg btonecajqb(Class cls) {
        o8.iobyxmoadg gxszxtbevoVar = (o8.iobyxmoadg) this.f72296wkgbmnqykc.get(cls);
        if (gxszxtbevoVar == null) {
            if (cls.equals(int[].class)) {
                gxszxtbevoVar = new nufgyqmvbu();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                gxszxtbevoVar = new gxszxtbevo();
            }
            this.f72296wkgbmnqykc.put(cls, gxszxtbevoVar);
        }
        return gxszxtbevoVar;
    }

    private Object draadjrbmk(iobyxmoadg iobyxmoadgVar, Class cls) {
        o8.iobyxmoadg iobyxmoadgVarBtonecajqb = btonecajqb(cls);
        Object objGtknphoqwx = gtknphoqwx(iobyxmoadgVar);
        if (objGtknphoqwx != null) {
            this.f72293gxszxtbevo -= iobyxmoadgVarBtonecajqb.zoijcleaow(objGtknphoqwx) * iobyxmoadgVarBtonecajqb.iobyxmoadg();
            gxszxtbevo(iobyxmoadgVarBtonecajqb.zoijcleaow(objGtknphoqwx), cls);
        }
        if (objGtknphoqwx != null) {
            return objGtknphoqwx;
        }
        if (Log.isLoggable(iobyxmoadgVarBtonecajqb.getTag(), 2)) {
            Log.v(iobyxmoadgVarBtonecajqb.getTag(), "Allocated " + iobyxmoadgVar.f72300zoijcleaow + " bytes");
        }
        return iobyxmoadgVarBtonecajqb.newArray(iobyxmoadgVar.f72300zoijcleaow);
    }

    private o8.iobyxmoadg dxjokdxxww(Object obj) {
        return btonecajqb(obj.getClass());
    }

    private Object gtknphoqwx(iobyxmoadg iobyxmoadgVar) {
        return this.f72294iobyxmoadg.iobyxmoadg(iobyxmoadgVar);
    }

    private void gxszxtbevo(int i13, Class cls) {
        NavigableMap navigableMapWflxmlrfwp = wflxmlrfwp(cls);
        Integer num = (Integer) navigableMapWflxmlrfwp.get(Integer.valueOf(i13));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapWflxmlrfwp.remove(Integer.valueOf(i13));
                return;
            } else {
                navigableMapWflxmlrfwp.put(Integer.valueOf(i13), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i13 + ", this: " + this);
    }

    private void lqeggnwhkg() {
        nufgyqmvbu(this.f72292eablkybsjg);
    }

    private void nufgyqmvbu(int i13) {
        while (this.f72293gxszxtbevo > i13) {
            Object objGxszxtbevo = this.f72294iobyxmoadg.gxszxtbevo();
            g9.gtknphoqwx.eablkybsjg(objGxszxtbevo);
            o8.iobyxmoadg iobyxmoadgVarDxjokdxxww = dxjokdxxww(objGxszxtbevo);
            this.f72293gxszxtbevo -= iobyxmoadgVarDxjokdxxww.zoijcleaow(objGxszxtbevo) * iobyxmoadgVarDxjokdxxww.iobyxmoadg();
            gxszxtbevo(iobyxmoadgVarDxjokdxxww.zoijcleaow(objGxszxtbevo), objGxszxtbevo.getClass());
            if (Log.isLoggable(iobyxmoadgVarDxjokdxxww.getTag(), 2)) {
                Log.v(iobyxmoadgVarDxjokdxxww.getTag(), "evicted: " + iobyxmoadgVarDxjokdxxww.zoijcleaow(objGxszxtbevo));
            }
        }
    }

    private boolean ojitshcjhn(int i13) {
        return i13 <= this.f72292eablkybsjg / 2;
    }

    private boolean rgvfuqvkyq(int i13, Integer num) {
        return num != null && (agtfadlqog() || num.intValue() <= i13 * 8);
    }

    private NavigableMap wflxmlrfwp(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f72295ppxfxbqfkf.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f72295ppxfxbqfkf.put(cls, treeMap);
        return treeMap;
    }

    @Override // o8.zoijcleaow
    public synchronized void eablkybsjg(Object obj) {
        Class<?> cls = obj.getClass();
        o8.iobyxmoadg iobyxmoadgVarBtonecajqb = btonecajqb(cls);
        int iZoijcleaow = iobyxmoadgVarBtonecajqb.zoijcleaow(obj);
        int iIobyxmoadg = iobyxmoadgVarBtonecajqb.iobyxmoadg() * iZoijcleaow;
        if (ojitshcjhn(iIobyxmoadg)) {
            iobyxmoadg iobyxmoadgVarEablkybsjg = this.f72297zoijcleaow.eablkybsjg(iZoijcleaow, cls);
            this.f72294iobyxmoadg.wkgbmnqykc(iobyxmoadgVarEablkybsjg, obj);
            NavigableMap navigableMapWflxmlrfwp = wflxmlrfwp(cls);
            Integer num = (Integer) navigableMapWflxmlrfwp.get(Integer.valueOf(iobyxmoadgVarEablkybsjg.f72300zoijcleaow));
            Integer numValueOf = Integer.valueOf(iobyxmoadgVarEablkybsjg.f72300zoijcleaow);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapWflxmlrfwp.put(numValueOf, Integer.valueOf(iIntValue));
            this.f72293gxszxtbevo += iIobyxmoadg;
            lqeggnwhkg();
        }
    }

    @Override // o8.zoijcleaow
    public synchronized void iobyxmoadg(int i13) {
        try {
            if (i13 >= 40) {
                zoijcleaow();
            } else if (i13 >= 20 || i13 == 15) {
                nufgyqmvbu(this.f72292eablkybsjg / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // o8.zoijcleaow
    public synchronized Object ppxfxbqfkf(int i13, Class cls) {
        Integer num;
        try {
            num = (Integer) wflxmlrfwp(cls).ceilingKey(Integer.valueOf(i13));
        } catch (Throwable th2) {
            throw th2;
        }
        return draadjrbmk(rgvfuqvkyq(i13, num) ? this.f72297zoijcleaow.eablkybsjg(num.intValue(), cls) : this.f72297zoijcleaow.eablkybsjg(i13, cls), cls);
    }

    @Override // o8.zoijcleaow
    public synchronized Object wkgbmnqykc(int i13, Class cls) {
        return draadjrbmk(this.f72297zoijcleaow.eablkybsjg(i13, cls), cls);
    }

    @Override // o8.zoijcleaow
    public synchronized void zoijcleaow() {
        nufgyqmvbu(0);
    }
}
