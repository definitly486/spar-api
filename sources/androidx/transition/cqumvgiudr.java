package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Map f13437iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final ArrayList f13438ppxfxbqfkf = new ArrayList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public View f13439zoijcleaow;

    public cqumvgiudr(View view) {
        this.f13439zoijcleaow = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cqumvgiudr)) {
            return false;
        }
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) obj;
        return this.f13439zoijcleaow == cqumvgiudrVar.f13439zoijcleaow && this.f13437iobyxmoadg.equals(cqumvgiudrVar.f13437iobyxmoadg);
    }

    public int hashCode() {
        return (this.f13439zoijcleaow.hashCode() * 31) + this.f13437iobyxmoadg.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f13439zoijcleaow + "\n") + "    values:";
        for (String str2 : this.f13437iobyxmoadg.keySet()) {
            str = str + "    " + str2 + ": " + this.f13437iobyxmoadg.get(str2) + "\n";
        }
        return str;
    }
}
