package tk;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.zdlpuopuiu;
import mk.rgvfuqvkyq;
import mk.wflxmlrfwp;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww implements Closeable {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final iobyxmoadg f110760lereixgezr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final Logger f110761pmvmpeiblj = Logger.getLogger(wkgbmnqykc.class.getName());

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f110762cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ppxfxbqfkf.zoijcleaow f110763esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f110764iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final bl.ppxfxbqfkf f110765jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final boolean f110766yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final bl.wkgbmnqykc f110767zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public dxjokdxxww(bl.wkgbmnqykc sink, boolean z13) {
        zdlpuopuiu.btonecajqb(sink, "sink");
        this.f110767zdlpuopuiu = sink;
        this.f110766yggfygwlhe = z13;
        bl.ppxfxbqfkf ppxfxbqfkfVar = new bl.ppxfxbqfkf();
        this.f110765jyumaefscl = ppxfxbqfkfVar;
        this.f110764iwizpuwonk = 16384;
        this.f110763esjtqupxsv = new ppxfxbqfkf.zoijcleaow(0, false, ppxfxbqfkfVar, 3, null);
    }

    private final void jyumaefscl(int i13, long j13) {
        while (j13 > 0) {
            long jMin = Math.min(this.f110764iwizpuwonk, j13);
            j13 -= jMin;
            dxjokdxxww(i13, (int) jMin, 9, j13 == 0 ? 4 : 0);
            this.f110767zdlpuopuiu.zeieaojujs(this.f110765jyumaefscl, jMin);
        }
    }

    public final int agtfadlqog() {
        return this.f110764iwizpuwonk;
    }

    public final synchronized void btonecajqb(int i13, tk.iobyxmoadg errorCode, byte[] debugData) {
        try {
            zdlpuopuiu.btonecajqb(errorCode, "errorCode");
            zdlpuopuiu.btonecajqb(debugData, "debugData");
            if (this.f110762cqumvgiudr) {
                throw new IOException("closed");
            }
            if (errorCode.wkgbmnqykc() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            dxjokdxxww(0, debugData.length + 8, 7, 0);
            this.f110767zdlpuopuiu.hcddaimhww(i13);
            this.f110767zdlpuopuiu.hcddaimhww(errorCode.wkgbmnqykc());
            if (!(debugData.length == 0)) {
                this.f110767zdlpuopuiu.skhdrjzrfn(debugData);
            }
            this.f110767zdlpuopuiu.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f110762cqumvgiudr = true;
        this.f110767zdlpuopuiu.close();
    }

    public final synchronized void draadjrbmk(boolean z13, int i13, List headerBlock) {
        zdlpuopuiu.btonecajqb(headerBlock, "headerBlock");
        if (this.f110762cqumvgiudr) {
            throw new IOException("closed");
        }
        this.f110763esjtqupxsv.lqeggnwhkg(headerBlock);
        long jDsvhmnatus = this.f110765jyumaefscl.dsvhmnatus();
        long jMin = Math.min(this.f110764iwizpuwonk, jDsvhmnatus);
        int i14 = jDsvhmnatus == jMin ? 4 : 0;
        if (z13) {
            i14 |= 1;
        }
        dxjokdxxww(i13, (int) jMin, 1, i14);
        this.f110767zdlpuopuiu.zeieaojujs(this.f110765jyumaefscl, jMin);
        if (jDsvhmnatus > jMin) {
            jyumaefscl(i13, jDsvhmnatus - jMin);
        }
    }

    public final void dxjokdxxww(int i13, int i14, int i15, int i16) {
        if (i15 != 8) {
            Logger logger = f110761pmvmpeiblj;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(wkgbmnqykc.f110937iobyxmoadg.ppxfxbqfkf(false, i13, i14, i15, i16));
            }
        }
        if (i14 > this.f110764iwizpuwonk) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f110764iwizpuwonk + ": " + i14).toString());
        }
        if ((Integer.MIN_VALUE & i13) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i13).toString());
        }
        wflxmlrfwp.ylkuphrtab(this.f110767zdlpuopuiu, i14);
        this.f110767zdlpuopuiu.o(i15 & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f110767zdlpuopuiu.o(i16 & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f110767zdlpuopuiu.hcddaimhww(i13 & Integer.MAX_VALUE);
    }

    public final synchronized void flush() {
        if (this.f110762cqumvgiudr) {
            throw new IOException("closed");
        }
        this.f110767zdlpuopuiu.flush();
    }

    public final synchronized void iobyxmoadg(draadjrbmk peerSettings) {
        try {
            zdlpuopuiu.btonecajqb(peerSettings, "peerSettings");
            if (this.f110762cqumvgiudr) {
                throw new IOException("closed");
            }
            this.f110764iwizpuwonk = peerSettings.eablkybsjg(this.f110764iwizpuwonk);
            if (peerSettings.zoijcleaow() != -1) {
                this.f110763esjtqupxsv.eablkybsjg(peerSettings.zoijcleaow());
            }
            dxjokdxxww(0, 0, 4, 1);
            this.f110767zdlpuopuiu.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void kcexrzcfyt(draadjrbmk settings) {
        int i13;
        try {
            zdlpuopuiu.btonecajqb(settings, "settings");
            if (this.f110762cqumvgiudr) {
                throw new IOException("closed");
            }
            int i14 = 0;
            dxjokdxxww(0, settings.dxjokdxxww() * 6, 4, 0);
            while (i14 < 10) {
                if (settings.gxszxtbevo(i14)) {
                    if (i14 != 4) {
                        i13 = i14 != 7 ? i14 : 4;
                    } else {
                        i13 = 3;
                    }
                    this.f110767zdlpuopuiu.j(i13);
                    this.f110767zdlpuopuiu.hcddaimhww(settings.iobyxmoadg(i14));
                }
                i14++;
            }
            this.f110767zdlpuopuiu.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void lqeggnwhkg(boolean z13, int i13, bl.ppxfxbqfkf ppxfxbqfkfVar, int i14) {
        if (this.f110762cqumvgiudr) {
            throw new IOException("closed");
        }
        nufgyqmvbu(i13, z13 ? 1 : 0, ppxfxbqfkfVar, i14);
    }

    public final void nufgyqmvbu(int i13, int i14, bl.ppxfxbqfkf ppxfxbqfkfVar, int i15) {
        dxjokdxxww(i13, i15, 0, i14);
        if (i15 > 0) {
            bl.wkgbmnqykc wkgbmnqykcVar = this.f110767zdlpuopuiu;
            zdlpuopuiu.lqeggnwhkg(ppxfxbqfkfVar);
            wkgbmnqykcVar.zeieaojujs(ppxfxbqfkfVar, i15);
        }
    }

    public final synchronized void ojitshcjhn(boolean z13, int i13, int i14) {
        if (this.f110762cqumvgiudr) {
            throw new IOException("closed");
        }
        dxjokdxxww(0, 8, 6, z13 ? 1 : 0);
        this.f110767zdlpuopuiu.hcddaimhww(i13);
        this.f110767zdlpuopuiu.hcddaimhww(i14);
        this.f110767zdlpuopuiu.flush();
    }

    public final synchronized void rgvfuqvkyq(int i13, int i14, List requestHeaders) {
        zdlpuopuiu.btonecajqb(requestHeaders, "requestHeaders");
        if (this.f110762cqumvgiudr) {
            throw new IOException("closed");
        }
        this.f110763esjtqupxsv.lqeggnwhkg(requestHeaders);
        long jDsvhmnatus = this.f110765jyumaefscl.dsvhmnatus();
        int iMin = (int) Math.min(((long) this.f110764iwizpuwonk) - 4, jDsvhmnatus);
        long j13 = iMin;
        dxjokdxxww(i13, iMin + 4, 5, jDsvhmnatus == j13 ? 4 : 0);
        this.f110767zdlpuopuiu.hcddaimhww(i14 & Integer.MAX_VALUE);
        this.f110767zdlpuopuiu.zeieaojujs(this.f110765jyumaefscl, j13);
        if (jDsvhmnatus > j13) {
            jyumaefscl(i13, jDsvhmnatus - j13);
        }
    }

    public final synchronized void vdvldrhtss(int i13, tk.iobyxmoadg errorCode) {
        zdlpuopuiu.btonecajqb(errorCode, "errorCode");
        if (this.f110762cqumvgiudr) {
            throw new IOException("closed");
        }
        if (errorCode.wkgbmnqykc() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        dxjokdxxww(i13, 4, 3, 0);
        this.f110767zdlpuopuiu.hcddaimhww(errorCode.wkgbmnqykc());
        this.f110767zdlpuopuiu.flush();
    }

    public final synchronized void wkgbmnqykc() {
        try {
            if (this.f110762cqumvgiudr) {
                throw new IOException("closed");
            }
            if (this.f110766yggfygwlhe) {
                Logger logger = f110761pmvmpeiblj;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(rgvfuqvkyq.dxjokdxxww(">> CONNECTION " + wkgbmnqykc.f110940zoijcleaow.kcexrzcfyt(), new Object[0]));
                }
                this.f110767zdlpuopuiu.t(wkgbmnqykc.f110940zoijcleaow);
                this.f110767zdlpuopuiu.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zdlpuopuiu(int i13, long j13) {
        try {
            if (this.f110762cqumvgiudr) {
                throw new IOException("closed");
            }
            if (j13 == 0 || j13 > 2147483647L) {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j13).toString());
            }
            Logger logger = f110761pmvmpeiblj;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(wkgbmnqykc.f110937iobyxmoadg.wkgbmnqykc(false, i13, 4, j13));
            }
            dxjokdxxww(i13, 4, 8, 0);
            this.f110767zdlpuopuiu.hcddaimhww((int) j13);
            this.f110767zdlpuopuiu.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
