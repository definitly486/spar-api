package org.slf4j.helpers;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static zoijcleaow f74200iobyxmoadg = null;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static boolean f74201zoijcleaow = false;

    private static final class zoijcleaow extends SecurityManager {
        private zoijcleaow() {
        }

        @Override // java.lang.SecurityManager
        protected Class[] getClassContext() {
            return super.getClassContext();
        }
    }

    private static zoijcleaow eablkybsjg() {
        try {
            return new zoijcleaow();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean gxszxtbevo(String str) {
        String strLqeggnwhkg = lqeggnwhkg(str);
        if (strLqeggnwhkg == null) {
            return false;
        }
        return strLqeggnwhkg.equalsIgnoreCase("true");
    }

    public static Class iobyxmoadg() {
        int i13;
        zoijcleaow zoijcleaowVarZoijcleaow = zoijcleaow();
        if (zoijcleaowVarZoijcleaow == null) {
            return null;
        }
        Class[] classContext = zoijcleaowVarZoijcleaow.getClassContext();
        String name = nufgyqmvbu.class.getName();
        int i14 = 0;
        while (i14 < classContext.length && !name.equals(classContext[i14].getName())) {
            i14++;
        }
        if (i14 >= classContext.length || (i13 = i14 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i13];
    }

    public static String lqeggnwhkg(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final void ppxfxbqfkf(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void wkgbmnqykc(String str, Throwable th2) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Reported exception:");
        th2.printStackTrace();
    }

    private static zoijcleaow zoijcleaow() {
        zoijcleaow zoijcleaowVar = f74200iobyxmoadg;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        if (f74201zoijcleaow) {
            return null;
        }
        zoijcleaow zoijcleaowVarEablkybsjg = eablkybsjg();
        f74200iobyxmoadg = zoijcleaowVarEablkybsjg;
        f74201zoijcleaow = true;
        return zoijcleaowVarEablkybsjg;
    }
}
