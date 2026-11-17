package mj;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static volatile Charset f67318dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final Charset f67319eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final Charset f67320gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wkgbmnqykc f67321iobyxmoadg = new wkgbmnqykc();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final Charset f67322lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static volatile Charset f67323nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final Charset f67324ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final Charset f67325wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final Charset f67326zoijcleaow;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(charsetForName, "forName(...)");
        f67326zoijcleaow = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(charsetForName2, "forName(...)");
        f67324ppxfxbqfkf = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(charsetForName3, "forName(...)");
        f67325wkgbmnqykc = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(charsetForName4, "forName(...)");
        f67319eablkybsjg = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(charsetForName5, "forName(...)");
        f67320gxszxtbevo = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(charsetForName6, "forName(...)");
        f67322lqeggnwhkg = charsetForName6;
    }

    private wkgbmnqykc() {
    }

    public final Charset iobyxmoadg() {
        Charset charset = f67318dxjokdxxww;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(charsetForName, "forName(...)");
        f67318dxjokdxxww = charsetForName;
        return charsetForName;
    }

    public final Charset zoijcleaow() {
        Charset charset = f67323nufgyqmvbu;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(charsetForName, "forName(...)");
        f67323nufgyqmvbu = charsetForName;
        return charsetForName;
    }
}
