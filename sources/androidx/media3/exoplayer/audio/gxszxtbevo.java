package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.google.android.gms.location.DeviceOrientationRequest;

/* JADX INFO: loaded from: classes.dex */
final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f10221eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f10222gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f10223iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private long f10224ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f10225wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f10226zoijcleaow;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private long f10227eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f10228gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AudioTrack f10229iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private long f10230lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private long f10231ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private long f10232wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AudioTimestamp f10233zoijcleaow = new AudioTimestamp();

        public iobyxmoadg(AudioTrack audioTrack) {
            this.f10229iobyxmoadg = audioTrack;
        }

        public void iobyxmoadg() {
            this.f10228gxszxtbevo = true;
        }

        public long ppxfxbqfkf() {
            return this.f10233zoijcleaow.nanoTime / 1000;
        }

        public boolean wkgbmnqykc() {
            boolean timestamp = this.f10229iobyxmoadg.getTimestamp(this.f10233zoijcleaow);
            if (timestamp) {
                long j13 = this.f10233zoijcleaow.framePosition;
                long j14 = this.f10232wkgbmnqykc;
                if (j14 > j13) {
                    if (this.f10228gxszxtbevo) {
                        this.f10230lqeggnwhkg += j14;
                        this.f10228gxszxtbevo = false;
                    } else {
                        this.f10231ppxfxbqfkf++;
                    }
                }
                this.f10232wkgbmnqykc = j13;
                this.f10227eablkybsjg = j13 + this.f10230lqeggnwhkg + (this.f10231ppxfxbqfkf << 32);
            }
            return timestamp;
        }

        public long zoijcleaow() {
            return this.f10227eablkybsjg;
        }
    }

    public gxszxtbevo(AudioTrack audioTrack) {
        this.f10223iobyxmoadg = new iobyxmoadg(audioTrack);
        nufgyqmvbu();
    }

    private void dxjokdxxww(int i13) {
        this.f10226zoijcleaow = i13;
        if (i13 == 0) {
            this.f10221eablkybsjg = 0L;
            this.f10222gxszxtbevo = -1L;
            this.f10224ppxfxbqfkf = System.nanoTime() / 1000;
            this.f10225wkgbmnqykc = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
            return;
        }
        if (i13 == 1) {
            this.f10225wkgbmnqykc = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
            return;
        }
        if (i13 == 2 || i13 == 3) {
            this.f10225wkgbmnqykc = 10000000L;
        } else {
            if (i13 != 4) {
                throw new IllegalStateException();
            }
            this.f10225wkgbmnqykc = 500000L;
        }
    }

    public boolean eablkybsjg() {
        return this.f10226zoijcleaow == 2;
    }

    public boolean gxszxtbevo(long j13) {
        iobyxmoadg iobyxmoadgVar = this.f10223iobyxmoadg;
        if (iobyxmoadgVar == null || j13 - this.f10221eablkybsjg < this.f10225wkgbmnqykc) {
            return false;
        }
        this.f10221eablkybsjg = j13;
        boolean zWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        int i13 = this.f10226zoijcleaow;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zWkgbmnqykc) {
                        nufgyqmvbu();
                    }
                } else if (!zWkgbmnqykc) {
                    nufgyqmvbu();
                }
            } else if (!zWkgbmnqykc) {
                nufgyqmvbu();
            } else if (this.f10223iobyxmoadg.zoijcleaow() > this.f10222gxszxtbevo) {
                dxjokdxxww(2);
            }
        } else if (zWkgbmnqykc) {
            if (this.f10223iobyxmoadg.ppxfxbqfkf() < this.f10224ppxfxbqfkf) {
                return false;
            }
            this.f10222gxszxtbevo = this.f10223iobyxmoadg.zoijcleaow();
            dxjokdxxww(1);
        } else if (j13 - this.f10224ppxfxbqfkf > 500000) {
            dxjokdxxww(3);
        }
        return zWkgbmnqykc;
    }

    public void iobyxmoadg() {
        if (this.f10226zoijcleaow == 4) {
            nufgyqmvbu();
        }
    }

    public void lqeggnwhkg() {
        dxjokdxxww(4);
    }

    public void nufgyqmvbu() {
        if (this.f10223iobyxmoadg != null) {
            dxjokdxxww(0);
        }
    }

    public long ppxfxbqfkf() {
        iobyxmoadg iobyxmoadgVar = this.f10223iobyxmoadg;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.zoijcleaow();
        }
        return -1L;
    }

    public long wkgbmnqykc() {
        iobyxmoadg iobyxmoadgVar = this.f10223iobyxmoadg;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.ppxfxbqfkf();
        }
        return -9223372036854775807L;
    }

    public void zoijcleaow() {
        iobyxmoadg iobyxmoadgVar = this.f10223iobyxmoadg;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg();
        }
    }
}
