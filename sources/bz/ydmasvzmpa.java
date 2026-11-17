package bz;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ydmasvzmpa extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final oipsdeybqn f17678eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f17679gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f17680lqeggnwhkg;

    ydmasvzmpa(oipsdeybqn oipsdeybqnVar) {
        super(kc2.lqeggnwhkg.RdpConnectionDuration);
        this.f17678eablkybsjg = oipsdeybqnVar;
    }

    private Long cdpycssgdh(long j13) {
        return Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - j13));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public Integer lereixgezr() {
        if (!this.f17678eablkybsjg.lereixgezr().equals(oipsdeybqn.cdpycssgdh())) {
            this.f17679gxszxtbevo = false;
            this.f17680lqeggnwhkg = 0L;
        } else {
            if (this.f17679gxszxtbevo) {
                return Integer.valueOf(cdpycssgdh(this.f17680lqeggnwhkg).intValue());
            }
            this.f17679gxszxtbevo = true;
            this.f17680lqeggnwhkg = System.currentTimeMillis();
        }
        return 0;
    }
}
