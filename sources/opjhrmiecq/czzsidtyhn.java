package opjhrmiecq;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class czzsidtyhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Integer f73516iobyxmoadg;

    public final Integer iobyxmoadg(KeyEvent keyEvent) {
        int iPpxfxbqfkf = r.wkgbmnqykc.ppxfxbqfkf(keyEvent);
        if ((Integer.MIN_VALUE & iPpxfxbqfkf) != 0) {
            this.f73516iobyxmoadg = Integer.valueOf(iPpxfxbqfkf & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.f73516iobyxmoadg;
        if (num == null) {
            return Integer.valueOf(iPpxfxbqfkf);
        }
        this.f73516iobyxmoadg = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iPpxfxbqfkf));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        if (num2 != null) {
            iPpxfxbqfkf = num2.intValue();
        }
        return Integer.valueOf(iPpxfxbqfkf);
    }
}
