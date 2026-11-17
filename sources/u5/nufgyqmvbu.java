package u5;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes2.dex */
public interface nufgyqmvbu extends Closeable {

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final C2784iobyxmoadg f112690zoijcleaow = new C2784iobyxmoadg(null);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f112691iobyxmoadg;

        /* JADX INFO: renamed from: u5.nufgyqmvbu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2784iobyxmoadg {
            public /* synthetic */ C2784iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            private C2784iobyxmoadg() {
            }
        }

        public iobyxmoadg(int i13) {
            this.f112691iobyxmoadg = i13;
        }

        private final void iobyxmoadg(String str) {
            if (kcexrzcfyt.istkbnxepw(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i13 = 0;
            boolean z13 = false;
            while (i13 <= length) {
                boolean z14 = zdlpuopuiu.draadjrbmk(str.charAt(!z13 ? i13 : length), 32) <= 0;
                if (z13) {
                    if (!z14) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z14) {
                    i13++;
                } else {
                    z13 = true;
                }
            }
            if (str.subSequence(i13, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                u5.zoijcleaow.ppxfxbqfkf(new File(str));
            } catch (Exception e13) {
                Log.w("SupportSQLite", "delete failed: ", e13);
            }
        }

        public abstract void eablkybsjg(lqeggnwhkg lqeggnwhkgVar, int i13, int i14);

        public void gxszxtbevo(lqeggnwhkg db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
        }

        public abstract void lqeggnwhkg(lqeggnwhkg lqeggnwhkgVar, int i13, int i14);

        public void ppxfxbqfkf(lqeggnwhkg db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db3 + ".path");
            if (!db3.isOpen()) {
                String strGxszxtbevo = db3.gxszxtbevo();
                if (strGxszxtbevo != null) {
                    iobyxmoadg(strGxszxtbevo);
                    return;
                }
                return;
            }
            List listYadqdtsiqt = null;
            try {
                try {
                    listYadqdtsiqt = db3.yadqdtsiqt();
                } catch (SQLiteException unused) {
                }
                try {
                    db3.close();
                } catch (IOException unused2) {
                }
                if (listYadqdtsiqt != null) {
                    return;
                }
            } finally {
                if (listYadqdtsiqt != null) {
                    Iterator it = listYadqdtsiqt.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        zdlpuopuiu.dxjokdxxww(obj, "p.second");
                        iobyxmoadg((String) obj);
                    }
                } else {
                    String strGxszxtbevo2 = db3.gxszxtbevo();
                    if (strGxszxtbevo2 != null) {
                        iobyxmoadg(strGxszxtbevo2);
                    }
                }
            }
        }

        public abstract void wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar);

        public void zoijcleaow(lqeggnwhkg db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
        }
    }

    public interface ppxfxbqfkf {
        nufgyqmvbu iobyxmoadg(zoijcleaow zoijcleaowVar);
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public static final C2785zoijcleaow f112692gxszxtbevo = new C2785zoijcleaow(null);

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final boolean f112693eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final Context f112694iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final iobyxmoadg f112695ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final boolean f112696wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final String f112697zoijcleaow;

        public static class iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private boolean f112698eablkybsjg;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final Context f112699iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private iobyxmoadg f112700ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private boolean f112701wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private String f112702zoijcleaow;

            public iobyxmoadg(Context context) {
                zdlpuopuiu.btonecajqb(context, "context");
                this.f112699iobyxmoadg = context;
            }

            public iobyxmoadg eablkybsjg(boolean z13) {
                this.f112701wkgbmnqykc = z13;
                return this;
            }

            public iobyxmoadg iobyxmoadg(boolean z13) {
                this.f112698eablkybsjg = z13;
                return this;
            }

            public iobyxmoadg ppxfxbqfkf(iobyxmoadg callback) {
                zdlpuopuiu.btonecajqb(callback, "callback");
                this.f112700ppxfxbqfkf = callback;
                return this;
            }

            public iobyxmoadg wkgbmnqykc(String str) {
                this.f112702zoijcleaow = str;
                return this;
            }

            public zoijcleaow zoijcleaow() {
                String str;
                iobyxmoadg iobyxmoadgVar = this.f112700ppxfxbqfkf;
                if (iobyxmoadgVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f112701wkgbmnqykc && ((str = this.f112702zoijcleaow) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new zoijcleaow(this.f112699iobyxmoadg, this.f112702zoijcleaow, iobyxmoadgVar, this.f112701wkgbmnqykc, this.f112698eablkybsjg);
            }
        }

        /* JADX INFO: renamed from: u5.nufgyqmvbu$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C2785zoijcleaow {
            public /* synthetic */ C2785zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final iobyxmoadg iobyxmoadg(Context context) {
                zdlpuopuiu.btonecajqb(context, "context");
                return new iobyxmoadg(context);
            }

            private C2785zoijcleaow() {
            }
        }

        public zoijcleaow(Context context, String str, iobyxmoadg callback, boolean z13, boolean z14) {
            zdlpuopuiu.btonecajqb(context, "context");
            zdlpuopuiu.btonecajqb(callback, "callback");
            this.f112694iobyxmoadg = context;
            this.f112697zoijcleaow = str;
            this.f112695ppxfxbqfkf = callback;
            this.f112696wkgbmnqykc = z13;
            this.f112693eablkybsjg = z14;
        }

        public static final iobyxmoadg iobyxmoadg(Context context) {
            return f112692gxszxtbevo.iobyxmoadg(context);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    lqeggnwhkg getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z13);
}
