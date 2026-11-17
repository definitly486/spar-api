package hk;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f40483iobyxmoadg = wflxmlrfwp.iobyxmoadg(16);

    public static final class iobyxmoadg {
    }

    public final Object iobyxmoadg(dk.gxszxtbevo descriptor, iobyxmoadg key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        Map map = (Map) this.f40483iobyxmoadg.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final void ppxfxbqfkf(dk.gxszxtbevo descriptor, iobyxmoadg key, Object value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        Map map = this.f40483iobyxmoadg;
        Object objIobyxmoadg = map.get(descriptor);
        if (objIobyxmoadg == null) {
            objIobyxmoadg = wflxmlrfwp.iobyxmoadg(2);
            map.put(descriptor, objIobyxmoadg);
        }
        ((Map) objIobyxmoadg).put(key, value);
    }

    public final Object zoijcleaow(dk.gxszxtbevo descriptor, iobyxmoadg key, tg.iobyxmoadg defaultValue) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(defaultValue, "defaultValue");
        Object objIobyxmoadg = iobyxmoadg(descriptor, key);
        if (objIobyxmoadg != null) {
            return objIobyxmoadg;
        }
        Object objInvoke = defaultValue.invoke();
        ppxfxbqfkf(descriptor, key, objInvoke);
        return objInvoke;
    }
}
