package com.google.gson.internal;

import androidx.appcompat.app.yggfygwlhe;
import com.google.gson.agtfadlqog;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gtknphoqwx {

    private static abstract class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f25114iobyxmoadg;

        class iobyxmoadg extends zoijcleaow {

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ Method f25115zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(Method method) {
                super();
                this.f25115zoijcleaow = method;
            }

            @Override // com.google.gson.internal.gtknphoqwx.zoijcleaow
            public boolean iobyxmoadg(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f25115zoijcleaow.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e13) {
                    throw new RuntimeException("Failed invoking canAccess", e13);
                }
            }
        }

        /* JADX INFO: renamed from: com.google.gson.internal.gtknphoqwx$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        class C0422zoijcleaow extends zoijcleaow {
            C0422zoijcleaow() {
                super();
            }

            @Override // com.google.gson.internal.gtknphoqwx.zoijcleaow
            public boolean iobyxmoadg(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            zoijcleaow iobyxmoadgVar;
            if (wkgbmnqykc.wkgbmnqykc()) {
                try {
                    iobyxmoadgVar = new iobyxmoadg(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    iobyxmoadgVar = null;
                }
            } else {
                iobyxmoadgVar = null;
            }
            if (iobyxmoadgVar == null) {
                iobyxmoadgVar = new C0422zoijcleaow();
            }
            f25114iobyxmoadg = iobyxmoadgVar;
        }

        private zoijcleaow() {
        }

        public abstract boolean iobyxmoadg(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean iobyxmoadg(AccessibleObject accessibleObject, Object obj) {
        return zoijcleaow.f25114iobyxmoadg.iobyxmoadg(accessibleObject, obj);
    }

    public static agtfadlqog zoijcleaow(List list, Class cls) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return agtfadlqog.ALLOW;
        }
        yggfygwlhe.iobyxmoadg(it.next());
        throw null;
    }
}
