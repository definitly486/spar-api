package wj;

import pj.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
final class dxjokdxxww extends nufgyqmvbu {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final Runnable f119931jyumaefscl;

    public dxjokdxxww(Runnable runnable, long j13, boolean z13) {
        super(j13, z13);
        this.f119931jyumaefscl = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f119931jyumaefscl.run();
    }

    public String toString() {
        return "Task[" + kegysxyocb.iobyxmoadg(this.f119931jyumaefscl) + '@' + kegysxyocb.zoijcleaow(this.f119931jyumaefscl) + ", " + this.f119969zdlpuopuiu + ", " + btonecajqb.ppxfxbqfkf(this.f119968yggfygwlhe) + ']';
    }
}
