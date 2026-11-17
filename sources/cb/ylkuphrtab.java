package cb;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ylkuphrtab extends ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f19505iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f19509iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f19508zoijcleaow = new iobyxmoadg("TINK");

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final iobyxmoadg f19506ppxfxbqfkf = new iobyxmoadg("CRUNCHY");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final iobyxmoadg f19507wkgbmnqykc = new iobyxmoadg("NO_PREFIX");

        private iobyxmoadg(String str) {
            this.f19509iobyxmoadg = str;
        }

        public String toString() {
            return this.f19509iobyxmoadg;
        }
    }

    private ylkuphrtab(iobyxmoadg iobyxmoadgVar) {
        this.f19505iobyxmoadg = iobyxmoadgVar;
    }

    public static ylkuphrtab iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
        return new ylkuphrtab(iobyxmoadgVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ylkuphrtab) && ((ylkuphrtab) obj).zoijcleaow() == zoijcleaow();
    }

    public int hashCode() {
        return Objects.hashCode(this.f19505iobyxmoadg);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f19505iobyxmoadg + ")";
    }

    public iobyxmoadg zoijcleaow() {
        return this.f19505iobyxmoadg;
    }
}
