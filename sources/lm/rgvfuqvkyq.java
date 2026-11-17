package lm;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
class rgvfuqvkyq {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final rgvfuqvkyq f63550ppxfxbqfkf = eablkybsjg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f63551iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Constructor f63552zoijcleaow;

    static final class iobyxmoadg extends rgvfuqvkyq {

        /* JADX INFO: renamed from: lm.rgvfuqvkyq$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class ExecutorC1296iobyxmoadg implements Executor {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            private final Handler f63553zdlpuopuiu = new Handler(Looper.getMainLooper());

            ExecutorC1296iobyxmoadg() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f63553zdlpuopuiu.post(runnable);
            }
        }

        iobyxmoadg() {
            super(true);
        }

        @Override // lm.rgvfuqvkyq
        Object lqeggnwhkg(Method method, Class cls, Object obj, Object... objArr) {
            return super.lqeggnwhkg(method, cls, obj, objArr);
        }

        @Override // lm.rgvfuqvkyq
        public Executor zoijcleaow() {
            return new ExecutorC1296iobyxmoadg();
        }
    }

    rgvfuqvkyq(boolean z13) {
        this.f63551iobyxmoadg = z13;
        Constructor declaredConstructor = null;
        if (z13) {
            try {
                declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f63552zoijcleaow = declaredConstructor;
    }

    private static rgvfuqvkyq eablkybsjg() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new iobyxmoadg() : new rgvfuqvkyq(true);
    }

    static rgvfuqvkyq gxszxtbevo() {
        return f63550ppxfxbqfkf;
    }

    List iobyxmoadg(Executor executor) {
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(executor);
        return this.f63551iobyxmoadg ? Arrays.asList(eablkybsjg.f63437iobyxmoadg, lqeggnwhkgVar) : Collections.singletonList(lqeggnwhkgVar);
    }

    Object lqeggnwhkg(Method method, Class cls, Object obj, Object... objArr) {
        Constructor constructor = this.f63552zoijcleaow;
        return (constructor != null ? (MethodHandles.Lookup) constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    boolean nufgyqmvbu(Method method) {
        return this.f63551iobyxmoadg && method.isDefault();
    }

    List ppxfxbqfkf() {
        return this.f63551iobyxmoadg ? Collections.singletonList(agtfadlqog.f63407iobyxmoadg) : Collections.emptyList();
    }

    int wkgbmnqykc() {
        return this.f63551iobyxmoadg ? 1 : 0;
    }

    Executor zoijcleaow() {
        return null;
    }
}
