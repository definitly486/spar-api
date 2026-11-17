package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ojitshcjhn {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static volatile ojitshcjhn f23979ppxfxbqfkf = null;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    static final ojitshcjhn f23980wkgbmnqykc = new ojitshcjhn(true);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static boolean f23981zoijcleaow = true;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f23982iobyxmoadg = Collections.emptyMap();

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Object f23983iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f23984zoijcleaow;

        iobyxmoadg(Object obj, int i13) {
            this.f23983iobyxmoadg = obj;
            this.f23984zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f23983iobyxmoadg == iobyxmoadgVar.f23983iobyxmoadg && this.f23984zoijcleaow == iobyxmoadgVar.f23984zoijcleaow;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f23983iobyxmoadg) * 65535) + this.f23984zoijcleaow;
        }
    }

    ojitshcjhn(boolean z13) {
    }

    public static ojitshcjhn zoijcleaow() {
        ojitshcjhn ojitshcjhnVarIobyxmoadg = f23979ppxfxbqfkf;
        if (ojitshcjhnVarIobyxmoadg == null) {
            synchronized (ojitshcjhn.class) {
                try {
                    ojitshcjhnVarIobyxmoadg = f23979ppxfxbqfkf;
                    if (ojitshcjhnVarIobyxmoadg == null) {
                        ojitshcjhnVarIobyxmoadg = f23981zoijcleaow ? agtfadlqog.iobyxmoadg() : f23980wkgbmnqykc;
                        f23979ppxfxbqfkf = ojitshcjhnVarIobyxmoadg;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ojitshcjhnVarIobyxmoadg;
    }

    public iwizpuwonk.ppxfxbqfkf iobyxmoadg(hkdspvbjdz hkdspvbjdzVar, int i13) {
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(this.f23982iobyxmoadg.get(new iobyxmoadg(hkdspvbjdzVar, i13)));
        return null;
    }
}
