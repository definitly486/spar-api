package z8;

import androidx.lifecycle.istkbnxepw;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class gtknphoqwx implements btonecajqb, androidx.lifecycle.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final androidx.lifecycle.gtknphoqwx f129269yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Set f129270zdlpuopuiu = new HashSet();

    gtknphoqwx(androidx.lifecycle.gtknphoqwx gtknphoqwxVar) {
        this.f129269yggfygwlhe = gtknphoqwxVar;
        gtknphoqwxVar.iobyxmoadg(this);
    }

    @Override // z8.btonecajqb
    public void iobyxmoadg(draadjrbmk draadjrbmkVar) {
        this.f129270zdlpuopuiu.add(draadjrbmkVar);
        if (this.f129269yggfygwlhe.zoijcleaow() == androidx.lifecycle.gtknphoqwx.zoijcleaow.DESTROYED) {
            draadjrbmkVar.onDestroy();
        } else if (this.f129269yggfygwlhe.zoijcleaow().wkgbmnqykc(androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED)) {
            draadjrbmkVar.onStart();
        } else {
            draadjrbmkVar.onStop();
        }
    }

    @istkbnxepw(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY)
    public void onDestroy(androidx.lifecycle.vdvldrhtss vdvldrhtssVar) {
        Iterator it = g9.draadjrbmk.btonecajqb(this.f129270zdlpuopuiu).iterator();
        while (it.hasNext()) {
            ((draadjrbmk) it.next()).onDestroy();
        }
        vdvldrhtssVar.getLifecycle().wkgbmnqykc(this);
    }

    @istkbnxepw(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_START)
    public void onStart(androidx.lifecycle.vdvldrhtss vdvldrhtssVar) {
        Iterator it = g9.draadjrbmk.btonecajqb(this.f129270zdlpuopuiu).iterator();
        while (it.hasNext()) {
            ((draadjrbmk) it.next()).onStart();
        }
    }

    @istkbnxepw(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_STOP)
    public void onStop(androidx.lifecycle.vdvldrhtss vdvldrhtssVar) {
        Iterator it = g9.draadjrbmk.btonecajqb(this.f129270zdlpuopuiu).iterator();
        while (it.hasNext()) {
            ((draadjrbmk) it.next()).onStop();
        }
    }

    @Override // z8.btonecajqb
    public void zoijcleaow(draadjrbmk draadjrbmkVar) {
        this.f129270zdlpuopuiu.remove(draadjrbmkVar);
    }
}
