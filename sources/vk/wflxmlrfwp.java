package vk;

import kotlin.jvm.internal.zdlpuopuiu;
import uk.agtfadlqog;

/* JADX INFO: loaded from: classes3.dex */
public final class wflxmlrfwp extends nufgyqmvbu {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final iobyxmoadg f117476btonecajqb = new iobyxmoadg(null);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final Class f117477dxjokdxxww;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Class f117478nufgyqmvbu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public static /* synthetic */ draadjrbmk zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return iobyxmoadgVar.iobyxmoadg(str);
        }

        public final draadjrbmk iobyxmoadg(String packageName) {
            zdlpuopuiu.btonecajqb(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                zdlpuopuiu.nufgyqmvbu(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                zdlpuopuiu.nufgyqmvbu(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                zdlpuopuiu.dxjokdxxww(paramsClass, "paramsClass");
                return new wflxmlrfwp(cls, cls2, paramsClass);
            } catch (Exception e13) {
                agtfadlqog.f113749iobyxmoadg.lqeggnwhkg().btonecajqb("unable to load android socket classes", 5, e13);
                return null;
            }
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wflxmlrfwp(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        zdlpuopuiu.btonecajqb(sslSocketClass, "sslSocketClass");
        zdlpuopuiu.btonecajqb(sslSocketFactoryClass, "sslSocketFactoryClass");
        zdlpuopuiu.btonecajqb(paramClass, "paramClass");
        this.f117478nufgyqmvbu = sslSocketFactoryClass;
        this.f117477dxjokdxxww = paramClass;
    }
}
