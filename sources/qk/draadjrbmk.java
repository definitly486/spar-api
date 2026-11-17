package qk;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk implements agtfadlqog.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dxjokdxxww f78960iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f78961zoijcleaow;

    public draadjrbmk(dxjokdxxww connection) {
        zdlpuopuiu.btonecajqb(connection, "connection");
        this.f78960iobyxmoadg = connection;
        this.f78961zoijcleaow = true;
    }

    public Void btonecajqb() {
        throw new IllegalStateException("unexpected retry");
    }

    public final dxjokdxxww dxjokdxxww() {
        return this.f78960iobyxmoadg;
    }

    public Void eablkybsjg() {
        throw new IllegalStateException("already connected");
    }

    public Void gxszxtbevo() {
        throw new IllegalStateException("already connected");
    }

    @Override // qk.agtfadlqog.zoijcleaow
    public dxjokdxxww iobyxmoadg() {
        return this.f78960iobyxmoadg;
    }

    @Override // qk.agtfadlqog.zoijcleaow
    public /* bridge */ /* synthetic */ agtfadlqog.zoijcleaow lqeggnwhkg() {
        return (agtfadlqog.zoijcleaow) btonecajqb();
    }

    @Override // qk.agtfadlqog.zoijcleaow
    public /* bridge */ /* synthetic */ agtfadlqog.iobyxmoadg nufgyqmvbu() {
        return (agtfadlqog.iobyxmoadg) eablkybsjg();
    }

    @Override // qk.agtfadlqog.zoijcleaow
    public boolean ppxfxbqfkf() {
        return this.f78961zoijcleaow;
    }

    @Override // qk.agtfadlqog.zoijcleaow
    public /* bridge */ /* synthetic */ agtfadlqog.iobyxmoadg wkgbmnqykc() {
        return (agtfadlqog.iobyxmoadg) gxszxtbevo();
    }

    @Override // qk.agtfadlqog.zoijcleaow
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }
}
