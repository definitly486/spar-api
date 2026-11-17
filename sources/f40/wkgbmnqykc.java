package f40;

import androidx.fragment.app.Fragment;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final List f32789iobyxmoadg = jyumaefscl.rgvfuqvkyq(SupportRequestManagerFragment.class.getSimpleName(), "OverlayFragment");

    private static final String iobyxmoadg(Object obj) {
        return obj != null ? obj.getClass().getSimpleName() : "null";
    }

    public static final boolean zoijcleaow(Fragment fragment) {
        zdlpuopuiu.btonecajqb(fragment, "<this>");
        return !f32789iobyxmoadg.contains(iobyxmoadg(fragment));
    }
}
