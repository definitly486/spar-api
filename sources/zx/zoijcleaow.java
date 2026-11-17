package zx;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Base64;
import gg.wwaezpbzkn;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.core.error_handler.exceptions.FileSizeException;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements h00.iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f131459zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f131460iobyxmoadg;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public zoijcleaow(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.f131460iobyxmoadg = context;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    private final String lqeggnwhkg(Uri uri) {
        int columnIndex;
        String string;
        String path = null;
        if (zdlpuopuiu.eablkybsjg(uri.getScheme(), "content")) {
            Cursor cursorQuery = this.f131460iobyxmoadg.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_display_name")) < 0) {
                        string = null;
                    } else {
                        string = cursorQuery.getString(columnIndex);
                    }
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    rg.zoijcleaow.iobyxmoadg(cursorQuery, null);
                    path = string;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        rg.zoijcleaow.iobyxmoadg(cursorQuery, th2);
                        throw th3;
                    }
                }
            } else {
                string = null;
                wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                rg.zoijcleaow.iobyxmoadg(cursorQuery, null);
                path = string;
            }
        }
        if (path == null) {
            path = uri.getPath();
            zdlpuopuiu.lqeggnwhkg(path);
            int iOpjhrmiecq = kcexrzcfyt.opjhrmiecq(path, '/', 0, false, 6, null);
            if (iOpjhrmiecq != -1) {
                path = path.substring(iOpjhrmiecq + 1);
                zdlpuopuiu.dxjokdxxww(path, "substring(...)");
            }
        }
        String str = path;
        zdlpuopuiu.lqeggnwhkg(str);
        String strHcddaimhww = kcexrzcfyt.hcddaimhww(str, " ", "_", false, 4, null);
        return strHcddaimhww == null ? "" : strHcddaimhww;
    }

    private final Uri nufgyqmvbu(String str) throws IOException {
        Uri uri = Uri.parse(str);
        zdlpuopuiu.lqeggnwhkg(uri);
        if (zdlpuopuiu.eablkybsjg(uri.getScheme(), "content")) {
            return uri;
        }
        throw new IOException("File exception :{Should use content only scheme}");
    }

    public File eablkybsjg() {
        File file = new File(this.f131460iobyxmoadg.getFilesDir(), "chat_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public File gxszxtbevo(String fileName) {
        zdlpuopuiu.btonecajqb(fileName, "fileName");
        return new File(eablkybsjg(), fileName);
    }

    @Override // h00.iobyxmoadg
    public File iobyxmoadg() {
        return gxszxtbevo("stub_image.jpeg");
    }

    @Override // h00.iobyxmoadg
    public String ppxfxbqfkf(String uriString, int i13) throws IOException {
        zdlpuopuiu.btonecajqb(uriString, "uriString");
        InputStream inputStreamOpenInputStream = this.f131460iobyxmoadg.getContentResolver().openInputStream(nufgyqmvbu(uriString));
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        try {
            if (inputStreamOpenInputStream.available() / 1000000 > i13) {
                throw new FileSizeException("");
            }
            String strEncodeToString = Base64.encodeToString(rg.iobyxmoadg.ppxfxbqfkf(inputStreamOpenInputStream), 0);
            rg.zoijcleaow.iobyxmoadg(inputStreamOpenInputStream, null);
            return strEncodeToString;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rg.zoijcleaow.iobyxmoadg(inputStreamOpenInputStream, th2);
                throw th3;
            }
        }
    }

    @Override // h00.iobyxmoadg
    public String wkgbmnqykc(String uriString) {
        zdlpuopuiu.btonecajqb(uriString, "uriString");
        return lqeggnwhkg(nufgyqmvbu(uriString));
    }

    @Override // h00.iobyxmoadg
    public Integer zoijcleaow(String uriString) throws IOException {
        zdlpuopuiu.btonecajqb(uriString, "uriString");
        InputStream inputStreamOpenInputStream = this.f131460iobyxmoadg.getContentResolver().openInputStream(nufgyqmvbu(uriString));
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        try {
            Integer numValueOf = Integer.valueOf(inputStreamOpenInputStream.available() / 1000000);
            rg.zoijcleaow.iobyxmoadg(inputStreamOpenInputStream, null);
            return numValueOf;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rg.zoijcleaow.iobyxmoadg(inputStreamOpenInputStream, th2);
                throw th3;
            }
        }
    }
}
