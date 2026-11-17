package xb2;

import android.content.Context;
import android.provider.Settings;
import gg.wwaezpbzkn;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import mj.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo implements eablkybsjg {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final iobyxmoadg f122022wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f122023iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f122024ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ppxfxbqfkf f122025zoijcleaow;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public gxszxtbevo(Context appContext, ppxfxbqfkf deviceIdPreferences) {
        zdlpuopuiu.btonecajqb(appContext, "appContext");
        zdlpuopuiu.btonecajqb(deviceIdPreferences, "deviceIdPreferences");
        this.f122023iobyxmoadg = appContext;
        this.f122025zoijcleaow = deviceIdPreferences;
        this.f122024ppxfxbqfkf = deviceIdPreferences.iobyxmoadg(appContext);
    }

    private final String ppxfxbqfkf(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset UTF_8 = StandardCharsets.UTF_8;
        zdlpuopuiu.dxjokdxxww(UTF_8, "UTF_8");
        byte[] bytes = str.getBytes(UTF_8);
        zdlpuopuiu.dxjokdxxww(bytes, "this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes);
        byte[] hash = messageDigest.digest();
        StringBuilder sb3 = new StringBuilder();
        zdlpuopuiu.dxjokdxxww(hash, "hash");
        for (byte b13 : hash) {
            String str2 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b13)}, 1));
            zdlpuopuiu.dxjokdxxww(str2, "format(this, *args)");
            sb3.append(str2);
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "hexString.toString()");
        return string;
    }

    private final String zoijcleaow() throws NoSuchAlgorithmException {
        String androidId = Settings.System.getString(this.f122023iobyxmoadg.getContentResolver(), "android_id");
        zdlpuopuiu.dxjokdxxww(androidId, "androidId");
        return kcexrzcfyt.p(new rgvfuqvkyq("[\\r\\n\\t]").rgvfuqvkyq(ppxfxbqfkf(androidId), "")).toString();
    }

    @Override // xb2.eablkybsjg
    public String iobyxmoadg() {
        if (this.f122024ppxfxbqfkf.length() == 0) {
            synchronized (this) {
                try {
                    if (this.f122024ppxfxbqfkf.length() == 0) {
                        String strZoijcleaow = zoijcleaow();
                        this.f122024ppxfxbqfkf = strZoijcleaow;
                        this.f122025zoijcleaow.zoijcleaow(this.f122023iobyxmoadg, strZoijcleaow);
                    }
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f122024ppxfxbqfkf;
    }
}
