package r1;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.pmvmpeiblj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;

/* JADX INFO: loaded from: classes.dex */
abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final pmvmpeiblj f81460iobyxmoadg = new pmvmpeiblj(2);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Comparator f81461zoijcleaow = new Comparator() { // from class: r1.ppxfxbqfkf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return wkgbmnqykc.lqeggnwhkg((byte[]) obj, (byte[]) obj2);
        }
    };

    private interface iobyxmoadg {
        static iobyxmoadg iobyxmoadg(Context context, Uri uri) {
            return new zoijcleaow(context, uri);
        }

        void close();

        Cursor zoijcleaow(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);
    }

    private static class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        String f81462iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        List f81463ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        String f81464zoijcleaow;

        ppxfxbqfkf(String str, String str2, List list) {
            this.f81462iobyxmoadg = str;
            this.f81464zoijcleaow = str2;
            this.f81463ppxfxbqfkf = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return Objects.equals(this.f81462iobyxmoadg, ppxfxbqfkfVar.f81462iobyxmoadg) && Objects.equals(this.f81464zoijcleaow, ppxfxbqfkfVar.f81464zoijcleaow) && Objects.equals(this.f81463ppxfxbqfkf, ppxfxbqfkfVar.f81463ppxfxbqfkf);
        }

        public int hashCode() {
            return Objects.hash(this.f81462iobyxmoadg, this.f81464zoijcleaow, this.f81463ppxfxbqfkf);
        }
    }

    private static class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ContentProviderClient f81465iobyxmoadg;

        zoijcleaow(Context context, Uri uri) {
            this.f81465iobyxmoadg = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // r1.wkgbmnqykc.iobyxmoadg
        public void close() {
            ContentProviderClient contentProviderClient = this.f81465iobyxmoadg;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }

        @Override // r1.wkgbmnqykc.iobyxmoadg
        public Cursor zoijcleaow(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f81465iobyxmoadg;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e13) {
                Log.w("FontsProvider", "Unable to query the content provider", e13);
                return null;
            }
        }
    }

    static gtknphoqwx.iobyxmoadg eablkybsjg(Context context, List list, CancellationSignal cancellationSignal) {
        y5.iobyxmoadg.ppxfxbqfkf("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < list.size(); i13++) {
                eablkybsjg eablkybsjgVar = (eablkybsjg) list.get(i13);
                ProviderInfo providerInfoGxszxtbevo = gxszxtbevo(context.getPackageManager(), eablkybsjgVar, context.getResources());
                if (providerInfoGxszxtbevo == null) {
                    return gtknphoqwx.iobyxmoadg.zoijcleaow(1, null);
                }
                arrayList.add(nufgyqmvbu(context, eablkybsjgVar, providerInfoGxszxtbevo.authority, cancellationSignal));
            }
            return gtknphoqwx.iobyxmoadg.iobyxmoadg(0, arrayList);
        } finally {
            y5.iobyxmoadg.gxszxtbevo();
        }
    }

    static ProviderInfo gxszxtbevo(PackageManager packageManager, eablkybsjg eablkybsjgVar, Resources resources) {
        y5.iobyxmoadg.ppxfxbqfkf("FontProvider.getProvider");
        try {
            List listWkgbmnqykc = wkgbmnqykc(eablkybsjgVar, resources);
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(eablkybsjgVar.eablkybsjg(), eablkybsjgVar.gxszxtbevo(), listWkgbmnqykc);
            ProviderInfo providerInfo = (ProviderInfo) f81460iobyxmoadg.get(ppxfxbqfkfVar);
            if (providerInfo != null) {
                y5.iobyxmoadg.gxszxtbevo();
                return providerInfo;
            }
            String strEablkybsjg = eablkybsjgVar.eablkybsjg();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strEablkybsjg, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strEablkybsjg);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(eablkybsjgVar.gxszxtbevo())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strEablkybsjg + ", but package was not " + eablkybsjgVar.gxszxtbevo());
            }
            List listZoijcleaow = zoijcleaow(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listZoijcleaow, f81461zoijcleaow);
            for (int i13 = 0; i13 < listWkgbmnqykc.size(); i13++) {
                ArrayList arrayList = new ArrayList((Collection) listWkgbmnqykc.get(i13));
                Collections.sort(arrayList, f81461zoijcleaow);
                if (ppxfxbqfkf(listZoijcleaow, arrayList)) {
                    f81460iobyxmoadg.put(ppxfxbqfkfVar, providerInfoResolveContentProvider);
                    y5.iobyxmoadg.gxszxtbevo();
                    return providerInfoResolveContentProvider;
                }
            }
            y5.iobyxmoadg.gxszxtbevo();
            return null;
        } catch (Throwable th2) {
            y5.iobyxmoadg.gxszxtbevo();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lqeggnwhkg(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i13 = 0; i13 < bArr.length; i13++) {
            byte b13 = bArr[i13];
            byte b14 = bArr2[i13];
            if (b13 != b14) {
                return b13 - b14;
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    static gtknphoqwx.zoijcleaow[] nufgyqmvbu(Context context, eablkybsjg eablkybsjgVar, String str, CancellationSignal cancellationSignal) {
        boolean z13;
        y5.iobyxmoadg.ppxfxbqfkf("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg.iobyxmoadg(context, uriBuild);
            Cursor cursorZoijcleaow = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                y5.iobyxmoadg.ppxfxbqfkf("ContentQueryWrapper.query");
                try {
                    cursorZoijcleaow = iobyxmoadgVarIobyxmoadg.zoijcleaow(uriBuild, strArr, "query = ?", new String[]{eablkybsjgVar.lqeggnwhkg()}, null, cancellationSignal);
                    y5.iobyxmoadg.gxszxtbevo();
                    if (cursorZoijcleaow != null && cursorZoijcleaow.getCount() > 0) {
                        int columnIndex = cursorZoijcleaow.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorZoijcleaow.getColumnIndex("_id");
                        int columnIndex3 = cursorZoijcleaow.getColumnIndex("file_id");
                        int columnIndex4 = cursorZoijcleaow.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorZoijcleaow.getColumnIndex("font_weight");
                        int columnIndex6 = cursorZoijcleaow.getColumnIndex("font_italic");
                        while (cursorZoijcleaow.moveToNext()) {
                            int i13 = columnIndex != -1 ? cursorZoijcleaow.getInt(columnIndex) : 0;
                            int i14 = columnIndex4 != -1 ? cursorZoijcleaow.getInt(columnIndex4) : 0;
                            Uri uriWithAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorZoijcleaow.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorZoijcleaow.getLong(columnIndex3));
                            int i15 = columnIndex5 != -1 ? cursorZoijcleaow.getInt(columnIndex5) : OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST;
                            if (columnIndex6 != -1) {
                                z13 = true;
                                if (cursorZoijcleaow.getInt(columnIndex6) != 1) {
                                    z13 = false;
                                }
                            } else {
                                z13 = false;
                            }
                            gtknphoqwx.zoijcleaow zoijcleaowVarIobyxmoadg = gtknphoqwx.zoijcleaow.iobyxmoadg(uriWithAppendedId, i14, i15, z13, i13);
                            arrayList2 = arrayList2;
                            arrayList2.add(zoijcleaowVarIobyxmoadg);
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorZoijcleaow != null) {
                        cursorZoijcleaow.close();
                    }
                    iobyxmoadgVarIobyxmoadg.close();
                    return (gtknphoqwx.zoijcleaow[]) arrayList.toArray(new gtknphoqwx.zoijcleaow[0]);
                } finally {
                    y5.iobyxmoadg.gxszxtbevo();
                }
            } catch (Throwable th2) {
                if (cursorZoijcleaow != null) {
                    cursorZoijcleaow.close();
                }
                iobyxmoadgVarIobyxmoadg.close();
                throw th2;
            }
        } catch (Throwable th3) {
            y5.iobyxmoadg.gxszxtbevo();
            throw th3;
        }
    }

    private static boolean ppxfxbqfkf(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (!Arrays.equals((byte[]) list.get(i13), (byte[]) list2.get(i13))) {
                return false;
            }
        }
        return true;
    }

    private static List wkgbmnqykc(eablkybsjg eablkybsjgVar, Resources resources) {
        return eablkybsjgVar.zoijcleaow() != null ? eablkybsjgVar.zoijcleaow() : i1.eablkybsjg.ppxfxbqfkf(resources, eablkybsjgVar.ppxfxbqfkf());
    }

    private static List zoijcleaow(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }
}
