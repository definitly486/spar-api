package lk;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class istkbnxepw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f63065iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public static /* synthetic */ istkbnxepw btonecajqb(iobyxmoadg iobyxmoadgVar, cqumvgiudr cqumvgiudrVar, byte[] bArr, int i13, int i14, int i15, Object obj) {
            if ((i15 & 4) != 0) {
                i13 = 0;
            }
            if ((i15 & 8) != 0) {
                i14 = bArr.length;
            }
            return iobyxmoadgVar.gxszxtbevo(cqumvgiudrVar, bArr, i13, i14);
        }

        public static /* synthetic */ istkbnxepw dxjokdxxww(iobyxmoadg iobyxmoadgVar, String str, cqumvgiudr cqumvgiudrVar, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                cqumvgiudrVar = null;
            }
            return iobyxmoadgVar.zoijcleaow(str, cqumvgiudrVar);
        }

        public static /* synthetic */ istkbnxepw gtknphoqwx(iobyxmoadg iobyxmoadgVar, byte[] bArr, cqumvgiudr cqumvgiudrVar, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                cqumvgiudrVar = null;
            }
            if ((i15 & 2) != 0) {
                i13 = 0;
            }
            if ((i15 & 4) != 0) {
                i14 = bArr.length;
            }
            return iobyxmoadgVar.nufgyqmvbu(bArr, cqumvgiudrVar, i13, i14);
        }

        public final istkbnxepw eablkybsjg(cqumvgiudr cqumvgiudrVar, byte[] content) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(content, "content");
            return btonecajqb(this, cqumvgiudrVar, content, 0, 0, 12, null);
        }

        public final istkbnxepw gxszxtbevo(cqumvgiudr cqumvgiudrVar, byte[] content, int i13, int i14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(content, "content");
            return nufgyqmvbu(content, cqumvgiudrVar, i13, i14);
        }

        public final istkbnxepw iobyxmoadg(bl.gxszxtbevo gxszxtbevoVar, cqumvgiudr cqumvgiudrVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
            return mk.dxjokdxxww.ppxfxbqfkf(gxszxtbevoVar, cqumvgiudrVar);
        }

        public final istkbnxepw lqeggnwhkg(byte[] bArr) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
            return gtknphoqwx(this, bArr, null, 0, 0, 7, null);
        }

        public final istkbnxepw nufgyqmvbu(byte[] bArr, cqumvgiudr cqumvgiudrVar, int i13, int i14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
            return mk.dxjokdxxww.wkgbmnqykc(bArr, cqumvgiudrVar, i13, i14);
        }

        public final istkbnxepw ppxfxbqfkf(cqumvgiudr cqumvgiudrVar, bl.gxszxtbevo content) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(content, "content");
            return iobyxmoadg(content, cqumvgiudrVar);
        }

        public final istkbnxepw wkgbmnqykc(cqumvgiudr cqumvgiudrVar, String content) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(content, "content");
            return zoijcleaow(content, cqumvgiudrVar);
        }

        public final istkbnxepw zoijcleaow(String str, cqumvgiudr cqumvgiudrVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
            gg.vdvldrhtss vdvldrhtssVarPpxfxbqfkf = mk.iobyxmoadg.ppxfxbqfkf(cqumvgiudrVar);
            Charset charset = (Charset) vdvldrhtssVarPpxfxbqfkf.iobyxmoadg();
            cqumvgiudr cqumvgiudrVar2 = (cqumvgiudr) vdvldrhtssVarPpxfxbqfkf.wkgbmnqykc();
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bytes, "this as java.lang.String).getBytes(charset)");
            return nufgyqmvbu(bytes, cqumvgiudrVar2, 0, bytes.length);
        }

        private iobyxmoadg() {
        }
    }

    public static final istkbnxepw eablkybsjg(cqumvgiudr cqumvgiudrVar, byte[] bArr) {
        return f63065iobyxmoadg.eablkybsjg(cqumvgiudrVar, bArr);
    }

    public static final istkbnxepw gxszxtbevo(byte[] bArr) {
        return f63065iobyxmoadg.lqeggnwhkg(bArr);
    }

    public static final istkbnxepw ppxfxbqfkf(cqumvgiudr cqumvgiudrVar, bl.gxszxtbevo gxszxtbevoVar) {
        return f63065iobyxmoadg.ppxfxbqfkf(cqumvgiudrVar, gxszxtbevoVar);
    }

    public static final istkbnxepw wkgbmnqykc(cqumvgiudr cqumvgiudrVar, String str) {
        return f63065iobyxmoadg.wkgbmnqykc(cqumvgiudrVar, str);
    }

    public abstract void dxjokdxxww(bl.wkgbmnqykc wkgbmnqykcVar);

    public abstract long iobyxmoadg();

    public boolean lqeggnwhkg() {
        return mk.dxjokdxxww.iobyxmoadg(this);
    }

    public boolean nufgyqmvbu() {
        return mk.dxjokdxxww.zoijcleaow(this);
    }

    public abstract cqumvgiudr zoijcleaow();
}
