package j0;

/* JADX INFO: loaded from: classes.dex */
public final class jpowsppfya {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f50262ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final jpowsppfya f50263wkgbmnqykc = new jpowsppfya();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f50264iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f50265zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final jpowsppfya iobyxmoadg() {
            return jpowsppfya.f50263wkgbmnqykc;
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ jpowsppfya(int i13, boolean z13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(i13, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpowsppfya)) {
            return false;
        }
        jpowsppfya jpowsppfyaVar = (jpowsppfya) obj;
        return this.f50264iobyxmoadg == jpowsppfyaVar.f50264iobyxmoadg && ojitshcjhn.lqeggnwhkg(this.f50265zoijcleaow, jpowsppfyaVar.f50265zoijcleaow);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f50264iobyxmoadg) * 31) + ojitshcjhn.nufgyqmvbu(this.f50265zoijcleaow);
    }

    public final boolean ppxfxbqfkf() {
        return this.f50264iobyxmoadg;
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f50264iobyxmoadg + ", emojiSupportMatch=" + ((Object) ojitshcjhn.dxjokdxxww(this.f50265zoijcleaow)) + ')';
    }

    public final jpowsppfya wkgbmnqykc(jpowsppfya jpowsppfyaVar) {
        return jpowsppfyaVar == null ? this : jpowsppfyaVar;
    }

    public final int zoijcleaow() {
        return this.f50265zoijcleaow;
    }

    public jpowsppfya(boolean z13) {
        this.f50264iobyxmoadg = z13;
        this.f50265zoijcleaow = ojitshcjhn.f50305zoijcleaow.zoijcleaow();
    }

    private jpowsppfya(int i13, boolean z13) {
        this.f50264iobyxmoadg = z13;
        this.f50265zoijcleaow = i13;
    }

    public jpowsppfya() {
        this(ojitshcjhn.f50305zoijcleaow.zoijcleaow(), false, null);
    }
}
