package x8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.agtfadlqog;
import com.bumptech.glide.wflxmlrfwp;
import g9.draadjrbmk;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import l8.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
class lqeggnwhkg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private gtknphoqwx f121444agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private iobyxmoadg f121445btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private iobyxmoadg f121446draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private wflxmlrfwp f121447dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final o8.wkgbmnqykc f121448eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f121449gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f121450gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final h8.iobyxmoadg f121451iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f121452lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f121453nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private iobyxmoadg f121454ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f121455oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f121456ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f121457rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f121458vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private Bitmap f121459wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final agtfadlqog f121460wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Handler f121461zoijcleaow;

    static class iobyxmoadg extends d9.ppxfxbqfkf {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final int f121462cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final long f121463esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final Handler f121464iwizpuwonk;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private Bitmap f121465lereixgezr;

        iobyxmoadg(Handler handler, int i13, long j13) {
            this.f121464iwizpuwonk = handler;
            this.f121462cqumvgiudr = i13;
            this.f121463esjtqupxsv = j13;
        }

        @Override // d9.dxjokdxxww
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Bitmap bitmap, e9.wkgbmnqykc wkgbmnqykcVar) {
            this.f121465lereixgezr = bitmap;
            this.f121464iwizpuwonk.sendMessageAtTime(this.f121464iwizpuwonk.obtainMessage(1, this), this.f121463esjtqupxsv);
        }

        @Override // d9.dxjokdxxww
        public void lqeggnwhkg(Drawable drawable) {
            this.f121465lereixgezr = null;
        }

        Bitmap wkgbmnqykc() {
            return this.f121465lereixgezr;
        }
    }

    private class ppxfxbqfkf implements Handler.Callback {
        ppxfxbqfkf() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i13 = message.what;
            if (i13 == 1) {
                lqeggnwhkg.this.wflxmlrfwp((iobyxmoadg) message.obj);
                return true;
            }
            if (i13 != 2) {
                return false;
            }
            lqeggnwhkg.this.f121460wkgbmnqykc.draadjrbmk((iobyxmoadg) message.obj);
            return false;
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg();
    }

    lqeggnwhkg(com.bumptech.glide.zoijcleaow zoijcleaowVar, h8.iobyxmoadg iobyxmoadgVar, int i13, int i14, gtknphoqwx gtknphoqwxVar, Bitmap bitmap) {
        this(zoijcleaowVar.gxszxtbevo(), com.bumptech.glide.zoijcleaow.zdlpuopuiu(zoijcleaowVar.nufgyqmvbu()), iobyxmoadgVar, null, dxjokdxxww(com.bumptech.glide.zoijcleaow.zdlpuopuiu(zoijcleaowVar.nufgyqmvbu()), i13, i14), gtknphoqwxVar, bitmap);
    }

    private void agtfadlqog() {
        Bitmap bitmap = this.f121459wflxmlrfwp;
        if (bitmap != null) {
            this.f121448eablkybsjg.ppxfxbqfkf(bitmap);
            this.f121459wflxmlrfwp = null;
        }
    }

    private void draadjrbmk() {
        if (!this.f121450gxszxtbevo || this.f121452lqeggnwhkg) {
            return;
        }
        if (this.f121453nufgyqmvbu) {
            g9.gtknphoqwx.zoijcleaow(this.f121454ojitshcjhn == null, "Pending target must be null when starting from the first frame");
            this.f121451iobyxmoadg.gxszxtbevo();
            this.f121453nufgyqmvbu = false;
        }
        iobyxmoadg iobyxmoadgVar = this.f121454ojitshcjhn;
        if (iobyxmoadgVar != null) {
            this.f121454ojitshcjhn = null;
            wflxmlrfwp(iobyxmoadgVar);
            return;
        }
        this.f121452lqeggnwhkg = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f121451iobyxmoadg.eablkybsjg());
        this.f121451iobyxmoadg.zoijcleaow();
        this.f121446draadjrbmk = new iobyxmoadg(this.f121461zoijcleaow, this.f121451iobyxmoadg.lqeggnwhkg(), jUptimeMillis);
        this.f121447dxjokdxxww.iobyxmoadg(c9.gxszxtbevo.lrnfpwlwnk(lqeggnwhkg())).ipoelvxyzq(this.f121451iobyxmoadg).skhdrjzrfn(this.f121446draadjrbmk);
    }

    private static wflxmlrfwp dxjokdxxww(agtfadlqog agtfadlqogVar, int i13, int i14) {
        return agtfadlqogVar.eablkybsjg().iobyxmoadg(((c9.gxszxtbevo) ((c9.gxszxtbevo) c9.gxszxtbevo.weqkydbzbr(n8.iobyxmoadg.f69350zoijcleaow).opjhrmiecq(true)).yfnezrywwk(true)).jlmebxxoox(i13, i14));
    }

    private static l8.eablkybsjg lqeggnwhkg() {
        return new f9.wkgbmnqykc(Double.valueOf(Math.random()));
    }

    private void rgvfuqvkyq() {
        if (this.f121450gxszxtbevo) {
            return;
        }
        this.f121450gxszxtbevo = true;
        this.f121449gtknphoqwx = false;
        draadjrbmk();
    }

    private void vdvldrhtss() {
        this.f121450gxszxtbevo = false;
    }

    int btonecajqb() {
        return this.f121451iobyxmoadg.nufgyqmvbu() + this.f121457rgvfuqvkyq;
    }

    Bitmap eablkybsjg() {
        return this.f121459wflxmlrfwp;
    }

    int gtknphoqwx() {
        return this.f121458vdvldrhtss;
    }

    int gxszxtbevo() {
        return this.f121451iobyxmoadg.ppxfxbqfkf();
    }

    void iobyxmoadg() {
        this.f121456ppxfxbqfkf.clear();
        agtfadlqog();
        vdvldrhtss();
        iobyxmoadg iobyxmoadgVar = this.f121445btonecajqb;
        if (iobyxmoadgVar != null) {
            this.f121460wkgbmnqykc.draadjrbmk(iobyxmoadgVar);
            this.f121445btonecajqb = null;
        }
        iobyxmoadg iobyxmoadgVar2 = this.f121446draadjrbmk;
        if (iobyxmoadgVar2 != null) {
            this.f121460wkgbmnqykc.draadjrbmk(iobyxmoadgVar2);
            this.f121446draadjrbmk = null;
        }
        iobyxmoadg iobyxmoadgVar3 = this.f121454ojitshcjhn;
        if (iobyxmoadgVar3 != null) {
            this.f121460wkgbmnqykc.draadjrbmk(iobyxmoadgVar3);
            this.f121454ojitshcjhn = null;
        }
        this.f121451iobyxmoadg.clear();
        this.f121449gtknphoqwx = true;
    }

    void kcexrzcfyt(zoijcleaow zoijcleaowVar) {
        this.f121456ppxfxbqfkf.remove(zoijcleaowVar);
        if (this.f121456ppxfxbqfkf.isEmpty()) {
            vdvldrhtss();
        }
    }

    int nufgyqmvbu() {
        return this.f121455oxmwwwfdhm;
    }

    void ojitshcjhn(gtknphoqwx gtknphoqwxVar, Bitmap bitmap) {
        this.f121444agtfadlqog = (gtknphoqwx) g9.gtknphoqwx.eablkybsjg(gtknphoqwxVar);
        this.f121459wflxmlrfwp = (Bitmap) g9.gtknphoqwx.eablkybsjg(bitmap);
        this.f121447dxjokdxxww = this.f121447dxjokdxxww.iobyxmoadg(new c9.gxszxtbevo().oipsdeybqn(gtknphoqwxVar));
        this.f121457rgvfuqvkyq = draadjrbmk.nufgyqmvbu(bitmap);
        this.f121458vdvldrhtss = bitmap.getWidth();
        this.f121455oxmwwwfdhm = bitmap.getHeight();
    }

    void oxmwwwfdhm(zoijcleaow zoijcleaowVar) {
        if (this.f121449gtknphoqwx) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f121456ppxfxbqfkf.contains(zoijcleaowVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f121456ppxfxbqfkf.isEmpty();
        this.f121456ppxfxbqfkf.add(zoijcleaowVar);
        if (zIsEmpty) {
            rgvfuqvkyq();
        }
    }

    Bitmap ppxfxbqfkf() {
        iobyxmoadg iobyxmoadgVar = this.f121445btonecajqb;
        return iobyxmoadgVar != null ? iobyxmoadgVar.wkgbmnqykc() : this.f121459wflxmlrfwp;
    }

    void wflxmlrfwp(iobyxmoadg iobyxmoadgVar) {
        this.f121452lqeggnwhkg = false;
        if (this.f121449gtknphoqwx) {
            this.f121461zoijcleaow.obtainMessage(2, iobyxmoadgVar).sendToTarget();
            return;
        }
        if (!this.f121450gxszxtbevo) {
            if (this.f121453nufgyqmvbu) {
                this.f121461zoijcleaow.obtainMessage(2, iobyxmoadgVar).sendToTarget();
                return;
            } else {
                this.f121454ojitshcjhn = iobyxmoadgVar;
                return;
            }
        }
        if (iobyxmoadgVar.wkgbmnqykc() != null) {
            agtfadlqog();
            iobyxmoadg iobyxmoadgVar2 = this.f121445btonecajqb;
            this.f121445btonecajqb = iobyxmoadgVar;
            for (int size = this.f121456ppxfxbqfkf.size() - 1; size >= 0; size--) {
                ((zoijcleaow) this.f121456ppxfxbqfkf.get(size)).iobyxmoadg();
            }
            if (iobyxmoadgVar2 != null) {
                this.f121461zoijcleaow.obtainMessage(2, iobyxmoadgVar2).sendToTarget();
            }
        }
        draadjrbmk();
    }

    int wkgbmnqykc() {
        iobyxmoadg iobyxmoadgVar = this.f121445btonecajqb;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.f121462cqumvgiudr;
        }
        return -1;
    }

    ByteBuffer zoijcleaow() {
        return this.f121451iobyxmoadg.getData().asReadOnlyBuffer();
    }

    lqeggnwhkg(o8.wkgbmnqykc wkgbmnqykcVar, agtfadlqog agtfadlqogVar, h8.iobyxmoadg iobyxmoadgVar, Handler handler, wflxmlrfwp wflxmlrfwpVar, gtknphoqwx gtknphoqwxVar, Bitmap bitmap) {
        this.f121456ppxfxbqfkf = new ArrayList();
        this.f121460wkgbmnqykc = agtfadlqogVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new ppxfxbqfkf()) : handler;
        this.f121448eablkybsjg = wkgbmnqykcVar;
        this.f121461zoijcleaow = handler;
        this.f121447dxjokdxxww = wflxmlrfwpVar;
        this.f121451iobyxmoadg = iobyxmoadgVar;
        ojitshcjhn(gtknphoqwxVar, bitmap);
    }
}
