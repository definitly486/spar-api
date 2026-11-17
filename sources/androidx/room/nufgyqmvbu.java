package androidx.room;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.gtknphoqwx;
import lg.btonecajqb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu implements btonecajqb.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final iobyxmoadg f13236jyumaefscl = new iobyxmoadg(null);

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final AtomicInteger f13237yggfygwlhe = new AtomicInteger(0);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lg.lqeggnwhkg f13238zdlpuopuiu;

    public static final class iobyxmoadg implements btonecajqb.ppxfxbqfkf {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public nufgyqmvbu(lg.lqeggnwhkg lqeggnwhkgVar) {
        this.f13238zdlpuopuiu = lqeggnwhkgVar;
    }

    public final void eablkybsjg() {
        if (this.f13237yggfygwlhe.decrementAndGet() < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }

    @Override // lg.btonecajqb
    public Object fold(Object obj, rgvfuqvkyq rgvfuqvkyqVar) {
        return btonecajqb.zoijcleaow.iobyxmoadg.iobyxmoadg(this, obj, rgvfuqvkyqVar);
    }

    @Override // lg.btonecajqb.zoijcleaow, lg.btonecajqb
    public btonecajqb.zoijcleaow get(btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return btonecajqb.zoijcleaow.iobyxmoadg.zoijcleaow(this, ppxfxbqfkfVar);
    }

    @Override // lg.btonecajqb.zoijcleaow
    public btonecajqb.ppxfxbqfkf getKey() {
        return f13236jyumaefscl;
    }

    @Override // lg.btonecajqb
    public btonecajqb minusKey(btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return btonecajqb.zoijcleaow.iobyxmoadg.ppxfxbqfkf(this, ppxfxbqfkfVar);
    }

    @Override // lg.btonecajqb
    public btonecajqb plus(btonecajqb btonecajqbVar) {
        return btonecajqb.zoijcleaow.iobyxmoadg.wkgbmnqykc(this, btonecajqbVar);
    }

    public final lg.lqeggnwhkg ppxfxbqfkf() {
        return this.f13238zdlpuopuiu;
    }

    public final void zoijcleaow() {
        this.f13237yggfygwlhe.incrementAndGet();
    }
}
