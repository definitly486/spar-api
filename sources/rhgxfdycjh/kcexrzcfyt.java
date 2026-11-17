package rhgxfdycjh;

import androidx.collection.dsvhmnatus;
import androidx.compose.runtime.a;
import androidx.compose.runtime.lmojexxdyd;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final a f82665iobyxmoadg = lmojexxdyd.btonecajqb(new tg.iobyxmoadg() { // from class: rhgxfdycjh.oxmwwwfdhm
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return kcexrzcfyt.zoijcleaow();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gxszxtbevo(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i13 = 0; i13 < length; i13++) {
            if (!mj.iobyxmoadg.ppxfxbqfkf(charSequence.charAt(i13))) {
                return false;
            }
        }
        return true;
    }

    public static final a lqeggnwhkg() {
        return f82665iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dsvhmnatus nufgyqmvbu(Map map) {
        dsvhmnatus dsvhmnatusVar = new dsvhmnatus(map.size());
        dsvhmnatusVar.zdlpuopuiu(map);
        return dsvhmnatusVar;
    }

    public static final rgvfuqvkyq ppxfxbqfkf(Map map, tg.draadjrbmk draadjrbmkVar) {
        return new vdvldrhtss(map, draadjrbmkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rgvfuqvkyq zoijcleaow() {
        return null;
    }
}
