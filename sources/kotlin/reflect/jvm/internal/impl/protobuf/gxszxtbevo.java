package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class gxszxtbevo {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final gxszxtbevo f60066zoijcleaow = new gxszxtbevo(true);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f60067iobyxmoadg;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Object f60068iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f60069zoijcleaow;

        iobyxmoadg(Object obj, int i13) {
            this.f60068iobyxmoadg = obj;
            this.f60069zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f60068iobyxmoadg == iobyxmoadgVar.f60068iobyxmoadg && this.f60069zoijcleaow == iobyxmoadgVar.f60069zoijcleaow;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f60068iobyxmoadg) * 65535) + this.f60069zoijcleaow;
        }
    }

    gxszxtbevo() {
        this.f60067iobyxmoadg = new HashMap();
    }

    public static gxszxtbevo ppxfxbqfkf() {
        return f60066zoijcleaow;
    }

    public static gxszxtbevo wkgbmnqykc() {
        return new gxszxtbevo();
    }

    public final void iobyxmoadg(nufgyqmvbu.gxszxtbevo gxszxtbevoVar) {
        this.f60067iobyxmoadg.put(new iobyxmoadg(gxszxtbevoVar.zoijcleaow(), gxszxtbevoVar.wkgbmnqykc()), gxszxtbevoVar);
    }

    public nufgyqmvbu.gxszxtbevo zoijcleaow(agtfadlqog agtfadlqogVar, int i13) {
        return (nufgyqmvbu.gxszxtbevo) this.f60067iobyxmoadg.get(new iobyxmoadg(agtfadlqogVar, i13));
    }

    private gxszxtbevo(boolean z13) {
        this.f60067iobyxmoadg = Collections.emptyMap();
    }
}
