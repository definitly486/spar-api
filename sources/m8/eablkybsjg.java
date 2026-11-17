package m8;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class eablkybsjg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final iobyxmoadg f66465gxszxtbevo = new iobyxmoadg();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f66466eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f66467iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final o8.zoijcleaow f66468ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ContentResolver f66469wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f66470zoijcleaow;

    eablkybsjg(List list, wkgbmnqykc wkgbmnqykcVar, o8.zoijcleaow zoijcleaowVar, ContentResolver contentResolver) {
        this(list, f66465gxszxtbevo, wkgbmnqykcVar, zoijcleaowVar, contentResolver);
    }

    private boolean ppxfxbqfkf(File file) {
        return this.f66467iobyxmoadg.iobyxmoadg(file) && 0 < this.f66467iobyxmoadg.ppxfxbqfkf(file);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:11:0x001b */
    private String zoijcleaow(Uri uri) throws Throwable {
        Cursor cursorIobyxmoadg;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                cursorIobyxmoadg = this.f66470zoijcleaow.iobyxmoadg(uri);
                if (cursorIobyxmoadg != null) {
                    try {
                        if (cursorIobyxmoadg.moveToFirst()) {
                            String string = cursorIobyxmoadg.getString(0);
                            cursorIobyxmoadg.close();
                            return string;
                        }
                    } catch (SecurityException e13) {
                        e = e13;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorIobyxmoadg != null) {
                            cursorIobyxmoadg.close();
                        }
                        return null;
                    }
                }
                if (cursorIobyxmoadg != null) {
                    cursorIobyxmoadg.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SecurityException e14) {
            e = e14;
            cursorIobyxmoadg = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    int iobyxmoadg(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f66469wkgbmnqykc.openInputStream(uri);
                return com.bumptech.glide.load.iobyxmoadg.zoijcleaow(this.f66466eablkybsjg, inputStreamOpenInputStream, this.f66468ppxfxbqfkf);
            } finally {
                if (0 != 0) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (IOException | NullPointerException e13) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e13);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                inputStreamOpenInputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        }
    }

    public InputStream wkgbmnqykc(Uri uri) throws Throwable {
        String strZoijcleaow = zoijcleaow(uri);
        if (TextUtils.isEmpty(strZoijcleaow)) {
            return null;
        }
        File fileZoijcleaow = this.f66467iobyxmoadg.zoijcleaow(strZoijcleaow);
        if (!ppxfxbqfkf(fileZoijcleaow)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileZoijcleaow);
        try {
            return this.f66469wkgbmnqykc.openInputStream(uriFromFile);
        } catch (NullPointerException e13) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e13));
        }
    }

    eablkybsjg(List list, iobyxmoadg iobyxmoadgVar, wkgbmnqykc wkgbmnqykcVar, o8.zoijcleaow zoijcleaowVar, ContentResolver contentResolver) {
        this.f66467iobyxmoadg = iobyxmoadgVar;
        this.f66470zoijcleaow = wkgbmnqykcVar;
        this.f66468ppxfxbqfkf = zoijcleaowVar;
        this.f66469wkgbmnqykc = contentResolver;
        this.f66466eablkybsjg = list;
    }
}
