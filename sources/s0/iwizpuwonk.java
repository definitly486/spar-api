package s0;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import j0.q;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final WeakHashMap f105131iobyxmoadg = new WeakHashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final WeakHashMap f105133zoijcleaow = new WeakHashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final WeakHashMap f105132ppxfxbqfkf = new WeakHashMap();

    public final ClickableSpan iobyxmoadg(j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar) {
        WeakHashMap weakHashMap = this.f105132ppxfxbqfkf;
        Object agtfadlqogVar = weakHashMap.get(wkgbmnqykcVar);
        if (agtfadlqogVar == null) {
            agtfadlqogVar = new agtfadlqog((j0.vdvldrhtss) wkgbmnqykcVar.lqeggnwhkg());
            weakHashMap.put(wkgbmnqykcVar, agtfadlqogVar);
        }
        return (ClickableSpan) agtfadlqogVar;
    }

    public final URLSpan ppxfxbqfkf(q qVar) {
        WeakHashMap weakHashMap = this.f105131iobyxmoadg;
        Object uRLSpan = weakHashMap.get(qVar);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(qVar.iobyxmoadg());
            weakHashMap.put(qVar, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }

    public final URLSpan zoijcleaow(j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar) {
        WeakHashMap weakHashMap = this.f105133zoijcleaow;
        Object uRLSpan = weakHashMap.get(wkgbmnqykcVar);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(((j0.vdvldrhtss.zoijcleaow) wkgbmnqykcVar.lqeggnwhkg()).eablkybsjg());
            weakHashMap.put(wkgbmnqykcVar, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }
}
