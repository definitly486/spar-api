package tt0;

/* JADX INFO: loaded from: classes5.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f111520ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f111521iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f111522zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public rgvfuqvkyq(float f13, float f14) {
        this.f111521iobyxmoadg = f13;
        this.f111522zoijcleaow = f14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgvfuqvkyq)) {
            return false;
        }
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        return Float.compare(this.f111521iobyxmoadg, rgvfuqvkyqVar.f111521iobyxmoadg) == 0 && Float.compare(this.f111522zoijcleaow, rgvfuqvkyqVar.f111522zoijcleaow) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f111521iobyxmoadg) * 31) + Float.hashCode(this.f111522zoijcleaow);
    }

    public final float iobyxmoadg() {
        return this.f111522zoijcleaow;
    }

    public String toString() {
        return "YandexMapKitComposeZoomPreference(minValue=" + this.f111521iobyxmoadg + ", maxValue=" + this.f111522zoijcleaow + ")";
    }

    public final float zoijcleaow() {
        return this.f111521iobyxmoadg;
    }
}
