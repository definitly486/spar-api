package eh;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class wkgbmnqykc implements InvocationHandler {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f31342eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Class f31343iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gg.gtknphoqwx f31344ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gg.gtknphoqwx f31345wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f31346zoijcleaow;

    public wkgbmnqykc(Class cls, Map map, gg.gtknphoqwx gtknphoqwxVar, gg.gtknphoqwx gtknphoqwxVar2, List list) {
        this.f31343iobyxmoadg = cls;
        this.f31346zoijcleaow = map;
        this.f31344ppxfxbqfkf = gtknphoqwxVar;
        this.f31345wkgbmnqykc = gtknphoqwxVar2;
        this.f31342eablkybsjg = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return gxszxtbevo.ojitshcjhn(this.f31343iobyxmoadg, this.f31346zoijcleaow, this.f31344ppxfxbqfkf, this.f31345wkgbmnqykc, this.f31342eablkybsjg, obj, method, objArr);
    }
}
