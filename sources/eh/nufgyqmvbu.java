package eh;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface nufgyqmvbu {

    public static final class iobyxmoadg {
        public static void iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, Object[] args) {
            zdlpuopuiu.btonecajqb(args, "args");
            if (btonecajqb.iobyxmoadg(nufgyqmvbuVar) == args.length) {
                return;
            }
            throw new IllegalArgumentException("Callable expects " + btonecajqb.iobyxmoadg(nufgyqmvbuVar) + " arguments, but " + args.length + " were provided.");
        }
    }

    Object call(Object[] objArr);

    Type getReturnType();

    List iobyxmoadg();

    Member zoijcleaow();
}
