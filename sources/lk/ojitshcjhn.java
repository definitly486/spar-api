package lk;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ojitshcjhn f63177iobyxmoadg = new ojitshcjhn();

    private ojitshcjhn() {
    }

    public static final String iobyxmoadg(String username, String password, Charset charset) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(username, "username");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(password, "password");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charset, "charset");
        return "Basic " + bl.gxszxtbevo.f16674iwizpuwonk.ppxfxbqfkf(username + ':' + password, charset).wkgbmnqykc();
    }
}
