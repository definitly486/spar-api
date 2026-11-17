package n5;

import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class esjtqupxsv implements u5.nufgyqmvbu.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f68802iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Callable f68803ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final u5.nufgyqmvbu.ppxfxbqfkf f68804wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final File f68805zoijcleaow;

    public esjtqupxsv(String str, File file, Callable callable, u5.nufgyqmvbu.ppxfxbqfkf mDelegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mDelegate, "mDelegate");
        this.f68802iobyxmoadg = str;
        this.f68805zoijcleaow = file;
        this.f68803ppxfxbqfkf = callable;
        this.f68804wkgbmnqykc = mDelegate;
    }

    @Override // u5.nufgyqmvbu.ppxfxbqfkf
    public u5.nufgyqmvbu iobyxmoadg(u5.nufgyqmvbu.zoijcleaow configuration) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configuration, "configuration");
        return new cqumvgiudr(configuration.f112694iobyxmoadg, this.f68802iobyxmoadg, this.f68805zoijcleaow, this.f68803ppxfxbqfkf, configuration.f112695ppxfxbqfkf.f112691iobyxmoadg, this.f68804wkgbmnqykc.iobyxmoadg(configuration));
    }
}
