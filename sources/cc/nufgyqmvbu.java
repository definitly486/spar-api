package cc;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
class nufgyqmvbu implements ppxfxbqfkf {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Charset f19602wkgbmnqykc = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final File f19603iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private lqeggnwhkg f19604ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f19605zoijcleaow;

    class iobyxmoadg implements lqeggnwhkg.wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ byte[] f19606iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ int[] f19608zoijcleaow;

        iobyxmoadg(byte[] bArr, int[] iArr) {
            this.f19606iobyxmoadg = bArr;
            this.f19608zoijcleaow = iArr;
        }

        @Override // cc.lqeggnwhkg.wkgbmnqykc
        public void iobyxmoadg(InputStream inputStream, int i13) throws IOException {
            try {
                inputStream.read(this.f19606iobyxmoadg, this.f19608zoijcleaow[0], i13);
                int[] iArr = this.f19608zoijcleaow;
                iArr[0] = iArr[0] + i13;
            } finally {
                inputStream.close();
            }
        }
    }

    private static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final byte[] f19609iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f19610zoijcleaow;

        zoijcleaow(byte[] bArr, int i13) {
            this.f19609iobyxmoadg = bArr;
            this.f19610zoijcleaow = i13;
        }
    }

    nufgyqmvbu(File file, int i13) {
        this.f19603iobyxmoadg = file;
        this.f19605zoijcleaow = i13;
    }

    private zoijcleaow eablkybsjg() {
        if (!this.f19603iobyxmoadg.exists()) {
            return null;
        }
        gxszxtbevo();
        lqeggnwhkg lqeggnwhkgVar = this.f19604ppxfxbqfkf;
        if (lqeggnwhkgVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[lqeggnwhkgVar.zdlpuopuiu()];
        try {
            this.f19604ppxfxbqfkf.dxjokdxxww(new iobyxmoadg(bArr, iArr));
        } catch (IOException e13) {
            xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("A problem occurred while reading the Crashlytics log file.", e13);
        }
        return new zoijcleaow(bArr, iArr[0]);
    }

    private void gxszxtbevo() {
        if (this.f19604ppxfxbqfkf == null) {
            try {
                this.f19604ppxfxbqfkf = new lqeggnwhkg(this.f19603iobyxmoadg);
            } catch (IOException e13) {
                xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Could not open log file: " + this.f19603iobyxmoadg, e13);
            }
        }
    }

    @Override // cc.ppxfxbqfkf
    public void iobyxmoadg() {
        ac.btonecajqb.gxszxtbevo(this.f19604ppxfxbqfkf, "There was a problem closing the Crashlytics log file.");
        this.f19604ppxfxbqfkf = null;
    }

    @Override // cc.ppxfxbqfkf
    public byte[] ppxfxbqfkf() {
        zoijcleaow zoijcleaowVarEablkybsjg = eablkybsjg();
        if (zoijcleaowVarEablkybsjg == null) {
            return null;
        }
        int i13 = zoijcleaowVarEablkybsjg.f19610zoijcleaow;
        byte[] bArr = new byte[i13];
        System.arraycopy(zoijcleaowVarEablkybsjg.f19609iobyxmoadg, 0, bArr, 0, i13);
        return bArr;
    }

    @Override // cc.ppxfxbqfkf
    public void wkgbmnqykc() {
        iobyxmoadg();
        this.f19603iobyxmoadg.delete();
    }

    @Override // cc.ppxfxbqfkf
    public String zoijcleaow() {
        byte[] bArrPpxfxbqfkf = ppxfxbqfkf();
        if (bArrPpxfxbqfkf != null) {
            return new String(bArrPpxfxbqfkf, f19602wkgbmnqykc);
        }
        return null;
    }
}
