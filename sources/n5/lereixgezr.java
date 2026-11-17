package n5;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lereixgezr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f68813iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gg.gtknphoqwx f68814ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AtomicBoolean f68815zoijcleaow;

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {
        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final u5.gtknphoqwx invoke() {
            return lereixgezr.this.wkgbmnqykc();
        }
    }

    public lereixgezr(oxmwwwfdhm database) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(database, "database");
        this.f68813iobyxmoadg = database;
        this.f68815zoijcleaow = new AtomicBoolean(false);
        this.f68814ppxfxbqfkf = gg.draadjrbmk.zoijcleaow(new iobyxmoadg());
    }

    private final u5.gtknphoqwx gxszxtbevo() {
        return (u5.gtknphoqwx) this.f68814ppxfxbqfkf.getValue();
    }

    private final u5.gtknphoqwx lqeggnwhkg(boolean z13) {
        return z13 ? gxszxtbevo() : wkgbmnqykc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u5.gtknphoqwx wkgbmnqykc() {
        return this.f68813iobyxmoadg.rgvfuqvkyq(eablkybsjg());
    }

    protected abstract String eablkybsjg();

    public void nufgyqmvbu(u5.gtknphoqwx statement) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(statement, "statement");
        if (statement == gxszxtbevo()) {
            this.f68815zoijcleaow.set(false);
        }
    }

    protected void ppxfxbqfkf() {
        this.f68813iobyxmoadg.wflxmlrfwp();
    }

    public u5.gtknphoqwx zoijcleaow() {
        ppxfxbqfkf();
        return lqeggnwhkg(this.f68815zoijcleaow.compareAndSet(false, true));
    }
}
