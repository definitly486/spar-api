package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class draadjrbmk {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static volatile draadjrbmk f8627wkgbmnqykc = null;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static boolean f8628zoijcleaow = true;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f8629iobyxmoadg = Collections.emptyMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Class f8626ppxfxbqfkf = ppxfxbqfkf();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    static final draadjrbmk f8625eablkybsjg = new draadjrbmk(true);

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Object f8630iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f8631zoijcleaow;

        iobyxmoadg(Object obj, int i13) {
            this.f8630iobyxmoadg = obj;
            this.f8631zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f8630iobyxmoadg == iobyxmoadgVar.f8630iobyxmoadg && this.f8631zoijcleaow == iobyxmoadgVar.f8631zoijcleaow;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f8630iobyxmoadg) * 65535) + this.f8631zoijcleaow;
        }
    }

    draadjrbmk(boolean z13) {
    }

    static Class ppxfxbqfkf() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static draadjrbmk zoijcleaow() {
        draadjrbmk draadjrbmkVarIobyxmoadg = f8627wkgbmnqykc;
        if (draadjrbmkVarIobyxmoadg == null) {
            synchronized (draadjrbmk.class) {
                try {
                    draadjrbmkVarIobyxmoadg = f8627wkgbmnqykc;
                    if (draadjrbmkVarIobyxmoadg == null) {
                        draadjrbmkVarIobyxmoadg = f8628zoijcleaow ? gtknphoqwx.iobyxmoadg() : f8625eablkybsjg;
                        f8627wkgbmnqykc = draadjrbmkVarIobyxmoadg;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return draadjrbmkVarIobyxmoadg;
    }

    public kcexrzcfyt.ppxfxbqfkf iobyxmoadg(wwaezpbzkn wwaezpbzknVar, int i13) {
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(this.f8629iobyxmoadg.get(new iobyxmoadg(wwaezpbzknVar, i13)));
        return null;
    }
}
