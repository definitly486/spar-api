package s8;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.btonecajqb;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import r8.agtfadlqog;
import r8.ojitshcjhn;
import r8.oxmwwwfdhm;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc implements agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f105678iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final agtfadlqog f105679ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Class f105680wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final agtfadlqog f105681zoijcleaow;

    private static abstract class iobyxmoadg implements ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f105682iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Class f105683zoijcleaow;

        iobyxmoadg(Context context, Class cls) {
            this.f105682iobyxmoadg = context;
            this.f105683zoijcleaow = cls;
        }

        @Override // r8.ojitshcjhn
        public final void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public final agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new wkgbmnqykc(this.f105682iobyxmoadg, oxmwwwfdhmVar.wkgbmnqykc(File.class, this.f105683zoijcleaow), oxmwwwfdhmVar.wkgbmnqykc(Uri.class, this.f105683zoijcleaow), this.f105683zoijcleaow);
        }
    }

    public static final class ppxfxbqfkf extends iobyxmoadg {
        public ppxfxbqfkf(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: s8.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    private static final class C2575wkgbmnqykc implements com.bumptech.glide.load.data.wkgbmnqykc {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private static final String[] f105684cdpycssgdh = {"_data"};

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final int f105685cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final int f105686esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.wkgbmnqykc f105687istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final Uri f105688iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final agtfadlqog f105689jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private final l8.lqeggnwhkg f105690lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private final Class f105691pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final agtfadlqog f105692yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Context f105693zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private volatile boolean f105694zynmafqrjb;

        C2575wkgbmnqykc(Context context, agtfadlqog agtfadlqogVar, agtfadlqog agtfadlqogVar2, Uri uri, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar, Class cls) {
            this.f105693zdlpuopuiu = context.getApplicationContext();
            this.f105692yggfygwlhe = agtfadlqogVar;
            this.f105689jyumaefscl = agtfadlqogVar2;
            this.f105688iwizpuwonk = uri;
            this.f105685cqumvgiudr = i13;
            this.f105686esjtqupxsv = i14;
            this.f105690lereixgezr = lqeggnwhkgVar;
            this.f105691pmvmpeiblj = cls;
        }

        private com.bumptech.glide.load.data.wkgbmnqykc gxszxtbevo() {
            agtfadlqog.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf();
            if (iobyxmoadgVarPpxfxbqfkf != null) {
                return iobyxmoadgVarPpxfxbqfkf.f82021ppxfxbqfkf;
            }
            return null;
        }

        private boolean lqeggnwhkg() {
            return this.f105693zdlpuopuiu.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File nufgyqmvbu(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f105693zdlpuopuiu.getContentResolver().query(uri, f105684cdpycssgdh, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th2;
            }
        }

        private agtfadlqog.iobyxmoadg ppxfxbqfkf() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f105692yggfygwlhe.zoijcleaow(nufgyqmvbu(this.f105688iwizpuwonk), this.f105685cqumvgiudr, this.f105686esjtqupxsv, this.f105690lereixgezr);
            }
            if (m8.zoijcleaow.iobyxmoadg(this.f105688iwizpuwonk)) {
                return this.f105689jyumaefscl.zoijcleaow(this.f105688iwizpuwonk, this.f105685cqumvgiudr, this.f105686esjtqupxsv, this.f105690lereixgezr);
            }
            return this.f105689jyumaefscl.zoijcleaow(lqeggnwhkg() ? MediaStore.setRequireOriginal(this.f105688iwizpuwonk) : this.f105688iwizpuwonk, this.f105685cqumvgiudr, this.f105686esjtqupxsv, this.f105690lereixgezr);
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void cancel() {
            this.f105694zynmafqrjb = true;
            com.bumptech.glide.load.data.wkgbmnqykc wkgbmnqykcVar = this.f105687istkbnxepw;
            if (wkgbmnqykcVar != null) {
                wkgbmnqykcVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void eablkybsjg(btonecajqb btonecajqbVar, com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
            try {
                com.bumptech.glide.load.data.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = gxszxtbevo();
                if (wkgbmnqykcVarGxszxtbevo == null) {
                    iobyxmoadgVar.ppxfxbqfkf(new IllegalArgumentException("Failed to build fetcher for: " + this.f105688iwizpuwonk));
                    return;
                }
                this.f105687istkbnxepw = wkgbmnqykcVarGxszxtbevo;
                if (this.f105694zynmafqrjb) {
                    cancel();
                } else {
                    wkgbmnqykcVarGxszxtbevo.eablkybsjg(btonecajqbVar, iobyxmoadgVar);
                }
            } catch (FileNotFoundException e13) {
                iobyxmoadgVar.ppxfxbqfkf(e13);
            }
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public Class iobyxmoadg() {
            return this.f105691pmvmpeiblj;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public l8.iobyxmoadg wkgbmnqykc() {
            return l8.iobyxmoadg.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void zoijcleaow() {
            com.bumptech.glide.load.data.wkgbmnqykc wkgbmnqykcVar = this.f105687istkbnxepw;
            if (wkgbmnqykcVar != null) {
                wkgbmnqykcVar.zoijcleaow();
            }
        }
    }

    public static final class zoijcleaow extends iobyxmoadg {
        public zoijcleaow(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    wkgbmnqykc(Context context, agtfadlqog agtfadlqogVar, agtfadlqog agtfadlqogVar2, Class cls) {
        this.f105678iobyxmoadg = context.getApplicationContext();
        this.f105681zoijcleaow = agtfadlqogVar;
        this.f105679ppxfxbqfkf = agtfadlqogVar2;
        this.f105680wkgbmnqykc = cls;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(Uri uri, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return new agtfadlqog.iobyxmoadg(new f9.wkgbmnqykc(uri), new C2575wkgbmnqykc(this.f105678iobyxmoadg, this.f105681zoijcleaow, this.f105679ppxfxbqfkf, uri, i13, i14, lqeggnwhkgVar, this.f105680wkgbmnqykc));
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && m8.zoijcleaow.ppxfxbqfkf(uri);
    }
}
