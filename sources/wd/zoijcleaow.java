package wd;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements nufgyqmvbu {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final iobyxmoadg f119406zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Bundle f119407iobyxmoadg;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public zoijcleaow(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData;
        this.f119407iobyxmoadg = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // wd.nufgyqmvbu
    public Boolean iobyxmoadg() {
        if (this.f119407iobyxmoadg.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f119407iobyxmoadg.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // wd.nufgyqmvbu
    public Double ppxfxbqfkf() {
        if (this.f119407iobyxmoadg.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f119407iobyxmoadg.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // wd.nufgyqmvbu
    public Object wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
        return nufgyqmvbu.iobyxmoadg.iobyxmoadg(this, gxszxtbevoVar);
    }

    @Override // wd.nufgyqmvbu
    public nj.iobyxmoadg zoijcleaow() {
        if (this.f119407iobyxmoadg.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return nj.iobyxmoadg.gxszxtbevo(nj.ppxfxbqfkf.kcexrzcfyt(this.f119407iobyxmoadg.getInt("firebase_sessions_sessions_restart_timeout"), nj.wkgbmnqykc.SECONDS));
        }
        return null;
    }
}
