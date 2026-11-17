package ph;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yadqdtsiqt implements zh.cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f76617iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final yadqdtsiqt iobyxmoadg(Type type) {
            yadqdtsiqt wflxmlrfwpVar;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            boolean z13 = type instanceof Class;
            if (z13) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new istkbnxepw(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z13 && ((Class) type).isArray())) {
                wflxmlrfwpVar = new wflxmlrfwp(type);
            } else {
                wflxmlrfwpVar = type instanceof WildcardType ? new wwaezpbzkn((WildcardType) type) : new kcexrzcfyt(type);
            }
            return wflxmlrfwpVar;
        }

        private iobyxmoadg() {
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof yadqdtsiqt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(stevsuqkhv(), ((yadqdtsiqt) obj).stevsuqkhv());
    }

    public int hashCode() {
        return stevsuqkhv().hashCode();
    }

    @Override // zh.wkgbmnqykc
    public zh.iobyxmoadg lqeggnwhkg(ii.ppxfxbqfkf fqName) {
        Object obj;
        Object next;
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                zoijcleaowVarPpxfxbqfkf = ((zh.iobyxmoadg) next).ppxfxbqfkf();
            }
            return (zh.iobyxmoadg) obj;
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVarPpxfxbqfkf != null ? zoijcleaowVarPpxfxbqfkf.iobyxmoadg() : null, fqName));
        obj = next;
        return (zh.iobyxmoadg) obj;
    }

    protected abstract Type stevsuqkhv();

    public String toString() {
        return getClass().getName() + ": " + stevsuqkhv();
    }
}
