package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import b3.lqeggnwhkg;
import com.google.android.gms.location.GeofenceStatusCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class RawResourceDataSource extends b3.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f9873btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f9874dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f9875eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private lqeggnwhkg f9876gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private AssetFileDescriptor f9877lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private InputStream f9878nufgyqmvbu;

    public static class RawResourceDataSourceException extends DataSourceException {
        public RawResourceDataSourceException(String str) {
            super(str, null, 2000);
        }

        public RawResourceDataSourceException(String str, Throwable th2, int i13) {
            super(str, th2, i13);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f9875eablkybsjg = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i13) {
        return Uri.parse("rawresource:///" + i13);
    }

    private static int yggfygwlhe(String str) throws RawResourceDataSourceException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        }
    }

    private static AssetFileDescriptor zdlpuopuiu(Context context, lqeggnwhkg lqeggnwhkgVar) throws RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = lqeggnwhkgVar.f15057iobyxmoadg.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = yggfygwlhe(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
            String strSubstring = (String) y2.iobyxmoadg.eablkybsjg(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith(CardDateFormatTextWatcher.DIVIDER_CHARACTER)) {
                strSubstring = strSubstring.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e13) {
                    throw new RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e13, 2005);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = yggfygwlhe(strSubstring);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + StringUtils.PROCESS_POSTFIX_DELIMITER + strSubstring, "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e14) {
            throw new RawResourceDataSourceException(null, e14, 2005);
        }
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Uri agtfadlqog() {
        lqeggnwhkg lqeggnwhkgVar = this.f9876gxszxtbevo;
        if (lqeggnwhkgVar != null) {
            return lqeggnwhkgVar.f15057iobyxmoadg;
        }
        return null;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // androidx.media3.datasource.iobyxmoadg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f9876gxszxtbevo = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.InputStream r3 = r5.f9878nufgyqmvbu     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.f9878nufgyqmvbu = r0
            android.content.res.AssetFileDescriptor r3 = r5.f9877lqeggnwhkg     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f9877lqeggnwhkg = r0
            boolean r0 = r5.f9873btonecajqb
            if (r0 == 0) goto L2b
            r5.f9873btonecajqb = r2
            r5.vdvldrhtss()
        L2b:
            return
        L2c:
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f9877lqeggnwhkg = r0
            boolean r0 = r5.f9873btonecajqb
            if (r0 == 0) goto L3d
            r5.f9873btonecajqb = r2
            r5.vdvldrhtss()
        L3d:
            throw r1
        L3e:
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f9878nufgyqmvbu = r0
            android.content.res.AssetFileDescriptor r4 = r5.f9877lqeggnwhkg     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f9877lqeggnwhkg = r0
            boolean r0 = r5.f9873btonecajqb
            if (r0 == 0) goto L5d
            r5.f9873btonecajqb = r2
            r5.vdvldrhtss()
        L5d:
            throw r3
        L5e:
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f9877lqeggnwhkg = r0
            boolean r0 = r5.f9873btonecajqb
            if (r0 == 0) goto L6f
            r5.f9873btonecajqb = r2
            r5.vdvldrhtss()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.RawResourceDataSource.close():void");
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public long iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) throws RawResourceDataSourceException {
        this.f9876gxszxtbevo = lqeggnwhkgVar;
        oxmwwwfdhm(lqeggnwhkgVar);
        AssetFileDescriptor assetFileDescriptorZdlpuopuiu = zdlpuopuiu(this.f9875eablkybsjg, lqeggnwhkgVar);
        this.f9877lqeggnwhkg = assetFileDescriptorZdlpuopuiu;
        long length = assetFileDescriptorZdlpuopuiu.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f9877lqeggnwhkg.getFileDescriptor());
        this.f9878nufgyqmvbu = fileInputStream;
        if (length != -1) {
            try {
                if (lqeggnwhkgVar.f15058lqeggnwhkg > length) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            } catch (RawResourceDataSourceException e13) {
                throw e13;
            } catch (IOException e14) {
                throw new RawResourceDataSourceException(null, e14, 2000);
            }
        }
        long startOffset = this.f9877lqeggnwhkg.getStartOffset();
        long jSkip = fileInputStream.skip(lqeggnwhkgVar.f15058lqeggnwhkg + startOffset) - startOffset;
        if (jSkip != lqeggnwhkgVar.f15058lqeggnwhkg) {
            throw new RawResourceDataSourceException(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f9874dxjokdxxww = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f9874dxjokdxxww = size;
                if (size < 0) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            }
        } else {
            long j13 = length - jSkip;
            this.f9874dxjokdxxww = j13;
            if (j13 < 0) {
                throw new DataSourceException(2008);
            }
        }
        long jMin = lqeggnwhkgVar.f15059nufgyqmvbu;
        if (jMin != -1) {
            long j14 = this.f9874dxjokdxxww;
            if (j14 != -1) {
                jMin = Math.min(j14, jMin);
            }
            this.f9874dxjokdxxww = jMin;
        }
        this.f9873btonecajqb = true;
        kcexrzcfyt(lqeggnwhkgVar);
        long j15 = lqeggnwhkgVar.f15059nufgyqmvbu;
        return j15 != -1 ? j15 : this.f9874dxjokdxxww;
    }

    @Override // v2.btonecajqb
    public int zoijcleaow(byte[] bArr, int i13, int i14) throws RawResourceDataSourceException {
        if (i14 == 0) {
            return 0;
        }
        long j13 = this.f9874dxjokdxxww;
        if (j13 == 0) {
            return -1;
        }
        if (j13 != -1) {
            try {
                i14 = (int) Math.min(j13, i14);
            } catch (IOException e13) {
                throw new RawResourceDataSourceException(null, e13, 2000);
            }
        }
        int i15 = ((InputStream) stevsuqkhv.nufgyqmvbu(this.f9878nufgyqmvbu)).read(bArr, i13, i14);
        if (i15 == -1) {
            if (this.f9874dxjokdxxww == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j14 = this.f9874dxjokdxxww;
        if (j14 != -1) {
            this.f9874dxjokdxxww = j14 - ((long) i15);
        }
        rgvfuqvkyq(i15);
        return i15;
    }
}
