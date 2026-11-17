package yi;

import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.impl.C4007z9;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public class gxszxtbevo implements yi.agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected final yi.gtknphoqwx f125308iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f125309ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final InterfaceC3195gxszxtbevo f125310zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final String f125307wkgbmnqykc = kcexrzcfyt.m(gxszxtbevo.class.getCanonicalName(), ".", "");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final yi.agtfadlqog f125306eablkybsjg = new iobyxmoadg("NO_LOCKS", InterfaceC3195gxszxtbevo.f125319iobyxmoadg, yi.eablkybsjg.f125303zoijcleaow);

    private enum agtfadlqog {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    private static class btonecajqb extends nufgyqmvbu implements yi.dxjokdxxww {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(gxszxtbevo gxszxtbevoVar, tg.iobyxmoadg iobyxmoadgVar) {
            super(gxszxtbevoVar, iobyxmoadgVar);
            if (gxszxtbevoVar == null) {
                iobyxmoadg(0);
            }
            if (iobyxmoadgVar == null) {
                iobyxmoadg(1);
            }
        }

        private static /* synthetic */ void iobyxmoadg(int i13) {
            String str = i13 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i13 != 2 ? 3 : 2];
            if (i13 == 1) {
                objArr[0] = "computable";
            } else if (i13 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i13 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i13 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i13 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // yi.gxszxtbevo.nufgyqmvbu, tg.iobyxmoadg
        public Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke == null) {
                iobyxmoadg(2);
            }
            return objInvoke;
        }
    }

    private static class draadjrbmk implements yi.nufgyqmvbu {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final tg.draadjrbmk f125315jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final ConcurrentMap f125316yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final gxszxtbevo f125317zdlpuopuiu;

        public draadjrbmk(gxszxtbevo gxszxtbevoVar, ConcurrentMap concurrentMap, tg.draadjrbmk draadjrbmkVar) {
            if (gxszxtbevoVar == null) {
                zoijcleaow(0);
            }
            if (concurrentMap == null) {
                zoijcleaow(1);
            }
            if (draadjrbmkVar == null) {
                zoijcleaow(2);
            }
            this.f125317zdlpuopuiu = gxszxtbevoVar;
            this.f125316yggfygwlhe = concurrentMap;
            this.f125315jyumaefscl = draadjrbmkVar;
        }

        private AssertionError eablkybsjg(Object obj, Object obj2) {
            AssertionError assertionError = (AssertionError) gxszxtbevo.vdvldrhtss(new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f125317zdlpuopuiu));
            if (assertionError == null) {
                zoijcleaow(4);
            }
            return assertionError;
        }

        private AssertionError lqeggnwhkg(Object obj, Throwable th2) {
            return (AssertionError) gxszxtbevo.vdvldrhtss(new AssertionError("Unable to remove " + obj + " under " + this.f125317zdlpuopuiu, th2));
        }

        private AssertionError ppxfxbqfkf(Object obj, Object obj2) {
            return (AssertionError) gxszxtbevo.vdvldrhtss(new AssertionError("Inconsistent key detected. " + agtfadlqog.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f125317zdlpuopuiu));
        }

        private static /* synthetic */ void zoijcleaow(int i13) {
            String str = (i13 == 3 || i13 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i13 == 3 || i13 == 4) ? 2 : 3];
            if (i13 == 1) {
                objArr[0] = "map";
            } else if (i13 == 2) {
                objArr[0] = "compute";
            } else if (i13 == 3 || i13 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i13 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i13 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i13 != 3 && i13 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i13 != 3 && i13 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        protected ojitshcjhn gxszxtbevo(Object obj, boolean z13) {
            ojitshcjhn ojitshcjhnVarRgvfuqvkyq = this.f125317zdlpuopuiu.rgvfuqvkyq("", obj);
            if (ojitshcjhnVarRgvfuqvkyq == null) {
                zoijcleaow(3);
            }
            return ojitshcjhnVarRgvfuqvkyq;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
          0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v21 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x004d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0052 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x0054 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        /* JADX WARN: Code duplicated, block: B:29:0x0071  */
        /* JADX WARN: Code duplicated, block: B:31:0x0079 A[Catch: all -> 0x007e, TRY_ENTER, TryCatch #3 {all -> 0x007e, blocks: (B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:66:0x005a, outer: #1 }] */
        @Override // tg.draadjrbmk
        public Object invoke(Object obj) {
            AssertionError assertionErrorEablkybsjg;
            Object objInvoke;
            Object objPut;
            Object objWkgbmnqykc;
            ojitshcjhn ojitshcjhnVarGxszxtbevo;
            Object obj2 = this.f125316yggfygwlhe.get(obj);
            if (obj2 != null && obj2 != agtfadlqog.COMPUTING) {
                return WrappedValues.wkgbmnqykc(obj2);
            }
            this.f125317zdlpuopuiu.f125308iobyxmoadg.lock();
            try {
                Object obj3 = this.f125316yggfygwlhe.get(obj);
                agtfadlqog agtfadlqogVar = agtfadlqog.COMPUTING;
                if (obj3 == agtfadlqogVar) {
                    obj3 = agtfadlqog.RECURSION_WAS_DETECTED;
                    ojitshcjhn ojitshcjhnVarGxszxtbevo2 = gxszxtbevo(obj, true);
                    if (!ojitshcjhnVarGxszxtbevo2.ppxfxbqfkf()) {
                        objWkgbmnqykc = ojitshcjhnVarGxszxtbevo2.zoijcleaow();
                    } else if (obj3 == agtfadlqog.RECURSION_WAS_DETECTED) {
                        ojitshcjhnVarGxszxtbevo = gxszxtbevo(obj, false);
                        if (!ojitshcjhnVarGxszxtbevo.ppxfxbqfkf()) {
                            objWkgbmnqykc = ojitshcjhnVarGxszxtbevo.zoijcleaow();
                        } else {
                            if (obj3 != null) {
                                assertionErrorEablkybsjg = null;
                                try {
                                    this.f125316yggfygwlhe.put(obj, agtfadlqogVar);
                                    objInvoke = this.f125315jyumaefscl.invoke(obj);
                                    objPut = this.f125316yggfygwlhe.put(obj, WrappedValues.zoijcleaow(objInvoke));
                                    if (objPut == agtfadlqogVar) {
                                        this.f125317zdlpuopuiu.f125308iobyxmoadg.unlock();
                                        return objInvoke;
                                    }
                                    assertionErrorEablkybsjg = eablkybsjg(obj, objPut);
                                    throw assertionErrorEablkybsjg;
                                } catch (Throwable th2) {
                                    if (jj.wkgbmnqykc.iobyxmoadg(th2)) {
                                        try {
                                            Object objRemove = this.f125316yggfygwlhe.remove(obj);
                                            if (objRemove != agtfadlqog.COMPUTING) {
                                                throw ppxfxbqfkf(obj, objRemove);
                                            }
                                            throw th2;
                                        } catch (Throwable th3) {
                                            throw lqeggnwhkg(obj, th3);
                                        }
                                    }
                                    if (th2 != assertionErrorEablkybsjg) {
                                        Object objPut2 = this.f125316yggfygwlhe.put(obj, WrappedValues.ppxfxbqfkf(th2));
                                        if (objPut2 != agtfadlqog.COMPUTING) {
                                            throw eablkybsjg(obj, objPut2);
                                        }
                                        throw this.f125317zdlpuopuiu.f125310zoijcleaow.iobyxmoadg(th2);
                                    }
                                    try {
                                        this.f125316yggfygwlhe.remove(obj);
                                        throw this.f125317zdlpuopuiu.f125310zoijcleaow.iobyxmoadg(th2);
                                    } catch (Throwable th4) {
                                        throw lqeggnwhkg(obj, th4);
                                    }
                                }
                                this.f125317zdlpuopuiu.f125308iobyxmoadg.unlock();
                                throw th;
                            }
                            objWkgbmnqykc = WrappedValues.wkgbmnqykc(obj3);
                        }
                    } else {
                        if (obj3 != null) {
                            assertionErrorEablkybsjg = null;
                            this.f125316yggfygwlhe.put(obj, agtfadlqogVar);
                            objInvoke = this.f125315jyumaefscl.invoke(obj);
                            objPut = this.f125316yggfygwlhe.put(obj, WrappedValues.zoijcleaow(objInvoke));
                            if (objPut == agtfadlqogVar) {
                                this.f125317zdlpuopuiu.f125308iobyxmoadg.unlock();
                                return objInvoke;
                            }
                            assertionErrorEablkybsjg = eablkybsjg(obj, objPut);
                            throw assertionErrorEablkybsjg;
                            this.f125317zdlpuopuiu.f125308iobyxmoadg.unlock();
                            throw th;
                        }
                        objWkgbmnqykc = WrappedValues.wkgbmnqykc(obj3);
                    }
                } else if (obj3 == agtfadlqog.RECURSION_WAS_DETECTED) {
                    ojitshcjhnVarGxszxtbevo = gxszxtbevo(obj, false);
                    if (!ojitshcjhnVarGxszxtbevo.ppxfxbqfkf()) {
                        objWkgbmnqykc = ojitshcjhnVarGxszxtbevo.zoijcleaow();
                    } else {
                        if (obj3 != null) {
                            assertionErrorEablkybsjg = null;
                            this.f125316yggfygwlhe.put(obj, agtfadlqogVar);
                            objInvoke = this.f125315jyumaefscl.invoke(obj);
                            objPut = this.f125316yggfygwlhe.put(obj, WrappedValues.zoijcleaow(objInvoke));
                            if (objPut == agtfadlqogVar) {
                                this.f125317zdlpuopuiu.f125308iobyxmoadg.unlock();
                                return objInvoke;
                            }
                            assertionErrorEablkybsjg = eablkybsjg(obj, objPut);
                            throw assertionErrorEablkybsjg;
                            this.f125317zdlpuopuiu.f125308iobyxmoadg.unlock();
                            throw th;
                        }
                        objWkgbmnqykc = WrappedValues.wkgbmnqykc(obj3);
                    }
                } else {
                    if (obj3 != null) {
                        assertionErrorEablkybsjg = null;
                        this.f125316yggfygwlhe.put(obj, agtfadlqogVar);
                        objInvoke = this.f125315jyumaefscl.invoke(obj);
                        objPut = this.f125316yggfygwlhe.put(obj, WrappedValues.zoijcleaow(objInvoke));
                        if (objPut == agtfadlqogVar) {
                            this.f125317zdlpuopuiu.f125308iobyxmoadg.unlock();
                            return objInvoke;
                        }
                        assertionErrorEablkybsjg = eablkybsjg(obj, objPut);
                        throw assertionErrorEablkybsjg;
                        this.f125317zdlpuopuiu.f125308iobyxmoadg.unlock();
                        throw th;
                    }
                    objWkgbmnqykc = WrappedValues.wkgbmnqykc(obj3);
                }
                this.f125317zdlpuopuiu.f125308iobyxmoadg.unlock();
                return objWkgbmnqykc;
            } catch (Throwable th5) {
                this.f125317zdlpuopuiu.f125308iobyxmoadg.unlock();
                throw th5;
            }
        }

        @Override // yi.nufgyqmvbu
        public boolean rgvfuqvkyq(Object obj) {
            Object obj2 = this.f125316yggfygwlhe.get(obj);
            return (obj2 == null || obj2 == agtfadlqog.COMPUTING) ? false : true;
        }
    }

    private static abstract class dxjokdxxww extends nufgyqmvbu {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private volatile yi.draadjrbmk f125318iwizpuwonk;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(gxszxtbevo gxszxtbevoVar, tg.iobyxmoadg iobyxmoadgVar) {
            super(gxszxtbevoVar, iobyxmoadgVar);
            if (gxszxtbevoVar == null) {
                iobyxmoadg(0);
            }
            if (iobyxmoadgVar == null) {
                iobyxmoadg(1);
            }
            this.f125318iwizpuwonk = null;
        }

        private static /* synthetic */ void iobyxmoadg(int i13) {
            Object[] objArr = new Object[3];
            if (i13 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        protected abstract void eablkybsjg(Object obj);

        @Override // yi.gxszxtbevo.nufgyqmvbu, tg.iobyxmoadg
        public Object invoke() {
            yi.draadjrbmk draadjrbmkVar = this.f125318iwizpuwonk;
            return (draadjrbmkVar == null || !draadjrbmkVar.zoijcleaow()) ? super.invoke() : draadjrbmkVar.iobyxmoadg();
        }

        @Override // yi.gxszxtbevo.nufgyqmvbu
        protected final void zoijcleaow(Object obj) {
            this.f125318iwizpuwonk = new yi.draadjrbmk(obj);
            try {
                eablkybsjg(obj);
            } finally {
                this.f125318iwizpuwonk = null;
            }
        }
    }

    private static class eablkybsjg extends draadjrbmk implements yi.zoijcleaow {

        class iobyxmoadg implements tg.draadjrbmk {
            iobyxmoadg() {
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public Object invoke(lqeggnwhkg lqeggnwhkgVar) {
                return lqeggnwhkgVar.f125321zoijcleaow.invoke();
            }
        }

        /* synthetic */ eablkybsjg(gxszxtbevo gxszxtbevoVar, ConcurrentMap concurrentMap, iobyxmoadg iobyxmoadgVar) {
            this(gxszxtbevoVar, concurrentMap);
        }

        private static /* synthetic */ void zoijcleaow(int i13) {
            Object[] objArr = new Object[3];
            if (i13 == 1) {
                objArr[0] = "map";
            } else if (i13 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i13 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public Object iobyxmoadg(Object obj, tg.iobyxmoadg iobyxmoadgVar) {
            if (iobyxmoadgVar == null) {
                zoijcleaow(2);
            }
            return invoke(new lqeggnwhkg(obj, iobyxmoadgVar));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private eablkybsjg(gxszxtbevo gxszxtbevoVar, ConcurrentMap concurrentMap) {
            super(gxszxtbevoVar, concurrentMap, new iobyxmoadg());
            if (gxszxtbevoVar == null) {
                zoijcleaow(0);
            }
            if (concurrentMap == null) {
                zoijcleaow(1);
            }
        }
    }

    private static abstract class gtknphoqwx extends dxjokdxxww implements yi.dxjokdxxww {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(gxszxtbevo gxszxtbevoVar, tg.iobyxmoadg iobyxmoadgVar) {
            super(gxszxtbevoVar, iobyxmoadgVar);
            if (gxszxtbevoVar == null) {
                iobyxmoadg(0);
            }
            if (iobyxmoadgVar == null) {
                iobyxmoadg(1);
            }
        }

        private static /* synthetic */ void iobyxmoadg(int i13) {
            String str = i13 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i13 != 2 ? 3 : 2];
            if (i13 == 1) {
                objArr[0] = "computable";
            } else if (i13 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i13 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i13 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i13 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // yi.gxszxtbevo.dxjokdxxww, yi.gxszxtbevo.nufgyqmvbu, tg.iobyxmoadg
        public Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke == null) {
                iobyxmoadg(2);
            }
            return objInvoke;
        }
    }

    /* JADX INFO: renamed from: yi.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public interface InterfaceC3195gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final InterfaceC3195gxszxtbevo f125319iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: yi.gxszxtbevo$gxszxtbevo$iobyxmoadg */
        static class iobyxmoadg implements InterfaceC3195gxszxtbevo {
            iobyxmoadg() {
            }

            private static /* synthetic */ void zoijcleaow(int i13) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // yi.gxszxtbevo.InterfaceC3195gxszxtbevo
            public RuntimeException iobyxmoadg(Throwable th2) {
                if (th2 == null) {
                    zoijcleaow(0);
                }
                throw jj.wkgbmnqykc.zoijcleaow(th2);
            }
        }

        RuntimeException iobyxmoadg(Throwable th2);
    }

    static class iobyxmoadg extends gxszxtbevo {
        iobyxmoadg(String str, InterfaceC3195gxszxtbevo interfaceC3195gxszxtbevo, yi.gtknphoqwx gtknphoqwxVar) {
            super(str, interfaceC3195gxszxtbevo, gtknphoqwxVar, null);
        }

        private static /* synthetic */ void btonecajqb(int i13) {
            String str = i13 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i13 != 1 ? 3 : 2];
            if (i13 != 1) {
                objArr[0] = AdRevenueConstants.SOURCE_KEY;
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i13 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i13 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i13 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // yi.gxszxtbevo
        protected ojitshcjhn rgvfuqvkyq(String str, Object obj) {
            if (str == null) {
                btonecajqb(0);
            }
            ojitshcjhn ojitshcjhnVarIobyxmoadg = ojitshcjhn.iobyxmoadg();
            if (ojitshcjhnVarIobyxmoadg == null) {
                btonecajqb(1);
            }
            return ojitshcjhnVarIobyxmoadg;
        }
    }

    private static class lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Object f125320iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final tg.iobyxmoadg f125321zoijcleaow;

        public lqeggnwhkg(Object obj, tg.iobyxmoadg iobyxmoadgVar) {
            this.f125320iobyxmoadg = obj;
            this.f125321zoijcleaow = iobyxmoadgVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f125320iobyxmoadg.equals(((lqeggnwhkg) obj).f125320iobyxmoadg);
        }

        public int hashCode() {
            return this.f125320iobyxmoadg.hashCode();
        }
    }

    private static class nufgyqmvbu implements yi.btonecajqb {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private volatile Object f125322jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final tg.iobyxmoadg f125323yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final gxszxtbevo f125324zdlpuopuiu;

        public nufgyqmvbu(gxszxtbevo gxszxtbevoVar, tg.iobyxmoadg iobyxmoadgVar) {
            if (gxszxtbevoVar == null) {
                iobyxmoadg(0);
            }
            if (iobyxmoadgVar == null) {
                iobyxmoadg(1);
            }
            this.f125322jyumaefscl = agtfadlqog.NOT_COMPUTED;
            this.f125324zdlpuopuiu = gxszxtbevoVar;
            this.f125323yggfygwlhe = iobyxmoadgVar;
        }

        private static /* synthetic */ void iobyxmoadg(int i13) {
            String str = (i13 == 2 || i13 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i13 == 2 || i13 == 3) ? 2 : 3];
            if (i13 == 1) {
                objArr[0] = "computable";
            } else if (i13 == 2 || i13 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i13 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i13 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i13 != 2 && i13 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i13 != 2 && i13 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public boolean draadjrbmk() {
            return (this.f125322jyumaefscl == agtfadlqog.NOT_COMPUTED || this.f125322jyumaefscl == agtfadlqog.COMPUTING) ? false : true;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0042 A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x004d A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // tg.iobyxmoadg
        public Object invoke() {
            Object objInvoke;
            ojitshcjhn ojitshcjhnVarPpxfxbqfkf;
            Object obj = this.f125322jyumaefscl;
            if (!(obj instanceof agtfadlqog)) {
                return WrappedValues.gxszxtbevo(obj);
            }
            this.f125324zdlpuopuiu.f125308iobyxmoadg.lock();
            try {
                Object obj2 = this.f125322jyumaefscl;
                if (obj2 instanceof agtfadlqog) {
                    agtfadlqog agtfadlqogVar = agtfadlqog.COMPUTING;
                    if (obj2 == agtfadlqogVar) {
                        this.f125322jyumaefscl = agtfadlqog.RECURSION_WAS_DETECTED;
                        ojitshcjhn ojitshcjhnVarPpxfxbqfkf2 = ppxfxbqfkf(true);
                        if (!ojitshcjhnVarPpxfxbqfkf2.ppxfxbqfkf()) {
                            objInvoke = ojitshcjhnVarPpxfxbqfkf2.zoijcleaow();
                        } else if (obj2 == agtfadlqog.RECURSION_WAS_DETECTED) {
                            ojitshcjhnVarPpxfxbqfkf = ppxfxbqfkf(false);
                            if (ojitshcjhnVarPpxfxbqfkf.ppxfxbqfkf()) {
                                this.f125322jyumaefscl = agtfadlqogVar;
                                try {
                                    objInvoke = this.f125323yggfygwlhe.invoke();
                                    zoijcleaow(objInvoke);
                                    this.f125322jyumaefscl = objInvoke;
                                } catch (Throwable th2) {
                                    if (jj.wkgbmnqykc.iobyxmoadg(th2)) {
                                        this.f125322jyumaefscl = agtfadlqog.NOT_COMPUTED;
                                        throw th2;
                                    }
                                    if (this.f125322jyumaefscl == agtfadlqog.COMPUTING) {
                                        this.f125322jyumaefscl = WrappedValues.ppxfxbqfkf(th2);
                                    }
                                    throw this.f125324zdlpuopuiu.f125310zoijcleaow.iobyxmoadg(th2);
                                }
                            } else {
                                objInvoke = ojitshcjhnVarPpxfxbqfkf.zoijcleaow();
                            }
                        } else {
                            this.f125322jyumaefscl = agtfadlqogVar;
                            objInvoke = this.f125323yggfygwlhe.invoke();
                            zoijcleaow(objInvoke);
                            this.f125322jyumaefscl = objInvoke;
                        }
                    } else if (obj2 == agtfadlqog.RECURSION_WAS_DETECTED) {
                        ojitshcjhnVarPpxfxbqfkf = ppxfxbqfkf(false);
                        if (ojitshcjhnVarPpxfxbqfkf.ppxfxbqfkf()) {
                            objInvoke = ojitshcjhnVarPpxfxbqfkf.zoijcleaow();
                        } else {
                            this.f125322jyumaefscl = agtfadlqogVar;
                            objInvoke = this.f125323yggfygwlhe.invoke();
                            zoijcleaow(objInvoke);
                            this.f125322jyumaefscl = objInvoke;
                        }
                    } else {
                        this.f125322jyumaefscl = agtfadlqogVar;
                        objInvoke = this.f125323yggfygwlhe.invoke();
                        zoijcleaow(objInvoke);
                        this.f125322jyumaefscl = objInvoke;
                    }
                } else {
                    objInvoke = WrappedValues.gxszxtbevo(obj2);
                }
                this.f125324zdlpuopuiu.f125308iobyxmoadg.unlock();
                return objInvoke;
            } catch (Throwable th3) {
                this.f125324zdlpuopuiu.f125308iobyxmoadg.unlock();
                throw th3;
            }
        }

        protected ojitshcjhn ppxfxbqfkf(boolean z13) {
            ojitshcjhn ojitshcjhnVarRgvfuqvkyq = this.f125324zdlpuopuiu.rgvfuqvkyq("in a lazy value", null);
            if (ojitshcjhnVarRgvfuqvkyq == null) {
                iobyxmoadg(2);
            }
            return ojitshcjhnVarRgvfuqvkyq;
        }

        protected void zoijcleaow(Object obj) {
        }
    }

    private static class ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Object f125325iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f125326zoijcleaow;

        private ojitshcjhn(Object obj, boolean z13) {
            this.f125325iobyxmoadg = obj;
            this.f125326zoijcleaow = z13;
        }

        public static ojitshcjhn iobyxmoadg() {
            return new ojitshcjhn(null, true);
        }

        public static ojitshcjhn wkgbmnqykc(Object obj) {
            return new ojitshcjhn(obj, false);
        }

        public boolean ppxfxbqfkf() {
            return this.f125326zoijcleaow;
        }

        public String toString() {
            return ppxfxbqfkf() ? "FALL_THROUGH" : String.valueOf(this.f125325iobyxmoadg);
        }

        public Object zoijcleaow() {
            return this.f125325iobyxmoadg;
        }
    }

    class ppxfxbqfkf extends gtknphoqwx {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f125327cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f125328esjtqupxsv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar, tg.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
            super(gxszxtbevoVar, iobyxmoadgVar);
            this.f125327cqumvgiudr = draadjrbmkVar;
            this.f125328esjtqupxsv = draadjrbmkVar2;
        }

        private static /* synthetic */ void iobyxmoadg(int i13) {
            String str = i13 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i13 != 2 ? 2 : 3];
            if (i13 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i13 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i13 == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i13 == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // yi.gxszxtbevo.dxjokdxxww
        protected void eablkybsjg(Object obj) {
            if (obj == null) {
                iobyxmoadg(2);
            }
            this.f125328esjtqupxsv.invoke(obj);
        }

        @Override // yi.gxszxtbevo.nufgyqmvbu
        protected ojitshcjhn ppxfxbqfkf(boolean z13) {
            tg.draadjrbmk draadjrbmkVar = this.f125327cqumvgiudr;
            if (draadjrbmkVar == null) {
                ojitshcjhn ojitshcjhnVarPpxfxbqfkf = super.ppxfxbqfkf(z13);
                if (ojitshcjhnVarPpxfxbqfkf == null) {
                    iobyxmoadg(0);
                }
                return ojitshcjhnVarPpxfxbqfkf;
            }
            ojitshcjhn ojitshcjhnVarWkgbmnqykc = ojitshcjhn.wkgbmnqykc(draadjrbmkVar.invoke(Boolean.valueOf(z13)));
            if (ojitshcjhnVarWkgbmnqykc == null) {
                iobyxmoadg(1);
            }
            return ojitshcjhnVarWkgbmnqykc;
        }
    }

    private static class wflxmlrfwp extends draadjrbmk implements yi.lqeggnwhkg {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(gxszxtbevo gxszxtbevoVar, ConcurrentMap concurrentMap, tg.draadjrbmk draadjrbmkVar) {
            super(gxszxtbevoVar, concurrentMap, draadjrbmkVar);
            if (gxszxtbevoVar == null) {
                zoijcleaow(0);
            }
            if (concurrentMap == null) {
                zoijcleaow(1);
            }
            if (draadjrbmkVar == null) {
                zoijcleaow(2);
            }
        }

        private static /* synthetic */ void zoijcleaow(int i13) {
            String str = i13 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i13 != 3 ? 3 : 2];
            if (i13 == 1) {
                objArr[0] = "map";
            } else if (i13 == 2) {
                objArr[0] = "compute";
            } else if (i13 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i13 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i13 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i13 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // yi.gxszxtbevo.draadjrbmk, tg.draadjrbmk
        public Object invoke(Object obj) {
            Object objInvoke = super.invoke(obj);
            if (objInvoke == null) {
                zoijcleaow(3);
            }
            return objInvoke;
        }
    }

    private static class wkgbmnqykc extends eablkybsjg implements yi.iobyxmoadg {
        /* synthetic */ wkgbmnqykc(gxszxtbevo gxszxtbevoVar, ConcurrentMap concurrentMap, iobyxmoadg iobyxmoadgVar) {
            this(gxszxtbevoVar, concurrentMap);
        }

        private static /* synthetic */ void zoijcleaow(int i13) {
            String str = i13 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i13 != 3 ? 3 : 2];
            if (i13 == 1) {
                objArr[0] = "map";
            } else if (i13 == 2) {
                objArr[0] = "computation";
            } else if (i13 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i13 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i13 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i13 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i13 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // yi.gxszxtbevo.eablkybsjg, yi.iobyxmoadg
        public Object iobyxmoadg(Object obj, tg.iobyxmoadg iobyxmoadgVar) {
            if (iobyxmoadgVar == null) {
                zoijcleaow(2);
            }
            Object objIobyxmoadg = super.iobyxmoadg(obj, iobyxmoadgVar);
            if (objIobyxmoadg == null) {
                zoijcleaow(3);
            }
            return objIobyxmoadg;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private wkgbmnqykc(gxszxtbevo gxszxtbevoVar, ConcurrentMap concurrentMap) {
            super(gxszxtbevoVar, concurrentMap, null);
            if (gxszxtbevoVar == null) {
                zoijcleaow(0);
            }
            if (concurrentMap == null) {
                zoijcleaow(1);
            }
        }
    }

    class zoijcleaow extends btonecajqb {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ Object f125331iwizpuwonk;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(gxszxtbevo gxszxtbevoVar, tg.iobyxmoadg iobyxmoadgVar, Object obj) {
            super(gxszxtbevoVar, iobyxmoadgVar);
            this.f125331iwizpuwonk = obj;
        }

        private static /* synthetic */ void iobyxmoadg(int i13) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // yi.gxszxtbevo.nufgyqmvbu
        protected ojitshcjhn ppxfxbqfkf(boolean z13) {
            ojitshcjhn ojitshcjhnVarWkgbmnqykc = ojitshcjhn.wkgbmnqykc(this.f125331iwizpuwonk);
            if (ojitshcjhnVarWkgbmnqykc == null) {
                iobyxmoadg(0);
            }
            return ojitshcjhnVarWkgbmnqykc;
        }
    }

    /* synthetic */ gxszxtbevo(String str, InterfaceC3195gxszxtbevo interfaceC3195gxszxtbevo, yi.gtknphoqwx gtknphoqwxVar, iobyxmoadg iobyxmoadgVar) {
        this(str, interfaceC3195gxszxtbevo, gtknphoqwxVar);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    private static /* synthetic */ void btonecajqb(int i13) {
        String str = (i13 == 10 || i13 == 13 || i13 == 20 || i13 == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 10 || i13 == 13 || i13 == 20 || i13 == 37) ? 2 : 3];
        if (i13 == 1 || i13 == 3 || i13 == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i13 != 6) {
            switch (i13) {
                case 8:
                    objArr[0] = "exceptionHandlingStrategy";
                    break;
                case 9:
                case 11:
                case 14:
                case 16:
                case 19:
                case 21:
                    objArr[0] = "compute";
                    break;
                case 10:
                case 13:
                case 20:
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                case 12:
                case 17:
                case C4007z9.F /* 25 */:
                case 27:
                    objArr[0] = "onRecursiveCall";
                    break;
                case 15:
                case 18:
                case 22:
                    objArr[0] = "map";
                    break;
                case 23:
                case 24:
                case C4007z9.G /* 26 */:
                case 28:
                case 30:
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    objArr[0] = "computable";
                    break;
                case C4007z9.I /* 29 */:
                case 33:
                    objArr[0] = "postCompute";
                    break;
                case C4007z9.J /* 35 */:
                    objArr[0] = AdRevenueConstants.SOURCE_KEY;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    objArr[0] = "throwable";
                    break;
                default:
                    objArr[0] = "debugText";
                    break;
            }
        } else {
            objArr[0] = "lock";
        }
        if (i13 == 10 || i13 == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i13 == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i13 != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                break;
            case 19:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
                objArr[2] = "createLazyValue";
                break;
            case C4007z9.G /* 26 */:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case C4007z9.I /* 29 */:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                objArr[2] = "compute";
                break;
            case C4007z9.J /* 35 */:
                objArr[2] = "recursionDetectedDefault";
                break;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 10 && i13 != 13 && i13 != 20 && i13 != 37) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Throwable vdvldrhtss(Throwable th2) {
        if (th2 == null) {
            btonecajqb(36);
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i13 = 0;
        while (i13 < length) {
            if (!stackTrace[i13].getClassName().startsWith(f125307wkgbmnqykc)) {
                List listSubList = Arrays.asList(stackTrace).subList(i13, length);
                th2.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
                return th2;
            }
            i13++;
        }
        i13 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i13, length);
        th2.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
        return th2;
    }

    private static ConcurrentMap wflxmlrfwp() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    public yi.lqeggnwhkg agtfadlqog(tg.draadjrbmk draadjrbmkVar, ConcurrentMap concurrentMap) {
        if (draadjrbmkVar == null) {
            btonecajqb(14);
        }
        if (concurrentMap == null) {
            btonecajqb(15);
        }
        return new wflxmlrfwp(this, concurrentMap, draadjrbmkVar);
    }

    @Override // yi.agtfadlqog
    public yi.lqeggnwhkg dxjokdxxww(tg.draadjrbmk draadjrbmkVar) {
        if (draadjrbmkVar == null) {
            btonecajqb(9);
        }
        yi.lqeggnwhkg lqeggnwhkgVarAgtfadlqog = agtfadlqog(draadjrbmkVar, wflxmlrfwp());
        if (lqeggnwhkgVarAgtfadlqog == null) {
            btonecajqb(10);
        }
        return lqeggnwhkgVarAgtfadlqog;
    }

    @Override // yi.agtfadlqog
    public yi.nufgyqmvbu eablkybsjg(tg.draadjrbmk draadjrbmkVar) {
        if (draadjrbmkVar == null) {
            btonecajqb(19);
        }
        yi.nufgyqmvbu nufgyqmvbuVarOjitshcjhn = ojitshcjhn(draadjrbmkVar, wflxmlrfwp());
        if (nufgyqmvbuVarOjitshcjhn == null) {
            btonecajqb(20);
        }
        return nufgyqmvbuVarOjitshcjhn;
    }

    @Override // yi.agtfadlqog
    public Object gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar == null) {
            btonecajqb(34);
        }
        this.f125308iobyxmoadg.lock();
        try {
            Object objInvoke = iobyxmoadgVar.invoke();
            this.f125308iobyxmoadg.unlock();
            return objInvoke;
        } catch (Throwable th2) {
            try {
                throw this.f125310zoijcleaow.iobyxmoadg(th2);
            } catch (Throwable th3) {
                this.f125308iobyxmoadg.unlock();
                throw th3;
            }
        }
    }

    @Override // yi.agtfadlqog
    public yi.btonecajqb iobyxmoadg(tg.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar == null) {
            btonecajqb(30);
        }
        return new nufgyqmvbu(this, iobyxmoadgVar);
    }

    @Override // yi.agtfadlqog
    public yi.dxjokdxxww lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, Object obj) {
        if (iobyxmoadgVar == null) {
            btonecajqb(26);
        }
        if (obj == null) {
            btonecajqb(27);
        }
        return new zoijcleaow(this, iobyxmoadgVar, obj);
    }

    @Override // yi.agtfadlqog
    public yi.zoijcleaow nufgyqmvbu() {
        return new eablkybsjg(this, wflxmlrfwp(), null);
    }

    public yi.nufgyqmvbu ojitshcjhn(tg.draadjrbmk draadjrbmkVar, ConcurrentMap concurrentMap) {
        if (draadjrbmkVar == null) {
            btonecajqb(21);
        }
        if (concurrentMap == null) {
            btonecajqb(22);
        }
        return new draadjrbmk(this, concurrentMap, draadjrbmkVar);
    }

    @Override // yi.agtfadlqog
    public yi.iobyxmoadg ppxfxbqfkf() {
        return new wkgbmnqykc(this, wflxmlrfwp(), null);
    }

    protected ojitshcjhn rgvfuqvkyq(String str, Object obj) {
        String str2;
        if (str == null) {
            btonecajqb(35);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Recursion detected ");
        sb3.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb3.append(str2);
        sb3.append(" under ");
        sb3.append(this);
        throw ((AssertionError) vdvldrhtss(new AssertionError(sb3.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f125309ppxfxbqfkf + ")";
    }

    @Override // yi.agtfadlqog
    public yi.dxjokdxxww wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar == null) {
            btonecajqb(23);
        }
        return new btonecajqb(this, iobyxmoadgVar);
    }

    @Override // yi.agtfadlqog
    public yi.dxjokdxxww zoijcleaow(tg.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
        if (iobyxmoadgVar == null) {
            btonecajqb(28);
        }
        if (draadjrbmkVar2 == null) {
            btonecajqb(29);
        }
        return new ppxfxbqfkf(this, iobyxmoadgVar, draadjrbmkVar, draadjrbmkVar2);
    }

    private gxszxtbevo(String str, InterfaceC3195gxszxtbevo interfaceC3195gxszxtbevo, yi.gtknphoqwx gtknphoqwxVar) {
        if (str == null) {
            btonecajqb(4);
        }
        if (interfaceC3195gxszxtbevo == null) {
            btonecajqb(5);
        }
        if (gtknphoqwxVar == null) {
            btonecajqb(6);
        }
        this.f125308iobyxmoadg = gtknphoqwxVar;
        this.f125310zoijcleaow = interfaceC3195gxszxtbevo;
        this.f125309ppxfxbqfkf = str;
    }

    public gxszxtbevo(String str) {
        this(str, (Runnable) null, (tg.draadjrbmk) null);
    }

    public gxszxtbevo(String str, Runnable runnable, tg.draadjrbmk draadjrbmkVar) {
        this(str, InterfaceC3195gxszxtbevo.f125319iobyxmoadg, yi.gtknphoqwx.f125304iobyxmoadg.iobyxmoadg(runnable, draadjrbmkVar));
    }
}
