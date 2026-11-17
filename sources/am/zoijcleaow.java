package am;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.helpers.gxszxtbevo;
import org.slf4j.helpers.lqeggnwhkg;
import org.slf4j.helpers.nufgyqmvbu;
import org.slf4j.helpers.wkgbmnqykc;
import org.slf4j.impl.StaticLoggerBinder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static volatile int f2245iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final lqeggnwhkg f2248zoijcleaow = new lqeggnwhkg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final wkgbmnqykc f2246ppxfxbqfkf = new wkgbmnqykc();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    static boolean f2247wkgbmnqykc = nufgyqmvbu.gxszxtbevo("slf4j.detectLoggerNameMismatch");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final String[] f2243eablkybsjg = {"1.6", "1.7"};

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static String f2244gxszxtbevo = "org/slf4j/impl/StaticLoggerBinder.class";

    private static boolean agtfadlqog(Class cls, Class cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    public static iobyxmoadg btonecajqb(String str) {
        return nufgyqmvbu().iobyxmoadg(str);
    }

    private static boolean draadjrbmk() {
        String strLqeggnwhkg = nufgyqmvbu.lqeggnwhkg("java.vendor.url");
        if (strLqeggnwhkg == null) {
            return false;
        }
        return strLqeggnwhkg.toLowerCase().contains(ConstantDeviceInfo.APP_PLATFORM);
    }

    public static iobyxmoadg dxjokdxxww(Class cls) {
        Class clsIobyxmoadg;
        iobyxmoadg iobyxmoadgVarBtonecajqb = btonecajqb(cls.getName());
        if (f2247wkgbmnqykc && (clsIobyxmoadg = nufgyqmvbu.iobyxmoadg()) != null && agtfadlqog(cls, clsIobyxmoadg)) {
            nufgyqmvbu.ppxfxbqfkf(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", iobyxmoadgVarBtonecajqb.getName(), clsIobyxmoadg.getName()));
            nufgyqmvbu.ppxfxbqfkf("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return iobyxmoadgVarBtonecajqb;
    }

    static void eablkybsjg(Throwable th2) {
        f2245iobyxmoadg = 2;
        nufgyqmvbu.wkgbmnqykc("Failed to instantiate SLF4J LoggerFactory", th2);
    }

    private static boolean gtknphoqwx(Set set) {
        return set.size() > 1;
    }

    static Set gxszxtbevo() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = zoijcleaow.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f2244gxszxtbevo) : classLoader.getResources(f2244gxszxtbevo);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e13) {
            nufgyqmvbu.wkgbmnqykc("Error getting resources from path", e13);
        }
        return linkedHashSet;
    }

    private static final void iobyxmoadg() {
        Set setGxszxtbevo;
        try {
            try {
                if (draadjrbmk()) {
                    setGxszxtbevo = null;
                } else {
                    setGxszxtbevo = gxszxtbevo();
                    zdlpuopuiu(setGxszxtbevo);
                }
                StaticLoggerBinder.getSingleton();
                f2245iobyxmoadg = 3;
                kcexrzcfyt(setGxszxtbevo);
            } catch (Exception e13) {
                eablkybsjg(e13);
                throw new IllegalStateException("Unexpected initialization failure", e13);
            } catch (NoClassDefFoundError e14) {
                if (!wflxmlrfwp(e14.getMessage())) {
                    eablkybsjg(e14);
                    throw e14;
                }
                f2245iobyxmoadg = 4;
                nufgyqmvbu.ppxfxbqfkf("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                nufgyqmvbu.ppxfxbqfkf("Defaulting to no-operation (NOP) logger implementation");
                nufgyqmvbu.ppxfxbqfkf("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } catch (NoSuchMethodError e15) {
                String message = e15.getMessage();
                if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    f2245iobyxmoadg = 2;
                    nufgyqmvbu.ppxfxbqfkf("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    nufgyqmvbu.ppxfxbqfkf("Your binding is version 1.5.5 or earlier.");
                    nufgyqmvbu.ppxfxbqfkf("Upgrade your binding to version 1.6.x.");
                }
                throw e15;
            }
            rgvfuqvkyq();
        } catch (Throwable th2) {
            rgvfuqvkyq();
            throw th2;
        }
    }

    private static void kcexrzcfyt(Set set) {
        if (set == null || !gtknphoqwx(set)) {
            return;
        }
        nufgyqmvbu.ppxfxbqfkf("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    private static void lqeggnwhkg() {
        lqeggnwhkg lqeggnwhkgVar = f2248zoijcleaow;
        synchronized (lqeggnwhkgVar) {
            try {
                lqeggnwhkgVar.eablkybsjg();
                for (gxszxtbevo gxszxtbevoVar : lqeggnwhkgVar.wkgbmnqykc()) {
                    gxszxtbevoVar.oxmwwwfdhm(btonecajqb(gxszxtbevoVar.getName()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ILoggerFactory nufgyqmvbu() {
        if (f2245iobyxmoadg == 0) {
            synchronized (zoijcleaow.class) {
                try {
                    if (f2245iobyxmoadg == 0) {
                        f2245iobyxmoadg = 1;
                        ojitshcjhn();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        int i13 = f2245iobyxmoadg;
        if (i13 == 1) {
            return f2248zoijcleaow;
        }
        if (i13 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i13 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i13 == 4) {
            return f2246ppxfxbqfkf;
        }
        throw new IllegalStateException("Unreachable code");
    }

    private static final void ojitshcjhn() {
        iobyxmoadg();
        if (f2245iobyxmoadg == 3) {
            yggfygwlhe();
        }
    }

    private static void oxmwwwfdhm(bm.wkgbmnqykc wkgbmnqykcVar) {
        if (wkgbmnqykcVar == null) {
            return;
        }
        gxszxtbevo gxszxtbevoVarIobyxmoadg = wkgbmnqykcVar.iobyxmoadg();
        String name = gxszxtbevoVarIobyxmoadg.getName();
        if (gxszxtbevoVarIobyxmoadg.gtknphoqwx()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (gxszxtbevoVarIobyxmoadg.gxszxtbevo()) {
            return;
        }
        if (gxszxtbevoVarIobyxmoadg.eablkybsjg()) {
            gxszxtbevoVarIobyxmoadg.wflxmlrfwp(wkgbmnqykcVar);
        } else {
            nufgyqmvbu.ppxfxbqfkf(name);
        }
    }

    private static void ppxfxbqfkf(int i13) {
        nufgyqmvbu.ppxfxbqfkf("A number (" + i13 + ") of logging calls during the initialization phase have been intercepted and are");
        nufgyqmvbu.ppxfxbqfkf("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        nufgyqmvbu.ppxfxbqfkf("See also http://www.slf4j.org/codes.html#replay");
    }

    private static void rgvfuqvkyq() {
        lqeggnwhkg();
        vdvldrhtss();
        f2248zoijcleaow.zoijcleaow();
    }

    private static void vdvldrhtss() {
        LinkedBlockingQueue linkedBlockingQueuePpxfxbqfkf = f2248zoijcleaow.ppxfxbqfkf();
        int size = linkedBlockingQueuePpxfxbqfkf.size();
        ArrayList<bm.wkgbmnqykc> arrayList = new ArrayList(UserVerificationMethods.USER_VERIFY_PATTERN);
        int i13 = 0;
        while (linkedBlockingQueuePpxfxbqfkf.drainTo(arrayList, UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            for (bm.wkgbmnqykc wkgbmnqykcVar : arrayList) {
                oxmwwwfdhm(wkgbmnqykcVar);
                int i14 = i13 + 1;
                if (i13 == 0) {
                    zoijcleaow(wkgbmnqykcVar, size);
                }
                i13 = i14;
            }
            arrayList.clear();
        }
    }

    private static boolean wflxmlrfwp(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    private static void wkgbmnqykc() {
        nufgyqmvbu.ppxfxbqfkf("The following set of substitute loggers may have been accessed");
        nufgyqmvbu.ppxfxbqfkf("during the initialization phase. Logging calls during this");
        nufgyqmvbu.ppxfxbqfkf("phase were not honored. However, subsequent logging calls to these");
        nufgyqmvbu.ppxfxbqfkf("loggers will work as normally expected.");
        nufgyqmvbu.ppxfxbqfkf("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    private static final void yggfygwlhe() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z13 = false;
            for (String str2 : f2243eablkybsjg) {
                if (str.startsWith(str2)) {
                    z13 = true;
                }
            }
            if (z13) {
                return;
            }
            nufgyqmvbu.ppxfxbqfkf("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f2243eablkybsjg).toString());
            nufgyqmvbu.ppxfxbqfkf("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th2) {
            nufgyqmvbu.wkgbmnqykc("Unexpected problem occured during version sanity check", th2);
        }
    }

    private static void zdlpuopuiu(Set set) {
        if (gtknphoqwx(set)) {
            nufgyqmvbu.ppxfxbqfkf("Class path contains multiple SLF4J bindings.");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                nufgyqmvbu.ppxfxbqfkf("Found binding in [" + ((URL) it.next()) + "]");
            }
            nufgyqmvbu.ppxfxbqfkf("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static void zoijcleaow(bm.wkgbmnqykc wkgbmnqykcVar, int i13) {
        if (wkgbmnqykcVar.iobyxmoadg().eablkybsjg()) {
            ppxfxbqfkf(i13);
        } else {
            if (wkgbmnqykcVar.iobyxmoadg().gxszxtbevo()) {
                return;
            }
            wkgbmnqykc();
        }
    }
}
