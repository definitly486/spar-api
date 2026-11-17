package o8;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class btonecajqb implements wkgbmnqykc {

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final Bitmap.Config f72281gtknphoqwx = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f72282btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f72283dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f72284eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f72285gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f72286iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f72287lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f72288nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f72289ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f72290wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Set f72291zoijcleaow;

    private interface iobyxmoadg {
        void iobyxmoadg(Bitmap bitmap);

        void zoijcleaow(Bitmap bitmap);
    }

    private static final class zoijcleaow implements iobyxmoadg {
        zoijcleaow() {
        }

        @Override // o8.btonecajqb.iobyxmoadg
        public void iobyxmoadg(Bitmap bitmap) {
        }

        @Override // o8.btonecajqb.iobyxmoadg
        public void zoijcleaow(Bitmap bitmap) {
        }
    }

    btonecajqb(long j13, gtknphoqwx gtknphoqwxVar, Set set) {
        this.f72289ppxfxbqfkf = j13;
        this.f72284eablkybsjg = j13;
        this.f72286iobyxmoadg = gtknphoqwxVar;
        this.f72291zoijcleaow = set;
        this.f72290wkgbmnqykc = new zoijcleaow();
    }

    private void btonecajqb() {
        vdvldrhtss(this.f72284eablkybsjg);
    }

    private static gtknphoqwx draadjrbmk() {
        return new wflxmlrfwp();
    }

    private void dxjokdxxww() {
        Log.v("LruBitmapPool", "Hits=" + this.f72287lqeggnwhkg + ", misses=" + this.f72288nufgyqmvbu + ", puts=" + this.f72283dxjokdxxww + ", evictions=" + this.f72282btonecajqb + ", currentSize=" + this.f72285gxszxtbevo + ", maxSize=" + this.f72284eablkybsjg + "\nStrategy=" + this.f72286iobyxmoadg);
    }

    private static Set gtknphoqwx() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        return Collections.unmodifiableSet(hashSet);
    }

    private static void gxszxtbevo(Bitmap.Config config) {
        if (config != Bitmap.Config.HARDWARE) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    private static Bitmap lqeggnwhkg(int i13, int i14, Bitmap.Config config) {
        if (config == null) {
            config = f72281gtknphoqwx;
        }
        return Bitmap.createBitmap(i13, i14, config);
    }

    private void nufgyqmvbu() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            dxjokdxxww();
        }
    }

    private static void ojitshcjhn(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void rgvfuqvkyq(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        ojitshcjhn(bitmap);
    }

    private synchronized void vdvldrhtss(long j13) {
        while (this.f72285gxszxtbevo > j13) {
            try {
                Bitmap bitmapRemoveLast = this.f72286iobyxmoadg.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        dxjokdxxww();
                    }
                    this.f72285gxszxtbevo = 0L;
                    return;
                }
                this.f72290wkgbmnqykc.iobyxmoadg(bitmapRemoveLast);
                this.f72285gxszxtbevo -= (long) this.f72286iobyxmoadg.eablkybsjg(bitmapRemoveLast);
                this.f72282btonecajqb++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f72286iobyxmoadg.iobyxmoadg(bitmapRemoveLast));
                }
                nufgyqmvbu();
                bitmapRemoveLast.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private synchronized Bitmap wflxmlrfwp(int i13, int i14, Bitmap.Config config) {
        Bitmap bitmapWkgbmnqykc;
        try {
            gxszxtbevo(config);
            bitmapWkgbmnqykc = this.f72286iobyxmoadg.wkgbmnqykc(i13, i14, config != null ? config : f72281gtknphoqwx);
            if (bitmapWkgbmnqykc == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f72286iobyxmoadg.zoijcleaow(i13, i14, config));
                }
                this.f72288nufgyqmvbu++;
            } else {
                this.f72287lqeggnwhkg++;
                this.f72285gxszxtbevo -= (long) this.f72286iobyxmoadg.eablkybsjg(bitmapWkgbmnqykc);
                this.f72290wkgbmnqykc.iobyxmoadg(bitmapWkgbmnqykc);
                rgvfuqvkyq(bitmapWkgbmnqykc);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f72286iobyxmoadg.zoijcleaow(i13, i14, config));
            }
            nufgyqmvbu();
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapWkgbmnqykc;
    }

    public long agtfadlqog() {
        return this.f72284eablkybsjg;
    }

    @Override // o8.wkgbmnqykc
    public Bitmap eablkybsjg(int i13, int i14, Bitmap.Config config) {
        Bitmap bitmapWflxmlrfwp = wflxmlrfwp(i13, i14, config);
        return bitmapWflxmlrfwp == null ? lqeggnwhkg(i13, i14, config) : bitmapWflxmlrfwp;
    }

    @Override // o8.wkgbmnqykc
    public void iobyxmoadg(int i13) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i13);
        }
        if (i13 >= 40 || i13 >= 20) {
            zoijcleaow();
        } else if (i13 >= 20 || i13 == 15) {
            vdvldrhtss(agtfadlqog() / 2);
        }
    }

    @Override // o8.wkgbmnqykc
    public synchronized void ppxfxbqfkf(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f72286iobyxmoadg.eablkybsjg(bitmap) <= this.f72284eablkybsjg && this.f72291zoijcleaow.contains(bitmap.getConfig())) {
                int iEablkybsjg = this.f72286iobyxmoadg.eablkybsjg(bitmap);
                this.f72286iobyxmoadg.ppxfxbqfkf(bitmap);
                this.f72290wkgbmnqykc.zoijcleaow(bitmap);
                this.f72283dxjokdxxww++;
                this.f72285gxszxtbevo += (long) iEablkybsjg;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f72286iobyxmoadg.iobyxmoadg(bitmap));
                }
                nufgyqmvbu();
                btonecajqb();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f72286iobyxmoadg.iobyxmoadg(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f72291zoijcleaow.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // o8.wkgbmnqykc
    public Bitmap wkgbmnqykc(int i13, int i14, Bitmap.Config config) {
        Bitmap bitmapWflxmlrfwp = wflxmlrfwp(i13, i14, config);
        if (bitmapWflxmlrfwp == null) {
            return lqeggnwhkg(i13, i14, config);
        }
        bitmapWflxmlrfwp.eraseColor(0);
        return bitmapWflxmlrfwp;
    }

    @Override // o8.wkgbmnqykc
    public void zoijcleaow() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        vdvldrhtss(0L);
    }

    public btonecajqb(long j13) {
        this(j13, draadjrbmk(), gtknphoqwx());
    }
}
