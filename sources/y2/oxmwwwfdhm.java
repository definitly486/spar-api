package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class oxmwwwfdhm {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f123576dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ArrayDeque f123577eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ArrayDeque f123578gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dxjokdxxww f123579iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Object f123580lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f123581nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f123582ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final CopyOnWriteArraySet f123583wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn f123584zoijcleaow;

    public interface iobyxmoadg {
        void invoke(Object obj);
    }

    private static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final Object f123585iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f123586ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f123587wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private v2.rgvfuqvkyq.zoijcleaow f123588zoijcleaow = new v2.rgvfuqvkyq.zoijcleaow();

        public ppxfxbqfkf(Object obj) {
            this.f123585iobyxmoadg = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ppxfxbqfkf.class != obj.getClass()) {
                return false;
            }
            return this.f123585iobyxmoadg.equals(((ppxfxbqfkf) obj).f123585iobyxmoadg);
        }

        public int hashCode() {
            return this.f123585iobyxmoadg.hashCode();
        }

        public void iobyxmoadg(int i13, iobyxmoadg iobyxmoadgVar) {
            if (this.f123587wkgbmnqykc) {
                return;
            }
            if (i13 != -1) {
                this.f123588zoijcleaow.iobyxmoadg(i13);
            }
            this.f123586ppxfxbqfkf = true;
            iobyxmoadgVar.invoke(this.f123585iobyxmoadg);
        }

        public void ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
            this.f123587wkgbmnqykc = true;
            if (this.f123586ppxfxbqfkf) {
                this.f123586ppxfxbqfkf = false;
                zoijcleaowVar.iobyxmoadg(this.f123585iobyxmoadg, this.f123588zoijcleaow.eablkybsjg());
            }
        }

        public void zoijcleaow(zoijcleaow zoijcleaowVar) {
            if (this.f123587wkgbmnqykc || !this.f123586ppxfxbqfkf) {
                return;
            }
            v2.rgvfuqvkyq rgvfuqvkyqVarEablkybsjg = this.f123588zoijcleaow.eablkybsjg();
            this.f123588zoijcleaow = new v2.rgvfuqvkyq.zoijcleaow();
            this.f123586ppxfxbqfkf = false;
            zoijcleaowVar.iobyxmoadg(this.f123585iobyxmoadg, rgvfuqvkyqVarEablkybsjg);
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg(Object obj, v2.rgvfuqvkyq rgvfuqvkyqVar);
    }

    public oxmwwwfdhm(Looper looper, dxjokdxxww dxjokdxxwwVar, zoijcleaow zoijcleaowVar) {
        this(new CopyOnWriteArraySet(), looper, dxjokdxxwwVar, zoijcleaowVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean lqeggnwhkg(Message message) {
        Iterator it = this.f123583wkgbmnqykc.iterator();
        while (it.hasNext()) {
            ((ppxfxbqfkf) it.next()).zoijcleaow(this.f123582ppxfxbqfkf);
            if (this.f123584zoijcleaow.zoijcleaow(1)) {
                break;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void nufgyqmvbu(CopyOnWriteArraySet copyOnWriteArraySet, int i13, iobyxmoadg iobyxmoadgVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((ppxfxbqfkf) it.next()).iobyxmoadg(i13, iobyxmoadgVar);
        }
    }

    private void wflxmlrfwp() {
        if (this.f123576dxjokdxxww) {
            y2.iobyxmoadg.lqeggnwhkg(Thread.currentThread() == this.f123584zoijcleaow.getLooper().getThread());
        }
    }

    public void btonecajqb() {
        wflxmlrfwp();
        synchronized (this.f123580lqeggnwhkg) {
            this.f123581nufgyqmvbu = true;
        }
        Iterator it = this.f123583wkgbmnqykc.iterator();
        while (it.hasNext()) {
            ((ppxfxbqfkf) it.next()).ppxfxbqfkf(this.f123582ppxfxbqfkf);
        }
        this.f123583wkgbmnqykc.clear();
    }

    public void draadjrbmk(int i13, iobyxmoadg iobyxmoadgVar) {
        dxjokdxxww(i13, iobyxmoadgVar);
        gxszxtbevo();
    }

    public void dxjokdxxww(final int i13, final iobyxmoadg iobyxmoadgVar) {
        wflxmlrfwp();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f123583wkgbmnqykc);
        this.f123578gxszxtbevo.add(new Runnable() { // from class: y2.vdvldrhtss
            @Override // java.lang.Runnable
            public final void run() {
                oxmwwwfdhm.nufgyqmvbu(copyOnWriteArraySet, i13, iobyxmoadgVar);
            }
        });
    }

    public oxmwwwfdhm eablkybsjg(Looper looper, zoijcleaow zoijcleaowVar) {
        return wkgbmnqykc(looper, this.f123579iobyxmoadg, zoijcleaowVar);
    }

    public void gtknphoqwx(Object obj) {
        wflxmlrfwp();
        for (ppxfxbqfkf ppxfxbqfkfVar : this.f123583wkgbmnqykc) {
            if (ppxfxbqfkfVar.f123585iobyxmoadg.equals(obj)) {
                ppxfxbqfkfVar.ppxfxbqfkf(this.f123582ppxfxbqfkf);
                this.f123583wkgbmnqykc.remove(ppxfxbqfkfVar);
            }
        }
    }

    public void gxszxtbevo() {
        wflxmlrfwp();
        if (this.f123578gxszxtbevo.isEmpty()) {
            return;
        }
        if (!this.f123584zoijcleaow.zoijcleaow(1)) {
            ojitshcjhn ojitshcjhnVar = this.f123584zoijcleaow;
            ojitshcjhnVar.dxjokdxxww(ojitshcjhnVar.iobyxmoadg(1));
        }
        boolean zIsEmpty = this.f123577eablkybsjg.isEmpty();
        this.f123577eablkybsjg.addAll(this.f123578gxszxtbevo);
        this.f123578gxszxtbevo.clear();
        if (zIsEmpty) {
            while (!this.f123577eablkybsjg.isEmpty()) {
                ((Runnable) this.f123577eablkybsjg.peekFirst()).run();
                this.f123577eablkybsjg.removeFirst();
            }
        }
    }

    public void ppxfxbqfkf(Object obj) {
        y2.iobyxmoadg.eablkybsjg(obj);
        synchronized (this.f123580lqeggnwhkg) {
            try {
                if (this.f123581nufgyqmvbu) {
                    return;
                }
                this.f123583wkgbmnqykc.add(new ppxfxbqfkf(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public oxmwwwfdhm wkgbmnqykc(Looper looper, dxjokdxxww dxjokdxxwwVar, zoijcleaow zoijcleaowVar) {
        return new oxmwwwfdhm(this.f123583wkgbmnqykc, looper, dxjokdxxwwVar, zoijcleaowVar, this.f123576dxjokdxxww);
    }

    private oxmwwwfdhm(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, dxjokdxxww dxjokdxxwwVar, zoijcleaow zoijcleaowVar, boolean z13) {
        this.f123579iobyxmoadg = dxjokdxxwwVar;
        this.f123583wkgbmnqykc = copyOnWriteArraySet;
        this.f123582ppxfxbqfkf = zoijcleaowVar;
        this.f123580lqeggnwhkg = new Object();
        this.f123577eablkybsjg = new ArrayDeque();
        this.f123578gxszxtbevo = new ArrayDeque();
        this.f123584zoijcleaow = dxjokdxxwwVar.iobyxmoadg(looper, new Handler.Callback() { // from class: y2.rgvfuqvkyq
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f123594zdlpuopuiu.lqeggnwhkg(message);
            }
        });
        this.f123576dxjokdxxww = z13;
    }
}
