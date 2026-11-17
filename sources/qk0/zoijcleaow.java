package qk0;

import m9.wkgbmnqykc;
import ru.myspar.profile.api.model.ProfileScreenPayload;

/* JADX INFO: loaded from: classes4.dex */
public interface zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f79079iobyxmoadg = iobyxmoadg.f79080iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f79080iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }
    }

    static /* synthetic */ wkgbmnqykc zoijcleaow(zoijcleaow zoijcleaowVar, ProfileScreenPayload profileScreenPayload, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: profileScreen");
        }
        if ((i13 & 1) != 0) {
            profileScreenPayload = new ProfileScreenPayload(null, null, 3, null);
        }
        return zoijcleaowVar.iobyxmoadg(profileScreenPayload);
    }

    wkgbmnqykc iobyxmoadg(ProfileScreenPayload profileScreenPayload);
}
