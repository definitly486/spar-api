package zu;

/* JADX INFO: loaded from: classes4.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f131365ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f131366iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f131367zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public rgvfuqvkyq(float f13, float f14) {
        this.f131366iobyxmoadg = f13;
        this.f131367zoijcleaow = f14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgvfuqvkyq)) {
            return false;
        }
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        return Float.compare(this.f131366iobyxmoadg, rgvfuqvkyqVar.f131366iobyxmoadg) == 0 && Float.compare(this.f131367zoijcleaow, rgvfuqvkyqVar.f131367zoijcleaow) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f131366iobyxmoadg) * 31) + Float.hashCode(this.f131367zoijcleaow);
    }

    public final float iobyxmoadg() {
        return this.f131367zoijcleaow;
    }

    public String toString() {
        return "YandexMapKitComposeZoomPreference(minValue=" + this.f131366iobyxmoadg + ", maxValue=" + this.f131367zoijcleaow + ")";
    }

    public final float zoijcleaow() {
        return this.f131366iobyxmoadg;
    }
}
