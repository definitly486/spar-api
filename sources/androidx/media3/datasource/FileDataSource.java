package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import b3.lqeggnwhkg;
import b3.wflxmlrfwp;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class FileDataSource extends b3.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private RandomAccessFile f9861eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Uri f9862gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f9863lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f9864nufgyqmvbu;

    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(Throwable th2, int i13) {
            super(th2, i13);
        }

        public FileDataSourceException(String str, Throwable th2, int i13) {
            super(str, th2, i13);
        }
    }

    public static final class iobyxmoadg implements androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private wflxmlrfwp f9865iobyxmoadg;

        @Override // androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public FileDataSource iobyxmoadg() {
            FileDataSource fileDataSource = new FileDataSource();
            wflxmlrfwp wflxmlrfwpVar = this.f9865iobyxmoadg;
            if (wflxmlrfwpVar != null) {
                fileDataSource.eablkybsjg(wflxmlrfwpVar);
            }
            return fileDataSource;
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile zdlpuopuiu(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) y2.iobyxmoadg.eablkybsjg(uri.getPath()), "r");
        } catch (FileNotFoundException e13) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e13, ((e13.getCause() instanceof ErrnoException) && ((ErrnoException) e13.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e13, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        } catch (SecurityException e14) {
            throw new FileDataSourceException(e14, 2006);
        } catch (RuntimeException e15) {
            throw new FileDataSourceException(e15, 2000);
        }
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Uri agtfadlqog() {
        return this.f9862gxszxtbevo;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void close() {
        this.f9862gxszxtbevo = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f9861eablkybsjg;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f9861eablkybsjg = null;
                if (this.f9864nufgyqmvbu) {
                    this.f9864nufgyqmvbu = false;
                    vdvldrhtss();
                }
            } catch (IOException e13) {
                throw new FileDataSourceException(e13, 2000);
            }
        } catch (Throwable th2) {
            this.f9861eablkybsjg = null;
            if (this.f9864nufgyqmvbu) {
                this.f9864nufgyqmvbu = false;
                vdvldrhtss();
            }
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public long iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) throws FileDataSourceException {
        Uri uri = lqeggnwhkgVar.f15057iobyxmoadg;
        this.f9862gxszxtbevo = uri;
        oxmwwwfdhm(lqeggnwhkgVar);
        RandomAccessFile randomAccessFileZdlpuopuiu = zdlpuopuiu(uri);
        this.f9861eablkybsjg = randomAccessFileZdlpuopuiu;
        try {
            randomAccessFileZdlpuopuiu.seek(lqeggnwhkgVar.f15058lqeggnwhkg);
            long length = lqeggnwhkgVar.f15059nufgyqmvbu;
            if (length == -1) {
                length = this.f9861eablkybsjg.length() - lqeggnwhkgVar.f15058lqeggnwhkg;
            }
            this.f9863lqeggnwhkg = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.f9864nufgyqmvbu = true;
            kcexrzcfyt(lqeggnwhkgVar);
            return this.f9863lqeggnwhkg;
        } catch (IOException e13) {
            throw new FileDataSourceException(e13, 2000);
        }
    }

    @Override // v2.btonecajqb
    public int zoijcleaow(byte[] bArr, int i13, int i14) throws FileDataSourceException {
        if (i14 == 0) {
            return 0;
        }
        if (this.f9863lqeggnwhkg == 0) {
            return -1;
        }
        try {
            int i15 = ((RandomAccessFile) stevsuqkhv.nufgyqmvbu(this.f9861eablkybsjg)).read(bArr, i13, (int) Math.min(this.f9863lqeggnwhkg, i14));
            if (i15 > 0) {
                this.f9863lqeggnwhkg -= (long) i15;
                rgvfuqvkyq(i15);
            }
            return i15;
        } catch (IOException e13) {
            throw new FileDataSourceException(e13, 2000);
        }
    }
}
