package et1;

import ct1.SplashDto;
import it1.Splash;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {
    private static final Splash.ppxfxbqfkf iobyxmoadg(String str) {
        if (zdlpuopuiu.eablkybsjg(kcexrzcfyt.g(str, ".", null, 2, null), "png")) {
            return Splash.ppxfxbqfkf.PNG;
        }
        if (zdlpuopuiu.eablkybsjg(kcexrzcfyt.g(str, ".", null, 2, null), "json")) {
            return Splash.ppxfxbqfkf.LOTTIE;
        }
        return null;
    }

    public static final Splash ppxfxbqfkf(dt1.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        return new Splash(iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.wkgbmnqykc(), Splash.ppxfxbqfkf.valueOf(iobyxmoadgVar.lqeggnwhkg()), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.gxszxtbevo());
    }

    public static final dt1.iobyxmoadg wkgbmnqykc(Splash splash) {
        zdlpuopuiu.btonecajqb(splash, "<this>");
        return new dt1.iobyxmoadg(splash.getId(), splash.getFilePath(), splash.getType().name(), splash.getEndTime(), splash.getShowCount());
    }

    public static final Splash zoijcleaow(SplashDto splashDto, int i13, String fileUrl) {
        zdlpuopuiu.btonecajqb(splashDto, "<this>");
        zdlpuopuiu.btonecajqb(fileUrl, "fileUrl");
        Splash.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = iobyxmoadg(fileUrl);
        if (ppxfxbqfkfVarIobyxmoadg == null) {
            return null;
        }
        return new Splash(splashDto.getId(), fileUrl, ppxfxbqfkfVarIobyxmoadg, splashDto.getValidUntil(), i13);
    }
}
