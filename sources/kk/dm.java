package kk;

import android.content.Context;
import android.net.Uri;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import modern.payments.tracker.util.logging.LogFileManager;
import modern.payments.tracker.util.logging.PrettyLogFormatter;

/* JADX INFO: loaded from: classes3.dex */
public final class dm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ fn f56304yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f56305zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(fn fnVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f56304yggfygwlhe = fnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        dm dmVar = new dm(this.f56304yggfygwlhe, gxszxtbevoVar);
        dmVar.f56305zdlpuopuiu = obj;
        return dmVar;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        dm dmVar = new dm(this.f56304yggfygwlhe, (lg.gxszxtbevo) obj2);
        dmVar.f56305zdlpuopuiu = (pj.cllcsxoeiz) obj;
        return dmVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objWkgbmnqykc;
        String strPpxfxbqfkf;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        fn fnVar = this.f56304yggfygwlhe;
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            Context context = fnVar.f56579iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb("SDK_logs", "directory");
            File[] externalFilesDirs = androidx.core.content.iobyxmoadg.getExternalFilesDirs(context, null);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(externalFilesDirs, "getExternalFilesDirs(context, null)");
            File file = new File((File) hg.agtfadlqog.ydmasvzmpa(externalFilesDirs), "SDK_logs");
            if (!file.exists()) {
                file.mkdir();
            }
            InputStream inputStreamOpenInputStream = fnVar.f56579iobyxmoadg.getContentResolver().openInputStream(Uri.fromFile(new File(file, "")));
            BufferedReader bufferedReader = inputStreamOpenInputStream != null ? new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, mj.wkgbmnqykc.f67326zoijcleaow), 8192) : null;
            if (bufferedReader != null) {
                try {
                    strPpxfxbqfkf = rg.gtknphoqwx.ppxfxbqfkf(bufferedReader);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        rg.zoijcleaow.iobyxmoadg(bufferedReader, th2);
                        throw th3;
                    }
                }
            } else {
                strPpxfxbqfkf = null;
            }
            if (strPpxfxbqfkf != null && mj.kcexrzcfyt.sopmlzcsov(strPpxfxbqfkf, PrettyLogFormatter.DEFAULT_DOUBLE_DIVIDER, false, 2, null)) {
                strPpxfxbqfkf = mj.kcexrzcfyt.hcddaimhww(strPpxfxbqfkf, PrettyLogFormatter.DEFAULT_DOUBLE_DIVIDER, PrettyLogFormatter.SHORT_DOUBLE_DIVIDER, false, 4, null);
            }
            if (strPpxfxbqfkf != null && mj.kcexrzcfyt.sopmlzcsov(strPpxfxbqfkf, PrettyLogFormatter.DEFAULT_SINGLE_DIVIDER, false, 2, null)) {
                strPpxfxbqfkf = mj.kcexrzcfyt.hcddaimhww(strPpxfxbqfkf, PrettyLogFormatter.DEFAULT_SINGLE_DIVIDER, PrettyLogFormatter.SHORT_SINGLE_DIVIDER, false, 4, null);
            }
            rg.zoijcleaow.iobyxmoadg(bufferedReader, null);
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(strPpxfxbqfkf);
        } catch (Throwable th4) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th4));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq(LogFileManager.LOG_FILE_PARSE_ERROR_MESSAGE_TAG).ppxfxbqfkf(thDxjokdxxww);
        }
        if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            return null;
        }
        return objWkgbmnqykc;
    }
}
