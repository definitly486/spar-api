package ac1;

import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc implements gtknphoqwx {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object f1544yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final tg.iobyxmoadg f1545zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final iobyxmoadg f1543jyumaefscl = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final int f1542iwizpuwonk = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final wkgbmnqykc iobyxmoadg(tg.iobyxmoadg value) {
            zdlpuopuiu.btonecajqb(value, "value");
            return new wkgbmnqykc(value);
        }

        private iobyxmoadg() {
        }
    }

    public wkgbmnqykc(tg.iobyxmoadg initializer) {
        zdlpuopuiu.btonecajqb(initializer, "initializer");
        this.f1545zdlpuopuiu = initializer;
    }

    @Override // gg.gtknphoqwx
    public Object getValue() {
        if (this.f1544yggfygwlhe == null) {
            this.f1544yggfygwlhe = this.f1545zdlpuopuiu.invoke();
        }
        return this.f1544yggfygwlhe;
    }

    public final void iobyxmoadg() {
        this.f1544yggfygwlhe = null;
    }

    @Override // gg.gtknphoqwx
    public boolean isInitialized() {
        return this.f1544yggfygwlhe != null;
    }
}
