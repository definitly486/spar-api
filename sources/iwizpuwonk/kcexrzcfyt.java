package iwizpuwonk;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import istkbnxepw.oipsdeybqn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ExtraCroppingQuirk f49819iobyxmoadg;

    public kcexrzcfyt() {
        this((ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.zoijcleaow.zoijcleaow(ExtraCroppingQuirk.class));
    }

    public List iobyxmoadg(oipsdeybqn.zoijcleaow zoijcleaowVar, List list) {
        Size sizePpxfxbqfkf;
        ExtraCroppingQuirk extraCroppingQuirk = this.f49819iobyxmoadg;
        if (extraCroppingQuirk == null || (sizePpxfxbqfkf = extraCroppingQuirk.ppxfxbqfkf(zoijcleaowVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(sizePpxfxbqfkf);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!size.equals(sizePpxfxbqfkf)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    kcexrzcfyt(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f49819iobyxmoadg = extraCroppingQuirk;
    }
}
