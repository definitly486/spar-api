package o8;

import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Queue f72307iobyxmoadg = g9.draadjrbmk.gxszxtbevo(20);

    ppxfxbqfkf() {
    }

    abstract draadjrbmk iobyxmoadg();

    public void ppxfxbqfkf(draadjrbmk draadjrbmkVar) {
        if (this.f72307iobyxmoadg.size() < 20) {
            this.f72307iobyxmoadg.offer(draadjrbmkVar);
        }
    }

    draadjrbmk zoijcleaow() {
        draadjrbmk draadjrbmkVar = (draadjrbmk) this.f72307iobyxmoadg.poll();
        return draadjrbmkVar == null ? iobyxmoadg() : draadjrbmkVar;
    }
}
