package n5;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final vdvldrhtss f68898iobyxmoadg = new vdvldrhtss();

    private vdvldrhtss() {
    }

    public static final oxmwwwfdhm.iobyxmoadg iobyxmoadg(Context context, Class klass, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(klass, "klass");
        if (str == null || mj.kcexrzcfyt.zfvoamnweg(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new oxmwwwfdhm.iobyxmoadg(context, klass, str);
    }

    public static final oxmwwwfdhm.iobyxmoadg ppxfxbqfkf(Context context, Class klass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(klass, "klass");
        return new oxmwwwfdhm.iobyxmoadg(context, klass, null);
    }

    public static final Object zoijcleaow(Class klass, String suffix) {
        String str;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(klass, "klass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(suffix, "suffix");
        Package r13 = klass.getPackage();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(r13);
        String fullPackage = r13.getName();
        String canonicalName = klass.getCanonicalName();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(canonicalName);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = mj.kcexrzcfyt.pkzmftpjix(canonicalName, '.', '_', false, 4, null) + suffix;
        try {
            if (fullPackage.length() == 0) {
                str = str2;
            } else {
                str = fullPackage + '.' + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName());
        }
    }
}
