package cb;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class pmvmpeiblj extends ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f19477iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f19481iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f19480zoijcleaow = new iobyxmoadg("TINK");

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final iobyxmoadg f19478ppxfxbqfkf = new iobyxmoadg("CRUNCHY");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final iobyxmoadg f19479wkgbmnqykc = new iobyxmoadg("NO_PREFIX");

        private iobyxmoadg(String str) {
            this.f19481iobyxmoadg = str;
        }

        public String toString() {
            return this.f19481iobyxmoadg;
        }
    }

    private pmvmpeiblj(iobyxmoadg iobyxmoadgVar) {
        this.f19477iobyxmoadg = iobyxmoadgVar;
    }

    public static pmvmpeiblj iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
        return new pmvmpeiblj(iobyxmoadgVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof pmvmpeiblj) && ((pmvmpeiblj) obj).zoijcleaow() == zoijcleaow();
    }

    public int hashCode() {
        return Objects.hashCode(this.f19477iobyxmoadg);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f19477iobyxmoadg + ")";
    }

    public iobyxmoadg zoijcleaow() {
        return this.f19477iobyxmoadg;
    }
}
