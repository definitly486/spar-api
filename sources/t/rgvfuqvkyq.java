package t;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f109150eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f109151gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f109152iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f109153ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f109154wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gxszxtbevo f109155zoijcleaow;

    public rgvfuqvkyq(List list, gxszxtbevo gxszxtbevoVar) {
        MotionEvent motionEventGxszxtbevo;
        this.f109152iobyxmoadg = list;
        this.f109155zoijcleaow = gxszxtbevoVar;
        this.f109153ppxfxbqfkf = (Build.VERSION.SDK_INT < 29 || (motionEventGxszxtbevo = gxszxtbevo()) == null) ? 0 : motionEventGxszxtbevo.getClassification();
        MotionEvent motionEventGxszxtbevo2 = gxszxtbevo();
        this.f109154wkgbmnqykc = agtfadlqog.iobyxmoadg(motionEventGxszxtbevo2 != null ? motionEventGxszxtbevo2.getButtonState() : 0);
        MotionEvent motionEventGxszxtbevo3 = gxszxtbevo();
        this.f109150eablkybsjg = hkdspvbjdz.zoijcleaow(motionEventGxszxtbevo3 != null ? motionEventGxszxtbevo3.getMetaState() : 0);
        this.f109151gxszxtbevo = iobyxmoadg();
    }

    private final int iobyxmoadg() {
        MotionEvent motionEventGxszxtbevo = gxszxtbevo();
        if (motionEventGxszxtbevo == null) {
            List list = this.f109152iobyxmoadg;
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                pmvmpeiblj pmvmpeibljVar = (pmvmpeiblj) list.get(i13);
                if (vdvldrhtss.wkgbmnqykc(pmvmpeibljVar)) {
                    return kcexrzcfyt.f109096iobyxmoadg.eablkybsjg();
                }
                if (vdvldrhtss.zoijcleaow(pmvmpeibljVar)) {
                    return kcexrzcfyt.f109096iobyxmoadg.wkgbmnqykc();
                }
            }
            return kcexrzcfyt.f109096iobyxmoadg.ppxfxbqfkf();
        }
        int actionMasked = motionEventGxszxtbevo.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return kcexrzcfyt.f109096iobyxmoadg.gxszxtbevo();
                        case 9:
                            return kcexrzcfyt.f109096iobyxmoadg.iobyxmoadg();
                        case 10:
                            return kcexrzcfyt.f109096iobyxmoadg.zoijcleaow();
                        default:
                            return kcexrzcfyt.f109096iobyxmoadg.lqeggnwhkg();
                    }
                }
                return kcexrzcfyt.f109096iobyxmoadg.ppxfxbqfkf();
            }
            return kcexrzcfyt.f109096iobyxmoadg.eablkybsjg();
        }
        return kcexrzcfyt.f109096iobyxmoadg.wkgbmnqykc();
    }

    public final gxszxtbevo eablkybsjg() {
        return this.f109155zoijcleaow;
    }

    public final MotionEvent gxszxtbevo() {
        gxszxtbevo gxszxtbevoVar = this.f109155zoijcleaow;
        if (gxszxtbevoVar != null) {
            return gxszxtbevoVar.ppxfxbqfkf();
        }
        return null;
    }

    public final int lqeggnwhkg() {
        return this.f109151gxszxtbevo;
    }

    public final void nufgyqmvbu(int i13) {
        this.f109151gxszxtbevo = i13;
    }

    public final List ppxfxbqfkf() {
        return this.f109152iobyxmoadg;
    }

    public final int wkgbmnqykc() {
        return this.f109153ppxfxbqfkf;
    }

    public final int zoijcleaow() {
        return this.f109154wkgbmnqykc;
    }

    public rgvfuqvkyq(List list) {
        this(list, null);
    }
}
