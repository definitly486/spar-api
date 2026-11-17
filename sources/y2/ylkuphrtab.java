package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ylkuphrtab implements ojitshcjhn {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final List f123629zoijcleaow = new ArrayList(50);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Handler f123630iobyxmoadg;

    private static final class zoijcleaow implements ojitshcjhn.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Message f123631iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private ylkuphrtab f123632zoijcleaow;

        private zoijcleaow() {
        }

        private void zoijcleaow() {
            this.f123631iobyxmoadg = null;
            this.f123632zoijcleaow = null;
            ylkuphrtab.agtfadlqog(this);
        }

        @Override // y2.ojitshcjhn.iobyxmoadg
        public void iobyxmoadg() {
            ((Message) y2.iobyxmoadg.eablkybsjg(this.f123631iobyxmoadg)).sendToTarget();
            zoijcleaow();
        }

        public boolean ppxfxbqfkf(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) y2.iobyxmoadg.eablkybsjg(this.f123631iobyxmoadg));
            zoijcleaow();
            return zSendMessageAtFrontOfQueue;
        }

        public zoijcleaow wkgbmnqykc(Message message, ylkuphrtab ylkuphrtabVar) {
            this.f123631iobyxmoadg = message;
            this.f123632zoijcleaow = ylkuphrtabVar;
            return this;
        }
    }

    public ylkuphrtab(Handler handler) {
        this.f123630iobyxmoadg = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void agtfadlqog(zoijcleaow zoijcleaowVar) {
        List list = f123629zoijcleaow;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zoijcleaowVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static zoijcleaow wflxmlrfwp() {
        zoijcleaow zoijcleaowVar;
        List list = f123629zoijcleaow;
        synchronized (list) {
            try {
                zoijcleaowVar = list.isEmpty() ? new zoijcleaow() : (zoijcleaow) list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zoijcleaowVar;
    }

    @Override // y2.ojitshcjhn
    public boolean btonecajqb(int i13, long j13) {
        return this.f123630iobyxmoadg.sendEmptyMessageAtTime(i13, j13);
    }

    @Override // y2.ojitshcjhn
    public boolean dxjokdxxww(ojitshcjhn.iobyxmoadg iobyxmoadgVar) {
        return ((zoijcleaow) iobyxmoadgVar).ppxfxbqfkf(this.f123630iobyxmoadg);
    }

    @Override // y2.ojitshcjhn
    public void eablkybsjg(Object obj) {
        this.f123630iobyxmoadg.removeCallbacksAndMessages(obj);
    }

    @Override // y2.ojitshcjhn
    public Looper getLooper() {
        return this.f123630iobyxmoadg.getLooper();
    }

    @Override // y2.ojitshcjhn
    public void gtknphoqwx(int i13) {
        y2.iobyxmoadg.iobyxmoadg(i13 != 0);
        this.f123630iobyxmoadg.removeMessages(i13);
    }

    @Override // y2.ojitshcjhn
    public ojitshcjhn.iobyxmoadg gxszxtbevo(int i13, int i14, int i15) {
        return wflxmlrfwp().wkgbmnqykc(this.f123630iobyxmoadg.obtainMessage(i13, i14, i15), this);
    }

    @Override // y2.ojitshcjhn
    public ojitshcjhn.iobyxmoadg iobyxmoadg(int i13) {
        return wflxmlrfwp().wkgbmnqykc(this.f123630iobyxmoadg.obtainMessage(i13), this);
    }

    @Override // y2.ojitshcjhn
    public boolean lqeggnwhkg(Runnable runnable) {
        return this.f123630iobyxmoadg.post(runnable);
    }

    @Override // y2.ojitshcjhn
    public boolean nufgyqmvbu(int i13) {
        return this.f123630iobyxmoadg.sendEmptyMessage(i13);
    }

    @Override // y2.ojitshcjhn
    public ojitshcjhn.iobyxmoadg ppxfxbqfkf(int i13, int i14, int i15, Object obj) {
        return wflxmlrfwp().wkgbmnqykc(this.f123630iobyxmoadg.obtainMessage(i13, i14, i15, obj), this);
    }

    @Override // y2.ojitshcjhn
    public ojitshcjhn.iobyxmoadg wkgbmnqykc(int i13, Object obj) {
        return wflxmlrfwp().wkgbmnqykc(this.f123630iobyxmoadg.obtainMessage(i13, obj), this);
    }

    @Override // y2.ojitshcjhn
    public boolean zoijcleaow(int i13) {
        y2.iobyxmoadg.iobyxmoadg(i13 != 0);
        return this.f123630iobyxmoadg.hasMessages(i13);
    }
}
