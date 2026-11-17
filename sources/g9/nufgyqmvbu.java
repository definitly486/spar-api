package g9;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f36698iobyxmoadg = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private long f36699ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f36700wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f36701zoijcleaow;

    static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Object f36702iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final int f36703zoijcleaow;

        iobyxmoadg(Object obj, int i13) {
            this.f36702iobyxmoadg = obj;
            this.f36703zoijcleaow = i13;
        }
    }

    public nufgyqmvbu(long j13) {
        this.f36701zoijcleaow = j13;
        this.f36699ppxfxbqfkf = j13;
    }

    private void gxszxtbevo() {
        wflxmlrfwp(this.f36699ppxfxbqfkf);
    }

    protected void btonecajqb(Object obj, Object obj2) {
    }

    public synchronized Object draadjrbmk(Object obj) {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f36698iobyxmoadg.remove(obj);
        if (iobyxmoadgVar == null) {
            return null;
        }
        this.f36700wkgbmnqykc -= (long) iobyxmoadgVar.f36703zoijcleaow;
        return iobyxmoadgVar.f36702iobyxmoadg;
    }

    protected int dxjokdxxww(Object obj) {
        return 1;
    }

    public synchronized Object gtknphoqwx(Object obj, Object obj2) {
        int iDxjokdxxww = dxjokdxxww(obj2);
        long j13 = iDxjokdxxww;
        if (j13 >= this.f36699ppxfxbqfkf) {
            btonecajqb(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f36700wkgbmnqykc += j13;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f36698iobyxmoadg.put(obj, obj2 == null ? null : new iobyxmoadg(obj2, iDxjokdxxww));
        if (iobyxmoadgVar != null) {
            this.f36700wkgbmnqykc -= (long) iobyxmoadgVar.f36703zoijcleaow;
            if (!iobyxmoadgVar.f36702iobyxmoadg.equals(obj2)) {
                btonecajqb(obj, iobyxmoadgVar.f36702iobyxmoadg);
            }
        }
        gxszxtbevo();
        return iobyxmoadgVar != null ? iobyxmoadgVar.f36702iobyxmoadg : null;
    }

    public synchronized Object lqeggnwhkg(Object obj) {
        iobyxmoadg iobyxmoadgVar;
        iobyxmoadgVar = (iobyxmoadg) this.f36698iobyxmoadg.get(obj);
        return iobyxmoadgVar != null ? iobyxmoadgVar.f36702iobyxmoadg : null;
    }

    public synchronized long nufgyqmvbu() {
        return this.f36699ppxfxbqfkf;
    }

    protected synchronized void wflxmlrfwp(long j13) {
        while (this.f36700wkgbmnqykc > j13) {
            Iterator it = this.f36698iobyxmoadg.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) entry.getValue();
            this.f36700wkgbmnqykc -= (long) iobyxmoadgVar.f36703zoijcleaow;
            Object key = entry.getKey();
            it.remove();
            btonecajqb(key, iobyxmoadgVar.f36702iobyxmoadg);
        }
    }

    public void zoijcleaow() {
        wflxmlrfwp(0L);
    }
}
