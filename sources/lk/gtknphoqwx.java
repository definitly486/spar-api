package lk;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final qk.btonecajqb f63050iobyxmoadg;

    public gtknphoqwx(qk.btonecajqb delegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f63050iobyxmoadg = delegate;
    }

    public final qk.btonecajqb iobyxmoadg() {
        return this.f63050iobyxmoadg;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(int i13, long j13, TimeUnit timeUnit) {
        this(new qk.btonecajqb(pk.wkgbmnqykc.f76870gtknphoqwx, i13, j13, timeUnit));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(timeUnit, "timeUnit");
    }

    public gtknphoqwx() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
