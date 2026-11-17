package bl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class hcddaimhww extends dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final esjtqupxsv f16680eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final dxjokdxxww f16681gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Map f16682lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f16683nufgyqmvbu;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final iobyxmoadg f16679dxjokdxxww = new iobyxmoadg(null);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final esjtqupxsv f16678btonecajqb = esjtqupxsv.iobyxmoadg.eablkybsjg(esjtqupxsv.f16670yggfygwlhe, CardDateFormatTextWatcher.DIVIDER_CHARACTER, false, 1, null);

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public hcddaimhww(esjtqupxsv zipPath, dxjokdxxww fileSystem, Map entries, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zipPath, "zipPath");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fileSystem, "fileSystem");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(entries, "entries");
        this.f16680eablkybsjg = zipPath;
        this.f16681gxszxtbevo = fileSystem;
        this.f16682lqeggnwhkg = entries;
        this.f16683nufgyqmvbu = str;
    }

    private final List kcexrzcfyt(esjtqupxsv esjtqupxsvVar, boolean z13) throws IOException {
        cl.wkgbmnqykc wkgbmnqykcVar = (cl.wkgbmnqykc) this.f16682lqeggnwhkg.get(oxmwwwfdhm(esjtqupxsvVar));
        if (wkgbmnqykcVar != null) {
            return hg.jyumaefscl.m(wkgbmnqykcVar.zoijcleaow());
        }
        if (!z13) {
            return null;
        }
        throw new IOException("not a directory: " + esjtqupxsvVar);
    }

    private final esjtqupxsv oxmwwwfdhm(esjtqupxsv esjtqupxsvVar) {
        return f16678btonecajqb.btonecajqb(esjtqupxsvVar, true);
    }

    @Override // bl.dxjokdxxww
    public lqeggnwhkg agtfadlqog(esjtqupxsv file) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // bl.dxjokdxxww
    public void dxjokdxxww(esjtqupxsv path, boolean z13) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // bl.dxjokdxxww
    public List gtknphoqwx(esjtqupxsv dir) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dir, "dir");
        List listKcexrzcfyt = kcexrzcfyt(dir, true);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(listKcexrzcfyt);
        return listKcexrzcfyt;
    }

    @Override // bl.dxjokdxxww
    public void lqeggnwhkg(esjtqupxsv dir, boolean z13) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // bl.dxjokdxxww
    public void ppxfxbqfkf(esjtqupxsv source, esjtqupxsv target) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // bl.dxjokdxxww
    public iozdgvuglv rgvfuqvkyq(esjtqupxsv file, boolean z13) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // bl.dxjokdxxww
    public wwaezpbzkn vdvldrhtss(esjtqupxsv file) throws Throwable {
        eablkybsjg eablkybsjgVarPpxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
        cl.wkgbmnqykc wkgbmnqykcVar = (cl.wkgbmnqykc) this.f16682lqeggnwhkg.get(oxmwwwfdhm(file));
        if (wkgbmnqykcVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        lqeggnwhkg lqeggnwhkgVarAgtfadlqog = this.f16681gxszxtbevo.agtfadlqog(this.f16680eablkybsjg);
        Throwable th2 = null;
        try {
            eablkybsjgVarPpxfxbqfkf = zdlpuopuiu.ppxfxbqfkf(lqeggnwhkgVarAgtfadlqog.vdvldrhtss(wkgbmnqykcVar.gxszxtbevo()));
            if (lqeggnwhkgVarAgtfadlqog != null) {
                try {
                    lqeggnwhkgVarAgtfadlqog.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (lqeggnwhkgVarAgtfadlqog != null) {
                try {
                    lqeggnwhkgVarAgtfadlqog.close();
                } catch (Throwable th5) {
                    gg.lqeggnwhkg.iobyxmoadg(th4, th5);
                }
            }
            eablkybsjgVarPpxfxbqfkf = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(eablkybsjgVarPpxfxbqfkf);
        cl.eablkybsjg.gtknphoqwx(eablkybsjgVarPpxfxbqfkf);
        return wkgbmnqykcVar.wkgbmnqykc() == 0 ? new cl.zoijcleaow(eablkybsjgVarPpxfxbqfkf, wkgbmnqykcVar.lqeggnwhkg(), true) : new cl.zoijcleaow(new ojitshcjhn(new cl.zoijcleaow(eablkybsjgVarPpxfxbqfkf, wkgbmnqykcVar.ppxfxbqfkf(), true), new Inflater(true)), wkgbmnqykcVar.lqeggnwhkg(), false);
    }

    @Override // bl.dxjokdxxww
    public nufgyqmvbu wflxmlrfwp(esjtqupxsv path) throws Throwable {
        eablkybsjg eablkybsjgVarPpxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(path, "path");
        cl.wkgbmnqykc wkgbmnqykcVar = (cl.wkgbmnqykc) this.f16682lqeggnwhkg.get(oxmwwwfdhm(path));
        Throwable th2 = null;
        if (wkgbmnqykcVar == null) {
            return null;
        }
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(!wkgbmnqykcVar.nufgyqmvbu(), wkgbmnqykcVar.nufgyqmvbu(), null, wkgbmnqykcVar.nufgyqmvbu() ? null : Long.valueOf(wkgbmnqykcVar.lqeggnwhkg()), null, wkgbmnqykcVar.eablkybsjg(), null, null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        if (wkgbmnqykcVar.gxszxtbevo() == -1) {
            return nufgyqmvbuVar;
        }
        lqeggnwhkg lqeggnwhkgVarAgtfadlqog = this.f16681gxszxtbevo.agtfadlqog(this.f16680eablkybsjg);
        try {
            eablkybsjgVarPpxfxbqfkf = zdlpuopuiu.ppxfxbqfkf(lqeggnwhkgVarAgtfadlqog.vdvldrhtss(wkgbmnqykcVar.gxszxtbevo()));
            if (lqeggnwhkgVarAgtfadlqog != null) {
                try {
                    lqeggnwhkgVarAgtfadlqog.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (lqeggnwhkgVarAgtfadlqog != null) {
                try {
                    lqeggnwhkgVarAgtfadlqog.close();
                } catch (Throwable th5) {
                    gg.lqeggnwhkg.iobyxmoadg(th4, th5);
                }
            }
            th2 = th4;
            eablkybsjgVarPpxfxbqfkf = null;
        }
        if (th2 != null) {
            throw th2;
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(eablkybsjgVarPpxfxbqfkf);
        return cl.eablkybsjg.nufgyqmvbu(eablkybsjgVarPpxfxbqfkf, nufgyqmvbuVar);
    }

    @Override // bl.dxjokdxxww
    public iozdgvuglv zoijcleaow(esjtqupxsv file, boolean z13) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
        throw new IOException("zip file systems are read-only");
    }
}
