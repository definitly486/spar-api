package ee0;

import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements gtknphoqwx {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object f31207yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final tg.iobyxmoadg f31208zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final iobyxmoadg f31206jyumaefscl = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final int f31205iwizpuwonk = 8;

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
        this.f31208zdlpuopuiu = initializer;
    }

    @Override // gg.gtknphoqwx
    public Object getValue() {
        if (this.f31207yggfygwlhe == null) {
            this.f31207yggfygwlhe = this.f31208zdlpuopuiu.invoke();
        }
        return this.f31207yggfygwlhe;
    }

    public final void iobyxmoadg() {
        this.f31207yggfygwlhe = null;
    }

    @Override // gg.gtknphoqwx
    public boolean isInitialized() {
        return this.f31207yggfygwlhe != null;
    }
}
