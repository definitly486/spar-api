package cc;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
class lqeggnwhkg implements Closeable {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final Logger f19586lereixgezr = Logger.getLogger(lqeggnwhkg.class.getName());

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private zoijcleaow f19587cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final byte[] f19588esjtqupxsv = new byte[16];

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private zoijcleaow f19589iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f19590jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    int f19591yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final RandomAccessFile f19592zdlpuopuiu;

    class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        boolean f19593iobyxmoadg = true;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ StringBuilder f19595zoijcleaow;

        iobyxmoadg(StringBuilder sb3) {
            this.f19595zoijcleaow = sb3;
        }

        @Override // cc.lqeggnwhkg.wkgbmnqykc
        public void iobyxmoadg(InputStream inputStream, int i13) {
            if (this.f19593iobyxmoadg) {
                this.f19593iobyxmoadg = false;
            } else {
                this.f19595zoijcleaow.append(", ");
            }
            this.f19595zoijcleaow.append(i13);
        }
    }

    private final class ppxfxbqfkf extends InputStream {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f19597yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f19598zdlpuopuiu;

        /* synthetic */ ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar, zoijcleaow zoijcleaowVar, iobyxmoadg iobyxmoadgVar) {
            this(zoijcleaowVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i13, int i14) throws IOException {
            lqeggnwhkg.draadjrbmk(bArr, "buffer");
            if ((i13 | i14) < 0 || i14 > bArr.length - i13) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i15 = this.f19597yggfygwlhe;
            if (i15 <= 0) {
                return -1;
            }
            if (i14 > i15) {
                i14 = i15;
            }
            lqeggnwhkg.this.kcexrzcfyt(this.f19598zdlpuopuiu, bArr, i13, i14);
            this.f19598zdlpuopuiu = lqeggnwhkg.this.jyumaefscl(this.f19598zdlpuopuiu + i14);
            this.f19597yggfygwlhe -= i14;
            return i14;
        }

        private ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
            this.f19598zdlpuopuiu = lqeggnwhkg.this.jyumaefscl(zoijcleaowVar.f19600iobyxmoadg + 4);
            this.f19597yggfygwlhe = zoijcleaowVar.f19601zoijcleaow;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f19597yggfygwlhe == 0) {
                return -1;
            }
            lqeggnwhkg.this.f19592zdlpuopuiu.seek(this.f19598zdlpuopuiu);
            int i13 = lqeggnwhkg.this.f19592zdlpuopuiu.read();
            this.f19598zdlpuopuiu = lqeggnwhkg.this.jyumaefscl(this.f19598zdlpuopuiu + 1);
            this.f19597yggfygwlhe--;
            return i13;
        }
    }

    public interface wkgbmnqykc {
        void iobyxmoadg(InputStream inputStream, int i13);
    }

    static class zoijcleaow {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        static final zoijcleaow f19599ppxfxbqfkf = new zoijcleaow(0, 0);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final int f19600iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final int f19601zoijcleaow;

        zoijcleaow(int i13, int i14) {
            this.f19600iobyxmoadg = i13;
            this.f19601zoijcleaow = i14;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f19600iobyxmoadg + ", length = " + this.f19601zoijcleaow + "]";
        }
    }

    public lqeggnwhkg(File file) throws IOException {
        if (!file.exists()) {
            btonecajqb(file);
        }
        this.f19592zdlpuopuiu = agtfadlqog(file);
        rgvfuqvkyq();
    }

    private static RandomAccessFile agtfadlqog(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private static void btonecajqb(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileAgtfadlqog = agtfadlqog(file2);
        try {
            randomAccessFileAgtfadlqog.setLength(4096L);
            randomAccessFileAgtfadlqog.seek(0L);
            byte[] bArr = new byte[16];
            lereixgezr(bArr, 4096, 0, 0, 0);
            randomAccessFileAgtfadlqog.write(bArr);
            randomAccessFileAgtfadlqog.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            randomAccessFileAgtfadlqog.close();
            throw th2;
        }
    }

    private static void cqumvgiudr(byte[] bArr, int i13, int i14) {
        bArr[i13] = (byte) (i14 >> 24);
        bArr[i13 + 1] = (byte) (i14 >> 16);
        bArr[i13 + 2] = (byte) (i14 >> 8);
        bArr[i13 + 3] = (byte) i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object draadjrbmk(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int jyumaefscl(int i13) {
        int i14 = this.f19591yggfygwlhe;
        return i13 < i14 ? i13 : (i13 + 16) - i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kcexrzcfyt(int i13, byte[] bArr, int i14, int i15) throws IOException {
        int iJyumaefscl = jyumaefscl(i13);
        int i16 = iJyumaefscl + i15;
        int i17 = this.f19591yggfygwlhe;
        if (i16 <= i17) {
            this.f19592zdlpuopuiu.seek(iJyumaefscl);
            this.f19592zdlpuopuiu.readFully(bArr, i14, i15);
            return;
        }
        int i18 = i17 - iJyumaefscl;
        this.f19592zdlpuopuiu.seek(iJyumaefscl);
        this.f19592zdlpuopuiu.readFully(bArr, i14, i18);
        this.f19592zdlpuopuiu.seek(16L);
        this.f19592zdlpuopuiu.readFully(bArr, i14 + i18, i15 - i18);
    }

    private static void lereixgezr(byte[] bArr, int... iArr) {
        int i13 = 0;
        for (int i14 : iArr) {
            cqumvgiudr(bArr, i13, i14);
            i13 += 4;
        }
    }

    private zoijcleaow ojitshcjhn(int i13) throws IOException {
        if (i13 == 0) {
            return zoijcleaow.f19599ppxfxbqfkf;
        }
        this.f19592zdlpuopuiu.seek(i13);
        return new zoijcleaow(i13, this.f19592zdlpuopuiu.readInt());
    }

    private void rgvfuqvkyq() throws IOException {
        this.f19592zdlpuopuiu.seek(0L);
        this.f19592zdlpuopuiu.readFully(this.f19588esjtqupxsv);
        int iVdvldrhtss = vdvldrhtss(this.f19588esjtqupxsv, 0);
        this.f19591yggfygwlhe = iVdvldrhtss;
        if (iVdvldrhtss <= this.f19592zdlpuopuiu.length()) {
            this.f19590jyumaefscl = vdvldrhtss(this.f19588esjtqupxsv, 4);
            int iVdvldrhtss2 = vdvldrhtss(this.f19588esjtqupxsv, 8);
            int iVdvldrhtss3 = vdvldrhtss(this.f19588esjtqupxsv, 12);
            this.f19589iwizpuwonk = ojitshcjhn(iVdvldrhtss2);
            this.f19587cqumvgiudr = ojitshcjhn(iVdvldrhtss3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f19591yggfygwlhe + ", Actual length: " + this.f19592zdlpuopuiu.length());
    }

    private static int vdvldrhtss(byte[] bArr, int i13) {
        return ((bArr[i13] & 255) << 24) + ((bArr[i13 + 1] & 255) << 16) + ((bArr[i13 + 2] & 255) << 8) + (bArr[i13 + 3] & 255);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f19592zdlpuopuiu.close();
    }

    public synchronized void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar) {
        int iJyumaefscl = this.f19589iwizpuwonk.f19600iobyxmoadg;
        for (int i13 = 0; i13 < this.f19590jyumaefscl; i13++) {
            zoijcleaow zoijcleaowVarOjitshcjhn = ojitshcjhn(iJyumaefscl);
            wkgbmnqykcVar.iobyxmoadg(new ppxfxbqfkf(this, zoijcleaowVarOjitshcjhn, null), zoijcleaowVarOjitshcjhn.f19601zoijcleaow);
            iJyumaefscl = jyumaefscl(zoijcleaowVarOjitshcjhn.f19600iobyxmoadg + 4 + zoijcleaowVarOjitshcjhn.f19601zoijcleaow);
        }
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getClass().getSimpleName());
        sb3.append('[');
        sb3.append("fileLength=");
        sb3.append(this.f19591yggfygwlhe);
        sb3.append(", size=");
        sb3.append(this.f19590jyumaefscl);
        sb3.append(", first=");
        sb3.append(this.f19589iwizpuwonk);
        sb3.append(", last=");
        sb3.append(this.f19587cqumvgiudr);
        sb3.append(", element lengths=[");
        try {
            dxjokdxxww(new iobyxmoadg(sb3));
        } catch (IOException e13) {
            f19586lereixgezr.log(Level.WARNING, "read error", (Throwable) e13);
        }
        sb3.append("]]");
        return sb3.toString();
    }

    public int zdlpuopuiu() {
        if (this.f19590jyumaefscl == 0) {
            return 16;
        }
        zoijcleaow zoijcleaowVar = this.f19587cqumvgiudr;
        int i13 = zoijcleaowVar.f19600iobyxmoadg;
        int i14 = this.f19589iwizpuwonk.f19600iobyxmoadg;
        return i13 >= i14 ? (i13 - i14) + 4 + zoijcleaowVar.f19601zoijcleaow + 16 : (((i13 + 4) + zoijcleaowVar.f19601zoijcleaow) + this.f19591yggfygwlhe) - i14;
    }
}
