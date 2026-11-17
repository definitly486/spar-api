package e0;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final HashMap f30117iobyxmoadg = new HashMap();

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final m.wkgbmnqykc f30118iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f30119zoijcleaow;

        public iobyxmoadg(m.wkgbmnqykc wkgbmnqykcVar, int i13) {
            this.f30118iobyxmoadg = wkgbmnqykcVar;
            this.f30119zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f30118iobyxmoadg, iobyxmoadgVar.f30118iobyxmoadg) && this.f30119zoijcleaow == iobyxmoadgVar.f30119zoijcleaow;
        }

        public int hashCode() {
            return (this.f30118iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f30119zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f30119zoijcleaow;
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f30118iobyxmoadg + ", configFlags=" + this.f30119zoijcleaow + ')';
        }

        public final m.wkgbmnqykc zoijcleaow() {
            return this.f30118iobyxmoadg;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Resources.Theme f30120iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f30121zoijcleaow;

        public zoijcleaow(Resources.Theme theme, int i13) {
            this.f30120iobyxmoadg = theme;
            this.f30121zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f30120iobyxmoadg, zoijcleaowVar.f30120iobyxmoadg) && this.f30121zoijcleaow == zoijcleaowVar.f30121zoijcleaow;
        }

        public int hashCode() {
            return (this.f30120iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f30121zoijcleaow);
        }

        public String toString() {
            return "Key(theme=" + this.f30120iobyxmoadg + ", id=" + this.f30121zoijcleaow + ')';
        }
    }

    public final void iobyxmoadg() {
        this.f30117iobyxmoadg.clear();
    }

    public final void ppxfxbqfkf(int i13) {
        Iterator it = this.f30117iobyxmoadg.entrySet().iterator();
        while (it.hasNext()) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (iobyxmoadgVar == null || Configuration.needNewResources(i13, iobyxmoadgVar.iobyxmoadg())) {
                it.remove();
            }
        }
    }

    public final void wkgbmnqykc(zoijcleaow zoijcleaowVar, iobyxmoadg iobyxmoadgVar) {
        this.f30117iobyxmoadg.put(zoijcleaowVar, new WeakReference(iobyxmoadgVar));
    }

    public final iobyxmoadg zoijcleaow(zoijcleaow zoijcleaowVar) {
        WeakReference weakReference = (WeakReference) this.f30117iobyxmoadg.get(zoijcleaowVar);
        if (weakReference != null) {
            return (iobyxmoadg) weakReference.get();
        }
        return null;
    }
}
