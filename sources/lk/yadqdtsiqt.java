package lk;

import gg.wwaezpbzkn;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yadqdtsiqt implements Closeable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final zoijcleaow f63238yggfygwlhe = new zoijcleaow(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Reader f63239zdlpuopuiu;

    public static final class iobyxmoadg extends Reader {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private Reader f63240iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private boolean f63241jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Charset f63242yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final bl.eablkybsjg f63243zdlpuopuiu;

        public iobyxmoadg(bl.eablkybsjg source, Charset charset) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charset, "charset");
            this.f63243zdlpuopuiu = source;
            this.f63242yggfygwlhe = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            wwaezpbzkn wwaezpbzknVar;
            this.f63241jyumaefscl = true;
            Reader reader = this.f63240iwizpuwonk;
            if (reader != null) {
                reader.close();
                wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } else {
                wwaezpbzknVar = null;
            }
            if (wwaezpbzknVar == null) {
                this.f63243zdlpuopuiu.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i13, int i14) throws IOException {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cbuf, "cbuf");
            if (this.f63241jyumaefscl) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f63240iwizpuwonk;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f63243zdlpuopuiu.j0(), mk.rgvfuqvkyq.wflxmlrfwp(this.f63243zdlpuopuiu, this.f63242yggfygwlhe));
                this.f63240iwizpuwonk = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i13, i14);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public static /* synthetic */ yadqdtsiqt eablkybsjg(zoijcleaow zoijcleaowVar, byte[] bArr, cqumvgiudr cqumvgiudrVar, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                cqumvgiudrVar = null;
            }
            return zoijcleaowVar.wkgbmnqykc(bArr, cqumvgiudrVar);
        }

        public final yadqdtsiqt iobyxmoadg(bl.eablkybsjg eablkybsjgVar, cqumvgiudr cqumvgiudrVar, long j13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
            return mk.gtknphoqwx.iobyxmoadg(eablkybsjgVar, cqumvgiudrVar, j13);
        }

        public final yadqdtsiqt ppxfxbqfkf(cqumvgiudr cqumvgiudrVar, long j13, bl.eablkybsjg content) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(content, "content");
            return iobyxmoadg(content, cqumvgiudrVar, j13);
        }

        public final yadqdtsiqt wkgbmnqykc(byte[] bArr, cqumvgiudr cqumvgiudrVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
            return mk.gtknphoqwx.ppxfxbqfkf(bArr, cqumvgiudrVar);
        }

        public final yadqdtsiqt zoijcleaow(String str, cqumvgiudr cqumvgiudrVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
            gg.vdvldrhtss vdvldrhtssVarPpxfxbqfkf = mk.iobyxmoadg.ppxfxbqfkf(cqumvgiudrVar);
            Charset charset = (Charset) vdvldrhtssVarPpxfxbqfkf.iobyxmoadg();
            cqumvgiudr cqumvgiudrVar2 = (cqumvgiudr) vdvldrhtssVarPpxfxbqfkf.wkgbmnqykc();
            bl.ppxfxbqfkf ppxfxbqfkfVarWeqkydbzbr = new bl.ppxfxbqfkf().weqkydbzbr(str, charset);
            return iobyxmoadg(ppxfxbqfkfVarWeqkydbzbr, cqumvgiudrVar2, ppxfxbqfkfVarWeqkydbzbr.dsvhmnatus());
        }

        private zoijcleaow() {
        }
    }

    public static final yadqdtsiqt btonecajqb(cqumvgiudr cqumvgiudrVar, long j13, bl.eablkybsjg eablkybsjgVar) {
        return f63238yggfygwlhe.ppxfxbqfkf(cqumvgiudrVar, j13, eablkybsjgVar);
    }

    private final Charset lqeggnwhkg() {
        return mk.iobyxmoadg.zoijcleaow(dxjokdxxww(), null, 1, null);
    }

    public final String agtfadlqog() {
        bl.eablkybsjg eablkybsjgVarDraadjrbmk = draadjrbmk();
        try {
            String strF = eablkybsjgVarDraadjrbmk.F(mk.rgvfuqvkyq.wflxmlrfwp(eablkybsjgVarDraadjrbmk, lqeggnwhkg()));
            rg.zoijcleaow.iobyxmoadg(eablkybsjgVarDraadjrbmk, null);
            return strF;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rg.zoijcleaow.iobyxmoadg(eablkybsjgVarDraadjrbmk, th2);
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mk.gtknphoqwx.zoijcleaow(this);
    }

    public abstract bl.eablkybsjg draadjrbmk();

    public abstract cqumvgiudr dxjokdxxww();

    public final InputStream iobyxmoadg() {
        return draadjrbmk().j0();
    }

    public abstract long nufgyqmvbu();

    public final Reader wkgbmnqykc() {
        Reader reader = this.f63239zdlpuopuiu;
        if (reader != null) {
            return reader;
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(draadjrbmk(), lqeggnwhkg());
        this.f63239zdlpuopuiu = iobyxmoadgVar;
        return iobyxmoadgVar;
    }
}
