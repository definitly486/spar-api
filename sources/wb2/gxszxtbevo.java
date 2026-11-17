package wb2;

import android.content.Context;
import android.os.LocaleList;
import gg.draadjrbmk;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import xb2.gtknphoqwx;
import zb2.ProfileData;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo implements eablkybsjg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final iobyxmoadg f119229gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private String f119230eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f119231iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx f119232ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gg.gtknphoqwx f119233wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final xb2.eablkybsjg f119234zoijcleaow;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {
        zoijcleaow() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final String invoke() {
            return gxszxtbevo.this.eablkybsjg();
        }
    }

    public gxszxtbevo(Context appContext, xb2.eablkybsjg deviceIdProvider, gtknphoqwx sessionProvider) {
        zdlpuopuiu.btonecajqb(appContext, "appContext");
        zdlpuopuiu.btonecajqb(deviceIdProvider, "deviceIdProvider");
        zdlpuopuiu.btonecajqb(sessionProvider, "sessionProvider");
        this.f119231iobyxmoadg = appContext;
        this.f119234zoijcleaow = deviceIdProvider;
        this.f119232ppxfxbqfkf = sessionProvider;
        this.f119233wkgbmnqykc = draadjrbmk.zoijcleaow(new zoijcleaow());
        this.f119230eablkybsjg = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String eablkybsjg() {
        LocaleList locales = this.f119231iobyxmoadg.getResources().getConfiguration().getLocales();
        String language = locales.isEmpty() ? "UNKNOWN" : locales.get(0).getLanguage();
        zdlpuopuiu.dxjokdxxww(language, "appContext.resources.con…e\n            }\n        }");
        return language;
    }

    private final String wkgbmnqykc() {
        return (String) this.f119233wkgbmnqykc.getValue();
    }

    @Override // wb2.eablkybsjg
    public void iobyxmoadg(String hashUserLoginId) {
        zdlpuopuiu.btonecajqb(hashUserLoginId, "hashUserLoginId");
        this.f119230eablkybsjg = hashUserLoginId;
    }

    @Override // wb2.eablkybsjg
    public ProfileData zoijcleaow() {
        return new ProfileData(this.f119234zoijcleaow.iobyxmoadg(), wkgbmnqykc(), (String) null, this.f119232ppxfxbqfkf.getSessionId(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.f119230eablkybsjg, 8180, (kotlin.jvm.internal.gtknphoqwx) null);
    }
}
