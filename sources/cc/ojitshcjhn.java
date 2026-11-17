package cc;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f19613iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f19615ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final bc.gxszxtbevo f19617zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f19616wkgbmnqykc = new iobyxmoadg(false);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final iobyxmoadg f19611eablkybsjg = new iobyxmoadg(true);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final btonecajqb f19612gxszxtbevo = new btonecajqb(UserVerificationMethods.USER_VERIFY_PATTERN);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final AtomicMarkableReference f19614lqeggnwhkg = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final AtomicMarkableReference f19618iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f19619ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AtomicReference f19621zoijcleaow = new AtomicReference(null);

        public iobyxmoadg(boolean z13) {
            this.f19619ppxfxbqfkf = z13;
            this.f19618iobyxmoadg = new AtomicMarkableReference(new wkgbmnqykc(64, z13 ? 8192 : UserVerificationMethods.USER_VERIFY_ALL), false);
        }

        private void eablkybsjg() throws Throwable {
            Map mapIobyxmoadg;
            synchronized (this) {
                try {
                    if (this.f19618iobyxmoadg.isMarked()) {
                        mapIobyxmoadg = ((wkgbmnqykc) this.f19618iobyxmoadg.getReference()).iobyxmoadg();
                        AtomicMarkableReference atomicMarkableReference = this.f19618iobyxmoadg;
                        atomicMarkableReference.set((wkgbmnqykc) atomicMarkableReference.getReference(), false);
                    } else {
                        mapIobyxmoadg = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (mapIobyxmoadg != null) {
                ojitshcjhn.this.f19613iobyxmoadg.vdvldrhtss(ojitshcjhn.this.f19615ppxfxbqfkf, mapIobyxmoadg, this.f19619ppxfxbqfkf);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ppxfxbqfkf() throws Throwable {
            this.f19621zoijcleaow.set(null);
            eablkybsjg();
        }

        private void wkgbmnqykc() {
            Runnable runnable = new Runnable() { // from class: cc.agtfadlqog
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f19564zdlpuopuiu.ppxfxbqfkf();
                }
            };
            if (mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f19621zoijcleaow, null, runnable)) {
                ojitshcjhn.this.f19617zoijcleaow.f15698zoijcleaow.gxszxtbevo(runnable);
            }
        }

        public boolean gxszxtbevo(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((wkgbmnqykc) this.f19618iobyxmoadg.getReference()).wkgbmnqykc(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f19618iobyxmoadg;
                    atomicMarkableReference.set((wkgbmnqykc) atomicMarkableReference.getReference(), true);
                    wkgbmnqykc();
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public Map zoijcleaow() {
            return ((wkgbmnqykc) this.f19618iobyxmoadg.getReference()).iobyxmoadg();
        }
    }

    public ojitshcjhn(String str, gc.lqeggnwhkg lqeggnwhkgVar, bc.gxszxtbevo gxszxtbevoVar) {
        this.f19615ppxfxbqfkf = str;
        this.f19613iobyxmoadg = new gxszxtbevo(lqeggnwhkgVar);
        this.f19617zoijcleaow = gxszxtbevoVar;
    }

    public static String agtfadlqog(String str, gc.lqeggnwhkg lqeggnwhkgVar) {
        return new gxszxtbevo(lqeggnwhkgVar).gtknphoqwx(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void draadjrbmk(List list) throws Throwable {
        this.f19613iobyxmoadg.oxmwwwfdhm(this.f19615ppxfxbqfkf, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gtknphoqwx(String str, Map map, List list) throws Throwable {
        if (btonecajqb() != null) {
            this.f19613iobyxmoadg.kcexrzcfyt(str, btonecajqb());
        }
        if (!map.isEmpty()) {
            this.f19613iobyxmoadg.rgvfuqvkyq(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        this.f19613iobyxmoadg.oxmwwwfdhm(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ojitshcjhn() throws Throwable {
        boolean z13;
        String strBtonecajqb;
        synchronized (this.f19614lqeggnwhkg) {
            try {
                z13 = false;
                if (this.f19614lqeggnwhkg.isMarked()) {
                    strBtonecajqb = btonecajqb();
                    this.f19614lqeggnwhkg.set(strBtonecajqb, false);
                    z13 = true;
                } else {
                    strBtonecajqb = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z13) {
            this.f19613iobyxmoadg.kcexrzcfyt(this.f19615ppxfxbqfkf, strBtonecajqb);
        }
    }

    public static ojitshcjhn wflxmlrfwp(String str, gc.lqeggnwhkg lqeggnwhkgVar, bc.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2 = new gxszxtbevo(lqeggnwhkgVar);
        ojitshcjhn ojitshcjhnVar = new ojitshcjhn(str, lqeggnwhkgVar, gxszxtbevoVar);
        ((wkgbmnqykc) ojitshcjhnVar.f19616wkgbmnqykc.f19618iobyxmoadg.getReference()).eablkybsjg(gxszxtbevoVar2.dxjokdxxww(str, false));
        ((wkgbmnqykc) ojitshcjhnVar.f19611eablkybsjg.f19618iobyxmoadg.getReference()).eablkybsjg(gxszxtbevoVar2.dxjokdxxww(str, true));
        ojitshcjhnVar.f19614lqeggnwhkg.set(gxszxtbevoVar2.gtknphoqwx(str), false);
        ojitshcjhnVar.f19612gxszxtbevo.ppxfxbqfkf(gxszxtbevoVar2.btonecajqb(str));
        return ojitshcjhnVar;
    }

    public String btonecajqb() {
        return (String) this.f19614lqeggnwhkg.getReference();
    }

    public List dxjokdxxww() {
        return this.f19612gxszxtbevo.iobyxmoadg();
    }

    public void kcexrzcfyt(String str) {
        String strPpxfxbqfkf = wkgbmnqykc.ppxfxbqfkf(str, UserVerificationMethods.USER_VERIFY_ALL);
        synchronized (this.f19614lqeggnwhkg) {
            try {
                if (ac.btonecajqb.esjtqupxsv(strPpxfxbqfkf, (String) this.f19614lqeggnwhkg.getReference())) {
                    return;
                }
                this.f19614lqeggnwhkg.set(strPpxfxbqfkf, true);
                this.f19617zoijcleaow.f15698zoijcleaow.gxszxtbevo(new Runnable() { // from class: cc.draadjrbmk
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f19567zdlpuopuiu.ojitshcjhn();
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Map lqeggnwhkg() {
        return this.f19616wkgbmnqykc.zoijcleaow();
    }

    public Map nufgyqmvbu() {
        return this.f19611eablkybsjg.zoijcleaow();
    }

    public void oxmwwwfdhm(final String str) {
        synchronized (this.f19615ppxfxbqfkf) {
            this.f19615ppxfxbqfkf = str;
            final Map mapZoijcleaow = this.f19616wkgbmnqykc.zoijcleaow();
            final List listZoijcleaow = this.f19612gxszxtbevo.zoijcleaow();
            this.f19617zoijcleaow.f15698zoijcleaow.gxszxtbevo(new Runnable() { // from class: cc.gtknphoqwx
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f19575zdlpuopuiu.gtknphoqwx(str, mapZoijcleaow, listZoijcleaow);
                }
            });
        }
    }

    public boolean rgvfuqvkyq(String str, String str2) {
        return this.f19616wkgbmnqykc.gxszxtbevo(str, str2);
    }

    public boolean vdvldrhtss(String str, String str2) {
        return this.f19611eablkybsjg.gxszxtbevo(str, str2);
    }

    public boolean zdlpuopuiu(List list) {
        synchronized (this.f19612gxszxtbevo) {
            try {
                if (!this.f19612gxszxtbevo.ppxfxbqfkf(list)) {
                    return false;
                }
                final List listZoijcleaow = this.f19612gxszxtbevo.zoijcleaow();
                this.f19617zoijcleaow.f15698zoijcleaow.gxszxtbevo(new Runnable() { // from class: cc.wflxmlrfwp
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f19623zdlpuopuiu.draadjrbmk(listZoijcleaow);
                    }
                });
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
