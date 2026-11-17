package r8;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk implements agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f82028iobyxmoadg;

    public static final class iobyxmoadg implements ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f82029iobyxmoadg;

        public iobyxmoadg(Context context) {
            this.f82029iobyxmoadg = context;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new draadjrbmk(this.f82029iobyxmoadg);
        }
    }

    private static class zoijcleaow implements com.bumptech.glide.load.data.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private static final String[] f82030jyumaefscl = {"_data"};

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Uri f82031yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Context f82032zdlpuopuiu;

        zoijcleaow(Context context, Uri uri) {
            this.f82032zdlpuopuiu = context;
            this.f82031yggfygwlhe = uri;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void eablkybsjg(com.bumptech.glide.btonecajqb btonecajqbVar, com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
            Cursor cursorQuery = this.f82032zdlpuopuiu.getContentResolver().query(this.f82031yggfygwlhe, f82030jyumaefscl, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                iobyxmoadgVar.gxszxtbevo(new File(string));
                return;
            }
            iobyxmoadgVar.ppxfxbqfkf(new FileNotFoundException("Failed to find file path for: " + this.f82031yggfygwlhe));
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public Class iobyxmoadg() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public l8.iobyxmoadg wkgbmnqykc() {
            return l8.iobyxmoadg.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void zoijcleaow() {
        }
    }

    public draadjrbmk(Context context) {
        this.f82028iobyxmoadg = context;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(Uri uri, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return new agtfadlqog.iobyxmoadg(new f9.wkgbmnqykc(uri), new zoijcleaow(this.f82028iobyxmoadg, uri));
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(Uri uri) {
        return m8.zoijcleaow.ppxfxbqfkf(uri);
    }
}
