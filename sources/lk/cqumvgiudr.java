package lk;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class cqumvgiudr {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f62887eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f62888iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f62889ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String[] f62890wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f62891zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final cqumvgiudr iobyxmoadg(String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
            return mk.nufgyqmvbu.wkgbmnqykc(str);
        }

        public final cqumvgiudr zoijcleaow(String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
            return mk.nufgyqmvbu.eablkybsjg(str);
        }

        private iobyxmoadg() {
        }
    }

    public cqumvgiudr(String mediaType, String type, String subtype, String[] parameterNamesAndValues) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mediaType, "mediaType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subtype, "subtype");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameterNamesAndValues, "parameterNamesAndValues");
        this.f62888iobyxmoadg = mediaType;
        this.f62891zoijcleaow = type;
        this.f62889ppxfxbqfkf = subtype;
        this.f62890wkgbmnqykc = parameterNamesAndValues;
    }

    public static final cqumvgiudr ppxfxbqfkf(String str) {
        return f62887eablkybsjg.iobyxmoadg(str);
    }

    public static /* synthetic */ Charset zoijcleaow(cqumvgiudr cqumvgiudrVar, Charset charset, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            charset = null;
        }
        return cqumvgiudrVar.iobyxmoadg(charset);
    }

    public final String[] eablkybsjg() {
        return this.f62890wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        return mk.nufgyqmvbu.iobyxmoadg(this, obj);
    }

    public final String gxszxtbevo(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return mk.nufgyqmvbu.ppxfxbqfkf(this, name);
    }

    public int hashCode() {
        return mk.nufgyqmvbu.zoijcleaow(this);
    }

    public final Charset iobyxmoadg(Charset charset) {
        String strGxszxtbevo = gxszxtbevo("charset");
        if (strGxszxtbevo == null) {
            return charset;
        }
        try {
            return Charset.forName(strGxszxtbevo);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String lqeggnwhkg() {
        return this.f62889ppxfxbqfkf;
    }

    public final String nufgyqmvbu() {
        return this.f62891zoijcleaow;
    }

    public String toString() {
        return mk.nufgyqmvbu.gxszxtbevo(this);
    }

    public final String wkgbmnqykc() {
        return this.f62888iobyxmoadg;
    }
}
