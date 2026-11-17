package androidx.media3.datasource.cache;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class CacheDataSink implements b3.wkgbmnqykc {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private lqeggnwhkg f9888btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f9889dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f9890eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private File f9891gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Cache f9892iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private OutputStream f9893lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f9894nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f9895ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private b3.lqeggnwhkg f9896wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f9897zoijcleaow;

    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    public static final class iobyxmoadg implements b3.wkgbmnqykc.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Cache f9898iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private long f9900zoijcleaow = 5242880;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f9899ppxfxbqfkf = 20480;

        @Override // b3.wkgbmnqykc.iobyxmoadg
        public b3.wkgbmnqykc iobyxmoadg() {
            return new CacheDataSink((Cache) y2.iobyxmoadg.eablkybsjg(this.f9898iobyxmoadg), this.f9900zoijcleaow, this.f9899ppxfxbqfkf);
        }

        public iobyxmoadg zoijcleaow(Cache cache) {
            this.f9898iobyxmoadg = cache;
            return this;
        }
    }

    public CacheDataSink(Cache cache, long j13, int i13) {
        y2.iobyxmoadg.nufgyqmvbu(j13 > 0 || j13 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j13 != -1 && j13 < 2097152) {
            kcexrzcfyt.nufgyqmvbu("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f9892iobyxmoadg = (Cache) y2.iobyxmoadg.eablkybsjg(cache);
        this.f9897zoijcleaow = j13 == -1 ? Long.MAX_VALUE : j13;
        this.f9895ppxfxbqfkf = i13;
    }

    private void ppxfxbqfkf(b3.lqeggnwhkg lqeggnwhkgVar) {
        long j13 = lqeggnwhkgVar.f15059nufgyqmvbu;
        this.f9891gxszxtbevo = this.f9892iobyxmoadg.iobyxmoadg((String) stevsuqkhv.nufgyqmvbu(lqeggnwhkgVar.f15053dxjokdxxww), lqeggnwhkgVar.f15058lqeggnwhkg + this.f9889dxjokdxxww, j13 != -1 ? Math.min(j13 - this.f9889dxjokdxxww, this.f9890eablkybsjg) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f9891gxszxtbevo);
        if (this.f9895ppxfxbqfkf > 0) {
            lqeggnwhkg lqeggnwhkgVar2 = this.f9888btonecajqb;
            if (lqeggnwhkgVar2 == null) {
                this.f9888btonecajqb = new lqeggnwhkg(fileOutputStream, this.f9895ppxfxbqfkf);
            } else {
                lqeggnwhkgVar2.iobyxmoadg(fileOutputStream);
            }
            this.f9893lqeggnwhkg = this.f9888btonecajqb;
        } else {
            this.f9893lqeggnwhkg = fileOutputStream;
        }
        this.f9894nufgyqmvbu = 0L;
    }

    private void zoijcleaow() {
        OutputStream outputStream = this.f9893lqeggnwhkg;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            stevsuqkhv.draadjrbmk(this.f9893lqeggnwhkg);
            this.f9893lqeggnwhkg = null;
            File file = (File) stevsuqkhv.nufgyqmvbu(this.f9891gxszxtbevo);
            this.f9891gxszxtbevo = null;
            this.f9892iobyxmoadg.nufgyqmvbu(file, this.f9894nufgyqmvbu);
        } catch (Throwable th2) {
            stevsuqkhv.draadjrbmk(this.f9893lqeggnwhkg);
            this.f9893lqeggnwhkg = null;
            File file2 = (File) stevsuqkhv.nufgyqmvbu(this.f9891gxszxtbevo);
            this.f9891gxszxtbevo = null;
            file2.delete();
            throw th2;
        }
    }

    @Override // b3.wkgbmnqykc
    public void close() throws CacheDataSinkException {
        if (this.f9896wkgbmnqykc == null) {
            return;
        }
        try {
            zoijcleaow();
        } catch (IOException e13) {
            throw new CacheDataSinkException(e13);
        }
    }

    @Override // b3.wkgbmnqykc
    public void gtknphoqwx(byte[] bArr, int i13, int i14) throws CacheDataSinkException {
        b3.lqeggnwhkg lqeggnwhkgVar = this.f9896wkgbmnqykc;
        if (lqeggnwhkgVar == null) {
            return;
        }
        int i15 = 0;
        while (i15 < i14) {
            try {
                if (this.f9894nufgyqmvbu == this.f9890eablkybsjg) {
                    zoijcleaow();
                    ppxfxbqfkf(lqeggnwhkgVar);
                }
                int iMin = (int) Math.min(i14 - i15, this.f9890eablkybsjg - this.f9894nufgyqmvbu);
                ((OutputStream) stevsuqkhv.nufgyqmvbu(this.f9893lqeggnwhkg)).write(bArr, i13 + i15, iMin);
                i15 += iMin;
                long j13 = iMin;
                this.f9894nufgyqmvbu += j13;
                this.f9889dxjokdxxww += j13;
            } catch (IOException e13) {
                throw new CacheDataSinkException(e13);
            }
        }
    }

    @Override // b3.wkgbmnqykc
    public void iobyxmoadg(b3.lqeggnwhkg lqeggnwhkgVar) throws CacheDataSinkException {
        y2.iobyxmoadg.eablkybsjg(lqeggnwhkgVar.f15053dxjokdxxww);
        if (lqeggnwhkgVar.f15059nufgyqmvbu == -1 && lqeggnwhkgVar.wkgbmnqykc(2)) {
            this.f9896wkgbmnqykc = null;
            return;
        }
        this.f9896wkgbmnqykc = lqeggnwhkgVar;
        this.f9890eablkybsjg = lqeggnwhkgVar.wkgbmnqykc(4) ? this.f9897zoijcleaow : Long.MAX_VALUE;
        this.f9889dxjokdxxww = 0L;
        try {
            ppxfxbqfkf(lqeggnwhkgVar);
        } catch (IOException e13) {
            throw new CacheDataSinkException(e13);
        }
    }
}
