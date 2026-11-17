package tk;

import bl.wwaezpbzkn;
import bl.ylkuphrtab;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.zdlpuopuiu;
import mk.rgvfuqvkyq;
import mk.wflxmlrfwp;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg implements Closeable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final iobyxmoadg f110875cqumvgiudr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final Logger f110876esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final tk.ppxfxbqfkf.iobyxmoadg f110877iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final zoijcleaow f110878jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final boolean f110879yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final bl.eablkybsjg f110880zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final Logger iobyxmoadg() {
            return lqeggnwhkg.f110876esjtqupxsv;
        }

        public final int zoijcleaow(int i13, int i14, int i15) throws IOException {
            if ((i14 & 8) != 0) {
                i13--;
            }
            if (i15 <= i13) {
                return i13 - i15;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i15 + " > remaining length " + i13);
        }

        private iobyxmoadg() {
        }
    }

    public interface ppxfxbqfkf {
        void agtfadlqog(int i13, tk.iobyxmoadg iobyxmoadgVar);

        void btonecajqb(int i13, tk.iobyxmoadg iobyxmoadgVar, bl.gxszxtbevo gxszxtbevoVar);

        void eablkybsjg(boolean z13, draadjrbmk draadjrbmkVar);

        void gtknphoqwx(boolean z13, int i13, int i14);

        void gxszxtbevo();

        void iobyxmoadg(boolean z13, int i13, int i14, List list);

        void lqeggnwhkg(boolean z13, int i13, bl.eablkybsjg eablkybsjgVar, int i14);

        void ppxfxbqfkf(int i13, int i14, List list);

        void wflxmlrfwp(int i13, int i14, int i15, boolean z13);

        void zoijcleaow(int i13, long j13);
    }

    public static final class zoijcleaow implements wwaezpbzkn {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private int f110881cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private int f110882esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f110883iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f110884jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f110885yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final bl.eablkybsjg f110886zdlpuopuiu;

        public zoijcleaow(bl.eablkybsjg source) {
            zdlpuopuiu.btonecajqb(source, "source");
            this.f110886zdlpuopuiu = source;
        }

        private final void wkgbmnqykc() throws IOException {
            int i13 = this.f110883iwizpuwonk;
            int iZynmafqrjb = wflxmlrfwp.zynmafqrjb(this.f110886zdlpuopuiu);
            this.f110881cqumvgiudr = iZynmafqrjb;
            this.f110885yggfygwlhe = iZynmafqrjb;
            int iZoijcleaow = wflxmlrfwp.zoijcleaow(this.f110886zdlpuopuiu.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            this.f110884jyumaefscl = wflxmlrfwp.zoijcleaow(this.f110886zdlpuopuiu.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            iobyxmoadg iobyxmoadgVar = lqeggnwhkg.f110875cqumvgiudr;
            if (iobyxmoadgVar.iobyxmoadg().isLoggable(Level.FINE)) {
                iobyxmoadgVar.iobyxmoadg().fine(wkgbmnqykc.f110937iobyxmoadg.ppxfxbqfkf(true, this.f110883iwizpuwonk, this.f110885yggfygwlhe, iZoijcleaow, this.f110884jyumaefscl));
            }
            int i14 = this.f110886zdlpuopuiu.readInt() & Integer.MAX_VALUE;
            this.f110883iwizpuwonk = i14;
            if (iZoijcleaow == 9) {
                if (i14 != i13) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iZoijcleaow + " != TYPE_CONTINUATION");
            }
        }

        public final void btonecajqb(int i13) {
            this.f110882esjtqupxsv = i13;
        }

        @Override // bl.wwaezpbzkn, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final void draadjrbmk(int i13) {
            this.f110883iwizpuwonk = i13;
        }

        public final void dxjokdxxww(int i13) {
            this.f110885yggfygwlhe = i13;
        }

        @Override // bl.wwaezpbzkn
        public long fmlbqenlif(bl.ppxfxbqfkf sink, long j13) throws IOException {
            zdlpuopuiu.btonecajqb(sink, "sink");
            while (true) {
                int i13 = this.f110881cqumvgiudr;
                if (i13 != 0) {
                    long jFmlbqenlif = this.f110886zdlpuopuiu.fmlbqenlif(sink, Math.min(j13, i13));
                    if (jFmlbqenlif == -1) {
                        return -1L;
                    }
                    this.f110881cqumvgiudr -= (int) jFmlbqenlif;
                    return jFmlbqenlif;
                }
                this.f110886zdlpuopuiu.wflxmlrfwp(this.f110882esjtqupxsv);
                this.f110882esjtqupxsv = 0;
                if ((this.f110884jyumaefscl & 4) != 0) {
                    return -1L;
                }
                wkgbmnqykc();
            }
        }

        public final int iobyxmoadg() {
            return this.f110881cqumvgiudr;
        }

        public final void lqeggnwhkg(int i13) {
            this.f110884jyumaefscl = i13;
        }

        public final void nufgyqmvbu(int i13) {
            this.f110881cqumvgiudr = i13;
        }

        @Override // bl.wwaezpbzkn
        public ylkuphrtab ppxfxbqfkf() {
            return this.f110886zdlpuopuiu.ppxfxbqfkf();
        }
    }

    static {
        Logger logger = Logger.getLogger(wkgbmnqykc.class.getName());
        zdlpuopuiu.dxjokdxxww(logger, "getLogger(Http2::class.java.name)");
        f110876esjtqupxsv = logger;
    }

    public lqeggnwhkg(bl.eablkybsjg source, boolean z13) {
        zdlpuopuiu.btonecajqb(source, "source");
        this.f110880zdlpuopuiu = source;
        this.f110879yggfygwlhe = z13;
        zoijcleaow zoijcleaowVar = new zoijcleaow(source);
        this.f110878jyumaefscl = zoijcleaowVar;
        this.f110877iwizpuwonk = new tk.ppxfxbqfkf.iobyxmoadg(zoijcleaowVar, 4096, 0, 4, null);
    }

    private final void agtfadlqog(ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14, int i15) throws IOException {
        if (i13 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i13);
        }
        if (i15 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        ppxfxbqfkfVar.gtknphoqwx((i14 & 1) != 0, this.f110880zdlpuopuiu.readInt(), this.f110880zdlpuopuiu.readInt());
    }

    private final List btonecajqb(int i13, int i14, int i15, int i16) throws IOException {
        this.f110878jyumaefscl.nufgyqmvbu(i13);
        zoijcleaow zoijcleaowVar = this.f110878jyumaefscl;
        zoijcleaowVar.dxjokdxxww(zoijcleaowVar.iobyxmoadg());
        this.f110878jyumaefscl.btonecajqb(i14);
        this.f110878jyumaefscl.lqeggnwhkg(i15);
        this.f110878jyumaefscl.draadjrbmk(i16);
        this.f110877iwizpuwonk.gtknphoqwx();
        return this.f110877iwizpuwonk.eablkybsjg();
    }

    private final void draadjrbmk(ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14, int i15) throws IOException {
        if (i15 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z13 = (i14 & 1) != 0;
        int iZoijcleaow = (i14 & 8) != 0 ? wflxmlrfwp.zoijcleaow(this.f110880zdlpuopuiu.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) : 0;
        if ((i14 & 32) != 0) {
            ojitshcjhn(ppxfxbqfkfVar, i15);
            i13 -= 5;
        }
        ppxfxbqfkfVar.iobyxmoadg(z13, i15, -1, btonecajqb(f110875cqumvgiudr.zoijcleaow(i13, i14, iZoijcleaow), iZoijcleaow, i14, i15));
    }

    private final void dxjokdxxww(ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14, int i15) throws IOException {
        if (i13 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i13);
        }
        if (i15 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i16 = this.f110880zdlpuopuiu.readInt();
        int i17 = this.f110880zdlpuopuiu.readInt();
        int i18 = i13 - 8;
        tk.iobyxmoadg iobyxmoadgVarIobyxmoadg = tk.iobyxmoadg.f110871yggfygwlhe.iobyxmoadg(i17);
        if (iobyxmoadgVarIobyxmoadg == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i17);
        }
        bl.gxszxtbevo gxszxtbevoVarD = bl.gxszxtbevo.f16673cqumvgiudr;
        if (i18 > 0) {
            gxszxtbevoVarD = this.f110880zdlpuopuiu.d(i18);
        }
        ppxfxbqfkfVar.btonecajqb(i16, iobyxmoadgVarIobyxmoadg, gxszxtbevoVarD);
    }

    private final void jyumaefscl(ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14, int i15) throws Exception {
        try {
            if (i13 != 4) {
                throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i13);
            }
            long jWkgbmnqykc = wflxmlrfwp.wkgbmnqykc(this.f110880zdlpuopuiu.readInt(), 2147483647L);
            if (jWkgbmnqykc == 0) {
                throw new IOException("windowSizeIncrement was 0");
            }
            Logger logger = f110876esjtqupxsv;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(wkgbmnqykc.f110937iobyxmoadg.wkgbmnqykc(true, i15, i13, jWkgbmnqykc));
            }
            ppxfxbqfkfVar.zoijcleaow(i15, jWkgbmnqykc);
        } catch (Exception e13) {
            f110876esjtqupxsv.fine(wkgbmnqykc.f110937iobyxmoadg.ppxfxbqfkf(true, i15, i13, 8, i14));
            throw e13;
        }
    }

    private final void kcexrzcfyt(ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14, int i15) throws IOException {
        if (i13 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i13 + " != 4");
        }
        if (i15 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i16 = this.f110880zdlpuopuiu.readInt();
        tk.iobyxmoadg iobyxmoadgVarIobyxmoadg = tk.iobyxmoadg.f110871yggfygwlhe.iobyxmoadg(i16);
        if (iobyxmoadgVarIobyxmoadg != null) {
            ppxfxbqfkfVar.agtfadlqog(i15, iobyxmoadgVarIobyxmoadg);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i16);
    }

    private final void nufgyqmvbu(ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14, int i15) throws IOException {
        if (i15 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z13 = (i14 & 1) != 0;
        if ((i14 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iZoijcleaow = (i14 & 8) != 0 ? wflxmlrfwp.zoijcleaow(this.f110880zdlpuopuiu.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) : 0;
        ppxfxbqfkfVar.lqeggnwhkg(z13, i15, this.f110880zdlpuopuiu, f110875cqumvgiudr.zoijcleaow(i13, i14, iZoijcleaow));
        this.f110880zdlpuopuiu.wflxmlrfwp(iZoijcleaow);
    }

    private final void ojitshcjhn(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        int i14 = this.f110880zdlpuopuiu.readInt();
        ppxfxbqfkfVar.wflxmlrfwp(i13, i14 & Integer.MAX_VALUE, wflxmlrfwp.zoijcleaow(this.f110880zdlpuopuiu.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) + 1, (Integer.MIN_VALUE & i14) != 0);
    }

    private final void rgvfuqvkyq(ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14, int i15) throws IOException {
        if (i13 == 5) {
            if (i15 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            ojitshcjhn(ppxfxbqfkfVar, i15);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i13 + " != 5");
        }
    }

    private final void vdvldrhtss(ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14, int i15) throws IOException {
        if (i15 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iZoijcleaow = (i14 & 8) != 0 ? wflxmlrfwp.zoijcleaow(this.f110880zdlpuopuiu.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) : 0;
        ppxfxbqfkfVar.ppxfxbqfkf(i15, this.f110880zdlpuopuiu.readInt() & Integer.MAX_VALUE, btonecajqb(f110875cqumvgiudr.zoijcleaow(i13 - 4, i14, iZoijcleaow), iZoijcleaow, i14, i15));
    }

    private final void zdlpuopuiu(ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14, int i15) throws IOException {
        if (i15 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i14 & 1) != 0) {
            if (i13 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            ppxfxbqfkfVar.gxszxtbevo();
            return;
        }
        if (i13 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i13);
        }
        draadjrbmk draadjrbmkVar = new draadjrbmk();
        zg.nufgyqmvbu nufgyqmvbuVarZdlpuopuiu = zg.gtknphoqwx.zdlpuopuiu(zg.gtknphoqwx.jyumaefscl(0, i13), 6);
        int iWkgbmnqykc = nufgyqmvbuVarZdlpuopuiu.wkgbmnqykc();
        int iEablkybsjg = nufgyqmvbuVarZdlpuopuiu.eablkybsjg();
        int iGxszxtbevo = nufgyqmvbuVarZdlpuopuiu.gxszxtbevo();
        if ((iGxszxtbevo > 0 && iWkgbmnqykc <= iEablkybsjg) || (iGxszxtbevo < 0 && iEablkybsjg <= iWkgbmnqykc)) {
            while (true) {
                int iPpxfxbqfkf = wflxmlrfwp.ppxfxbqfkf(this.f110880zdlpuopuiu.readShort(), 65535);
                int i16 = this.f110880zdlpuopuiu.readInt();
                if (iPpxfxbqfkf != 2) {
                    if (iPpxfxbqfkf == 3) {
                        iPpxfxbqfkf = 4;
                    } else if (iPpxfxbqfkf != 4) {
                        if (iPpxfxbqfkf == 5 && (i16 < 16384 || i16 > 16777215)) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i16);
                        }
                    } else {
                        if (i16 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iPpxfxbqfkf = 7;
                    }
                } else if (i16 != 0 && i16 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                draadjrbmkVar.nufgyqmvbu(iPpxfxbqfkf, i16);
                if (iWkgbmnqykc != iEablkybsjg) {
                    iWkgbmnqykc += iGxszxtbevo;
                }
            }
        }
        ppxfxbqfkfVar.eablkybsjg(false, draadjrbmkVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f110880zdlpuopuiu.close();
    }

    public final void lqeggnwhkg(ppxfxbqfkf handler) throws IOException {
        zdlpuopuiu.btonecajqb(handler, "handler");
        if (this.f110879yggfygwlhe) {
            if (!wkgbmnqykc(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        bl.eablkybsjg eablkybsjgVar = this.f110880zdlpuopuiu;
        bl.gxszxtbevo gxszxtbevoVar = wkgbmnqykc.f110940zoijcleaow;
        bl.gxszxtbevo gxszxtbevoVarD = eablkybsjgVar.d(gxszxtbevoVar.hcddaimhww());
        Logger logger = f110876esjtqupxsv;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(rgvfuqvkyq.dxjokdxxww("<< CONNECTION " + gxszxtbevoVarD.kcexrzcfyt(), new Object[0]));
        }
        if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar, gxszxtbevoVarD)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + gxszxtbevoVarD.wypolnanlu());
    }

    public final boolean wkgbmnqykc(boolean z13, ppxfxbqfkf handler) throws Exception {
        zdlpuopuiu.btonecajqb(handler, "handler");
        try {
            this.f110880zdlpuopuiu.grlcpdaxtj(9L);
            int iZynmafqrjb = wflxmlrfwp.zynmafqrjb(this.f110880zdlpuopuiu);
            if (iZynmafqrjb > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iZynmafqrjb);
            }
            int iZoijcleaow = wflxmlrfwp.zoijcleaow(this.f110880zdlpuopuiu.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            int iZoijcleaow2 = wflxmlrfwp.zoijcleaow(this.f110880zdlpuopuiu.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            int i13 = this.f110880zdlpuopuiu.readInt() & Integer.MAX_VALUE;
            if (iZoijcleaow != 8) {
                Logger logger = f110876esjtqupxsv;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(wkgbmnqykc.f110937iobyxmoadg.ppxfxbqfkf(true, i13, iZynmafqrjb, iZoijcleaow, iZoijcleaow2));
                }
            }
            if (z13 && iZoijcleaow != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + wkgbmnqykc.f110937iobyxmoadg.zoijcleaow(iZoijcleaow));
            }
            switch (iZoijcleaow) {
                case 0:
                    nufgyqmvbu(handler, iZynmafqrjb, iZoijcleaow2, i13);
                    return true;
                case 1:
                    draadjrbmk(handler, iZynmafqrjb, iZoijcleaow2, i13);
                    return true;
                case 2:
                    rgvfuqvkyq(handler, iZynmafqrjb, iZoijcleaow2, i13);
                    return true;
                case 3:
                    kcexrzcfyt(handler, iZynmafqrjb, iZoijcleaow2, i13);
                    return true;
                case 4:
                    zdlpuopuiu(handler, iZynmafqrjb, iZoijcleaow2, i13);
                    return true;
                case 5:
                    vdvldrhtss(handler, iZynmafqrjb, iZoijcleaow2, i13);
                    return true;
                case 6:
                    agtfadlqog(handler, iZynmafqrjb, iZoijcleaow2, i13);
                    return true;
                case 7:
                    dxjokdxxww(handler, iZynmafqrjb, iZoijcleaow2, i13);
                    return true;
                case 8:
                    jyumaefscl(handler, iZynmafqrjb, iZoijcleaow2, i13);
                    return true;
                default:
                    this.f110880zdlpuopuiu.wflxmlrfwp(iZynmafqrjb);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }
}
