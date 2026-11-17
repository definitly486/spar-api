package zi;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ikoacuggdj extends grlcpdaxtj implements dj.btonecajqb, dj.gtknphoqwx {
    public ikoacuggdj() {
        super(null);
    }

    public abstract ikoacuggdj eslsurpljm(opjhrmiecq opjhrmiecqVar);

    public String toString() throws IOException {
        StringBuilder sb3 = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            mj.kcexrzcfyt.wflxmlrfwp(sb3, "[", ki.agtfadlqog.stevsuqkhv(ki.agtfadlqog.f55532gtknphoqwx, (kh.ppxfxbqfkf) it.next(), null, 2, null), "] ");
        }
        sb3.append(grlcpdaxtj());
        if (!fyldjkxazc().isEmpty()) {
            hg.wwaezpbzkn.roivzttewh(fyldjkxazc(), sb3, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "<", (124 & 8) == 0 ? ">" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        if (mhtqkkgtqm()) {
            sb3.append("?");
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public abstract ikoacuggdj yzdjzghtvl(boolean z13);
}
