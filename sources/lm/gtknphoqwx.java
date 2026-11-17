package lm;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Method f63445iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f63446zoijcleaow;

    gtknphoqwx(Method method, List list) {
        this.f63445iobyxmoadg = method;
        this.f63446zoijcleaow = Collections.unmodifiableList(list);
    }

    public Method iobyxmoadg() {
        return this.f63445iobyxmoadg;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f63445iobyxmoadg.getDeclaringClass().getName(), this.f63445iobyxmoadg.getName(), this.f63446zoijcleaow);
    }
}
