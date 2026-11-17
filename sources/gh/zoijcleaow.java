package gh;

import hg.jyumaefscl;
import java.util.ServiceLoader;
import jh.cllcsxoeiz;
import jh.lmojexxdyd;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f37387iobyxmoadg = iobyxmoadg.f37388iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f37388iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final gg.gtknphoqwx f37389zoijcleaow = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.PUBLICATION, gh.iobyxmoadg.f37229zdlpuopuiu);

        private iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zoijcleaow iobyxmoadg() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(zoijcleaow.class, zoijcleaow.class.getClassLoader());
            zdlpuopuiu.lqeggnwhkg(serviceLoaderLoad);
            zoijcleaow zoijcleaowVar = (zoijcleaow) jyumaefscl.iyctptxqzt(serviceLoaderLoad);
            if (zoijcleaowVar != null) {
                return zoijcleaowVar;
            }
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }

        public final zoijcleaow ppxfxbqfkf() {
            return (zoijcleaow) f37389zoijcleaow.getValue();
        }
    }

    cllcsxoeiz iobyxmoadg(yi.agtfadlqog agtfadlqogVar, lmojexxdyd lmojexxdydVar, Iterable iterable, lh.ppxfxbqfkf ppxfxbqfkfVar, lh.iobyxmoadg iobyxmoadgVar, boolean z13);
}
