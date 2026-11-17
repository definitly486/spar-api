package p3;

import android.os.Handler;
import b3.wflxmlrfwp;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface wkgbmnqykc {

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: p3.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1660iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final CopyOnWriteArrayList f75510iobyxmoadg = new CopyOnWriteArrayList();

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: p3.wkgbmnqykc$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static final class C1661iobyxmoadg {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                private final Handler f75511iobyxmoadg;

                /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
                private boolean f75512ppxfxbqfkf;

                /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
                private final iobyxmoadg f75513zoijcleaow;

                public C1661iobyxmoadg(Handler handler, iobyxmoadg iobyxmoadgVar) {
                    this.f75511iobyxmoadg = handler;
                    this.f75513zoijcleaow = iobyxmoadgVar;
                }

                public void wkgbmnqykc() {
                    this.f75512ppxfxbqfkf = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void wkgbmnqykc(C1661iobyxmoadg c1661iobyxmoadg, int i13, long j13, long j14) {
                c1661iobyxmoadg.f75513zoijcleaow.istkbnxepw(i13, j13, j14);
            }

            public void eablkybsjg(iobyxmoadg iobyxmoadgVar) {
                for (C1661iobyxmoadg c1661iobyxmoadg : this.f75510iobyxmoadg) {
                    if (c1661iobyxmoadg.f75513zoijcleaow == iobyxmoadgVar) {
                        c1661iobyxmoadg.wkgbmnqykc();
                        this.f75510iobyxmoadg.remove(c1661iobyxmoadg);
                    }
                }
            }

            public void ppxfxbqfkf(final int i13, final long j13, final long j14) {
                for (final C1661iobyxmoadg c1661iobyxmoadg : this.f75510iobyxmoadg) {
                    if (!c1661iobyxmoadg.f75512ppxfxbqfkf) {
                        c1661iobyxmoadg.f75511iobyxmoadg.post(new Runnable() { // from class: p3.ppxfxbqfkf
                            @Override // java.lang.Runnable
                            public final void run() {
                                wkgbmnqykc.iobyxmoadg.C1660iobyxmoadg.wkgbmnqykc(c1661iobyxmoadg, i13, j13, j14);
                            }
                        });
                    }
                }
            }

            public void zoijcleaow(Handler handler, iobyxmoadg iobyxmoadgVar) {
                y2.iobyxmoadg.eablkybsjg(handler);
                y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar);
                eablkybsjg(iobyxmoadgVar);
                this.f75510iobyxmoadg.add(new C1661iobyxmoadg(handler, iobyxmoadgVar));
            }
        }

        void istkbnxepw(int i13, long j13, long j14);
    }

    void eablkybsjg(Handler handler, iobyxmoadg iobyxmoadgVar);

    void gxszxtbevo(iobyxmoadg iobyxmoadgVar);

    wflxmlrfwp zoijcleaow();
}
