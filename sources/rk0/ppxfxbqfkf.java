package rk0;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m9.wkgbmnqykc;
import ru.myspar.profile.api.model.ProfileScreenPayload;
import ru.myspar.profile.impl.profile_screen.presentation.ProfileFragmentCompose;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf implements qk0.zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment wkgbmnqykc(ProfileScreenPayload profileScreenPayload, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return ProfileFragmentCompose.INSTANCE.iobyxmoadg(profileScreenPayload);
    }

    @Override // qk0.zoijcleaow
    public wkgbmnqykc iobyxmoadg(final ProfileScreenPayload arg) {
        zdlpuopuiu.btonecajqb(arg, "arg");
        return wkgbmnqykc.iobyxmoadg.zoijcleaow(wkgbmnqykc.f66572zoijcleaow, "PROFILE_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: rk0.zoijcleaow
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ppxfxbqfkf.wkgbmnqykc(arg, (jyumaefscl) obj);
            }
        }, 2, null);
    }
}
