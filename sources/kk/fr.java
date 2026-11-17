package kk;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes3.dex */
public final class fr extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.uo f56584zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr(npi.spay.uo uoVar) {
        super(0);
        this.f56584zdlpuopuiu = uoVar;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        Object systemService = this.f56584zdlpuopuiu.requireContext().getSystemService("clipboard");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        Context context = this.f56584zdlpuopuiu.requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "requireContext()");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb("SDK_logs", "directory");
        File[] externalFilesDirs = androidx.core.content.iobyxmoadg.getExternalFilesDirs(context, null);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(externalFilesDirs, "getExternalFilesDirs(context, null)");
        File file = new File((File) hg.agtfadlqog.ydmasvzmpa(externalFilesDirs), "SDK_logs");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, "");
        if (file2.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file2);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    StringBuilder sb3 = new StringBuilder();
                    char[] cArr = new char[UserVerificationMethods.USER_VERIFY_ALL];
                    while (true) {
                        int i13 = inputStreamReader.read(cArr);
                        if (i13 == -1) {
                            break;
                        }
                        sb3.append(cArr, 0, i13);
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            rg.zoijcleaow.iobyxmoadg(fileInputStream, th);
                            throw th2;
                        }
                    }
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("Log", sb3.toString()));
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    rg.zoijcleaow.iobyxmoadg(inputStreamReader, null);
                    rg.zoijcleaow.iobyxmoadg(fileInputStream, null);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        rg.zoijcleaow.iobyxmoadg(inputStreamReader, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
