package wa;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class yggfygwlhe extends ojitshcjhn {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    final /* synthetic */ cqumvgiudr f119146jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final /* synthetic */ IBinder f119147yggfygwlhe;

    yggfygwlhe(cqumvgiudr cqumvgiudrVar, IBinder iBinder) {
        this.f119146jyumaefscl = cqumvgiudrVar;
        this.f119147yggfygwlhe = iBinder;
    }

    @Override // wa.ojitshcjhn
    public final void zoijcleaow() {
        this.f119146jyumaefscl.f119115zdlpuopuiu.f119128wflxmlrfwp = btonecajqb.agtfadlqog(this.f119147yggfygwlhe);
        esjtqupxsv.agtfadlqog(this.f119146jyumaefscl.f119115zdlpuopuiu);
        this.f119146jyumaefscl.f119115zdlpuopuiu.f119125lqeggnwhkg = false;
        Iterator it = this.f119146jyumaefscl.f119115zdlpuopuiu.f119129wkgbmnqykc.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f119146jyumaefscl.f119115zdlpuopuiu.f119129wkgbmnqykc.clear();
    }
}
