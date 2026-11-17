package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class crxdokpmqz {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final t2.iobyxmoadg.ppxfxbqfkf f9444ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final zoijcleaow f9445zoijcleaow = new zoijcleaow(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final t2.lqeggnwhkg f9446iobyxmoadg;

    public static class eablkybsjg {
        public abstract void iobyxmoadg(ntlheqmsrt ntlheqmsrtVar);
    }

    public static final class gxszxtbevo implements t2.iobyxmoadg.ppxfxbqfkf {
    }

    public interface ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f9451iobyxmoadg = iobyxmoadg.f9452iobyxmoadg;

        public static final class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            static final /* synthetic */ iobyxmoadg f9452iobyxmoadg = new iobyxmoadg();

            private iobyxmoadg() {
            }
        }

        default ntlheqmsrt create(Class modelClass) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            return u2.nufgyqmvbu.f112511iobyxmoadg.gxszxtbevo();
        }

        default ntlheqmsrt create(Class modelClass, t2.iobyxmoadg extras) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extras, "extras");
            return create(modelClass);
        }

        default ntlheqmsrt create(ah.wkgbmnqykc modelClass, t2.iobyxmoadg extras) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extras, "extras");
            return create(sg.iobyxmoadg.zoijcleaow(modelClass), extras);
        }
    }

    public static class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static wkgbmnqykc f9453ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f9455zoijcleaow = new iobyxmoadg(null);

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final t2.iobyxmoadg.ppxfxbqfkf f9454wkgbmnqykc = crxdokpmqz.f9444ppxfxbqfkf;

        public static final class iobyxmoadg {
            public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final wkgbmnqykc iobyxmoadg() {
                if (wkgbmnqykc.f9453ppxfxbqfkf == null) {
                    wkgbmnqykc.f9453ppxfxbqfkf = new wkgbmnqykc();
                }
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.f9453ppxfxbqfkf;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar);
                return wkgbmnqykcVar;
            }

            private iobyxmoadg() {
            }
        }

        @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(Class modelClass) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            return u2.eablkybsjg.f112506iobyxmoadg.iobyxmoadg(modelClass);
        }

        @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(Class modelClass, t2.iobyxmoadg extras) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extras, "extras");
            return create(modelClass);
        }

        @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(ah.wkgbmnqykc modelClass, t2.iobyxmoadg extras) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extras, "extras");
            return create(sg.iobyxmoadg.zoijcleaow(modelClass), extras);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public static /* synthetic */ crxdokpmqz ppxfxbqfkf(zoijcleaow zoijcleaowVar, ribwqtqdhb ribwqtqdhbVar, ppxfxbqfkf ppxfxbqfkfVar, t2.iobyxmoadg iobyxmoadgVar, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                ppxfxbqfkfVar = u2.nufgyqmvbu.f112511iobyxmoadg.wkgbmnqykc(ribwqtqdhbVar);
            }
            if ((i13 & 4) != 0) {
                iobyxmoadgVar = u2.nufgyqmvbu.f112511iobyxmoadg.ppxfxbqfkf(ribwqtqdhbVar);
            }
            return zoijcleaowVar.zoijcleaow(ribwqtqdhbVar, ppxfxbqfkfVar, iobyxmoadgVar);
        }

        public final crxdokpmqz iobyxmoadg(jlmebxxoox store, ppxfxbqfkf factory, t2.iobyxmoadg extras) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(factory, "factory");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extras, "extras");
            return new crxdokpmqz(store, factory, extras);
        }

        public final crxdokpmqz zoijcleaow(ribwqtqdhb owner, ppxfxbqfkf factory, t2.iobyxmoadg extras) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(owner, "owner");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(factory, "factory");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extras, "extras");
            return new crxdokpmqz(owner.getViewModelStore(), factory, extras);
        }

        private zoijcleaow() {
        }
    }

    static {
        t2.iobyxmoadg.C2684iobyxmoadg c2684iobyxmoadg = t2.iobyxmoadg.f109314zoijcleaow;
        f9444ppxfxbqfkf = new gxszxtbevo();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public crxdokpmqz(jlmebxxoox store, ppxfxbqfkf factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(factory, "factory");
    }

    public final ntlheqmsrt iobyxmoadg(ah.wkgbmnqykc modelClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        return t2.lqeggnwhkg.eablkybsjg(this.f9446iobyxmoadg, modelClass, null, 2, null);
    }

    public final ntlheqmsrt ppxfxbqfkf(String key, ah.wkgbmnqykc modelClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        return this.f9446iobyxmoadg.wkgbmnqykc(modelClass, key);
    }

    public ntlheqmsrt zoijcleaow(Class modelClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        return iobyxmoadg(sg.iobyxmoadg.eablkybsjg(modelClass));
    }

    public static class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public static final C0146iobyxmoadg f9447gxszxtbevo = new C0146iobyxmoadg(null);

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private static iobyxmoadg f9448lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public static final t2.iobyxmoadg.ppxfxbqfkf f9449nufgyqmvbu;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final Application f9450eablkybsjg;

        /* JADX INFO: renamed from: androidx.lifecycle.crxdokpmqz$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0146iobyxmoadg {
            public /* synthetic */ C0146iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final iobyxmoadg iobyxmoadg(Application application) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(application, "application");
                if (iobyxmoadg.f9448lqeggnwhkg == null) {
                    iobyxmoadg.f9448lqeggnwhkg = new iobyxmoadg(application);
                }
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.f9448lqeggnwhkg;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar);
                return iobyxmoadgVar;
            }

            private C0146iobyxmoadg() {
            }
        }

        public static final class zoijcleaow implements t2.iobyxmoadg.ppxfxbqfkf {
        }

        static {
            t2.iobyxmoadg.C2684iobyxmoadg c2684iobyxmoadg = t2.iobyxmoadg.f109314zoijcleaow;
            f9449nufgyqmvbu = new zoijcleaow();
        }

        private iobyxmoadg(Application application, int i13) {
            this.f9450eablkybsjg = application;
        }

        private final ntlheqmsrt eablkybsjg(Class cls, Application application) {
            if (!androidx.lifecycle.zoijcleaow.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                ntlheqmsrt ntlheqmsrtVar = (ntlheqmsrt) cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ntlheqmsrtVar);
                return ntlheqmsrtVar;
            } catch (IllegalAccessException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            } catch (InstantiationException e14) {
                throw new RuntimeException("Cannot create an instance of " + cls, e14);
            } catch (NoSuchMethodException e15) {
                throw new RuntimeException("Cannot create an instance of " + cls, e15);
            } catch (InvocationTargetException e16) {
                throw new RuntimeException("Cannot create an instance of " + cls, e16);
            }
        }

        @Override // androidx.lifecycle.crxdokpmqz.wkgbmnqykc, androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(Class modelClass, t2.iobyxmoadg extras) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extras, "extras");
            if (this.f9450eablkybsjg != null) {
                return create(modelClass);
            }
            Application application = (Application) extras.iobyxmoadg(f9449nufgyqmvbu);
            if (application != null) {
                return eablkybsjg(modelClass, application);
            }
            if (androidx.lifecycle.zoijcleaow.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.create(modelClass);
        }

        public iobyxmoadg() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Application application) {
            this(application, 0);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(application, "application");
        }

        @Override // androidx.lifecycle.crxdokpmqz.wkgbmnqykc, androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(Class modelClass) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            Application application = this.f9450eablkybsjg;
            if (application != null) {
                return eablkybsjg(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    private crxdokpmqz(t2.lqeggnwhkg lqeggnwhkgVar) {
        this.f9446iobyxmoadg = lqeggnwhkgVar;
    }

    public /* synthetic */ crxdokpmqz(jlmebxxoox jlmebxxooxVar, ppxfxbqfkf ppxfxbqfkfVar, t2.iobyxmoadg iobyxmoadgVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(jlmebxxooxVar, ppxfxbqfkfVar, (i13 & 4) != 0 ? t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf : iobyxmoadgVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public crxdokpmqz(jlmebxxoox store, ppxfxbqfkf factory, t2.iobyxmoadg defaultCreationExtras) {
        this(new t2.lqeggnwhkg(store, factory, defaultCreationExtras));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(factory, "factory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public crxdokpmqz(ribwqtqdhb owner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(owner, "owner");
        jlmebxxoox viewModelStore = owner.getViewModelStore();
        u2.nufgyqmvbu nufgyqmvbuVar = u2.nufgyqmvbu.f112511iobyxmoadg;
        this(viewModelStore, nufgyqmvbuVar.wkgbmnqykc(owner), nufgyqmvbuVar.ppxfxbqfkf(owner));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public crxdokpmqz(ribwqtqdhb owner, ppxfxbqfkf factory) {
        this(owner.getViewModelStore(), factory, u2.nufgyqmvbu.f112511iobyxmoadg.ppxfxbqfkf(owner));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(owner, "owner");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(factory, "factory");
    }
}
