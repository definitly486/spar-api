package o8;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class wflxmlrfwp implements gtknphoqwx {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final Bitmap.Config[] f72308eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final Bitmap.Config[] f72309gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final Bitmap.Config[] f72310lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final Bitmap.Config[] f72311nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Bitmap.Config[] f72312wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f72313iobyxmoadg = new ppxfxbqfkf();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f72315zoijcleaow = new lqeggnwhkg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f72314ppxfxbqfkf = new HashMap();

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f72316iobyxmoadg;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f72316iobyxmoadg = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72316iobyxmoadg[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72316iobyxmoadg[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72316iobyxmoadg[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static class ppxfxbqfkf extends o8.ppxfxbqfkf {
        ppxfxbqfkf() {
        }

        public zoijcleaow eablkybsjg(int i13, Bitmap.Config config) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) zoijcleaow();
            zoijcleaowVar.zoijcleaow(i13, config);
            return zoijcleaowVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o8.ppxfxbqfkf
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public zoijcleaow iobyxmoadg() {
            return new zoijcleaow(this);
        }
    }

    static final class zoijcleaow implements draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ppxfxbqfkf f72317iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Bitmap.Config f72318ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f72319zoijcleaow;

        public zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f72317iobyxmoadg = ppxfxbqfkfVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f72319zoijcleaow == zoijcleaowVar.f72319zoijcleaow && g9.draadjrbmk.wkgbmnqykc(this.f72318ppxfxbqfkf, zoijcleaowVar.f72318ppxfxbqfkf);
        }

        public int hashCode() {
            int i13 = this.f72319zoijcleaow * 31;
            Bitmap.Config config = this.f72318ppxfxbqfkf;
            return i13 + (config != null ? config.hashCode() : 0);
        }

        @Override // o8.draadjrbmk
        public void iobyxmoadg() {
            this.f72317iobyxmoadg.ppxfxbqfkf(this);
        }

        public String toString() {
            return wflxmlrfwp.nufgyqmvbu(this.f72319zoijcleaow, this.f72318ppxfxbqfkf);
        }

        public void zoijcleaow(int i13, Bitmap.Config config) {
            this.f72319zoijcleaow = i13;
            this.f72318ppxfxbqfkf = config;
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f72312wkgbmnqykc = configArr;
        f72308eablkybsjg = configArr;
        f72309gxszxtbevo = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f72310lqeggnwhkg = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f72311nufgyqmvbu = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private NavigableMap btonecajqb(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f72314ppxfxbqfkf.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f72314ppxfxbqfkf.put(config, treeMap);
        return treeMap;
    }

    private static Bitmap.Config[] dxjokdxxww(Bitmap.Config config) {
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            return f72308eablkybsjg;
        }
        int i13 = iobyxmoadg.f72316iobyxmoadg[config.ordinal()];
        if (i13 == 1) {
            return f72312wkgbmnqykc;
        }
        if (i13 == 2) {
            return f72309gxszxtbevo;
        }
        if (i13 != 3) {
            return i13 != 4 ? new Bitmap.Config[]{config} : f72311nufgyqmvbu;
        }
        return f72310lqeggnwhkg;
    }

    private void gxszxtbevo(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapBtonecajqb = btonecajqb(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapBtonecajqb.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapBtonecajqb.remove(num);
                return;
            } else {
                navigableMapBtonecajqb.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + iobyxmoadg(bitmap) + ", this: " + this);
    }

    private zoijcleaow lqeggnwhkg(int i13, Bitmap.Config config) {
        zoijcleaow zoijcleaowVarEablkybsjg = this.f72313iobyxmoadg.eablkybsjg(i13, config);
        for (Bitmap.Config config2 : dxjokdxxww(config)) {
            Integer num = (Integer) btonecajqb(config2).ceilingKey(Integer.valueOf(i13));
            if (num != null && num.intValue() <= i13 * 8) {
                if (num.intValue() == i13) {
                    if (config2 == null) {
                        if (config == null) {
                            return zoijcleaowVarEablkybsjg;
                        }
                    } else if (config2.equals(config)) {
                        return zoijcleaowVarEablkybsjg;
                    }
                }
                this.f72313iobyxmoadg.ppxfxbqfkf(zoijcleaowVarEablkybsjg);
                return this.f72313iobyxmoadg.eablkybsjg(num.intValue(), config2);
            }
        }
        return zoijcleaowVarEablkybsjg;
    }

    static String nufgyqmvbu(int i13, Bitmap.Config config) {
        return "[" + i13 + "](" + config + ")";
    }

    @Override // o8.gtknphoqwx
    public int eablkybsjg(Bitmap bitmap) {
        return g9.draadjrbmk.nufgyqmvbu(bitmap);
    }

    @Override // o8.gtknphoqwx
    public String iobyxmoadg(Bitmap bitmap) {
        return nufgyqmvbu(g9.draadjrbmk.nufgyqmvbu(bitmap), bitmap.getConfig());
    }

    @Override // o8.gtknphoqwx
    public void ppxfxbqfkf(Bitmap bitmap) {
        zoijcleaow zoijcleaowVarEablkybsjg = this.f72313iobyxmoadg.eablkybsjg(g9.draadjrbmk.nufgyqmvbu(bitmap), bitmap.getConfig());
        this.f72315zoijcleaow.wkgbmnqykc(zoijcleaowVarEablkybsjg, bitmap);
        NavigableMap navigableMapBtonecajqb = btonecajqb(bitmap.getConfig());
        Integer num = (Integer) navigableMapBtonecajqb.get(Integer.valueOf(zoijcleaowVarEablkybsjg.f72319zoijcleaow));
        navigableMapBtonecajqb.put(Integer.valueOf(zoijcleaowVarEablkybsjg.f72319zoijcleaow), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // o8.gtknphoqwx
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f72315zoijcleaow.gxszxtbevo();
        if (bitmap != null) {
            gxszxtbevo(Integer.valueOf(g9.draadjrbmk.nufgyqmvbu(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("SizeConfigStrategy{groupedMap=");
        sb3.append(this.f72315zoijcleaow);
        sb3.append(", sortedSizes=(");
        for (Map.Entry entry : this.f72314ppxfxbqfkf.entrySet()) {
            sb3.append(entry.getKey());
            sb3.append('[');
            sb3.append(entry.getValue());
            sb3.append("], ");
        }
        if (!this.f72314ppxfxbqfkf.isEmpty()) {
            sb3.replace(sb3.length() - 2, sb3.length(), "");
        }
        sb3.append(")}");
        return sb3.toString();
    }

    @Override // o8.gtknphoqwx
    public Bitmap wkgbmnqykc(int i13, int i14, Bitmap.Config config) {
        zoijcleaow zoijcleaowVarLqeggnwhkg = lqeggnwhkg(g9.draadjrbmk.lqeggnwhkg(i13, i14, config), config);
        Bitmap bitmap = (Bitmap) this.f72315zoijcleaow.iobyxmoadg(zoijcleaowVarLqeggnwhkg);
        if (bitmap != null) {
            gxszxtbevo(Integer.valueOf(zoijcleaowVarLqeggnwhkg.f72319zoijcleaow), bitmap);
            bitmap.reconfigure(i13, i14, config);
        }
        return bitmap;
    }

    @Override // o8.gtknphoqwx
    public String zoijcleaow(int i13, int i14, Bitmap.Config config) {
        return nufgyqmvbu(g9.draadjrbmk.lqeggnwhkg(i13, i14, config), config);
    }
}
