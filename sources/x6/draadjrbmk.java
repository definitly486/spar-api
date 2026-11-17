package x6;

import hg.ikoacuggdj;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Set f121205iobyxmoadg = ikoacuggdj.dxjokdxxww("image/jpeg", "image/webp", "image/heic", "image/heif");

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f121206iobyxmoadg;

        static {
            int[] iArr = new int[btonecajqb.values().length];
            try {
                iArr[btonecajqb.RESPECT_PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[btonecajqb.IGNORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[btonecajqb.RESPECT_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f121206iobyxmoadg = iArr;
        }
    }

    public static final boolean iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.iobyxmoadg() > 0;
    }

    public static final boolean ppxfxbqfkf(btonecajqb btonecajqbVar, String str) {
        int i13 = iobyxmoadg.f121206iobyxmoadg[btonecajqbVar.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                return false;
            }
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (str == null || !f121205iobyxmoadg.contains(str)) {
            return false;
        }
        return true;
    }

    public static final boolean zoijcleaow(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.iobyxmoadg() == 90 || nufgyqmvbuVar.iobyxmoadg() == 270;
    }
}
