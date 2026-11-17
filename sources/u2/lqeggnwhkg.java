package u2;

import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private volatile boolean f112509wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f112507iobyxmoadg = new gxszxtbevo();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f112510zoijcleaow = new LinkedHashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Set f112508ppxfxbqfkf = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: private */
    public final void lqeggnwhkg(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e13) {
                throw new RuntimeException(e13);
            }
        }
    }

    public final void eablkybsjg(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        zdlpuopuiu.btonecajqb(key, "key");
        zdlpuopuiu.btonecajqb(closeable, "closeable");
        if (this.f112509wkgbmnqykc) {
            lqeggnwhkg(closeable);
            return;
        }
        synchronized (this.f112507iobyxmoadg) {
            autoCloseable = (AutoCloseable) this.f112510zoijcleaow.put(key, closeable);
        }
        lqeggnwhkg(autoCloseable);
    }

    public final void gxszxtbevo() {
        if (this.f112509wkgbmnqykc) {
            return;
        }
        this.f112509wkgbmnqykc = true;
        synchronized (this.f112507iobyxmoadg) {
            try {
                Iterator it = this.f112510zoijcleaow.values().iterator();
                while (it.hasNext()) {
                    lqeggnwhkg((AutoCloseable) it.next());
                }
                Iterator it2 = this.f112508ppxfxbqfkf.iterator();
                while (it2.hasNext()) {
                    lqeggnwhkg((AutoCloseable) it2.next());
                }
                this.f112508ppxfxbqfkf.clear();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final AutoCloseable nufgyqmvbu(String key) {
        AutoCloseable autoCloseable;
        zdlpuopuiu.btonecajqb(key, "key");
        synchronized (this.f112507iobyxmoadg) {
            autoCloseable = (AutoCloseable) this.f112510zoijcleaow.get(key);
        }
        return autoCloseable;
    }

    public final void wkgbmnqykc(AutoCloseable closeable) {
        zdlpuopuiu.btonecajqb(closeable, "closeable");
        if (this.f112509wkgbmnqykc) {
            lqeggnwhkg(closeable);
            return;
        }
        synchronized (this.f112507iobyxmoadg) {
            this.f112508ppxfxbqfkf.add(closeable);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }
}
