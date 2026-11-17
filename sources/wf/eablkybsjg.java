package wf;

import androidx.appcompat.app.yggfygwlhe;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg implements rf.iobyxmoadg, rf.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f119475iobyxmoadg = new HashSet();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f119476zoijcleaow = false;

    public void iobyxmoadg() {
        uf.zoijcleaow.iobyxmoadg();
        this.f119476zoijcleaow = true;
        Iterator it = this.f119475iobyxmoadg.iterator();
        if (it.hasNext()) {
            yggfygwlhe.iobyxmoadg(it.next());
            throw null;
        }
    }
}
