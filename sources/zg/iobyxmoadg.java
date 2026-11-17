package zg;

import hg.yggfygwlhe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg implements Iterable, ug.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final C3309iobyxmoadg f129927iwizpuwonk = new C3309iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f129928jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final char f129929yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final char f129930zdlpuopuiu;

    /* JADX INFO: renamed from: zg.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3309iobyxmoadg {
        public /* synthetic */ C3309iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C3309iobyxmoadg() {
        }
    }

    public iobyxmoadg(char c13, char c14, int i13) {
        if (i13 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i13 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f129930zdlpuopuiu = c13;
        this.f129929yggfygwlhe = (char) og.ppxfxbqfkf.zoijcleaow(c13, c14, i13);
        this.f129928jyumaefscl = i13;
    }

    public final char eablkybsjg() {
        return this.f129929yggfygwlhe;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public yggfygwlhe iterator() {
        return new zoijcleaow(this.f129930zdlpuopuiu, this.f129929yggfygwlhe, this.f129928jyumaefscl);
    }

    public final char wkgbmnqykc() {
        return this.f129930zdlpuopuiu;
    }
}
