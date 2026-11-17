package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final String[] f8485cqumvgiudr = {"_display_name", "_size"};

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final File f8486esjtqupxsv = new File(CardDateFormatTextWatcher.DIVIDER_CHARACTER);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final HashMap f8487lereixgezr = new HashMap();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f8488iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private zoijcleaow f8489jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private String f8490yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f8491zdlpuopuiu;

    static class iobyxmoadg {
        static File[] iobyxmoadg(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    static class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f8492iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HashMap f8493zoijcleaow = new HashMap();

        ppxfxbqfkf(String str) {
            this.f8492iobyxmoadg = str;
        }

        private boolean wkgbmnqykc(String str, String str2) {
            String strGtknphoqwx = FileProvider.gtknphoqwx(str);
            String strGtknphoqwx2 = FileProvider.gtknphoqwx(str2);
            if (!strGtknphoqwx.equals(strGtknphoqwx2)) {
                if (!strGtknphoqwx.startsWith(strGtknphoqwx2 + '/')) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.content.FileProvider.zoijcleaow
        public Uri iobyxmoadg(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f8493zoijcleaow.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (wkgbmnqykc(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = ((File) entry.getValue()).getPath();
                return new Uri.Builder().scheme("content").authority(this.f8492iobyxmoadg).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith(CardDateFormatTextWatcher.DIVIDER_CHARACTER) ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), CardDateFormatTextWatcher.DIVIDER_CHARACTER)).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        void ppxfxbqfkf(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f8493zoijcleaow.put(str, file.getCanonicalFile());
            } catch (IOException e13) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e13);
            }
        }

        @Override // androidx.core.content.FileProvider.zoijcleaow
        public File zoijcleaow(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = (File) this.f8493zoijcleaow.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (wkgbmnqykc(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }
    }

    interface zoijcleaow {
        Uri iobyxmoadg(File file);

        File zoijcleaow(Uri uri);
    }

    public FileProvider() {
        this(0);
    }

    private static zoijcleaow btonecajqb(Context context, String str, int i13) throws XmlPullParserException, IOException {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(str);
        XmlResourceParser xmlResourceParserEablkybsjg = eablkybsjg(context, str, context.getPackageManager().resolveContentProvider(str, UserVerificationMethods.USER_VERIFY_PATTERN), i13);
        while (true) {
            int next = xmlResourceParserEablkybsjg.next();
            if (next == 1) {
                return ppxfxbqfkfVar;
            }
            if (next == 2) {
                String name = xmlResourceParserEablkybsjg.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserEablkybsjg.getAttributeValue(null, ExternalMetricsManagerImpl.NAME);
                String attributeValue2 = xmlResourceParserEablkybsjg.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f8486esjtqupxsv;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = androidx.core.content.iobyxmoadg.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = androidx.core.content.iobyxmoadg.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] fileArrIobyxmoadg = iobyxmoadg.iobyxmoadg(context);
                    if (fileArrIobyxmoadg.length > 0) {
                        externalStorageDirectory = fileArrIobyxmoadg[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    ppxfxbqfkfVar.ppxfxbqfkf(attributeValue, zoijcleaow(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    private static int dxjokdxxww(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    static XmlResourceParser eablkybsjg(Context context, String str, ProviderInfo providerInfo, int i13) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i13 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i13);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String gtknphoqwx(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    private zoijcleaow gxszxtbevo() {
        zoijcleaow zoijcleaowVar;
        synchronized (this.f8491zdlpuopuiu) {
            try {
                u1.zoijcleaow.wkgbmnqykc(this.f8490yggfygwlhe, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.f8489jyumaefscl == null) {
                    this.f8489jyumaefscl = lqeggnwhkg(getContext(), this.f8490yggfygwlhe, this.f8488iwizpuwonk);
                }
                zoijcleaowVar = this.f8489jyumaefscl;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zoijcleaowVar;
    }

    private static zoijcleaow lqeggnwhkg(Context context, String str, int i13) {
        zoijcleaow zoijcleaowVarBtonecajqb;
        HashMap map = f8487lereixgezr;
        synchronized (map) {
            try {
                zoijcleaowVarBtonecajqb = (zoijcleaow) map.get(str);
                if (zoijcleaowVarBtonecajqb == null) {
                    try {
                        try {
                            zoijcleaowVarBtonecajqb = btonecajqb(context, str, i13);
                            map.put(str, zoijcleaowVarBtonecajqb);
                        } catch (IOException e13) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e13);
                        }
                    } catch (XmlPullParserException e14) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e14);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zoijcleaowVarBtonecajqb;
    }

    public static Uri nufgyqmvbu(Context context, String str, File file) {
        return lqeggnwhkg(context, str, 0).iobyxmoadg(file);
    }

    private static Object[] ppxfxbqfkf(Object[] objArr, int i13) {
        Object[] objArr2 = new Object[i13];
        System.arraycopy(objArr, 0, objArr2, 0, i13);
        return objArr2;
    }

    private static String[] wkgbmnqykc(String[] strArr, int i13) {
        String[] strArr2 = new String[i13];
        System.arraycopy(strArr, 0, strArr2, 0, i13);
        return strArr2;
    }

    private static File zoijcleaow(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.f8491zdlpuopuiu) {
            this.f8490yggfygwlhe = str;
        }
        HashMap map = f8487lereixgezr;
        synchronized (map) {
            map.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return gxszxtbevo().zoijcleaow(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File fileZoijcleaow = gxszxtbevo().zoijcleaow(uri);
        int iLastIndexOf = fileZoijcleaow.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileZoijcleaow.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(gxszxtbevo().zoijcleaow(uri), dxjokdxxww(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i13;
        File fileZoijcleaow = gxszxtbevo().zoijcleaow(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f8485cqumvgiudr;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i14 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i14] = "_display_name";
                i13 = i14 + 1;
                objArr[i14] = queryParameter == null ? fileZoijcleaow.getName() : queryParameter;
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i14] = "_size";
                    i13 = i14 + 1;
                    objArr[i14] = Long.valueOf(fileZoijcleaow.length());
                }
            }
            i14 = i13;
        }
        String[] strArrWkgbmnqykc = wkgbmnqykc(strArr3, i14);
        Object[] objArrPpxfxbqfkf = ppxfxbqfkf(objArr, i14);
        MatrixCursor matrixCursor = new MatrixCursor(strArrWkgbmnqykc, 1);
        matrixCursor.addRow(objArrPpxfxbqfkf);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    protected FileProvider(int i13) {
        this.f8491zdlpuopuiu = new Object();
        this.f8488iwizpuwonk = i13;
    }
}
