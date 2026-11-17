package k7;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f54101iobyxmoadg = new ArrayList();

    void iobyxmoadg(yggfygwlhe yggfygwlheVar) {
        this.f54101iobyxmoadg.add(yggfygwlheVar);
    }

    public void zoijcleaow(Path path) {
        for (int size = this.f54101iobyxmoadg.size() - 1; size >= 0; size--) {
            v7.btonecajqb.zoijcleaow(path, (yggfygwlhe) this.f54101iobyxmoadg.get(size));
        }
    }
}
