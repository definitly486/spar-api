package rb2;

import android.content.Context;
import com.google.android.gms.location.DeviceOrientationRequest;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import wb2.eablkybsjg;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ub2.iobyxmoadg f82503iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f82504zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f82505eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private long f82506gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f82507iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Context f82508ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private dc2.zoijcleaow f82509wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f82510zoijcleaow;

        public iobyxmoadg(String apiKey, String url, Context context) {
            zdlpuopuiu.btonecajqb(apiKey, "apiKey");
            zdlpuopuiu.btonecajqb(url, "url");
            zdlpuopuiu.btonecajqb(context, "context");
            this.f82507iobyxmoadg = apiKey;
            this.f82510zoijcleaow = url;
            this.f82508ppxfxbqfkf = context;
            this.f82505eablkybsjg = 10;
            this.f82506gxszxtbevo = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
        }

        public final zoijcleaow iobyxmoadg() {
            tb2.iobyxmoadg iobyxmoadgVar = new tb2.iobyxmoadg(this.f82510zoijcleaow, this.f82507iobyxmoadg);
            iobyxmoadgVar.lqeggnwhkg(this.f82506gxszxtbevo);
            iobyxmoadgVar.gxszxtbevo(this.f82505eablkybsjg);
            yb2.iobyxmoadg iobyxmoadgVar2 = yb2.iobyxmoadg.f124337iobyxmoadg;
            Context context = this.f82508ppxfxbqfkf;
            dc2.zoijcleaow zoijcleaowVar = this.f82509wkgbmnqykc;
            if (zoijcleaowVar != null) {
                return new zoijcleaow(iobyxmoadgVar2.nufgyqmvbu(context, zoijcleaowVar, iobyxmoadgVar), iobyxmoadgVar2.oxmwwwfdhm(), null);
            }
            throw new IllegalStateException("NetworkClientBuilder must be set");
        }

        public final iobyxmoadg zoijcleaow(dc2.zoijcleaow networkClientBuilder) {
            zdlpuopuiu.btonecajqb(networkClientBuilder, "networkClientBuilder");
            this.f82509wkgbmnqykc = networkClientBuilder;
            return this;
        }
    }

    public /* synthetic */ zoijcleaow(ub2.iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar, gtknphoqwx gtknphoqwxVar) {
        this(iobyxmoadgVar, eablkybsjgVar);
    }

    public final void iobyxmoadg(rb2.iobyxmoadg event) {
        zdlpuopuiu.btonecajqb(event, "event");
        this.f82503iobyxmoadg.iobyxmoadg(event);
    }

    public final void zoijcleaow(String hashUserLoginId) {
        zdlpuopuiu.btonecajqb(hashUserLoginId, "hashUserLoginId");
        eablkybsjg eablkybsjgVar = this.f82504zoijcleaow;
        if (eablkybsjgVar != null) {
            eablkybsjgVar.iobyxmoadg(hashUserLoginId);
        }
    }

    private zoijcleaow(ub2.iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar) {
        this.f82503iobyxmoadg = iobyxmoadgVar;
        this.f82504zoijcleaow = eablkybsjgVar;
    }
}
