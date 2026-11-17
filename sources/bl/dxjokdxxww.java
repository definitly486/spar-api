package bl;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f16665iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final esjtqupxsv f16666ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final dxjokdxxww f16667wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final dxjokdxxww f16668zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static {
        dxjokdxxww oxmwwwfdhmVar;
        try {
            Class.forName("java.nio.file.Files");
            oxmwwwfdhmVar = new kcexrzcfyt();
        } catch (ClassNotFoundException unused) {
            oxmwwwfdhmVar = new oxmwwwfdhm();
        }
        f16668zoijcleaow = oxmwwwfdhmVar;
        esjtqupxsv.iobyxmoadg iobyxmoadgVar = esjtqupxsv.f16670yggfygwlhe;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(property, "getProperty(\"java.io.tmpdir\")");
        f16666ppxfxbqfkf = esjtqupxsv.iobyxmoadg.eablkybsjg(iobyxmoadgVar, property, false, 1, null);
        ClassLoader classLoader = cl.ppxfxbqfkf.class.getClassLoader();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(classLoader, "ResourceFileSystem::class.java.classLoader");
        f16667wkgbmnqykc = new cl.ppxfxbqfkf(classLoader, false);
    }

    public abstract lqeggnwhkg agtfadlqog(esjtqupxsv esjtqupxsvVar);

    public final boolean btonecajqb(esjtqupxsv path) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(path, "path");
        return cl.nufgyqmvbu.zoijcleaow(this, path);
    }

    public final nufgyqmvbu draadjrbmk(esjtqupxsv path) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(path, "path");
        return cl.nufgyqmvbu.ppxfxbqfkf(this, path);
    }

    public abstract void dxjokdxxww(esjtqupxsv esjtqupxsvVar, boolean z13);

    public final void eablkybsjg(esjtqupxsv dir, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dir, "dir");
        cl.nufgyqmvbu.iobyxmoadg(this, dir, z13);
    }

    public abstract List gtknphoqwx(esjtqupxsv esjtqupxsvVar);

    public final void gxszxtbevo(esjtqupxsv dir) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dir, "dir");
        lqeggnwhkg(dir, false);
    }

    public final iozdgvuglv iobyxmoadg(esjtqupxsv file) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
        return zoijcleaow(file, false);
    }

    public abstract void lqeggnwhkg(esjtqupxsv esjtqupxsvVar, boolean z13);

    public final void nufgyqmvbu(esjtqupxsv path) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(path, "path");
        dxjokdxxww(path, false);
    }

    public final iozdgvuglv ojitshcjhn(esjtqupxsv file) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
        return rgvfuqvkyq(file, false);
    }

    public abstract void ppxfxbqfkf(esjtqupxsv esjtqupxsvVar, esjtqupxsv esjtqupxsvVar2);

    public abstract iozdgvuglv rgvfuqvkyq(esjtqupxsv esjtqupxsvVar, boolean z13);

    public abstract wwaezpbzkn vdvldrhtss(esjtqupxsv esjtqupxsvVar);

    public abstract nufgyqmvbu wflxmlrfwp(esjtqupxsv esjtqupxsvVar);

    public final void wkgbmnqykc(esjtqupxsv dir) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dir, "dir");
        eablkybsjg(dir, false);
    }

    public abstract iozdgvuglv zoijcleaow(esjtqupxsv esjtqupxsvVar, boolean z13);
}
