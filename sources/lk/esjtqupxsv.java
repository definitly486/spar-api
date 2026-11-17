package lk;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class esjtqupxsv extends istkbnxepw {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final byte[] f63030agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final cqumvgiudr f63031btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public static final cqumvgiudr f63032draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final cqumvgiudr f63033dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final cqumvgiudr f63034gtknphoqwx;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final zoijcleaow f63035lqeggnwhkg = new zoijcleaow(null);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final cqumvgiudr f63036nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private static final byte[] f63037ojitshcjhn;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final byte[] f63038wflxmlrfwp;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final cqumvgiudr f63039eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f63040gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final cqumvgiudr f63041ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f63042wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final bl.gxszxtbevo f63043zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final bl.gxszxtbevo f63044iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f63045ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private cqumvgiudr f63046zoijcleaow;

        /* JADX WARN: Multi-variable type inference failed */
        public iobyxmoadg() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final iobyxmoadg iobyxmoadg(yggfygwlhe yggfygwlheVar, istkbnxepw body) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(body, "body");
            zoijcleaow(ppxfxbqfkf.f63047ppxfxbqfkf.iobyxmoadg(yggfygwlheVar, body));
            return this;
        }

        public final esjtqupxsv ppxfxbqfkf() {
            if (this.f63045ppxfxbqfkf.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new esjtqupxsv(this.f63044iobyxmoadg, this.f63046zoijcleaow, mk.rgvfuqvkyq.yggfygwlhe(this.f63045ppxfxbqfkf));
        }

        public final iobyxmoadg wkgbmnqykc(cqumvgiudr type) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(type.nufgyqmvbu(), "multipart")) {
                this.f63046zoijcleaow = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public final iobyxmoadg zoijcleaow(ppxfxbqfkf part) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(part, "part");
            this.f63045ppxfxbqfkf.add(part);
            return this;
        }

        public iobyxmoadg(String boundary) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(boundary, "boundary");
            this.f63044iobyxmoadg = bl.gxszxtbevo.f16674iwizpuwonk.wkgbmnqykc(boundary);
            this.f63046zoijcleaow = esjtqupxsv.f63036nufgyqmvbu;
            this.f63045ppxfxbqfkf = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ iobyxmoadg(String str, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            if ((i13 & 1) != 0) {
                str = UUID.randomUUID().toString();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final iobyxmoadg f63047ppxfxbqfkf = new iobyxmoadg(null);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final yggfygwlhe f63048iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final istkbnxepw f63049zoijcleaow;

        public static final class iobyxmoadg {
            public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final ppxfxbqfkf iobyxmoadg(yggfygwlhe yggfygwlheVar, istkbnxepw body) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(body, "body");
                kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar = null;
                if ((yggfygwlheVar != null ? yggfygwlheVar.iobyxmoadg("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((yggfygwlheVar != null ? yggfygwlheVar.iobyxmoadg("Content-Length") : null) == null) {
                    return new ppxfxbqfkf(yggfygwlheVar, body, gtknphoqwxVar);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            private iobyxmoadg() {
            }
        }

        public /* synthetic */ ppxfxbqfkf(yggfygwlhe yggfygwlheVar, istkbnxepw istkbnxepwVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(yggfygwlheVar, istkbnxepwVar);
        }

        public final istkbnxepw iobyxmoadg() {
            return this.f63049zoijcleaow;
        }

        public final yggfygwlhe zoijcleaow() {
            return this.f63048iobyxmoadg;
        }

        private ppxfxbqfkf(yggfygwlhe yggfygwlheVar, istkbnxepw istkbnxepwVar) {
            this.f63048iobyxmoadg = yggfygwlheVar;
            this.f63049zoijcleaow = istkbnxepwVar;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    static {
        cqumvgiudr.iobyxmoadg iobyxmoadgVar = cqumvgiudr.f62887eablkybsjg;
        f63036nufgyqmvbu = iobyxmoadgVar.iobyxmoadg("multipart/mixed");
        f63033dxjokdxxww = iobyxmoadgVar.iobyxmoadg("multipart/alternative");
        f63031btonecajqb = iobyxmoadgVar.iobyxmoadg("multipart/digest");
        f63034gtknphoqwx = iobyxmoadgVar.iobyxmoadg("multipart/parallel");
        f63032draadjrbmk = iobyxmoadgVar.iobyxmoadg("multipart/form-data");
        f63038wflxmlrfwp = new byte[]{(byte) 58, (byte) 32};
        f63030agtfadlqog = new byte[]{(byte) 13, (byte) 10};
        byte b13 = (byte) 45;
        f63037ojitshcjhn = new byte[]{b13, b13};
    }

    public esjtqupxsv(bl.gxszxtbevo boundaryByteString, cqumvgiudr type, List parts) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(boundaryByteString, "boundaryByteString");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parts, "parts");
        this.f63043zoijcleaow = boundaryByteString;
        this.f63041ppxfxbqfkf = type;
        this.f63042wkgbmnqykc = parts;
        this.f63039eablkybsjg = cqumvgiudr.f62887eablkybsjg.iobyxmoadg(type + "; boundary=" + btonecajqb());
        this.f63040gxszxtbevo = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long gtknphoqwx(bl.wkgbmnqykc wkgbmnqykcVar, boolean z13) throws EOFException {
        bl.ppxfxbqfkf ppxfxbqfkfVar;
        if (z13) {
            wkgbmnqykcVar = new bl.ppxfxbqfkf();
            ppxfxbqfkfVar = wkgbmnqykcVar;
        } else {
            ppxfxbqfkfVar = 0;
        }
        int size = this.f63042wkgbmnqykc.size();
        long j13 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) this.f63042wkgbmnqykc.get(i13);
            yggfygwlhe yggfygwlheVarZoijcleaow = ppxfxbqfkfVar2.zoijcleaow();
            istkbnxepw istkbnxepwVarIobyxmoadg = ppxfxbqfkfVar2.iobyxmoadg();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar);
            wkgbmnqykcVar.skhdrjzrfn(f63037ojitshcjhn);
            wkgbmnqykcVar.t(this.f63043zoijcleaow);
            wkgbmnqykcVar.skhdrjzrfn(f63030agtfadlqog);
            if (yggfygwlheVarZoijcleaow != null) {
                int size2 = yggfygwlheVarZoijcleaow.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    wkgbmnqykcVar.metgxyhuhe(yggfygwlheVarZoijcleaow.wkgbmnqykc(i14)).skhdrjzrfn(f63038wflxmlrfwp).metgxyhuhe(yggfygwlheVarZoijcleaow.btonecajqb(i14)).skhdrjzrfn(f63030agtfadlqog);
                }
            }
            cqumvgiudr cqumvgiudrVarZoijcleaow = istkbnxepwVarIobyxmoadg.zoijcleaow();
            if (cqumvgiudrVarZoijcleaow != null) {
                wkgbmnqykcVar.metgxyhuhe("Content-Type: ").metgxyhuhe(cqumvgiudrVarZoijcleaow.toString()).skhdrjzrfn(f63030agtfadlqog);
            }
            long jIobyxmoadg = istkbnxepwVarIobyxmoadg.iobyxmoadg();
            if (jIobyxmoadg == -1 && z13) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ppxfxbqfkfVar);
                ppxfxbqfkfVar.iobyxmoadg();
                return -1L;
            }
            byte[] bArr = f63030agtfadlqog;
            wkgbmnqykcVar.skhdrjzrfn(bArr);
            if (z13) {
                j13 += jIobyxmoadg;
            } else {
                istkbnxepwVarIobyxmoadg.dxjokdxxww(wkgbmnqykcVar);
            }
            wkgbmnqykcVar.skhdrjzrfn(bArr);
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar);
        byte[] bArr2 = f63037ojitshcjhn;
        wkgbmnqykcVar.skhdrjzrfn(bArr2);
        wkgbmnqykcVar.t(this.f63043zoijcleaow);
        wkgbmnqykcVar.skhdrjzrfn(bArr2);
        wkgbmnqykcVar.skhdrjzrfn(f63030agtfadlqog);
        if (!z13) {
            return j13;
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ppxfxbqfkfVar);
        long jDsvhmnatus = j13 + ppxfxbqfkfVar.dsvhmnatus();
        ppxfxbqfkfVar.iobyxmoadg();
        return jDsvhmnatus;
    }

    public final String btonecajqb() {
        return this.f63043zoijcleaow.wypolnanlu();
    }

    @Override // lk.istkbnxepw
    public void dxjokdxxww(bl.wkgbmnqykc sink) throws EOFException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        gtknphoqwx(sink, false);
    }

    @Override // lk.istkbnxepw
    public long iobyxmoadg() throws EOFException {
        long j13 = this.f63040gxszxtbevo;
        if (j13 != -1) {
            return j13;
        }
        long jGtknphoqwx = gtknphoqwx(null, true);
        this.f63040gxszxtbevo = jGtknphoqwx;
        return jGtknphoqwx;
    }

    @Override // lk.istkbnxepw
    public cqumvgiudr zoijcleaow() {
        return this.f63039eablkybsjg;
    }
}
