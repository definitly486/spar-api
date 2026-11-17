package tb2;

import bc2.zoijcleaow;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.security.InvalidParameterException;
import kotlin.jvm.internal.zdlpuopuiu;
import rb2.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f110223eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private String f110224gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f110225iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f110226ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private ppxfxbqfkf f110227wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private String f110228zoijcleaow;

    public iobyxmoadg(String url, String apiKey) {
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        this.f110225iobyxmoadg = url;
        this.f110228zoijcleaow = apiKey;
        this.f110226ppxfxbqfkf = 10;
        this.f110227wkgbmnqykc = new zoijcleaow();
        this.f110223eablkybsjg = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
        this.f110224gxszxtbevo = "";
    }

    public final String eablkybsjg() {
        return this.f110225iobyxmoadg;
    }

    public final void gxszxtbevo(int i13) {
        if (i13 <= 0) {
            throw new InvalidParameterException("Размер пакета не может быть меньше или равен 0");
        }
        this.f110226ppxfxbqfkf = i13;
    }

    public final String iobyxmoadg() {
        return this.f110228zoijcleaow;
    }

    public final void lqeggnwhkg(long j13) {
        if (j13 <= 1000) {
            throw new InvalidParameterException("Задержка таймера не может быть меньше 1 секунды");
        }
        this.f110223eablkybsjg = j13;
    }

    public final int ppxfxbqfkf() {
        return this.f110226ppxfxbqfkf;
    }

    public final long wkgbmnqykc() {
        return this.f110223eablkybsjg;
    }

    public final ppxfxbqfkf zoijcleaow() {
        return this.f110227wkgbmnqykc;
    }
}
