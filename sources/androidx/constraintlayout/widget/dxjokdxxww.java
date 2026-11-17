package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private SparseIntArray f8093iobyxmoadg = new SparseIntArray();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private HashMap f8094zoijcleaow = new HashMap();

    public interface iobyxmoadg {
    }

    public void iobyxmoadg(int i13, iobyxmoadg iobyxmoadgVar) {
        HashSet hashSet = (HashSet) this.f8094zoijcleaow.get(Integer.valueOf(i13));
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f8094zoijcleaow.put(Integer.valueOf(i13), hashSet);
        }
        hashSet.add(new WeakReference(iobyxmoadgVar));
    }
}
