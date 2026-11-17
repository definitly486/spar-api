package pj;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bfopjjpdmp extends pkzmftpjix implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f76673yggfygwlhe = new iobyxmoadg(null);

    public static final class iobyxmoadg extends lg.zoijcleaow {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bfopjjpdmp wkgbmnqykc(lg.btonecajqb.zoijcleaow zoijcleaowVar) {
            if (zoijcleaowVar instanceof bfopjjpdmp) {
                return (bfopjjpdmp) zoijcleaowVar;
            }
            return null;
        }

        private iobyxmoadg() {
            super(pkzmftpjix.f76761zdlpuopuiu, new tg.draadjrbmk() { // from class: pj.oipsdeybqn
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return bfopjjpdmp.iobyxmoadg.wkgbmnqykc((lg.btonecajqb.zoijcleaow) obj);
                }
            });
        }
    }

    public abstract Executor xrmfcynszj();
}
