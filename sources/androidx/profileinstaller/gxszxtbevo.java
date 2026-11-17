package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ppxfxbqfkf f12546iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final ppxfxbqfkf f12547zoijcleaow = new zoijcleaow();

    class iobyxmoadg implements ppxfxbqfkf {
        iobyxmoadg() {
        }

        @Override // androidx.profileinstaller.gxszxtbevo.ppxfxbqfkf
        public void iobyxmoadg(int i13, Object obj) {
        }

        @Override // androidx.profileinstaller.gxszxtbevo.ppxfxbqfkf
        public void zoijcleaow(int i13, Object obj) {
        }
    }

    public interface ppxfxbqfkf {
        void iobyxmoadg(int i13, Object obj);

        void zoijcleaow(int i13, Object obj);
    }

    class zoijcleaow implements ppxfxbqfkf {
        zoijcleaow() {
        }

        @Override // androidx.profileinstaller.gxszxtbevo.ppxfxbqfkf
        public void iobyxmoadg(int i13, Object obj) {
            String str;
            switch (i13) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i13 == 6 || i13 == 7 || i13 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }

        @Override // androidx.profileinstaller.gxszxtbevo.ppxfxbqfkf
        public void zoijcleaow(int i13, Object obj) {
            String str;
            if (i13 == 1) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
            } else if (i13 == 2) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
            } else if (i13 == 3) {
                str = "DIAGNOSTIC_REF_PROFILE_EXISTS";
            } else if (i13 != 4) {
                str = i13 != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED";
            } else {
                str = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
            }
            Log.d("ProfileInstaller", str);
        }
    }

    static void btonecajqb(Context context, Executor executor, ppxfxbqfkf ppxfxbqfkfVar) {
        try {
            gxszxtbevo(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            lqeggnwhkg(executor, ppxfxbqfkfVar, 10, null);
        } catch (PackageManager.NameNotFoundException e13) {
            lqeggnwhkg(executor, ppxfxbqfkfVar, 7, e13);
        }
    }

    static void dxjokdxxww(Context context, Executor executor, ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z14 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z13 && wkgbmnqykc(packageInfo, filesDir, ppxfxbqfkfVar)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                nufgyqmvbu.ppxfxbqfkf(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (nufgyqmvbu(assets, packageName, packageInfo, filesDir, name, executor, ppxfxbqfkfVar) && z13) {
                z14 = true;
            }
            nufgyqmvbu.ppxfxbqfkf(context, z14);
        } catch (PackageManager.NameNotFoundException e13) {
            ppxfxbqfkfVar.iobyxmoadg(7, e13);
            nufgyqmvbu.ppxfxbqfkf(context, false);
        }
    }

    static void gxszxtbevo(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
        }
    }

    static void lqeggnwhkg(Executor executor, final ppxfxbqfkf ppxfxbqfkfVar, final int i13, final Object obj) {
        executor.execute(new Runnable() { // from class: l5.ppxfxbqfkf
            @Override // java.lang.Runnable
            public final void run() {
                ppxfxbqfkfVar.iobyxmoadg(i13, obj);
            }
        });
    }

    private static boolean nufgyqmvbu(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, ppxfxbqfkf ppxfxbqfkfVar) {
        androidx.profileinstaller.zoijcleaow zoijcleaowVar = new androidx.profileinstaller.zoijcleaow(assetManager, executor, ppxfxbqfkfVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!zoijcleaowVar.eablkybsjg()) {
            return false;
        }
        boolean zAgtfadlqog = zoijcleaowVar.dxjokdxxww().wflxmlrfwp().agtfadlqog();
        if (zAgtfadlqog) {
            gxszxtbevo(packageInfo, file);
        }
        return zAgtfadlqog;
    }

    static void ppxfxbqfkf(Context context, Executor executor, ppxfxbqfkf ppxfxbqfkfVar) {
        zoijcleaow(context.getFilesDir());
        lqeggnwhkg(executor, ppxfxbqfkfVar, 11, null);
    }

    static boolean wkgbmnqykc(PackageInfo packageInfo, File file, ppxfxbqfkf ppxfxbqfkfVar) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j13 = dataInputStream.readLong();
                dataInputStream.close();
                boolean z13 = j13 == packageInfo.lastUpdateTime;
                if (z13) {
                    ppxfxbqfkfVar.iobyxmoadg(2, null);
                }
                return z13;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    static boolean zoijcleaow(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }
}
